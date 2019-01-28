package com.github.mehrdadf7.imageloading;

import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class PicassoImageLoadingImpl implements ImageLoading {

    @Override
    public void loadImage(String url, ImageView imageView) {
        Picasso.get().load(url).into(imageView);
    }

    @Override
    public void loadImage(int resource, ImageView imageView) {
        Picasso.get().load(resource).into(imageView);
    }

    @Override
    public void loadImage(String url, int placeHolder, int errorDrawable, ImageView imageView) {

    }
}