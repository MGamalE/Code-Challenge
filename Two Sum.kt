package main.kotlin


fun twoSum(nums: IntArray, target: Int): IntArray {
    val firstIterationArray: IntArray = nums
    val secondIterationArray: IntArray = nums
    val addUpSumArray = intArrayOf(2)
    var count = 0

    for (i in firstIterationArray.indices) {
        for (j in secondIterationArray.indices) {
            val sum = firstIterationArray[i] + secondIterationArray[j]
            if (sum == target && i != j) {
                addUpSumArray[count] = i
                count++
            }
        }
        if (count == 2) break
    }

    return addUpSumArray
}

fun main(args: Array<String>) {
    val resut = twoSum(intArrayOf(2,7,11,15), 9)

    for (item in resut) {
        println(item)
    }
}

