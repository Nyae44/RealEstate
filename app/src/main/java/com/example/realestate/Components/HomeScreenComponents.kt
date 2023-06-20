@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.realestate.Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.realestate.R
import com.example.realestate.ui.theme.RealEstateTheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
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

@Composable
fun SearchComponent(modifier: Modifier = Modifier) {
    var searchState by remember { mutableStateOf("") }
    TextField(
        value = searchState,
        onValueChange = {it},
        placeholder = {
            Row(
                modifier = modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.maps) ,
                    contentDescription = stringResource(id = R.string.maps_content_description)
                )
            }
        }
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    RealEstateTheme {
        HomeScreen()
    }
}