fun main(){
    commis()
}

fun commis(){
    val amount: Double = 40000.0
    var coef: Double
    val comm: Double
    val card: String = "Visa"
    when(card) {
        "Visa","МИР" -> comm = visaWorld(amount)
        "Mastercard","Maestro" -> comm = mm(amount)
        else -> comm = 0.0
    }
    println("Ваша комиссия: $comm")
}

fun visaWorld(amount: Double):Double{
    val coef: Double
    var comm: Double
    coef = 0.075
    comm = amount * coef
    if (comm <= 3500) {
        comm = 3500.0
    }
    return comm
}

fun mm(amount: Double):Double{
    val coef: Double
    val comm: Double
    if(amount >= 30000 && amount <= 7500000 ){
        comm = 0.0
    }
    else{
        coef = 0.06
        comm = amount * coef + 20
    }
    return  comm
}