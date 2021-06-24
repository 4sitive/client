package org.positive.daymotion.presentation.home

import android.os.Bundle
import android.view.View
import dagger.hilt.android.AndroidEntryPoint
import org.positive.daymotion.R
import org.positive.daymotion.databinding.FragmentHomeTabBinding
import org.positive.daymotion.presentation.base.BaseFragment
import org.positive.daymotion.presentation.base.util.viewModelOf
import org.positive.daymotion.presentation.common.ScrollableFragment

@AndroidEntryPoint
class HomeTabFragment :
    BaseFragment<FragmentHomeTabBinding>(R.layout.fragment_home_tab), ScrollableFragment {

    private val viewModel by viewModelOf<HomeTabViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewModel = viewModel
    }

    override fun scrollToTop() {
        binding.scrollView.smoothScrollTo(0, binding.profileLayout.top)
    }
}
