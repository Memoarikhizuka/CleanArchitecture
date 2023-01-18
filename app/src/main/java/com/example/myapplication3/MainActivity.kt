package com.example.myapplication3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.myapplication3.domain.usecase.GetUserNameUseCase
import com.example.myapplication3.domain.usecase.SaveUserNameUseCase
import com.example.myapplication3.domain.usecase.models.SaveUserNameParam
import com.example.myapplication3.domain.usecase.models.UserName

class MainActivity : AppCompatActivity() {

   private val getUserNameUseCase= GetUserNameUseCase()
    private val saveUserNameUserCase = SaveUserNameUseCase()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataTextView = findViewById<TextView>(R.id.dataTextView)
        val dataEditView = findViewById<EditText>(R.id.dataEditText)
        val sendButton = findViewById<Button>(R.id.sendButton)
        val receiveButton = findViewById<Button>(R.id.receiveButton)

        sendButton.setOnClickListener {
            //Клик по кнопке Save Data
            val text = dataEditView.text.toString()
            val params = SaveUserNameParam(name= text)
            val result: Boolean = saveUserNameUserCase.execute(param = params)
            dataTextView.text = "Save result = $result"
        }

        receiveButton.setOnClickListener {
            // Клик по кнопке Get Data

            val userName: UserName = getUserNameUseCase.execute()
            dataTextView.text = "${userName.firstName} ${userName.lastName}"

        }
    }
}