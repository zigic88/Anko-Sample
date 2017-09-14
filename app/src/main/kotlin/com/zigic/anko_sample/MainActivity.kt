package com.zigic.anko_sample

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.zigic.anko_sample.sign_in.SignInActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        startActivity(Intent(this, SignInActivity::class.java))
        finish()

    }
}
