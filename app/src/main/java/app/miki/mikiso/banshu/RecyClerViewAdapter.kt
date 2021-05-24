package app.miki.mikiso.banshu

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyClerViewAdapter(private val context: Context):
    RecyclerView.Adapter<RecyClerViewAdapter.ViewHolder>() {
    val items:MutableList<ShrineSata> = mutableListOf()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(context).inflate(R.layout.shrine_name_list,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.shrineName.text =item.shrineName
        holder.data.text = item.dataTextView
    }

    override fun getItemCount(): Int {
        return items.size


    }

    fun addAll(items: List<ShrineSata>){
        this.items.addAll(items)
        notifyDataSetChanged()
    }
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val shrineName: TextView = view.findViewById(R.id.shrineName)
        val data : TextView = view.findViewById(R.id.dataTextView)

    }
}