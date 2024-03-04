public class TypeData {
    public static void main(String[] args) {
        System.out.println("Type Data");
        byte typeDataByte = 100;
        System.out.println("ini type Data Byte : "+typeDataByte);
        short typeDataShort = 1000;
        System.out.println("ini type Data Short : "+typeDataShort);
        int typeDataInt = 10000000;
        System.out.println("ini type Data Int : "+typeDataInt);
        long typeDataLong = 1000000000;
        System.out.println("ini type Data Long 1 : "+typeDataLong);
        long typeDataLong2 = 1000000000L;
        System.out.println("ini type Data Long 2 : "+typeDataLong2);
        float typeDataFloat = 10.10F;
        System.out.println("ini type Data Float : "+typeDataFloat);
        double typeDataDouble = 10.10;
        System.out.println("ini type Data Doble : "+typeDataDouble);

        int typeDataDecimalInt = 34;
        System.out.println("ini type Data Decimal Int : "+typeDataDecimalInt);
        int typeDataHexaDecimal = 0xFFFFFF;
        System.out.println("ini type Data Hexa Decimal : "+typeDataHexaDecimal);
        int typeDataBinaryDecimal = 0b10101010;
        System.out.println("ini type Data Binary Decimal : "+typeDataBinaryDecimal);

        // cara penggunaan amount
        int amount = 1_000_000_000;
        System.out.println("Value Amount : "+amount);
    }
}
