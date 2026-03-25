fun main() {
    // When statement - It is like a switch case in other languages. It checks a value against multiple conditions and executes the matching block.
    val marks = 7
    when(marks){
        in 1 .. 30 -> println("You Failed")
        in 31 .. 50 -> println("You have Average")
        in 51 .. 70 -> println("Above Average")
        in 71 .. 100 -> println("You Passed")
        else -> println("Invalid scores....")
    }
    
}