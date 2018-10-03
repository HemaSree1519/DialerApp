import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class DailerAppDemo {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        boolean exit=false;
        PhoneBook pb=new PhoneBook();
        ArrayList<ContactDetails> contactList;
        contactList = new ArrayList<ContactDetails>();
        do {
            System.out.println("\n"+"Choose option");
            System.out.println("1. Add" + "\n" + "2. Search" + "\n" + "3. Exit");
            int choice = scan.nextInt();
            switch (choice)
            {
                case 1 : {
                    Scanner sc = new Scanner(System.in);
                    String contact=sc.nextLine();
                    StringTokenizer contactTokens= new StringTokenizer(contact,":");
                    String name=contactTokens.nextToken();
                    String phNum=contactTokens.nextToken();
                    String addr=contactTokens.nextToken();
                    pb.createContact(name,phNum,addr,contactList);
                            break;
                }
                case 2 : {
                            String inputNum=scan.next();
                            ContactDetails temp=new ContactDetails();
                            temp.display(pb.grepInPhoneBook(inputNum,contactList));
                    break;
                }
                case 3 : {
                            exit=true;
                    break;
                }
                default: {
                    System.out.println("Invalid Option");

                    break;
                }

            }
        }while(exit==false);
    }
}