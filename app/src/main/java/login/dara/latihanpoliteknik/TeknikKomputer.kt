package login.dara.latihanpoliteknik

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TeknikKomputer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_teknik_komputer)

        val page = intent.getStringExtra("page")

        val btnBack = findViewById<Button>(R.id.btnback2)
        btnBack.setOnClickListener{
            finish()

        }
    }
}

