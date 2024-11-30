/*Даны два целочисленных массива nums1 и nums2.
Требуется вернуть массив их пересечения состоящий из уникальных элементов. Расположение элементов в итоговом массиве может быть любым.
Можно использовать библиотечные методы. Сравнить время выполнения для каждого тестового примера со временем выполнения таких же примеров,
но без использования библиотечных функций (Задача 2)*/

import kotlin.system.measureTimeMillis
// intersection (с англ) - пересечение
fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
    val set1 = nums1.toSet()
    val set2 = nums2.toSet()
    val result = mutableListOf<Int>()
    for (num in set1)
        if (set2.contains(num))
            result.add(num)

    return result.toIntArray()
}

fun readInt(): IntArray {
    return readLine()?.split(Regex("[,\\s]+"))?.map { it.toInt() }?.toIntArray() ?: intArrayOf()
}

fun main() {
    print("| Первый массив: ")
    val nums1 = readInt()
    print("| Второй массив: ")
    val nums2 = readInt()

/*    var nums1 = intArrayOf(1,2,2,1)
    var nums2 = intArrayOf(2,2)
    testintersection(nums1, nums2)
    nums1 = intArrayOf(4,9,5)
    nums2 = intArrayOf(9,4,9,8,4)
    testintersection(nums1, nums2)*/
}

fun testintersection(nums1: IntArray, nums2: IntArray) {
    val startTime = System.currentTimeMillis()
    val result = intersection(nums1, nums2)
    val endTime = System.currentTimeMillis()
    val time = endTime - startTime
    println("Вывод: ${result.contentToString()}, Время: $time мс")

    val explanation = when (result.size) {
        2-> "Пояснение: [${result[1]}, ${result[0]}] тоже можно"
        else -> "Пояснение: отсутствует"
    }
    println(explanation)
}