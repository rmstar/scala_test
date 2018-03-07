import java.util.concurrent.atomic._
import akka.actor._

object SingleProducer extends App {
  val actorSystem = ActorSystem("Actors")

  class StringPersister extends Actor {
    def receive = {
      case str: String => println(str)
    }
  }

  val persister = actorSystem.actorOf(Props[StringPersister])

  val list = List("foo", "bar", "sha", "baz")

  /*class StringToUpperProducer extends Actor {
    def receive = {
      case 'GO => list.foreach(persister ! _.toUpperCase)
    }
  }*/
 object StringToUpperProducer {
   val index : AtomicInteger = new AtomicInteger(0)
 }
 class StringToUpperProducer extends Actor {
   def receive = {
     case 'GO => {
       var index = StringToUpperProducer.index.getAndIncrement()
       while (index < list.length) {
         persister ! list(index).toUpperCase
         index = StringToUpperProducer.index.getAndIncrement()
       }
     }
   }
 }

  def multipleProducers(): Unit = {
    val toUpperProducer1 = actorSystem.actorOf(Props[StringToUpperProducer])
    val toUpperProducer2 = actorSystem.actorOf(Props[StringToUpperProducer])
    toUpperProducer1 ! 'GO
    toUpperProducer2 ! 'GO
  }

  def singleProducer(): Unit = {
    list.foreach(persister ! _.toUpperCase)
  }

  //multipleProducers()
  singleProducer()
}
