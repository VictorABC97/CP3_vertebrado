public class GeneradorVertebrados {
    public static Vertebrado[] generarArrayVertebrados(){
        Vertebrado[] miVertebrados = new Vertebrado[4];
        miVertebrados[0] = new Vertebrado("Camello", "Mamifero"); 
        miVertebrados[1] = new Vertebrado("Bufalo", "Mamifero");
        miVertebrados[2] = new Vertebrado("Perro", "Pez"); 
        
        
        return miVertebrados;
    }
}
