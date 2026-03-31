class Circle{
    //properties
    var radius = 7
    var pie = 3.142

    // Some of the behaviours
    fun circleArea(){
        val areaOfCircle = pie * radius * radius
        println("The area of the circle is: " + areaOfCircle)
    }

    fun circleCircumference (){
        val circumference = 2 * pie * radius
        println("The circumference of the circle is: " + circumference)
    }

}
//create a class for a rectangle and find the area as well as the perimeter of the rectangle

class Rectangle{
    // properties
    var length = 10
    var width = 5
     fun rectangleArea(){
        var area = length * width
        println("The area is " + area)
     }
     fun rectanglePerimeter(){
        var perimeter = 2  * ( length + width)
        println("The perimeter is "+ perimeter)

     }
}

fun main(){
    // Below is our object
    var myCircle = Circle()

    myCircle.circleArea()

    var myObject = Rectangle()
    myObject.rectangleArea()
}