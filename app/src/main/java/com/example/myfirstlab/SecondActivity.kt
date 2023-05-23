package com.example.myfirstlab

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    lateinit var fullName: TextView
    lateinit var desc: TextView
    lateinit var image: ImageView
    lateinit var fullDesc: TextView

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        fullName = findViewById(R.id.tv_secondName)
        image = findViewById(R.id.imageView2)
        desc = findViewById(R.id.tv_secondDesc)
        fullDesc = findViewById(R.id.tv_descFact)

        // Приймаємо інформацію з першої актівіті
        var passingName = intent.getStringExtra("passingName")
        var passingDescFull = intent.getStringExtra("passingDescFull")
        var passingFullDesc = intent.getStringExtra("passingFullDesc")

        // Встановлюємо цю інформацію на належні місця
        fullName.text = passingName
        desc.text = passingDescFull
        fullDesc.text = passingFullDesc

        // В залежності від імені встановлюємо зображення
        when (passingName) {
            "Karamelka" -> image.setImageResource(R.drawable.cow)
            "Jack" -> image.setImageResource(R.drawable.dog)
            "Suzy" -> image.setImageResource(R.drawable.sheep)
            "Peppa" -> image.setImageResource(R.drawable.pig)
            "Tom" -> image.setImageResource(R.drawable.cat)
        }
    }

}