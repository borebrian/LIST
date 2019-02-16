fun main(args:Array<String>) {
    var list = mutableListOf<Int>() //immutable,fixed size read only
    list.add(44)
    list.add(45)


    for (m in list) {
        println(m)
    }
}