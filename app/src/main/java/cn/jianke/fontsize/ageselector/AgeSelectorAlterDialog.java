package cn.jianke.fontsize.ageselector;

import android.app.Activity;
import android.content.Context;
import android.view.Display;
import android.view.WindowManager;

/**
 * @className: AgeSelectorAlterDialog
 * @classDescription: 年龄选择器
 * @author: leibing
 * @createTime: 2016/09/09
 */
public class AgeSelectorAlterDialog {

    /**
     * 显示年龄选择器
     * @author leibing
     * @createTime 2016/09/09
     * @lastModify 2016/09/09
     * @param context 上下文
     * @param currentAge 当前年龄
     * @param dialogCallBack 回调
     * @return
     */
    public static void show(Context context, int currentAge, AgeSelectorDialog.DialogCallBack dialogCallBack){
        AgeSelectorDialog dialog = new AgeSelectorDialog(context, currentAge);
        dialog.setDialogCallBack(dialogCallBack);
        dialog.show();
        // 调整对话框宽度全屏
        WindowManager windowManager = ((Activity)context).getWindowManager();
        Display display = windowManager.getDefaultDisplay();
        WindowManager.LayoutParams lp = dialog.getWindow().getAttributes();
        // 设置宽度
        lp.width = (int)(display.getWidth());
        dialog.getWindow().setAttributes(lp);
    }
}
