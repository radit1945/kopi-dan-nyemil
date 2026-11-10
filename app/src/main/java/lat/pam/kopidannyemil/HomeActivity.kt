package lat.pam.kopidannyemil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeActivity : AppCompatActivity() {

    private val kopiViewModel: KopiViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val tvHaloNama = findViewById<TextView>(R.id.tvHaloNama)
        val rvFood = findViewById<RecyclerView>(R.id.rvFood)
        rvFood.layoutManager = LinearLayoutManager(this)

        // Observe userName LiveData
        kopiViewModel.userName.observe(this, Observer { name ->
            tvHaloNama.text = "Halo $name,"
        })

        // Observe foodList LiveData for the catalog
        kopiViewModel.foodList.observe(this, Observer { list ->
            rvFood.adapter = FoodAdapter(list) { food ->
                val intent = Intent(this, OrderActivity::class.java)
                intent.putExtra("SELECTED_FOOD", food.name)
                startActivity(intent)
            }
        })

        val btnNavHome = findViewById<Button>(R.id.btnNavHome)
        val btnNavOrder = findViewById<Button>(R.id.btnNavOrder)
        val btnNavProfile = findViewById<Button>(R.id.btnNavProfile)

        btnNavHome.setOnClickListener {
            // Already home
        }

        btnNavOrder.setOnClickListener {
            startActivity(Intent(this, OrderActivity::class.java))
        }

        btnNavProfile.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }
    }

    override fun onResume() {
        super.onResume()
        // Ensure ViewModel keeps synced with UserSession if modified elsewhere
        kopiViewModel.updateUserName(UserSession.nama)
    }
}
