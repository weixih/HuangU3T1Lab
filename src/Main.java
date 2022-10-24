public class Main {
    public static void main(String[]args){

        BooleanGames game1 = new BooleanGames(7283);
        System.out.println(game1.isNegative());
        System.out.println("----");
        System.out.println(game1.exceeds(7000));
        System.out.println(game1.exceeds(7283));
        System.out.println(game1.exceeds(7500));
        System.out.println("----");
        System.out.println(game1.isEven());
        System.out.println(game1.isOdd());
        System.out.println("----");
        System.out.println(game1.isMultipleOf(1));
        System.out.println(game1.isMultipleOf(3));
        System.out.println(game1.isMultipleOf(7));
        System.out.println(game1.isMultipleOf(13));
        System.out.println(game1.isMultipleOf(10));
        System.out.println("----");
        System.out.println(game1.isOnesDigit(3));
        System.out.println(game1.isOnesDigit(8));
        System.out.println(game1.isOnesDigit(2));
        System.out.println(game1.isOnesDigit(7));
        System.out.println(game1.isOnesDigit(5));

    }
}
