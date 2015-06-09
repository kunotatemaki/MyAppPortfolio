package com.rukiasoft.androidapps.udacity.nanodegree.myappportfolio.tools;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;

/**
 * Created by Ruler on 2014.
 */
public class MyAppPortfolioTools {
    static private Toast toast = null;

    public static void showToast(final Context context, final String text) {

        //only show if context is an instance of Activity
        if (!(context instanceof Activity)) {
            return;
        }
        try {
            if (toast != null) {
                if (toast.getView().isShown()) {
                    toast.setText(text);
                    return;
                }
            }
            toast = Toast.makeText(context, text, Toast.LENGTH_LONG);
            toast.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

