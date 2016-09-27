package com.example.goldenberg.lancadordebolinhaapp.view;

import android.view.View;
import android.widget.SeekBar;
import android.widget.ToggleButton;

import com.example.goldenberg.lancadordebolinhaapp.R;
import com.example.goldenberg.lancadordebolinhaapp.model.LancadorModel;

/**
 * Created by Goldenberg on 27/09/16.
 */
public class SettingsView {
    LancadorModel model;
    View view;
    public ToggleButton bluetooth_btn;
    public SeekBar seekBarMotor1, seekBarMotor2;

    public SettingsView(View view, LancadorModel model){
        this.model = model;
        this.view = view;

        this.bluetooth_btn = (ToggleButton) view.findViewById(R.id.toggleButton);
        this.seekBarMotor1 = (SeekBar) view.findViewById(R.id.seekBar);
        this.seekBarMotor2 = (SeekBar) view.findViewById(R.id.seekBar2);
    }

}
