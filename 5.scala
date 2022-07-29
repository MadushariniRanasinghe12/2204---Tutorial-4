def main(args:Array[String]) = {

    def toUpper(text: String): String = {
        text.toUpperCase()
    }

    def toLower(text: String): String = {
        text.toLowerCase()
    }

    def formatNames(name: String)(function: String => String): String = {
        function(name)
    }

    println(formatNames("Benny")(toUpper(_)))
    println(formatNames("Niroshan")(toLower(_)))
    println(formatNames("Saman")(toLower(_)))
    println(formatNames("KuMara")(toUpper(_)))

}