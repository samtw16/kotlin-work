// Task 4.2: use of if and ranges

fun main() {
    println("Hi there, what would you like to order?: ")
    println("a. cheese")
    println("b. tomato")
    println("c. mushroom")
    println("d. olive ")
    print("please enter a, b, c, d to order: ")
    val order = readln().lowercase()

    if (order.length == 1 && order[0] in 'a'..'d') {
        val choice = order[0]
        if (choice == 'a') {
            println("cheese being made")
        }
        else if (choice == 'b') {
            println("tomato being made")
        }
        else if (choice == 'c') {
            println("mushroom being made")
        }
        else {
            println("olive being made")
        }
    }
    else {
        println("incorrect input. please enter a, b, c or d")
    }

}
