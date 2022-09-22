//Boolean 1

fun proverka(A:Int){
    if(A>0){
        println("Chislo $A polozhitelnoe")
    }else if (A==0){
        println("Chislo $A ravno nulyu")
    }else{
        println("Chislo $A otricatelnoe")
    }
}
fun main(){
    proverka(-6)
    proverka(3)
    proverka(0)
}



//Boolean 2-3

fun chetnoeNechetnoe(A:Int){
    if (A%2==0){
        println("Chislo $A chetnoe")
    }else{
        println("Chislo $A nechetnoe")
    }
}
fun main(){
    chetnoeNechetnoe(22)
    chetnoeNechetnoe(15)
}


//Boolean 4

fun proverka(A:Int,B:Int){
    if(A>2&&B<=3){
        println("Vashi chisla podkhodyat neravenstvu")
    }else{
        println("Vashi chisla ne podkhodyat neravenstvu")
    }
}
fun main(){
    proverka(3,4)
    proverka(3,2)
}


//Boolean 5
fun proverka(A:Int,B:Int){
    if(A>=0||B<-2){
        println("Vashi chisla podkhodyat neravenstvu")
    }else{
        println("Vashi chisla ne podkhodyat neravenstvu")
    }
}
fun main(){
    proverka(-1,1)
    proverka(0,2)
    proverka(-1,-3)
    proverka(1,-5)
}

