import java.util.ArrayList;

public class ContactDetails {
    private String name;
    private String phNum;
    private String address;
    private String toNumberFormate;
   public ContactDetails(){}
    public void setName(String name) {
        this.name=name;
    }
    public void setPhNum(String phNum)
    {
        this.phNum=phNum;
    }
    public void setAddress(String addr)
    {
        this.address=addr;
    }
    public void setToNumberFormate(String toNumberFormate)
    {
        this.toNumberFormate=toNumberFormate;
    }
    public String getName()
    {
        return name;
    }
    /*private String getLastName()
    {
        return lastName;
    }*/
    public String getPhNum()
    {
        return phNum;
    }
    public String getAddress()
    {
        return address;
    }
    public String getToNumberFormate()
    {
        return toNumberFormate;
    }


    public void display(ArrayList<ContactDetails> contactList) {
        for(ContactDetails cd: contactList)
        {
            System.out.println(cd.getName()+":"+ cd.getPhNum());
        }
    }
}
