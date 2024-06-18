package com.example.bindingfragment

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.example.bindingfragment.databinding.ActivityMain2Binding
import com.example.bindingfragment.fragments.ChatFragment
import com.example.bindingfragment.fragments.HomeFragment

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {

        var binding = ActivityMain2Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.home.setOnClickListener {

            //vamos a implementar el fragment de Home
            replaceFragment(HomeFragment())
            Toast.makeText(this,"Home",Toast.LENGTH_LONG).show()


        }

        binding.chat.setOnClickListener {

            //vamos a implementar el fragment de Chat
            replaceFragment(ChatFragment())
            Toast.makeText(this,"Chat",Toast.LENGTH_LONG).show()
        }

    }

    fun replaceFragment(fragment:Fragment)
    {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragment,fragment)
        //replace(fragmento a reemplazar en activity_main2.xml,fragmento de reemplazo)
        fragmentTransaction.commit()

    }

}