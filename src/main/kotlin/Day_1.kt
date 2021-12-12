import java.io.File


fun main(args: Array<String>) {

    val sample = File("C:/Users/Oskar/IdeaProjects/AdventOfCode2021/Day1/Sample.txt")
    val data = File("C:/Users/Oskar/IdeaProjects/AdventOfCode2021/Day1/Data.txt")


    val imput = data
    var counter = 0
    var a: Int = 0




    imput.forEachLine {

        if (a == 0){
            print(it)
            println(" (N/A - no previous measurement)")
        } else {
            print(it)
            if (it.toInt() > a) {
                println("(increased)")
                counter++
            } else {
                println("(Decresed)")
            }

        }
        a = it.toInt()
    }
    println()
    println("The number of times a depth measurement increases: $counter")
}






