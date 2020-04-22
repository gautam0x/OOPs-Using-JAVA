class Crypt{
    // To Do Encode And Decode  
    public static String encode(String plainText,int pvtKey){

        int keySize = 0, keyDigitSum = 0;

        // find keySize and its Digit Sum
        int temp = pvtKey;
        while(temp>0){
            keyDigitSum += temp%10;
            keySize += 1;
            temp = temp/10;
        }

        // convert String to array
        char[] plainTextArray = plainText.toCharArray();

        // Manupulate all the Character 
        for(int i = 0; i < plainTextArray.length; i++){
            plainTextArray[i] -= keyDigitSum % keySize;
        }

        return String.valueOf(plainTextArray);
    }

    public static String decode(String encodedText,int pvtKey){

        int keySize = 0, keyDigitSum = 0;

        // find keySize and its Digit Sum
        int temp = pvtKey;
        while(temp>0){
            keyDigitSum += temp%10;
            keySize += 1;
            temp = temp/10;
        }
        
        // convert String to array
        char[] encodedTextArray = encodedText.toCharArray();

        // Recover Original Message
        for(int i = 0; i < encodedTextArray.length; i++){
            encodedTextArray[i] += keyDigitSum % keySize;
        }

        return String.valueOf(encodedTextArray);
    }
}

class Person{

    private String personName;
    private int pvtKey;

    // Initialize Person Name
    Person(String personName)
    { this.personName = personName; }

    // Decide Private Key
    public void setKey(int pvtKey)
    { this.pvtKey = pvtKey; }

    // Message will encoded within program
    public void encodeAndSend(Person person,String plainText){
        String encodedText = Crypt.encode(plainText, pvtKey);
        person.receiveAndDecode(this,encodedText);
    }

    // This message will pass through public channel
    public void receiveAndDecode(Person person,String encodedText){
        String decodedText = Crypt.decode(encodedText, pvtKey);
        System.out.println("\nSender Name : "+this.personName+"\nEncoded Message : "+encodedText);
        System.out.println("Receiver Name : "+person.personName+"\nDecoded Message : "+decodedText+"\n");
    }
}

public class EncodeDecode {
    public static void main(String[] args) {

        Person person1 = new Person("Nick Fury");
        Person person2 = new Person("Tony Stark");

        int privateKey = 4865;
        String message = "helloworld";

        person1.setKey(privateKey);
        person2.setKey(privateKey);

        // Encode Message And Send 
        person1.encodeAndSend(person2, message);
    }
}