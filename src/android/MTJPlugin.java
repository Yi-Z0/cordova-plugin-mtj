package com.cordova.plugin;

import com.baidu.mobstat.StatService;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;

/**
 * This class echoes a string called from JavaScript.
 */
public class MTJPlugin extends CordovaPlugin {

  @Override
  public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {

    if (action.equals("pageStart")) {
      StatService.onPageStart(this.cordova.getActivity(), args.getString(0));
    } else if (action.equals("pageEnd")) {
      StatService.onPageEnd(this.cordova.getActivity(), args.getString(0));
    } else if (action.equals("event")) {
      StatService.onEvent(this.cordova.getActivity(), args.getString(0), args.getString(1));
    }
    return true;
  }
}
