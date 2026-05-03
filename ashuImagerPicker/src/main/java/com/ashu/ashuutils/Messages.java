package com.ashu.ashuutils;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public final class Messages {

    private Messages() {
        // prevent instantiation
    }

    public static void showTestLog(String TAG, String message) {
        if (HelperUtilsAppConstants.isDebug) {
            Log.d(TAG, message);
        }
    }

    public static void showTestToast(Context context, String message) {
        if (HelperUtilsAppConstants.isDebug) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
        }
    }
}
