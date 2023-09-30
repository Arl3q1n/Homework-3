package exercises;


public class Converter {

    // String variables
    String BoolStr = "tRue";
    String ByteStr = "120";
    String ShortStr = "32000";
    String IntStr = "147895632";
    String LongStr = "987654321987654321";
    String DoubleStr = "4444.5d";
    String FloatStr = "2354.56f";


    public void converter() {

        //String to boolean
        boolean Bool_ = Boolean.parseBoolean(BoolStr);
        System.out.println(Bool_);

        //String to byte
        byte Byte_ = Byte.parseByte(ByteStr);
        System.out.println(Byte_);

        // String to short
        short Short_ = Short.parseShort(ShortStr);
        System.out.println(Short_);

        // String to int
        int Int_ = Integer.parseInt(IntStr);
        System.out.println(Int_);

        // String to long
        long Long_ = Long.parseLong(LongStr);
        System.out.println(Long_);

        // String to double
        double Double_ = Double.parseDouble(DoubleStr);
        System.out.println(Double_);

        // String to float
        float Float_ = Float.parseFloat(FloatStr);
        System.out.println(Float_);
    }
}