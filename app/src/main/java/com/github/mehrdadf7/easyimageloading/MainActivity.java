package com.github.mehrdadf7.easyimageloading;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.github.mehrdadf7.imageloading.ImageLoadingInjector;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.imageView);
        ImageLoadingInjector.getImageLoading()
                .loadImage(
                        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSydlFPbmgNEkTKAELqItsxLxYJzHxLhiuMzzFeANeF-7nqPaOvPw",
                        imageView
                );

    }
}
