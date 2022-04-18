package com.masai.Question3;

public class DiskRealManager implements DataReadManager, DataWriteManager{
    @Override
    public void read() {
        System.out.println("Reading DiskRealManager");
    }

    @Override
    public void write() {
        System.out.println("Writing DiskRealManager");
    }
}
