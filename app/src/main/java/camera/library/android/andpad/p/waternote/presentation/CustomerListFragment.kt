package camera.library.android.andpad.p.waternote.presentation

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import camera.library.android.andpad.p.waternote.databinding.FragmentCustomerListBinding

class CustomerListFragment : Fragment() {

    private lateinit var binding: FragmentCustomerListBinding

    companion object {
        fun newInstance(): CustomerListFragment {
            val fragment = CustomerListFragment()
            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentCustomerListBinding.inflate(inflater, container, false)
        return binding.root
    }

}
