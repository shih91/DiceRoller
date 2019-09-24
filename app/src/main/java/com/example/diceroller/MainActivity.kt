package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var diceImage: ImageView
    private var currentDraw: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{rollDice()}
        val countButton: Button = findViewById(R.id.count_button)
        countButton.setOnClickListener{countUp()}
        diceImage = findViewById(R.id.dice_image)
    }
    private fun rollDice(){
        currentDraw = Random().nextInt(6) + 1
        val drawableResource = when(currentDraw){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
    }

    private fun countUp() {
        val drawableResource = when (currentDraw) {
            0 -> R.drawable.dice_1
            1 -> R.drawable.dice_2
            2 -> R.drawable.dice_3
            3 -> R.drawable.dice_4
            4 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        currentDraw = currentDraw?.plus(1)
        diceImage.setImageResource(drawableResource)
    }
}