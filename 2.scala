def main(args:Array[String]) = {

    def Patternmatching(number: Integer): Unit = number match{
        case x if x<=0 => print("\nNegative/Zero number is given")
        case x if x%2 == 0 => print("\nEven number is given")
        case x if x%2 != 0 => print("\nOdd number is given")
       
    }

    Patternmatching(-20)
    Patternmatching(5)
    Patternmatching(10)
      

    
}
