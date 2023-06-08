package com.desiemoji.keyboard.ui.keyboard.form.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.desiemoji.keyboard.databinding.ItemSpinnerBinding
import com.desiemoji.keyboard.common.ext.DiffableListItemType
import com.desiemoji.keyboard.model.SpinnerItemType
import com.mikepenz.fastadapter.binding.AbstractBindingItem


class SpinnerMainListItemContent(
    val data: SpinnerItemType.Content,
    val onClick: (String) -> Unit
) : AbstractBindingItem<ItemSpinnerBinding>(), DiffableListItemType {

    override val type: Int
        get() = SpinnerMainListItemContent::class.java.hashCode()

    override fun createBinding(
        inflater: LayoutInflater,
        parent: ViewGroup?,
    ): ItemSpinnerBinding {
        return ItemSpinnerBinding.inflate(inflater, parent, false)
    }

    override fun itemIdentifier(): Any {
        return hashCode()
    }

    override fun comparableContents(): List<Any> {
        return listOf(type)
    }

    override fun bindView(binding: ItemSpinnerBinding, payloads: List<Any>) {
        super.bindView(binding, payloads)
        binding.apply {

            tvText.text = data.data

            root.setOnClickListener {
                onClick(data.data)
            }

        }
    }

}