package com.example.programalaberinto.Models;
import java.util.Observable;

public class Jugador extends Observable implements Runnable {

    private Personaje objetosPost;
    private boolean derecha=false, arriba=false, izquierda=false, abajo=false, status;

    public void setObjetosPost(Personaje objetosPost){
        this.objetosPost = objetosPost;
    }

    public void setDerecha(boolean derecha){
        this.derecha = derecha;
    }
    public void setIzquierda(boolean izquierda){
        this.izquierda = izquierda;
    }
    public void setArriba(boolean arriba){
        this.arriba = arriba;
    }
    public void  setAbajo(boolean abajo){
        this.abajo = abajo;
    }



    public Jugador(){
        status = true;
    }

    @Override
    public void run() {
        while(status){
            setChanged();
            notifyObservers(objetosPost);
            try {
                Thread.sleep(40l);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(arriba=true){
                objetosPost.setY(objetosPost.getY()+30);
            }

        }
    }
}
