package com.example.realestate.data

import com.example.realestate.R
import com.example.realestate.model.House
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
    val availableBuildings = listOf<House>(
        House(
            R.drawable.house_1_nyali,
            R.string.size_1_house_1_two_bedrooms,
            R.string.house_1_nyali,R.string.price_1_house_1,
        ),
        House(
            R.drawable.house_2_bamburi,
            R.string.size_2_house_2_four_bedrooms,
            R.string.house_2_bamburi,R.string.price_2_house_2,
        ),
        House(
            R.drawable.house_3_vipingo,
            R.string.size_3_house_3_bedrooms,
            R.string.house_3_vipingo,R.string.price_3_house_3,

        ),
        House(
            R.drawable.house_4_kizingo,
            R.string.size_4_house__4_bedrooms,
            R.string.house_4_kizingo,R.string.price_4_house_4,
        ),
        House(
            R.drawable.house_5_malindi,
            R.string.size_5_house_5_bedrooms,
            R.string.house_5_malindi,R.string.price_5_house_5,
        ),
        House(
            R.drawable.house_6_shanzu,
            R.string.size_6_house_6_bedrooms,
            R.string.house_6_shanzu,R.string.price_6_house_6,
        )
    )
}