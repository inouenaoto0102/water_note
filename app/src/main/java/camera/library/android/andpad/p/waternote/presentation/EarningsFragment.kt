package camera.library.android.andpad.p.waternote.presentation

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import camera.library.android.andpad.p.waternote.databinding.FragmentEarningsBinding

class EarningsFragment : Fragment() {

    private lateinit var binding: FragmentEarningsBinding

    companion object {
        fun newInstance(): EarningsFragment {
            val fragment = EarningsFragment()
            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentEarningsBinding.inflate(inflater, container, false)
        return binding.root

    }
}
