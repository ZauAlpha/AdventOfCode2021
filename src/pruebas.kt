import java.io.File
fun main(){
 val input = File("src","rockPaperScissors.txt").readLines().map { it.split(",") }
}
