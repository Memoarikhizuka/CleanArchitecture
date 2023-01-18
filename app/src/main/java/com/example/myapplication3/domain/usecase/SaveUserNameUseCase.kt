package com.example.myapplication3.domain.usecase

import com.example.myapplication3.domain.usecase.Repository.UserRepository
import com.example.myapplication3.domain.usecase.models.SaveUserNameParam

class SaveUserNameUseCase (private val userRepository: UserRepository) {
    fun execute(param: SaveUserNameParam): Boolean {

        val oldUserName = userRepository.getName()

        if (oldUserName.firstName == param.name){
            return true
        }
      val result: Boolean = userRepository.saveName(saveParam = param)
        return result
    }
}