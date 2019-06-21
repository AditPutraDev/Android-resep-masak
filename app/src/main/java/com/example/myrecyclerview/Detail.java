package com.example.myrecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class Detail extends AppCompatActivity {


    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_REMARKS = "extra_remarks";
    public static final String EXTRA_PHOTO = "extra_photo";
    public static final String EXTRA_DETAIL = "extra_detail";


    TextView nama, remarks, detail;
    ImageView imgPoster;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        nama =  findViewById(R.id.tv_item_name);
        remarks = findViewById(R.id.tv_item_remarks);
        imgPoster = findViewById(R.id.img_item_photo);
        detail = findViewById(R.id.tv_item_detail);

        String name = getIntent().getStringExtra(EXTRA_NAME);
        String remark = getIntent().getStringExtra(EXTRA_REMARKS);
        String photo = getIntent().getStringExtra(EXTRA_PHOTO);
        String detailResep = getIntent().getStringExtra(EXTRA_DETAIL);

        nama.setText(name);
        remarks.setText(remark);
        detail.setText(detailResep);
        Glide.with(this)
                .load(photo)
                .apply(new RequestOptions().override(300,300))
                .into(imgPoster);

    }


}
