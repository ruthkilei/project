package net.ezra.ui.products

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_MIT
import net.ezra.navigation.ROUTE_SERVICES
import net.ezra.R
import net.ezra.navigation.ROUTE_CONTACT
import net.ezra.navigation.ROUTE_PRODUCTS
import net.ezra.navigation.ROUTE_SHOP
import net.ezra.navigation.ROUTE_SIGNUP

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ProductsScreen(navController: NavHostController) {

    LazyColumn (
        Modifier
            .fillMaxSize()
            .background(Color.Black)
            .paint(
                painterResource(
                    id = R.drawable.img_10
                ), contentScale = ContentScale.FillBounds
            )
    ){
        item {
            Column (Modifier.padding(horizontal = 20.dp, vertical = 20.dp)){
                Text(text = "This is a an easy and reliable way of learning ..for those student who prefer study online.please contact us on 0100353345.VIA email.rruthsopoyian@gmail.com" ,

                    fontSize = 22.sp,
                    fontFamily = FontFamily.Cursive,
                    color = Color.Blue)
                Spacer(modifier = Modifier.height(470.dp))
                Row (Modifier.padding(horizontal = 20.dp)){
                    OutlinedButton(onClick = {
                        navController.navigate(ROUTE_PRODUCTS) {
                            popUpTo(ROUTE_PRODUCTS) { inclusive = true }
                        }


                    }

                        , modifier = Modifier
                            .background(Color.Transparent)
                            .width(300.dp)

                    )

                    {
                        Text(text = "WELCOME", fontSize = 25.sp, fontFamily = FontFamily.Cursive,color= Color.Blue)
                    }
//                    Spacer(modifier = Modifier.width(10.dp))
//                    OutlinedButton(onClick = {
//                        navController.navigate(ROUTE_HELP) {
//                            popUpTo(ROUTE_START) { inclusive = true }
//                        }
//                    }, modifier = Modifier
//                        .background(Color.Transparent)
//                        .width(150.dp)
//
//                    ) {
//                        Text(text = "Exit", fontSize = 25.sp, fontFamily = FontFamily.Cursive,color = Color.White)
//                        Spacer(modifier = Modifier.width(10.dp))
//                        Icon(
//                            imageVector = Icons.Default.ExitToApp,
//                            contentDescription = "settings",
//                            tint = Color.White
//                        )
//                    }


                }
          Column {
              Text(text = "WELCOME TO OUR ONLINE LEARNING ,,,,GET THE BEST LEARNING")
          }
                Spacer(modifier = Modifier.height(9.dp))
                Column(Modifier.padding(horizontal = 90.dp)) {
                    Text(
                        modifier = Modifier
                            .clickable {
                                navController.navigate(ROUTE_ABOUT) {
                                    popUpTo(ROUTE_HOME) { inclusive = true }
                                }
                            },
                        text = "Forgot password?", fontSize = 15.sp,color= Color.Cyan)
                }
                Spacer(modifier = Modifier.height(9.dp))
                Row (Modifier.padding(horizontal = 50.dp)){
                    Text(text = "YOUR ACCOUNT", fontSize = 15.sp,color = Color.White)
                    Spacer(modifier = Modifier.width(2.dp))
                    Text(
                        modifier = Modifier
                            .clickable {
                                navController.navigate(ROUTE_SIGNUP) {
                                    popUpTo(ROUTE_ABOUT) { inclusive = true }
                                }
                            },
                        text = "WELCOME", fontSize = 15.sp,color = Color.Black
                    )
                }
            }
        }
    }
}















@Composable
fun BottomBar() {
    val selectedIndex = remember { mutableStateOf(0) }
    BottomNavigation(elevation = 10.dp) {
        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Home, "")
        },
            label = { Text(text = "Home") }, selected = (selectedIndex.value == 0), onClick = {
                selectedIndex.value = 0
            })
        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Favorite, "")
        },
            label = { Text(text = "Favorite") }, selected = (selectedIndex.value == 1), onClick = {
                selectedIndex.value = 1
            })

    }
}







@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    ProductsScreen(rememberNavController())
}

