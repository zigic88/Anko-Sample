package com.zigic.anko_sample.sign_in

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.setContentView

/**
 * Created by zigic on 14/09/17.
 */
class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        SingInView().setContentView(this)
    }

    fun authorizeUser(username: String, password: String) {
       /*
       Authorize Username & Password
        */
    }
}