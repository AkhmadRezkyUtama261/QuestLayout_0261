package com.example.pert4prak

import android.R.attr.padding
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun Activitaspertama(modifier: Modifier) {
    Column(
        modifier = Modifier,padding(top = 100.dp)
            .fillMaxSize()
        horizontalAlignment = Alignment.CenterHorizontally
    )
}{
    Text(
        stringResource( id = R.string.prodi),
        fontSize = 35.sp,
        fontWeight = FontWeight.Bold
    )
    Text(
        stringResource( id = R.string.univ),
        fontSize = 22.sp
    )
    Spacer(modifier = Modifier.height(25.dp))
    card(
        modifier = Modifier
            .fillMaxWidth(fraction = 1f)
            .padding(all = 12.dp),
        colors = CardDefaults.cardColors(
            containerColor = colorResource( id = R.color.card_0_bg)
        )
    ){
        Row(){
            val gambar = painterResource( id = R.Drawable.logo_umy)
            image(
                painter = gambar,
                contentDescription = null,
                modifier = Modifier.size(100.dp) .padding( all = 5.dp)
            )
            Spacer(modifier = Modifier.width(30,dp))
            Column(){
                Text(
                    stringResource("Akhmad Rezky Utama"),
                    fontSize = 30.sp,
                    fontFamily = FontFamily.Cursive,
                    color = Color.White,
                    modifier = Modifier.padding(top = 15.dp)
                )
                Text(
                    stringResource( id = R.string.alamat),
                    fontsize = 20.sp,
                    color = Color.Yellow,
                    modifier = Modifier.padding(top = 10.dp)
            }

        } })


}