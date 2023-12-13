package com.example.allomalar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class infoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)
        intent.extras?.let {
            val number = it.getInt("NUMBER")
            loadData(number)
        }
    }
    private fun loadData(number: Int){
        val image = findViewById<ImageView>(R.id.image)
        val textTitle = findViewById<TextView>(R.id.textSarlovxa)
        val textDescription = findViewById<TextView>(R.id.textDescription)
        when(number){
            1->{
                image.setImageResource(R.drawable.navoiy)
                textTitle.setText("Alisher Navoiy")
                setTitle("Alisher Navoiy")
                textDescription.setText(R.string.navoiy)
            }
            2->{
                image.setImageResource(R.drawable.beruniy)
                textTitle.setText("Al Beruniy")
                setTitle("Al Beruniy")
                textDescription.setText(R.string.beruniy)
            }
            3->{
                image.setImageResource(R.drawable.ulugbek)
                textTitle.setText("Mirzo Ulug'bek")
                setTitle("Mirzo Ulug'bek")
                textDescription.setText(R.string.ulugbek)
            }
            4->{
                image.setImageResource(R.drawable.bobur)
                textTitle.setText("Zahiriddin Muhammad Bobur")
                setTitle("Zahiriddin Muhammad Bobur")
                textDescription.setText(R.string.bobur)
            }
        }
    }
}