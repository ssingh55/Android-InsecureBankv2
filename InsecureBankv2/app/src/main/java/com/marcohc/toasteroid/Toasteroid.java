package com.marcohc.toasteroid;

import android.content.Context;
import android.widget.Toast;

/**
 * Stand-in for com.github.marcohc:Toasteroid:2.1.4, which no longer resolves
 * from any public repository (JCenter is gone, JitPack answers 401). Same call
 * shape the app uses, rendered as a plain Toast; the style is only cosmetic.
 */
public final class Toasteroid {

    public static final int LENGTH_SHORT = Toast.LENGTH_SHORT;
    public static final int LENGTH_LONG = Toast.LENGTH_LONG;

    public enum STYLES { INFO, SUCCESS, WARNING, ERROR, DELETE }

    private Toasteroid() {
    }

    public static void show(Context context, String message, STYLES style, int duration) {
        Toast.makeText(context, message, duration).show();
    }
}
