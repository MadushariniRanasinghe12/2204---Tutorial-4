def main(args:Array[String]) = {

    def interest(amount:Double):Double = amount match{
        case x if x<0 => 0
        case x if x<20000 => x*0.2
        case x if x<200000 => x*0.04
        case x if x<2000000 => x*0.35
        case x if x<20000000 => x*0.65
    }

    println("The Interest = " + interest(0));
    println("The Interest = " + interest(10000));
    println("The Interest = " + interest(100000));
    println("The Interest = " + interest(1000000));
    println("The Interest = " + interest(10000000));
    
}  
    

