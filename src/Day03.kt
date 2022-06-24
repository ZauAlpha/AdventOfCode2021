fun main(){
    val input = readInput("Day3")
    println(part1(input))
    println(part2(input))
    println(part3(input))
}
fun part1(input : List<String>): Int{

    val bit : MutableList<Int> = MutableList(input[0].length){0}
    for(line in input){
        for (i in line.indices){
            if(line[i]=='1'){
                bit[i]++
            }
        }
    }
    val total = input.size
    var gama=""
    var epsilon=""
    for (i in input[0].indices) {
        if (total - bit[i] < bit[i]) {
            gama+='1'
            epsilon+='0'
        }else if (total - bit[i]>bit[i]){
            gama+='0'
            epsilon+='1'
        }
    }
    println("gama :    $gama")
    println("epsilon : $epsilon")
    return gama.toInt(2)*epsilon.toInt(2)
}
fun part3(input : List<String>): Int{
    val columns = input[0].indices
    for(column in columns){
        val (zeroes,ones) =input.countBitsColums(column)

    }
    return 0
}
fun part2(input:List<String>):Int{
    var oxygen = input
    var carbonDioxide = input
    for (i in input[0].indices){
        val (zeroes,ones)=oxygen.countBitsColums(i)
        if(oxygen.size==1){
            break
        }
        oxygen = if(ones>=zeroes){
            filtrateOnes(oxygen,i)
        }else {
            filtrateZeros(oxygen,i)
        }

    }
    for (i in input[0].indices){
        val (zeroes,ones)=carbonDioxide.countBitsColums(i)
        if(carbonDioxide.size==1){
            break
        }
        carbonDioxide = if(zeroes<=ones){
            filtrateZeros(carbonDioxide,i)
        }else {
            filtrateOnes(carbonDioxide,i)
        }
    }

return oxygen[0].toInt(2)* carbonDioxide[0].toInt(2)
}
fun filtrateOnes(input :List<String>, num:Int):List<String>{
    return input.filter{ it[num]=='1' }

}
fun filtrateZeros(input :List<String>, num:Int):List<String>{
    return input.filter{ it[num]=='0' }

}
private fun List<String>.countBitsColums(colum:Int): BitCount {
    var zeroes = 0
    var ones = 0
    for(line in this ){
        if(line[colum]=='0') zeroes++ else ones++
    }
    return BitCount(zeroes,ones)
}
data class BitCount(val zeroes:Int, val ones :Int)