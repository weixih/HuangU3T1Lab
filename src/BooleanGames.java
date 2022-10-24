public class BooleanGames {
    private int number;  // instance variable

    // constructor
    public BooleanGames(int number) {
        this.number = number;
    }

    public boolean isNegative() {
        return (number < 0);
    }

    public boolean exceeds(int num){
        return number > num;
    }

    public boolean isEven() {
        if(number%2 == 0){
            return true;
        }
        return false;
    }

    public boolean isOdd() {
        if(Math.abs(number)%2 == 0){
            return false;
        }
        return true;
    }

    public boolean isMultipleOf(int x) {
        if(number%x == 0){
            return true;
        }
        return false;
    }

    public boolean isOnesDigit(int num) {
        String positive = String.valueOf(Math.abs(number));
         int oneDigit = Integer.parseInt(positive.substring(positive.length()-1));

        if(oneDigit == num){
            return true;
        }
        return false;
    }
}
