package com.falconeta.plugin.android.fullview;

import android.util.DisplayMetrics;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class AndroidFullView {

    private AppCompatActivity activity;

    public AndroidFullView(AppCompatActivity activity) {
        this.activity = activity;
        activity
            .getWindow()
            .getDecorView()
            .setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE |
                View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION |
                View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR |
                View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR
            );
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

    public int getBottom() {
        DisplayMetrics metrics = this.activity.getResources().getDisplayMetrics();
        int resourceId = this.activity.getResources().getIdentifier("navigation_bar_height", "dimen", "android");
        float navigationBarHeight = 0;

        if (resourceId > 0) {
            navigationBarHeight = this.activity.getResources().getDimensionPixelSize(resourceId);
        }
        return (int) (navigationBarHeight / metrics.density);
    }
}
