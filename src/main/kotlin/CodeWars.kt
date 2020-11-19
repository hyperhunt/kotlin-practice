fun main() {

}


/*function findOutlier(integers){
    const oddArray = [];
    const evenArray = [];
    for (let integer of integers) {
        if (integer % 2 === 0) {
            evenArray.push(integer);
        } else {
            oddArray.push(integer);
        }
    }  return oddArray.length === 1 ? oddArray[0] : eventArray[0];
}*/

/*fun findOutlier(integers: Array<Any>) {
    var oddArray = arrayOf<Int>()
    var evenArray = arrayOf<Int>()

    integers.forEach {
        if(it % 2 == 0) {
            evenArray += it
        }
        else {
            oddArray += it
        }
    }
    val res = evenArray.size
    println(res)
    return 1
}*/

//fun find(integers: String): Array<String> {
//    val arr =  integers
//        .split("")
//        .filter { it.toInt() % 2 != 0}
////        .joinToString("")
//        .toTypedArray()
//
//    return arr
//}

//fun main() {

//    val arr = arrayOf(2 , 4 , 0 , 100 , 4 , 11 , 2602 , 36)
//    val data = "1056521717190121104421713552117781".split("")
//
//    var arr = arrayOf<Int>()
//
//    data.forEachIndexed { index , element -> arr[index] = element.toInt() }
////    for (item in data) arr.apply { item.toInt() }
//    arr.forEach { it -> println(it) }
//    arr.forEach { it -> println(it) }
//    println(find(arr))

//    findOutlier(arr)

//    println(arr.joinToString(" "))

//    arr.forEach { i -> print("$i ") }
//    println("")
//
//    arr.forEachIndexed { index, element -> println("$index: $element") }

//    println((arr.filter { it % 2 != 0 }))

//    println(find(arrayOf(2 , 4 , 0 , 100 , 4 , 11 , 2602 , 36)))
//    println(Int.MAX_VALUE.toString())
//}

/*
fun main() {
    fun multiply(x: Double , y: Double): Double {
        return x * y
    }
}*/
