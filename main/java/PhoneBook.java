import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PhoneBook {
    ArrayList<ContactDetails> contactList;
    ArrayList<ContactDetails> contactListTosearch;
    private String inputNum;
    private String contact;
    private String name;
    private String phNum;
    private String addr;

    public PhoneBook() {
        //contactList = new ArrayList<ContactDetails>();
    }

    public void createContact(String name,String phNUm,String addr, ArrayList<ContactDetails> contactList) {
        /*Scanner sc = new Scanner(System.in);
        String contact=sc.nextLine();
        System.out.print(contact);
        StringTokenizer contactTokens= new StringTokenizer(contact,":");
        String name=contactTokens.nextToken();
        //System.out.println(name);
        String phNum=contactTokens.nextToken();
        //System.out.println(phNum);
        String addr=contactTokens.nextToken();
        //System.out.println(addr);*/
        this.name=name;
        this.phNum=phNUm;
        this.addr=addr;
        this.contactList=contactList;
        String encName="";
        for(int i=0;i<name.length();i++)
        {
            for(int j = 0;j<10;j++)
            {
                if(DailPad.keys[j].contains(name.charAt(i)+""))
                {
                    encName=encName+Integer.toString(j);
                    break;
                }
            }
        }
        encName=encName+phNum;
        ContactDetails cd = new ContactDetails();
        cd.setName(name);
        cd.setPhNum(phNum);
        cd.setAddress(addr);
        cd.setToNumberFormate(encName);
        contactList.add(cd);
    }

    public ArrayList<ContactDetails> grepInPhoneBook(String inputNum,ArrayList<ContactDetails> contactList) {
        this.inputNum = inputNum;
        this.contactListTosearch=contactList;
        ArrayList<ContactDetails> grepResult = new ArrayList<ContactDetails>();
        for(ContactDetails cd: contactListTosearch)
        {
            String str=cd.getToNumberFormate();
            if(str.contains(inputNum))
            {
                grepResult.add(cd);
            }
        }
        return grepResult;

    }
}
