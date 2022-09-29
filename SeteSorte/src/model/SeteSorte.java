package model;

import java.util.Random;

public class SeteSorte {
    private int valor1;
    private int valor2;
    private int valor3;

    private int numero1;
    private int numero2;
    private int numero3;

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getNumero3() {
        return numero3;
    }

    public void setNumero3(int numero3) {
        this.numero3 = numero3;
    }

    public SeteSorte(){
        Random r =new Random();
        valor1 = r.nextInt(3);
        valor2 = r.nextInt(3);
        valor3 = r.nextInt(3);

int a1, a2, a3;
    }

    public int getValor1() {
        return valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public int getValor3() {
        return valor3;
    }


}
