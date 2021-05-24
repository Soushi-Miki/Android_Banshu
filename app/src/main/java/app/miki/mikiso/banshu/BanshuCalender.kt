package app.miki.mikiso.banshu

import android.icu.util.Calendar
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CalendarView
import android.widget.Toast
import androidx.annotation.RequiresApi
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.util.*

class BanshuCalender : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_banshu_calender)


        val format = SimpleDateFormat("2022/10/22", Locale.JAPAN)

        val calendarView = findViewById<CalendarView>(R.id.calendar)

        // 初期選択日を取得
        val defaultDate = calendarView.date
        println(format.format(defaultDate))

        }
    }


