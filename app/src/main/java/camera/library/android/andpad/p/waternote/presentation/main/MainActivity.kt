package camera.library.android.andpad.p.waternote.presentation.main

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import camera.library.android.andpad.p.waternote.R
import camera.library.android.andpad.p.waternote.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupView()
    }

    private fun setupView() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.pager.adapter = MainPagerAdapter(supportFragmentManager)
        binding.tabLayout.setupWithViewPager(binding.pager)
        for(position in 0..binding.tabLayout.tabCount) {
            val tab = binding.tabLayout.getTabAt(position)
            tab?.setIcon(TabListType.getIcon(position))
        }
    }
}
