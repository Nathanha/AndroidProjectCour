package fr.nathan.projectbaseandroid

import android.app.PendingIntent.getActivity
import android.content.Context
import android.util.AttributeSet
import android.view.View

import android.graphics.*
import android.graphics.drawable.Drawable
import android.support.v4.content.res.ResourcesCompat


class CustomView : View {

    companion object {val DELTA = 8}

    lateinit var mCircle: MagicCircle
    lateinit var star: Star
    private var mPaint = Paint()
    private val watch = ResourcesCompat.getDrawable(getResources(), R.drawable.wish4, null)
    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
        super.onLayout(changed, left, top, right, bottom)
        mCircle = MagicCircle(width.toFloat(), height.toFloat())
        star = Star(width.toFloat(), height.toFloat())
        mCircle.delta = DELTA
        watch?.setBounds(left+50, top+50, left+300,  top+300)
    }

    constructor(context: Context) : this(context, null)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {init()}


    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        watch?.draw(canvas)
        mCircle.move()
        star.move()
        canvas?.drawPath(star.createStar(), mPaint)
        canvas?.drawCircle(mCircle.cx, mCircle.cy, mCircle.rad, mPaint)
        invalidate()
    }

    private fun init()
    {
        mPaint.style = Paint.Style.FILL
        mPaint.color = Color.BLUE
    }
}