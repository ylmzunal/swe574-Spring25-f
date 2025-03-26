package com.yusuf.eurekanexus

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.yusuf.eurekanexus.login.LoginScreen
import com.yusuf.eurekanexus.ui.theme.EurekaNexusTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EurekaNexusTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    LoginScreen(
                        onLoginSuccess = {
                            // Burada login başarılı olduğunda yapılacak işlemleri tanımlayabilirsiniz
                            // Örneğin ana ekrana yönlendirme yapabilirsiniz
                        }
                    )
                }
            }
        }
    }
}