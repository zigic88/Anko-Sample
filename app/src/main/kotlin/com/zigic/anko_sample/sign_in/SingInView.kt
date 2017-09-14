package com.zigic.anko_sample.sign_in

import android.view.View
import com.zigic.anko_sample.R
import org.jetbrains.anko.*

/**
 * Created by zigic on 14/09/17.
 */
class SingInView : AnkoComponent<SignInActivity> {
    private lateinit var ankoContext: AnkoContext<SignInActivity>

    override fun createView(ui: AnkoContext<SignInActivity>) = with(ui) {
        ankoContext=ui
        verticalLayout {
            lparams(width = matchParent, height = matchParent)
            val username = editText {
                id = R.id.username_EditText
                hintResource = R.string.sign_in_username
                textSize = 24f
            }.lparams(width = matchParent, height = wrapContent)
            val password = editText {
                id = R.id.password_EditText
                hintResource = R.string.sign_in_password
                textSize = 24f
            }.lparams(width = matchParent, height = wrapContent)
            button {
                id = R.id.signin_Button
                textResource = R.string.sign_in_button
                setOnClickListener {
                    handleOnSignInButtonPressed(
                            ui = ui,
                            username = username.text.toString(),
                            password = password.text.toString()
                    )
                }
            }.lparams(width = matchParent, height = wrapContent)
        }
    }

    private fun handleOnSignInButtonPressed(ui: AnkoContext<SignInActivity>, username: String, password: String) {
        if (username.isBlank() or password.isBlank()) {
            with(ui) {
                alert(title = R.string.sigIn_alert_invalid_user_title,
                        message = R.string.sigIn_alert_invalid_user_message) {
                    positiveButton(R.string.dialog_button_close) {}
                }.show()
            }
        } else {
            // TODO
            ui.owner.authorizeUser(username, password)
        }
    }

}
