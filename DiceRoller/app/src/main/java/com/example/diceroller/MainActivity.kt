package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val diceImage1: ImageView = findViewById(R.id.diceImage1)
        val diceImage2: ImageView = findViewById(R.id.diceImage2)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener {
            diceImage1.setImageResource(rollDice())
            diceImage2.setImageResource(rollDice())
        }
    }
    private fun rollDice(): Int {
        //Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show()
        val randomInt = (1..6).random()
        return when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        //diceImage1.setImageResource(drawableResource)
    }
}