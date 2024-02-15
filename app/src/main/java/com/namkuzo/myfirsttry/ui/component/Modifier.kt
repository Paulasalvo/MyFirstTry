package com.namkuzo.myfirsttry.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Modifier(){
    Column (
        modifier = androidx.compose.ui.Modifier
            .background(Color.Green)
            .fillMaxHeight(0.5f)
            .fillMaxWidth()
            .border(5.dp, Color.Magenta)
            .padding(5.dp)
            .border(5.dp, Color.Blue)
            .padding(5.dp)
            .border(10.dp, Color.Red)
            .padding(18.dp)

        //    .width(600.dp)
        //    .requiredWidth(600.dp)
    ) {

        Text("Hello")
        Spacer(modifier = androidx.compose.ui.Modifier.height(50.dp))
        Text("world")
    }
}

@Preview(heightDp = 800)
@Composable
fun ModifierPreview(){
    Modifier()
}