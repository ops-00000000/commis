fun main(){
    fun commis(){
        val amount: Double = 40000.0
        var coef: Double
        var comm: Double
        val card: String = "Visa"
        when(card) {
            "Visa","МИР" -> {
                coef = 0.075
                comm = amount * coef
                if (comm <= 3500) {
                    comm = 3500.0
                }
            }
            "Mastercard","Maestro" -> {
                if(amount >= 30000 && amount <= 7500000 ){
                    comm = 0.0
                }
                else{
                    coef = 0.06
                    comm = amount * coef + 20
                }
            }
        else -> comm = 0.0
        }
        println("Ваша комиссия: $comm")
 }
    commis()
}