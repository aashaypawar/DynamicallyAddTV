package org.geeksforgeeks.dynamicallyaddtv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mButton = findViewById<Button>(R.id.button_1)

        mButton.setOnClickListener {
            val mTextView = TextView(this)
            mTextView.text = "This TextView was created dynamically"

            val mParams = RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT)
            mTextView.layoutParams = mParams

            val mRelativeLayout = findViewById<RelativeLayout>(R.id.relative_layout_1)
            mRelativeLayout.addView(mTextView)
        }
    }
}