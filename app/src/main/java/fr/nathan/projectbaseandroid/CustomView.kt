package fr.nathan.projectbaseandroid

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.util.AttributeSet
import android.view.View

class CustomView : View {

    companion object {val DELTA = 8}

    lateinit var mCircle: MagicCircle

    private var mPaint = Paint()
    private val mHeartPath = Path()

    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
        super.onLayout(changed, left, top, right, bottom)
        mCircle = MagicCircle(width.toFloat(), height.toFloat())
        createGraphicalObject()
        mCircle.delta = DELTA

    }

    constructor(context: Context) : this(context, null)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {init()}

    private fun createGraphicalObject() {
        mHeartPath.set(createHeart())
    }

    private fun createHeart(): Path {
        val path = Path()
        path.moveTo(50F, 30F)
        path.lineTo(45F, 45F)
        path.lineTo(30F, 46F)
        path.lineTo(42F, 55F)
        path.lineTo(35F, 67F)
        path.lineTo(50F, 60F)
        path.lineTo(65F, 67F)
        path.lineTo(57F, 55F)
        path.lineTo(70F, 46F)
        path.lineTo(55F, 45F)
        return path
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        mCircle.move()
        canvas?.drawPath(mHeartPath, mPaint)
        canvas?.drawCircle(mCircle.cx, mCircle.cy, mCircle.rad, mPaint)
        invalidate()
    }

    private fun init()
    {
        mPaint.style = Paint.Style.FILL
        mPaint.color = Color.BLUE
    }
}