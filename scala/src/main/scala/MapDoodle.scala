import scala.language.postfixOps

object MapDoodle {
  def main(args: Array[String]): Unit = {


    val maList = List(Example("A", 1), Example("B", 2), Example("C", 3))


//    val maMap = maList.map { example =>
//      (example.value, example.number)
//    } toMap
//
//
//    println(maMap.getOrElse("B", "PASTROUVE"))
    //    list.par.foreach(cool)
  }

  case class Example(value: String, number: Int)

}