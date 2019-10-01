package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var diceImage_top: ImageView
    lateinit var diceImage_bottom: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{rollDice()}
        val clearButton: Button = findViewById(R.id.clear_button)
        clearButton.setOnClickListener{clearDice()}
        diceImage_top = findViewById(R.id.dice_image_top)
        diceImage_bottom = findViewById(R.id.dice_image_bottom)
    }

    private fun getRandomDiceImage(): Int{
        return when(Random().nextInt(6) + 1){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }

    private fun rollDice(){
        diceImage_top.setImageResource(getRandomDiceImage())
        diceImage_bottom.setImageResource(getRandomDiceImage())
    }

    private fun clearDice(){
        diceImage_top.setImageResource(R.drawable.empty_dice)
        diceImage_bottom.setImageResource(R.drawable.empty_dice)
    }

}