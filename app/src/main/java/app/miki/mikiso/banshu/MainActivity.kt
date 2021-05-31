package app.miki.mikiso.banshu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calenderButton.setOnClickListener {
            val Calender = Intent(this,shrineName::class.java)
            startActivity(Calender)

        }
        shrineNameButton.setOnClickListener {
            val name = Intent(this,nameCheck::class.java)
            startActivity(name)
        }
        scheduleMaturiButton.setOnClickListener {
            val schedule = Intent(this,scheduleMaturiList::class.java)
            startActivity(schedule)
        }
    }
}