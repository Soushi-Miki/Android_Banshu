package app.miki.mikiso.banshu

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*

class kibiRootButton : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kibi_root_button)

        test0();
        //test1();
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