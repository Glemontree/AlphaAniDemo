package com.glemontree.alphaanidemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.widget.LinearLayout;

public class AlphaAni extends AppCompatActivity {
    private LinearLayout llAlpha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        llAlpha = (LinearLayout) findViewById(R.id.ll_alpha);
        beginAnimation();
    }

    private void beginAnimation() {
        AlphaAnimation alpha = new AlphaAnimation(0, 1);
        alpha.setDuration(3000);
        llAlpha.startAnimation(alpha);
    }
}
