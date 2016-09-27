package com.example.goldenberg.lancadordebolinhaapp;

import android.app.Activity;
import android.os.Bundle;

import com.example.goldenberg.lancadordebolinhaapp.Application.LancadorDeBolinha;
import com.example.goldenberg.lancadordebolinhaapp.controller.BtnController;
import com.example.goldenberg.lancadordebolinhaapp.controller.SeekBarCtrl;
import com.example.goldenberg.lancadordebolinhaapp.model.LancadorModel;
import com.example.goldenberg.lancadordebolinhaapp.view.SettingsView;

/**
 * Created by Goldenberg on 27/09/16.
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        LancadorModel model = ((LancadorDeBolinha) this.getApplication()).getModel();

        SettingsView settingsView = new SettingsView(findViewById(R.id.settings_view), model);
        BtnController btnController = new BtnController(settingsView, model);
        SeekBarCtrl seekBarCtrl = new SeekBarCtrl(settingsView, model);

    }
}