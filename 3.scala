def main(args: Array[String]) = {

    case class Car(name: String, price: Double)
    
    class CarUUID(vehicle: Car){
        def uuid: String = s"car uuid = ${vehicle.name} - ${vehicle.name.hashCode()}"
    }
    
    object Carextensions{
        implicit def uuid(vehicle: Car): CarUUID = new CarUUID(vehicle)
    } 

    import Carextensions._
    val bmw3 = Car("bmw 3 series", 20000)
    val bmw5 = Car("bmw 5 series", 50000)
    val vwpassat = Car("vw passat", 10000)
    val vwgolf = Car("vw golf", 12000)
    val mazda3 = Car("mazda 3", 15000)

    val cars = List(bmw3, bmw5, vwpassat, vwgolf, mazda3)

    cars.foreach(vehicle => println(vehicle.uuid))

}