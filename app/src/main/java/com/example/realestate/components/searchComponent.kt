package com.example.realestate.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.realestate.R
import com.example.realestate.ui.theme.RealEstateTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchScreen(
    modifier: Modifier = Modifier) {
    Surface(modifier = modifier) {
        Column(modifier = modifier.fillMaxSize()){
            SearchTopBarComponent()
            BuildingDetailsComponent()
            ProceedComponent()
        }
    }
}

@Composable
fun SearchTopBarComponent(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .padding(start = 20.dp, end = 10.dp,top = 20.dp)
    ) {
        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                imageVector = Icons.Filled.ArrowBack, 
                contentDescription = stringResource(id = R.string.arrow_back_content_description),
                modifier = modifier
                    .padding(top = 5.dp)
            )
        }
        Text(
            text = stringResource(id = R.string.search),
            style = MaterialTheme.typography.headlineSmall,
            modifier = modifier.padding(start = 10.dp,top = 10.dp)
        )
        Spacer(modifier = modifier.weight(1f))
        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                painter = painterResource(id = R.drawable.upload), 
                contentDescription = stringResource(id = R.string.upload_content_description)
            )
        }
        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                painter = painterResource(id = R.drawable.heart),
                contentDescription = stringResource(id = R.string.favorites_content_description)
            )
        }
    }
}

@Composable
fun BuildingDetailsComponent(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.padding(start = 20.dp, end = 20.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.house_6_shanzu), 
            contentDescription = stringResource(id = R.string.house_6_shanzu_content_description),
            contentScale = ContentScale.Crop,
            modifier = modifier
                .size(400.dp)
        )
        Row(
            modifier = modifier.padding(top = 10.dp,end = 10.dp),
            horizontalArrangement = Arrangement.spacedBy(5.dp)
        ) {
            Text(
                text = stringResource(id = R.string.house_6_shanzu),
                style = MaterialTheme.typography.headlineLarge,
                fontWeight = FontWeight.SemiBold
            )
            Spacer(modifier = modifier.weight(1f))
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    painter = painterResource(id = R.drawable.houserating),
                    contentDescription = stringResource(id = R.string.rating),
                    modifier = modifier
                        .size(30.dp)
                )
            }
            Text(
                text = stringResource(id = R.string.rating_6_house_6),
                style = MaterialTheme.typography.headlineMedium,
                fontStyle = FontStyle.Italic,
                modifier = modifier.padding(5.dp)
            )
        }
        Text(
            text = stringResource(id = R.string.size_6_house_6_bedrooms),
            style = MaterialTheme.typography.titleSmall,
            fontWeight = FontWeight.Light
        )
        Text(
            text = stringResource(id = R.string.price_6_house_6),
            style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight.SemiBold
        )
    }
}
@Composable
fun ProceedComponent(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .padding(20.dp)
    ) {
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFFFA500),
                contentColor = Color.White
            ),
            modifier = modifier.fillMaxWidth()
        ) {
            Text(
                text = stringResource(id = R.string.book),
                style = MaterialTheme.typography.titleMedium
            )
        } 
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0XFFF3F3F3),
                contentColor = Color.Black
            ),
            modifier = modifier
                .fillMaxWidth()
                .padding(10.dp),
        ) {
            Icon(
                painter = painterResource(id = R.drawable.virtual_reality),
                contentDescription = stringResource(id = R.string.virtual_tour_content_description),
                modifier = modifier
                    .size(25.dp)
            )
            Spacer(modifier = modifier.width(10.dp))
            Text(
                text = stringResource(id = R.string.virtual_tour),
                style = MaterialTheme.typography.titleMedium
            )
        }
    }
}
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun SearchScreenPreview() {
    RealEstateTheme {
        SearchScreen()
    }
}