
import java.util.*

fun main(){
    nums()
   var names=arrayOf("mary","jeannine","mitchelle","brenda","audry","sarah")
    println(Arrays.toString(names))
     println(names)
    character()
    names()
    println(names)
}
fun nums(){
    var nums= arrayOf(1,2,3,4,89,65,45)
    println(Arrays.toString(nums))
    println(nums)
}
fun names(){
    var names=arrayOf("mary","jeannine","mitchelle","brenda","audry","sarah")
    println(Arrays.toString(names))
    println(names)

}
fun character(){
    var characters=arrayOf("mary","jeannine","mitchelle","brenda","aundry","sarah")
    println(characters.get(3))
}
fun names(names:String){
    var name=arrayOf("mary","jeannine","mitchelle")
    println(names.forEach { e -> println(name) })
    println(names)

}
fun her(){
    var name="akinyi"
    var country= arrayOf("kenya", 0.34,300000,true)
    println(country[0])
}
