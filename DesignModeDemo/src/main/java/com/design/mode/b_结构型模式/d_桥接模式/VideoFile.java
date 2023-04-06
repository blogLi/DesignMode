package com.design.mode.b_结构型模式.d_桥接模式;

/**
 * 视频文件
 * 实现化（Implementor）角色
 */
public interface VideoFile {

    //解码
    void decode(String fileName);
}
