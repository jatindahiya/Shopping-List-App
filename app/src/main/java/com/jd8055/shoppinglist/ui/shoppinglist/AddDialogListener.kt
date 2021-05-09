package com.jd8055.shoppinglist.ui.shoppinglist

import com.jd8055.shoppinglist.data.db.enitities.ShoppingItem

interface AddDialogListener {
    fun onAddButton(item: ShoppingItem)
}