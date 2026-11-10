package lat.pam.kopidannyemil

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Immediately redirect to SplashActivity to ensure correct entry point
        val intent = Intent(this, SplashActivity::class.java)
        startActivity(intent)
        finish()
    }
}
