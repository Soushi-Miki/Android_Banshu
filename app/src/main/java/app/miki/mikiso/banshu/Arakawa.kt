package app.miki.mikiso.banshu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_arakawa.*

class Arakawa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_arakawa)
        tyounotuboButton
        tyuuziButton
        tamadeButton
        okadaButton
        inokutiButton
        saisyouButton
    }
}