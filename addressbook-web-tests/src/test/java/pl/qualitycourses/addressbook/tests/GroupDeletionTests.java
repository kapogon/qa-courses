package pl.qualitycourses.addressbook.tests;

import org.testng.annotations.Test;
import pl.qualitycourses.addressbook.model.GroupData;

public class GroupDeletionTests extends TestBase {

    @Test
    public void testGroupDeletion() throws Exception {
        app.getNavigationHelper().goToGroupPage();
        if(! app.getGroupHelper().isThereGroup()){
            app.getGroupHelper().createGroup(new GroupData("test1", null, null));
        }
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteSelectedGroups();
        app.getGroupHelper().returnToGroupPage();
    }

}
