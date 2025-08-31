package com.example.myapplication_20_8

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MaterialTheme{
                PantallaLogin()
            }
        }
    }
}


@Preview(showBackground = true, showSystemUi = true, name = "My preview 2")
@Composable
fun PantallaLogin() {
    Box(modifier = Modifier.fillMaxSize())
    {
        Image(
            painter = painterResource(id = R.drawable.design_backgorund),
            contentDescription = "Imagen de fondo",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

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
}