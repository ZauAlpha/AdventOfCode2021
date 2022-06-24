import java.io.File
import java.math.BigInteger
import java.security.MessageDigest

/**
 * Reads lines from the given input txt file.
 */
fun readInput(name: String) =
      File("src", "$name.txt").readLines()
/*
 * Reads Lines from the given file and give a list of Int
 */
fun readInputAsInt(name: String) =
      File("src", "$name.txt").readLines().map{it.toInt()}
/**
 * Converts string to md5 hash.
 */
fun String.md5(): String = BigInteger(1, MessageDigest.getInstance("").digest(toByteArray())).toString(16)
