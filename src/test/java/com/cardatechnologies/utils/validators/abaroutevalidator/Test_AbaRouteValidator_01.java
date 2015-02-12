/* ***************************************************************************************
 * Class: com.cardatechnologies.utils.validators.abaroutevalidator.Test_AbaRouteValidator_01.java
 * Date:  2015/02/12
 * ***************************************************************************************
 *
 * Copyright 2015 - CardaTechnologies, LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * ***************************************************************************************
 */

package com.cardatechnologies.utils.validators.abaroutevalidator;

//~--- non-JDK imports --------------------------------------------------------

import com.cardatechnologies.utils.validators.abaroutevalidator.exceptions.AbaRouteValidationException;

import junit.framework.TestCase;

//~--- classes ----------------------------------------------------------------

/**
 * Unit test for simple App.
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

    //~--- set methods --------------------------------------------------------

    /**
     * Method description
     *
     * @throws Exception
     */
    @Override
    protected void setUp()
            throws Exception {
        super.setUp();
    }

    //~--- methods ------------------------------------------------------------

    // /**
//  * @return the suite of tests being tested
//  */
//  public static Test suite()
//  {

    /**
     * Method description
     *
     * @throws Exception
     */
    @Override
    protected void tearDown()
            throws Exception {
        super.tearDown();
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {

        // Validate
        try {
            AbaRouteValidator.validate( "302075018" );
        } catch( AbaRouteValidationException e ) {
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );
        }

        // This is a good thing!
        assertTrue( true );
    }

    /**
     * Method description
     */
    public void testBlankParam() {
        String abaNumber = "";

        // Validate
        try {
            AbaRouteValidator.validate( abaNumber );
        } catch( AbaRouteValidationException e ) {
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
        } catch( AbaRouteValidationException e ) {

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
        } catch( AbaRouteValidationException e ) {
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
        } catch( AbaRouteValidationException e ) {
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
        } catch( AbaRouteValidationException e ) {
            assertTrue( true );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }
}

/* ***************************************************************************************
 * Copyright 2015 - CardaTechnologies, LLC
 *
 * Class: com.cardatechnologies.utils.validators.abaroutevalidator.Test_AbaRouteValidator_01.java  
 * Date:  2015/02/12
 *************************************************************************************** */
