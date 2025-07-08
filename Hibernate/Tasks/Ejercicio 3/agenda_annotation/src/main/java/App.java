
import edu.unam.agenda.model.Contact;
import edu.unam.agenda.model.ContactType;
import edu.unam.agenda.model.MeansContact;
import edu.unam.agenda.model.PhoneType;
import edu.unam.agenda.service.ContactService;
import edu.unam.agenda.service.MeansContactService;
import edu.unam.agenda.service.PhoneTypeService;
import edu.unam.agenda.service.ContactTypeService;
import edu.unam.agenda.service.impl.ContactServiceImpl;
import edu.unam.agenda.service.impl.MeansContactServiceImpl;
import edu.unam.agenda.service.impl.PhoneTypeServiceImpl;
import edu.unam.agenda.service.impl.ContactTypeServiceImpl;

import java.util.List;

public class App {

    public static void main(String[] args) {

        ContactTypeService contactTypeService = ContactTypeServiceImpl.getInstance();
        PhoneTypeService phoneTypeService = PhoneTypeServiceImpl.getInstance();
        ContactService contactService = ContactServiceImpl.getInstance();
        MeansContactService meansContactService = MeansContactServiceImpl.getInstance();



        Contact contact03 = new Contact("Aaron", "Alvarez", 40, "Av 3", 1, 2);
        ContactType contactType03= new ContactType("Rose", "activo", 5);
        PhoneType phoneType03 = new PhoneType("Casa", "activo", 7);
        MeansContact meansContact03 = new MeansContact("value", 5, 65, 45);

        contactService.saveContact(contact03);
        contactTypeService.saveContactType(contactType03);
        phoneTypeService.savePhoneType(phoneType03);
        meansContactService.saveMeansContact(meansContact03);

        contactService.getContactById(2);
        contactTypeService.getContactTypeById(5);
        phoneTypeService.getPhoneTypeById(7);
        meansContactService.getMeansContactById(45);


        List<Contact> contact = contactService.getAllContacts();
        for (Contact contact01 : contact) {
            System.out.println(contact01);
        }

        List<ContactType> contactTypes = contactTypeService.getAllContactTypes();
        for (ContactType contactType : contactTypes) {
            System.out.println(contactType.getName());
        }


        List<MeansContact> meansContact = meansContactService.getAllMeansContacts();
        for (MeansContact meansContact1 : meansContact) {
            System.out.println(meansContact1);
        }

        List<PhoneType> phoneTypes = phoneTypeService.getAllPhoneTypes();
        for (PhoneType phoneType : phoneTypes) {
            System.out.println(phoneType);
        }

    }

}