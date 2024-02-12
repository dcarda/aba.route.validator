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

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.AfterAllCallback;
import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

import com.cardatechnologies.utils.validators.abaroutevalidator.Test_AbaRouteValidator_01;

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
 <p><pre>
    yyyy mm dd  Who                       Description
    ----------  ------------------------  ----------------------------------------------------
    2021/05/14  JavaDan                   Initial Module Creation...
    2024/02/11  Daniel Carda              Updated to run with JUnit 5.
 </pre>
 *
 * Copyright, © 2020 - Carda Technologies, LLC
 */
public class TraceUnitExtension
        implements BeforeEachCallback,
                   AfterEachCallback,
                   BeforeAllCallback,
                   AfterAllCallback {

    @Override
    public void afterAll( ExtensionContext extensionContext )
            throws Exception {
        String className = Test_AbaRouteValidator_01.class.getName();

        System.out.println( "\nFinished Test Class: " + className );
        System.out.println( "------------------------------------------------------------" );
    }

    /**
     * Method: afterClass
     */
    @AfterAll
    public static void afterClass() {
        String className = Test_AbaRouteValidator_01.class.getName();

        System.out.println( "\nFinished: " + className );
        System.out.println( "x-----------------------------------------------------------" );
    }

    @Override
    public void afterEach( ExtensionContext extensionContext )
            throws Exception {}

    @Override
    public void beforeAll( ExtensionContext extensionContext )
            throws Exception {
        String className = Test_AbaRouteValidator_01.class.getName();

        System.out.println( "------------------------------------------------------------" );
        System.out.println( "Running Test Class: " + className + "\n" );
    }

    /**
     * Method: beforeClass
     */
    @BeforeAll
    public static void beforeClass() {
        String className = Test_AbaRouteValidator_01.class.getName();

        System.out.println( "y-----------------------------------------------------------" );
        System.out.println( "Running Test Class: " + className + "\n" );
    }

    @Override
    public void beforeEach( ExtensionContext extensionContext )
            throws Exception {}
}

/* ---------------------------------------------------------------------------------------
 * Copyright, (c) 2009 - Carda Technologies, LLC
 *
 * ---------------------------------------------------------------------------------------
 * Class:  com.cardatechnologies.utils.TraceUnitExtension.java
 * Date:   2021/05/14
 * --------------------------------------------------------------------------------------- */
