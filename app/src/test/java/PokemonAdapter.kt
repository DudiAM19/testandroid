import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.test.R
import com.example.test.ResponseApi

class PokemonAdapter (val data: List<ResponseApi> ?) : RecyclerView.Adapter<PokemonAdapter.MyHolder> () {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        TODO("Not yet implemented")
        val v = LayoutInflater.from(parent.context).inflate(R.layout.activity_home_page, parent, false)
        return MyHolder(v)
    }

    override fun getItemCount(): Int = data?.size ?: 0

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.bind(data?.get(position))
    }

    class MyHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(get: ResponseApi?) {

        }
    }
}