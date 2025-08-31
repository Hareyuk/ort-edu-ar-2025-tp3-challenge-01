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
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

class PrimeraActividad : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MaterialTheme{
                PantallaWelcome()
            }
        }

    }
}
@Preview(showBackground = true, showSystemUi = true, name = "My preview 2")
@Composable
fun PantallaWelcome() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp)
            .padding(top = 32.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        // ImageView → Image
        Image(
            painter = painterResource(id = R.drawable.working_pana),
            contentDescription = stringResource(R.string.welcome_img_content_descr),
            modifier = Modifier
                .fillMaxWidth()
                .height(243.dp),
            contentScale = ContentScale.Fit
        )

        // LinearLayout vertical → Column
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(182.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            // TextView título
            Text(
                text = stringResource(R.string.welcome_title),
                style = MaterialTheme.typography.headlineMedium, // Tu estilo h1_green
                color = Color(0xFF4CAF50), // Verde - ajusta el color
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )

            // TextView subtítulo
            Text(
                text = stringResource(R.string.welcome_subtitle),
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.fillMaxWidth()
            )
        }

        // LinearLayout horizontal → Row
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f), // Equivale a layout_height="match_parent"
            horizontalArrangement = Arrangement.spacedBy(16.dp) // Espacio entre botones
        ) {

            // Botón 1
            Button(
                onClick = { /* Acción del botón login */ },
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier.weight(1f), // Equivale a layout_weight="1"
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF4CAF50) // Tu estilo btn_green_fill
                )
            ) {
                Text(stringResource(R.string.welcome_btn_login))
            }

            // Botón 2
            Button(
                onClick = { /* Acción del botón signup */ },
                modifier = Modifier.weight(1f),
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF4CAF50)
                )
            ) {
                Text(stringResource(R.string.welcome_btn_signup))
            }
        }
    }
}