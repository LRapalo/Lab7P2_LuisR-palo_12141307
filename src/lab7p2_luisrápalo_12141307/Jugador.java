package lab7p2_luisrápalo_12141307;
public class Jugador {
    private String nombre, psiscion;
    private int dorsal, goles, asistencia, partidosJ, tarjetasA, tarjetasR, faltasC, faltasR;

    public Jugador() {
    }

    public Jugador(String nombre, String psiscion, int dorsal, int goles, int asistencia, int partidosJ, int tarjetasA, int tarjetasR, int faltasC, int faltasR) {
        this.nombre = nombre;
        this.psiscion = psiscion;
        this.dorsal = dorsal;
        this.goles = goles;
        this.asistencia = asistencia;
        this.partidosJ = partidosJ;
        this.tarjetasA = tarjetasA;
        this.tarjetasR = tarjetasR;
        this.faltasC = faltasC;
        this.faltasR = faltasR;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPsiscion() {
        return psiscion;
    }

    public void setPsiscion(String psiscion) {
        this.psiscion = psiscion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public int getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(int asistencia) {
        this.asistencia = asistencia;
    }

    public int getPartidosJ() {
        return partidosJ;
    }

    public void setPartidosJ(int partidosJ) {
        this.partidosJ = partidosJ;
    }

    public int getTarjetasA() {
        return tarjetasA;
    }

    public void setTarjetasA(int tarjetasA) {
        this.tarjetasA = tarjetasA;
    }

    public int getTarjetasR() {
        return tarjetasR;
    }

    public void setTarjetasR(int tarjetasR) {
        this.tarjetasR = tarjetasR;
    }

    public int getFaltasC() {
        return faltasC;
    }

    public void setFaltasC(int faltasC) {
        this.faltasC = faltasC;
    }

    public int getFaltasR() {
        return faltasR;
    }

    public void setFaltasR(int faltasR) {
        this.faltasR = faltasR;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", psiscion=" + psiscion + ", dorsal=" + dorsal + ", goles=" + goles + ", asistencia=" + asistencia + ", partidosJ=" + partidosJ + ", tarjetasA=" + tarjetasA + ", tarjetasR=" + tarjetasR + ", faltasC=" + faltasC + ", faltasR=" + faltasR + '}';
    }
    
    
}
