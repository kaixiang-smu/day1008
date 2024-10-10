package com.qf.homework1;

public class TapePlayer implements MediaPlayer{
    @Override
    public void play() {
        System.out.println("播放磁带");
    }

    @Override
    public void stop() {
        System.out.println("停止播放磁带");
    }

    @Override
    public void open() {
        System.out.println("开仓放入磁带");
    }
}
