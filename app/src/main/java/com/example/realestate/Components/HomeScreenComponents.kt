@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.realestate.Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.realestate.R
import com.example.realestate.data.FakePlacesDatabase.placeCategory
import com.example.realestate.model.Place
import com.example.realestate.ui.theme.RealEstateTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Surface(modifier = modifier) {
        Scaffold(
            topBar = { TopBarComponents()},
            bottomBar = { BottomBarComponents()},
            content = {
              Column(modifier = modifier.padding(it)) {
                  SearchComponent()
                  CategoriesComponentList()
              }
            },
            )
    }
}

@Composable
fun TopBarComponents(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(start = 10.dp, top = 10.dp)
    ) {
        IconButton(onClick = { /*TODO*/ }) {
            Image(
                painter = painterResource(id = R.drawable.nyae),
                contentDescription = stringResource(id = R.string.profile_picture_content_description),
                contentScale = ContentScale.Crop,
                modifier = modifier
                    .clip(CircleShape)
                    .size(72.dp)
            )
        }
        Spacer(modifier = modifier.width(20.dp))
        Text(
            text = stringResource(id = R.string.hello_nyae),
            style = MaterialTheme.typography.titleSmall,
            modifier = modifier.padding(top = 10.dp)
        )
        Spacer(modifier = modifier.weight(1f))
        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                painter = painterResource(id = R.drawable.bell), 
                contentDescription = stringResource(id = R.string.notifications_content_description)
            )
        }
    }
}

@Composable
fun BottomBarComponents(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(start = 60.dp, end = 40.dp, bottom = 20.dp),
        horizontalArrangement = Arrangement.spacedBy(20.dp),
    ) {
        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                painter = painterResource(id = R.drawable.search),
                contentDescription = stringResource(id = R.string.search_content_description)
            )
        }
        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                painter = painterResource(id = R.drawable.heart),
                contentDescription = stringResource(id = R.string.favorites_content_description )
            )
        }
        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                painter = painterResource(id = R.drawable.messagecircle),
                contentDescription = stringResource(id = R.string.message_content_description)
            )
        }
        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                painter = painterResource(id = R.drawable.shettingsh),
                contentDescription = stringResource(id = R.string.settings_content_description)
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchComponent(modifier: Modifier = Modifier) {
    var textState by remember { mutableStateOf("") }
    Box(
        modifier = modifier
            .paddingFromBaseline(top = 40.dp)
            .background(color = Color(0xF8F8FF))
            .clip(shape = RoundedCornerShape(15.dp))
    ){
       Row(
           modifier = modifier
               .fillMaxWidth()
               .padding(start = 10.dp, end = 20.dp, top = 20.dp)
               .background(Color.White),
           horizontalArrangement = Arrangement.Center
       ) {
           OutlinedTextField(
               value = textState,
               onValueChange ={it},
               trailingIcon = {

                   IconButton(onClick = { /*TODO*/ }) {
                       Icon(
                           painter = painterResource(id = R.drawable.adjustments),
                           contentDescription = stringResource(id = R.string.adjustments_content_description)
                       )
                   }
               },
               placeholder = {
                   Text(
                       text = stringResource(id = R.string.where_do_you_want_to_go)
                   )
               },
               leadingIcon = {
                   IconButton(onClick = { /*TODO*/ }) {
                       Icon(
                           painter = painterResource(id = R.drawable.maps),
                           contentDescription = stringResource(id = R.string.maps_content_description)
                       )
                   }
               }
           )
       }
    }
}

@Composable
fun CategoriesComponent(place: Place,modifier: Modifier = Modifier) {
   Box(modifier = modifier){
       Column(modifier = modifier.padding(top = 20.dp, bottom = 10.dp, end = 20.dp)) {
           Image(
               painter = painterResource(id = place.image),
               contentDescription = null,
               contentScale = ContentScale.Crop,
               modifier = modifier
                   .size(60.dp)
                   .shadow(elevation = 10.dp, shape = RoundedCornerShape(10.dp))
           )
           Spacer(modifier = modifier.height(10.dp))
           Text(
               text = stringResource(id = place.name),
               style = MaterialTheme.typography.titleSmall,
               fontWeight = FontWeight.W600,
               fontStyle = FontStyle.Italic

           )
       }
   }
}

@Composable
fun CategoriesComponentList(modifier: Modifier = Modifier) {
    LazyRow(contentPadding = PaddingValues(horizontal = 30.dp)){
        items(placeCategory){category->
            CategoriesComponent(place = category)
        }
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    RealEstateTheme {
        HomeScreen()
    }
}