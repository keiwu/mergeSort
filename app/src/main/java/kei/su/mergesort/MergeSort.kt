package kei.su.mergesort

class MergeSort {
    fun mergeSort(a: ArrayList<Int>){
        if (a.size < 2)
            return

        val mid = a.size / 2
        var leftArray = arrayListOf<Int>()
        var rightArray = arrayListOf<Int>()

        for (i in 0 until mid){
            leftArray.add(a[i])
        }

        for (j in mid until a.size){
            rightArray.add(a[j])
        }

        mergeSort(leftArray)
        mergeSort(rightArray)
        merge(leftArray, rightArray, a)
    }

    // merge the left and right array to the array a.
    private fun merge(left: ArrayList<Int>, right: ArrayList<Int>, a: ArrayList<Int>){
        var i = 0
        var j = 0
        var k = 0

        while (i < left.size && j < right.size){
            if (left[i] < right[j]){
                a[k] = left [i]
                i++
            } else {
                a[k] = right[j]
                j++
            }


            k++
        }

        while (i < left.size){
            a[k] = left[i]
            i++
            k++
        }

        while (j < right.size){
            a[k] = right[j]
            j++
            k++
        }
    }
}