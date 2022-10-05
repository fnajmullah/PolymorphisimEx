package com.fridoon;

public class Shap {

//    public void draw(){
//        System.out.println("Shap draw");
//    }
    public void erase(){
        System.out.println("Erase Shap");
    }

    public static void main(String[] args) {
        Shap shap= new Shap();
        shap.erase();
//        shap.draw();

        Shap shap1=new Circle();
//        shap1.draw();

        Shap shap2=new Rectangle();
//        shap2.draw();
    }
}
