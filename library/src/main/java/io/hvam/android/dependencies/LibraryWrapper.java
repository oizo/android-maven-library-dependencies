package io.hvam.android.dependencies;

import android.content.Context;

import com.shopgun.android.utils.UnitUtils;

public class LibraryWrapper {

    public static final String TAG = LibraryWrapper.class.getSimpleName();

    private LibraryWrapper() {
        // private
    }

    /**
     * This is a simple wrapper around another library method. If the upload to bintray.com doesn't
     * include the library dependencies, this will fail.
     *
     * @param ctx A context
     * @param dp The value for density-independent pixels to convert
     * @return The converted value in pixels
     */
    public static int dpToPx(int dp, Context ctx) {
        return UnitUtils.dpToPx(dp, ctx);
    }

}
