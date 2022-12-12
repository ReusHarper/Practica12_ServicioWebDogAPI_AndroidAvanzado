package dgtic.unam.serviciowebdogapi

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
//import dgtic.unam.http.databinding.ItemDogBinding
import dgtic.unam.serviciowebdogapi.databinding.ItemDogBinding

class DogViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val binding = ItemDogBinding.bind(view)
    fun bind(image: String) {
        Picasso.get().load(image).into(binding.imgView)
    }
}