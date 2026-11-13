/*---------------------------------------------------------------------------------------
 * Class:  net.danielcarda.utils.validators.abaroutevalidator.Test_AbaRouteValidator_30924.java
 * Date:   2024/02/11
 * ---------------------------------------------------------------------------------------
 * Copyright (c) 2026 Daniel Carda
 *
 * SPDX-License-Identifier: Apache-2.0
 * ---------------------------------------------------------------------------------------
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ---------------------------------------------------------------------------------------
 */
package net.danielcarda.utils.validators.abaroutevalidator;

//~--- non-JDK imports --------------------------------------------------------

import net.danielcarda.utils.TestWatcherExtension;
import net.danielcarda.utils.TraceUnitExtension;
import net.danielcarda.utils.validators.abaroutevalidator.exceptions.AbaRouteValidationException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * <b>Description:</b><br>
 *     This class is used throwing error messages relating to the ABA Routing code.
 *
 * @author     Daniel Carda
 * <br>
 * <br><b>Maintenance History:</b>
 * <br>
 * <pre>
 *   yyyy mm dd  Who                       Description
 *   ----------  ------------------------  ----------------------------------------------------
 *   2015/01/15  Daniel Carda              Initial Module Creation...
 *   2020/11/17  Daniel Carda              Updated unit tests.
 *   2020/12/22  Daniel Carda              Improved unit test results.
 *   2020/12/23  Daniel Carda              Updated module to use JUint Jupiter.
 *   2021/05/14  Daniel Carda              Added @Rule and TraceUnitExtension.
 *   2021/08/07  Daniel Carda              Improved class header JavaDoc.
 *   2024/02/11  Daniel Carda              Updated to run with JUnit 5.
 * </pre>
 * <hr>
 */
@ExtendWith({ TraceUnitExtension.class, TestWatcherExtension.class })
public class Test_AbaRouteValidator_30924 {

