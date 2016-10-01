package com.example.goldenberg.lancadordebolinhaapp.controller;

import android.widget.CompoundButton;

import com.example.goldenberg.lancadordebolinhaapp.MainActivity;
import com.example.goldenberg.lancadordebolinhaapp.model.LancadorModel;
import com.example.goldenberg.lancadordebolinhaapp.view.SettingsView;

/**
 * Created by Goldenberg on 27/09/16.
 */
public class BtnController implements CompoundButton.OnCheckedChangeListener{
    SettingsView view;
    LancadorModel model;

    public BtnController(SettingsView view, LancadorModel model){
        this.view = view;
        this.model = model;

        this.view.bluetooth_btn.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if(isChecked){
            ((MainActivity) view.getContext()).connect();
        }
        else{
            //Turn Bluetooth offs
            ((MainActivity) view.getContext()).disconnect();
        }
    }
}
