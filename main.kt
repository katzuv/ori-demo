fun main(args: Array<String>) {

    val ch = 'a'

    when(ch) {
        'a', 'e', 'i', 'o', 'u' -> println("$ch is vowel")
        else -> println("$ch is consonant")
    }
}
