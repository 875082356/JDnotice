package com.xiao.noticeview.Utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/3/6.
 */

public class ToastUtils {//单例模式 懒汉

    private ToastUtils(){};
private static Toast toast=null;
    public   static void setToast(Context context,String text){
if(toast==null)
{
    toast=Toast.makeText(context,text,Toast.LENGTH_SHORT);
}
toast.setText(text);
        toast.show();

    }



}
