package com.company.Q9;

public class Table extends Furniture {
    String type;
    boolean stress,fire;
    @Override
    public boolean checkStress() {
        return stress;
    }

    @Override
    public boolean checkFire() {
        return fire;
    }
    public boolean isFire(){
        return fire;
    }
    public boolean isStress(){
        return stress;
    }
    public Table(String type,boolean stress,boolean fire){
        this.fire=fire;
        this.stress=stress;
        this.type=type;
    }
}
