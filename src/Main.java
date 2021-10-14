import java.io.File;

public class Main {
        static final File FHOME= new File("~");

    public static void main(String args[]){

    }

    public static void crear(){
        //Sólo se ejecuta en sistemas Linux
        if(System.getProperty("os.name").equals("Linux")){
            (new File(FHOME,"Prueba")).mkdir();
        }else{
            System.out.println("Este método sólamente funciona en sistemas Windows");
        }
    }

    public static void eliminar(){

    }

    public static void crear2(){

    }



}
