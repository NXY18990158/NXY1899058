package com.example.nxy;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ImageScaleActivity extends AppCompatActivity implements View.OnClickListener  {
    private ImageView iv_scale;// 声明一个图像视图的对象
    private final static String TAG = "ImageScaleActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_scale);

        // 从布局文件中获取名叫iv_scale的图像视图
        iv_scale = findViewById(R.id.iv_scale);

        // 下面通过七个按钮，分别演示不同拉伸类型的图片拉伸效果
        findViewById(R.id.btn_center).setOnClickListener(this);
        findViewById(R.id.btn_fitCenter).setOnClickListener(this);
        findViewById(R.id.btn_centerCrop).setOnClickListener(this);
        findViewById(R.id.btn_centerInside).setOnClickListener(this);
        findViewById(R.id.btn_fitXY).setOnClickListener(this);
        findViewById(R.id.btn_fitStart).setOnClickListener(this);
        findViewById(R.id.btn_fitEnd).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_center) {
            iv_scale.setScaleType(ImageView.ScaleType.CENTER);
        } else if (v.getId() == R.id.btn_fitCenter) {
            iv_scale.setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else if (v.getId() == R.id.btn_centerCrop) {
            iv_scale.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else if (v.getId() == R.id.btn_centerInside) {
            iv_scale.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        } else if (v.getId() == R.id.btn_fitXY) {
            iv_scale.setScaleType(ImageView.ScaleType.FIT_XY);
        } else if (v.getId() == R.id.btn_fitStart) {
            iv_scale.setScaleType(ImageView.ScaleType.FIT_START);
        } else if (v.getId() == R.id.btn_fitEnd) {
            iv_scale.setScaleType(ImageView.ScaleType.FIT_END);
        }
        Log.d(TAG, "onClick: " + iv_scale.getScaleType());
        Toast.makeText(ImageScaleActivity.this, "设置缩放类型：" + iv_scale.getScaleType(), Toast.LENGTH_SHORT).show();
    }
}
