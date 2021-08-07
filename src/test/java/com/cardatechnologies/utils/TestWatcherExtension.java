/* ---------------------------------------------------------------------------------------
 * Class:  com.cardatechnologies.utils.TraceUnitExtension.java
 * Date:   2021/05/14
 * ---------------------------------------------------------------------------------------
 *
 * Copyright, (c) 2020 - Carda Technologies, LLC
 * All rights reserved.
 */

package com.cardatechnologies.utils;

//~--- non-JDK imports --------------------------------------------------------

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;

import java.util.Optional;

/**
 * <b>Description:</b><br>
 *     Used to format the output.
 *     You can find details for tis at:
 *         https://www.baeldung.com/junit-5-migration
 *
 * @author     Daniel Carda
 * <br>
 * <br><b>Maintenance History:</b>
 * <br>
<pre>
    yyyy mm dd  Who                       Description
    ----------  ------------------------  ----------------------------------------------------
    2021/05/14  Daniel Carda              Initial Module Creation...
    2020/12/20  JavaDan                   Updated TestWatcher code.
</pre>
 * <hr>
 */
public class TestWatcherExtension implements TestWatcher{

    public static String testStatus;
    public static String testCaseName;

    @Override
    public void testAborted(ExtensionContext Context, Throwable throwable) {
        testStatus = "Aborted";
        testCaseName = Context.getDisplayName();
        System.out.println("     ***");
        System.out.println("     ***  Test Aborted: " + Context.getDisplayName());
        System.out.println("     ***");
        System.out.println( "----------------------------------------------------------------------\n" );
    }

    @Override
    public void testDisabled(ExtensionContext Context, Optional<String> optional) {
        testStatus = "Skipped";
        testCaseName = Context.getDisplayName();
        System.out.println("     ***");
        System.out.println("     ***  Test Skipped: " + Context.getDisplayName());
        System.out.println("     ***");
        System.out.println( "----------------------------------------------------------------------\n" );
    }

    @Override
    public void testFailed(ExtensionContext Context, Throwable throwable) {
        testStatus = "Failed";
        testCaseName = Context.getDisplayName();
        System.out.println("     ***");
        System.out.println("     ***  Test Failed: " + Context.getDisplayName());
        System.out.println("     ***");
        System.out.println( "----------------------------------------------------------------------\n" );
    }

    @Override
    public void testSuccessful(ExtensionContext Context) {
        testStatus = "Passed";
        testCaseName = Context.getDisplayName();
        //  System.out.println("          Test Failed: " + Context.getDisplayName());
        System.out.println( "----------------------------------------------------------------------\n" );
    }
}

/* ---------------------------------------------------------------------------------------
 * Copyright, (c) 2009 - Carda Technologies, LLC
 *
 * ---------------------------------------------------------------------------------------
 * Class:  com.cardatechnologies.utils.TraceUnitExtension.java
 * Date:   2021/05/14
 * --------------------------------------------------------------------------------------- */
