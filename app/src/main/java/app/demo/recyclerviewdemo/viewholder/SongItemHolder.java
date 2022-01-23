package app.demo.recyclerviewdemo.viewholder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import app.demo.recyclerviewdemo.R;
import app.demo.recyclerviewdemo.models.SongInfo;

public class SongItemHolder extends RecyclerView.ViewHolder {

    TextView tvSongName;
    TextView tvSongArtist;
    TextView tvSongDuration;

    public SongItemHolder(@NonNull View itemView) {
        super(itemView);
        tvSongName = itemView.findViewById(R.id.tv_song_name);
        tvSongArtist = itemView.findViewById(R.id.tv_song_artist);
        tvSongDuration = itemView.findViewById(R.id.tv_duration);
    }

    public void setData(SongInfo data){
        if (data != null){
            tvSongName.setText(data.getSongName());
            tvSongArtist.setText(data.getArtistName());
            tvSongDuration.setText(String.valueOf(data.getDuration()));
        }
    }

}
