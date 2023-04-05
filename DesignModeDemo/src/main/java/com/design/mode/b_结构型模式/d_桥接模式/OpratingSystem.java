package com.design.mode.b_结构型模式.d_桥接模式;

/**
 * 抽象操作系统类
 * 抽象化（Abstraction）角色
 */
public abstract class OpratingSystem {

    //声明VideoFile
    protected VideoFile videoFile;

    public OpratingSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    public abstract void play(String fileName);
}
