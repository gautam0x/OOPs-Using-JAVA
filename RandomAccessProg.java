import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class RandomAccessProg {
    public static void main(String[] args)
    {
        int pos,ch,strSize;
        String str;
        Scanner sc = new Scanner(System.in);

        do
        {
            System.out.print("\nEnter Your Choice :\n 1> Write To File\n 2> Read From File\n 0> Exit\n ==> ");
            // using nextLine everywhere to reduce buffering error
            ch =  Integer.parseInt(sc.nextLine());

            // Case 1 For Write Operaton & Case 2 For Read Operation 
            switch(ch)
            {
                case 1:
                    // Get user input Data and Posion Of cursor
                    System.out.print("\nEnter String To Write\n ==> ");
                    str = sc.nextLine();
                    System.out.print("\nEnter Random Position\n ==> ");
                    pos = Integer.parseInt(sc.nextLine());

                    // Write String Into File At Given Position
                    try
                    {
                        RandomAccessFile fwritter = new RandomAccessFile("file1.txt","rw");
                        fwritter.seek(pos);
                        fwritter.write(str.getBytes());
                        fwritter.close();
                        System.out.println("\n*** File Sucessfully Written");
                    }catch(IOException e) {}
                    break;

                case 2:
                    try
                    {
                        // Get User Input From whre to 
                        System.out.print("\nEnter Random Position To Read Data\n ==> ");
                        pos = Integer.parseInt(sc.nextLine());
                        System.out.print("Enter Length Of String To Display\n ==> ");
                        strSize = Integer.parseInt(sc.nextLine());

                        RandomAccessFile freader = new RandomAccessFile("file1.txt","r");
                        freader.seek(pos);
                        byte[] bytes = new byte[strSize];
                        freader.read(bytes);
                        freader.close();
                        System.out.println("\n ** Output From File : "+new String(bytes));
                    }catch(IOException e) {}
                    break;

                default:
                    break;
            }
        }while(ch!=0);
        sc.close();
    }
}