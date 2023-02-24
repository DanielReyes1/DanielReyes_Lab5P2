
package danielreyes_lab5p2;


public class Personaje {
    private String nombre, poder, debilidad, universo;
    private int fuerza, fisica, mental, hp;

    public Personaje() {
    }

    public Personaje(String nombre, String poder, String debilidad, String universo, int fuerza, int fisica, int mental, int hp) {
        this.nombre = nombre;
        this.poder = poder;
        this.debilidad = debilidad;
        this.universo = universo;
        this.fuerza = fuerza;
        this.fisica = fisica;
        this.mental = mental;
        this.hp = hp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public String getUniverso() {
        return universo;
    }

    public void setUniverso(String universo) {
        this.universo = universo;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getFisica() {
        return fisica;
    }

    public void setFisica(int fisica) {
        this.fisica = fisica;
    }

    public int getMental() {
        return mental;
    }

    public void setMental(int mental) {
        this.mental = mental;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return nombre + 
                "\n          Poder: " + poder + 
                "\n          Debilidad: " + debilidad + 
                "\n          Universo: " + universo + 
                "\n          Fuerza: " + fuerza + 
                "\n          Fisica: " + fisica + 
                "\n          Mental: " + mental + 
                "\n          Hp: " + hp ;
    }
    
    
}
