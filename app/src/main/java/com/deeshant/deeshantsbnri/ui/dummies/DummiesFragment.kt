package com.deeshant.deeshantsbnri.ui.dummies

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.deeshant.deeshantsbnri.R
import com.deeshant.deeshantsbnri.di.component.FragmentComponent
import com.deeshant.deeshantsbnri.ui.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_dummies.*
import javax.inject.Inject


class DummiesFragment : BaseFragment<DummiesViewModel>() {

    companion object {

        const val TAG = "DummiesFragment"

        fun newInstance(): DummiesFragment {
            val args = Bundle()
            val fragment = DummiesFragment()
            fragment.arguments = args
            return fragment
        }
    }

    @Inject
    lateinit var linearLayoutManager: LinearLayoutManager

    @Inject
    lateinit var dummiesAdapter: DummiesAdapter

    var isLastPage: Boolean = false
    var isLoading: Boolean = false
    var page:Int = 1

    override fun provideLayoutId(): Int = R.layout.fragment_dummies

    override fun injectDependencies(fragmentComponent: FragmentComponent) {
        fragmentComponent.inject(this)
    }

    override fun setupObservers() {
        viewModel.getDummies().observe(this, Observer {
            it?.run {
                dummiesAdapter.appendData(this)
            }
        })
    }

    override fun setupView(view: View) {
        rv_dummy.layoutManager = linearLayoutManager
        rv_dummy.adapter = dummiesAdapter

        rv_dummy.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                super.onScrollStateChanged(recyclerView, newState)
                if (!recyclerView.canScrollVertically(1)) {
                    if(page<viewModel.last_page) {
                        page++
                        viewModel.getData()
                    }
                }
            }
        })
    }

}