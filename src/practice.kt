fun main(args:Array<String>) {

    var mynumbers: List<Int> = listOf(1, 2, 3, 4, 5, 6, 7)
    val filteredd = mynumbers.filter { it < 5 }
    for (n in filteredd) {
        println(n)
    }
    val myMap = mynumbers.map { it * 4 }
    for (m in myMap) {
        println(m)
    }
    val test = mynumbers.filter { it < 5 }
        .map { it + 5 }
    for (t in test) {
        println(t)
    }
    var people = listOf<Person>(Person(1,"BRIAN"),   (Person(2,"Kili")))
    var pple =people.map { }
}
    class  Person(age:Int,name:String){


    }




