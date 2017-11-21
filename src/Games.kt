fun Games() {
    var n = readLine()!!.toInt()
    val a: MutableList<Int> = ArrayList<Int>()
    val b: MutableList<Int> = ArrayList<Int>()
    var ans: Int = 0

    while (n-- > 0) {
        val ab = readLine()!!.split(' ')
        a.add(ab[0].toInt())
        b.add(ab[1].toInt())
    }

    for (i in a)
        ans += b.filter { j -> j == i }.size

    println(ans)
}