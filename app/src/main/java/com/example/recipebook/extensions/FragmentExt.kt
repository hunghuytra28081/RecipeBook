package com.example.recipebook.extensions

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import java.util.*

inline fun FragmentManager.inTransaction(func: FragmentTransaction.() -> FragmentTransaction) {
    beginTransaction().func().commit()
}

fun AppCompatActivity.addFragment(id: Int, fragment: Fragment) {
    supportFragmentManager.inTransaction { add(id, fragment) }
}

fun Fragment.addFragment(fragment: Fragment, id: Int) {
    fragmentManager?.inTransaction {
        add(id, fragment)
        addToBackStack(null)
    }
}

fun Fragment.replaceFragment(fragment: Fragment, id: Int) {
    fragmentManager?.inTransaction {
        replace(id, fragment)
        addToBackStack(null)
    }
}

fun Fragment.removeFragment(fragment: Fragment) {
    fragmentManager?.inTransaction { remove(fragment) }
}

fun Fragment.upperString(id: Int) = getText(id).toString().toUpperCase(Locale.getDefault())
