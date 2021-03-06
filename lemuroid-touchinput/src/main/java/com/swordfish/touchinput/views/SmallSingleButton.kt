package com.swordfish.touchinput.views

import android.content.Context
import android.util.AttributeSet
import com.swordfish.touchinput.controller.R
import com.swordfish.touchinput.views.base.BaseSingleButton

class SmallSingleButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : BaseSingleButton(context, attrs, defStyleAttr) {

    init {
        setBackgroundResource(R.drawable.small_button_selector)
    }

    override fun getSuggestedButtonWidth(): Int {
        return R.dimen.size_small_button_width
    }

    override fun getSuggestedButtonHeight(): Int {
        return R.dimen.size_small_button_height
    }
}
