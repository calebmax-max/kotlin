fun main(){
    // functions without parameters
    // pg 29 and 30
    //Assignment 1. Create a For loop to print year from 2000 to 2025 2. Create a For loop to print from 100 to 1
    //Assignment 1. Create a while loop to print from -20 to +20 2. Create a while loop to print all EVEN years from 2000 to 2025.
    var counties = arrayOf("Nairobi", "Mombasa", "Kisumu", "Nakuru", "kericho", "Bungoma", "Kitui")
    for(county in counties){
        println(county)
    
    }

    println("==============================================")
var year = 2000
for( year in 2000.. 2025 ){ 
    println(year)}

    println("==============================================")

var num = 100
for(num in 100 downTo 1){
    println(num)

    println("==============================================")
var count = -20
while(count<=20){
    println(count)
    count=count+1
}
println("==============================================")

var y =2000
while(y <= 2025){
    if(y % 2 == 0){
        println(y)
    }
    y = y + 1
}
}



//A function without parameters is a function that does not take any input values. It simply performs a task when called.
fun greet()// this is the function without parameter {
    println("Hello, welcome!")
}

fun main() {
    greet()  // calling the function
}

fun showEvenYears() {
    var year = 2000
    while (year <= 2025) {
        println(year)
        year += 2
    }
}

fun main() {
    showEvenYears()
}
}