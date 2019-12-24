package pl.qualitycourses.addressbook.tests;

import org.testng.annotations.Test;
import pl.qualitycourses.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() throws Exception {
        app.goToGroupPage();
        app.initGroupCreation();
        app.fillGroupForm(new GroupData("test1", "test2", "test3"));
        app.createGroupCreation();
        app.returnToGroupPage();
    }

}
