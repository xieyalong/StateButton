package deadline.statebutton;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.deadline.statebutton.StateButton;

public class MainActivity2 extends AppCompatActivity {
    TextView tvExtend;
    StateButton stateButton0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvExtend=findViewById(R.id.tv_extend);
        stateButton0=findViewById(R.id.text_test0);
        tvExtend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            setStyle();
            }
        });

    }
    public  void setStyle(){
        //正常状态下背景和字体
        stateButton0.setNormalBackgroundColor( getResources().getColor(R.color.colorPrimary));
        stateButton0.setNormalTextColor( getResources().getColor(R.color.white));
        //按下状态背景和字体
        stateButton0.setPressedBackgroundColor(getResources().getColor(R.color.holo_orange_dark));
        stateButton0.setPressedTextColor(getResources().getColor(R.color.holo_red_light));
        //4角
        stateButton0.setRadius(10);
        //设置边框为断线和断线之间的间隔
        stateButton0.setStrokeDash(5,5);
        //正常状态下的边框颜色和宽度
        stateButton0.setNormalStrokeColor(getResources().getColor(R.color.white));
        stateButton0.setNormalStrokeWidth(2);
        //按下状态下的边框颜色和宽度
        stateButton0.setPressedStrokeColor(getResources().getColor(R.color.colorPrimary));
        stateButton0.setPressedStrokeWidth(5);
        //  动画
        stateButton0.setAnimationDuration(200);
    }
}
