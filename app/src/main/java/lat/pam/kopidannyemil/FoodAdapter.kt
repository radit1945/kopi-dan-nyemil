package lat.pam.kopidannyemil

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FoodAdapter(private val items: List<FoodItem>, private val onItemClick: (FoodItem) -> Unit) :
    RecyclerView.Adapter<FoodAdapter.FoodViewHolder>() {

    class FoodViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvName: TextView = itemView.findViewById(R.id.tvFoodName)
        val tvDesc: TextView = itemView.findViewById(R.id.tvFoodDesc)
        val tvPrice: TextView = itemView.findViewById(R.id.tvFoodPrice)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_food, parent, false)
        return FoodViewHolder(view)
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        val item = items[position]
        holder.tvName.text = item.name
        holder.tvDesc.text = item.description
        holder.tvPrice.text = item.price
        holder.itemView.setOnClickListener { onItemClick(item) }
    }

    override fun getItemCount(): Int = items.size
}
