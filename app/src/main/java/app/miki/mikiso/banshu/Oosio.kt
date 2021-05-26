package app.miki.mikiso.banshu

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_hamanomiya.*
import kotlinx.android.synthetic.main.activity_oosio.*

class Oosio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oosio)

        miyamototyouButton.setOnClickListener {
            val gmmIntentUri =
                    Uri.parse("geo:0,0?q=姫路市大塩町2077-5")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }
        higasinotyouButton.setOnClickListener {
            val gmmIntentUri =
                    Uri.parse("geo:0,0?q=姫路市大塩町1919")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }
        nakanotyouButton.setOnClickListener {
            val gmmIntentUri =
                    Uri.parse("geo:0,0?q=姫路市大塩町333-3")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }
        nisinotyouButton.setOnClickListener {
            val gmmIntentUri =
                    Uri.parse("geo:0,0?q=姫路市大塩町243")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }
        kitawakiButton.setOnClickListener {
            val gmmIntentUri =
                    Uri.parse("geo:0,0?q=高砂市北浜町99")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }
        nisihamaButton.setOnClickListener {
            val gmmIntentUri =
                    Uri.parse("geo:0,0?q=高砂市北浜町西浜1083-2")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }
    }
}