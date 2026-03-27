fun main(){
    // Functions with parameters
    // Parameters are inputs that get passed as arguments when invoking a function
    // Note: For the parameters to work  you must specify their data types

    fun greeting(name : String){
        println( "Hello $name, Hope you had a good Day?")

    }
    // When the function is invoked , you pass a given name as an argument.
    greeting("Caleb")
    greeting("Faith")

     println("=========================")
     //Below is an example of a functionable to calculate the bmi of a person

     fun BMI (weight : Double, height : Double){
        val answer = weight / (height * height)

        println("The BMI of the person is: " + answer)

     }
     BMI(69.5, 1.73)
     BMI(58.6, 1.87)

      println("=========================")
     // Create a function that accepts parameters and checks whether a given number is old or even

     fun number(num : Int){
        if(num % 2 == 0){
            println("The number is even.")
        }
        else{
            println("The number is odd.")
        }
     }
     number(10)

     // Create a function that accepts parameter that is able to do the conversion of degree celcius into farenheit.......
     // Create a function that is able to calculate the compound interest of a person.
     // Research on inheritance in kotlin. Come up with an example of a program

    
}