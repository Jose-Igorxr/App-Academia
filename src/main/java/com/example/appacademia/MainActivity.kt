package com.example.appacademia

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.material3.MaterialTheme.shapes
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.appacademia.ui.theme.AppAcademiaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppAcademiaTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GymAppMainScreen()
                }
            }
        }
    }
}


@Composable
fun GymAppMainScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(Color.Yellow)
    ) {

        Image(
            painter = painterResource(id = R.drawable.oxyfundo),
            contentDescription = "Descrição da imagem de fundo",
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp) //
                .clip(shapes.medium)
        )

        Spacer(modifier = Modifier.height(16.dp))


        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "Ícone na parte superior",
            modifier = Modifier
                .size(48.dp)
                .clip(shapes.medium)
                .padding(16.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))


        Text(
            text = "Não deixe que a preguiça seja mais forte do que sua vontade de viver",
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        // Botões
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
                .padding(8.dp)
        ) {

            Button(
                onClick = {},
                modifier = Modifier
                    .weight(1f)
                    .padding(end = 8.dp),
            ) {
                Text(text = "Cadastrar")
            }


            Button(
                onClick = {},
                modifier = Modifier
                    .weight(1f),
            ) {
                Text(text = "Já possuo cadastro")
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun GymAppMainScreenPreview() {
    AppAcademiaTheme {
        GymAppMainScreen()
    }
}




