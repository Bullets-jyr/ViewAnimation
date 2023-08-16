package kr.co.bullets.viewanimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AlphaAnimation
import android.view.animation.AnimationSet
import android.view.animation.RotateAnimation
import android.view.animation.ScaleAnimation
import android.view.animation.TranslateAnimation
import kr.co.bullets.viewanimation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.start.setOnClickListener { button ->
            val myAnimationSet = AnimationSet(true)
            myAnimationSet.duration = 3000
            val translate = TranslateAnimation(
                0f,
                300f,
                0f,
                300f
            )

            val rotate = RotateAnimation(0f, 360f)
            val alpha = AlphaAnimation(1f, 0f)
            val scale = ScaleAnimation(1f, 3f, 1f, 3f)
//            myAnimationSet.addAnimation(translate)
//            myAnimationSet.addAnimation(rotate)
//            myAnimationSet.addAnimation(alpha)
//            myAnimationSet.addAnimation(scale)

            myAnimationSet.apply {
                addAnimation(translate)
                addAnimation(rotate)
                addAnimation(alpha)
                addAnimation(scale)
            }

            button.startAnimation(myAnimationSet)
        }
    }
}