package lat.pam.kopidannyemil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class OrderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        val etOrderNama = findViewById<TextInputEditText>(R.id.etOrderNama)
        val etOrderAlamat = findViewById<TextInputEditText>(R.id.etOrderAlamat)
        val etOrderPatokan = findViewById<TextInputEditText>(R.id.etOrderPatokan)

        etOrderNama.setText(UserSession.nama)
        etOrderAlamat.setText(UserSession.alamat)
        etOrderPatokan.setText(UserSession.patokan)

        val btnOrderKirim = findViewById<Button>(R.id.btnOrderKirim)
        btnOrderKirim.setOnClickListener {
            val nama = etOrderNama.text.toString().trim()
            val alamat = etOrderAlamat.text.toString().trim()
            val patokan = etOrderPatokan.text.toString().trim()

            if (nama.isEmpty() || alamat.isEmpty() || patokan.isEmpty()) {
                Toast.makeText(this, "Mohon lengkapi data pengiriman", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            UserSession.nama = nama
            UserSession.alamat = alamat
            UserSession.patokan = patokan

            val intent = Intent(this, ConfirmationActivity::class.java)
            startActivity(intent)
        }
    }
}
