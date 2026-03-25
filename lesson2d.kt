fun main() {
    val marks = 30.5

if ( marks>= 0 && marks < 30){
    println("You Failed.")

}
else if(marks >30 && marks <= 50){
    println("Average.")

}
else if(marks >50 && marks <=70 ){
    println("Above Average.")
}
else if(marks > 70 && marks <=100){
    println("Passed")
}
else{
    println("Invalid score")
}
    
}