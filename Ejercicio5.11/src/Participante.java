public class Participante {

    private String nombre;
    private int marca2002;
    private int marca2001;
    private int marca2000;

    Participante(String nombre, int marca2002, int marca2001, int marca2000){
          this.setNombre(nombre);
          this.setMarca2002(marca2002);
          this.setMarca2001(marca2001);
          this.setMarca2000(marca2000);
    }
     Participante(){

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMarca2002() {
        return marca2002;
    }

    public void setMarca2002(int marca2002) {
        this.marca2002 = marca2002;
    }

    public int getMarca2001() {
        return marca2001;
    }

    public void setMarca2001(int marca2001) {
        this.marca2001 = marca2001;
    }

    public int getMarca2000() {
        return marca2000;
    }

    public void setMarca2000(int marca2000) {
        this.marca2000 = marca2000;
    }
}
