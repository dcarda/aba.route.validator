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

import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

/**
 * Package:    com.cardatechnologies.utils.validators.abaroutevalidator
 * Class:      TraceUnitExtension.java
 * Desc:       Used to format the output.
 *             You can find details for tis at:
 *                 https://www.baeldung.com/junit-5-migration
 *
 * @author     Daniel Carda
 *
 * Maintenance History:
 * <p><pre>
 * yyyy mm dd  Who               Description
 * ----------  ----------------  ----------------------------------------------------
 * 2021/05/14  JavaDan           Initial Module Creation...
 * </pre>
 *
 * Copyright, © 2020 - Carda Technologies, LLC
 */
public class TraceUnitExtension
        implements BeforeEachCallback,
                   AfterEachCallback {

    @Override
    public void afterEach( ExtensionContext extensionContext )
            throws Exception {
        System.out.println( "\n   Exiting Method: " + extensionContext.getDisplayName() );
//        System.out.println( "----------------------------------------------------------------------\n" );
    }

    @Override
    public void beforeEach( ExtensionContext extensionContext )
            throws Exception {
        System.out.println( "----------------------------------------------------------------------" );
        System.out.println( "  Entering Method: " + extensionContext.getDisplayName() );
    }
}

/* ---------------------------------------------------------------------------------------
 * Copyright, (c) 2009 - Carda Technologies, LLC
 *
 * ---------------------------------------------------------------------------------------
 * Class:  com.cardatechnologies.utils.TraceUnitExtension.java
 * Date:   2021/05/14
 * --------------------------------------------------------------------------------------- */
