package com.rakuten.tech.mobile.perf.core.base;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.rakuten.tech.mobile.perf.core.Tracker;
import com.rakuten.tech.mobile.perf.core.annotations.MaxCompileSdkVersion;
import com.rakuten.tech.mobile.perf.core.annotations.MinCompileSdkVersion;

@MinCompileSdkVersion(11)
public class FragmentBase extends Fragment {

  public boolean com_rakuten_tech_mobile_perf_onCreate_tracking = false;

  @MaxCompileSdkVersion(22)
  public void onAttach(Activity activity) {
    Tracker.prolongMetric();
    super.onAttach(activity);
  }

  @MinCompileSdkVersion(23)
  public void onAttach(Context context) {
    Tracker.prolongMetric();
    super.onAttach(context);
  }

  @MinCompileSdkVersion(24)
  public void onAttachFragment(Fragment childFragment) {
    Tracker.prolongMetric();
    super.onAttachFragment(childFragment);
  }

  public void onCreate(Bundle savedInstanceState) {
    Tracker.prolongMetric();
    super.onCreate(savedInstanceState);
  }

  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    Tracker.prolongMetric();
    return super.onCreateView(inflater, container, savedInstanceState);
  }

  public void onActivityCreated(Bundle savedInstanceState) {
    Tracker.prolongMetric();
    super.onActivityCreated(savedInstanceState);
  }

  public void onViewStateRestored(Bundle savedInstanceState) {
    Tracker.prolongMetric();
    super.onViewStateRestored(savedInstanceState);
  }

  public void onStart() {
    Tracker.prolongMetric();
    super.onStart();
  }

  public void onResume() {
    Tracker.prolongMetric();
    super.onResume();
  }

  public void onPause() {
    Tracker.prolongMetric();
    super.onPause();
  }

  public void onStop() {
    Tracker.prolongMetric();
    super.onStop();
  }

  public void onDestroyView() {
    Tracker.prolongMetric();
    super.onDestroyView();
  }

  public void onDestroy() {
    Tracker.prolongMetric();
    super.onDestroy();
  }

  public void onDetach() {
    Tracker.prolongMetric();
    super.onDetach();
  }

  public void onHiddenChanged(boolean hidden) {
    Tracker.prolongMetric();
    super.onHiddenChanged(hidden);
  }

  @MaxCompileSdkVersion(11)
  public void onInflate(AttributeSet attrs, Bundle savedInstanceState) {
    Tracker.prolongMetric();
    super.onInflate(attrs, savedInstanceState);
  }

  @MinCompileSdkVersion(12)
  @MaxCompileSdkVersion(22)
  public void onInflate(Activity activity, AttributeSet attrs, Bundle savedInstanceState) {
    Tracker.prolongMetric();
    super.onInflate(activity, attrs, savedInstanceState);
  }

  @MinCompileSdkVersion(23)
  public void onInflate(Context context, AttributeSet attrs, Bundle savedInstanceState) {
    Tracker.prolongMetric();
    super.onInflate(context, attrs, savedInstanceState);
  }
}

