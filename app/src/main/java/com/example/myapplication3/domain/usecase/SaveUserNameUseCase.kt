package com.example.myapplication3.domain.usecase

import com.example.myapplication3.domain.usecase.models.SaveUserNameParam

class SaveUserNameUseCase {
    fun execute(param: SaveUserNameParam): Boolean {
        if (param.name.isEmpty()) {
            return false
        } else {
            return true
        }

    }
}