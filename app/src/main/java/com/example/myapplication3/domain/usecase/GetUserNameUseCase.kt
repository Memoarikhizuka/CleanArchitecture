package com.example.myapplication3.domain.usecase

import com.example.myapplication3.domain.usecase.Repository.UserRepository
import com.example.myapplication3.domain.usecase.models.UserName

class GetUserNameUseCase(private val userRepository: UserRepository) {
    fun execute(): UserName {
        return userRepository.getName()

    }
}