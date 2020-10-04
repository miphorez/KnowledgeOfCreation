package com.cezia.knowledgeofcreation;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;

class BookPartFont {
    static final String APP_PREFERENCES = "appsettings";

    private static final String APP_PREFERENCES_FONT_SIZE = "fontsize";
    private static final float PREF_FONT_SIZE = 14;

    private final TextView textView;
    private final Context context;

    BookPartFont(Context context, TextView textView) {
        this.textView = textView;
        this.context = context;
    }

    void setTextSize() {
        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, loadPrefFontSize());
    }

    private float loadPrefFontSize() {
        float sizeFont = PREF_FONT_SIZE;
        SharedPreferences prefSettings = context.getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE);
        if (prefSettings.contains(APP_PREFERENCES_FONT_SIZE)) {
            sizeFont = prefSettings.getFloat(APP_PREFERENCES_FONT_SIZE, PREF_FONT_SIZE);
        }
        return sizeFont;
    }

    private void savePrefFontSize(float sizeFont) {
        SharedPreferences prefSettings = context.getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefSettings.edit();
        editor.putFloat(APP_PREFERENCES_FONT_SIZE, sizeFont);
        editor.apply();
    }

    void sizeFontUp() {
        float size = loadPrefFontSize();
        size++;
        setViewFontSize(size);
    }

    void sizeFontDown() {
        float size = loadPrefFontSize();
        size--;
        setViewFontSize(size);
    }

    private void setViewFontSize(float flFontSize){
        try {
            textView.setTextSize(TypedValue.COMPLEX_UNIT_DIP, flFontSize);
        }catch (Exception ex){
            flFontSize = 15.f;
            textView.setTextSize(TypedValue.COMPLEX_UNIT_DIP, flFontSize);
        }
        savePrefFontSize(flFontSize);
    }
}
