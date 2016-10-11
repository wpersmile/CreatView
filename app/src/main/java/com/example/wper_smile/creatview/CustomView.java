package com.example.wper_smile.creatview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by wper-smile on 2016/9/27.
 */

public class CustomView extends View{
    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //设置画布背景色
        canvas.drawColor(Color.WHITE);

        Paint paint=new Paint();

        ////绘制矩形，内部不填充
        //抗锯齿
        paint.setAntiAlias(true);

        //画笔颜色
        paint.setColor(Color.RED);

        //设置填充类型
        paint.setStyle(Paint.Style.STROKE);

        //设置画笔宽度
        paint.setStrokeWidth(5);

        //绘制普通矩形
        canvas.drawRect(10, 10, 300, 300, paint);

        //绘制三角形，内部填充
        Path path=new Path();
        path.moveTo(400, 400);
        path.lineTo(300, 550);
        path.lineTo(600, 550);
        path.close();
        paint.setStyle(Paint.Style.FILL);
        canvas.drawPath(path, paint);

        //绘制文本
        paint.setTextSize(150);
        paint.setColor(Color.BLACK);
        paint.setStrikeThruText(true);
        canvas.drawText("hello", 800, 700, paint);

       //绘制圆
        Paint paint1=new Paint();
        canvas.drawCircle(400, 900, 200, paint1);// 圆
    }
}
