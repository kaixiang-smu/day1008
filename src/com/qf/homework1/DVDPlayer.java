package com.qf.homework1;

public class DVDPlayer implements MediaPlayer{
    @Override
    public void play() {
        System.out.println("播放DVD");
    }

    @Override
    public void stop() {
        System.out.println("停止播放DVD");
    }

    @Override
    public void open() {
        System.out.println("开仓放入DVD");
    }
}
