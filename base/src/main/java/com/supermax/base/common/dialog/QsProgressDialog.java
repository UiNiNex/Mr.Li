package com.supermax.base.common.dialog;

import android.view.Gravity;
import android.view.WindowManager;

import com.supermax.base.common.log.L;
import com.supermax.base.common.widget.dialog.QsDialogFragment;

/**
 * @Author yinzh
 * @Date   2018/10/15 14:41
 * @Description
 */
public abstract class QsProgressDialog extends QsDialogFragment{

    private CharSequence mMessage;
    private boolean      isShow;

    @Override protected void setAttribute(WindowManager.LayoutParams params) {
        params.gravity = Gravity.CENTER;
        params.width = WindowManager.LayoutParams.MATCH_PARENT;
        params.height = WindowManager.LayoutParams.WRAP_CONTENT;
    }

    public void setMessage(CharSequence sequence) {
        this.mMessage = sequence;
    }

    public CharSequence getMessage() {
        return mMessage;
    }

    public boolean isShowing() {
        return isShow;
    }

    public void setIsShowing(boolean show) {
        this.isShow = show;
        L.i(initTag(), "setIsShowing....... showing:true");
    }


    @Override public void onDetach() {
        super.onDetach();
        setIsShowing(false);
        L.i(initTag(), "onDetach....... set is showing:false");
    }

}
