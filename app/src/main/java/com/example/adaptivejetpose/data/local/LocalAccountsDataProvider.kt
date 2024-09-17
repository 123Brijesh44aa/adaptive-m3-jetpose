package com.example.adaptivejetpose.data.local

import com.example.adaptivejetpose.R
import com.example.adaptivejetpose.data.Account

object LocalAccountsDataProvider {

    val allUserAccounts = listOf(
        Account(
            id = 1L,
            uid = 0L,
            firstName = "Brijesh",
            lastName = "Mourya",
            email = "Brijesh@gmail.com",
            altEmail = "brijeshmourya@gmail.com",
            avatar = "https://images.pexels.com/photos/415829/pexels-photo-415829.jpeg?auto=compress&cs=tinysrgb&w=600"
        ),
        Account(
            id = 2L,
            uid = 0L,
            firstName = "Nikit",
            lastName = "Gill",
            email = "Nikit@gmail.com",
            altEmail = "nikitgill@gmail.com",
            avatar = "https://images.pexels.com/photos/428364/pexels-photo-428364.jpeg?auto=compress&cs=tinysrgb&w=600"
        ),
        Account(
            id = 3L,
            uid = 0L,
            firstName = "Akshay",
            lastName = "Kumar",
            email = "Aksi@gmail.com",
            altEmail = "aksikumar@gmail.com",
            avatar = "https://images.pexels.com/photos/1043471/pexels-photo-1043471.jpeg?auto=compress&cs=tinysrgb&w=600"
        )
    )

    private val allUserContactAccounts = listOf(
        Account(
            id = 11L,
            uid = 0L,
            firstName = "John",
            lastName = "Doe",
            email = "john.doe@gmail.com",
            altEmail = "johnd@gmail.com",
            avatar = "https://images.pexels.com/photos/220453/pexels-photo-220453.jpeg?auto=compress&cs=tinysrgb&w=600"
        ),
        Account(
            id = 12L,
            uid = 0L,
            firstName = "Emily",
            lastName = "Blunt",
            email = "emily.blunt@gmail.com",
            altEmail = "emilyb@gmail.com",
            avatar = "https://images.pexels.com/photos/415829/pexels-photo-415829.jpeg?auto=compress&cs=tinysrgb&w=600"
        ),
        Account(
            id = 13L,
            uid = 0L,
            firstName = "Akshay",
            lastName = "Kumar",
            email = "Aksi@gmail.com",
            altEmail = "aksikumar@gmail.com",
            avatar = "https://images.pexels.com/photos/1043471/pexels-photo-1043471.jpeg?auto=compress&cs=tinysrgb&w=600"
        ),
        Account(
            id = 4L,
            uid = 0L,
            firstName = "Sophia",
            lastName = "Turner",
            email = "sophia.turner@gmail.com",
            altEmail = "sophiaturn@gmail.com",
            avatar = "https://images.pexels.com/photos/1239291/pexels-photo-1239291.jpeg?auto=compress&cs=tinysrgb&w=600"
        ),
        Account(
            id = 5L,
            uid = 0L,
            firstName = "Chris",
            lastName = "Evans",
            email = "chris.evans@gmail.com",
            altEmail = "chrisev@gmail.com",
            avatar = "https://images.pexels.com/photos/614810/pexels-photo-614810.jpeg?auto=compress&cs=tinysrgb&w=600"
        ),
        Account(
            id = 6L,
            uid = 0L,
            firstName = "Jessica",
            lastName = "Alba",
            email = "jessica.alba@gmail.com",
            altEmail = "jessalba@gmail.com",
            avatar = "https://images.pexels.com/photos/774909/pexels-photo-774909.jpeg?auto=compress&cs=tinysrgb&w=600"
        ),
        Account(
            id = 7L,
            uid = 0L,
            firstName = "Robert",
            lastName = "Downey",
            email = "robert.downey@gmail.com",
            altEmail = "rdowney@gmail.com",
            avatar = "https://images.pexels.com/photos/1704488/pexels-photo-1704488.jpeg?auto=compress&cs=tinysrgb&w=600"
        ),
        Account(
            id = 8L,
            uid = 0L,
            firstName = "Scarlett",
            lastName = "Johansson",
            email = "scarlett.johansson@gmail.com",
            altEmail = "scarjo@gmail.com",
            avatar = "https://images.pexels.com/photos/1468378/pexels-photo-1468378.jpeg?auto=compress&cs=tinysrgb&w=600"
        ),
        Account(
            id = 9L,
            uid = 0L,
            firstName = "Mark",
            lastName = "Ruffalo",
            email = "mark.ruffalo@gmail.com",
            altEmail = "markruff@gmail.com",
            avatar = "https://images.pexels.com/photos/1382734/pexels-photo-1382734.jpeg?auto=compress&cs=tinysrgb&w=600"
        ),
        Account(
            id = 10L,
            uid = 0L,
            firstName = "Natalie",
            lastName = "Portman",
            email = "natalie.portman@gmail.com",
            altEmail = "nataliep@gmail.com",
            avatar = "https://images.pexels.com/photos/457882/pexels-photo-457882.jpeg?auto=compress&cs=tinysrgb&w=600"
        )
    )

    fun getDefaultUserAccount() = allUserAccounts.first()


    fun isUserAccount(uid: Long): Boolean = allUserAccounts.any { it.uid == uid } // Returns true if at least one element matches the given predicate.

    fun getContactAccountByUid(accountId: Long): Account {
        return allUserContactAccounts.first { it.id == accountId } // Returns the first element matching the given predicate.
    }
}