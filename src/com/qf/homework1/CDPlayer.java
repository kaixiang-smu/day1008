package com.qf.homework1;

public class CDPlayer implements MediaPlayer{
    @Override
    public void play() {
        System.out.println("播放CD");
    }

    @Override
    public void stop() {
        System.out.println("停止播放CD");
    }

    @Override
    public void open() {
        System.out.println("开仓放入CD");
    }
}
