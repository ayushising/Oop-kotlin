package inheritance

fun main(){
    var c=C()

    c.displayC()
    c.displayB()
    c.displayA()

    var b=B()
    b.displayA()
}
open class A(){
    fun displayA(){
        println("this is super parent class")
    }
}

open class B:A(){
    fun displayB(){
        println("this is parent class")
    }

}
class C:B(){
    fun displayC(){
        println("this is child class")
    }
}
