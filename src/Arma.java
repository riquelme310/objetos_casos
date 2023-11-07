public class Arma {

            String tipo;
            String calibre;
            String material;


        public static void main(String[] args) {
            Arma arma1 = new Arma();
            arma1.tipo = "subfusil";
            arma1.calibre = "9mm";
            arma1.material = "metal";

            System.out.println("el tipo de arma es un: " + arma1.tipo + "\n");
            System.out.println("el calibre del arma es: " + arma1.calibre + "\n");
            System.out.println("el material con la que esta echa su arma es: " + arma1.material + "\n");

            Arma arma2 = new Arma();
            arma2.tipo = "fusil de asalto";
            arma2.calibre = "10mm";
            arma2.material = "acero";

            System.out.println("el tipo de arma es un: " + arma2.tipo + "\n");
            System.out.println("el calibre del arma es: " + arma2.calibre + "\n");
            System.out.println("el material con la que esta echa su arma es: " + arma2.material + "\n");

            Arma arma3 = new Arma();
            arma3.tipo = "escopeta";
            arma3.calibre ="12mm";
            arma3.material = "metal";


            System.out.println("el tipo de arma es un: " + arma3.tipo + "\n");
            System.out.println("el calibre del arma es: " + arma3.calibre + "\n");
            System.out.println("el material con la que esta echa su arma es: " + arma3.material + "\n");



        }

}
