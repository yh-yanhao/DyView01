package com.bwie.test;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by lenovo-pc on 2016/11/1.
 */
public class VolumneView extends View{
    Context context;
    private float mx=100;
    private float my=100;
    private int mysize=20;
    private Paint paint;

    public VolumneView(Context context) {
        super(context);
        this.context=context;
    }

    public VolumneView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public VolumneView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        paint = new Paint();
        canvas.drawCircle(mx,my,mysize,paint);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        mx=event.getX();
        my=event.getY();
        invalidate();;
        return true;
    }
}
