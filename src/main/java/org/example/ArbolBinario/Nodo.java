package org.example.ArbolBinario;

public class Nodo {

    protected int dato;
    protected Nodo izdo;
    protected Nodo dcho;

    public Nodo (int valor){
        dato = valor;
        izdo = dcho = null;
    }

    public Nodo (Nodo ramaIzdo, int valor, Nodo ramaDcho){
        dato = valor;
        izdo = ramaIzdo;
        dcho = ramaDcho;
    }

    public int valorNodo(){
        return dato;}
    public Nodo GetSubarbolIzdo(){
        return izdo;}
    public Nodo GetSubarbolDcho(){
        return dcho;}

    public Nodo SetRamaIzdo(Nodo n){
        return izdo = n;}

    public Nodo SetRamaDcho(Nodo n){
        return dcho = n;
    }

    public void nuevoValor(int d){dato = d;}
    public void ramaIzdo(Nodo n){izdo = n;}
    public void ramaDcho(Nodo n){dcho = n;}

    public void imprimirDatos(){
        System.out.println(this.valorNodo());
    }

}

