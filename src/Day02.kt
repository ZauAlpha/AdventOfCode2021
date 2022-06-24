fun main(){
    fun part1(input : List<String>): Int{
        var y =0
        var x =0
        val operations = input.map{ it.split(' ') }
        for ((direction, num) in operations){
            val amount = num.toInt()
            when(direction) {
                "up" -> y -= amount
                "down" -> y += amount
                "forward"->x += amount
            }
        }
        return x*y
    }
    fun part2(input : List<String>): Int{
        var aim=0
        var y =0
        var x =0
        val operations = input.map{ it.split(' ') }
        for ((direction, num) in operations){
            val amount = num.toInt()
            when(direction) {
                "up" -> aim -= amount
                "down" -> aim += amount
                "forward"->{
                    x+=amount
                    y+=amount*aim
                }
            }
        }
        return x*y
    }
    val input = readInput("Day2")
    println(part1(input))
    println(part2(input))

}