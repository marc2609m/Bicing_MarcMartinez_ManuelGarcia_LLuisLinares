package com.example.bicing_marcmartinez_manuelgarcia_lluisartes;

public class Estacion {

    private int id;
    private String nom;
    private int capacidad;
    private String direccion;
    private String tipo;
    private boolean abierto;


    public Estacion(int id, String nom, int capacidad, String direccion, String tipo, boolean abierto) {
        this.id = id;
        this.nom = nom;
        this.capacidad = capacidad;
        this.direccion = direccion;
        this.tipo = tipo;
        this.abierto = abierto;
    }

    public String getNom() {
        return nom;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isAbierto() {
        return abierto;
    }

    @Override
    public String toString() {
        return "Estacion\n" + "id: " + id  + "\n" + "nom: " + nom + "\n" + "capacitat: " + capacidad + "\n" + "direccio: " + direccion + "\n" + "tipus: " + tipo + "\n" + "obert: " + abierto;
    }
}
