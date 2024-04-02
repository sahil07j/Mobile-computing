package com.example.inventory

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Int
import kotlin.String
import kotlin.jvm.JvmStatic

public data class AddItemFragmentArgs(
  public val title: String,
  public val itemId: Int = -1
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("title", this.title)
    result.putInt("item_id", this.itemId)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("title", this.title)
    result.set("item_id", this.itemId)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): AddItemFragmentArgs {
      bundle.setClassLoader(AddItemFragmentArgs::class.java.classLoader)
      val __title : String?
      if (bundle.containsKey("title")) {
        __title = bundle.getString("title")
        if (__title == null) {
          throw IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue")
      }
      val __itemId : Int
      if (bundle.containsKey("item_id")) {
        __itemId = bundle.getInt("item_id")
      } else {
        __itemId = -1
      }
      return AddItemFragmentArgs(__title, __itemId)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): AddItemFragmentArgs {
      val __title : String?
      if (savedStateHandle.contains("title")) {
        __title = savedStateHandle["title"]
        if (__title == null) {
          throw IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue")
      }
      val __itemId : Int?
      if (savedStateHandle.contains("item_id")) {
        __itemId = savedStateHandle["item_id"]
        if (__itemId == null) {
          throw IllegalArgumentException("Argument \"item_id\" of type integer does not support null values")
        }
      } else {
        __itemId = -1
      }
      return AddItemFragmentArgs(__title, __itemId)
    }
  }
}