    /**
     * Method: testAbaNumberCheck_30924_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30924_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?5377293" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_30925_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30925_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265377329" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_30926_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30926_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2653773?9" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_30927_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30927_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265377332" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_30928_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30928_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "265?77332" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_30929_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30929_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265377345" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_30930_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30930_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "265?77345" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_30931_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30931_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265377387" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_30932_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30932_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "265377?87" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_30933_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30933_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265377390" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_30934_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30934_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "265377?90" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_30935_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30935_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265377400" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_30936_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30936_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2653h7400" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_30937_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30937_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265377426" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_30938_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30938_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26537#426" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_30939_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30939_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265377484" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_30940_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30940_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26A377484" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_30941_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30941_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265377510" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_30942_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30942_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26537K510" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_30943_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30943_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265377549" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_30944_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30944_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "265K77549" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_30945_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30945_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265377565" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_30946_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30946_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "265]77565" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_30947_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30947_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265377633" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_30948_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30948_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2]5377633" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_30949_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30949_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265377675" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_30950_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30950_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2653H7675" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_30951_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30951_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265377714" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_30952_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30952_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26537771`" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_30953_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30953_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265377730" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_30954_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30954_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2Q5377730" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_30955_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30955_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265377743" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_30956_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30956_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26537774/" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_30957_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30957_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265377756" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_30958_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30958_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "265377=56" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_30959_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30959_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265377811" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_30960_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30960_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26537781" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_30961_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30961_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265377840" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_30962_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30962_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26537K840" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_30963_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30963_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265377895" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_30964_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30964_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26537895" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_30965_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30965_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265377905" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_30966_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30966_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2H5377905" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_30967_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30967_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265377921" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_30968_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30968_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26577921" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_30969_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30969_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265377950" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_30970_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30970_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2d5377950" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_30971_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30971_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265377963" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_30972_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30972_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26537796[" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_30973_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30973_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265377976" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_30974_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30974_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2653K7976" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_30975_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30975_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265378043" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_30976_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30976_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26537?043" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_30977_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30977_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265378098" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_30978_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30978_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26538098" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_30979_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30979_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265378166" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_30980_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30980_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26537E166" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_30981_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30981_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265378182" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_30982_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30982_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26537818m" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_30983_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30983_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265378247" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_30984_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30984_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26537824b" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_30985_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30985_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265381991" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_30986_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30986_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "265381?91" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_30987_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30987_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265470158" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_30988_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30988_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2654z0158" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_30989_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30989_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265470242" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_30990_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30990_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26547i242" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_30991_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30991_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265470381" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_30992_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30992_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26H470381" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_30993_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30993_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265470394" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_30994_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30994_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26547039>" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_30995_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30995_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265470792" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_30996_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30996_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26?470792" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_30997_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30997_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265472062" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_30998_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30998_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2#5472062" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_30999_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_30999_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265472208" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31000_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31000_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "265|72208" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31001_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31001_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265472415" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31002_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31002_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26547245" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31003_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31003_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265473207" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31004_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31004_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "266473207" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // The ABA number was bad.  This should be false.
        assertFalse( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31005_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31005_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265473252" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31006_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31006_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?5473252" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31007_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31007_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265473278" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31008_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31008_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26473278" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31009_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31009_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265473281" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31010_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31010_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26547328?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31011_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31011_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265473317" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31012_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31012_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2654?3317" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31013_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31013_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265473320" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31014_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31014_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "265473?20" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31015_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31015_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265473333" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31016_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31016_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?5473333" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31017_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31017_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265473346" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31018_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31018_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2!5473346" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31019_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31019_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265473375" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31020_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31020_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26K473375" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31021_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31021_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265473388" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31022_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31022_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26547338?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31023_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31023_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265473401" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31024_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31024_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26543401" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31025_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31025_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265473414" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31026_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31026_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "265473:14" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31027_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31027_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265473430" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31028_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31028_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26473430" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31029_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31029_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265473472" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31030_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31030_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26547F472" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31031_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31031_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265473485" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31032_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31032_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "265?73485" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31033_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31033_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265473498" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31034_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31034_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26-473498" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31035_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31035_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265473508" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31036_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31036_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2   5473508" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1003, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.length.too.long", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31037_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31037_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265473511" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31038_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31038_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26547351" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31039_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31039_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265473524" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31040_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31040_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "265473?24" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31041_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31041_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265473540" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31042_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31042_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26547?540" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31043_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31043_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265473582" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31044_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31044_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26547352" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31045_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31045_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265473618" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31046_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31046_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "265473?18" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31047_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31047_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265473663" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31048_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31048_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26b473663" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31049_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31049_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265473702" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31050_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31050_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26547702" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31051_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31051_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265473715" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31052_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31052_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26547371" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31053_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31053_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265473731" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31054_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31054_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26547373L" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31055_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31055_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265473760" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31056_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31056_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "25473760" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31057_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31057_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265473773" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31058_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31058_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2654737(3" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31059_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31059_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265473812" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31060_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31060_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2654?3812" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31061_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31061_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265473825" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31062_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31062_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "265?73825" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31063_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31063_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265473838" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31064_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31064_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2~5473838" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31065_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31065_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265473922" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31066_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31066_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26547n922" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31067_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31067_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265473951" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31068_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31068_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2654739:1" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31069_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31069_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265474031" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31070_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31070_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2654Z4031" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31071_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31071_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265474044" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31072_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31072_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2654740T4" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31073_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31073_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265474057" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31074_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31074_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26547 057" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31075_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31075_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265474086" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31076_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31076_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26+474086" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31077_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31077_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265474109" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31078_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31078_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2603474109" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1003, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.length.too.long", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31079_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31079_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265474125" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31080_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31080_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "265?74125" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31081_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31081_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265474154" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31082_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31082_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2654741H4" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31083_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31083_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265474196" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31084_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31084_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2654741V6" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31085_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31085_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265474222" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31086_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31086_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26D474222" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31087_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31087_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265474251" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31088_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31088_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "25474251" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31089_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31089_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265474808" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31090_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31090_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2654748?8" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31091_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31091_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265474840" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31092_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31092_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2654o4840" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31093_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31093_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265474918" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31094_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31094_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "265474?18" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31095_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31095_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265475292" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31096_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31096_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2654752?2" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31097_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31097_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265476411" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31098_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31098_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26546411" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31099_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31099_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265476440" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31100_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31100_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2654}6440" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31101_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31101_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265476453" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31102_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31102_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "265\76453" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1002, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.length.too.short", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31103_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31103_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265476482" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31104_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31104_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2654?6482" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31105_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31105_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265476534" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31106_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31106_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2^5476534" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31107_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31107_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265476547" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31108_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31108_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26547654)" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31109_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31109_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265476657" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31110_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31110_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2654766?7" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31111_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31111_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265476660" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31112_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31112_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26546660" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31113_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31113_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265481875" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31114_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31114_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26581875" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31115_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31115_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265481888" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31116_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31116_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26w481888" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31117_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31117_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265482382" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31118_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31118_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26548238$" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31119_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31119_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265482450" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31120_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31120_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26548245P" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31121_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31121_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265576696" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31122_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31122_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2655?6696" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31123_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31123_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265576706" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31124_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31124_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "265)76706" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31125_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31125_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265576719" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31126_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31126_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26557719" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31127_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31127_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265576722" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31128_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31128_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2655/6722" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31129_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31129_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265577585" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31130_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31130_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26557X585" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31131_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31131_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "266080026" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31132_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31132_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "266080?26" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31133_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31133_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "266080071" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31134_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31134_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26608T071" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31135_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31135_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "266080107" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31136_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31136_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26?080107" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31137_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31137_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "266080181" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31138_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31138_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26608018?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31139_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31139_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "266080204" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31140_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31140_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2p6080204" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31141_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31141_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "266080343" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31142_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31142_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26608034L" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31143_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31143_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "266080369" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31144_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31144_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26080369" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31145_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31145_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "266080372" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31146_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31146_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26608037f" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31147_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31147_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "266080398" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31148_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31148_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26?080398" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31149_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31149_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "266080437" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31150_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31150_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2660:0437" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31151_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31151_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "266080440" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31152_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31152_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "266.80440" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31153_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31153_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "266080686" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31154_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31154_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "266&80686" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31155_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31155_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "266086554" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31156_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31156_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26608655X" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31157_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31157_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267077601" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31158_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31158_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26707761" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31159_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31159_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267077627" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31160_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31160_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267077647" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // The ABA number was bad.  This should be false.
        assertFalse( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31161_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31161_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267077795" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31162_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31162_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2670?7795" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31163_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31163_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267077821" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31164_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31164_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267477821" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // The ABA number was bad.  This should be false.
        assertFalse( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31165_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31165_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267077847" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31166_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31166_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "265077847" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // The ABA number was bad.  This should be false.
        assertFalse( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31167_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31167_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267077850" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31168_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31168_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26707850" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31169_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31169_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267078095" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31170_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31170_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26778095" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31171_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31171_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267078150" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31172_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31172_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2670?8150" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31173_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31173_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267078286" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31174_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31174_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "267078|86" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31175_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31175_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267078299" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31176_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31176_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2670?8299" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31177_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31177_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267078325" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31178_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31178_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2670783s5" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31179_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31179_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267078341" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31180_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31180_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26707#341" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31181_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31181_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267078626" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31182_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31182_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2670Y8626" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31183_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31183_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267078707" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31184_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31184_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267178707" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // The ABA number was bad.  This should be false.
        assertFalse( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31185_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31185_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267078736" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31186_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31186_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?7078736" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31187_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31187_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267078765" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31188_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31188_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "267w78765" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31189_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31189_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267078781" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31190_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31190_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2V7078781" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31191_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31191_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267079544" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31192_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31192_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267079574" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // The ABA number was bad.  This should be false.
        assertFalse( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31193_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31193_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267079557" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31194_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31194_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "267,79557" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31195_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31195_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267079560" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31196_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31196_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2670?9560" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31197_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31197_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267079984" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31198_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31198_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2(7079984" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31199_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31199_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267080135" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31200_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31200_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2670801(5" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31201_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31201_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267080177" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31202_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31202_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "267g80177" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31203_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31203_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267080326" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31204_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31204_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26708{326" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31205_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31205_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267080355" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31206_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31206_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "267080?55" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31207_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31207_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267080520" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31208_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31208_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "267080v20" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31209_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31209_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267080614" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31210_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31210_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26`=080614" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1003, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.length.too.long", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31211_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31211_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267080821" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31212_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31212_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2670?0821" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31213_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31213_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267080834" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31214_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31214_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26708_834" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31215_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31215_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267080876" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31216_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31216_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26708087#" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31217_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31217_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267081011" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31218_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31218_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2%7081011" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31219_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31219_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267081118" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31220_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31220_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2670f1118" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31221_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31221_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267081927" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31222_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31222_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "267081?27" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31223_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31223_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267081943" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31224_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31224_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2670819H3" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31225_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31225_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267082201" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31226_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31226_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26D082201" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31227_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31227_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267083239" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31228_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31228_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26K083239" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31229_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31229_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267083242" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31230_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31230_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26708242" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31231_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31231_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267083268" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31232_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31232_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "267083?68" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31233_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31233_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267083271" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31234_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31234_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26708`271" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31235_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31235_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267083323" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31236_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31236_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26708332?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31237_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31237_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267083336" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31238_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31238_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2670u3336" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31239_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31239_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267083349" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31240_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31240_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26708[349" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31241_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31241_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267083763" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31242_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31242_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "264083763" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // The ABA number was bad.  This should be false.
        assertFalse( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31243_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31243_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267084131" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31244_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31244_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26?084131" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31245_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31245_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267084144" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31246_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31246_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "267v84144" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31247_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31247_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267084199" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31248_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31248_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2670841?9" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31249_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31249_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267085619" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31250_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31250_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26708t619" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31251_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31251_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267086058" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31252_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31252_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267086558" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // The ABA number was bad.  This should be false.
        assertFalse( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31253_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31253_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267087358" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31254_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31254_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2(7087358" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31255_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31255_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267087769" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31256_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31256_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26708.769" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31257_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31257_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267089136" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31258_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31258_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26709136" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31259_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31259_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267089712" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31260_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31260_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2(7089712" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31261_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31261_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267090060" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31262_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31262_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26709006e" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31263_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31263_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267090455" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31264_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31264_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?7090455" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31265_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31265_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267090536" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31266_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31266_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26709053}" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31267_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31267_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267090594" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31268_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31268_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26?090594" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31269_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31269_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267090617" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31270_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31270_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26709w617" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31271_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31271_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267090620" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31272_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31272_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26?090620" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31273_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31273_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267090691" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31274_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31274_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26(090691" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31275_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31275_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267090769" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31276_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31276_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2}7090769" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31277_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31277_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267090772" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31278_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31278_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?7090772" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31279_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31279_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267091027" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31280_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31280_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26709]027" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31281_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31281_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267091221" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31282_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31282_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26709d221" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31283_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31283_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267091250" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31284_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31284_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26|091250" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31285_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31285_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267091263" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31286_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31286_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "26709)263" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31287_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31287_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "267091661" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31288_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31288_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?7091661" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31289_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31289_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271070490" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31290_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31290_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2A1070490" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31291_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31291_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271070513" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31292_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31292_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2(1070513" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31293_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31293_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271070584" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31294_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31294_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27107#584" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31295_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31295_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271070607" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31296_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31296_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27107B607" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31297_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31297_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271070678" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31298_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31298_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "271*70678" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31299_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31299_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271070681" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31300_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31300_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?1070681" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31301_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31301_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271070788" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31302_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31302_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272070788" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // The ABA number was bad.  This should be false.
        assertFalse( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31303_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31303_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271070791" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31304_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31304_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2)1070791" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31305_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31305_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271070801" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31306_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31306_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2710708D1" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31307_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31307_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271070814" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31308_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31308_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2710+0814" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31309_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31309_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271070843" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31310_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31310_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2b1070843" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31311_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31311_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271070908" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31312_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31312_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "271n70908" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31313_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31313_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271070924" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31314_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31314_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2710F0924" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31315_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31315_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271070953" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31316_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31316_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27070953" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31317_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31317_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271070979" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31318_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31318_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27107979" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31319_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31319_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271071004" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31320_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31320_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2710710|4" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31321_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31321_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271071017" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31322_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31322_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27107101B" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31323_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31323_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271071033" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31324_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31324_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "271071?33" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31325_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31325_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271071062" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31326_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31326_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271371062" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertFalse( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31327_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31327_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271071101" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31328_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31328_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27107110Q" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31329_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31329_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271071114" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31330_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31330_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27X071114" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31331_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31331_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271071156" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31332_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31332_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "21071156" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31333_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31333_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271071198" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31334_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31334_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27107?198" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31335_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31335_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271071224" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31336_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31336_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27071224" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31337_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31337_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271071253" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31338_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31338_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271071251" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // The ABA number was bad.  This should be false.
        assertFalse( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31339_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31339_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271071279" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31340_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31340_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?1071279" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31341_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31341_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271071295" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31342_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31342_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2M1071295" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31343_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31343_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271071321" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31344_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31344_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27107131" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31345_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31345_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271071334" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31346_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31346_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2710Y1334" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31347_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31347_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271071350" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31348_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31348_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2 1071350" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31349_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31349_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271071402" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31350_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31350_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2710'1402" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31351_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31351_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271071415" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31352_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31352_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27107141?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31353_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31353_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271076986" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31354_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31354_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27107a986" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31355_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31355_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271077040" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31356_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31356_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "271077?40" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31357_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31357_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271077244" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31358_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31358_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27107244" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31359_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31359_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271077257" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31360_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31360_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?1077257" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31361_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31361_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271077888" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31362_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31362_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "271?77888" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31363_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31363_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271077891" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31364_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31364_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27107789?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31365_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31365_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271077985" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31366_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31366_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "271077^85" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31367_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31367_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271078094" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31368_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31368_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "271078?94" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31369_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31369_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271078146" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31370_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31370_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2}1078146" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31371_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31371_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271078162" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31372_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31372_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "271?78162" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31373_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31373_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271078175" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31374_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31374_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2710w8175" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31375_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31375_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271078395" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31376_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31376_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27108395" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31377_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31377_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271078557" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31378_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31378_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27107855y" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31379_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31379_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271078638" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31380_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31380_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27078638" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31381_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31381_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271078719" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31382_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31382_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27107719" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31383_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31383_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271078997" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31384_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31384_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27107^997" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31385_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31385_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271079103" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31386_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31386_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2710791=3" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31387_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31387_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271079271" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31388_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31388_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2710792s1" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31389_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31389_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271079352" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31390_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31390_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "271`=79352" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1003, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.length.too.long", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31391_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31391_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271079404" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31392_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31392_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27107940?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31393_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31393_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271079640" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31394_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31394_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "271079?40" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31395_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31395_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271079747" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31396_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31396_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27107974{" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31397_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31397_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271080095" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31398_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31398_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27v080095" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31399_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31399_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271080309" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31400_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31400_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "271080?09" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31401_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31401_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271080325" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31402_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31402_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27?080325" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31403_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31403_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271080354" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31404_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31404_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "271?80354" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31405_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31405_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271080545" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31406_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31406_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27|080545" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31407_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31407_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271080684" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31408_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31408_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27108084" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31409_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31409_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271080710" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31410_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31410_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27108?710" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31411_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31411_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271080817" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31412_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31412_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?1080817" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31413_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31413_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271080862" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31414_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31414_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2710?0862" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31415_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31415_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271080891" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31416_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31416_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "271w80891" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31417_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31417_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271080956" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31418_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31418_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "21080956" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31419_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31419_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271080985" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31420_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31420_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27^080985" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31421_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31421_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271081502" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31422_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31422_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "271 81502" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31423_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31423_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271081528" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31424_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31424_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271031528" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // The ABA number was bad.  This should be false.
        assertFalse( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31425_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31425_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271081560" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31426_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31426_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27108(560" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31427_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31427_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271081599" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31428_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31428_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?1081599" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31429_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31429_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271081939" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31430_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31430_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "271081'39" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31431_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31431_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271082022" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31432_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31432_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2710820?2" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31433_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31433_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271092122" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31434_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31434_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27?092122" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31435_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31435_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271092892" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31436_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31436_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2710928b2" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31437_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31437_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271170154" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31438_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31438_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2711701c4" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31439_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31439_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271170264" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31440_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31440_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27117026n" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31441_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31441_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271170390" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31442_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31442_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "271?70390" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31443_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31443_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271170413" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31444_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31444_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27117413" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31445_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31445_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271171616" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31446_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31446_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2{1171616" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31447_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31447_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271171674" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31448_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31448_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27171674" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31449_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31449_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271171988" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31450_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31450_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "271=71988" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31451_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31451_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271172262" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31452_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31452_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2k1172262" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31453_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31453_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271172275" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31454_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31454_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "271?72275" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31455_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31455_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271172521" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31456_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31456_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27172521" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31457_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31457_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271172644" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31458_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31458_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "271?72644" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31459_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31459_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271172660" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31460_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31460_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2711I2660" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31461_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31461_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271172754" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31462_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31462_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "271G72754" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31463_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31463_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271172987" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31464_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31464_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "271?72987" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31465_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31465_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271173038" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31466_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31466_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?1173038" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31467_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31467_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271173339" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31468_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31468_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27117339" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31469_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31469_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271173368" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31470_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31470_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27117336?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31471_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31471_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271173452" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31472_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31472_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2711734+2" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31473_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31473_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271173494" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31474_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31474_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27117?494" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31475_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31475_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271173627" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31476_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31476_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27?173627" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31477_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31477_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271173724" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31478_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31478_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27?173724" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31479_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31479_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271176035" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31480_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31480_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27117`035" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31481_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31481_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271176048" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31482_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31482_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27117604?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31483_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31483_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271176080" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31484_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31484_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "271!76080" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31485_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31485_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271176103" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31486_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31486_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27*176103" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31487_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31487_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271176116" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31488_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31488_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "271h76116" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31489_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31489_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271176200" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31490_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31490_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27L176200" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31491_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31491_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271176226" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31492_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31492_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "271176?26" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31493_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31493_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271176653" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31494_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31494_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?1176653" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31495_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31495_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271176679" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31496_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31496_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27117=679" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31497_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31497_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271176828" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31498_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31498_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27117682?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31499_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31499_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271176899" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31500_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31500_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27116899" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31501_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31501_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271176909" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31502_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31502_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "271176Q09" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31503_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31503_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271182430" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31504_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31504_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27182430" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31505_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31505_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271182524" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31506_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31506_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27118v524" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31507_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31507_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271182566" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31508_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31508_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?1182566" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31509_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31509_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271182579" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31510_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31510_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2711?2579" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31511_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31511_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271182618" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31512_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31512_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27?182618" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31513_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31513_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271182634" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31514_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31514_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?1182634" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31515_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31515_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271182692" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31516_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31516_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27118262" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31517_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31517_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271182702" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31518_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31518_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2711827}2" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31519_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31519_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271182715" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31520_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31520_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27118271?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31521_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31521_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271182883" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31522_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31522_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27118288$" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31523_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31523_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271182919" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31524_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31524_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27118291?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31525_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31525_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271182993" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31526_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31526_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2$1182993" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31527_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31527_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271183015" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31528_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31528_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2711I3015" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31529_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31529_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271183028" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31530_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31530_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2711P3028" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31531_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31531_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271183109" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31532_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31532_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27118T109" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31533_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31533_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271183125" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31534_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31534_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2711831'5" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31535_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31535_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271183219" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31536_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31536_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2711,3219" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31537_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31537_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271183646" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31538_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31538_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27118364?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31539_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31539_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271183662" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31540_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31540_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27-183662" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31541_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31541_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271183691" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31542_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31542_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27183691" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31543_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31543_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271183701" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31544_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31544_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "21183701" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31545_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31545_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271183727" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31546_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31546_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27118T727" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31547_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31547_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271184425" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31548_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31548_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27118442C" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31549_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31549_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271184441" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31550_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31550_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27118?441" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31551_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31551_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271184522" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31552_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31552_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27J184522" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31553_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31553_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271184564" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31554_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31554_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271184164" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // The ABA number was bad.  This should be false.
        assertFalse( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31555_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31555_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271186070" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31556_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31556_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27118H070" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31557_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31557_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271186122" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31558_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31558_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27118)122" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31559_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31559_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271186368" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31560_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31560_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "271`=86368" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1003, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.length.too.long", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31561_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31561_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271186410" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31562_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31562_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2711/6410" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31563_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31563_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271186423" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31564_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31564_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27118?423" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31565_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31565_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271186449" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31566_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31566_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27118F449" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31567_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31567_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271186517" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31568_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31568_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "271186?17" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31569_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31569_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271186575" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31570_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31570_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "271186?75" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31571_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31571_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271186753" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31572_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31572_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "271186?53" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31573_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31573_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271186766" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31574_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31574_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2711)6766" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31575_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31575_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271186931" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31576_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31576_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27118?931" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31577_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31577_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271187480" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31578_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31578_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27C187480" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31579_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31579_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271187574" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31580_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31580_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27?187574" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31581_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31581_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271187642" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31582_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31582_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27{187642" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31583_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31583_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271187749" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31584_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31584_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2(1187749" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31585_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31585_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271187765" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31586_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31586_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2711=7765" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31587_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31587_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271187833" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31588_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31588_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?1187833" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31589_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31589_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271187875" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31590_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31590_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27T187875" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31591_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31591_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271188078" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31592_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31592_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27118807R" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31593_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31593_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271188081" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31594_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31594_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2711p8081" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31595_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31595_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271188230" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31596_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31596_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2711&8230" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31597_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31597_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271188285" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31598_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31598_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "271188?85" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31599_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31599_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271188311" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31600_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31600_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2711883'1" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31601_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31601_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271188337" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31602_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31602_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2711883 7" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31603_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31603_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271188968" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31604_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31604_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27]188968" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31605_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31605_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271189310" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31606_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31606_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?1189310" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31607_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31607_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271189336" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31608_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31608_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27118933+" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31609_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31609_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271189352" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31610_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31610_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "271189s52" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31611_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31611_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271189381" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31612_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31612_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27^189381" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31613_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31613_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271189417" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31614_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31614_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27118941C" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31615_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31615_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271189433" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31616_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31616_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "271189?33" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31617_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31617_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271189446" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31618_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31618_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2=1189446" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31619_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31619_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271189488" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31620_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31620_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27118948?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31621_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31621_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271189491" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31622_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31622_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2711f9491" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31623_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31623_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271189608" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31624_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31624_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2]1189608" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31625_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31625_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271189734" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31626_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31626_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2H1189734" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31627_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31627_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271189792" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31628_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31628_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271189795" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // The ABA number was bad.  This should be false.
        assertFalse( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31629_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31629_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271189844" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31630_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31630_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2711898^4" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31631_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31631_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271189909" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31632_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31632_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27118990@" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31633_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31633_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271190150" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31634_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31634_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "277190150" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // The ABA number was bad.  This should be false.
        assertFalse( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31635_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31635_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271192310" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31636_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31636_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27119?310" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31637_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31637_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271192802" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31638_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31638_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27^192802" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31639_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31639_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271192967" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31640_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31640_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27112967" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31641_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31641_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271250647" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31642_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31642_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2712Z0647" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31643_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31643_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271274115" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31644_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31644_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?1274115" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31645_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31645_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271274128" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31646_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31646_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27$274128" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31647_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31647_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271274186" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31648_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31648_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27127418?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31649_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31649_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271274241" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31650_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31650_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271774241" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // The ABA number was bad.  This should be false.
        assertFalse( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31651_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31651_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271276537" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31652_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31652_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27127?537" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31653_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31653_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271290351" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31654_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31654_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27Z290351" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31655_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31655_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271290571" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31656_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31656_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "271?90571" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31657_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31657_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271290597" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31658_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31658_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2712905?7" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31659_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31659_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271290623" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31660_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31660_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2712906Q3" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31661_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31661_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271290636" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31662_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31662_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271290634" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // The ABA number was bad.  This should be false.
        assertFalse( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31663_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31663_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271290649" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31664_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31664_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2h1290649" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31665_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31665_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271290681" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31666_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31666_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "271290?81" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31667_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31667_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271291017" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31668_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31668_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "271?91017" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31669_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31669_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271291350" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31670_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31670_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "271291?50" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31671_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31671_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271291389" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31672_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31672_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27@291389" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31673_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31673_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271291457" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31674_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31674_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27u291457" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31675_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31675_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271291460" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31676_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31676_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271271460" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // The ABA number was bad.  This should be false.
        assertFalse( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31677_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31677_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271291486" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31678_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31678_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "271291 86" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31679_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31679_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271291525" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31680_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31680_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2(1291525" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31681_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31681_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271291596" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31682_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31682_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27121596" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31683_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31683_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271291619" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31684_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31684_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2-1291619" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31685_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31685_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271291648" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31686_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31686_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "271?91648" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31687_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31687_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271291680" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31688_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31688_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27129}680" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31689_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31689_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271291729" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31690_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31690_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2712917N9" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31691_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31691_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271291761" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31692_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31692_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27?291761" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31693_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31693_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271291774" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31694_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31694_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2712917A4" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31695_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31695_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271291790" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31696_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31696_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2712917*0" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31697_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31697_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271291813" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31698_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31698_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27129113" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31699_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31699_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271291826" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31700_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31700_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2712918?6" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31701_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31701_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271291855" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31702_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31702_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27129?855" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31703_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31703_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271291884" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31704_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31704_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "271?91884" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31705_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31705_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271292838" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31706_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31706_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2712q2838" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31707_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31707_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271970066" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31708_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31708_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "271970P66" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31709_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31709_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271970079" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31710_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31710_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27197007" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31711_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31711_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271970147" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31712_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31712_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27170147" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31713_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31713_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271970286" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31714_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31714_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27?970286" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31715_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31715_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271970299" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31716_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31716_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "271970_99" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31717_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31717_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271970312" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31718_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31718_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?1970312" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31719_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31719_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271970448" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31720_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31720_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27?970448" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31721_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31721_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271971502" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31722_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31722_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2b1971502" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31723_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31723_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271971528" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31724_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31724_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27197?528" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31725_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31725_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271971560" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31726_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31726_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2719715l0" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31727_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31727_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271971599" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31728_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31728_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27197O599" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31729_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31729_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271971735" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31730_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31730_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27197173w" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31731_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31731_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271971777" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31732_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31732_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2719717M7" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31733_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31733_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271971816" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31734_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31734_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27197181P" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31735_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31735_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271971829" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31736_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31736_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?1971829" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31737_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31737_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271971887" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31738_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31738_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27197?887" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31739_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31739_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271971890" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31740_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31740_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2719l1890" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31741_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31741_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271972064" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31742_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31742_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27197(064" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31743_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31743_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271972103" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31744_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31744_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27197i103" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31745_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31745_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271972116" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31746_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31746_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27197211j" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31747_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31747_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271972145" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31748_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31748_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27972145" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31749_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31749_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271972161" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31750_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31750_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27197216[" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31751_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31751_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271972239" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31752_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31752_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2719722?9" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31753_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31753_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271972310" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31754_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31754_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27197r310" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31755_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31755_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271972381" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31756_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31756_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "271`72381" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31757_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31757_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271972404" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31758_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31758_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "271972X04" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31759_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31759_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271972462" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31760_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31760_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27197246" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31761_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31761_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271972501" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31762_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31762_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "271972'01" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31763_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31763_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271972569" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31764_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31764_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271972589" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // The ABA number was bad.  This should be false.
        assertFalse( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31765_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31765_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271972572" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31766_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31766_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27197i572" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31767_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31767_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271972653" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31768_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31768_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27(972653" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31769_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31769_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271972679" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31770_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31770_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2719726]9" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31771_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31771_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271972718" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31772_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31772_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?1972718" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31773_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31773_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271972828" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31774_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31774_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27197~828" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31775_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31775_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271972844" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31776_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31776_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "271y72844" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31777_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31777_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271972899" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31778_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31778_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "271972p99" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31779_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31779_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271972912" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31780_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31780_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27197?912" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31781_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31781_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271972925" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31782_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31782_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27197?925" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31783_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31783_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271973128" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31784_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31784_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2<1973128" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31785_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31785_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271973487" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31786_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31786_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27197348+" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31787_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31787_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271973542" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31788_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31788_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?1973542" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31789_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31789_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271973568" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31790_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31790_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2719]3568" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31791_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31791_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271973762" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31792_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31792_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27197762" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31793_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31793_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271973775" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31794_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31794_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "271!73775" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31795_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31795_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271973788" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31796_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31796_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?1973788" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31797_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31797_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271973791" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31798_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31798_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2719737z1" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31799_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31799_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271973924" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31800_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31800_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27 973924" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31801_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31801_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271973937" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31802_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31802_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27197393?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31803_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31803_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271974004" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31804_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31804_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "271974?04" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31805_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31805_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271974017" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31806_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31806_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2719.4017" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31807_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31807_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271974033" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31808_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31808_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27197033" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31809_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31809_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271974046" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31810_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31810_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "271974o46" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31811_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31811_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271974059" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31812_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31812_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "271974?59" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31813_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31813_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271974062" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31814_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31814_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27174062" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31815_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31815_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271974224" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31816_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31816_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27197424" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31817_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31817_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271974295" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31818_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31818_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27197429?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31819_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31819_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271975388" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31820_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31820_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2719?5388" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31821_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31821_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271975391" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31822_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31822_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "271975?91" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31823_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31823_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271975401" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31824_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31824_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2+1975401" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31825_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31825_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271975443" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31826_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31826_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?1975443" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31827_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31827_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271975456" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31828_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31828_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27197545?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31829_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31829_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271975485" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31830_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31830_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?1975485" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31831_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31831_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271975498" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31832_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31832_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2719]5498" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31833_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31833_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271975508" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31834_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31834_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2<1975508" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31835_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31835_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271975566" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31836_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31836_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "271975P66" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31837_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31837_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271975715" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31838_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31838_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27197571" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31839_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31839_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271975922" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31840_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31840_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2^1975922" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31841_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31841_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271975951" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31842_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31842_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "271>75951" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31843_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31843_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271976329" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31844_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31844_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2719?6329" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31845_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31845_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271976510" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_31846_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31846_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27&976510" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_31847_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_31847_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271976523" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }










}

/* ---------------------------------------------------------------------------------------
 * Class:  com.cardatechnologies.utils.validators.abaroutevalidator.Test_AbaRouteValidator_14.java
 * Date:   2024/02/11
 * --------------------------------------------------------------------------------------- */

