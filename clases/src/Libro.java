public class Libro implements Persona {

    private String escritor;
    private String nombre;
    private int paginas;
    private String saga;

    public Libro(){


    }
    public Libro(String escritor){
        this.escritor = escritor;

    }

    public String getEscritor(){
        return this.escritor;
    }

    public void setEscritor(String escritor) {
        this.escritor = escritor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getSaga() {
        return saga;
    }

    public void setSaga(String saga) {
        this.saga = saga;
    }

    public void leer(Libro libro){
        System.out.println("estoy leyendo un libro " + libro.getNombre());
    }

    @Override
    public String toString(){
        return "yo soy el escritor " + this.escritor;
    }
}
