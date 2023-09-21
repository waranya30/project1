package com.example.project1;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project1.model.Food;

import java.util.ArrayList;
import java.util.List;

public class MainActivity6 extends AppCompatActivity {

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
        food1.setFood_name("ตำปูปลาร้า");
        food1.setFood_image("https://3.bp.blogspot.com/-0jS1Pbr-1g0/VdTRaMUYIZI/AAAAAAAAEtc/JF-xuUg8Hws/s1600/ea44a.jpg");
        food1.setFood_price(50);
        foods.add(food1);

        Food food2 = new Food();
        food2.setFood_name("ตำโคราช");
        food2.setFood_image("https://img-global.cpcdn.com/recipes/45423cf313ebde59/751x532cq70/%E0%B8%A3%E0%B8%B9%E0%B8%9B-%E0%B8%AB%E0%B8%A5%E0%B8%B1%E0%B8%81-%E0%B8%82%E0%B8%AD%E0%B8%87-%E0%B8%AA%E0%B8%B9%E0%B8%95%E0%B8%A3-%E0%B8%95%E0%B8%B3%E0%B9%82%E0%B8%84%E0%B8%A3%E0%B8%B2%E0%B8%8A.jpg");
        food2.setFood_price(60);
        foods.add(food2);

        Food food3 = new Food();
        food3.setFood_name("ตำไทย");
        food3.setFood_image("https://img.wongnai.com/p/1600x0/2016/11/30/89952d6e42eb4a8ba5dceb4bd4193242.jpg");
        food3.setFood_price(60);
        foods.add(food3);

        Food food4 = new Food();
        food4.setFood_name("ตำไทยไข่เค็ม");
        food4.setFood_image("https://mpics.mgronline.com/pics/Images/561000011320304.JPEG");
        food4.setFood_price(70);
        foods.add(food4);

        Food food5 = new Food();
        food5.setFood_name("ตำหมูยอ");
        food5.setFood_image("https://img.wongnai.com/p/1968x0/2018/08/05/4a1a0d444fce42748e9eba08cb241a48.jpg");
        food5.setFood_price(60);
        foods.add(food5);

        Food food6 = new Food();
        food6.setFood_name("ตำถาด");
        food6.setFood_image("https://s3-ap-southeast-1.amazonaws.com/photo.wongnai.com/photos/2014/06/27/10458e0f854840c685999ffe2cd5aaf0.jpg");
        food6.setFood_price(120);
        foods.add(food6);

        Food food7 = new Food();
        food7.setFood_name("ตำลาวกุ้งสด");
        food7.setFood_image("https://www.echoexpress.co.th/shop_files/product/206/1592998581_%E0%B8%95%E0%B8%B3%E0%B8%81%E0%B8%B8%E0%B9%89%E0%B8%87%E0%B8%AA%E0%B8%94.jpg");
        food7.setFood_price(120);
        foods.add(food7);

        Food food8 = new Food();
        food8.setFood_name("ตำแตง");
        food8.setFood_image("https://img.wongnai.com/p/1600x0/2016/08/28/8c343836a4a74333905ff6ae97aba074.jpg");
        food8.setFood_price(60);
        foods.add(food8);

        Food food9 = new Food();
        food9.setFood_name("ตำป่า");
        food9.setFood_image("https://i.ytimg.com/vi/7mlNHWtHFHo/maxresdefault.jpg");
        food9.setFood_price(60);
        foods.add(food9);

        mAdapter = new MyAdapter(foods, this);
        recyclerView.setAdapter(mAdapter);

    }
}