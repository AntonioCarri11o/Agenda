package com.example.agenda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.agenda.adapter.CustomAdapter
import com.example.agenda.databinding.ActivityMainBinding
import com.example.agenda.model.Element

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val data= listOf<Element>(
            Element("Antonio",R.drawable.ablue),
            Element("Ana",R.drawable.apurple)
        )

        val adapter=CustomAdapter(this@MainActivity,R.layout.layout_element,data);
        binding.listPerson.layoutManager=LinearLayoutManager(this@MainActivity,LinearLayoutManager.VERTICAL,false)
        binding.listPerson.adapter=adapter
        binding.btnNewPerson.setOnClickListener{
            val intent=Intent(this@MainActivity,NewPerson::class.java)
            startActivity(intent)
        }
        binding.listPerson.setOn
    }

}