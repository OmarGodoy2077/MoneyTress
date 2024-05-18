package org.example.ArbolCadena;

import org.example.ArbolBinario.Nodo;

public class ArbolCadenas {
    private NodoCadena raiz;

    public ArbolCadenas(){this.raiz = null;}

    public void insertar(String dato){
        if (this.raiz == null){
            this.raiz = new NodoCadena(dato);
        }else{
            this.insertar(this.raiz, dato);
        }
    }

    private void insertar(NodoCadena padre, String dato){
        if (dato.compareTo(dato)>0){
            if (padre.GetSubarbolIzdo() == null){
                padre.SetRamaIzdo( new NodoCadena(dato));
            }else{
                insertar(padre.GetSubarbolIzdo(), dato);
            }
        } else {
            if (padre.GetSubarbolDcho() == null){
                padre.SetRamaDcho( new NodoCadena(dato));
            }else{
                insertar(padre.GetSubarbolDcho(), dato);
            }
        }






    }

}
