/* ---------------------------------------------------------------------------------------
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

import com.cardatechnologies.utils.TraceUnitExtension;
import org.junit.Rule;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import com.cardatechnologies.utils.validators.abaroutevalidator.exceptions.AbaRouteValidationException;
import org.junit.jupiter.api.extension.ExtendWith;

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
 * 2020/12/23  JavaDan           Updated module to use JUint Jupiter.
 * 2021/05/14  JavaDan           Added @Rule and TraceUnitExtension.
 * </pre>
 */
@ExtendWith({ TraceUnitExtension.class })
public class Test_AbaRouteValidator_01 {


//    https://stackoverflow.com/questions/12965423/why-have-junit-methodrule-and-testwatchman-have-been-deprecated
    @Rule
    public org.junit.rules.MethodRule watchman = new org.junit.rules.TestWatchman() {
        public void starting(org.junit.runners.model.FrameworkMethod method) {
            System.out.println("Starting Test: " + method.getName());
        }
        @Override
        public void finished(org.junit.runners.model.FrameworkMethod method) {
            System.out.println("  Ending Test: " + method.getName());
            System.out.println("");
        }
    };

    /**
     * Rigorous Test :-)
     */
    @Test
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
    @Test
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
    @Test
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
    @Test
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
    @Test
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
    @Test
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
