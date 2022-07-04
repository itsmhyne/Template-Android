package com.mhyne.template.core.data.source.remote

import com.mhyne.template.core.data.source.remote.network.ApiService
import com.mhyne.template.core.data.source.remote.request.LoginRequest
import com.mhyne.template.core.data.source.remote.request.RegisterRequest

class RemoteDataSource(private val api: ApiService) {

    suspend fun login(data: LoginRequest) = api.login(data)
    suspend fun register(data: RegisterRequest) = api.register(data)

}