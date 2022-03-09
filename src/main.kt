fun main() {
    people("John", "Gana", "Asmin", "Kimani")
    cities()
    numerics()
    details(arrayOf("Bona", "june", "mellisa"))



}margit re
fun people(name1:String, name2:String, name3:String,name4:String){
    var people=arrayOf(name1,name2,name3,name4)
    println(people.contentToString())
}
fun cities(){
    var cities=arrayOf("harare","mumbai","dodoma", "jakarta")
    cities.forEach{ city ->
        println(city.capitalize())

    }

}
fun numerics(){
    var number=arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var sum=number[2]+number[5]
    println(sum)

    var sort=number.indexOf(158)
    println(sort)

    var sortednumber=number.sortedArray()
    println(sortednumber.contentToString())



}
fun details(names:Array<String>):Array<String>{
    var name=names
    println(name.contentToString())
    return names

}