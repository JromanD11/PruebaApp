package com.example.reciclerview01

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler

class contactAdapter (
    val contactos: List<Contacto>
):RecyclerView.Adapter<ContactViewHolder>() {
    override fun onCreateViewHolder(parent : ViewGroup, viewType: Int): ContactViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_contact, parent, false)
        return ContactViewHolder(view)
    }

    override fun getItemCount(): Int {
        return  contactos.size

    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val contacto = contactos[position]
        holder.onBind(contacto)
    }

}