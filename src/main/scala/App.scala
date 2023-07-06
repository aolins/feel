import org.camunda.feel.FeelEngine

object A extends App{
  val en = new FeelEngine
  val vars = Map( ("a", 1),("b", 2),("c", "elsevalue"), ("condition", true))
  val expression = """ if condition then a/b else c"""
  val result = for (
    parsed <- en.parseExpression(expression);
    result <- en.eval(parsed, vars)
  ) yield result
  result match {
    case Right(rs) => println(s"evaluated result = $rs")
    case Left (x) => throw new RuntimeException (x.message)
  }

}
