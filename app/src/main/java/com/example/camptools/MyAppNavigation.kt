package com.example.camptools

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.camptools.pages.HomePage
import com.example.camptools.pages.LoginPage
import com.example.camptools.pages.SignUpPage

@Composable
fun MyAppNavigation(modifier: Modifier = Modifier, authViewModel: AuthViewModel){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "login", builder = {
            composable(route = "login") {
                LoginPage(modifier, navController,authViewModel)
            }
            composable(route = "signup") {
                SignUpPage(modifier, navController,authViewModel)
            }
            composable(route = "home") {
                HomePage(modifier, navController,authViewModel)
            }

        }
    )
}