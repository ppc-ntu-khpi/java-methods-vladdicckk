//package domain;

public class Exercise {
    public static void main(String[] args) {
        int tmp = getSumDigitsOfData("20,02,06", 0);
        if (tmp/10 != 0) {
            System.out.println(tmp + ";");
            System.out.println(getSumDigitsOfData(String.valueOf(tmp), 0) + ";");
        } else System.out.println(tmp + ";");
    }
 
    private static int getSumDigitsOfData(String data, int indexChar) {
        if(indexChar > data.length() - 1) return 0;
        return data.charAt(indexChar) <= '9' && data.charAt(indexChar) > '0' ?
                (data.charAt(indexChar) - '0') + getSumDigitsOfData(data, indexChar + 1) :
                getSumDigitsOfData(data, indexChar + 1);
    }

    static String Calculate(int R) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
