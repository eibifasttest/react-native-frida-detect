package com.fridadetect;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = FridaDetectModule.NAME)
public class FridaDetectModule extends ReactContextBaseJavaModule {
  public static final String NAME = "FridaDetect";

  static {
    System.loadLibrary("native-lib");
  }

  public FridaDetectModule(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @Override
  @NonNull
  public String getName() {
    return NAME;
  }


  // Example method
  // See https://reactnative.dev/docs/native-modules-android
  @ReactMethod
  public void detect() {
  }
}
