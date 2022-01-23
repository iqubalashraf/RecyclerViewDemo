package app.demo.recyclerviewdemo.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import app.demo.recyclerviewdemo.R;
import app.demo.recyclerviewdemo.models.SongInfo;
import app.demo.recyclerviewdemo.viewholder.SongItemHolder;

public class SongAdapter extends RecyclerView.Adapter<SongItemHolder> {

    private List<SongInfo> list = new ArrayList<>();

    @NonNull
    @Override
    public SongItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.vh_song_item_holder, parent, false);
        return new SongItemHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SongItemHolder holder, int position) {
        holder.setData(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void setList(List<SongInfo> list) {
        this.list = list;
    }
}
