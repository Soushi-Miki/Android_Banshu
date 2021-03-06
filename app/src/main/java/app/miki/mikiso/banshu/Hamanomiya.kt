package app.miki.mikiso.banshu

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_hamanomiya.*

class Hamanomiya : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hamanomiya)

        sukaButton.setOnClickListener {
            val gmmIntentUri =
                    Uri.parse("geo:0,0?q=姫路市飾磨区須加148 ")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }
        miyaButton.setOnClickListener {
            val gmmIntentUri =
                    Uri.parse("geo:0,0?q=姫路市飾磨区155-2 宮町屋台蔵 ")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }
        tensinButton.setOnClickListener {
            val gmmIntentUri =
                    Uri.parse("geo:0,0?q=姫路市飾磨区天神141 ")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }
        oohamaButton.setOnClickListener {
            val gmmIntentUri =
                    Uri.parse("geo:0,0?q=姫路市飾磨区大浜51-3 ")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }
        kawatigosoeButton.setOnClickListener {
            val gmmIntentUri =
                    Uri.parse("geo:0,0?q=姫路市飾磨区細江660 川内細江屋台蔵 ")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }
        nisihosoeButton.setOnClickListener {
            val gmmIntentUri =
                    Uri.parse("geo:0,0?q=姫路市飾磨区細江709　西細江屋台蔵 ")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }
        nakahosoeButton.setOnClickListener {
            val gmmIntentUri =
                    Uri.parse("geo:0,0?q=姫路市飾磨区細江841-1 中細江屋台蔵")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }
        minatoButton.setOnClickListener {
            val gmmIntentUri =
                    Uri.parse("geo:0,0?q=姫路市飾磨区須加300-8　港屋台蔵 ")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }
        minamihosoeButton.setOnClickListener {
            val gmmIntentUri =
                    Uri.parse("geo:0,0?q=姫路市飾磨区細江963　南細江屋台蔵")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }

        hamanomiyaMidokoro1Button.setOnClickListener {
            val gmmIntentUri =
                    Uri.parse("geo:0,0?q=姫路市飾磨区須加40 浜の宮天満宮")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }
        hamanomiyaMidokoro2Button.setOnClickListener {
            val gmmIntentUri =
                    Uri.parse("geo:0,0?q=姫路市飾磨区須加40 浜の宮天満宮")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }
        hamanomiyaMidokoro3Button.setOnClickListener {
            val gmmIntentUri =
                    Uri.parse("geo:0,0?q=姫路市飾磨区16-27 宮公園")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }
    }
}