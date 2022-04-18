package com.masai.Question3;

public class DiskCoreManager implements DataReadManager, DataWriteManager{
    @Override
    public void read() {
        System.out.println("Reading DiskCoreManager");
    }

    @Override
    public void write() {
        System.out.println("Writing DiskCoreManager");
    }
}
