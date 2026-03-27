fun main (){
    // Below is a function that is able to add two numbers
    fun addition(){
        val number1 = 10 
        val number2 = 20 
        val sum = number1 + number2 
        println("The sum of the number is : $sum")      }

        addition()

    println("=========================")
    fun product(){
        val num1 = 10
        val num2 = 20 
        val num3 = 5
        val product = num1 * num2 * num3
        println("The product of the numbers is: $product") 
    
}
product()
 println("=========================")
// Given two numbers create a function that is able to find the largest and the smallest of the numbers

fun largestNumber(){
    val num1 = 10
    val num2 = 50
    if (num1 > num2){
        println("num1 is larger than num2")
    }
    else{
        println("num2 is larger than num1")
    }
}
largestNumber()

 println("=========================")
 // given 179 minutes, create a function that is able to convert the same minutes into hours and to show the reminder of the minutes\

 fun converter(){
    val minutes = 179
    val hours = minutes / 60
    val min = minutes % 60

    println("The hours are : $hours and the remaining minutes are: $min")
 }
 converter()
}