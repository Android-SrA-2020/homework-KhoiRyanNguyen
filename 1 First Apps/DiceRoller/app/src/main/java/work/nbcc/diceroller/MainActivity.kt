package work.nbcc.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

     lateinit var diceImage: ImageView
    lateinit var diceImage2 : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        diceImage = findViewById(R.id.dice_image)
        diceImage2 = findViewById(R.id.dice_image2)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener {rollDice()}

//        val countButton : Button = findViewById(R.id.countup_button)
//        countButton.setOnClickListener {countUp()}
//
       val resetButton : Button = findViewById(R.id.reset_button)
        resetButton.setOnClickListener{Reset_Dice()}

    }


    private fun rollDice() {
        diceImage.setImageResource(getRandomDiceImage())
        diceImage2.setImageResource(getRandomDiceImage())
    }

    private fun Reset_Dice() {
        diceImage.setImageResource(EmptyDiceImage())
        diceImage2.setImageResource(EmptyDiceImage())
    }

    private fun EmptyDiceImage() : Int {


        return R.drawable.empty_dice
    }

    private fun getRandomDiceImage() : Int {
        val randomInt = Random().nextInt(6) + 1

        return when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }
//    private fun reset(){
//        val randomInt = 0
//        //Toast.makeText(this, "button clicked",
//        // Toast.LENGTH_SHORT).show()
//
//        val resultText: TextView = findViewById(R.id.result_text)
//        resultText.text = randomInt.toString()
//    }
//    private fun countUp() {
//        val resultText: TextView = findViewById(R.id.result_text)
//        if (resultText.text == "Hello World!") {
//            resultText.text = "1"
//        } else {
//
//            var resultInt = resultText.text.toString().toInt()
//
//            if (resultInt < 6) {
//                resultInt++
//                resultText.text = resultInt.toString()
//            }
//        }
//    }
}
