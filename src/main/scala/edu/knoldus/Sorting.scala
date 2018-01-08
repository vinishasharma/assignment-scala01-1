package edu.knoldus

class Sorting {

  def insertionSort(array: Array[Int]): Array[Int] = {
    for(i <- 0 until array.length){

      val position = array(i)
      var holdingPosition = i

      while(holdingPosition > 0 && position < array(holdingPosition - 1)){
        array(holdingPosition) = array(holdingPosition - 1)
        holdingPosition -= 1
      }

      array(holdingPosition) = position
    }

    array
  }

  def selectionSort(array: Array[Int]): Array[Int] = {
    for(i <- 0 until array.length){
      var position = i
      for(j <- i + 1 until array.length)
        if(array(j) < array(position)) {
          position = j
        }

      if(position != i){
        val temp = array(i)
        array(i) = array(position)
        array(position) = array(i)
      }
    }
    array
  }

  def bubbleSort(array: Array[Int]): Array[Int] = {
    for (i <- (0 until array.length)) {
      for (j <- (0 until array.length)) {
        if (array(i) < array(j)) {
          val swap = array(i)
          array(i) = array(j)
          array(j) = swap
        }
      }
    }
    array
  }

}
