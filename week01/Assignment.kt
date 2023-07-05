open class Human(var name: String, var mana: Int) {

    open fun attack() {
        if (mana > 50) {
            println("${this.name} use Fist Attack!")
        } else {
            println(" Not enough mana!")
        }
    }
}


class Mega(name: String, mana: Int): Human(name, mana){

    override fun attack(){
        println("$name use Fireball!")
    }
}


fun main(){
    var human = Human("Mario", 10)
    human.attack()
    var mega = Mega("Yoshi", 200)
    mega.attack()

}