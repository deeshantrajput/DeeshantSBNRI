package com.deeshant.deeshantsbnri.ui.dummies

import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.deeshant.deeshantsbnri.R
import com.deeshant.deeshantsbnri.data.local.db.entity.DummyResponse
import com.deeshant.deeshantsbnri.di.component.ViewHolderComponent
import com.deeshant.deeshantsbnri.ui.base.BaseItemViewHolder
import kotlinx.android.synthetic.main.item_view_dummies.view.*

class DummyItemViewHolder(parent: ViewGroup) :
    BaseItemViewHolder<DummyResponse, DummyItemViewModel>(R.layout.item_view_dummies, parent) {

    override fun injectDependencies(viewHolderComponent: ViewHolderComponent) {
        viewHolderComponent.inject(this)
    }

    override fun setupObservers() {
        super.setupObservers()

        viewModel.lice_key.observe(this, Observer {
            itemView.tv_license_key.text = it
        })

        viewModel.lice_name.observe(this, Observer {
            itemView.tv_license_name.text = it
        })

        viewModel.lice_spdx.observe(this, Observer {
            itemView.tv_license_spdx.text = it
        })

        viewModel.lice_url.observe(this, Observer {
            itemView.tv_license_url.text = it
        })

        viewModel.lice_node.observe(this, Observer {
            itemView.tv_license_nodeid.text = it
        })

        viewModel.perm_admin.observe(this, Observer {
            itemView.tv_perm_admin.text = "Permissions:\nAdmin: $it"
        })

        viewModel.perm_pull.observe(this, Observer {
            itemView.tv_perm_pull.text = "Pull: $it"
        })

        viewModel.perm_push.observe(this, Observer {
            itemView.tv_perm_push.text = "Push: $it"
        })

        viewModel.name.observe(this, Observer {
            itemView.tv_name.text = it
        })

        viewModel.desc.observe(this, Observer {
            itemView.tv_desc.text = it
        })

        viewModel.open_issues.observe(this, Observer {
            itemView.tv_issues.text = it.toString()
        })
    }

    override fun setupView(view: View) {
        view.setOnClickListener {
            viewModel.onItemClick(adapterPosition)
        }
    }
}