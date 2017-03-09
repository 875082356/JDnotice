package com.xiao.noticeview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.xiao.noticeview.Utils.ToastUtils;
import com.xiao.noticeview.widget.NoticeView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        NoticeView noticeView = (NoticeView) findViewById(R.id.notice_view);
        List<String> notices = new ArrayList<>();
        notices.add("AMD官方宣布Ryzen 5处理器:Intel Core i5危险");
        notices.add("这回连价格都知道了:iphone 8完全曝光5.8寸");
        notices.add("NVIDIA GTX 1080 Ti三月10日震撼上市，请先收好信仰壁纸");
        noticeView.addNotice(notices);
        noticeView.startFlipping();
        noticeView.setOnNoticeClickListener(new NoticeView.OnNoticeClickListener() {
            @Override
            public void onNotieClick(int position, String notice) {
                ToastUtils.setToast(MainActivity.this,notice);
            }
        });
    }
}
