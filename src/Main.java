import java.io.File;

public class Main {
        static final File FHOME= new File(System.getProperty("user.home"));

    public static void main(String args[]){

    }


    public static void crear(){
        //Sólo se ejecuta en sistemas Linux
        if(System.getProperty("os.name").equals("Linux")){

            new File(FHOME,"Pruebas/Primera/Tercera").mkdirs();
            new File(FHOME,"Pruebas/Segunda").mkdirs();
        }else{
            System.out.println("Este método sólamente funciona en sistemas Windows");
        }
    }


    //Elimina todos los directorios dentro de Pruebas, de abajo a arriba.
    public static void eliminar(){
        if(System.getProperty("os.name").equals("Linux")) {
            new File(FHOME, "Pruebas/Primera/Tercera").delete();
            new File(FHOME, "Pruebas/Primera/").delete();
            new File(FHOME, "Pruebas/Segunda/").delete();
        }else{
            System.out.println("Este método sólamente funciona en sistemas Windows");
        }
    }




    //Devuelve false si algun directorio no se ha podido crear,
    //Sea cual sea el motivo (incluso si no se puede porque ya está creado).
    public static boolean crear2(){
        boolean exito=false;

        if(System.getProperty("os.name").equals("Linux")) {
             exito = new File(FHOME, "Pruebas/Primera/Tercera").mkdirs() & new File(FHOME, "Pruebas/Segunda").mkdirs();

        }else{
            System.out.println("Este método sólamente funciona en sistemas Windows");
        }
        return exito;
    }



}
