package main;

import classes.Autobuz;
import classes.AutobuzAbstract;
import classes.AutobuzElectric;

public class Main {
    public static void main(String[] args) {
        Autobuz prototip = new Autobuz("Electric","Ruta1");
        AutobuzAbstract autobuzElectric = prototip.clone();
        System.out.println(autobuzElectric);
    }
}