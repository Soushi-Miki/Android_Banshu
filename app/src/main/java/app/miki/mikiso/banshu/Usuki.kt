package app.miki.mikiso.banshu

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_usuki.*
import java.util.*

class Usuki : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_usuki)

        kibiRootButton.setOnClickListener {
          test0()
        }

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
    // 地名を入れて経路を検索
    private fun test0() {
        // 起点
        val start = "吉美屋台蔵"

        val point1 = "吉美八幡神社"
        val point2 = "姫路市 大平橋"
        val point3 = "魚吹八幡神社 渡神殿"
        val point4 = "魚吹八幡神社"
        val point5 = "姫路市 大平橋"

        // 目的地
        val destination = "吉美屋台蔵"

        // 移動手段：電車:r, 車:d, 歩き:w
        val dir = arrayOf("r", "d", "w")
        val intent = Intent()
        intent.action = Intent.ACTION_VIEW
        intent.setClassName("com.google.android.apps.maps",
                "com.google.android.maps.MapsActivity")

        // 出発地, 経由地,目的地, 交通手段
        val str: String = java.lang.String.format(
                Locale.JAPAN,
                "https://www.google.com/maps/dir/吉美屋台蔵/吉美八幡神社/姫路市 大平橋/魚吹八幡神社 渡神殿/魚吹八幡神社/姫路市 大平橋/吉美屋台蔵",
                start, point1,point2,point3,point4,point5,destination, dir[1])
        intent.data = Uri.parse(str)
        startActivity(intent)
    }

    // 緯度経度を入れて経路を検索
    private fun test2() {
        // 起点の緯度経度
        val src_lat = "34.788027"
        val src_ltg = "134.60091"

        // 経由地の緯度経度
        val point1_lat = "34.786282"
        val point1_ltg = "134.601321"

        val point2_lat = "34.791847"
        val point2_ltg = "134.598863"

        val point3_lat = "34.794677"
        val point3_ltg = "134.584888"

        val point4_lat = "34.796427"
        val point4_ltg = "134.590343"

        val point5_lat = "34.791847"
        val point5_ltg = "134.598863"


        // 目的地の緯度経度
        val des_lat = "34.788027"
        val des_ltg = "134.60091"
        val intent = Intent()
        intent.action = Intent.ACTION_VIEW
        intent.setClassName("com.google.android.apps.maps",
                "com.google.android.maps.MapsActivity")


        // 起点の緯度,経度, 目的地の緯度,経度
        val str: String = java.lang.String.format(
                Locale.JAPAN,
                "http://maps.google.com/吉美屋台蔵/吉美八幡神社/姫路市 大平橋/魚吹八幡神社 渡神殿/魚吹八幡神社/姫路市 大平橋/吉美屋台蔵",
                src_lat, src_ltg,point1_lat,point1_ltg,point2_lat,point2_ltg,point3_lat,point3_ltg,point4_lat,point4_ltg,point5_lat,point5_ltg,des_lat, des_ltg)
        intent.data = Uri.parse(str)
        startActivity(intent)
    }
}