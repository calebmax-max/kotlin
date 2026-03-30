import kotlin.math.pow
fun main(){
     // Create a function that accepts parameter that is able to do the conversion of degree celcius into farenheit.......

     fun converter( degrees : Double){
       val farenheit = (degrees * 9/5 ) + 32

       println("The farenheit is equal to : $farenheit.")


     }
     converter(25.2)


      println("===========================================================")
     fun convert (farenheit : Double){
        val degrees = (5.0 / 9) * (farenheit - 32 )

        println("The degrees is equal to : $degrees")
     }
     convert(77.3)

     println("===========================================================")
     // Create a function that is able to calculate the compound interest of a person.
   

     fun compoundInterest( principal : Double, rate : Double, number: Int, time : Double )
//A student deposits KSh 20,000 in a bank account that earns 8% annual interest, compounded quarterly, for 3 years.
    {
          val answer =  principal * (1 + (rate/number)) .pow(number * time) - principal

      println("The compund interest is : $answer")
    }
    compoundInterest(20000.0, 0.08, 4 , 3.0)


  println("===========================================================")
  // Research on inheritance in kotlin. Come up with an example of a program
//1️⃣ What is Inheritance?

//Inheritance is an OOP concept where one class (child/subclass) inherits properties and functions from another class (parent/superclass).

//Allows code reuse.
//Supports polymorphism.

//In Kotlin, all classes are final by default (cannot be inherited) unless you mark them with open.

//2️⃣ Declaring a Superclass
open class Vehicle(val brand: String, val year: Int) {
    fun start() {
        println("$brand is starting")
    }

    open fun honk() {
        println("$brand is honking!")
    }
}
//open → allows other classes to inherit from it.
//Functions that you want to override must also be open.
//3️⃣ Declaring a Subclass
class Car(brand: String, year: Int, val doors: Int) : Vehicle(brand, year) {
    override fun honk() {
        println("$brand car honks loudly!")
    }

    fun carInfo() {
        println("Brand: $brand, Year: $year, Doors: $doors")
    }
}
//: Vehicle(brand, year) → syntax to call the parent constructor.
//override → required to override an open function.
//Car automatically has start() from Vehicle.
//4️⃣ Using the Classes
fun main() {
    val myCar = Car("Toyota", 2020, 4)

    myCar.start()        // inherited from Vehicle
    myCar.honk()         // overridden function
    myCar.carInfo()      // specific to Car
}

//Output:

//Toyota is starting
//Toyota car honks loudly!
//Brand: Toyota, Year: 2020, Doors: 4
//5️⃣ Key Points About Inheritance in Kotlin
//open is required for:
//Classes that can be inherited.
//Functions that can be overridden.
//final is default:
//You cannot inherit or override unless marked open.
//override is mandatory:
//Every overridden function must explicitly use override.

//Calling Parent Functions:

override fun honk() {
    super.honk()  // calls parent version
    println("$brand car honks loudly!") // additional behavior
}
//Multiple Inheritance Limitation:
//Kotlin does not support multiple class inheritance.
//Can implement multiple interfaces.
//6️⃣ Example with Interfaces (Multiple Inheritance)
interface Electric {
    fun charge()
}

class ElectricCar(brand: String, year: Int, doors: Int) : Vehicle(brand, year), Electric {
    override fun honk() {
        println("$brand electric car honks quietly!")
    }

    override fun charge() {
        println("$brand is charging...")
    }
}
//: → used for extending a class and implementing interfaces.
//You can override multiple functions from different sources.
//7️⃣ Summary Table
//Concept	Kotlin Syntax / Notes
//Make class inheritable	open class ClassName
//Inherit a class	class SubClass : SuperClass()
//Override a function	override fun functionName()
//Call parent function	super.functionName()
//Default behavior	final → cannot inherit or override
//Multiple inheritance	Not allowed for classes, only interfaces

} 


     
     
    