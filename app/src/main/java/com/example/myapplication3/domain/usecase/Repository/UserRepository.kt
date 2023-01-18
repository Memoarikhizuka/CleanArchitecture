package com.example.myapplication3.domain.usecase.Repository

import com.example.myapplication3.domain.usecase.models.SaveUserNameParam
import com.example.myapplication3.domain.usecase.models.UserName

interface UserRepository {

    fun saveName(saveParam : SaveUserNameParam): Boolean

    fun getName(): UserName
}