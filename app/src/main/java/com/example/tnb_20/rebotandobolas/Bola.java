package com.example.tnb_20.rebotandobolas;

public class Bola {

    private float height;
    private float wight;
    private float velX;
    private float velY;
    private float posX;
    private float posY;



    public Bola(float posX, float posY, float velX, float velY, float height, float wight) {
        this.posX = posX;
        this.velX = velX;
        this.wight = wight;
        this.velY = velY;
        this.height = height;
        this.posY = posY;

    }

    public float getPosX() {
        return posX;
    }

    public void setPosX(float posX) {
        this.posX = posX;
    }

    public float getPosY() {
        return posY;
    }

    public void setPosY(float posY) {
        this.posY = posY;
    }

    public float getVelX() {
        return velX;
    }

    public void setVelX(float velX) {
        this.velX = velX;
    }

    public float getVelY() {
        return velY;
    }

    public void setVelY(float velY) {
        this.velY = velY;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWight() {
        return wight;
    }

    public void setWight(float wight) {
        this.wight = wight;
    }
}
