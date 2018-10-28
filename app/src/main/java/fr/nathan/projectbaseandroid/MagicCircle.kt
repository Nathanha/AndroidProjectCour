package fr.nathan.projectbaseandroid

data class MagicCircle(var cx:Float = 50F, var cy:Float = 50F){
    var maxX: Float = cx
    var maxY: Float = cy
    val rad: Float = 40F

    var delta = 10

    var dx = delta
    var dy = delta

    fun move()
    {
        when {
            cx < 0F -> dx = delta
            cx > maxX -> dx = -delta
            cy < 0F -> dy = delta
            cy > maxY -> dy = -delta
        }
        cx += dx
        cy += dy
    }
}