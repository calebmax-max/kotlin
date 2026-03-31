// Inheritance is whereby a child class obtains the properties and behaviours of another class( Parent Class)

 open class Animal{
    // properties
    var name = "Name"

    // behaviours of the animal
    open fun walk(){
        println("The animal can walk")
    }
    fun sleep(){

        println("The animal can sleep")
    }
}

// Below class inherits from the super/ parent class animal
class Dog : Animal(){
    fun bark(){
        println("The dog likes barking.....")
    }

    override fun walk(){  // override-This tells Kotlin that you are replacing the parent’s implementation:
        println("The dog will run instead of walking..")
    }
}

fun main(){
    // create an object
    var myDog = Dog()

    // accessing the behaviours of a dog 
    myDog.bark()
    myDog.sleep()
    myDog.walk()
}