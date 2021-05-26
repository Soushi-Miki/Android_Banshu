package app.miki.mikiso.banshu

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_name_check.*

class nameCheck : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name_check)

        ebisuButton.setOnClickListener {
            val Ebisu = Intent(this,Ebisu::class.java)
            startActivity(Ebisu)
        }
        hamanomiyaButton.setOnClickListener {
            val Hamanomiya = Intent(this,Hamanomiya::class.java)
            startActivity(Hamanomiya)
        }
        matubaraButton.setOnClickListener {
            val Matubara = Intent (this,Matubara::class.java)
            startActivity(Matubara)
        }
        oosioButton.setOnClickListener {
            val Oosio = Intent (this,Oosio::class.java)
            startActivity(Oosio)
        }
        arakawaButton.setOnClickListener {
            val Arakawa = Intent (this,Arakawa::class.java)
            startActivity(Arakawa)
        }
        usukiButton.setOnClickListener {
            val Usuki = Intent (this,Usuki::class.java)
            startActivity(Usuki)
        }

    }

}