package com.example.realestate.data

import com.example.realestate.R
import com.example.realestate.model.Place

object FakePlacesDatabase {
    val placeCategory = listOf<Place>(
        Place(R.drawable.hotdeals, R.string.place_1_hot_deals),
        Place(R.drawable.beachside,R.string.place_2_beach_side),
        Place(R.drawable.countryside,R.string.place_3_countryside),
        Place(R.drawable.forestside,R.string.place_4_forest_side),
        Place(R.drawable.iconiccities,R.string.place_5_iconic_cities),
        Place(R.drawable.rural,R.string.place_6_rural)
    )
}