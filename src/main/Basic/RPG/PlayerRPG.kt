/*
* calcDmg - рассчитываем наносимый урон
* calcDodge - рассчитываем, насколько мы увернулись.
* recieveDmg - получаем урон.
* toString() - сохраняем игрока в строку (сериализация).
*
* Task 1:
* Добавляем метод deathPenalty:
*   - Уменьшаем вдвое текущий опыт.
*   - Восстанавливаем здоровье до 5% от максимума.
*
* Добавляем свойство  backpack:
*   - Реализуем ограниченный (по количеству предметов) инвентарь героя.
*   - Методы dropThing, storeThing
*
* Добавляем вторичный конструктор для загрузки игрока из строки.
* */

data class PlayerRPG(
    val name: String ,
    val playerClass: String ,
    var dex: Int = 1 ,
    var strForce: Int = 2 ,
    var lvl: Int = 1 ,
    var maxHP: Int = 5 ,
    var nextLVL: Int = 10 ,
    var XP: Int = 0 ,
    var HP: Int = 5 ,
) {


    fun increaseXP(newXP: Int) {
        println("Got $newXP XP")
        XP += newXP
        if(XP > nextLVL) lvlUp()
//        println(this.toString())
    }

    fun lvlUp() {
        lvl += 1
        nextLVL *= 2

        strForce += 1
        dex += 1

        maxHP = (maxHP * 1.5).toInt()
        HP = maxHP
        println("LVL up! Your stats are ${toString()}")
    }

//    override fun toString(): String {
//        return super.toString()
//    } // -> data class
}