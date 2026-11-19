// COMP2850 Portfolio: Week 4
// Triangle class

import kotlin.math.sqrt
import kotlin.plus

class Triangle(val sideA: Double, val sideB: Double, val sideC: Double){

    //secondary constructor: lets write triangle(3.0) for a equaltrial triangle
    constructor(side: Double): this(side,side,side)


    init {
        require(sideA > 0.0 && sideB > 0.0 && sideC > 0.0 && sideA < sideB +sideC && sideB <sideA+sideC && sideC<sideA+sideB){
            "all sides of the triangle must be positive values and must be valid lengths, got $sideA $sideB $sideC"
        }
    }

    //compute the properties
    val area: Double
        get() {
            val s = (sideA + sideB + sideC)*0.5
            var area = s*(s-sideA)*(s-sideB)*(s-sideC)
            area = Math.sqrt(area)
            return area
        }

    val perimeter: Double
        get() = (sideA + sideB + sideC)

    val semiPerimeter: Double
        get() = (sideA + sideB + sideC)/2



    override fun toString() = "Triangle($sideA, $sideB, $sideC)"
}