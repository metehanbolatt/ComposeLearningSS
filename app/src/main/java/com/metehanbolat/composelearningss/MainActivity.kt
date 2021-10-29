package com.metehanbolat.composelearningss

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.metehanbolat.composelearningss.ui.theme.ComposeLearningSSTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeLearningSSTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {

                }
            }
        }
    }
}

@Composable
fun SuperScriptText(
    normalText : String,
    normalFontSize: TextUnit = MaterialTheme.typography.subtitle1.fontSize,
    superTextFontSize: TextUnit = MaterialTheme.typography.subtitle2.fontSize,
    superText : String
) {

    Text(
        buildAnnotatedString {
            withStyle(style = SpanStyle(
                fontSize = normalFontSize
            )){
                append(normalText)
            }
            withStyle(style = SpanStyle(
                fontSize = superTextFontSize,
                fontWeight = FontWeight.Normal,
                baselineShift = BaselineShift.Superscript
            )){
                append(superText)
            }
            withStyle(style = SpanStyle(
                fontSize = MaterialTheme.typography.overline.fontSize,
                fontWeight = FontWeight.Normal,
                baselineShift = BaselineShift.Subscript
            )){
                append(superText)
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeLearningSSTheme {
        Column(modifier = Modifier.fillMaxSize()){
            SuperScriptText(normalText = "Hello", superText = "World")
        }
    }
}