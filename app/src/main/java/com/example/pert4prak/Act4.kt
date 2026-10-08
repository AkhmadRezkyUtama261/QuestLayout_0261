package com.example.pert4prak

import androidx.compose.runtime.Composable

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

}