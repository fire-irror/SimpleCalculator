package kr.hs.emirim.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var edit1 : EditText
    lateinit var edit2 : EditText
    lateinit var btn_plus : Button
    lateinit var btn_minus : Button
    lateinit var btn_multiply : Button
    lateinit var btn_divide : Button
    lateinit var text_result : TextView
    lateinit var num1 : String
    lateinit var num2 : String
    var result : Int? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edit1 = findViewById(R.id.edit1)
        edit2 = findViewById(R.id.edit2)
        text_result = findViewById(R.id.text_result)
        btn_plus = findViewById(R.id.btn_plus)
        btn_minus = findViewById(R.id.btn_minus)
        btn_multiply = findViewById(R.id.btn_multiply)
        btn_divide = findViewById(R.id.btn_divide)

        btn_plus.setOnClickListener {
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()
            result = Integer.parseInt(num1) + Integer.parseInt(num2)
            text_result.text = "계산 결과 : "+ result

        }

        btn_minus.setOnClickListener {
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()
            result = Integer.parseInt(num1) - Integer.parseInt(num2)
            text_result.text = "계산 결과 : "+ result

        }


        btn_multiply.setOnClickListener {
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()
            result = Integer.parseInt(num1) * Integer.parseInt(num2)
            text_result.text = "계산 결과 : "+ result

        }

        btn_divide.setOnClickListener {
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()
            result = Integer.parseInt(num1) / Integer.parseInt(num2)
            text_result.text = "계산 결과 : "+ result

        }





    }
}