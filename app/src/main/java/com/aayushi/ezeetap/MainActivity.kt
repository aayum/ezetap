package com.aayushi.ezeetap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aayushi.ezeetap.databinding.ActivityMainBinding
import com.aayushi.library.MathOps

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    lateinit var mathOps: MathOps

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mathOps = com.aayushi.library.MathOpsImpl()

        binding.btnPlus.setOnClickListener {
            //add
            add()

        }

        binding.btnSub.setOnClickListener {
            //sub
            subtract()

        }
    }

    private fun add() {
        val n1 = binding.tvNo1.editText?.text.toString().toInt()
        val n2 = binding.tvNo2.editText?.text.toString().toInt()
        val sum = mathOps.add(n1,n2)

        //goto activity 2 for result show
        startResultActivity(sum)

    }

    private fun subtract() {
        val n1 = binding.tvNo1.editText?.text.toString().toInt()
        val n2 = binding.tvNo2.editText?.text.toString().toInt()
        val diff = mathOps.substract(n1,n2)

        //goto activity 2 for result show
        startResultActivity(diff)
    }

    private fun startResultActivity(result:Int) {
        val intent = Intent(this, ResultActivity::class.java)
        intent.putExtra("result",result)
        startActivity(intent)
    }
}