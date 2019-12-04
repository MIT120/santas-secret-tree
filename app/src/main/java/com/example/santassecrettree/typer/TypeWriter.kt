package com.example.santassecrettree.typer

import android.content.Context
import android.media.MediaPlayer
import android.os.Handler
import android.text.Layout
import android.text.method.ScrollingMovementMethod
import android.util.AttributeSet
import androidx.core.os.HandlerCompat.postDelayed
import android.widget.TextView
import com.example.santassecrettree.R


class TypeWriter : TextView {

    private var mText: CharSequence? = null
    private var mIndex: Int = 0
    private var mDelay: Long = 150 // in ms

    private lateinit var musicPlayer: MediaPlayer
    private val mHandler = Handler()

    private val characterAdder = object : Runnable {

        override fun run() {
            text = mText!!.subSequence(0, mIndex++)

            if (mIndex <= mText!!.length) {
                mHandler.postDelayed(this, mDelay)
            }
            else {
                musicPlayer.pause()
                musicPlayer.stop()
            }
        }
    }

    constructor(context: Context) : super(context) {
        musicPlayer = MediaPlayer.create(context, R.raw.typewriter)
        musicPlayer.isLooping = true
        musicPlayer.setVolume(0.5f,0.5f)
        this.justificationMode = Layout.JUSTIFICATION_MODE_INTER_WORD

    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        musicPlayer = MediaPlayer.create(context, R.raw.typewriter)
        musicPlayer.isLooping = true
        musicPlayer.setVolume(0.5f,0.5f)
        this.justificationMode = Layout.JUSTIFICATION_MODE_INTER_WORD
        this.movementMethod = ScrollingMovementMethod()
    }

    fun animateText(txt: CharSequence) {
        mText = txt
        mIndex = 0

        text = ""
        mHandler.removeCallbacks(characterAdder)
        musicPlayer.start()
        mHandler.postDelayed(characterAdder, mDelay)
    }

    fun setCharacterDelay(m: Long) {
        mDelay = m
    }
}