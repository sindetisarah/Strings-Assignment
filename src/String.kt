fun main() {
    combineCharacters()

    var fullDetails =personalDetails("Amani","56")
    println(fullDetails)

    var stringLength =length("Brenda")
    println(stringLength)

    var fullyChecked=checkName("sarah")
    println(fullyChecked)
}

fun combineCharacters(){
    var school ="akirachix"
    var firstLetter =school[0]
    var thirdLetter =school[2]
    var fourthLetter =school[3]
    var  new =println("$firstLetter$thirdLetter$fourthLetter")


}


fun personalDetails(name:String,age:String):String{

    return "My name is $name and i am $age years old"

}


fun length(myString:String):Int{
    var length = myString.length
    return length

}

fun checkName(name:String) {
    if (name=="sarah") {
        println("Thats me")
    }else
        println("I dont know who that is")
}