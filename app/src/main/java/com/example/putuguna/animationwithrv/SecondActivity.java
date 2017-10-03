package com.example.putuguna.animationwithrv;

import android.content.Intent;
import android.media.Image;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    public static String TAG_IMAGE_NAME = "tag_image_name";

    private ImageView mImage;
    private TextView mNameOfImage;
    private TextView mNameOfOwner;
    private TextView mDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_layout);

        mImage = (ImageView) findViewById(R.id.detail_image);
        mNameOfImage = (TextView) findViewById(R.id.name_image);
        mNameOfOwner = (TextView) findViewById(R.id.name_owner);
        mDesc = (TextView) findViewById(R.id.desc);

        String image = getIntent().getStringExtra("image");
        String imageName = getIntent().getStringExtra("name-image");
        String ownerName = getIntent().getStringExtra("owner-name");
        String desc = getIntent().getStringExtra("desc");

        ViewCompat.setTransitionName(mImage, TAG_IMAGE_NAME);

        mImage.setImageResource(Integer.parseInt(image));
        mNameOfImage.setText(imageName);
        mNameOfOwner.setText(ownerName);
        mDesc.setText(desc);
    }
}
