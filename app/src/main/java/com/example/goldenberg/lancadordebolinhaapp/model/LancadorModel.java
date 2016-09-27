package com.example.goldenberg.lancadordebolinhaapp.model;

/**
 * Created by Goldenberg on 27/09/16.
 */
public class LancadorModel {
    public float motor1rpm;
    public float motor2rpm;

    public LancadorModel(){

    }

    public void setMotor1rpm(float motor1rpm) {
        this.motor1rpm = motor1rpm;
    }

    public void setMotor2rpm(float motor2rpm) {
        this.motor2rpm = motor2rpm;
    }

    public float getMotor1rpm() {
        return motor1rpm;
    }

    public float getMotor2rpm() {
        return motor2rpm;
    }

}
