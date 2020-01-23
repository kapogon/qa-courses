package pl.qualitycourses.addressbook.tests;

import org.testng.annotations.Test;
import pl.qualitycourses.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreation() throws Exception {
        app.getNavigationHelper().goToHomePage();
        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContactForm(new ContactData("Adam", "Lewy", "London 111", "+48 123 123 123", "email@test.test", "test1"), true);
        app.getContactHelper().submitContactCreation();
        app.getContactHelper().returnToHomePage();
    }
}
