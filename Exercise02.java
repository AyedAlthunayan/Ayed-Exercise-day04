public class Exercise02 {
    public static void main(String[] args) {
        System.out.println(throwEcxeption(3));
    }

    public static int throwEcxeption(int num1) {
        if (num1 % 5 != 0) {
            throw new Error("can't div by 5");
        } else return num1 / 5;
    }
}
