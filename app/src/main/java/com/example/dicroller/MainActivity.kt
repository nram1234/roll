package com.example.dicroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.dicroller.databinding.ActivityMainBinding
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
      lateinit var mynae:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
      binding.button.setOnClickListener {
          print("0000000000000000000000000000000000000000000000000000")
          Toast.makeText(this,"ooooooo",Toast.LENGTH_LONG).show()

          rollduic()
      }
    }

    private fun rollduic() {
    var random=    Random.nextInt(6)
        var  r=when (random){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            6->R.drawable.dice_6
            else ->R.drawable.empty_dice

        }
       binding.image.setImageResource(r)
mynae="ppp"
        print(mynae)
    }
}