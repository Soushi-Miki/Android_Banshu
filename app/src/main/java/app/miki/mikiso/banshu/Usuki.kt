package app.miki.mikiso.banshu

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_usuki.*

class Usuki : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_usuki)

        kibiButton.setOnClickListener {
            val gmmIntentUri =
                    Uri.parse("geo:0,0?q=姫路市大津区吉美７６７")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }
        hiramatuButton.setOnClickListener {
            val gmmIntentUri =
                    Uri.parse("geo:0,0?q=姫路市大津区平松131")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }
        nagamatuButton.setOnClickListener {
            val gmmIntentUri =
                    Uri.parse("geo:0,0?q=")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }
        ooesimaButton.setOnClickListener {
            val gmmIntentUri =
                    Uri.parse("geo:0,0?q=姫路市網干区大江島522")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }
        tenmaButton.setOnClickListener {
            val gmmIntentUri =
                    Uri.parse("geo:0,0?q=姫路市大津区1134")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }
        nisidoiButton.setOnClickListener {
            val gmmIntentUri =
                    Uri.parse("geo:0,0?q=姫路市大津区150")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }
        yoroButton.setOnClickListener {
            val gmmIntentUri =
                    Uri.parse("geo:0,0?q=姫路市勝原区 丁屋台蔵")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }
        taiButton.setOnClickListener {
            val gmmIntentUri =
                    Uri.parse("geo:0,0?q=姫路市網干区200")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }
        miyataButton.setOnClickListener {
            val gmmIntentUri =
                    Uri.parse("geo:0,0?q=姫路市勝原区 宮田屋台蔵")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }
        kumamiButton.setOnClickListener {
            val gmmIntentUri =
                    Uri.parse("geo:0,0?q=姫路市勝原区 熊見屋台蔵")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }
        sakadeButton.setOnClickListener {
            val gmmIntentUri =
                    Uri.parse("geo:0,0?q=姫路市網干区180")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }
        tuitibakitaButton.setOnClickListener {
            val gmmIntentUri =
                    Uri.parse("geo:0,0?q=姫路市網干区 湯市場北屋台蔵")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }
        tuitibaButton.setOnClickListener {
            val gmmIntentUri =
                    Uri.parse("geo:0,0?q=姫路市網干区津市場５１５")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }
        sakanoueButton.setOnClickListener {
            val gmmIntentUri =
                    Uri.parse("geo:0,0?q=姫路氏網干区373-6")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }
        itoiButton.setOnClickListener {
            val gmmIntentUri =
                    Uri.parse("geo:0,0?q=兵庫県揖保郡太子町糸井 糸井屋台蔵")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }
        takataButton.setOnClickListener {
            val gmmIntentUri =
                    Uri.parse("geo:0,0?q=姫路市網干区 高田屋台蔵")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }
        wakuButton.setOnClickListener {
            val gmmIntentUri =
                    Uri.parse("geo:0,0?q=姫路市網干区 和久屋台蔵")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }
        hukuiButton.setOnClickListener {
            val gmmIntentUri =
                    Uri.parse("geo:0,0?q=姫路市網干区高田 福井屋台蔵")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }
        kaitiButton
        okihamaButton
        sinzaikeButton
        yokohamaButton
        asahidaniButton.setOnClickListener {
            val gmmIntentUri =
                    Uri.parse("geo:0,0?q=姫路市勝原区405")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }


    }
}