// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here

fun isValidTriangle(triangle: Triangle): Boolean{
    val (side1, side2, side3) = triangle
    if (side1 < side2 +side3 && side2 <side1+side3 && side3<side1+side2){
        return true
    }
    else{
        return false
    }

}

fun triangleArea(triangle: Triangle): Double{
    val (a, b, c) = triangle

    val s = (a + b + c)*0.5
    var Area = s*(s-a)*(s-b)*(s-c)
    Area = Math.sqrt(Area)

    return Area

}