package fr.nathan.projectbaseandroid

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class CustomView : View {

    companion object {val DELTA = 8}
    private var mPaint = Paint()
    lateinit var mCircle: MagicCircle
    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
        super.onLayout(changed, left, top, right, bottom)
        mCircle = MagicCircle(width.toFloat(), height.toFloat())
        mCircle.delta = DELTA

    }

    constructor(context: Context) : this(context, null)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {init()}

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        mCircle.move()
        canvas?.drawCircle(mCircle.cx, mCircle.cy, mCircle.rad, mPaint)
        invalidate()
    }

    private fun init()
    {
        mPaint.color = Color.BLUE
    }
}