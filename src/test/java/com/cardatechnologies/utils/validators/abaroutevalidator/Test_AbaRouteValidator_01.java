/* ---------------------------------------------------------------------------------------
 * Class:  com.cardatechnologies.utils.validators.abaroutevalidator.Test_AbaRouteValidator_01.java
 * Date:   2015/01/15
 * ---------------------------------------------------------------------------------------
 *
 *  License: Apache 2.0
 *
 *  This software is provided "AS IS" without warranty of any kind, either expressed or implied,
 *  including, but not limited to, the implied warranties of merchantability and fitness
 *  for a particular purpose.
 */

package com.cardatechnologies.utils.validators.abaroutevalidator;

//~--- non-JDK imports --------------------------------------------------------

import com.cardatechnologies.utils.validators.abaroutevalidator.exceptions.AbaRouteValidationException;

import junit.framework.TestCase;

/**
 * Package:    com.cardatechnologies.utils.validators.abaroutevalidator
 * Class:      Test_AbaRouteValidator_01.java
 * Desc:       ...
 *
 * @author     Daniel Carda
 *
 * Maintenance History:
 * <p><pre>
 * yyyy mm dd  Who               Description
 * ----------  ----------------  ----------------------------------------------------
 * 2020/12/20  JavaDan           Initial Module Creation...
 * </pre>
 *
 * Copyright, © 2020 - Carda Technologies, LLC
 */
public class Test_AbaRouteValidator_01
        extends TestCase {

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public Test_AbaRouteValidator_01( String testName ) {
        super( testName );
    }

    /**
     * Method description
     *
     */
    @Override
    protected void tearDown()
            throws Exception {
        super.tearDown();
    }

    /**
     * Rigorous Test :-)
     */
    public void testApp() {
        boolean returnBool = false;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "302075018" );
        }
        catch( AbaRouteValidationException e ) {
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );
        }

        // Run the asserts   --------------------------------------------------
        assertTrue( returnBool );
    }

    /**
     * Method description
     */
    public void testBlankParam() {
        String abaNumber = "";

        // Validate
        try {
            AbaRouteValidator.validate( abaNumber );
        }
        catch( AbaRouteValidationException e ) {

            assertTrue( true );

            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method description
     */
    public void testNullParam() {
        String abaNumber = null;

        // Validate
        try {
            AbaRouteValidator.validate( abaNumber );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertTrue( true );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method description
     */
    public void testParamNonNumeric() {
        String abaNumber = "123456a89";

        // Validate
        try {
            AbaRouteValidator.validate( abaNumber );
        }
        catch( AbaRouteValidationException e ) {

            assertTrue( true );

            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method description
     */
    public void testParamToLong() {
        String abaNumber = "123451234512";

        // Validate
        try {
            AbaRouteValidator.validate( abaNumber );
        }
        catch( AbaRouteValidationException e ) {

            assertTrue( true );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method description
     */
    public void testParamToShort() {
        String abaNumber = "123412";

        // Validate
        try {
            AbaRouteValidator.validate( abaNumber );
        }
        catch( AbaRouteValidationException e ) {

            assertTrue( true );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    @Override
    protected void setUp()
            throws Exception {
        super.setUp();
    }
}

/* ***************************************************************************************
 * Copyright 2015 - CardaTechnologies, LLC
 *
 * Class: com.cardatechnologies.utils.validators.abaroutevalidator.Test_AbaRouteValidator_01.java
 * Date:  2015/01/15
 *************************************************************************************** */
