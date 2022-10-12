package com.owlsdepartment.plugin.android.insets;

import android.app.Activity;
import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "AndroidInsets")
public class AndroidInsetsPlugin extends Plugin {

    private AndroidInsets implementation;

    @Override
    public void load() {
        this.implementation = new AndroidInsets(getActivity());
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
