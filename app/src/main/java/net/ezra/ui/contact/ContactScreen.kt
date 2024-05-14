package net.ezra.ui.contact


import android.annotation.SuppressLint
import android.content.res.Configuration
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.focusable
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.R
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_CONTACT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_MENU
import net.ezra.navigation.ROUTE_SEARCH
import net.ezra.navigation.ROUTE_SERVICES
import net.ezra.ui.theme.AppTheme
import org.checkerframework.checker.units.qual.C


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ContactScreen(navController: NavHostController) {
    LazyColumn (
        Modifier
            .fillMaxSize()
            .background(Color.White)
            .paint(painterResource(id = R.drawable.img_3), contentScale = ContentScale.FillBounds), horizontalAlignment = Alignment.CenterHorizontally){
        item {
            Column (Modifier.padding()){
                Row(horizontalArrangement = Arrangement.Center) {
                    Text(text = "Login in to your account", fontSize = 35.sp, fontFamily = FontFamily.Cursive, textAlign = TextAlign.Center,color = Color.Blue)
                }
                Spacer(modifier = Modifier.height(10.dp))
                var Name by remember {
                    mutableStateOf(TextFieldValue(""))
                }
                OutlinedTextField(
                    value = Name, onValueChange = { Name = it },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Person,
                            contentDescription = ""
                        )
                    },
                    label = { Text(text = "Enter your name") },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color.White,
                        unfocusedBorderColor = Color.Black,
                        focusedLeadingIconColor = Color.White,
                        unfocusedLeadingIconColor = Color.Black,
                        focusedTextColor = Color.White,
                        unfocusedTextColor = Color.Black,
                        focusedPlaceholderColor = Color.White,
                        unfocusedPlaceholderColor = Color.Black,
                        focusedLabelColor = Color.White,
                        unfocusedLabelColor = Color.Black

                    )


                )
                Spacer(modifier = Modifier.height(20.dp))

                var Email by remember {
                    mutableStateOf(TextFieldValue(""))
                }
                OutlinedTextField(
                    value = Email, onValueChange = { Email = it },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Email,
                            contentDescription = ""
                        )
                    },
                    label = { Text(text = "Enter your Email") },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color.White,
                        unfocusedBorderColor = Color.Black,
                        focusedLeadingIconColor = Color.White,
                        unfocusedLeadingIconColor = Color.Black,
                        focusedTextColor = Color.White,
                        unfocusedTextColor = Color.Black,
                        focusedPlaceholderColor = Color.White,
                        unfocusedPlaceholderColor = Color.Black,
                        focusedLabelColor = Color.White,
                        unfocusedLabelColor = Color.Black

                    )


                )
                Spacer(modifier = Modifier.height(20.dp))

                var Password by remember {
                    mutableStateOf(TextFieldValue(""))
                }
                OutlinedTextField(
                    value = Password, onValueChange = { Password = it },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Lock,
                            contentDescription = ""
                        )
                    },
                    label = { Text(text = "Enter password") },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color.White,
                        unfocusedBorderColor = Color.Black,
                        focusedLeadingIconColor = Color.White,
                        unfocusedLeadingIconColor = Color.Black,
                        focusedTextColor = Color.White,
                        unfocusedTextColor = Color.Black,
                        focusedPlaceholderColor = Color.White,
                        unfocusedPlaceholderColor = Color.Black,
                        focusedLabelColor = Color.White,
                        unfocusedLabelColor = Color.Black

                    )


                )
                Spacer(modifier = Modifier.height(80.dp))
                OutlinedButton(onClick = {
                    navController.navigate(ROUTE_HOME) {
                        popUpTo(ROUTE_CONTACT) { inclusive = true }
                    }
                }, modifier = Modifier

                    .width(300.dp)

                ) {
                    Text(text = "Log in", fontSize = 35.sp, fontFamily = FontFamily.Cursive,color = Color.Blue, modifier = Modifier.clickable {  navController.navigate(
                        ROUTE_HOME) {
                        popUpTo(ROUTE_CONTACT) { inclusive = true }
                    } })
                }



            }
        }
    }
}




@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    ContactScreen(rememberNavController())
}

