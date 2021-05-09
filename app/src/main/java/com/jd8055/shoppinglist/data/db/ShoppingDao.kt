package com.jd8055.shoppinglist.data.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.jd8055.shoppinglist.data.db.enitities.ShoppingItem

@Dao
interface ShoppingDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun  upsert(item: ShoppingItem)

    @Delete
    suspend fun delete(item: ShoppingItem)

    @Query("SELECT * FROM shopping_item")
    fun getAllShoppingItem(): LiveData<List<ShoppingItem>>
}