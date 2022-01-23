package app.demo.recyclerviewdemo;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import app.demo.recyclerviewdemo.adapter.SongAdapter;
import app.demo.recyclerviewdemo.models.SongInfo;

public class RecyclerViewDemoActivity extends AppCompatActivity {

    RecyclerView rvSongList;

    List<SongInfo> list = new ArrayList<>();

    SongAdapter adapter = new SongAdapter();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        setListeners();
        generateList();
        setData();
    }

    public void initViews(){
        rvSongList = findViewById(R.id.rv_song_list);
        rvSongList.setLayoutManager(new LinearLayoutManager(this));
        rvSongList.setAdapter(adapter);
        rvSongList.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));

    }

    public void setListeners(){

    }

    @SuppressLint("NotifyDataSetChanged")
    public void setData(){
        adapter.setList(list);
        adapter.notifyDataSetChanged();
    }

    private void generateList(){
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
        list.add(new SongInfo("Tujhe dekha tho ye jana sanam", "Udit Narayana", 500));
    }


}
