public class DogDriver {
    public static void main(String[] args) {
        Dog fido = new Dog();
        fido.setBreed("Beagle");
        fido.setName("Fido");

        for(int i = 0; i < 4; i++){
            new Paw(i, fido);
        }

        System.out.println(fido);
    }
}
