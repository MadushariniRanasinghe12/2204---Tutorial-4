def main(args:Array[String]) = {

    def Patternmatching(number: Int): String = number match{
        case x if x<=0 => "Negative/Zero number is given"
        case x if x%2 == 0 => "Even number is given"
        case x if x%2 != 0 => "Odd number is given"
       
    }

    print("Enter the number :");
    val num = scala.io.StdIn.readInt();
    val answer = Patternmatching(num);
    printf(answer);
      
}
