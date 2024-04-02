package com.example.inventory

import android.os.Bundle
import androidx.navigation.NavDirections
import kotlin.Int
import kotlin.String

public class ItemListFragmentDirections private constructor() {
  private data class ActionItemListFragmentToItemDetailFragment(
    public val itemId: Int
  ) : NavDirections {
    public override val actionId: Int = R.id.action_itemListFragment_to_itemDetailFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putInt("item_id", this.itemId)
        return result
      }
  }

  private data class ActionItemListFragmentToAddItemFragment(
    public val title: String,
    public val itemId: Int = -1
  ) : NavDirections {
    public override val actionId: Int = R.id.action_itemListFragment_to_addItemFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("title", this.title)
        result.putInt("item_id", this.itemId)
        return result
      }
  }

  public companion object {
    public fun actionItemListFragmentToItemDetailFragment(itemId: Int): NavDirections =
        ActionItemListFragmentToItemDetailFragment(itemId)

    public fun actionItemListFragmentToAddItemFragment(title: String, itemId: Int = -1):
        NavDirections = ActionItemListFragmentToAddItemFragment(title, itemId)
  }
}
