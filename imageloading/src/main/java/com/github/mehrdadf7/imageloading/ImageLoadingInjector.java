package com.github.mehrdadf7.imageloading;

public class ImageLoadingInjector {
    public static ImageLoading getImageLoading() {
        return new PicassoImageLoadingImpl(); //GlideImageLoadingImpl(context);
    }
}
