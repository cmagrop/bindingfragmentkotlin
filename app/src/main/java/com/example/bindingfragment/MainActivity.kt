package com.example.bindingfragment

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.bindingfragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() { //class MainActivity extends AppCompatActivity

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityMainBinding.inflate(layoutInflater);
        super.onCreate(savedInstanceState)
        setContentView(binding.root) //definir el layout raiz activity_main LinearLayout
        //vincular el boton
        binding.entrarButton.setOnClickListener {
            //cuerpo del metodo setOnClickLister
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }


    }
}