import java.io.File
import java.lang.Integer.min

private val input = File("./src/main/kotlin/input14.txt").readLines().map { it.split(" ") }
    .map {
        Raindeer(it[0], it[3].toInt(), it[6].toInt(), it[13].toInt())
    }

fun main() {
    println(input.maxOf { it.compute(2503) })
}

class Raindeer(
    val name: String, //xd
    val velocity: Int,
    val flightTime: Int,
    val restTime: Int
) {
    fun compute(time: Int): Int =
        ((time / (flightTime + restTime) * flightTime) + min(time % (flightTime + restTime), flightTime)) * velocity
}