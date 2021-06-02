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
            val Ebisu = Intent(this, Ebisu::class.java)
            startActivity(Ebisu)
        }
        hamanomiyaButton.setOnClickListener {
            val Hamanomiya = Intent(this, Hamanomiya::class.java)
            startActivity(Hamanomiya)
        }
        matubaraButton.setOnClickListener {
            val Matubara = Intent(this, Matubara::class.java)
            startActivity(Matubara)
        }
        oosioButton.setOnClickListener {
            val Oosio = Intent(this, Oosio::class.java)
            startActivity(Oosio)
        }
        arakawaButton.setOnClickListener {
            val Arakawa = Intent(this, Arakawa::class.java)
            startActivity(Arakawa)
        }
       usukiButton.setOnClickListener {
           val Usuki = Intent(this,Usuki::class.java)
           startActivity(Usuki)
       }
        ebisuAccessButton.setOnClickListener {
            val EbisuAccess = Intent(this,EbisuAccess::class.java)
            startActivity(EbisuAccess)
        }
        hamanomiyaAccessButton.setOnClickListener {
            val HamanomiyaAccess = Intent (this,HamanomiyaAccess::class.java)
            startActivity(HamanomiyaAccess)
        }
        matubaraAccessButton.setOnClickListener {
            val MatubaraAccess = Intent (this,MatubaraAccess::class.java)
            startActivity(MatubaraAccess)
        }
        oosioAccessButton.setOnClickListener {
            val OosioAccess = Intent(this,OosioAccess::class.java)
            startActivity(OosioAccess)
        }
        arakawaAccessButton.setOnClickListener {
            val ArakawaAccess = Intent (this,ArakawaAccess::class.java)
            startActivity(ArakawaAccess)
        }
        usukiAccessButton.setOnClickListener {
            val UsukiAccess = Intent(this,UsukiAccess::class.java)
            startActivity(UsukiAccess)
        }


    }
}
