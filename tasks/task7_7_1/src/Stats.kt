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
    println("Number of values: ${values.size}")
    println("Minimum: %.2f".format(values.min()))
    println("Maximum: %.2f".format(values.max()))
    println("Mean:    %.2f".format(values.average()))
    println("Median:  %.2f".format(median(values)))
}