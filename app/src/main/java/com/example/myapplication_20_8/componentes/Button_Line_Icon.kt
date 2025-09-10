package com.example.myapplication_20_8.componentes

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun BotonLineaImagen(
    iconoId: Int, // ID del drawable
    contentDescription: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    colorFondo: Color = Color(0xFF4CAF50),
    colorIcono: Color = Color.White,
    tamanoBoton: androidx.compose.ui.unit.Dp = 60.dp,
    alturaBoton: androidx.compose.ui.unit.Dp = 50.dp,
    tamanoIcono: androidx.compose.ui.unit.Dp = 25.dp
) {
    Button(
        onClick = onClick,
        modifier = modifier.size(tamanoBoton, alturaBoton),
        shape = RoundedCornerShape(8.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = colorFondo
        ),
        contentPadding = PaddingValues(0.dp)
    ) {
        Image(
            painter = painterResource(id = iconoId),
            contentDescription = contentDescription,
            modifier = Modifier.size(tamanoIcono),
            colorFilter = ColorFilter.tint(colorIcono)
        )
    }
}