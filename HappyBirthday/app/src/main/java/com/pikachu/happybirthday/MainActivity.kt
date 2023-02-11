package com.pikachu.happybirthday

//import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pikachu.happybirthday.ui.theme.HappyBirthdayTheme
import androidx.compose.ui.unit.sp as uiUnitSp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BirthdayGreetingWithImage(message = "Happy Birthday Jeff", from = " from Julia")

                    //Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "HappyBirthday $name!")
}

@Preview(name = "MyApp",
    showBackground = true,
            showSystemUi = true)
@Composable
fun DefaultPreview() {
    HappyBirthdayTheme {
        BirthdayGreetingWithImage(message = "Happy Birthday Jeff", from = " -- from Julia")

        //Greeting("Jeff")
    }
}

@Composable
fun BirthdayGreetingWithText(message: String, from: String){
    Column() {
        Text(
            text = message,
            fontSize = 36.uiUnitSp
                    //fontSize = 36.sp,
        )
        Text(
            text = from,
            fontSize = 24.uiUnitSp
                    //fontSize = 36.uiUnitSp,

        )
    }
}
@Composable
fun BirthdayGreetingWithImage(message: String, from: String) {
    val image = painterResource(R.drawable.androidparty)
    //Step 3 create a box to overlap image and texts
   // val image1: Image =
      //  Image(painter = image, contentDescription = null)
    Box() {
    //image1
        Image(painter = image, contentDescription = null, contentScale = ContentScale.Crop)
    BirthdayGreetingWithText(message = message, from = from)
}
}