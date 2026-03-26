// Using if statements or when statement, create a program to find if given year is leap or not 2. Using if statements check if a given number is ODD or Even
// Research on the looping structures in kotlin, how to create an array in kotlin
fun main() {
    val year = 2002
     when{
        (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)->
        println("Leao year")
        else ->
        println("Not leap year")
     }
    
}
//===========================================
// for loop - Used whrn you know how many times you want to loop
//print numbers 1 to 5
fun main() {
    for (i in 1..5) {
        println(i)
    }
}
// variation
for (i in 1 until 5) {   // 1 to 4
    println(i)
}

for (i in 5 downTo 1) {  // 5 to 1
    println(i)
}

for (i in 1..10 step 2) { // 1,3,5,7,9
    println(i)
}



// while loop- used when the number of iterations is not known beforehand
fun main() {
    var i = 1

    while (i <= 5) {
        println(i)
        i++
    }
}

// do...while loop- executes at least once ,even if the condition is false
fun main() {
    var i = 1

    do {
        println(i)
        i++
    } while (i <= 5)
}

//Loop control statements
// break(stop loop)
for (i in 1..10) {
    if (i == 5) break
    println(i)
}

//continue(skip current iteration)
for (i in 1..5) {
    if (i == 3) continue
    println(i)
}
//Looping through arrays
fun main() {
    val numbers = arrayOf(10, 20, 30)

    for (num in numbers) {
        println(num)
    }
}

//with index
for (i in numbers.indices) {
    println("Index $i = ${numbers[i]}")
}

/// create an array using arrayof()
fun main() {
    val numbers = arrayOf(1, 2, 3, 4, 5)
    println(numbers[0]) // Output: 1

}
///
fun main() {
    val names = arrayOf("John", "Mary", "Alex")
    println(names[1]) // Output: Mary
}

// access  and  modify
fun main() {
    val numbers = arrayOf(10, 20, 30)

    numbers[1] = 50   // change value
    println(numbers[1]) // Output: 50
}


// loop through
fun main() {
    val numbers = arrayOf(1, 2, 3)

    for (num in numbers) {
        println(num)
    }
}