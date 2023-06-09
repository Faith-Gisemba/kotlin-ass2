fun main(){
    printMultiples()
    var current = CurrentAccount(235677,"Gisemba Faith",90000)
     current.deposit(6900.78)
    current.withdraw(9089.98)
    println(current)
    current.details()
    println(validPasswrd("GisembaFaithKenya"))
    println(validPasswrd("buggatiiford23y"))
    println(randomString("discovery"))

}
//Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not. (6pts)

fun randomString(word: String): List<Any> {
    var firstChar = word.first()
    var lastChar = word.last()
    var length = word.length
    var startVowel =
        when (firstChar) {'a', 'e', 'i', 'o', 'u' -> true
        else -> false
    }
    return listOf(firstChar, lastChar, length, startVowel)
}


//Create a function that takes in a password as a parameter. For a password to
//be valid it must meet the following conditions:
//1. Must be at least 8 characters long
//2. Must be at most 16 characters long
//3. Must not be “password”
//4. Must contain a digit
//Your function should determine whether the password provided is valid or not.
//The function returns true/false (7pts)

fun validPasswrd(password: String): Boolean {
    var passNum = Regex("\\d")

    return password.length in 8..16 && password != "password" && passNum.containsMatchIn(password)
}

//Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//multiples of both 6 and 8 it should print out “Bingo!” (5pts)
fun printMultiples(){
    for(x in 1..100){
        if(x % 6 == 0 && x % 8 == 0){
            println("Bingo")
        }
        else if(x % 8 == 0){
            println(x)
        }
        else if(x % 6 == 0){
            println(x)
        }
        else{
            println(x)
        }

    }
}

//Create a class CurrentAccount with the following attributes: account number,
//account name, balance. It has the following functions:
//a. deposit(amount: Double) - Increments the balance by the amount
//deposited
//b. withdraw(amount: Double) - Decrements the balance by the amount
//withdrawn
//c. details() - Prints out the account number and balance and name in
//this format: “Account number x with balance y is operated by z”

open class CurrentAccount(var accoutnumber: Int,var accountname: String, var balance: Int){
    fun deposit(amount: Double): Int{
        val amount = 0
        balance += amount
        return amount
    }
    fun withdraw(amount: Double):Int{
        val amount = 0
        balance -= amount
        return amount
    }
    fun details(){
        println("Account number $accoutnumber with balance $balance is operated by $accountname")
    }

}

//Create another class SavingsAccount. It has the same functions and
//attributes as the current account except for one attribute, withdrawals: Int.
//Withdrawals is a counter variable that is used to keep track of how many
//withdrawals have been made from the account in a year. The only other
//difference is that the savings account withdraw() method first checks if the
//number of withdrawals is less than 4 for it to allow one to withdraw money
//from the account. It also increments the withdrawals attribute after a
//successful withdrawal (6pts)
class savingsAccount(account: savingsAccount,accoutnumber: Int,balance: Int, var withdrawals: Int){


}



