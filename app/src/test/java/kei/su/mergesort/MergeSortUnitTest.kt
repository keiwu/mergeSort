package kei.su.mergesort

import org.junit.Test
import org.junit.Assert.*
import org.junit.Before


class MergeSortUnitTest {

    private var a = ArrayList<Int>()
    private val mergeSort = MergeSort()

    @Before
    fun setup(){
        a = arrayListOf<Int>(2, 3, 5, 1, 4)
    }

    @Test
    fun testMergeSort(){
        mergeSort.mergeSort(a)

        assertEquals(a, arrayListOf<Int>(1, 2, 3, 4, 5))


    }
}