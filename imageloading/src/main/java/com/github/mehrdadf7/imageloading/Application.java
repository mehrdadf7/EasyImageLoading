package com.github.mehrdadf7.imageloading;

import android.content.Context;
import android.graphics.Bitmap;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;
import com.nostra13.universalimageloader.core.display.SimpleBitmapDisplayer;

public class Application extends android.app.Application {

    private static Context context;
    public static ImageLoaderConfiguration config;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;

        config = new ImageLoaderConfiguration.Builder(getContext())
                .denyCacheImageMultipleSizesInMemory()
                .defaultDisplayImageOptions(DisplayImageOptions.createSimple())
                .writeDebugLogs()
                .build();
    }

    public static Context getContext() {
        return context;
    }
}
