package pl.qualitycourses.addressbook;

import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {

    @Test
    public void testGroupDeletion() throws Exception {
        goToGroupPage();
        selectGroup();
        deleteSelectedGroups();
        returnToGroupPage();
    }

}
