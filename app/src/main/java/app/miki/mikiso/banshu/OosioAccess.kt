package app.miki.mikiso.banshu

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*

class OosioAccess : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oosio_access)

        test0();
        //test1();
    }
    // 地名を入れて経路を検索
    private fun test0() {
        // 起点
        val start = "大塩駅"


        // 目的地
        val destination = "大塩天満宮"

        // 移動手段：電車:r, 車:d, 歩き:w
        val dir = arrayOf("r", "d", "w")
        val intent = Intent()
        intent.action = Intent.ACTION_VIEW
        intent.setClassName("com.google.android.apps.maps",
                "com.google.android.maps.MapsActivity")

        // 出発地, 経由地,目的地, 交通手段
        val str: String = java.lang.String.format(
                Locale.JAPAN,
                "http://maps.google.com/maps?saddr=%s&daddr=%s&dirflg=%s",
                start, destination, dir[1])
        intent.data = Uri.parse(str)
        startActivity(intent)
    }

    // 緯度経度を入れて経路を検索
    private fun test2() {
        // 起点の緯度経度
        val src_lat = "34.779274"
        val src_ltg = "134.757829"


        // 目的地の緯度経度
        val des_lat = "34.778162 "
        val des_ltg = "134.757365 "
        val intent = Intent()
        intent.action = Intent.ACTION_VIEW
        intent.setClassName("com.google.android.apps.maps",
                "com.google.android.maps.MapsActivity")


        // 起点の緯度,経度, 目的地の緯度,経度
        val str: String = java.lang.String.format(
                Locale.JAPAN,
                "http://maps.google.com/maps?saddr=%s,%s&daddr=%s%s",
                src_lat, src_ltg,des_lat, des_ltg)
        intent.data = Uri.parse(str)
        startActivity(intent)
    }
}