package com.example.project1;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project1.model.Food;

import java.util.ArrayList;
import java.util.List;

public class MainActivity3 extends AppCompatActivity {

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
        food1.setFood_name("ต้มยำรวมมิตร");
        food1.setFood_image("https://3.bp.blogspot.com/-9zDA0b6_f_s/Wj-iMke7adI/AAAAAAAAAJo/9f9jp0fMmWUwIeISoTs91D6KWpPE2MFkACLcBGAs/s1600/thai-authentic.jpg ");
        food1.setFood_price(180);
        foods.add(food1);

        Food food2 = new Food();
        food2.setFood_name("ต้มยำไก่บ้าน");
        food2.setFood_image("https://i.ytimg.com/vi/Nee-nnJQIwY/maxresdefault.jpg");
        food2.setFood_price(180);
        foods.add(food2);

        Food food3 = new Food();
        food3.setFood_name("ต้มแซ่บกระดูกอ่อน");
        food3.setFood_image("https://www.khaosod.co.th/wpapp/uploads/2020/09/col10p1-2.jpg");
        food3.setFood_price(180);
        foods.add(food3);

        Food food4 = new Food();
        food4.setFood_name("ต้มแซ่บหมู,เนื้อ");
        food4.setFood_image("https://i.ytimg.com/vi/9odcaPDAPsI/maxresdefault.jpg");
        food4.setFood_price(180);
        foods.add(food4);

        Food food5 = new Food();
        food5.setFood_name("ต้มโคล้งปลาเนื้ออ่อน");
        food5.setFood_image("https://i.ytimg.com/vi/-jdwHu3fg-I/maxresdefault.jpg");
        food5.setFood_price(200);
        foods.add(food5);

        Food food6 = new Food();
        food6.setFood_name("ต้มยำปลาคัง");
        food6.setFood_image("https://img.wongnai.com/p/1920x0/2017/03/24/1b3c73280541457ba191af2f2ed28c60.jpg");
        food6.setFood_price(200);
        foods.add(food6);

        Food food7 = new Food();
        food7.setFood_name("แกงคั่วหอยขม");
        food7.setFood_image("https://img.wongnai.com/p/1920x0/2017/10/03/ecc24c2c3fd84709bd78f45a60fd598e.jpg");
        food7.setFood_price(180);
        foods.add(food7);

        Food food8 = new Food();
        food8.setFood_name("แกงจืดเต้าหู้หมูสาหร่าย");
        food8.setFood_image("https://i.ytimg.com/vi/Nj3DeipGLRw/maxresdefault.jpg");
        food8.setFood_price(180);
        foods.add(food8);

        Food food9 = new Food();
        food9.setFood_name("แกงป่าไก่บ้าน");
        food9.setFood_image("https://i.ytimg.com/vi/DLpFfFNxguE/maxresdefault.jpg");
        food9.setFood_price(180);
        foods.add(food9);

        mAdapter = new MyAdapter(foods, this);
        recyclerView.setAdapter(mAdapter);

    }
}