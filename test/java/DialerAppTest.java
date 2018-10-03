import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DialerAppTest {
    @Test
    public void addContact()
    {
        ArrayList<ContactDetails> checkList=new ArrayList<ContactDetails>();
        ContactDetails cd=new ContactDetails();
        cd.setName("Hema");
        cd.setPhNum("123");
        cd.setAddress("abc");
        cd.setToNumberFormate("4362");
        checkList.add(cd);
        PhoneBook pb=new PhoneBook();
        pb.createContact("Ashu","123456","nellore",checkList);
        ContactDetails obj=checkList.get(1);
        assertEquals("Ashu",obj.getName());
    }

    @Test
    public void searchContact()
    {
        ArrayList<ContactDetails> checkList=new ArrayList<ContactDetails>();
        ArrayList<ContactDetails> grepList= new ArrayList<ContactDetails>();
        ContactDetails cd=new ContactDetails();
        cd.setName("Hema");
        cd.setPhNum("123");
        cd.setAddress("abc");
        cd.setToNumberFormate("4362123111");
        checkList.add(cd);
        PhoneBook pb=new PhoneBook();
        grepList=pb.grepInPhoneBook("4362",checkList);
        ContactDetails obj=grepList.get(0);
        assertEquals("Hema",obj.getName());


    }
}
