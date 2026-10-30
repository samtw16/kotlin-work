// Task 7.7.1: statistics functions
// returns the middle value
fun median(values: List<Float>): Float {
    require(values.isNotEmpty()) { "cant find the median of an empty list" }
    val sorted = values.sorted()
    val middle = sorted.size / 2

    return if (sorted.size % 2 == 1) {
        // odd number of values
        sorted[middle]
    } else {
        // even number of values
        (sorted[middle - 1] + sorted[middle]) / 2
    }
}


fun displayStats(values: List<Float>) {
    println("number of values: ${values.size}")
    println("minimum: %.2f".format(values.min()))
    println("maximum: %.2f".format(values.max()))
    println("mean:    %.2f".format(values.average()))
    println("median:  %.2f".format(median(values)))
}