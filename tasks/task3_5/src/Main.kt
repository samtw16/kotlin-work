// Task 3.5: simple file I/O

import kotlin.io.path.Path
import kotlin.io.path.appendText
import kotlin.io.path.readText
import kotlin.io.path.writeText

fun main() {
    val filepath = Path("test.txt")

    println("what would you like to write to the txt file? ")
    val content = readln()
    filepath.appendText("$content\n")

    val filecontent = filepath.readText()
    println(filecontent)
}
