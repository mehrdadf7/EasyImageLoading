package com.github.mehrdadf7.imageloading;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;
import com.nostra13.universalimageloader.core.display.SimpleBitmapDisplayer;

public class UniversalImageLoadingImpl implements ImageLoading {

    private Context context;
    private DisplayImageOptions options;
    private ImageLoader imageLoader = ImageLoader.getInstance();

    public UniversalImageLoadingImpl(Context context) {
        this.context = context;
        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(context)
                .denyCacheImageMultipleSizesInMemory()
                .defaultDisplayImageOptions(DisplayImageOptions.createSimple())
                .writeDebugLogs()
                .build();
        imageLoader.init(config);
    }

    @Override
    public void loadImage(String url, ImageView imageView) {
        options = new DisplayImageOptions.Builder()
                .showImageOnLoading(R.drawable.placeholder)
                .showImageForEmptyUri(R.drawable.placeholder)
                .showImageOnFail(R.drawable.placeholder)
                .resetViewBeforeLoading(false)
                .delayBeforeLoading(1000)
                .cacheInMemory(true)
                .cacheOnDisk(true)
                .considerExifParams(false)
                .imageScaleType(ImageScaleType.IN_SAMPLE_POWER_OF_2)
                .bitmapConfig(Bitmap.Config.ARGB_8888)
                .displayer(new SimpleBitmapDisplayer())
                .build();
        imageLoader.displayImage(url, imageView);
    }

    @Override
    public void loadImage(int resource, ImageView imageView) {
        imageView.setImageResource(resource);
    }

    @Override
    public void loadImage(String url, int placeHolder, int errorDrawable, ImageView imageView) {
        options = new DisplayImageOptions.Builder()
                .showImageOnLoading(placeHolder)
                .showImageForEmptyUri(errorDrawable)
                .showImageOnFail(errorDrawable)
                .resetViewBeforeLoading(false)
                .delayBeforeLoading(1000)
                .cacheInMemory(true)
                .cacheOnDisk(true)
                .considerExifParams(false)
                .imageScaleType(ImageScaleType.IN_SAMPLE_POWER_OF_2)
                .bitmapConfig(Bitmap.Config.ARGB_8888)
                .displayer(new SimpleBitmapDisplayer())
                .build();
        imageLoader.displayImage(url, imageView, options);
    }
}
