package jakezorx.mapwidget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.View;

/**
 * Created by jacob on 2016-05-13.
 */
public class MapWidget extends View {


    public MapWidget(Context context) {
        super(context);
    }

    @Override
    protected void onMeasure(int width, int height){
        int k = getSuggestedMinimumWidth();

        setMeasuredDimension(width, height);
    }
    @Override
    protected void onDraw(Canvas c){
        c.drawARGB(55,250,55,55);
    }
}
