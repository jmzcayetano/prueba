public class Colegio {
    
    private int id;
    private String nombreColegio;
    private String sede;

    //Constructor vacio
    public Colegio(){
    }

    //Constructor con parametros
    public Colegio(int id, String nombreColegio, String sede){
        this.id = id;
        this.nombreColegio = nombreColegio;
        this.sede = sede;
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

    public String getSede(){
        return sede;
    }

    public void setSede(String sede){
        this.sede = sede;
    }
}
