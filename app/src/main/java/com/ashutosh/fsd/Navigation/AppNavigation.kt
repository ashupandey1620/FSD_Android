package com.ashutosh.fsd.Navigation


import androidx.compose.runtime.Composable
import androidx.lifecycle.Lifecycle
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import androidx.navigation.navigation
import com.ashutosh.fsd.Presentation.MainViewModel
import com.ashutosh.fsd.ui.theme.Screen.Authentication.ChangePassword.ChangePassword
import com.ashutosh.fsd.ui.theme.Screen.Authentication.Register.RegisterCompany
import com.ashutosh.fsd.ui.theme.Screen.Authentication.Register.RegisterEmployee
import com.ashutosh.fsd.ui.theme.Screen.Authentication.Register.RegisterOther

import com.ashutosh.fsd.ui.theme.Screen.Authentication.Register.RegisterScreen
import com.ashutosh.fsd.ui.theme.Screen.Authentication.Register.RegisterStudent
import com.ashutosh.fsd.ui.theme.Screen.Authentication.ResetPassword.ResetPassword
import com.ashutosh.fsd.ui.theme.Screen.Authentication.SignIn.SignInScreen
import com.ashutosh.fsd.ui.theme.Screen.Authentication.VerifyOTP.VerifyOTP
import com.ashutosh.growappassignment.ui.theme.Screen.Explore
import com.ashutosh.growappassignment.ui.theme.Screen.Home
import com.ashutosh.growappassignment.ui.theme.Screen.News

import com.ashutosh.growappassignment.ui.theme.Screen.ProductDetail
import com.ashutosh.growappassignment.ui.theme.Screen.Splash


@Composable
fun AppNavigation(viewModel: MainViewModel) {

    val navController = rememberNavController()


    NavHost(
        navController = navController,
        startDestination = Routes.Splash.name
    ) {

            composable(Routes.Splash.name) {
                Splash(
                    navController,
                    viewModel.appState
                )
            }

            navigation(
                route = Routes.MainGraph.name, startDestination = Routes.Explore.name
            ) {

                composable(Routes.Explore.name) {
                    Explore(
                        navController,
                        viewModel.appState,
                        onMainEvent = viewModel::onEvent
                    )
                }

                composable("Product/{ticker}", arguments = listOf(
                    navArgument(name = "ticker"){
                        type = NavType.StringType
                    }))
                { data ->
                    Home(
                        navController,
                        data.arguments?.getString("ticker"),
                        viewModel.appState
                    )
                }
                composable(Routes.ProductDetail.name) {
                    ProductDetail(
                        navController,
                        viewModel.appState
                    )
                }
                composable(Routes.News.name) {
                    News(
                        navController,
                        viewModel.appState
                    )
                }

                navigation(
                    route = Routes.AuthenticationGraph.name, startDestination = Routes.Login.name
                ) {

                    composable(Routes.Login.name) {
                        SignInScreen(
                            navController
                        )
                    }
                    composable(Routes.Register.name) {
                        RegisterScreen(
                            navController
                        )
                    }

                    composable(Routes.RegisterStudent.name) {
                        RegisterStudent(
                            navController
//                            sharedViewModel
                        )
                    }

                    composable(Routes.RegisterEmployee.name) {
                        RegisterEmployee(
                            navController
//                            sharedViewModel
                        )
                    }


                    composable(Routes.RegisterCompany.name) {
                        RegisterCompany(
                            navController
//                            sharedViewModel
                        )
                    }

                    composable(Routes.RegisterOther.name) {
                        RegisterOther(
                            navController
//                            sharedViewModel
                        )
                    }


                    composable(Routes.ResetPassword.name) {
                        ResetPassword(
//                            navController,
//                            sharedViewModel2
                        )
                    }

                    composable(Routes.ChangePassword.name) {
                        ChangePassword(
//                            navController,
//                            sharedViewModel2
                        )
                    }


                    composable(Routes.VerifyOTP.name) {
                        VerifyOTP(
//                            navController,
//                            sharedViewModel
                        )
                    }



                }



            }
    }
}


val NavHostController.isValidBackStack
    get() = this.currentBackStackEntry?.lifecycle?.currentState == Lifecycle.State.RESUMED


