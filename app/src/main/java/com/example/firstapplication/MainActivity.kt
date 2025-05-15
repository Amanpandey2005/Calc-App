package com.example.firstapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() ,View.OnClickListener {
    lateinit var btnadd:Button;
    lateinit var btnsub:Button ;
    lateinit var btnmul:Button;
    lateinit var btndiv:Button;
    lateinit var etA:EditText;
    lateinit var etB:EditText;
    lateinit var resulttv :TextView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        btnadd = findViewById(R.id.btnadd)
        btnsub = findViewById(R.id.btnsub)
        btnmul = findViewById(R.id.btnmul)
        btndiv = findViewById(R.id.btndiv)
        etA = findViewById(R.id.Enterfirstnumber)
        etB = findViewById(R.id.EnterSecondNumber)
        resulttv = findViewById(R.id.Resulthere)

        btnadd.setOnClickListener(this)
        btnsub.setOnClickListener(this)
        btnmul.setOnClickListener(this)
        btndiv.setOnClickListener(this)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    override fun onClick(v: View?) {
        var a = etA.text.toString().toDouble()
        var b = etB.text.toString().toDouble()
        var result = 0.0
        when(v?.id){
            R.id.btnadd ->{
                result = a+b
            }
            R.id.btnsub ->{
                result = a-b
            }
            R.id.btnmul ->{
                result = a*b
            }
            R.id.btndiv ->{
                result = a/b
            }
        }

    resulttv.text = "Result is $result"
    }
}