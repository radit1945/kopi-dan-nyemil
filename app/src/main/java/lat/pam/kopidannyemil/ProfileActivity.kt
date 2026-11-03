package lat.pam.kopidannyemil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val tvProfileHalo = findViewById<TextView>(R.id.tvProfileHalo)
        tvProfileHalo.text = "Halo ${UserSession.nama},"

        val etProfileNama = findViewById<TextInputEditText>(R.id.etProfileNama)
        etProfileNama.setText(UserSession.nama)

        val btnSaveProfile = findViewById<Button>(R.id.btnSaveProfile)
        btnSaveProfile.setOnClickListener {
            val newNama = etProfileNama.text.toString().trim()
            if (newNama.isNotEmpty()) {
                UserSession.nama = newNama
                tvProfileHalo.text = "Halo ${UserSession.nama},"
                Toast.makeText(this, "Profile berhasil disimpan", Toast.LENGTH_SHORT).show()
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
