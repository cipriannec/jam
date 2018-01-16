package jam.sql

trait BackendAst[DBF[_], R[_], W[_]] { self: Backend[DBF, R, W] =>

  case class BindNode[A](fragment: Vector[Fr])    extends Expression[A]
  case class LiteralNode[A](fragment: Vector[Fr]) extends Expression[A]

}
