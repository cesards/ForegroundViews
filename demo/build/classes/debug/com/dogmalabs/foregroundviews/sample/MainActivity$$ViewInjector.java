// Generated code from Butter Knife. Do not modify!
package com.dogmalabs.foregroundviews.sample;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class MainActivity$$ViewInjector {
  public static void inject(Finder finder, final com.dogmalabs.foregroundviews.sample.MainActivity target, Object source) {
    View view;
    view = finder.findById(source, 2131230793);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131230793' for method 'onItemClick' was not found. If this view is optional add '@Optional' annotation.");
    }
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onItemClick(p0);
        }
      });
    view = finder.findById(source, 2131230792);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131230792' for method 'onItemClick' was not found. If this view is optional add '@Optional' annotation.");
    }
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onItemClick(p0);
        }
      });
    view = finder.findById(source, 2131230794);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131230794' for method 'onItemClick' was not found. If this view is optional add '@Optional' annotation.");
    }
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onItemClick(p0);
        }
      });
    view = finder.findById(source, 2131230795);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131230795' for method 'onItemClick' was not found. If this view is optional add '@Optional' annotation.");
    }
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onItemClick(p0);
        }
      });
  }

  public static void reset(com.dogmalabs.foregroundviews.sample.MainActivity target) {
  }
}
