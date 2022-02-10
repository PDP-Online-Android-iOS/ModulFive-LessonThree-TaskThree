package dev.ogabek.java.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import dev.ogabek.java.R;
import dev.ogabek.java.adapter.ImgAdapter;
import dev.ogabek.java.model.Img;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

    }

    private void initViews() {
        RecyclerView recyclerView = findViewById(R.id.rv_main);

        recyclerView.setLayoutManager(new GridLayoutManager(this, 1, GridLayoutManager.HORIZONTAL, false));

        ImgAdapter adapter = new ImgAdapter(prepareImgList());

        recyclerView.setAdapter(adapter);

    }

    private List<Img> prepareImgList() {
        List<Img> list = new ArrayList<>();

        list.add(new Img(R.drawable.first));
        list.add(new Img(R.drawable.second));
        list.add(new Img(R.drawable.third));
        list.add(new Img(R.drawable.fouth));

        return list;
    }
}