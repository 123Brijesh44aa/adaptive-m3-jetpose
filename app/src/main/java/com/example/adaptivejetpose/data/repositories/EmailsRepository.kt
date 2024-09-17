package com.example.adaptivejetpose.data.repositories

import com.example.adaptivejetpose.data.Email
import com.example.adaptivejetpose.data.MailboxType
import kotlinx.coroutines.flow.Flow

interface EmailsRepository {
    fun getAllEmails(): Flow<List<Email>>
    fun getCategoryEmails(category: MailboxType): Flow<List<Email>>
    fun getAllFolders(): List<String>
    fun getEmailFromId(id: Long): Flow<Email?>
}