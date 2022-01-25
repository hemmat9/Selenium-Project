package com.syntax.Test;

import com.syntax.TestBase.BaseClass;
import com.syntax.Utils.CommonMethods;

public class DeletingEmployee  {
    public static void main(String[] args) {
        BaseClass.openWithUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
        CommonMethods.deletingEmployeefromHRMS("26371A");
        CommonMethods.takeScreenShot("deleted");
        CommonMethods.tearDown();
    }

}
