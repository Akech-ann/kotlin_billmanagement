package com.akech.assessement.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.akech.assessement.repository.PostRepository
import kotlinx.coroutines.launch

class PostViewModel<RegisterResponse> :ViewModel(){
    val userRepo = PostRepository()
    val regLiveData = MutableLiveData<RegisterResponse>()
    val errLiveData = MutableLiveData<String>()



    fun registerUser(registerRequest: RegisterRequest){
        viewModelScope.launch {
            val response = userRepo.register(registerRequest)
            if (response.isSuccessful){
                regLiveData.postValue(response.body())
            }else{
                errLiveData.postValue(response.errorBody()?.string())
            }
        }





    }


}