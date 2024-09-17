package com.example.adaptivejetpose.data.impl

import com.example.adaptivejetpose.data.Account
import com.example.adaptivejetpose.data.local.LocalAccountsDataProvider
import com.example.adaptivejetpose.data.repositories.AccountRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class AccountRepositoryImpl: AccountRepository{
    override fun getDefaultUserAccount(): Flow<Account> = flow {
        emit(LocalAccountsDataProvider.getDefaultUserAccount())
    }

    override fun getAllUserAccounts(): Flow<List<Account>> = flow{
        emit(LocalAccountsDataProvider.allUserAccounts)
    }

    override fun getContactAccountByUid(uid: Long): Flow<Account> = flow{
        emit(LocalAccountsDataProvider.getContactAccountByUid(uid))
    }

}
