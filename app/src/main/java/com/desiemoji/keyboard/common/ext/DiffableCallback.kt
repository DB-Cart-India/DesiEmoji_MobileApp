package com.desiemoji.keyboard.common.ext

import android.util.Log
import com.mikepenz.fastadapter.diff.DiffCallback


interface DiffableListItemType {
    fun itemIdentifier(): Any
    fun comparableContents(): List<Any>
}

class DiffableCallback<Item : UnspecifiedTypeItem> : DiffCallback<Item> {

    override fun areItemsTheSame(oldItem: Item, newItem: Item): Boolean {
        if (oldItem is DiffableListItemType && newItem is DiffableListItemType) {
            return oldItem.itemIdentifier() == newItem.itemIdentifier()
        }
        return false
    }

    override fun areContentsTheSame(oldItem: Item, newItem: Item): Boolean {
        if (oldItem is DiffableListItemType && newItem is DiffableListItemType) {
            return oldItem.comparableContents().withIndex().none {
                try {
                    it.value != newItem.comparableContents()[it.index]
                } catch (e: Exception) {
                    Log.e("areContentsTheSame", "${e.message}")
                    false
                }
            }
        }
        return false
    }

    override fun getChangePayload(
        oldItem: Item, oldItemPosition: Int,
        newItem: Item, newItemPosition: Int
    ): Any? = null

}