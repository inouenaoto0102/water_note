package camera.library.android.andpad.p.waternote.presentation.main

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class MainPagerAdapter(
        fragmentManager: FragmentManager
) : FragmentPagerAdapter(fragmentManager) {

    override fun getItem(position: Int): Fragment {
        return TabListType.getFragment(position)
    }

    override fun getCount(): Int {
        return TabListType.getPageCount()
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return TabListType.getPageTitle(position)
    }
}