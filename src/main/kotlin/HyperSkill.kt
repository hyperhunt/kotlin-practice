fun main(args: Array<String>) {
    count7("7177")
}

private fun count7(number: String): Int {
    val j = 0
    var counter = 0
    val strNumber = number.toString()
    val i = strNumber.length
    if(j == i) {
        return counter
    }
    if(strNumber.substring(0 , 1) == "7") {
        println(strNumber.substring(0 , 1))
        counter++
    }
    val recur = count7(strNumber.substring(j + 1 , i))
    return counter + recur
}

/*fun main(args: Array<String>) {
//    println("Start...")

    while (true) {
//        val scanner: Array<String> = Scanner(System.`in`).nextLine().split(" ").toTypedArray()
        val scanner: String = Scanner(System.`in`).nextLine()
        val data = scanner.split(" ")
//        println(data[0])

        fun eq(value: String , data: List<String>): Int {
            var uniq: Int = 0
            data.forEachIndexed { _: Int , element: String ->
                if(value == element) {
                    uniq += 1
                }
            }
            return uniq
        }
        if()

        var unique: Boolean? = null
        data.forEachIndexed { index: Int , value: String ->
//            println("$index - $value")
            if(unique == null || unique != false) {
                unique = eq(value = value , data = data) < 2
//                println("unique: $unique, $index, $value")
            }
        }
        println(unique)
//        println("u: $unique")
//        println("...")
    }
}*/
/*
        fun eq(value: String , data: List<String>): Int {
            var uniq: Int = 0
            data.forEachIndexed { index: Int , element: String ->

                if(value == element) {
                    uniq += 1
                }
            }
            return uniq
        }

        var unique = 0
        data.forEachIndexed() { index: Int , value: String ->
//            println("$index - $value")
            if(unique <= 1) {
                unique = eq(value , data)
            }
        }
        println("u: $unique")
        println("...")
*/

////        var unique: Boolean? = null
//        println(scanner)

//        println(scanner.get(0))
//        println(scanner.get(1))

/*
        for (check in scanner.withIndex()) {
//            println("check: ${check.index} - ${check.value}")
            scanner.forEachIndexed() { index , element ->
//                println("$index : $element")
                if(element != check.value) {
                    println("${element} != ${check.value}")
                    unique += 1
                }

            }


        }
*/

//


/*    for (one in scanner.indices) {
    for (two in scanner.indices) {
        if(one == two) {
            println("A[one]: ${scanner[one]}")
            if(scanner.get(one) != scanner.get(two)) println("B[one]: ${scanner.get(one)}")
        }
    }
}*/

//        println("$unique")


//index 0, value 1
//i 3, item 1

/*    while (true) {
        val scanner: Int = Scanner(System.`in`).nextInt()
        if (scanner in 1..9) {
            println("true")
        } else {
            println("false")
        }
    }*/


//    val scanner: Scanner = Scanner(System.`in`)
//
//    val i = scanner.nextInt()
//    println(abs(i % 10))


//    println(scanner[scanner.size-1])

//    println("Start...")
//    val a = readLine()!!.toInt()
//    val b = readLine()!!.toFloat()
//    val c = readLine()!!
//
//    println(a)
//    println(b)
//    println(c)

//    val a: Byte = 100              //1
//    val b: Byte = 127             //2
//    val c: Byte = (100 + 100).toByte()        //3
//    val d: Byte = (a + a).toByte()            //4
//    val e: Byte = (a + a).toByte() //5

//    val n: Int = readLine()?.toInt() ?: 0

//    val i = 101
//    val d = 3.1415
//    val s = "32"
//
//    i.toDouble()
//    d.toLong()
//    d.toString()
//    s.toInt()


/*    val scanner = Scanner(System.`in`)
    val s1 = scanner.nextLine()
    val n = scanner.nextInt()
    val s2 = scanner.next()

//    println("scanner: $scanner")
    println("s1: $s1")
    println("n: $n")
    println("s2: $s2")*/
