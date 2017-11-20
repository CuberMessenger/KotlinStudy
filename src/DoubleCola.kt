fun DoubleCola() {
    val names = arrayOf("Sheldon", "Leonard", "Penny", "Rajesh", "Howard")
    var n = readLine()!!.toInt()
    var min: Int = 1
    var max: Int = 0
    for (k in 0..Int.MAX_VALUE) {
        var t = (Math.pow(2.0, k.toDouble())).toInt()
        min += 5 * (t / 2)
        max += 5 * t
        if (n <= max) {
            n = (n - min) / t
            println(names[n])
            break
        }
    }
}