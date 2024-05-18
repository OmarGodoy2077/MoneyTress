package org.example.ArbolBinario;
import  org.example.ArbolBinario.Nodo;
public class Arbol {

    private Nodo raiz;

    public Arbol(){this.raiz = null;}

    public void insertar(int dato){
        if (this.raiz == null){
            this.raiz = new Nodo(dato);
        }else{
            this.insertar(this.raiz, dato);
        }
    }

    private void insertar(Nodo padre, int dato){
        if (dato < padre.valorNodo()){
            if (padre.GetSubarbolIzdo() == null){
                padre.SetRamaIzdo( new Nodo(dato));
            }else{
                insertar(padre.GetSubarbolIzdo(), dato);
            }

        } else if (dato > padre.valorNodo()){
            if (padre.GetSubarbolDcho() == null){
                padre.SetRamaDcho( new Nodo(dato));
            }else{
                insertar(padre.GetSubarbolDcho(), dato);
            }
        }
    }
}