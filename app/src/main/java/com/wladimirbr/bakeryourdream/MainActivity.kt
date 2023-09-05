package com.wladimirbr.bakeryourdream

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.wladimirbr.bakeryourdream.navigation.BakeryOurDreamNavigation
import com.wladimirbr.bakeryourdream.ui.theme.BakeryOurDreamTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BakeryOurDreamTheme {
                // A surface container using the 'background' color from the theme
                BakeryOurDreamApp()
            }
        }
    }
}

@Composable
fun BakeryOurDreamApp(){
    Surface(color = MaterialTheme.colorScheme.background,
        modifier = Modifier.fillMaxSize(), content = {
            Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                BakeryOurDreamNavigation()

            }
        })
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BakeryOurDreamTheme {

    }
}