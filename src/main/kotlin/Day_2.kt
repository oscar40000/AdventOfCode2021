import java.io.File

fun main(args: Array<String>) {
    val sample = File("C:/Users/Oskar/IdeaProjects/AdventOfCode2021/Day2/sample.txt")
    val data = File("C:/Users/Oskar/IdeaProjects/AdventOfCode2021/Day2/data.txt")

    val imput = data

    var x = 0
    var y = 0

    imput.forEachLine {

        if(it.contains("forward")){
            x = x + it.takeLast(1).toInt()


        }
        if(it.contains("down")){
            y = y + it.takeLast(1).toInt()

        }
        if(it.contains("up")){
            y = y - it.takeLast(1).toInt()

        }
        println(it.takeLast(1).toInt())


    }
    println("1 PART")
    println("your position is x=$x , y=$y")
    println("Your answer is ${x*y}")
    println()
    println("2 PART")

    x=0
    y=0
    var aim =0

    imput.forEachLine {
        val v = it.takeLast(1).toInt()
        if(it.contains("forward")){
           if (aim ==0){
               x = x + v
           }else
               x = x + v
                y = y + (v*aim)


        }
        if(it.contains("down")){
            aim = aim +v

        }
        if(it.contains("up")){
            aim = aim -v

        }
        println(" $it      x=$x y=$y aim=$aim")


    }
    println("your position is x=$x , y=$y")
    println("Your answer is ${x*y}")

















}

