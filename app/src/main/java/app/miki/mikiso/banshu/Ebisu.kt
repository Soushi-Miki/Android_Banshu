package app.miki.mikiso.banshu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ebisu.*

class Ebisu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ebisu)

        sakaematiButton
        higasihoriButton
        tokuraButton
        gokouButton
        tamatiButton
        simizuButton
        kitahosoeButton
        koseButton
    }
}