package com.jd8055.shoppinglist.ui.shoppinglist

import androidx.lifecycle.ViewModel
import com.jd8055.shoppinglist.data.db.enitities.ShoppingItem
import com.jd8055.shoppinglist.data.repositories.ShoppingRepositories
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ShoppingViewModel(
    private val repositories: ShoppingRepositories
): ViewModel() {

    fun upsert(item: ShoppingItem) = CoroutineScope(Dispatchers.Main).launch {
        repositories.upsert(item)
    }

    fun delete(item: ShoppingItem) = CoroutineScope(Dispatchers.Main).launch {
        repositories.delete(item)
    }

    fun getAllShoppingItem() = repositories.getAllShoppingItems()
}