// Round a Number using DecimalFormat

import java.math.RoundingMode
import java.text.DecimalFormat

fun main() {
    val num = 1.34587
    val df = DecimalFormat("#.###")
    df.roundingMode = RoundingMode.CEILING

    println(df.format(num))
}