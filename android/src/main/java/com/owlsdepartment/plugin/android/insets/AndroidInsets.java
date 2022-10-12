package com.owlsdepartment.plugin.android.insets;

import android.util.DisplayMetrics;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class AndroidInsets {

    private AppCompatActivity activity;

    public AndroidInsets(AppCompatActivity activity) {
        this.activity = activity;
      activity.getWindow().getDecorView().setSystemUiVisibility(
        View.SYSTEM_UI_FLAG_LAYOUT_STABLE
          | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION);
    }

    public float getTop() {
        DisplayMetrics metrics = this.activity.getResources().getDisplayMetrics();
        int resourceId = this.activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        float titleBarHeight = 0;

        if (resourceId > 0) {
            titleBarHeight = this.activity.getResources().getDimensionPixelSize(resourceId);
        }

        return titleBarHeight / metrics.density;
    }

    public float getBottom() {
        DisplayMetrics metrics = this.activity.getResources().getDisplayMetrics();
        int resourceId = this.activity.getResources().getIdentifier("navigation_bar_height", "dimen", "android");
        float navigationBarHeight = 0;

        if (resourceId > 0) {
            navigationBarHeight = this.activity.getResources().getDimensionPixelSize(resourceId);
        }

        return navigationBarHeight / metrics.density;
    }
}
