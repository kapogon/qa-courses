package pl.qualitycourses.addressbook.tests;

import org.testng.annotations.Test;
import pl.qualitycourses.addressbook.model.ContactData;

public class ContactEditTests extends TestBase {

    @Test
    public void testContactUpdate() throws Exception{
        app.getNavigationHelper().goToHomePage();
        app.getContactHelper().goToEditContact();
        app.getContactHelper().fillContactForm(new ContactData("Adam", "Lewy", "London 111", "+48 123 123 123", "email@test.test"));
        app.getContactHelper().submitContactUpdate();
        app.getContactHelper().returnToHomePage();
    }
}
