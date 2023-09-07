package com.wladimirbr.bakeryourdream.data.repository


import com.wladimirbr.bakeryourdream.domain.model.ApiRequest
import com.wladimirbr.bakeryourdream.domain.model.ApiResponse
import com.wladimirbr.bakeryourdream.domain.model.UserUpdate
import com.wladimirbr.bakeryourdream.domain.repository.DataStoreOperations
import com.wladimirbr.bakeryourdream.domain.repository.Repository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val dataStoreOperations: DataStoreOperations,

) : Repository {
    override suspend fun saveSignedInState(signedIn: Boolean) {
        dataStoreOperations.saveSignedInState(signedIn = signedIn)
    }

    override fun readSignedInState(): Flow<Boolean> {
        return dataStoreOperations.readSignedInState()
    }

    override suspend fun verifyTokenOnBackend(request: ApiRequest): ApiResponse {
        TODO("Not yet implemented")
    }

    override suspend fun getUserInfo(): ApiResponse {
        TODO("Not yet implemented")
    }

    override suspend fun updateUser(userUpdate: UserUpdate): ApiResponse {
        TODO("Not yet implemented")
    }

    override suspend fun deleteUser(): ApiResponse {
        TODO("Not yet implemented")
    }

    override suspend fun clearSession(): ApiResponse {
        TODO("Not yet implemented")
    }

}