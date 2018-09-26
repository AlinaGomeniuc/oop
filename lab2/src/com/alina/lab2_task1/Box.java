package com.alina.lab2_task1;

public class Box {

    private double lungime;
    private double latime;
    private double inaltime;

    public Box (){

    }

    public Box (double parametru) {

        this.inaltime = parametru;
        this.latime = parametru;
        this.lungime = parametru;

    }

    public Box (double lungime, double latime, double inaltime) {
        this.lungime = lungime;
        this.latime = latime;
        this.inaltime = inaltime;
    }

    public void setLungime(double lungime) {
        this.lungime = lungime;
    }

    public void setInaltime(double inaltime) {
        this.inaltime = inaltime;
    }

    public void setLatime(double latime) {
        this.latime = latime;
    }

    public double getLungime() {
        return lungime;
    }

    public double getInaltime() {
        return inaltime;
    }

    public double getLatime() {
        return latime;
    }

    public double getArea (){
        if(this.inaltime == this.latime  && this.latime== this.lungime){
            return this.inaltime * this.inaltime * 6;
        }
        else {
          return 2*(this.lungime * this.inaltime + this.lungime * this.latime + this.inaltime * this.latime);
        }

    }

    public double getVolume (){

            return this.lungime * this.inaltime * this.latime;

    }
}
