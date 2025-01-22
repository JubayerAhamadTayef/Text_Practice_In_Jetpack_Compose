package com.jubayer_ahamad_tayef.practice_text_in_jetpack_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.jubayer_ahamad_tayef.practice_text_in_jetpack_compose.ui.theme.Practice_Text_In_Jetpack_ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Practice_Text_In_Jetpack_ComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MyText()
                }
            }
        }
    }
}

@Composable
fun MyText() {
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center) {
        Text(
            text = "Jubayer Ahamad Tayef!",
            modifier = Modifier.fillMaxWidth(),
            color = Color.Blue,
            textAlign = TextAlign.Center,
            fontSize = 20.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Black,
            fontFamily = FontFamily.SansSerif,
            letterSpacing = 5.sp,
            textDecoration = TextDecoration.LineThrough,
            lineHeight = 3.sp,
            overflow = TextOverflow.Ellipsis,
            softWrap = false,
            maxLines = 1,
            minLines = 1
        )
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
            CustomizeText(spanText = 'J', normalText = "ubayer")
            CustomizeText(spanText = 'A', normalText = "hamad")
            CustomizeText(spanText = 'T', normalText = "ayef")
        }
    }
}

@Composable
fun CustomizeText(spanText: Char, normalText: String) {
    Text(text = buildAnnotatedString {
        withStyle(
            style = SpanStyle(
                color = Color.Blue, fontSize = 30.sp, fontWeight = FontWeight.Black
            )
        ) {
            append(spanText)
        }
        append(normalText)
    }, textAlign = TextAlign.Center, fontSize = 25.sp)
}

@Preview(showBackground = true)
@Composable
fun MyTextPreview() {
    MyText()
}