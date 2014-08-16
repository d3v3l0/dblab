/* Generated by AutoLifter © 2014 */

package ch.epfl.data
package legobase
package deep
package scalalib

import pardis.ir._
import pardis.ir.pardisTypeImplicits._

trait ArrayOps extends Base { this: DeepDSL =>
  implicit class ArrayRep[T](self: Rep[Array[T]])(implicit typeT: TypeRep[T]) {
    def length: Rep[Int] = arrayLength[T](self)(typeT)
    def apply(i: Rep[Int]): Rep[T] = arrayApply[T](self, i)(typeT)
    def update(i: Rep[Int], x: Rep[T]): Rep[Unit] = arrayUpdate[T](self, i, x)(typeT)
    override def clone(): Rep[Array[T]] = arrayClone[T](self)(typeT)
    def _length: Rep[Int] = array_Field__length[T](self)(typeT)
  }
  object Array {

  }
  // constructors
  def __newArray[T](_length: Rep[Int])(implicit typeT: TypeRep[T]): Rep[Array[T]] = arrayNew[T](_length)(typeT)
  // case classes
  case class ArrayNew[T](_length: Rep[Int])(implicit val typeT: TypeRep[T]) extends ConstructorDef[Array[T]](List(typeT), "Array", List(List(_length))) {
    override def curriedConstructor = (copy[T] _)
  }

  case class ArrayLength[T](self: Rep[Array[T]])(implicit val typeT: TypeRep[T]) extends FunctionDef[Int](Some(self), "length", List()) {
    override def curriedConstructor = (copy[T] _)
    override def isPure = true

  }

  case class ArrayApply[T](self: Rep[Array[T]], i: Rep[Int])(implicit val typeT: TypeRep[T]) extends FunctionDef[T](Some(self), "apply", List(List(i))) {
    override def curriedConstructor = (copy[T] _).curried
    override def isPure = true

  }

  case class ArrayUpdate[T](self: Rep[Array[T]], i: Rep[Int], x: Rep[T])(implicit val typeT: TypeRep[T]) extends FunctionDef[Unit](Some(self), "update", List(List(i, x))) {
    override def curriedConstructor = (copy[T] _).curried
  }

  case class ArrayClone[T](self: Rep[Array[T]])(implicit val typeT: TypeRep[T]) extends FunctionDef[Array[T]](Some(self), "clone", List(List())) {
    override def curriedConstructor = (copy[T] _)
  }

  case class Array_Field__length[T](self: Rep[Array[T]])(implicit val typeT: TypeRep[T]) extends FieldDef[Int](self, "_length") {
    override def curriedConstructor = (copy[T] _)
    override def isPure = true

  }

  // method definitions
  def arrayNew[T](_length: Rep[Int])(implicit typeT: TypeRep[T]): Rep[Array[T]] = ArrayNew[T](_length)
  def arrayLength[T](self: Rep[Array[T]])(implicit typeT: TypeRep[T]): Rep[Int] = ArrayLength[T](self)
  def arrayApply[T](self: Rep[Array[T]], i: Rep[Int])(implicit typeT: TypeRep[T]): Rep[T] = ArrayApply[T](self, i)
  def arrayUpdate[T](self: Rep[Array[T]], i: Rep[Int], x: Rep[T])(implicit typeT: TypeRep[T]): Rep[Unit] = ArrayUpdate[T](self, i, x)
  def arrayClone[T](self: Rep[Array[T]])(implicit typeT: TypeRep[T]): Rep[Array[T]] = ArrayClone[T](self)
  def array_Field__length[T](self: Rep[Array[T]])(implicit typeT: TypeRep[T]): Rep[Int] = Array_Field__length[T](self)
  type Array[T] = scala.Array[T]
  case class ArrayType[T](typeT: TypeRep[T]) extends TypeRep[Array[T]] {
    def rebuild(newArguments: TypeRep[_]*): TypeRep[_] = ArrayType(newArguments(0).asInstanceOf[TypeRep[_]])
    private implicit val tagT = typeT.typeTag
    val name = s"Array[${typeT.name}]"
    val typeArguments = List(typeT)
    val typeTag = scala.reflect.runtime.universe.typeTag[Array[T]]
  }
  implicit def typeArray[T: TypeRep] = ArrayType(implicitly[TypeRep[T]])
}
trait ArrayImplicits { this: ArrayComponent =>
  // Add implicit conversions here!
}
trait ArrayImplementations { self: DeepDSL =>

}
trait ArrayComponent extends ArrayOps with ArrayImplicits { self: DeepDSL => }

