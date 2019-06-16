package com.tinoba.pulsingwavelayout

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

  var flag = true

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

  }

  override fun onResume() {
    super.onResume()
    text.setOnClickListener {
      if (flag) {
        pulsator.startAnimation()
        pulsator2.startAnimation()
        flag = false
      } else {
        flag = true
        pulsator.stopAnimation()
        pulsator2.stopAnimation()
      }
    }

  }

  override fun onPause() {
    super.onPause()

    pulsator.stopAnimation()
    pulsator2.stopAnimation()
  }
}
