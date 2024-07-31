package com.example.reciclerview01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.reciclerview01.databinding.ActivityContactDetailBinding
import com.squareup.picasso.Picasso

class ContactDetailActivity : AppCompatActivity() {
    lateinit var binding : ActivityContactDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContactDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val contacto = intent.getParcelableExtra<Contacto>("CONTACTO")

        if (contacto != null) {
            binding.textView.text= "${contacto.nombre} ${contacto.apellido}"
            binding.txtPhone.text = contacto.telefono

            Picasso.get()
                .load(contacto.foto)
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)
                .into(binding.imContact2)
        }
        binding.btnEnd.setOnClickListener{
            finish()
        }

    }
}