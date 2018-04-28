package camera.library.android.andpad.p.waternote.presentation.main

import android.support.annotation.DrawableRes
import android.support.v4.app.Fragment
import camera.library.android.andpad.p.waternote.presentation.CustomerListFragment
import camera.library.android.andpad.p.waternote.presentation.EarningsFragment
import camera.library.android.andpad.p.waternote.presentation.earnings.ComingHistoryFragment

enum class TabListType(val rawValue: Int) {
    CUSTOMER_LIST(0),
    EARNING(1),
    COMING_HISTORY(2);

    companion object {
        fun getType(position: Int): TabListType? {
            return when(position) {
                CUSTOMER_LIST.rawValue -> CUSTOMER_LIST
                EARNING.rawValue -> EARNING
                COMING_HISTORY.rawValue -> COMING_HISTORY
                else -> null
            }
        }

        fun getFragment(position: Int): Fragment {
            return when(position) {
                CUSTOMER_LIST.rawValue -> CustomerListFragment.newInstance()
                EARNING.rawValue -> EarningsFragment.newInstance()
                COMING_HISTORY.rawValue -> ComingHistoryFragment.newInstance()
                else -> CustomerListFragment.newInstance()
            }
        }

        fun getPageTitle(position: Int): String {
            return when(position) {
                CUSTOMER_LIST.rawValue -> "お客様一覧"
                EARNING.rawValue -> "売り上げ比率"
                COMING_HISTORY.rawValue -> "来店履歴"
                else -> ""
            }
        }

        @DrawableRes
        fun getIcon(position: Int): Int {
            return when(position) {
                CUSTOMER_LIST.rawValue ->  android.R.drawable.ic_btn_speak_now
                EARNING.rawValue -> android.R.drawable.ic_partial_secure
                COMING_HISTORY.rawValue -> android.R.drawable.ic_media_play
                else ->  0
            }
        }

        fun getPageCount(): Int {
            return 3
        }
    }
}