package com.wmd.fragmenttools.fragmenation.support;

import android.view.MotionEvent;

import com.wmd.fragmenttools.fragmenation.anim.FragmentAnimator;


/**
 * Created by YoKey on 17/6/13.
 */

public interface ISupportActivity {
    SupportActivityDelegate getSupportDelegate();

    ExtraTransaction extraTransaction();

    FragmentAnimator getFragmentAnimator();

    void setFragmentAnimator(FragmentAnimator fragmentAnimator);

    FragmentAnimator onCreateFragmentAnimator();

    void onBackPressed();

    void onBackPressedSupport();

    boolean dispatchTouchEvent(MotionEvent ev);
}
