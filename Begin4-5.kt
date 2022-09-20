import kotlin.math.pow

//Begin 4
val pi:Double = 3.14
fun dlina(d:Double):Double{
    return d*pi
}
fun main(){
    println("Dlina okruzhnosti = ${dlina(5.0)}")
}

//Begin 5
fun obem(a:Double):Double{
    return a.pow(3)
}
fun ploshad(a:Double):Double{
    return 6*a.pow(2)
}
fun main(){
    println("Obem kuba = ${obem(2.0)}")
    println("Ploshad kuba = ${ploshad(2.0)}")
}
