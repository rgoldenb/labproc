package com.example.goldenberg.lancadordebolinhaapp.controller;

import android.util.Log;
import android.view.View;

import com.example.goldenberg.lancadordebolinhaapp.model.LancadorModel;
import com.example.goldenberg.lancadordebolinhaapp.view.SettingsView;

/**
 * Created by Goldenberg on 27/09/16.
 */
public class BtnController implements View.OnClickListener{
    SettingsView view;
    LancadorModel model;

    public BtnController(SettingsView view, LancadorModel model){
        this.view = view;
        this.model = model;

        this.view.bluetooth_btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Log.v("Lancador de Bolinha", "Vamo liga esse Bluetooth");
    }
}
