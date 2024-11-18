package com.example.navigationdemo

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SecondScreen (name: String, age: String, navigateToFirstScreen:()->Unit) {

    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "This is Second Screen", fontSize = 24.sp)
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Welcome $name", fontSize = 24.sp)
        Text(text = "You are $age years old", fontSize = 18.sp)
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {
            navigateToFirstScreen()
        }) {
            Text(text = "Go to First screen")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SecondScreenPreview() {
    SecondScreen("No Name", "0", {})
}