package com.example.xilophone;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    private int mCSoundId;
    private int mDSoundId;
    private int mESoundId;
    private int mFSoundId;
    private int mGSoundId;
    private int mASoundId;
    private int mBSoundId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void playDo(View view){
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.note1_do);
        mediaPlayer.start();
    }
    public void playRe(View view){
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.note2_re);
        mediaPlayer.start();
    }
    public void playMi(View view){
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.note3_mi);
        mediaPlayer.start();
    }
    public void playFa(View view){
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.note4_fa);
        mediaPlayer.start();
    }
    public void playSol(View view){
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.note5_sol);
        mediaPlayer.start();
    }
    public void playLa(View view){
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.note6_la);
        mediaPlayer.start();
    }

    public void playSi(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.note6_la);
        mediaPlayer.start();
    }
}