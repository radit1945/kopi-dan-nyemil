package lat.pam.kopidannyemil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val tvHaloNama = findViewById<TextView>(R.id.tvHaloNama)
        tvHaloNama.text = "Halo ${UserSession.nama},"

        val rvFood = findViewById<RecyclerView>(R.id.rvFood)
        rvFood.layoutManager = LinearLayoutManager(this)
        rvFood.adapter = FoodAdapter(DummyData.foodList) { food ->
            // Clicking food goes to order
            val intent = Intent(this, OrderActivity::class.java)
            intent.putExtra("SELECTED_FOOD", food.name)
            startActivity(intent)
        }

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
        val tvHaloNama = findViewById<TextView>(R.id.tvHaloNama)
        tvHaloNama.text = "Halo ${UserSession.nama},"
    }
}
