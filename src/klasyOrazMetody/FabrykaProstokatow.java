package klasyOrazMetody;

public class FabrykaProstokatow {

    public static void main(String[] args) {

        Prostokat prostokatNumerJeden = new Prostokat(10, 5);
        Prostokat prostokatNumerDwa = new Prostokat(4, 2);


        Prostokat prostokatNowy = new Prostokat(5, 4, "dupa");

        System.out.println(prostokatNowy.getNazwaProstokata());

        prostokatNowy.test();
        prostokatNowy.test("razdwatrzy");

        int poleProstokata = prostokatNowy.test(prostokatNowy.getA(), prostokatNowy.getB());
        System.out.println(poleProstokata);

    }
}
