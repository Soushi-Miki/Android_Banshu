package app.miki.mikiso.banshu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ebisu.*
import kotlinx.android.synthetic.main.activity_matubara.*

class Matubara : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_matubara)

        higasiyamaButton
        kibaButton
        matubaraButton1
        yakaButton
        megaButton
        usazakiButton
        nakamuraButton
    }
}