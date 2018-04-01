package com.jiyun.lalala;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Toolbar toobar;
    private ImageView carImg;
    private TextView carName;
    private TextView carPai;
    private TextView carTime;
    private ImageView lastImg;
    private Spinner spDwon, spDwons;
    private ArrayList<String> SpinList;
    private ArrayList<String> SpinLists;
    private ArrayAdapter<String> adapter;
    private ArrayAdapter<String> adapters;
    private RecyclerView recy;
    private TextView price;
    private Button ok;
    private ImageView kf;
    private ArrayList<CarChang> mlist;
    private MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initSpin();
        initData();
    }

    private void initData() {
        for (int i = 0; i < 10; i++) {
            mlist.add(new CarChang("燕隆汽修行", R.mipmap.ic_launcher, "北京市丰台区"));
        }
        myAdapter.notifyDataSetChanged();
        Log.e("aaaaaa",myAdapter.getItemCount()+"");
    }

    private void initSpin() {
        SpinList = new ArrayList<String>();
        SpinLists = new ArrayList<String>();
        SpinList.add("全部");
        SpinList.add("上海");
        SpinList.add("广州");
        SpinList.add("深圳");
        /*新建适配器*/
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, SpinList);
        adapters = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, SpinLists);

        /*adapter设置一个下拉列表样式，参数为系统子布局*/
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        adapters.setDropDownViewResource(android.R.layout.simple_spinner_item);

        /*spDown加载适配器*/
        spDwon.setAdapter(adapter);
        spDwons.setAdapter(adapter);


    }

    private void initView() {
        mlist = new ArrayList<>();
        toobar = (Toolbar) findViewById(R.id.toobar);
        toobar.setNavigationIcon(R.mipmap.a2);
        toobar.setTitle("包养首页");
        carImg = (ImageView) findViewById(R.id.carImg);
        carName = (TextView) findViewById(R.id.carName);
        carPai = (TextView) findViewById(R.id.carPai);
        carTime = (TextView) findViewById(R.id.carTime);
        lastImg = (ImageView) findViewById(R.id.lastImg);
        spDwon = (Spinner) findViewById(R.id.spDwon);
        spDwons = (Spinner) findViewById(R.id.spDwons);
        recy = (RecyclerView) findViewById(R.id.recy);
        recy.setOnClickListener(this);
        price = (TextView) findViewById(R.id.price);
        price.setOnClickListener(this);
        ok = (Button) findViewById(R.id.ok);
        ok.setOnClickListener(this);
        kf = (ImageView) findViewById(R.id.kf);
        kf.setOnClickListener(this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recy .setLayoutManager(linearLayoutManager);
        myAdapter = new MyAdapter(mlist);
        recy.setAdapter(myAdapter);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ok:

                break;
        }
    }
}
