/* Generated by Purgatory 2014-2015 */

package ch.epfl.data.dblab.legobase.deep.storagemanager
import ch.epfl.data.sc.pardis
import pardis.ir._
import pardis.types.PardisTypeImplicits._
import pardis.effects._
import pardis.deep._
import pardis.deep.scalalib._
import pardis.deep.scalalib.collection._
import pardis.deep.scalalib.io._

import ch.epfl.data.dblab.legobase.deep._
import ch.epfl.data.dblab.legobase.deep.queryengine._
import ch.epfl.data.dblab.legobase.schema._
import scala.reflect._

trait LoaderOps extends Base with K2DBScannerOps with ArrayOps with OptimalStringOps { this: ch.epfl.data.dblab.legobase.deep.DeepDSL =>
  // Type representation
  val LoaderType = LoaderIRs.LoaderType
  implicit val typeLoader: TypeRep[Loader] = LoaderType
  implicit class LoaderRep(self: Rep[Loader]) {

  }
  object Loader {
    def getFullPath(fileName: Rep[String]): Rep[String] = loaderGetFullPathObject(fileName)
    def loadString(size: Rep[Int], s: Rep[K2DBScanner]): Rep[OptimalString] = loaderLoadStringObject(size, s)
    def fileLineCount(file: Rep[String]): Rep[Int] = loaderFileLineCountObject(file)
    def loadTable[R](table: Rep[Table])(implicit typeR: TypeRep[R], c: ClassTag[R]): Rep[Array[R]] = loaderLoadTableObject[R](table)(typeR, c)
  }
  // constructors

  // IR defs
  val LoaderGetFullPathObject = LoaderIRs.LoaderGetFullPathObject
  type LoaderGetFullPathObject = LoaderIRs.LoaderGetFullPathObject
  val LoaderLoadStringObject = LoaderIRs.LoaderLoadStringObject
  type LoaderLoadStringObject = LoaderIRs.LoaderLoadStringObject
  val LoaderFileLineCountObject = LoaderIRs.LoaderFileLineCountObject
  type LoaderFileLineCountObject = LoaderIRs.LoaderFileLineCountObject
  val LoaderLoadTableObject = LoaderIRs.LoaderLoadTableObject
  type LoaderLoadTableObject[R] = LoaderIRs.LoaderLoadTableObject[R]
  // method definitions
  def loaderGetFullPathObject(fileName: Rep[String]): Rep[String] = LoaderGetFullPathObject(fileName)
  def loaderLoadStringObject(size: Rep[Int], s: Rep[K2DBScanner]): Rep[OptimalString] = LoaderLoadStringObject(size, s)
  def loaderFileLineCountObject(file: Rep[String]): Rep[Int] = LoaderFileLineCountObject(file)
  def loaderLoadTableObject[R](table: Rep[Table])(implicit typeR: TypeRep[R], c: ClassTag[R]): Rep[Array[R]] = LoaderLoadTableObject[R](table)
  type Loader = ch.epfl.data.dblab.legobase.storagemanager.Loader
}
object LoaderIRs extends Base {
  import K2DBScannerIRs._
  import ArrayIRs._
  import OptimalStringIRs._
  // Type representation
  case object LoaderType extends TypeRep[Loader] {
    def rebuild(newArguments: TypeRep[_]*): TypeRep[_] = LoaderType
    val name = "Loader"
    val typeArguments = Nil
  }
  implicit val typeLoader: TypeRep[Loader] = LoaderType
  // case classes
  case class LoaderGetFullPathObject(fileName: Rep[String]) extends FunctionDef[String](None, "Loader.getFullPath", List(List(fileName))) {
    override def curriedConstructor = (copy _)
  }

  case class LoaderLoadStringObject(size: Rep[Int], s: Rep[K2DBScanner]) extends FunctionDef[OptimalString](None, "Loader.loadString", List(List(size, s))) {
    override def curriedConstructor = (copy _).curried
  }

  case class LoaderFileLineCountObject(file: Rep[String]) extends FunctionDef[Int](None, "Loader.fileLineCount", List(List(file))) {
    override def curriedConstructor = (copy _)
  }

  case class LoaderLoadTableObject[R](table: Rep[Table])(implicit val typeR: TypeRep[R], val c: ClassTag[R]) extends FunctionDef[Array[R]](None, "Loader.loadTable", List(List(table)), List(typeR)) {
    override def curriedConstructor = (copy[R] _)
  }

  type Loader = ch.epfl.data.dblab.legobase.storagemanager.Loader
}
trait LoaderImplicits extends LoaderOps { this: ch.epfl.data.dblab.legobase.deep.DeepDSL =>
  // Add implicit conversions here!
}
trait LoaderImplementations extends LoaderOps { this: ch.epfl.data.dblab.legobase.deep.DeepDSL =>
  override def loaderLoadStringObject(size: Rep[Int], s: Rep[K2DBScanner]): Rep[OptimalString] = {
    {
      val NAME: this.Rep[Array[Byte]] = __newArray[Byte](size.$plus(unit(1)));
      s.next(NAME);
      __newOptimalString(byteArrayOps(NAME).filter(__lambda(((y: this.Rep[Byte]) => infix_$bang$eq(y, unit(0))))))
    }
  }
}

trait LoaderPartialEvaluation extends LoaderComponent with BasePartialEvaluation { this: ch.epfl.data.dblab.legobase.deep.DeepDSL =>
  // Immutable field inlining 

  // Mutable field inlining 
  // Pure function partial evaluation
}
trait LoaderComponent extends LoaderOps with LoaderImplicits { this: ch.epfl.data.dblab.legobase.deep.DeepDSL => }
