package com.jd8055.shoppinglist

import android.app.Application
import com.jd8055.shoppinglist.data.db.ShoppingDatabase
import com.jd8055.shoppinglist.data.repositories.ShoppingRepositories
import com.jd8055.shoppinglist.ui.shoppinglist.ShoppingViewModelFactory
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.androidXModule
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider
import org.kodein.di.generic.singleton

class ShoppingApplication: Application(), KodeinAware {
    override val kodein: Kodein = Kodein.lazy {
        import(androidXModule(this@ShoppingApplication))
        bind() from singleton {ShoppingDatabase(instance())}
        bind() from singleton { ShoppingRepositories(instance()) }
        bind() from provider {
            ShoppingViewModelFactory(instance())
        }
    }
}