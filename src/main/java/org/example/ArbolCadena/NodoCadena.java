package org.example.ArbolCadena;

public class NodoCadena {

    protected String dato;
    protected NodoCadena izdo;
    protected NodoCadena dcho;

    public NodoCadena (String valor){
        dato = valor;
        izdo = dcho = null;
    }

    public NodoCadena (NodoCadena ramaIzdo, String valor, NodoCadena ramaDcho){
        dato = valor;
        izdo = ramaIzdo;
        dcho = ramaDcho;
    }

    public String valorNodo(){
        return dato;}
    public NodoCadena GetSubarbolIzdo(){
        return izdo;}
    public NodoCadena GetSubarbolDcho(){
        return dcho;}

    public NodoCadena SetRamaIzdo(NodoCadena n){
        return izdo = n;}

    public NodoCadena SetRamaDcho(NodoCadena n){
        return dcho = n;
    }

    public void nuevoValor(String d){dato = d;}
    public void ramaIzdo(NodoCadena n){izdo = n;}
    public void ramaDcho(NodoCadena n){dcho = n;}

    public void imprimirDatos(){
        System.out.println(this.valorNodo());
    }

}