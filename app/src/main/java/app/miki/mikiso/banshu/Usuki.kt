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
                    Uri.parse("geo:0,0?q=姫路市大津区平松131　平松屋台蔵")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }
        nagamatuButton.setOnClickListener {
            val gmmIntentUri =
                    Uri.parse("geo:0,0?q=姫路市大津区長松 長松屋台蔵")
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
                    Uri.parse("geo:0,0?q=天満屋台蔵")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }
        nisidoiButton.setOnClickListener {
            val gmmIntentUri =
                    Uri.parse("geo:0,0?q=西土井屋台蔵")
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
                    Uri.parse("geo:0,0?q=姫路市網干区180 坂出屋台蔵")
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
        kaitiButton.setOnClickListener {
            val gmmIntentUri =
                    Uri.parse("geo:0,0?q=姫路市網干区垣内本町518 垣内檀尻蔵")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)

        }
        okihamaButton.setOnClickListener {
           val gmmIntentUri =
                   Uri.parse("geo:0,0?q=姫路市網干区興浜1-2 興浜檀尻蔵")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
       }
        sinzaikeButton.setOnClickListener {
            val gmmIntentUri =
                    Uri.parse("geo:0,0?q=姫路市網干区363 新在家檀尻蔵")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }
        yokohamaButton.setOnClickListener {
            val gmmIntentUri =
                    Uri.parse("geo:0,0?q=姫路市網干区余子浜30-7 余子浜檀尻蔵")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }
        asahidaniButton.setOnClickListener {
            val gmmIntentUri =
                    Uri.parse("geo:0,0?q=姫路市勝原区405　朝日谷獅子檀尻")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }

        usukiMidokoro1Button.setOnClickListener {
            val gmmIntentUri =
                    Uri.parse("geo:0,0?q=勝原小学校")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }

        usukiMidokoro2Button.setOnClickListener {
            val gmmIntentUri =
                    Uri.parse("geo:0,0?q=姫路市勝原区宮田 宮田大橋")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }
        usukiMidokoro3Button.setOnClickListener {
            val gmmIntentUri =
                    Uri.parse("geo:0,0?q=姫路市網干区和久 網干駅")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }
        hamanomiyaMidokoro2Button.setOnClickListener {
            val gmmIntentUri =
                    Uri.parse("geo:0,0?q=姫路市網干区宮内193　魚吹八幡神社")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }
        hamanomiyaMidokoro3Button.setOnClickListener {
            val gmmIntentUri =
                    Uri.parse("geo:0,0?q=姫路市 大平橋")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }
        oosioMidokoro1Button.setOnClickListener {
            val gmmIntentUri =
                    Uri.parse("geo:0,0?q=姫路市網干区津市場640-1　渡神殿")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }
        matubaraMidokoro2Button.setOnClickListener {
            val gmmIntentUri =
                    Uri.parse("geo:0,0?q=姫路市網干区宮内193　魚吹八幡神社")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }



    }
}