package app.miki.mikiso.banshu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_hamanomiya.*

class Hamanomiya : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hamanomiya)

        sukaButton
        miyaButton
        tensinButton
        oohamaButton
        kawatigosoeButton
        nisihosoeButton
        nakahosoeButton
        minatoButton
        minamihosoeButton
    }
}