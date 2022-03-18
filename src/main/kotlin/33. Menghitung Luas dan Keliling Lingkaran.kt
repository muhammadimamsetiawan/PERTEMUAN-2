import kotlin.math.PI
fun main(args: Array<String>) {
    //Advanced exercise
    print("Enter the circle's radius (cm): ")
    val radius = readLine()!!.toDouble()
    var circumference = 2 * PI * radius
    var area = PI * radius * radius
    println("The circle's circumference based on the given radius is: " + circumference + " cm")
    println("Area of the circle is: " + area + " cm^2")
}
