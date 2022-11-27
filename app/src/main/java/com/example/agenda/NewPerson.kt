package com.example.agenda


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.agenda.databinding.ActivityNewPersonBinding

class NewPerson : AppCompatActivity() {
    lateinit var binding: ActivityNewPersonBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityNewPersonBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val types= listOf("Casa","Movil")
        val spAdapter= ArrayAdapter(this@NewPerson,android.R.layout.simple_list_item_1,types)
        binding.spTypes.adapter=spAdapter

        binding.bottomAppBar.setOnMenuItemClickListener {
            item->
            when(item.itemId){
                R.id.btnClose->{
                    val intent=Intent(this@NewPerson,MainActivity::class.java)
                    intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
                    startActivity(intent)
                }
                else->{}
            }
            true
        }
        binding.li
    }
}