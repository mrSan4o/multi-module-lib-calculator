package examples.android.lib_calculator

object Calculator {

    private val operations = arrayOf(
        '+',
        '-',
        '/',
        '*'
    )

    fun calculate(text: String): String {

        println("calculate $text")

        return operations
            .find { text.contains(it) }
            ?.let {
                val split = text.split(it)
                return@let calculateNumbers(
                    split[0].toIntOrNull() ?: 0,
                    split[1].toIntOrNull() ?: 0,
                    it
                ).toString()
            }
            ?: ""
    }

    private fun calculateNumbers(
        i1: Int,
        i2: Int,
        operator: Char
    ): Int {

        println("CalculateNumbers $i1 $operator $i2...")
        return when (operator) {
            '+' -> i1 + i2
            '-' -> i1 - i2
            '*' -> i1 * i2
            '/' -> i1 / i2
            else -> 0
        }
    }
}