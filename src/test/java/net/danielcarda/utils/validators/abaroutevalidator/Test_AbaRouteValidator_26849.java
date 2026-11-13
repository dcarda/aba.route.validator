/*---------------------------------------------------------------------------------------
 * Class:  net.danielcarda.utils.validators.abaroutevalidator.Test_AbaRouteValidator_26849.java
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
 *   2020/11/15  Daniel Carda              Updated unit tests.
 *   2020/12/22  Daniel Carda              Improved unit test results.
 *   2020/12/23  Daniel Carda              Updated module to use JUint Jupiter.
 *   2021/05/14  Daniel Carda              Added @Rule and TraceUnitExtension.
 *   2021/08/07  Daniel Carda              Improved class header JavaDoc.
 *   2024/02/11  Daniel Carda              Updated to run with JUnit 5.
 * </pre>
 * <hr>
 */
@ExtendWith({ TraceUnitExtension.class, TestWatcherExtension.class })
public class Test_AbaRouteValidator_26849 {

    /**
     * Method: testAbaNumberCheck_26848_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26848_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "241I80753" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26849_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26849_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241081024" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26850_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26850_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?1081024" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26851_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26851_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241081040" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26852_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26852_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "241?81040" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26853_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26853_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241081066" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26854_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26854_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "241081t66" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26855_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26855_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241081079" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26856_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26856_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?1081079" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26857_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26857_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241081105" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26858_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26858_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2[1081105" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26859_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26859_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241081118" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26860_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26860_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24108(118" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26861_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26861_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241081121" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26862_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26862_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "241?81121" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26863_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26863_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241081493" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26864_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26864_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24101493" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26865_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26865_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241081642" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26866_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26866_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24108&642" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26867_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26867_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241270039" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26868_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26868_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "241?70039" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26869_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26869_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241270110" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26870_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26870_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24127?110" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26871_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26871_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241270149" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26872_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26872_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "241270?49" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26873_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26873_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241270181" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26874_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26874_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "21270181" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26875_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26875_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241270233" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26876_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26876_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2412702w3" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26877_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26877_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241270246" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26878_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26878_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2412C0246" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26879_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26879_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241270291" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26880_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26880_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "241?70291" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26881_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26881_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241270796" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26882_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26882_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "241270?96" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26883_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26883_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241270819" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26884_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26884_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2412Z0819" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26885_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26885_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241270822" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26886_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26886_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24127   822" );
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
     * Method: testAbaNumberCheck_26887_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26887_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241270848" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26888_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26888_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "241<70848" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26889_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26889_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241270851" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26890_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26890_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2(1270851" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26891_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26891_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241270903" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26892_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26892_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24?270903" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26893_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26893_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241270916" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26894_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26894_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24127091?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26895_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26895_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241270958" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26896_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26896_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "241270?58" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26897_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26897_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241270974" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26898_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26898_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24127?974" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26899_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26899_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241271041" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26900_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26900_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2+1271041" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26901_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26901_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241271054" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26902_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26902_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24?271054" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26903_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26903_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241271096" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26904_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26904_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2412710?6" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26905_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26905_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241271135" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26906_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26906_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?1271135" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26907_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26907_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241271180" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26908_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26908_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24127110" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26909_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26909_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241271193" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26910_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26910_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2412?1193" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26911_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26911_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241271203" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26912_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26912_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2412712?3" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26913_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26913_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241271342" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26914_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26914_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241272342" );
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
     * Method: testAbaNumberCheck_26915_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26915_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241271371" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26916_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26916_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2412713?1" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26917_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26917_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241271614" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26918_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26918_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2412?1614" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26919_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26919_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241271669" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26920_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26920_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24127?669" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26921_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26921_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241271724" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26922_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26922_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24121724" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26923_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26923_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241271795" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26924_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26924_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24Z271795" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26925_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26925_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241271928" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26926_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26926_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "241271?28" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26927_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26927_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241271931" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26928_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26928_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24127{931" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26929_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26929_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241271944" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26930_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26930_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24127194?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26931_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26931_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241271957" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26932_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26932_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "241?71957" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26933_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26933_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241272024" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26934_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26934_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2412720+4" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26935_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26935_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241272037" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26936_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26936_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24272037" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26937_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26937_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241272040" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26938_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26938_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?1272040" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26939_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26939_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241272053" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26940_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26940_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "241?72053" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26941_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26941_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241272066" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26942_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26942_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24?272066" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26943_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26943_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241272079" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26944_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26944_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "241V72079" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26945_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26945_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241272118" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26946_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26946_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2d1272118" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26947_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26947_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241272202" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26948_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26948_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?1272202" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26949_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26949_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241273078" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26950_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26950_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2E1273078" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26951_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26951_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241273081" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26952_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26952_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2412730?1" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26953_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26953_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241273094" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26954_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26954_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24127309p" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26955_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26955_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241273104" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26956_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26956_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "241?73104" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26957_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26957_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241273117" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26958_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26958_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24127317" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26959_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26959_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241273120" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26960_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26960_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24127312?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26961_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26961_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241273133" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26962_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26962_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2412731L3" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26963_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26963_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241273188" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26964_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26964_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2412731?8" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26965_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26965_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241273243" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26966_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26966_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "241,73243" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26967_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26967_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241273269" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26968_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26968_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24127326?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26969_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26969_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241273285" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26970_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26970_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "241?73285" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26971_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26971_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241273308" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26972_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26972_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24]273308" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26973_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26973_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241273366" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26974_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26974_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?1273366" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26975_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26975_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241273447" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26976_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26976_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24?273447" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26977_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26977_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241273463" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26978_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26978_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241273466" );
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
     * Method: testAbaNumberCheck_26979_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26979_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241273489" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26980_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26980_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "245273489" );
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
     * Method: testAbaNumberCheck_26981_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26981_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241273612" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26982_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26982_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "241~73612" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26983_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26983_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241273696" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26984_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26984_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24127369?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26985_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26985_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241273706" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26986_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26986_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24127]706" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26987_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26987_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241273780" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26988_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26988_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24127?780" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26989_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26989_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241273845" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26990_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26990_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2412?3845" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26991_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26991_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241273858" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26992_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26992_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2412?3858" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26993_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26993_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241273861" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26994_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26994_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24*273861" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26995_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26995_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241273887" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26996_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26996_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2412738*7" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26997_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26997_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241274077" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_26998_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26998_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2412740?7" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_26999_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_26999_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241274116" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27000_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27000_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "241274?16" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27001_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27001_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241274200" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27002_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27002_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24127420-" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27003_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27003_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241274268" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27004_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27004_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2412742?8" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27005_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27005_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241274336" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27006_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27006_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2N1274336" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27007_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27007_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241274446" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27008_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27008_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "241274H46" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27009_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27009_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241274459" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27010_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27010_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24127459" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27011_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27011_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241274462" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27012_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27012_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24?274462" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27013_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27013_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241274501" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27014_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27014_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2412b4501" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27015_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27015_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241274514" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27016_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27016_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24?274514" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27017_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27017_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241274569" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27018_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27018_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "241274Q69" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27019_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27019_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241274598" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27020_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27020_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24127598" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27021_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27021_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241274608" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27022_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27022_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "21274608" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27023_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27023_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241274624" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27024_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27024_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "241=74624" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27025_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27025_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241274653" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27026_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27026_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "241G74653" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27027_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27027_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241276910" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27028_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27028_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24127?910" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27029_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27029_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241278099" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27030_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27030_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24178099" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27031_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27031_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241278109" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27032_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27032_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2412i8109" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27033_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27033_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241278167" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27034_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27034_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24178167" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27035_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27035_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241278345" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27036_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27036_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24128345" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27037_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27037_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241278361" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27038_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27038_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "247278361" );
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
     * Method: testAbaNumberCheck_27039_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27039_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241278387" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27040_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27040_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2412783`7" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27041_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27041_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241278507" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27042_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27042_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2412x8507" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27043_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27043_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241278659" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27044_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27044_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24127865g" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27045_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27045_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241278662" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27046_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27046_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24127i662" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27047_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27047_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241278743" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27048_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27048_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2412787<3" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27049_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27049_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241278785" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27050_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27050_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2T1278785" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27051_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27051_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241278811" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27052_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27052_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24127881]" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27053_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27053_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241279014" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27054_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27054_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "241\79014" );
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
     * Method: testAbaNumberCheck_27055_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27055_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241279072" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27056_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27056_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241279032" );
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
     * Method: testAbaNumberCheck_27057_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27057_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241279111" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27058_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27058_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24?279111" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27059_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27059_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241279234" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27060_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27060_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241273234" );
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
     * Method: testAbaNumberCheck_27061_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27061_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241279292" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27062_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27062_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2412?9292" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27063_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27063_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241279522" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27064_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27064_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241279922" );
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
     * Method: testAbaNumberCheck_27065_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27065_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241279548" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27066_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27066_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "241:79548" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27067_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27067_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241279564" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27068_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27068_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24127?564" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27069_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27069_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241279603" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27070_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27070_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24?279603" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27071_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27071_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241279616" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27072_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27072_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241379616" );
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
     * Method: testAbaNumberCheck_27073_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27073_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241279687" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27074_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27074_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24127968<" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27075_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27075_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241279739" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27076_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27076_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "241?79739" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27077_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27077_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241279810" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27078_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27078_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24127+810" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27079_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27079_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241279881" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27080_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27080_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24127988?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27081_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27081_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241279920" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27082_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27082_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24127?920" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27083_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27083_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241279959" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27084_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27084_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24127?959" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27085_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27085_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241280058" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27086_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27086_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "241280)58" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27087_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27087_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241280252" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27088_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27088_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "241280E52" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27089_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27089_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241280281" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27090_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27090_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "241)80281" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27091_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27091_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241280294" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27092_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27092_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2412802?4" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27093_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27093_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241280362" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27094_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27094_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24128036?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27095_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27095_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241280430" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27096_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27096_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24280430" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27097_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27097_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241280498" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27098_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27098_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24128?498" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27099_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27099_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241280511" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27100_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27100_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "271280511" );
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
     * Method: testAbaNumberCheck_27101_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27101_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241280582" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27102_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27102_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "241b80582" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27103_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27103_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241280634" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27104_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27104_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "241280?34" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27105_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27105_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241280647" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27106_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27106_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "241?80647" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27107_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27107_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241280650" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27108_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27108_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2412806?0" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27109_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27109_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241280715" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27110_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27110_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "241280~15" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27111_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27111_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241280731" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27112_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27112_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24128073" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27113_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27113_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241280883" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27114_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27114_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24180883" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27115_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27115_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241280935" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27116_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27116_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24*280935" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27117_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27117_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241280951" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27118_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27118_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2412?0951" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27119_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27119_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241280977" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27120_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27120_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2W1280977" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27121_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27121_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241280980" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27122_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27122_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24128$980" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27123_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27123_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241281248" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27124_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27124_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2412812<8" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27125_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27125_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241281251" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27126_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27126_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24128251" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27127_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27127_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241281442" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27128_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27128_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "241281!42" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27129_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27129_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241281471" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27130_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27130_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24128M471" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27131_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27131_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241281594" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27132_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27132_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2412?1594" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27133_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27133_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241281714" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27134_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27134_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24?281714" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27135_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27135_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241281743" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27136_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27136_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "241281?43" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27137_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27137_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241281772" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27138_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27138_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2412C1772" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27139_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27139_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241281824" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27140_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27140_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24128?824" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27141_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27141_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241281853" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27142_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27142_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24128185C" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27143_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27143_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241281882" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27144_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27144_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "241281?82" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27145_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27145_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241281895" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27146_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27146_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24128?895" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27147_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27147_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241281976" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27148_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27148_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24121976" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27149_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27149_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241282072" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27150_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27150_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "241?82072" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27151_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27151_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241282124" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27152_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27152_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2412?2124" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27153_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27153_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241282137" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27154_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27154_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "242282137" );
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
     * Method: testAbaNumberCheck_27155_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27155_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241282140" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27156_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27156_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "241t82140" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27157_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27157_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241282153" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27158_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27158_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2412?2153" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27159_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27159_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241282205" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27160_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27160_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24128220" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27161_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27161_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241282276" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27162_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27162_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24122276" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27163_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27163_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241282373" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27164_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27164_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?1282373" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27165_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27165_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241282412" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27166_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27166_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "241.82412" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27167_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27167_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241282483" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27168_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27168_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2412?2483" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27169_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27169_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241282506" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27170_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27170_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "241-82506" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27171_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27171_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241282522" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27172_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27172_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24128252" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27173_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27173_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241282535" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27174_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27174_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?1282535" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27175_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27175_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241282564" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27176_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27176_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "241282?64" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27177_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27177_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241282577" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27178_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27178_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24128257" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27179_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27179_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241282593" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27180_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27180_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24128]593" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27181_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27181_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241282603" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27182_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27182_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24128?603" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27183_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27183_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241282632" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27184_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27184_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24128?632" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27185_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27185_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241282658" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27186_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27186_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24H282658" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27187_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27187_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241282674" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27188_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27188_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2412826E4" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27189_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27189_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241282713" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27190_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27190_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24128s713" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27191_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27191_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241282739" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27192_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27192_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241285739" );
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
     * Method: testAbaNumberCheck_27193_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27193_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241282755" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27194_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27194_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2412?2755" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27195_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27195_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241282823" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27196_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27196_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2412?2823" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_27197_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27197_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241282849" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_27198_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27198_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241282949" );
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
     * Method: testAbaNumberCheck_27199_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_27199_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "241282991" );
        }
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
 * Class:  com.cardatechnologies.utils.validators.abaroutevalidator.Test_AbaRouteValidator_13a.java
 * Date:   2024/02/11
 * --------------------------------------------------------------------------------------- */

