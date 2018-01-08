package edu.knoldus

class Searching {

  def binarySearch(array: Array[Int], elem: Int): Boolean = {
    val start=0
    val end=8
    val position:Int = binarySear(array,start,end,elem)
    if(position == -1) {
      false
    }
    else {
      true
    }
  }

  def linearSearch(array: Array[Int], elem: Int): Boolean = {
    for (i <- 0 to (array.length - 1)) {
      if (array(i) == elem) {
        true
      }
    }
    false
  }

  def binarySear(sortedArray: Array[Int], start: Int, end: Int, key: Int): Int =  {

    if (start < end) {
      val mid: Int = start + (end - start) / 2
      if (key < sortedArray(mid)) {
        return binarySear(sortedArray, start, mid, key)

      }
      else if (key > sortedArray(mid)) {
        return binarySear(sortedArray, mid + 1, end, key);
      }
      else {
        return mid;
      }
    }
    return -1
  }

}
