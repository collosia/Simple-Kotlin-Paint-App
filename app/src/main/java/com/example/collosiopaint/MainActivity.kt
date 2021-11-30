package com.example.collosiopaint

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import com.example.collosiopaint.PaintView.Companion.colorList
import com.example.collosiopaint.PaintView.Companion.currentBrush
import com.example.collosiopaint.PaintView.Companion.pathList

class MainActivity : AppCompatActivity() {

    companion object {
        var path = Path()
        var paintBrush = Paint()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()


        val redBtn = findViewById<ImageButton>(R.id.redColor)
        val blackBtn = findViewById<ImageButton>(R.id.blackColor)
        val blueBtn = findViewById<ImageButton>(R.id.blueColor)
        val eraser = findViewById<ImageButton>(R.id.whiteColor)

        redBtn.setOnClickListener {

            paintBrush.setColor(Color.RED)
            currentColor(paintBrush.color)
        }
        blueBtn.setOnClickListener {
            paintBrush.setColor(Color.BLUE)
            currentColor(paintBrush.color)
        }
        eraser.setOnClickListener {
            paintBrush.setColor(Color.WHITE)
            currentColor(paintBrush.color)
            pathList.clear()
            colorList.clear()
            path.reset()
        }
        blackBtn.setOnClickListener {
            paintBrush.setColor(Color.BLACK)
            currentColor(paintBrush.color)
        }







    }
    private fun currentColor(color: Int){
        currentBrush = color
        path = Path()
    }
}