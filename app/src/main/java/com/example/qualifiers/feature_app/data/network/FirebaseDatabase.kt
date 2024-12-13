package com.example.qualifiers.feature_app.data.network

import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

fun enterData(name: String, surname: String,
              patronymic: String, birthdayData: String, gender: String){
    val db = Firebase.database("https://qualifiers-21a4f-default-rtdb.firebaseio.com/")
    val dataList = listOf(name, surname, patronymic, birthdayData, gender)
    val ref = db.getReference().child("users")
        .setValue(dataList)
}