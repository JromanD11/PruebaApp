package com.example.reciclerview01

import android.content.Intent
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso
import androidx.recyclerview.widget.RecyclerView

class ContactViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
    val txtContactName : TextView= itemView.findViewById(R.id.txtContactName)
    val txtContactLastname: TextView= itemView.findViewById(R.id.txtContactLastName)
    val txtContactNumber: TextView=itemView.findViewById(R.id.txtContactNumber)
    val contactImage: ImageView= itemView.findViewById(R.id.imContact)

    fun onBind(contacto: Contacto){
        txtContactName.text = contacto.nombre
        txtContactLastname.text = contacto.apellido
        txtContactNumber.text = contacto.telefono

        Picasso.get()
            .load(contacto.foto)
            .placeholder(R.drawable.ic_launcher_background)
            .error(R.drawable.ic_launcher_background)
            .into(contactImage)
        itemView.setOnClickListener {
            val intent = Intent(itemView.context, ContactDetailActivity::class.java)
            intent.putExtra("CONTACTO",contacto)
            itemView.context.startActivity(intent)
        }
    }
    
}

