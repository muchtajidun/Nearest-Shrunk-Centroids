package com.nsc

/**
 * Created by felipemateosmartin on 11/11/15.
 */
import breeze.stats._
import breeze.linalg._
case class data(y:DenseVector[Double] , X:DenseMatrix[Double])

class SimulateData(nDim:Int,dDim:Int) {

  var simulatedData:data = data(DenseVector.zeros[Double](nDim),DenseMatrix.zeros[Double](nDim,dDim))

  def simulateNormal(classNumber:Int,params:List[(Double,Double)]):data={

    val y = {
              val randomClasses = breeze.stats.distributions.Uniform(0.0,classNumber.toDouble-1).sample(nDim)
              DenseVector(randomClasses.toArray)
    }
    val X = {
      val randomData = ( 1 to params.size).map{ case (mean,std) =>
                        (1 to nDim/params.size).map(_ => breeze.stats.distributions.Gaussian(mean,std).sample(nDim))}
      DenseMatrix(randomData.toArray)
    }
    data(y , X)
  }


}

object SimulateData {

  def apply(nDim:Int,dDim:Int) = new SimulateData(nDim:Int,dDim:Int)

}
