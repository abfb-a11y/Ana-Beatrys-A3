package com.example.ana

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ana.R

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MensageCard(msg = Mensagem("Ana Beatrys", "mais diva"))
        }
    }
}

data class Mensagem(val author: String, val body: String)

@Composable
fun MensageCard(msg: Mensagem) {
    Row {
        Image(
            painter = painterResource(R.drawable.download),
            contentDescription = "Imagem do perfil",
            modifier = Modifier
                .size(45.dp)
                .clip(CircleShape)
        )

        Spacer(modifier = Modifier.width(10.dp))

        Column {
            Text(text = msg.author)
            Text(text = msg.body)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Column {
        MensageCard(msg = Mensagem("Ana Beatrys", "mais diva"))
        MensageCard(msg = Mensagem("Ana Beatrys", "mais babadeira"))
        MensageCard(msg = Mensagem("Ana Beatrys", "mais mais"))
    }
}
