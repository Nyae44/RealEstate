package com.example.realestate.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class House(
  @DrawableRes  val image:Int,
   @StringRes val size:Int,
  @StringRes  val name:Int,
  @StringRes  val price:Int,
)
