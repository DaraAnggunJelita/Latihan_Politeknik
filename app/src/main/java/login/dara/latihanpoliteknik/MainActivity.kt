package login.dara.latihanpoliteknik

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var btnManajemenInformatika: Button
    private lateinit var btnTeknikKKomputer: Button
    private lateinit var btnfoto: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btnManajemenInformatika = findViewById(R.id.btnManajemenInformatika)
        btnTeknikKKomputer = findViewById(R.id.btnTeknikKomputer)
        btnfoto = findViewById(R.id.btnfoto)

        btnManajemenInformatika.setOnClickListener() {
            val intent = Intent(this, ManajemenInformatika::class.java)
            startActivity(intent)
        }
        btnTeknikKKomputer.setOnClickListener() {
            val intent = Intent(this, TeknikKomputer::class.java)
            startActivity(intent)
        }
        btnfoto.setOnClickListener() {
            val intent = Intent(this, galeri::class.java)
            startActivity(intent)
        }


    }
}