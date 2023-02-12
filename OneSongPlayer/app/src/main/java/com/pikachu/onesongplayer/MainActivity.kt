package com.pikachu.onesongplayer

import android.content.Context
import android.media.MediaPlayer
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import android.media.Image as Image1

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PlayAudio(this)
        }
    }
}
@Preview(showBackground = true)
@Composable
fun PlayAudio(context: Context){
    val mp: MediaPlayer = MediaPlayer.create(context, R.raw.play_audio)

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = " ",
            modifier = Modifier
                .height(160.dp)
                .width(160.dp)
                .background(Color.Black)
        )
        
        Row() {
            IconButton(onClick = {mp.start()}, modifier = Modifier.size(35.dp)) {
                Icon(painter = painterResource(id = R.drawable.ic_play), contentDescription = " ")
            }

            IconButton(onClick = {mp.pause()}, modifier = Modifier.size(35.dp)) {
                Icon(painter = painterResource(id = R.drawable.ic_pause), contentDescription = " ")
            }
        }
    }
}

