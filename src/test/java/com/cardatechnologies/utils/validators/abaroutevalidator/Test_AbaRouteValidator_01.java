/*---------------------------------------------------------------------------------------
 * Class:  com.cardatechnologies.utils.validators.abaroutevalidator.Test_AbaRouteValidator_01.java
 * Date:   2015/01/15
 * ---------------------------------------------------------------------------------------
 *
 *  License: Apache 2.0
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 *  this file except in compliance with the License.
 *
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under
 *  the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS
 *  OF ANY KIND, either express or implied including the implied warranties of
 *  merchantability and fitness for a particular purpose.
 *
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.cardatechnologies.utils.validators.abaroutevalidator;

//~--- non-JDK imports --------------------------------------------------------

import com.cardatechnologies.utils.validators.abaroutevalidator.exceptions.AbaRouteValidationException;

import junit.framework.TestCase;

/**
 * Package:    com.cardatechnologies.utils.validators.abaroutevalidator
 * Class:      Test_AbaRouteValidator_01.java
 * Desc:       JUnit test file.
 *
 * @author     Daniel Carda
 *
 * Maintenance History:
 * <p><pre>
 * yyyy mm dd  Who               Description
 * ----------  ----------------  ----------------------------------------------------
 * 2015/01/15  JavaDan           Initial Module Creation...
 * 2020/12/22  JavaDan           Improved unit test results.
 * </pre>
 *
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

            // This is good.  We were expecting an exception.
            assertEquals( -1001, e.getErrorCode() );
            assertEquals( "com.cardatechnologies.aba.number.blank", e.getErrorMessage() );

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
            assertEquals( -1000, e.getErrorCode() );
            assertEquals( "com.cardatechnologies.aba.number.null", e.getErrorMessage() );

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

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "com.cardatechnologies.aba.number.not.numeric", e.getErrorMessage() );

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

            // This is good.  We were expecting an exception.
            assertEquals( -1003, e.getErrorCode() );
            assertEquals( "com.cardatechnologies.aba.number.too.long", e.getErrorMessage() );

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

            // This is good.  We were expecting an exception.
            assertEquals( -1002, e.getErrorCode() );
            assertEquals( "com.cardatechnologies.aba.number.too.short", e.getErrorMessage() );

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
 *  License: Apache 2.0
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 *  this file except in compliance with the License.
 *
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under
 *  the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS
 *  OF ANY KIND, either express or implied including the implied warranties of
 *  merchantability and fitness for a particular purpose.
 *
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 * ---------------------------------------------------------------------------------------
 * Class:  com.cardatechnologies.utils.validators.abaroutevalidator.Test_AbaRouteValidator_01.java
 * Date:   2015/01/15
 *************************************************************************************** */
