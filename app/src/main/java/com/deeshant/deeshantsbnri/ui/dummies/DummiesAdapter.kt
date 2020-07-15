package com.deeshant.deeshantsbnri.ui.dummies

import android.view.ViewGroup
import androidx.lifecycle.Lifecycle
import com.deeshant.deeshantsbnri.data.local.db.entity.DummyResponse
import com.deeshant.deeshantsbnri.ui.base.BaseAdapter

class DummiesAdapter(
    parentLifecycle: Lifecycle,
    private val dummies: ArrayList<DummyResponse>
) : BaseAdapter<DummyResponse, DummyItemViewHolder>(parentLifecycle, dummies) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = DummyItemViewHolder(parent)

}