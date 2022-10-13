package com.falconeta.plugin.android.fullview;

import android.app.Activity;
import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "AndroidFullView")
public class AndroidFullView extends Plugin {

    private AndroidFullView implementation;

    @Override
    public void load() {
        this.implementation = new AndroidFullView(getActivity());
    }

    @PluginMethod
    public void top(PluginCall call) {
        float statusBarHeight = implementation.getTop();
        JSObject ret = new JSObject();

        ret.put("value", statusBarHeight);
        call.resolve(ret);
    }

    @PluginMethod
    public void bottom(PluginCall call) {
        float navigationBarHeight = implementation.getBottom();
        JSObject ret = new JSObject();

        ret.put("value", navigationBarHeight);
        call.resolve(ret);
    }
}
