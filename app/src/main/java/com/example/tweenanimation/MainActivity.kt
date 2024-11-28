package com.example.tweenanimation

import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class TweenAnimationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Объявление imageView
        val imgCat: ImageView = findViewById(R.id.ivAnimCat)
// Загрузка анимации из XML
        val anim: Animation = AnimationUtils.loadAnimation(this, R.anim.new_animation)
// Запуск анимации
        imgCat.startAnimation(anim)
    }
}