package hu.nive.ujratervezes.kepesitovizsga.addigits;

public class AddDigits {


    public int addDigits (String inputString){
        int sum=0;
        if(inputString == null || inputString == "") {
            return -1;
        }

        char[] temp = inputString.toCharArray();

        for(char c : temp){
            if (Character.isDigit(c)) {
                sum += Integer.parseInt(String.valueOf(c));
            }
        }
        return sum;
    }
}
