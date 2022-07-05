package com.example.randomlygiven

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var dice: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDice: Button = findViewById(R.id.buttonRandomly);
        dice = findViewById(R.id.imageViewDice);

        btnDice.setOnClickListener {   view ->
            val randomInt = Random().nextInt(6) + 1;
            generateRandomlyDice(randomInt);
            Toast.makeText(this, "I got a: $randomInt", Toast.LENGTH_SHORT).show();
        }
    }

    private fun generateRandomlyDice(value: Int) {
        // val randomInt = Random().nextInt(6) + 1;

        val imageToLoad = when(value) {
            1 -> R.drawable.dado_1
            2 -> R.drawable.dado_2
            3 -> R.drawable.dado_3
            4 -> R.drawable.dado_4
            5 -> R.drawable.dado_5
            6 -> R.drawable.dado_6
            else -> R.drawable.dado_6
        }

        dice.setImageResource(imageToLoad);
    }
}