/*---------------------------------------------------------------------------------------
 * Class:  com.cardatechnologies.utils.validators.abaroutevalidator.Test_AbaRouteValidator_01.java
 * Date:   2024/02/11
 * ---------------------------------------------------------------------------------------
 *
 *  License: Apache 2.0
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 *   this file except in compliance with the License.
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

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.TestWatcher;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import com.cardatechnologies.utils.TraceUnitExtension;
import com.cardatechnologies.utils.validators.abaroutevalidator.exceptions.AbaRouteValidationException;

/**
 * <b>Description:</b><br>
 *     This class is used throwing error messages relating to the ABA Routing code.
 *
 * @author     Daniel Carda
 * <br>
 * <br><b>Maintenance History:</b>
 * <br>
<pre>
    yyyy mm dd  Who                       Description
    ----------  ------------------------  ----------------------------------------------------
    2015/01/15  Daniel Carda              Initial Module Creation...
    2020/12/22  Daniel Carda              Improved unit test results.
    2020/12/23  Daniel Carda              Updated module to use JUint Jupiter.
    2021/05/14  Daniel Carda              Added @Rule and TraceUnitExtension.
    2021/08/07  Daniel Carda              Improved class header JavaDoc.
    2024/02/11  Daniel Carda              Updated to run with JUnit 5.
</pre>
 * <hr>
 */
@ExtendWith({ TraceUnitExtension.class })
public class Test_AbaRouteValidator_01
        implements TestWatcher {
    /**
     * Rigorous Test :-)
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testApp( TestInfo testInfo ) {
        System.out.println( "    Test: " + testInfo.getDisplayName() );

        // --------------------------------------------------------------------

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
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testBlankParam( TestInfo testInfo ) {
        System.out.println( "    Test: " + testInfo.getDisplayName() );

        // --------------------------------------------------------------------

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
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testNullParam( TestInfo testInfo ) {
        System.out.println( "    Test: " + testInfo.getDisplayName() );

        // --------------------------------------------------------------------

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
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testParamNonNumeric( TestInfo testInfo ) {
        System.out.println( "    Test: " + testInfo.getDisplayName() );

        // --------------------------------------------------------------------

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
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testParamToLong( TestInfo testInfo ) {
        System.out.println( "    Test: " + testInfo.getDisplayName() );

        // --------------------------------------------------------------------

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
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testParamToShort( TestInfo testInfo ) {
        System.out.println( "    Test: " + testInfo.getDisplayName() );

        // --------------------------------------------------------------------

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
 * Date:   2024/02/11
 *************************************************************************************** */
