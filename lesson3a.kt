fun main(){
    // for loop - it is used to execute a block of code/ statement a number os time until  a condition is met
    for (number in 1..10){
        println("The count is : $number")
    }
    println("============================")

    for (number in 50..65){
        println("The count is: $number")
    }

    println("======================")
    for(x in 20 .. 40 step 2){
        println(x)
    }

    println("========================")
    for(x in 20..40){
        if (x % 2 != 0){
            println(x)
        }
    }
     println("========================")
     


     for (x in 1 .. 5 ){
        val product = x * 5
        println("5 * $x = $product")
    

     }

     println("========================")
     // create a program that is able to find the factorial of number 5

     val num = 5
     var factorial =1
    for(i in 1..num){
        factorial = factorial * i
    println("Factorial of 5 is $factorial")

     
     


}
// chek on th edufference between local variables and global variables