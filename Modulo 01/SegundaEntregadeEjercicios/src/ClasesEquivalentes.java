public class ClasesEquivalentes {
    public static void main (String[] args){

        boolean soyBooleanPrimitivo = true;
        char soyCharPrimitivo = 'A';
        byte soyBytePrimitivo= 10;
        short soyShortPrimitivo = 100;
        int soyIntPrimitivo = 1000;
        long soyLongPrimitivo = 10_000;
        float soyFloatPrimitivo = 3.1416F;
        double soyDoublePrimitivo = 2.71828;

        //Autoboxing (Java pasa los datos de primitivos a wrapper class object)

        Boolean boxedBoolean = soyBooleanPrimitivo;
        Character boxedChar = soyCharPrimitivo;
        Byte boxedByte = soyBytePrimitivo;
        Short boxedShort = soyShortPrimitivo;
        Integer boxedInt = soyIntPrimitivo;
        Long boxedLong = soyLongPrimitivo;
        Float boxedFloat = soyFloatPrimitivo;
        Double boxedDouble = soyDoublePrimitivo;

        //Podemos acceder a sus metodos
        //Unboxing manual

        System.out.println(boxedBoolean.booleanValue());
        System.out.println(boxedChar.charValue());
        System.out.println(boxedByte.byteValue());
        System.out.println(boxedShort.shortValue());
        System.out.println(boxedInt.intValue());
        System.out.println(boxedLong.longValue());
        System.out.println(boxedFloat.floatValue());
        System.out.println(boxedDouble.doubleValue());

        boolean soyUnboxedBoolean = boxedBoolean;
        char soyUnboxedChar = boxedChar;
        byte soyUnboxedByte = boxedByte;
        short soyUnboxedShort = boxedShort;
        int soyUnboxedInt = boxedInt;
        long soyUnboxedLong = boxedLong;
        float soyUnboxedFloat = boxedFloat;
        double soyUnboxedDouble = boxedDouble;

        //Comparamos unboxed y los primitivos

        System.out.printf("¿Soy unboxed %b y soy igual a %b primitivo? %b%n", soyUnboxedBoolean, soyBooleanPrimitivo, soyUnboxedBoolean == soyBooleanPrimitivo );
        System.out.printf("¿Soy unboxed %c y soy igual a %c primitivo? %b%n", soyUnboxedChar, soyCharPrimitivo, soyUnboxedChar == soyCharPrimitivo );
        System.out.printf("¿Soy unboxed %d y soy igual a %d primitivo? %b%n", soyUnboxedByte, soyBytePrimitivo, soyUnboxedByte == soyBytePrimitivo );
        System.out.printf("¿Soy unboxed %d y soy igual a %d primitivo? %b%n", soyUnboxedShort, soyShortPrimitivo, soyUnboxedShort == soyShortPrimitivo );
        System.out.printf("¿Soy unboxed %d y soy igual a %d primitivo? %b%n",soyUnboxedInt, soyIntPrimitivo, soyUnboxedInt == soyIntPrimitivo);
        System.out.printf("¿Soy unboxed %d y soy igual a %d primitivo? %b%n", soyUnboxedLong, soyLongPrimitivo, soyUnboxedLong == soyLongPrimitivo);
        System.out.printf("¿Soy unboxed %.4f y soy igual a %.4f primitivo? %b%n", soyUnboxedFloat, soyFloatPrimitivo, soyUnboxedFloat == soyLongPrimitivo);
        System.out.printf("¿Soy unboxed %.5f y soy igual a %.5f primitivo? %b%n", soyUnboxedDouble, soyDoublePrimitivo, soyUnboxedDouble == soyDoublePrimitivo);
    }
}
