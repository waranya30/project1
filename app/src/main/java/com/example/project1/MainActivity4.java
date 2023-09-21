package com.example.project1;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project1.model.Food;

import java.util.ArrayList;
import java.util.List;

public class MainActivity4 extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        List<Food> foods = new ArrayList<Food>();
        Food food1 = new Food();
        food1.setFood_name("ยำปลาช่อนทอดกรอบ");
        food1.setFood_image("https://i.ytimg.com/vi/wh5iSKTxmuE/maxresdefault.jpg");
        food1.setFood_price(300);
        foods.add(food1);

        Food food2 = new Food();
        food2.setFood_name("ปลาทับทิมทอดกระเทียม");
        food2.setFood_image("https://f.ptcdn.info/891/037/000/nymtn4oedmxU0oahiLh-o.jpg");
        food2.setFood_price(280);
        foods.add(food2);

        Food food3 = new Food();
        food3.setFood_name("ปลากระพงทอดน้ำปลา");
        food3.setFood_image("https://img.wongnai.com/p/1920x0/2022/06/12/163ab35b2cd54215940f038d3ad6c80a.jpg");
        food3.setFood_price(320);
        foods.add(food3);

        Food food4 = new Food();
        food4.setFood_name("ปลาทับทิม3รส");
        food4.setFood_image("https://i.ytimg.com/vi/RfxHTudzC5g/maxresdefault.jpg");
        food4.setFood_price(280);
        foods.add(food4);

        Food food5 = new Food();
        food5.setFood_name("หมูแดดเดียว");
        food5.setFood_image("https://www.gangbeauty.com/uppic/2018-12/20/ac6efdf82.jpg");
        food5.setFood_price(120);
        foods.add(food5);

        Food food6 = new Food();
        food6.setFood_name("เนื้อแดดเดียว");
        food6.setFood_image("https://img.wongnai.com/p/1920x0/2017/01/30/a36d6720d0f34e7fabb513238287315f.jpg");
        food6.setFood_price(120);
        foods.add(food6);

        Food food7 = new Food();
        food7.setFood_name("ไส้อ่อนทอดกระเทียม");
        food7.setFood_image("https://img.wongnai.com/p/1600x0/2023/03/17/a158d69dc37c4125816bcb6127c43022.jpg");
        food7.setFood_price(120);
        foods.add(food7);

        Food food8 = new Food();
        food8.setFood_name("ปีกไก่ทอดเกลือ");
        food8.setFood_image("https://img.wongnai.com/p/1920x0/2021/12/30/a59b6f5875cc4fd9a6bdffe5fb52daaf.jpg");
        food8.setFood_price(120);
        foods.add(food8);

        Food food9 = new Food();
        food9.setFood_name("ปีกไก่ทอดน้ำปลา");
        food9.setFood_image("https://img.wongnai.com/p/1968x0/2018/12/15/7dd89f517196412fa43fd65910e507bf.jpg");
        food9.setFood_price(120);
        foods.add(food9);

        mAdapter = new MyAdapter(foods, this);
        recyclerView.setAdapter(mAdapter);

    }
}