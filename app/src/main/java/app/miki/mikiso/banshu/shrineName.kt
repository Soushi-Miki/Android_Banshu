package app.miki.mikiso.banshu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_shrine_name.*

class shrineName : AppCompatActivity() {

    val shrineSata: List<ShrineSata> = listOf(
             ShrineSata("恵美酒宮天満神社","10月8日・9日"),
        ShrineSata("浜の宮天満神社","10月8日・9日"),
        ShrineSata("正八幡神社","スポーツの日前日・前々日"),
        ShrineSata("甲八幡神社","スポーツの日前日・前々日"),
        ShrineSata("津田天満神社","スポーツの日前日・前々日"),
        ShrineSata("中島天満宮","スポーツの日前日・前々日"),
        ShrineSata("高岳神社","スポーツの日前日・前々日"),
        ShrineSata("蒲田神社","スポーツの日前日・前々日"),
        ShrineSata("稲岡神社","スポーツの日前日・前々日"),
        ShrineSata("生矢神社","スポーツの日の前日・前々日"),
        ShrineSata("才天満神社","スポーツの日の前日・前々日"),
        ShrineSata("菅原神社","スポーツの日前日・前々日"),
        ShrineSata("湊神社","10月13日・14日"),
        ShrineSata("松原八幡神社","10月14日・15日"),
        ShrineSata("大塩天満宮","10月14日・15日"),
        ShrineSata("廣畑天満宮","10月第3日曜本宮(宵宮はその前日)"),
        ShrineSata("荒川神社","10月第3日曜本宮(宵宮はその前日)") ,
        ShrineSata("英賀神社","10月17日・18日"),
        ShrineSata("魚吹八幡神社","10月21日・22日"),

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shrine_name)

        val adapter = RecyClerViewAdapter(this)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        adapter.addAll(shrineSata)
    }


}