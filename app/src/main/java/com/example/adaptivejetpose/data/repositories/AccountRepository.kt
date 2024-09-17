package com.example.adaptivejetpose.data.repositories

import com.example.adaptivejetpose.data.Account
import kotlinx.coroutines.flow.Flow


interface AccountRepository {
    fun getDefaultUserAccount(): Flow<Account>
    fun getAllUserAccounts(): Flow<List<Account>>
    fun getContactAccountByUid(uid: Long): Flow<Account>
}