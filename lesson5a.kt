class Person{
    // Attributes/Characteristics/properties of a person
    var name = "Caleb"
    var age = 19
    var height = 70.7
    var weight = 60

    // Behaviours/ Actions
    fun walk(){
        println("The person can walk")
    }
    fun speak(){
        println("The person ca speak")
    }

    fun sing(){
        println(
            "The person can sing."
        )
    }
    fun dance(){
        println("The person can dance")
    }

}

fun main(){
    // Object is a real world thing
    // An object is intanciated/ created/ obtained/ emmanated from class
    // For us to be able either access the properties / behaviours of a class we require to have an object
    // Belwo we create an object
    var myObject = Person()
    // Below we use the dot separator to access either the function or the properties
    myObject.walk()

    println("The age of the person is : " + myObject.age)

    myObject.sing()
    myObject.dance()

}