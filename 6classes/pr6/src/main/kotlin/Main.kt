package org.example

fun main() {
    val securedLoan = SecuredLoan(1.1)
    val unsecuredLoan = UnsecuredLoan(1.7, 600)
    val notificationService = NotificationService()

    println(notificationService.getMessage(securedLoan))
    println(notificationService.getMessage(unsecuredLoan))
}

sealed class Loan(val interest: Double) {
    abstract fun loanDetails(): String
}

class SecuredLoan(interest: Double) : Loan(interest) {
    override fun loanDetails(): String {
        return "Secured Loan with interest rate: $interest%"
    }
}

class UnsecuredLoan(interest: Double, val creditScore: Int) : Loan(interest) {
    override fun loanDetails(): String {
        return "Unsecured Loan with interest rate: $interest%, and credit score: $creditScore"
    }
}

class NotificationService {
    fun getMessage(loan: Loan): String {
        return when (loan) {
            is SecuredLoan -> loan.loanDetails() + ". Everything is OK"
            is UnsecuredLoan -> loan.loanDetails() + ". Well, not bed"
        }
//        if (loan is SecuredLoan) {
//            return "Everything is OK"
//        }
//        if (loan is UnsecuredLoan) {
//            return "Well, not bed"
//        }
//        throw UnsupportedOperationException("Ooooops!")
    }
}