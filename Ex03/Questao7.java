interface strFunction {
    String run();
}

class Questao7 {
    public static void main(String[] args) {
        strFunction b = () -> "Olá";

        System.out.println(b.run());

    }

}