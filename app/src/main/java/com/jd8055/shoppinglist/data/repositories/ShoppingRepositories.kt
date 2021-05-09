package com.jd8055.shoppinglist.data.repositories

import com.jd8055.shoppinglist.data.db.ShoppingDatabase
import com.jd8055.shoppinglist.data.db.enitities.ShoppingItem

class ShoppingRepositories(
    private val db: ShoppingDatabase
) {
    suspend fun upsert(item:ShoppingItem) = db.getShoppingDao().upsert(item)

    suspend fun delete(item: ShoppingItem) = db.getShoppingDao().delete(item)

    fun getAllShoppingItems() = db.getShoppingDao().getAllShoppingItem()
}