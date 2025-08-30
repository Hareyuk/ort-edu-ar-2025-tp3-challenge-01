package com.example.myapplication_20_8

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlinx.serialization.builtins.serializer
import java.util.Timer
import androidx.compose.foundation.Image

class PrimeraActividad : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppContent()
        }

        // Cambiar a XML después de 1.5 segundos
        Handler(Looper.getMainLooper()).postDelayed({
            setContentView(R.layout.activity_primera_actividad)
        }, 1500)
//        kotlin.concurrent.timer(initialDelay = 1500, period = 3000) {
//            setContentView(R.layout.activity_primera_actividad)
//            cancel()
//        }

    }
}
@Composable
fun AppContent() {
    Column(
        modifier = Modifier.padding(16.dp), // Add padding for better spacing
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally ) {
        ImageLogo()
        GreetPerson("Axel")
    }
}

@Composable
fun GreetPerson(name: String, modifier: Modifier = Modifier)
{
    Text(
        text = "Bienvenido $name!",
        modifier = modifier,
        fontSize = 26.sp,
        color = androidx.compose.ui.graphics.Color.White
    )
}

@Preview(showBackground = true, showSystemUi = true, name = "My preview 2")
@Composable
fun WelcomePrevewi() {
    AppContent()
}
@Composable
fun ImageLogo() {
    val image = painterResource(R.drawable.doggo_adventurer_logo)
    Image(
        painter = image,
        contentDescription = "Logo Doggo Adventurer",
    )
}
