
public class Principal{
    public static void main(String[] args) {
        
        Alumno alumno = new Alumno();
        alumno.setNombre("Jorge Matias");
        System.out.println(alumno.getNombre());
        alumno.setNombre("Jorge Matias");alumno.setNombre("Jorge Matias");alumno.setNombre("Jorge Matias");alumno.setNombre("Jorge Matias");
    

        alumno.saludar("Matias");
    }
}