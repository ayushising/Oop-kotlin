package collections

fun main(){
    var javaBatch= mutableListOf<String>("anil","gopal","ankit","manish")
    var kotlinBatch= mutableListOf<String>("ankit","kumar","manish","rahul")



    println(javaBatch)
    println(kotlinBatch)

    javaBatch.addAll(kotlinBatch)
    println("combning")
    println(javaBatch)

    //removing duplicate elements using distinct function
    println("removing duplicates")
    var javaBatchDistinct =javaBatch.distinct()
    println(javaBatchDistinct)

    println("sorting")

    javaBatchDistinct.sorted()
    println(javaBatchDistinct)



}
