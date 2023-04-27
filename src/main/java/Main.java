public class Main {
    public static void main(String[] args) {
        agregarcafe();
    }


    public static void agregarcafe() {
        Cafeteria cafeteria1 = new Cafeteria("Cafetería El Mormón","Los Ganaderos 03701","@elmormon_cafe");
        Cafe cafe1 = new Cafe(100,50,"grande");
        cafeteria1.agregarcafe(cafe1);
        System.out.println(cafe1.toString());
    }

}
