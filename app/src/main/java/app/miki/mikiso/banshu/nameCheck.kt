package app.miki.mikiso.banshu

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_name_check.*
import java.util.*

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
            test1()
        }
        hamanomiyaAccessButton.setOnClickListener {
           test4()
        }
        matubaraAccessButton.setOnClickListener {
            test6()
        }
        oosioAccessButton.setOnClickListener {
            test8()
        }
        arakawaAccessButton.setOnClickListener {
            test0();
            //test1();
        }
        usukiAccessButton.setOnClickListener {
            test10()
        }


    }
    // 地名を入れて経路を検索
    private fun test1() {
        // 起点
        val start = "飾磨駅"


        // 目的地
        val destination = "恵美酒宮天満神社"

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
    private fun test3() {
        // 起点の緯度経度
        val src_lat = "34.799719"
        val src_ltg = "134.675378"


        // 目的地の緯度経度
        val des_lat = "34.798002"
        val des_ltg = "134.670842"
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
    // 地名を入れて経路を検索
    private fun test4() {
        // 起点
        val start = "飾磨駅"


        // 目的地
        val destination = "浜の宮天満宮"

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
    private fun test5() {
        // 起点の緯度経度
        val src_lat = "34.799719"
        val src_ltg = "134.675378"


        // 目的地の緯度経度
        val des_lat = "34.794552"
        val des_ltg = "134.665278"
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
    // 地名を入れて経路を検索
    private fun test6() {
        // 起点
        val start = "白浜の宮"


        // 目的地
        val destination = "松原八幡神社"

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
    private fun test7() {
        // 起点の緯度経度
        val src_lat = "34.786845"
        val src_ltg = "134.707283"


        // 目的地の緯度経度
        val des_lat = "34.785501"
        val des_ltg = "134.70618"
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
    // 地名を入れて経路を検索
    private fun test8() {
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
    private fun test9() {
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
    // 地名を入れて経路を検索
    private fun test0() {
        // 起点
        val start = "井ノ口"


        // 目的地
        val destination = "荒川神社"

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
        val src_lat = "35.341687"
        val src_ltg = "139.232387"


        // 目的地の緯度経度
        val des_lat = "34.823137"
        val des_ltg = "134.66188"
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
    // 地名を入れて経路を検索
    private fun test10() {
        // 起点
        val start = "山陽網干駅"


        // 目的地
        val destination = "魚吹八幡神社"

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
    private fun test11() {
        // 起点の緯度経度
        val src_lat = "34.787116"
        val src_ltg = "134.58824"


        // 目的地の緯度経度
        val des_lat = "34.796427"
        val des_ltg = "134.590343"
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
