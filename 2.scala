def main(args: Array[String]) = {

    case class ShoppingcartItem(name: String, price: Double, quantity: Int)

    val item1 = ShoppingcartItem("Vanila ice cream", 3.99, 13)
    val item2 = ShoppingcartItem("Chocolate biscuits", 4.0, 6)
    val item3 = ShoppingcartItem("Cupcakes", 7.77, 7)
    val basket = List(item1,item2,item3)

    def PrintcartItems(basket: List[ShoppingcartItem]): Unit = {
        basket.foreach(item =>
            println(s"${item.quantity} ${item.name} at Rs.${item.price} each"))
    }

    PrintcartItems(basket)
    println()

    def PrintIcecream(basket: List[ShoppingcartItem]): Unit = {
        basket.foreach(
        {
            case ShoppingcartItem("Vanila ice cream", _, _) => println( "Found a Vanila ice cream item.")
            case ShoppingcartItem(_, _, _) => println("Found another item.")
        }
        )
    }

    PrintIcecream(basket)
}