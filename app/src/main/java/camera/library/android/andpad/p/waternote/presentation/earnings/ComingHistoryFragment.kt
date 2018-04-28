package camera.library.android.andpad.p.waternote.presentation.earnings

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import camera.library.android.andpad.p.waternote.databinding.FragmentComingHistoryBinding

class ComingHistoryFragment : Fragment() {
    private lateinit var binding: FragmentComingHistoryBinding

    companion object {
        fun newInstance(): ComingHistoryFragment {
            val fragment = ComingHistoryFragment()
            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentComingHistoryBinding.inflate(inflater, container, false)
        return binding.root
    }
}
