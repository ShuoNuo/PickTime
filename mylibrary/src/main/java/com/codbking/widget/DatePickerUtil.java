package com.codbking.widget;

import android.content.Context;
import android.widget.EditText;

import com.codbking.widget.bean.DateType;

public class DatePickerUtil {
    public static void showMonthDialog(Context context, final EditText editText) {
        DatePickDialog dialog = new DatePickDialog(context);
        //设置上下年分限制
        dialog.setYearLimt(5);
        //设置标题
        dialog.setTitle("选择时间");
        //设置类型
        dialog.setType(DateType.TYPE_YM);
        //设置消息体的显示格式，日期格式
        dialog.setMessageFormat("yyyy-MM-dd HH:mm");
        //设置选择回调
        dialog.setOnChangeLisener(null);
        //设置点击确定按钮回调
        dialog.setOnSureLisener(new OnSureLisener() {
            @Override
            public void onSure(String dateStr) {
                editText.setText(dateStr);
            }
        });
        dialog.show();
    }
}
