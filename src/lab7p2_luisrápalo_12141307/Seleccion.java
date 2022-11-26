package lab7p2_luisrápalo_12141307;

import java.util.ArrayList;

public class Seleccion {
    private String nombre;
    private int PG, PE, PP, GF, GC, Dif;
    private ArrayList Jugador = new ArrayList (26);

    public Seleccion() {
    }

    public Seleccion(String nombre, int PG, int PE, int PP, int GF, int GC, int Dif) {
        this.nombre = nombre;
        this.PG = PG;
        this.PE = PE;
        this.PP = PP;
        this.GF = GF;
        this.GC = GC;
        this.Dif = Dif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPG() {
        return PG;
    }

    public void setPG(int PG) {
        this.PG = PG;
    }

    public int getPE() {
        return PE;
    }

    public void setPE(int PE) {
        this.PE = PE;
    }

    public int getPP() {
        return PP;
    }

    public void setPP(int PP) {
        this.PP = PP;
    }

    public int getGF() {
        return GF;
    }

    public void setGF(int GF) {
        this.GF = GF;
    }

    public int getGC() {
        return GC;
    }

    public void setGC(int GC) {
        this.GC = GC;
    }

    public int getDif() {
        return Dif;
    }

    public void setDif(int Dif) {
        this.Dif = Dif;
    }

    public ArrayList getJugador() {
        return Jugador;
    }

    public void setJugador(ArrayList Jugador) {
        this.Jugador = Jugador;
    }

    @Override
    public String toString() {
        return "Seleccion{" + "nombre=" + nombre + ", PG=" + PG + ", PE=" + PE + ", PP=" + PP + ", GF=" + GF + ", GC=" + GC + ", Dif=" + Dif + ", Jugador=" + Jugador + '}';
    }
    
    
}
