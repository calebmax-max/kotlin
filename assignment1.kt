// create an addition  and subtraction programs inside of the same file
// Research on conditonal statements in Kotlin


fun main(){
    val num1 : Int = 20
    val num2 : Int = 15
    val addition = num1 + num2
    val subtraction = num1 - num2


    println(addition)
    println(subtraction)

    // If statement
    // Used when you want to run code only if a condition isa true
    val number = 10

if (number > 5) {
    println("Number is greater than 5")
}

// if...else Statement
// Used when you want one action if true and another if false
val age = 18

if (age >= 18) {
    println("You are an adult")
} else {
    println("You are a minor")
}


//if...else if...else
// Used when you have multiple conditions.
val marks = 75

if (marks >= 80) {
    println("Grade A")
} else if (marks >= 70) {
    println("Grade B")
} else if (marks >= 60) {
    println("Grade C")
} else {
    println("Fail")
}


//Kotlin if Can Return a Value
// In Kotlin, if can be used like an expression (very important).

val number = 20

val result = if (number % 2 == 0) {
    "Even"
} else {
    "Odd"
}

println(result)


// . when Statement (Very Important in Kotlin)
// when is like switch in other languages but more powerful.
val day = 3

when (day) {
    1 -> println("Monday")
    2 -> println("Tuesday")
    3 -> println("Wednesday")
    4 -> println("Thursday")
    5 -> println("Friday")
    else -> println("Weekend")
}

// when With Conditions
val age = 20

when {
    age < 13 -> println("Child")
    age < 20 -> println("Teen")
    else -> println("Adult")
}
}




