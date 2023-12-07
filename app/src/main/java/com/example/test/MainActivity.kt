package com.example.test

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.test.databinding.MainActivityBinding
import com.example.test.ui.theme.TestTheme

class MainActivity : ComponentActivity() {
    lateinit var binding: MainActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainActivityBinding.inflate(layoutInflater)

        val view = binding.root
        setContentView(view)

        val intent = Intent(this@MainActivity, HomePage::class.java)
        binding.buttonStart.setOnClickListener {
            startActivity(intent)
        }
    }
}
