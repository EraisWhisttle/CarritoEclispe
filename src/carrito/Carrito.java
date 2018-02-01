package carrito;

/*
 * @author Erais A. Whisttle
 */
public class Carrito {

    public static void main(String[] args) {

		Molde carrito1 = new Molde();
        
        
        carrito1.setColor("Azul musulman");
        carrito1.setModelo("Ferrarry");
        carrito1.setTransmision("Standar");
        //System.out.println("la transmisiones: " + carrito1.transmision);
        //System.out.println("numero de puertas: " + carrito1.puertas);
        //System.out.println("El modelo es: " + carrito1.modelo);
        //System.out.println("El color es: " + carrito1.color);

        
        System.out.println(carrito1.getModelo());
        System.out.println(carrito1.getTransmisionr());
        System.out.println(carrito1.getColor());
        
        System.out.println("-------------");
        
        Molde carrito2 = new Molde("Chevrolet" , "Blu" , "2017" , "Manual" ,  5);
        
        System.out.println(carrito2.getColor());
        System.out.println(carrito2.getTransmisionr());
        System.out.println(carrito2.getModelo());
	}

    

}
