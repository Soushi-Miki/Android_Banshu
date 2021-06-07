package app.miki.mikiso.banshu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.Toast

class CheckMaturi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_maturi)

        val ebisuCheckBox: CheckBox = findViewById(R.id.ebisunomiyacheckbox)
        ebisuCheckBox.setOnCheckedChangeListener { _, isChecked ->
            val stateMessage = if (isChecked) "よーいやさー" else  "なんどいや"
            Toast.makeText(this, "恵美酒宮天満神社 $stateMessage", Toast.LENGTH_SHORT).show()
        }
        val hamanomiyaCheckBox: CheckBox = findViewById(R.id.hamanomiyacheckbox)
        hamanomiyaCheckBox.setOnCheckedChangeListener { _, isChecked ->
            val stateMessage = if (isChecked) "サイテバチョーサー" else  "ごうわく"
            Toast.makeText(this, "浜の宮天満神社 $stateMessage", Toast.LENGTH_SHORT).show()
        }
        val oosioCheckBox: CheckBox = findViewById(R.id.oosiocheckbox)
        oosioCheckBox.setOnCheckedChangeListener { _, isChecked ->
            val stateMessage = if (isChecked) "毛獅子の舞" else  "なり悪い"
            Toast.makeText(this, "大塩天満宮 $stateMessage", Toast.LENGTH_SHORT).show()
        }
        val matubaraCheckBox: CheckBox = findViewById(R.id.matubaracheckbox)
        matubaraCheckBox.setOnCheckedChangeListener { _, isChecked ->
            val stateMessage = if (isChecked) "灘のけんか祭り" else  "いね"
            Toast.makeText(this, "松原八幡神社 $stateMessage", Toast.LENGTH_SHORT).show()
        }
        val arakawaCheckBox: CheckBox = findViewById(R.id.arakawacheckbox)
        arakawaCheckBox.setOnCheckedChangeListener { _, isChecked ->
            val stateMessage = if (isChecked) "小芋まつり" else  "だぼ"
            Toast.makeText(this, "荒川神社 $stateMessage", Toast.LENGTH_SHORT).show()
        }
        val usukiCheckBox: CheckBox = findViewById(R.id.usukicheckbox)
        usukiCheckBox.setOnCheckedChangeListener { _, isChecked ->
            val stateMessage = if (isChecked) "提灯まつり" else  "あっかいやー"
            Toast.makeText(this, "魚吹八幡神社 $stateMessage", Toast.LENGTH_SHORT).show()
        }



    }
}