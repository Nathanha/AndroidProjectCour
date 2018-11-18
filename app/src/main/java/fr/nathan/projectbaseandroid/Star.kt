package fr.nathan.projectbaseandroid

import android.graphics.Matrix
import android.graphics.Path
import android.graphics.RectF
import java.lang.reflect.Array.getLength
import android.graphics.PathMeasure
import android.util.Half.toFloat


data class Star(var cx:Float = 50F, var cy:Float = 50F){

    private val mMatrix = Matrix()
    private val bounds = RectF()
    private var pointsX: FloatArray = floatArrayOf(50F,45F,30F,42F,35F,50F,65F,57F,70F,55F)
    private var pointsY: FloatArray = floatArrayOf(30F,45F,46F,55F,67F,60F,67F,55F,46F,45F)


    private var degres = 0.0

    private var centerX = cx+50F
    private var centerY = cy+47F

    var maxX: Float = cx
    var maxY: Float = cy

    var delta = 5

    var dx = delta
    var dy = delta

    fun move()
    {
        when {
            cx < 0F -> dx = delta
            cx > maxX - 30F -> dx = -delta
            cy < 0F -> dy = delta
            cy > maxY - 30F -> dy = -delta
        }
        cx += dx
        cy += dy
    }

    fun rotatePoint(pointX:Float, pointY: Float): Set<Float>{
        centerX = cx+50F
        centerY = cy+47F

        val x1 = pointX - centerX;
        val y1 = pointY - centerY;

        val x2 = x1 * Math.cos(degres) - y1 * Math.sin(degres)
        val y2 = x1 * Math.sin(degres) + y1 * Math.cos(degres)

        val point = setOf((x2 + centerX).toFloat(), (y2 + centerY).toFloat() )

        degres += 0.01
        degres = degres.rem(360)
        return point
    }


    fun createStar(): Path {
        val path = Path()
        var rotatedPoint = rotatePoint(cx+50F, cy+30F)
        path.moveTo(rotatedPoint.first(),rotatedPoint.last())
        for (i in 1..pointsX.size-1){
            rotatedPoint = rotatePoint(cx+pointsX[i], cy + pointsY[i])
            path.lineTo(rotatedPoint.first(), rotatedPoint.last())
        }
        return path
    }
}