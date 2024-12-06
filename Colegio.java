public class Colegio {
    
    private int id;
    private String nombreColegio;

    //Constructor vacio
    public Colegio(){
    }

    //Constructor con parametros
    public Colegio(int id, String nombreColegio){
        this.id = id;
        this.nombreColegio = nombreColegio;
    }

    //METODOS GET Y SETS
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNombreColegio(){
        return nombreColegio;
    }

    public void setNombreColegio(String nombreColegio){
        this.nombreColegio = nombreColegio;
    }
}
