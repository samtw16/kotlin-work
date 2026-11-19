// COMP2850: Week 4
// ToDoList class

import kotlinx.datetime.LocalDate
import kotlin.io.path.Path
import kotlin.io.path.forEachLine
import kotlin.io.path.writer

class ToDoList() {
    private val items = mutableListOf<ToDoItem>()

    val size get() = items.size
    val notStarted get() = items.count { it.status == ItemStatus.NotStarted }   //no. of items not started
    val inProgress get() = items.count { it.status == ItemStatus.InProgress }   //no. of items in progress
    val done get() = items.count { it.status == ItemStatus.Done }               //no. of items done
    val overdue get() = items.count { it.isOverdue() }                          //no. of overdue items

    constructor(filename: String): this() {
        load(filename)
    }

    fun load(filename: String) {
        Path(filename).forEachLine { line ->
            if (line.isNotBlank()) {
                //limit of 3 stops a ": " inside the description from breaking the split
                val (date, status, description) = line.split(": ", limit = 3)
                items.add(ToDoItem(LocalDate.parse(date), ItemStatus.valueOf(status), description))
            }
        }
    }

    fun save(filename: String) {
        Path(filename).writer().use {
            for (item in items) {
                it.write("$item\n")
            }
        }
    }

    fun add(vararg item: ToDoItem) = item.forEach { items.add(it) }

    //removeAll returns true if anything was removed
    fun deleteDone(): Boolean = items.removeAll { it.status == ItemStatus.Done }

    fun getItems(status: ItemStatus? = null): List<ToDoItem> =
        if (status == null) items.toList() else items.filter { it.status == status }

    fun getItemsDueOn(date: LocalDate): List<ToDoItem> = items.filter { it.dueDate == date }
}