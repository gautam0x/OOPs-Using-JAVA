class WrapperClass
{
    public static void main(String[] args)
    {
        // Converting a primitive type to Wrapper object
        Integer wrapperInt = Integer.valueOf(745);
        Double wrapperDouble = Double.valueOf(3.14);
        Boolean wrapperBoolean = Boolean.valueOf(false);
        Character wrapperChar = Character.valueOf('G');

        // Display Values Of Wrapper Objet
        System.out.println("Wrapper Integer : "+wrapperInt+"\nWrapper Double : "+wrapperDouble+"\nWrapper Boolean : "+wrapperBoolean+"\nWrapper Character : "+wrapperChar);  



        // Converting Wrapper class object to Primitive
        int primitiveInt = wrapperInt.intValue();
        double primitiveDouble = wrapperDouble.doubleValue();
        boolean primitiveBoolean = wrapperBoolean.booleanValue();
        char primitiveChar = wrapperChar.charValue();

        // Display Values Of Primitive Values
        System.out.println("\nPrimitive int : "+primitiveInt+"\nPrimitive double : "+primitiveDouble+"\nPrimitive boolean : "+primitiveBoolean+"\nPrimitive char : "+primitiveChar);  
    }
}