package com.design.mode.b_结构型模式.d_桥接模式;

/**
 * avi视频文件
 * 具体实现化（Concrete Implementor）角色
 */
public class AviFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("avi视频文件："+fileName);
    }
}
