package com.example.comicreader.Service

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.example.comicreader.R
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_login.*
import android.app.ProgressDialog
import android.view.View
import com.example.comicreader.MainActivity

class LoginActivity : AppCompatActivity() {

//    override fun onClick(v: View) {
//        val id = v.id
//        when (id) {
//            R.id.btLogin -> signIn(fieldEmail.text.toString(), fieldPassword.text.toString())
//           // R.id.mRegisterTv -> startActivity(Intent(this@LoginActivity,RegisterActivity::class.java))
//        }
//    }

    private lateinit var mAuth: FirebaseAuth



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        mAuth = FirebaseAuth.getInstance()
        btLogin.setOnClickListener{
            signIn(fieldEmail.text.toString(), fieldPassword.text.toString())
        }
        mRegisterTv.setOnClickListener {
            startActivity(Intent(this@LoginActivity,RegisterActivity::class.java))
        }

        val gifview = findViewById<ImageView>(R.id.gif)
        Glide.with(this)
            .asGif()
            .load("https://media.giphy.com/media/ouBtiwChKqyVW/giphy.gif")
            .into(gifview)

    }

    private fun validateForm(): Boolean {
        var valid = true

        val email = fieldEmail.text.toString()
        if (TextUtils.isEmpty(email)) {
            fieldEmail.error = "Required."
            valid = false
        } else {
            fieldEmail.error = null
        }

        val password = fieldPassword.text.toString()
        if (TextUtils.isEmpty(password)) {
            fieldPassword.error = "Required."
            valid = false
        } else {
            fieldPassword.error = null
        }

        return valid
    }

    private fun signIn(email: String, password: String) {
        if (!validateForm()) {
            return
        }

        showProgressDialog()

        // [START sign_in_with_email]
        mAuth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    startActivity(Intent(this@LoginActivity, MainActivity::class.java))
                    finish()
                } else {
                    Toast.makeText(baseContext, "Authentication failed.",
                        Toast.LENGTH_SHORT).show()
                }
                if (!task.isSuccessful) {

                }
                hideProgressDialog()
                // [END_EXCLUDE]
            }
        // [END sign_in_with_email]
    }

    private val progressDialog by lazy {
        ProgressDialog(this)
    }

    private fun showProgressDialog() {
        progressDialog.setMessage("loading")
        progressDialog.isIndeterminate = true
        progressDialog.show()
    }

    private fun hideProgressDialog() {
        if (progressDialog.isShowing) {
            progressDialog.dismiss()
        }
    }


    public override fun onStop() {
        super.onStop()
        hideProgressDialog()
    }


}
