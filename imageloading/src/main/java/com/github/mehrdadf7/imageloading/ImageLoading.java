package com.github.mehrdadf7.imageloading;

import android.support.annotation.DrawableRes;
import android.support.v7.widget.AppCompatImageView;
import android.widget.ImageView;

public interface ImageLoading {
    void loadImage(String url, ImageView imageView);
    void loadImage(@DrawableRes int resource, ImageView imageView);
    void loadImage(String url, @DrawableRes int placeHolder, @DrawableRes int errorDrawable, ImageView imageView);
}
