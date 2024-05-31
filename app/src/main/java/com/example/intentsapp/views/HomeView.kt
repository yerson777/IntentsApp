package com.example.intentsapp.views

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.intentsapp.components.BottomNav
import com.example.intentsapp.navigation.NavManager
import com.example.intentsapp.navigation.Routes

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeView(){
    val navController = rememberNavController()
    val navigationRoutes = listOf(
        Routes.PhoneView,
        Routes.SmsView,
        Routes.EmailView
    )

    Scaffold(
        bottomBar = {
            BottomNav(navController, navigationRoutes )
        }
    ) {
        NavManager(navController)
    }

}