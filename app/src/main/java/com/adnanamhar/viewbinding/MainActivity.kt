package com.adnanamhar.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.adnanamhar.viewbinding.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

//    private lateinit var editText: EditText
//    private lateinit var btnSend: Button
//    private lateinit var txtView: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        editText = findViewById(R.id.edit_text)
//        btnSend = findViewById(R.id.btn_send)
//        txtView = findViewById(R.id.text_view)

        binding.btnSend.setOnClickListener{
            val data = edit_text.text
            saveData(data.toString())
        }
    }

    private fun saveData(data: String) {
        binding.textView.text = data
    }
}