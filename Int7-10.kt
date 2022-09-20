//Int 7
fun summa(x:Int):Int{
    var f:Int = x/10
    var s:Int = x%10
    return f+s
}
fun proizvedenie(x: Int):Int{
    var f:Int = x/10
    var s:Int = x%10
    return f*s
}
fun main(){
    println(summa(23))
    println(proizvedenie(23))
}
//Int 10
fun cifri(x:Int){
    var s:Int = (x%100)/10
    var l:Int = x%10
    println(l.toString())
    println(s.toString())
}

fun main(){
    cifri(352)
}
