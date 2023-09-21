package com.example.project1;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project1.model.Food;

import java.util.ArrayList;
import java.util.List;

public class MainActivity5 extends AppCompatActivity {

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
        food1.setFood_name("ผัดเผ็ดหมูป่า");
        food1.setFood_image("https://almocooking.com/wp-content/uploads/2019/05/%E0%B8%9C%E0%B8%B1%E0%B8%94.png");
        food1.setFood_price(120);
        foods.add(food1);

        Food food2 = new Food();
        food2.setFood_name("ปลาคังผัดฉ่า");
        food2.setFood_image("https://pstip.cc/public/upload/media/entries/2022-10/31/6350-entry-0-1667209789.jpg");
        food2.setFood_price(150);
        foods.add(food2);

        Food food3 = new Food();
        food3.setFood_name("ผัดผักรวมกุ้งสด");
        food3.setFood_image("https://i.ytimg.com/vi/X6RfLLXtwf4/maxresdefault.jpg");
        food3.setFood_price(120);
        foods.add(food3);

        Food food4 = new Food();
        food4.setFood_name("หมึกผัดไข่เค็ม");
        food4.setFood_image("https://img.wongnai.com/p/1600x0/2017/09/12/46fd78fe0d4c4953a5cafe40dd1ae4cc.jpg");
        food4.setFood_price(150);
        foods.add(food4);

        Food food5 = new Food();
        food5.setFood_name("เต้าหู้ทรงเครื่อง");
        food5.setFood_image("https://2.bp.blogspot.com/-BU8kcM7nsTw/VNObgx-4iHI/AAAAAAAABco/owT8ScEW7Uc/s1600/P1050026.jpg");
        food5.setFood_price(150);
        foods.add(food5);

        Food food6 = new Food();
        food6.setFood_name("กุ้งผัดพริกเกลือ");
        food6.setFood_image("https://f.ptcdn.info/911/053/000/ox33s4wjvo00XEssf3m-o.jpg");
        food6.setFood_price(150);
        foods.add(food6);

        Food food7 = new Food();
        food7.setFood_name("ผัดเผ็ดกบ");
        food7.setFood_image("https://i.ytimg.com/vi/rpFHYLvHYJM/maxresdefault.jpg");
        food7.setFood_price(120);
        foods.add(food7);

        Food food8 = new Food();
        food8.setFood_name("ผัดเผ็ดไก่บ้าน");
        food8.setFood_image("https://i.ytimg.com/vi/5yhyIF68RK8/maxresdefault.jpg");
        food8.setFood_price(150);
        foods.add(food8);

        Food food9 = new Food();
        food9.setFood_name("ทะเลผัดไข่เค็ม");
        food9.setFood_image("https://img-global.cpcdn.com/recipes/87efcb7c6e539fff/1200x630cq70/photo.jpg");
        food9.setFood_price(180);
        foods.add(food9);

        mAdapter = new MyAdapter(foods, this);
        recyclerView.setAdapter(mAdapter);

    }
}