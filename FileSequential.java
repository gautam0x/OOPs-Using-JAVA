import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class FileSequential
{
    public static void main(String[] args) {
        int ch;
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
                    System.out.print("\nEnter String To Write\n ==> ");
                    str = sc.nextLine();

                    try
                    {
                        FileWriter fwritter = new FileWriter("testfile.txt");

                        for(int i = 0; i<str.length(); i++)
                            fwritter.write(str.charAt(i));

                        fwritter.close();
                        System.out.println("\n*** File Sucessfully Written");
                    }catch(IOException e) {}
                    break;

                case 2:
                    try
                    {
                        File freader = new File("testfile.txt");
                        Scanner fileObj = new Scanner(freader);

                        System.out.print("\nOutput From File : ");

                        while (fileObj.hasNextLine())
                        {
                            String strLine = fileObj.nextLine();
                            System.out.println(strLine);
                        }

                        fileObj.close();
                    }catch(IOException e) {}
                    break;

                default:
                    break;
            }
        }while(ch!=0);

        sc.close();
    }
}