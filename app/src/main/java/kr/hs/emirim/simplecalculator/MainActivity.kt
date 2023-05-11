package kr.hs.emirim.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var edit1 : EditText
    lateinit var edit2 : EditText
    lateinit var btn_plus : Button
    lateinit var btn_minus : Button
    lateinit var btn_multiply : Button
    lateinit var btn_divide : Button
    lateinit var btn_mod : Button
    lateinit var text_result : TextView
    lateinit var num1 : String
    lateinit var num2 : String
    var result : Double? = null
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
        btn_mod = findViewById(R.id.btn_mod)



        btn_plus.setOnClickListener {
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()
            if(num1=="" || num2 =="") {
                Toast.makeText(baseContext, "숫자를 입력하세요", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            result = num1.toDouble() + num2.toDouble()
            text_result.text = "계산 결과 : "+ result

        }

        btn_minus.setOnClickListener {
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()
            if(num1=="" || num2 ==""){
                Toast.makeText(baseContext, "숫자를 입력하세요",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            result = num1.toDouble() - num2.toDouble()
            text_result.text = "계산 결과 : "+ result

        }


        btn_multiply.setOnClickListener {
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()
            if(num1=="" || num2 ==""){
                Toast.makeText(baseContext, "숫자를 입력하세요",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            result = num1.toDouble() * num2.toDouble()
            text_result.text = "계산 결과 : "+ result

        }

        btn_divide.setOnClickListener {
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()
            if(num1=="" || num2 ==""){
                Toast.makeText(baseContext, "숫자를 입력하세요",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if(num2.toDouble()==0.0){
                Toast.makeText(baseContext, "0으로 나눌 수 없습니다.",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            result = num1.toDouble() / num2.toDouble()
            text_result.text = "계산 결과 : "+ result

        }

        btn_mod.setOnClickListener {
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()
            if(num1=="" || num2 ==""){
                Toast.makeText(baseContext, "숫자를 입력하세요",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            result = num1.toDouble() % num2.toDouble()
            text_result.text = "계산 결과 : "+ result

        }



    }
}