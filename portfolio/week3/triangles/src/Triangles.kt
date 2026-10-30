#!/usr/bin/env kotlin


import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>



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
    require(isValidTriangle(triangle)) { "invalid triangle: $triangle" }
    val (a, b, c) = triangle

    val s = (a + b + c)*0.5
    var Area = s*(s-a)*(s-b)*(s-c)
    Area = Math.sqrt(Area)

    return Area

}