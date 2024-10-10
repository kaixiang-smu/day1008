package com.qf.homework1;

public class Controller {
    private MediaPlayer[]  players;

    public MediaPlayer[] getPlayers() {
        return players;
    }

    public void setPlayers(MediaPlayer[] players) {
        this.players = players;
    }

    public Controller(){
        //构造函数中初始化 players 数组
        players = new MediaPlayer[3];
        players[0] = new TapePlayer();
        players[1] = new DVDPlayer();
        players[2] = new CDPlayer();
    }

    //对相应的设备调用play方法
    public void play(int i){
        players[i].play();
    }
    //对相应的设备调用open方法
    public void open(int i){
        players[i].open();
    }
    //对相应的设备调用stop方法
    public void stop(int i){
        players[i].stop();
    }

}
