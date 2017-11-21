fun NewYearCandles() {
    val nm = readLine()!!.split(' ')
    var n = nm[0].toInt()
    var m = nm[1].toInt()
    var c: Int = 0
    var ans: Int = 0

    while (n > 0) {
        ans++;n--;c++
        if (c == m) {
            c = 0
            n++
        }
    }
    println(ans)
}