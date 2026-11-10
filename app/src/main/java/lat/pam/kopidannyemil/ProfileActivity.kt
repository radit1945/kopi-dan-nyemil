package lat.pam.kopidannyemil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.google.android.material.textfield.TextInputEditText

class ProfileActivity : AppCompatActivity() {

    private val kopiViewModel: KopiViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val tvProfileHalo = findViewById<TextView>(R.id.tvProfileHalo)
        val etProfileNama = findViewById<TextInputEditText>(R.id.etProfileNama)

        // Observe userName LiveData
        kopiViewModel.userName.observe(this, Observer { name ->
            tvProfileHalo.text = "Halo $name,"
            etProfileNama.setText(name)
        })

        val btnSaveProfile = findViewById<Button>(R.id.btnSaveProfile)
        btnSaveProfile.setOnClickListener {
            val newNama = etProfileNama.text.toString().trim()
            if (newNama.isNotEmpty()) {
                kopiViewModel.updateUserName(newNama)
                Toast.makeText(this, "Profile berhasil disimpan via ViewModel & LiveData", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Nama tidak boleh kosong", Toast.LENGTH_SHORT).show()
            }
        }

        val btnNavHome = findViewById<Button>(R.id.btnNavHome)
        val btnNavOrder = findViewById<Button>(R.id.btnNavOrder)
        val btnNavProfile = findViewById<Button>(R.id.btnNavProfile)

        btnNavHome.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
            startActivity(intent)
            finish()
        }

        btnNavOrder.setOnClickListener {
            startActivity(Intent(this, OrderActivity::class.java))
            finish()
        }

        btnNavProfile.setOnClickListener {
            // Already profile
        }
    }
}
