package com.design.mode.b_结构型模式.d_桥接模式;

/**
 * windows操作系统
 * 扩展抽象化（Refined Abstraction）角色
 */
public class Mac extends OpratingSystem{
    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
