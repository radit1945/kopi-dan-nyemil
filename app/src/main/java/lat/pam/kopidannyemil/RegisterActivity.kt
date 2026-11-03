package lat.pam.kopidannyemil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val etNamaLengkap = findViewById<TextInputEditText>(R.id.etNamaLengkap)
        val etUsernameReg = findViewById<TextInputEditText>(R.id.etUsernameReg)
        val etPasswordReg = findViewById<TextInputEditText>(R.id.etPasswordReg)
        val btnRegisterSubmit = findViewById<Button>(R.id.btnRegisterSubmit)

        btnRegisterSubmit.setOnClickListener {
            val nama = etNamaLengkap.text.toString().trim()
            val username = etUsernameReg.text.toString().trim()
            val password = etPasswordReg.text.toString().trim()

            if (nama.isEmpty() || username.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Mohon lengkapi semua field", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            UserSession.nama = nama
            UserSession.username = username

            val intent = Intent(this, HomeActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
        }
    }
}
