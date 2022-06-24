fun main() {
    fun part1(input: List<Int>): Int {
        return input.windowed(2).count{(a,b)->a<b}
    }
    fun part2(input: List<Int>): Int {
        return input.windowed(4).count{
            it[0]<it[3]
        }
    }

    // test if implementation meets criteria from the description, like:

    val input : List<Int> = readInputAsInt("Day1")
    println(part1(input))
    println(part2(input))

}
