package com.company.Q9;

public class Chair extends Furniture{
    boolean stress;
    boolean fire;
    String type;

    @Override
    public boolean checkStress() {
        return stress;
    }

    @Override
    public boolean checkFire() {
        return fire;
    }
    public String getType(){
        return type;
    }
    public boolean isFire(){
        return fire;
    }
    public boolean isStress(){
        return stress;
    }
    public Chair(String type,boolean fire,boolean stress){
        this.type=type;
        this.fire=fire;
        this.stress=stress;
    }
}
