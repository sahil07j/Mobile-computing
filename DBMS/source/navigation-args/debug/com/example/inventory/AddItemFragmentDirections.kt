package com.example.inventory

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

public class AddItemFragmentDirections private constructor() {
  public companion object {
    public fun actionAddItemFragmentToItemListFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_addItemFragment_to_itemListFragment)
  }
}
