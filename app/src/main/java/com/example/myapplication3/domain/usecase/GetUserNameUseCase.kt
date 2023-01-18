package com.example.myapplication3.domain.usecase

import com.example.myapplication3.domain.usecase.models.UserName

class GetUserNameUseCase {
    fun execute ():UserName{
        return UserName(firstName = "Memoari", lastName = "Hello")
    }
}