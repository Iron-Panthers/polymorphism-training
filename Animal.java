public class Animal {

    private String name;
    private String species;

    public Animal(){
        name = "wild beast";
        species = name + "carnus";
    }
 
    public void eat(){
        System.out.println("Nom nom");
    }

    public void sleep(String message){
        System.out.println("I sleep like an animal");
        System.out.println(message);
    }
}
