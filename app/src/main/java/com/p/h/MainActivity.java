package com.p.h;

import static com.p.h.bean.WorkProcessBean.JsonBean;

import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.p.h.adapter.WorkProcessAdapter;
import com.p.h.bean.WorkProcessBean;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvWp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setBlackStateMode(this);
        initView();
        initDate();
    }

    private void initView() {
        rvWp = findViewById(R.id.rvWp);
        rvWp.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initDate() {
        List<WorkProcessBean.DateBean> list = new Gson().fromJson(JsonBean.json, new TypeToken<ArrayList<WorkProcessBean.DateBean>>() {
        }.getType());
        WorkProcessAdapter workProcessAdapter = new WorkProcessAdapter(this, list);
        rvWp.setAdapter(workProcessAdapter);
    }


    /** 状态栏 */
    public static void setBlackStateMode(Activity activity) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            View decor = activity.getWindow().getDecorView();
            decor.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
            activity.getWindow().setStatusBarColor(Color.parseColor("#E0EAFF"));
        }
    }

}