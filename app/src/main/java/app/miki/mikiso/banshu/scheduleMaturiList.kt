package app.miki.mikiso.banshu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import io.realm.Realm
import kotlinx.android.synthetic.main.activity_schedule_maturi_list.*

class scheduleMaturiList : AppCompatActivity() {

    val realm: Realm = Realm.getDefaultInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_schedule_maturi_list)


        val memo: Memo? = read()

        if (memo !=null){
            maturiScheduleList1.setText(memo.title1)
            maturiScheduleList2.setText(memo.title2)
            maturiScheduleList3.setText(memo.title3)
            maturiScheduleList4.setText(memo.title4)
            maturiScheduleList5.setText(memo.title5)
        }
        saveButon.setOnClickListener {
            val title1: String = maturiScheduleList1.text.toString()
            val title2: String = maturiScheduleList2.text.toString()
            val title3: String = maturiScheduleList3.text.toString()
            val title4: String = maturiScheduleList4.text.toString()
            val title5: String = maturiScheduleList5.text.toString()

            save(title1,title2,title3,title4,title5)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        realm.close()
    }

    fun read():Memo? {
        return realm.where(Memo::class.java).findFirst()
    }
    fun save(title1: String, title2: String, title3: String, title4: String, title5: String){
        //保存する処理
        val memo:Memo? = read() //すでに保存されているメモを取得

        //この中でデータベースの操作をする
        realm.executeTransaction{
            if (memo !=null) {
                //メモの更新
                memo.title1 = title1
                memo.title2 = title2
                memo.title3 = title3
                memo.title4 = title4
                memo.title5 = title5
            }else{
                //メモの新規作成
                val newMemo : Memo = it.createObject(Memo::class.java)
                newMemo.title1 = title1
                newMemo.title2 = title2
                newMemo.title3 = title3
                newMemo.title4 = title4
                newMemo.title5 = title5

            }
            Snackbar.make(container,"保存しました",Snackbar.LENGTH_SHORT).show()
        }
    }
}
