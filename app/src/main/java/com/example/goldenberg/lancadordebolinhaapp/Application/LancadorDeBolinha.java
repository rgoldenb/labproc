package com.example.goldenberg.lancadordebolinhaapp.Application;

/**
 * Created by Goldenberg on 27/09/16.
 */
import android.app.Application;

import com.example.goldenberg.lancadordebolinhaapp.model.LancadorModel;

public class LancadorDeBolinha extends Application {
    private LancadorModel model = new LancadorModel();

    public LancadorModel getModel() { return model; }

    public void setModel(LancadorModel model) {
        this.model = model;
    }
}
