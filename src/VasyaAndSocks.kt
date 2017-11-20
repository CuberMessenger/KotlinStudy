fun VasyaAndSocks() {
    val nm = readLine()!!.split(' ')
    var n = nm[0].toInt()
    var m = nm[1].toInt()
    var ans: Int = 0
    for (i in 1..Int.MAX_VALUE) {
        if (n == 0) break;
        ans++
        if (i % m != 0) n--
    }
    println(ans)
}