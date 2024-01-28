package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.DividerDefaults.color
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SnackbarDefaults.color
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.app.ComponentActivity
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme

class MainActivity : androidx.core.app.ComponentActivity() {
    fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AppBody()
                }
            }
        }
    }
}

@Composable
fun AppBody(modifier: Modifier = Modifier){

    Column(
        Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CenterElement()
        ContactInfo(

        )

    }
}
@Composable
fun CenterElement(modifier: Modifier = Modifier){
    val image = painterResource(R.drawable.android_logo)
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(top = 300.dp)

    ) {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Fit,
            alpha = 0.5f,
            modifier = Modifier
                .height(100.dp)
                .width(100.dp)
                .padding(0.dp)
        )
        Text(
            text = "Gaurav Kumar Thakur",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp


            )
        Text(
            text = "Android Developer",
            color = Color(0xFF3DDC84)

            )
    }
}
@Composable
fun ContactInfo(modifier: Modifier = Modifier){
    Column(
        modifier = Modifier
            .padding(top = 300.dp)

    ){
        Text(
            text = "+916203970226\n@androiddev\ngk22719@gmail.com",
                    color = Color(0xFF328256)
        )
    }

}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardAppTheme {
        AppBody()
    }
}