package com.example.music;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelStoreOwner;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    // Creating Soundpool Variable
    private SoundPool mSoundPool;


    //variables for holding sound Ids
    private int mFadedSound;
    private int mOnMyWaySound;
    private int mAloneSound;
    private int mIgniteSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSoundPool = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        mFadedSound = mSoundPool.load(getApplicationContext(),R.raw.faded,1);
        mOnMyWaySound = mSoundPool.load(getApplicationContext(),R.raw.on_my_way_alan,1);
        mAloneSound = mSoundPool.load(getApplicationContext(),R.raw.alone_pt_ii,1);
        mIgniteSound = mSoundPool.load(getApplicationContext(),R.raw.ignite_alan_walker,1);



    }

    //       //On Click Methods
    public void alone(View v) {
        Log.d("button clicked", "alone: ");
        mSoundPool.play(mAloneSound,1.0f,1.0f,0,0,1.0f);
    }
    public void faded(View v) {
        Log.d("button clicked", "faded: ");
        mSoundPool.play(mFadedSound,1.0f,1.0f,0,0,1.0f);
    }
    public void onMyWay(View v) {
        Log.d("button clicked", "onMyWay: ");
        mSoundPool.play(mOnMyWaySound,1.0f,1.0f,0,0,1.0f);
    }
    public void ignite(View v) {
        Log.d("button clicked", "ignite: ");
        mSoundPool.play(mIgniteSound,1.0f,1.0f,0,0,1.0f);
    }
}