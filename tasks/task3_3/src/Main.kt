fun main() {
    print("Enter your name: ")
    val name = readln()

    print("Enter your age: ")
    val age = readln().toDouble()

    val area = age * age
    System.out.printf("square of your age is %.2f\n",area)
    println("area = %.3f".format (area))

}
