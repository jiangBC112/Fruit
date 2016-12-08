package com.example.wlw.fruet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Fruit> fruitList=new ArrayList<Fruit>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();
        final FruitAdapter adapter=new FruitAdapter(MainActivity.this,R.layout.activity_fruit,fruitList);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Fruit fruit=(Fruit)adapterView.getItemAtPosition(i);
                String title=fruit.getTitle();
                Toast.makeText(MainActivity.this,title,Toast.LENGTH_SHORT).show();
            }
        });

    }
    private  void  initFruits()
    {
        Fruit fruit;
        fruit=new Fruit("苹果","这是一只苹果",R.drawable.apple_pic);
        fruitList .add(fruit);
        fruit=new Fruit("橙子","这是一只橙子",R.drawable.orange_pic);
        fruitList .add(fruit);
        fruit=new Fruit("香蕉","这是一根香蕉",R.drawable.banana_pic);
        fruitList .add(fruit);
        fruit=new Fruit("西瓜","这是一只西瓜",R.drawable.watermelon_pic);
        fruitList .add(fruit);
        fruit=new Fruit("雪梨","这是一只雪梨",R.drawable.pear_pic);
        fruitList .add(fruit);

    }
}
