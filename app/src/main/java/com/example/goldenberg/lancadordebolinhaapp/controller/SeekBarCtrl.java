package com.example.goldenberg.lancadordebolinhaapp.controller;

import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.SeekBar;

import com.example.goldenberg.lancadordebolinhaapp.MainActivity;
import com.example.goldenberg.lancadordebolinhaapp.model.LancadorModel;
import com.example.goldenberg.lancadordebolinhaapp.view.SettingsView;

/**
 * Created by Goldenberg on 27/09/16.
 */
public class SeekBarCtrl implements SeekBar.OnSeekBarChangeListener{
    LancadorModel model;
    SettingsView view;

    public SeekBarCtrl(SettingsView view, LancadorModel model){
        this.view = view;
        this.model = model;

        this.view.seekBarMotor1.setOnSeekBarChangeListener(this);
        this.view.seekBarMotor2.setOnSeekBarChangeListener(this);
    }


    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        if(seekBar == this.view.seekBarMotor1){
            try {
                //Log.v("SeekBar: ", ((Integer) progress).toString());
                ((MainActivity) view.getContext()).connectedThread.write((((Integer) progress).toString() + "#").getBytes());
            } catch (NullPointerException e) {
                Log.getStackTraceString(e);
            }
        }
        else if(seekBar == this.view.seekBarMotor2){
            try {
                //Log.v("SeekBar: ", ((Integer) progress).toString());
                ((MainActivity) view.getContext()).connectedThread.write((((Integer) progress).toString() + "#").getBytes());
            } catch (NullPointerException e) {
                Log.getStackTraceString(e);
            }
        }
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
