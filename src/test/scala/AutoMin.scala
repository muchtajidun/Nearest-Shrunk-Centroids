/**
 * Created by felipemateosmartin on 11/11/15.
 */

import org.scalatest._
class AutoMin extends FlatSpec with Matchers{

  "A min"  should "return the minimun value in the array : " in {
    val vals:Array[Int] = Array[Int](1,2,3,4,5)
    println(vals.mkString(","))
    vals.min should be(1)

  }

}
