package com.example.inventory

import android.os.Bundle
import androidx.navigation.NavDirections
import kotlin.Int
import kotlin.String

public class ItemDetailFragmentDirections private constructor() {
  private data class ActionItemDetailFragmentToAddItemFragment(
    public val title: String,
    public val itemId: Int = -1
  ) : NavDirections {
    public override val actionId: Int = R.id.action_itemDetailFragment_to_addItemFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("title", this.title)
        result.putInt("item_id", this.itemId)
        return result
      }
  }

  public companion object {
    public fun actionItemDetailFragmentToAddItemFragment(title: String, itemId: Int = -1):
        NavDirections = ActionItemDetailFragmentToAddItemFragment(title, itemId)
  }
}
