package app.miki.mikiso.banshu

import io.realm.RealmObject

open class Memo(
    open var title1: String = "",
    open var title2:String = "",
    open var title3:String = "",
    open var title4:String = "",
    open var title5:String = ""

) : RealmObject()