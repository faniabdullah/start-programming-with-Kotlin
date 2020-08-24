open class Animal(val name: String, val weight: Double, val age: Int, val isCarnivore: Boolean){

    open fun eat(){
        println("$name sedang makan!")
    }

    open fun sleep(){
        println("$name sedang tidur!")
    }
}

class Cat(pName: String, pWeight: Double, pAge: Int, pIsCarnivore: Boolean, val furColor: String, val numberOfFeet: Int)
    : Animal(pName, pWeight, pAge, pIsCarnivore) {

    fun playWithHuman() {
        println("$name bermain bersama Manusia!")
    }

    override fun eat(){
        println("$name sedang memakan ikan!")
    }

    override fun sleep() {
        println("$name sedang tidur di bantal!")
    }
}

class Fish(pName : String , pWeight: Double, pAge: Int , pIsCarnivore : Boolean, val scaleColor : String, val numberOfFin: Int)
    :Animal(pName,pWeight,pAge,pIsCarnivore){
    fun swim(){
        println("$name sedang berenang")
    }

    override fun eat() {
        println("$name sedang makan pelet")
    }

    override fun sleep() {
        println("$name sedang tidur , ikan juga bisa tidur")
    }
}

fun main(){
    val dicodingCat = Cat("Dicoding Miaw", 3.2, 2, true, "Brown", 4)

    dicodingCat.playWithHuman()
    dicodingCat.eat()
    dicodingCat.sleep()

    val dicodingFish = Fish("Dicoding Koi", 2.1, 3, false, "Red",3)
    dicodingFish.swim()
    dicodingFish.eat()
    dicodingFish.sleep()
}