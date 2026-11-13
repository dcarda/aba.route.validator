/*---------------------------------------------------------------------------------------
 * Class:  net.danielcarda.utils.validators.abaroutevalidator.Test_AbaRouteValidator_32500.java
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
public class Test_AbaRouteValidator_32500 {

    /**
     * Method: testAbaNumberCheck_32500_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32500_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27248?277" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32501_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32501_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272483316" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32502_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32502_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "272483?16" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32503_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32503_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272483332" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32504_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32504_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27248332" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32505_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32505_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272483345" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32506_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32506_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2724833L5" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32507_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32507_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272483361" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32508_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32508_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27 483361" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32509_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32509_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272483387" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32510_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32510_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27248?387" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32511_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32511_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272483426" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32512_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32512_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27248?426" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32513_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32513_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272483484" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32514_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32514_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2724 3484" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32515_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32515_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272483536" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32516_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32516_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2724?3536" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32517_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32517_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272483552" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32518_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32518_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?2483552" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32519_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32519_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272483581" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32520_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32520_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2724?3581" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32521_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32521_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272483594" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32522_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32522_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27243594" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32523_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32523_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272483633" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32524_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32524_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27248Z633" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32525_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32525_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272483675" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32526_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32526_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "272483T75" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32527_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32527_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272483743" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32528_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32528_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272488743" );
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
     * Method: testAbaNumberCheck_32529_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32529_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272483785" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32530_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32530_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27243785" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32531_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32531_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272483808" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32532_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32532_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27243808" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32533_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32533_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272483840" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32534_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32534_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27248840" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32535_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32535_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272483853" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32536_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32536_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "272483?53" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32537_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32537_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272483879" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32538_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32538_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27248]879" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32539_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32539_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272483882" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32540_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32540_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2724k3882" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32541_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32541_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272483905" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32542_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32542_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27[483905" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32543_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32543_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272483918" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32544_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32544_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2724?3918" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32545_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32545_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272483947" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32546_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32546_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "272}83947" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32547_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32547_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272483963" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32548_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32548_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2[2483963" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32549_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32549_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272484014" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32550_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32550_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "272?84014" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32551_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32551_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272484056" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32552_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32552_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2724840?6" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32553_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32553_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272484098" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32554_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32554_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27248498" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32555_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32555_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272484108" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32556_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32556_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "272?84108" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32557_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32557_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272484137" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32558_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32558_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "272484s37" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32559_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32559_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272484166" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32560_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32560_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27248'166" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32561_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32561_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272484179" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32562_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32562_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27?484179" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32563_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32563_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272484195" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32564_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32564_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2724?4195" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32565_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32565_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272484218" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32566_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32566_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27248>218" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32567_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32567_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272484247" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32568_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32568_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27248G247" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32569_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32569_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272484289" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32570_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32570_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274484289" );
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
     * Method: testAbaNumberCheck_32571_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32571_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272484292" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32572_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32572_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27248z292" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32573_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32573_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272484302" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32574_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32574_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "272484-02" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32575_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32575_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272484344" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32576_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32576_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272484354" );
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
     * Method: testAbaNumberCheck_32577_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32577_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272484357" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32578_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32578_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "272?84357" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32579_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32579_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272484373" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32580_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32580_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27248?373" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32581_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32581_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272484425" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32582_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32582_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "272U84425" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32583_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32583_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272484441" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32584_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32584_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "272484H41" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32585_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32585_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272484470" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32586_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32586_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "272f84470" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32587_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32587_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272484535" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32588_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32588_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "272484x35" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32589_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32589_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272484551" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32590_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32590_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2724845P1" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32591_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32591_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272484603" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32592_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32592_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2724846q3" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32593_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32593_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272484616" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32594_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32594_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "272484[16" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32595_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32595_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272484629" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32596_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32596_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27484629" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32597_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32597_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272484645" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32598_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32598_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27248464-" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32599_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32599_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272484658" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32600_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32600_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27248-658" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32601_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32601_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272484674" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32602_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32602_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272484374" );
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
     * Method: testAbaNumberCheck_32603_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32603_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272484700" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32604_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32604_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2724847?0" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32605_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32605_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272484713" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32606_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32606_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2y2484713" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32607_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32607_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272484797" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32608_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32608_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2724?4797" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32609_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32609_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272484807" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32610_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32610_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "272?84807" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32611_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32611_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272484823" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32612_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32612_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2724848V3" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32613_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32613_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272484836" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32614_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32614_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2724848C6" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32615_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32615_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272484852" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32616_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32616_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "272X84852" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32617_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32617_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272484894" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32618_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32618_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "272484?94" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32619_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32619_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272484917" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32620_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32620_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "272484K17" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32621_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32621_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272484988" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32622_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32622_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2724849#8" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32623_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32623_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272485039" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32624_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32624_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27248503z" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32625_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32625_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272485107" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32626_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32626_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "272?85107" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32627_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32627_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272485136" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32628_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32628_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27S485136" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32629_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32629_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272485194" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32630_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32630_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27248?194" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32631_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32631_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272485259" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32632_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32632_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2724852-9" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32633_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32633_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272485275" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32634_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32634_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27248?275" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32635_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32635_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272485291" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32636_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32636_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272485294" );
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
     * Method: testAbaNumberCheck_32637_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32637_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272485314" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32638_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32638_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "272485?14" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32639_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32639_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272485372" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32640_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32640_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "272D85372" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32641_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32641_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272485385" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32642_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32642_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27248o385" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32643_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32643_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272485408" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32644_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32644_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272485405" );
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
     * Method: testAbaNumberCheck_32645_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32645_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272485424" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32646_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32646_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27248;424" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32647_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32647_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272485482" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32648_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32648_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27C485482" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32649_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32649_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272485495" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32650_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32650_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?2485495" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32651_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32651_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272485547" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32652_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32652_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272685547" );
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
     * Method: testAbaNumberCheck_32653_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32653_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272485602" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32654_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32654_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "272485-02" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32655_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32655_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272485657" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32656_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32656_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27?485657" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32657_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32657_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272485673" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32658_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32658_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2724?5673" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32659_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32659_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272485725" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32660_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32660_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2Y2485725" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32661_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32661_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272485741" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32662_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32662_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?2485741" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32663_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32663_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272485767" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32664_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32664_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2724K5767" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32665_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32665_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272485835" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32666_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32666_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272485885" );
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
     * Method: testAbaNumberCheck_32667_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32667_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272485851" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32668_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32668_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27248585)" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32669_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32669_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272485877" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32670_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32670_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "202485877" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1005, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.invalid.federal.reserve.prefix", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32671_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32671_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272485932" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32672_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32672_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2724@5932" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32673_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32673_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272485945" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32674_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32674_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "272485<45" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32675_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32675_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272485990" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32676_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32676_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "272485a90" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32677_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32677_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272486025" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32678_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32678_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "272486,25" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32679_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32679_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272486041" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32680_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32680_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "272?86041" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32681_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32681_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272486096" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32682_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32682_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27248696" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32683_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32683_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272486164" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32684_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32684_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2724861v4" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32685_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32685_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272486177" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32686_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32686_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "272486e77" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32687_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32687_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272486193" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32688_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32688_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27286193" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32689_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32689_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272486203" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32690_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32690_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2724m6203" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32691_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32691_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272486232" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32692_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32692_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27k486232" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32693_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32693_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272486245" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32694_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32694_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27?486245" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32695_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32695_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272486258" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32696_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32696_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "272486?58" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32697_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32697_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272486407" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32698_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32698_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27248640?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32699_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32699_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272486449" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32700_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32700_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27246449" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32701_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32701_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272486452" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32702_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32702_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?2486452" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32703_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32703_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272486627" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32704_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32704_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27248?627" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32705_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32705_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272486724" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32706_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32706_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27?486724" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32707_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32707_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272486740" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32708_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32708_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27248674?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32709_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32709_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273070032" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32710_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32710_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2(3070032" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32711_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32711_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273070278" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32712_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32712_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27307027?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32713_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32713_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273073806" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32714_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32714_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27307380?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32715_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32715_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273073848" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32716_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32716_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "273073?48" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32717_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32717_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273073851" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32718_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32718_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27T073851" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32719_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32719_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273073916" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32720_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32720_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2730r3916" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32721_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32721_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273073932" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32722_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32722_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "273073?32" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32723_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32723_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273073945" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32724_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32724_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2730739?5" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32725_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32725_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273073958" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32726_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32726_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27307o958" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32727_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32727_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273073974" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32728_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32728_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2)3073974" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32729_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32729_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273074012" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32730_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32730_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "273?74012" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32731_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32731_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273074041" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32732_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32732_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2730740?1" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32733_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32733_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273074054" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32734_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32734_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "273074?54" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32735_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32735_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273074067" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32736_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32736_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27074067" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32737_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32737_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273074135" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32738_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32738_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27074135" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32739_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32739_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273074148" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32740_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32740_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2Y3074148" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32741_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32741_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273074229" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32742_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32742_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2730742$9" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32743_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32743_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273074261" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32744_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32744_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27307?261" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32745_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32745_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273074339" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32746_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32746_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2(3074339" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32747_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32747_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273074342" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32748_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32748_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27307434" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32749_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32749_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273074407" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32750_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32750_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27307?407" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32751_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32751_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273074452" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32752_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32752_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2730744?2" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32753_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32753_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273074494" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32754_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32754_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?3074494" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32755_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32755_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273074504" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32756_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32756_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27074504" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32757_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32757_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273970103" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32758_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32758_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2739_0103" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32759_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32759_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273970116" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32760_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32760_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2739701?6" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32761_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32761_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273970174" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32762_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32762_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27397017?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32763_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32763_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273970365" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32764_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32764_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "273970u65" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32765_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32765_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273970446" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32766_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32766_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273970445" );
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
     * Method: testAbaNumberCheck_32767_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32767_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273970491" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32768_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32768_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27<970491" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32769_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32769_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273970514" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32770_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32770_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?3970514" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32771_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32771_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273970585" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32772_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32772_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?3970585" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32773_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32773_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273970640" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32774_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32774_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27397H640" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32775_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32775_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273970682" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32776_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32776_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "273970?82" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32777_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32777_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273970776" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32778_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32778_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27397w776" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32779_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32779_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273970941" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32780_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32780_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27397k941" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32781_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32781_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273972541" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32782_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32782_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27397?541" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32783_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32783_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273972583" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32784_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32784_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27s972583" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32785_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32785_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273972596" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32786_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32786_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "233972596" );
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
     * Method: testAbaNumberCheck_32787_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32787_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273972619" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32788_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32788_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273972649" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // The ABA number was bad.  This should be false.
        assertFalse( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32789_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32789_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273972648" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32790_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32790_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2739?2648" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32791_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32791_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273972761" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32792_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32792_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "273972x61" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32793_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32793_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273972774" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32794_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32794_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2739727+4" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32795_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32795_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273972813" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32796_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32796_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27397281?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32797_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32797_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273972826" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32798_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32798_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "273(72826" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32799_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32799_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273972839" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32800_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32800_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2739m2839" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32801_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32801_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273972842" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32802_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32802_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "273?72842" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32803_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32803_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273972871" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32804_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32804_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27397287?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32805_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32805_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273972897" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32806_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32806_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "273972T97" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32807_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32807_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273972936" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32808_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32808_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2739729?6" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32809_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32809_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273972949" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32810_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32810_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27372949" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32811_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32811_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273973074" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32812_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32812_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27397?074" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32813_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32813_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273973100" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32814_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32814_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27397310?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32815_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32815_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273973168" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32816_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32816_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27397316;" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32817_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32817_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273973210" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32818_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32818_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27397321I" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32819_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32819_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273973252" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32820_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32820_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2739732f2" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32821_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32821_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273973265" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32822_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32822_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27f973265" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32823_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32823_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273973281" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32824_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32824_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "273973?81" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32825_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32825_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273973320" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32826_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32826_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2739733&0" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32827_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32827_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273973359" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32828_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32828_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27397335?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32829_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32829_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273973362" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32830_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32830_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "273Q73362" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32831_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32831_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273973456" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32832_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32832_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27Q973456" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32833_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32833_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273973511" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32834_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32834_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "273?73511" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32835_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32835_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273973540" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32836_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32836_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27`973540" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32837_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32837_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273973553" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32838_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32838_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "273973!53" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32839_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32839_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273973663" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32840_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32840_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "273973?63" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32841_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32841_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273973702" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32842_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32842_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2739737D2" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32843_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32843_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273973786" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32844_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32844_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "253973786" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // The ABA number was bad.  This should be false.
        assertFalse( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32845_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32845_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273974549" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32846_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32846_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273374549" );
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
     * Method: testAbaNumberCheck_32847_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32847_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273974565" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32848_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32848_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "273V74565" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32849_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32849_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273974578" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32850_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32850_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2739745#8" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32851_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32851_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273974581" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32852_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32852_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "273974-81" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32853_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32853_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273974617" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32854_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32854_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27=974617" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32855_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32855_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273974633" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32856_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32856_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27397@633" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32857_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32857_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273974701" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32858_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32858_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27374701" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32859_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32859_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273974730" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32860_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32860_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27l974730" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32861_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32861_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273974808" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32862_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32862_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "273?74808" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32863_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32863_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273974882" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32864_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32864_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273974881" );
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
     * Method: testAbaNumberCheck_32865_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32865_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273974905" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32866_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32866_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27397?905" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32867_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32867_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273974947" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32868_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32868_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27397`947" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32869_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32869_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273974963" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32870_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32870_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2 3974963" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32871_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32871_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273975069" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32872_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32872_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27397506?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32873_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32873_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273975085" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32874_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32874_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2739E5085" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32875_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32875_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273975098" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32876_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32876_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2739?5098" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32877_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32877_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273975153" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32878_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32878_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27397153" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32879_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32879_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273975182" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32880_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32880_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2739?5182" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32881_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32881_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273975221" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32882_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32882_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2739752?1" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32883_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32883_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273975263" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32884_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32884_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2739752[3" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32885_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32885_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273975276" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32886_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32886_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27397?276" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32887_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32887_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273975292" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32888_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32888_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "273975?92" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32889_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32889_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273975331" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32890_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32890_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2739753F1" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32891_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32891_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273975357" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32892_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32892_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "273?75357" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32893_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32893_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273975399" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32894_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32894_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27375399" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32895_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32895_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273975412" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32896_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32896_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?3975412" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32897_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32897_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273975483" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32898_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32898_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "273975?83" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32899_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32899_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273975522" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32900_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32900_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27397{522" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32901_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32901_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273975548" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32902_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32902_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2739u5548" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32903_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32903_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273975564" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32904_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32904_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2739?5564" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32905_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32905_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273975593" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32906_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32906_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "273975g93" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32907_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32907_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273975629" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32908_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32908_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2-3975629" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32909_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32909_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273975674" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32910_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32910_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "273975#74" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32911_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32911_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273975726" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32912_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32912_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27?975726" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32913_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32913_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273975755" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32914_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32914_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2739757?5" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32915_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32915_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273975771" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32916_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32916_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?3975771" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32917_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32917_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273975823" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32918_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32918_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27T975823" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32919_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32919_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273975904" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32920_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32920_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27397M904" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32921_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32921_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273975917" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32922_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32922_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "273+75917" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32923_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32923_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273975946" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32924_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32924_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27397594" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32925_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32925_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273975991" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32926_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32926_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27397T991" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32927_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32927_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273976181" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32928_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32928_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27397681" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32929_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32929_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273976262" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32930_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32930_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2R3976262" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32931_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32931_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273976301" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32932_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32932_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27397301" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32933_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32933_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273976356" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32934_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32934_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27H976356" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32935_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32935_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273976369" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32936_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32936_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "23976369" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32937_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32937_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273976408" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32938_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32938_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27396408" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32939_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32939_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273976437" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32940_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32940_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2739764?7" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32941_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32941_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273976482" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32942_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32942_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2&3976482" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32943_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32943_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273976518" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32944_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32944_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27397518" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32945_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32945_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273976592" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32946_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32946_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27?976592" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32947_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32947_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273982764" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32948_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32948_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27398276" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32949_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32949_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273982816" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32950_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32950_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2739828?6" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32951_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32951_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "273982858" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32952_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32952_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?3982858" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32953_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32953_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274070439" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32954_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32954_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27407043=" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32955_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32955_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274070442" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32956_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32956_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2740E0442" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32957_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32957_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274070484" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32958_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32958_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27?070484" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32959_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32959_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274073711" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32960_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32960_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "274C73711" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32961_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32961_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274073753" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32962_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32962_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27407375" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32963_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32963_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274073766" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32964_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32964_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27403766" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32965_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32965_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274073805" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32966_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32966_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27407380" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32967_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32967_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274073818" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32968_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32968_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2740738;8" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32969_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32969_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274073834" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32970_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32970_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27/073834" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32971_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32971_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274073863" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32972_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32972_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27407]863" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32973_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32973_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274073876" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32974_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32974_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27407387?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32975_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32975_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274073928" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32976_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32976_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2740?3928" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32977_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32977_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274073957" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32978_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32978_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2740?3957" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32979_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32979_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274074037" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32980_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32980_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27074037" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32981_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32981_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274074040" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32982_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32982_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2740740_0" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32983_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32983_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274074066" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32984_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32984_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2740740$6" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32985_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32985_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274074105" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32986_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32986_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2740741?5" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32987_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32987_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274074121" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32988_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32988_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2740?4121" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32989_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32989_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274074134" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32990_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32990_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274074144" );
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
     * Method: testAbaNumberCheck_32991_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32991_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274074163" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32992_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32992_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27407413" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32993_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32993_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274074192" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32994_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32994_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274024192" );
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
     * Method: testAbaNumberCheck_32995_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32995_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274074202" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32996_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32996_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27407420`" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32997_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32997_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274074257" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_32998_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32998_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24074257" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_32999_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_32999_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274074299" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33000_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33000_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27407429X" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33001_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33001_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274074309" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33002_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33002_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "274?74309" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33003_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33003_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274074325" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33004_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33004_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "274074?25" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33005_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33005_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274074558" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33006_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33006_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2740745?8" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33007_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33007_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274074600" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33008_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33008_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2740746j0" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33009_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33009_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274086339" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33010_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33010_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "274086_39" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33011_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33011_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274086533" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33012_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33012_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27408653" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33013_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33013_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274970021" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33014_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33014_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27497002(" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33015_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33015_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274970050" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33016_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33016_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2749#0050" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33017_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33017_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274970063" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33018_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33018_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2749(0063" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33019_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33019_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274970076" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33020_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33020_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27497#076" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33021_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33021_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274970144" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33022_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33022_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2749C0144" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33023_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33023_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274970173" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33024_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33024_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "274?70173" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33025_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33025_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274970186" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33026_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33026_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27497016" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33027_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33027_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274970199" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33028_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33028_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2749701?9" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33029_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33029_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274970267" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33030_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33030_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27?970267" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33031_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33031_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274970351" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33032_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33032_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27497035" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33033_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33033_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274970380" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33034_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33034_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27497B380" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33035_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33035_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274970568" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33036_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33036_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27470568" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33037_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33037_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274970584" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33038_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33038_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27497?584" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33039_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33039_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274970607" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33040_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33040_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27497060?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33041_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33041_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274970610" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33042_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33042_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27970610" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33043_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33043_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274970623" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33044_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33044_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?4970623" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33045_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33045_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274970636" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33046_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33046_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2749?0636" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33047_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33047_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274970649" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33048_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33048_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27]970649" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33049_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33049_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274970652" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33050_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33050_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27497065?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33051_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33051_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274970665" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33052_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33052_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27497066w" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33053_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33053_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274970681" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33054_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33054_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27497G681" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33055_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33055_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274970717" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33056_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33056_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27~970717" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33057_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33057_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274970775" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33058_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33058_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "274970D75" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33059_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33059_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274970791" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33060_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33060_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274990791" );
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
     * Method: testAbaNumberCheck_33061_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33061_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274970801" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33062_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33062_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27497.801" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33063_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33063_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274970814" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33064_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33064_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27497F814" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33065_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33065_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274970827" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33066_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33066_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "274970?27" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33067_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33067_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274970830" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33068_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33068_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2749708?0" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33069_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33069_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274970843" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33070_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33070_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27?970843" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33071_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33071_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274970872" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33072_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33072_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27497087?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33073_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33073_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274970937" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33074_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33074_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "274970o37" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33075_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33075_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274970995" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33076_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33076_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27490995" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33077_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33077_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274971101" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33078_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33078_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "274?71101" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33079_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33079_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274971729" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33080_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33080_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27497172?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33081_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33081_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274971761" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33082_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33082_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27497176" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33083_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33083_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274971800" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33084_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33084_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "274?71800" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33085_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33085_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274972579" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33086_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33086_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "274c72579" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33087_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33087_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274972582" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33088_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33088_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27472582" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33089_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33089_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274972605" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33090_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33090_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27,972605" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33091_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33091_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274972689" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33092_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33092_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "274972r89" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33093_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33093_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274972744" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33094_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33094_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27492744" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33095_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33095_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274972760" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33096_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33096_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2749[2760" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33097_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33097_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274972838" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33098_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33098_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "274972F38" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33099_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33099_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274972854" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33100_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33100_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274272854" );
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
     * Method: testAbaNumberCheck_33101_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33101_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274972883" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33102_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33102_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "274S72883" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33103_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33103_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274972919" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33104_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33104_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "274-72919" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33105_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33105_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274972948" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33106_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33106_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27472948" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33107_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33107_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274972980" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33108_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33108_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27?972980" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33109_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33109_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274973057" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33110_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33110_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27497305L" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33111_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33111_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274973073" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33112_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33112_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27497073" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33113_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33113_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274973125" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33114_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33114_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27497312" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33115_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33115_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274973141" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33116_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33116_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "24973141" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33117_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33117_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274973167" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33118_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33118_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27473167" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33119_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33119_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274973183" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33120_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33120_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "274v73183" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33121_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33121_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274973196" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33122_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33122_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2749-3196" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33123_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33123_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274973206" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33124_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33124_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2749732?6" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33125_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33125_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274973219" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33126_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33126_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "274973?19" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33127_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33127_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274973222" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33128_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33128_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "274z73222" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33129_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33129_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274973251" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33130_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33130_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274973255" );
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
     * Method: testAbaNumberCheck_33131_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33131_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274973316" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33132_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33132_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27497331A" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33133_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33133_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274973358" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33134_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33134_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27?973358" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33135_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33135_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274973374" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33136_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33136_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2749?3374" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33137_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33137_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274973390" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33138_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33138_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "274973?90" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33139_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33139_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274973426" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33140_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33140_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "274V73426" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33141_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33141_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274973468" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33142_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33142_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2749734i8" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33143_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33143_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274973549" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33144_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33144_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2749735w9" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33145_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33145_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274973578" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33146_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33146_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2749735C8" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33147_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33147_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274973581" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33148_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33148_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2749735m1" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33149_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33149_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274973594" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33150_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33150_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2749!3594" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33151_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33151_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274973620" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33152_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33152_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?4973620" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33153_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33153_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274974645" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33154_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33154_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "274974?45" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33155_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33155_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274974658" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33156_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33156_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "274974?58" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33157_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33157_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274974661" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33158_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33158_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27?974661" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33159_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33159_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274974700" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33160_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33160_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2749747]0" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33161_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33161_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274974726" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33162_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33162_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27974726" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33163_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33163_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274974755" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33164_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33164_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27497755" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33165_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33165_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274974768" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33166_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33166_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2749747-8" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33167_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33167_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274974810" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33168_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33168_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2-4974810" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33169_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33169_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274974852" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33170_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33170_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2749748?2" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33171_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33171_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274974865" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33172_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33172_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?4974865" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33173_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33173_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274974878" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33174_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33174_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274973878" );
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
     * Method: testAbaNumberCheck_33175_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33175_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274974917" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33176_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33176_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "274974>17" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33177_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33177_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274974920" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33178_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33178_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2749a4920" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33179_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33179_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274974946" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33180_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33180_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27497M946" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33181_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33181_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274975042" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33182_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33182_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27497s042" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33183_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33183_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274975068" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33184_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33184_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27497s068" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33185_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33185_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274975107" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33186_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33186_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?4975107" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33187_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33187_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274975152" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33188_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33188_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27497515?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33189_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33189_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274975165" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33190_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33190_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2749?5165" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33191_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33191_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274975220" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33192_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33192_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "274975?20" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33193_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33193_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274975259" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33194_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33194_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27497?259" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33195_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33195_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274975262" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33196_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33196_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27g975262" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33197_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33197_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274975291" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33198_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33198_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "214975291" );
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
     * Method: testAbaNumberCheck_33199_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33199_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274975301" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33200_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33200_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2-4975301" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33201_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33201_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274975356" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33202_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33202_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2749[5356" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33203_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33203_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274975385" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33204_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33204_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2749,5385" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33205_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33205_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274975408" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33206_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33206_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2749?5408" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33207_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33207_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274975424" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33208_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33208_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?4975424" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33209_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33209_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274975437" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33210_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33210_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "274975?37" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33211_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33211_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274975466" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33212_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33212_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?4975466" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33213_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33213_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274975518" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33214_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33214_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "274975?18" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33215_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33215_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274975592" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33216_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33216_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27/975592" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33217_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33217_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274975602" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33218_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33218_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27475602" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33219_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33219_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274975660" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33220_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33220_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27497b660" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33221_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33221_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274975709" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33222_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33222_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2749757?9" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33223_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33223_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274975725" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33224_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33224_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?4975725" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33225_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33225_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274975754" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33226_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33226_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27497[754" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33227_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33227_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274975770" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33228_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33228_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2x4975770" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33229_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33229_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274975848" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33230_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33230_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "274975{48" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33231_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33231_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274975880" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33232_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33232_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2749758{0" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33233_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33233_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274975929" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33234_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33234_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27497a929" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33235_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33235_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274975932" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33236_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33236_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "274975?32" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33237_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33237_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274975958" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33238_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33238_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27497595?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33239_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33239_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274976009" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33240_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33240_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2749760d9" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33241_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33241_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274976025" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33242_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33242_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27497*025" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33243_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33243_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274976038" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33244_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33244_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2749760_8" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33245_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33245_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274976067" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33246_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33246_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27?976067" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33247_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33247_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274976151" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33248_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33248_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27497615b" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33249_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33249_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274976180" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33250_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33250_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "272976180" );
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
     * Method: testAbaNumberCheck_33251_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33251_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274976193" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33252_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33252_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2749761?3" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33253_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33253_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274976203" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33254_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33254_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "274976?03" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33255_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33255_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274976216" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33256_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33256_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27497?216" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33257_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33257_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274986413" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33258_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33258_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27498643" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33259_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33259_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274986594" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33260_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33260_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27498694" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33261_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33261_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "274986659" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33262_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33262_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27498665#" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33263_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33263_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275070056" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33264_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33264_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "285070056" );
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
     * Method: testAbaNumberCheck_33265_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33265_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275071194" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33266_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33266_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2w5071194" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33267_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33267_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275071246" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33268_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33268_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27507124?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33269_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33269_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275071259" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33270_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33270_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27507125?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33271_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33271_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275071288" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33272_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33272_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27571288" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33273_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33273_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275071301" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33274_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33274_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "275?71301" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33275_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33275_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275071314" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33276_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33276_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27S071314" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33277_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33277_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275071327" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33278_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33278_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2)5071327" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33279_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33279_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275071330" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33280_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33280_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2750_1330" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33281_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33281_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275071356" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33282_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33282_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27507356" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33283_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33283_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275071385" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33284_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33284_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2750713U5" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33285_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33285_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275071398" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33286_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33286_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27507398" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33287_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33287_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275071408" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33288_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33288_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "275071?08" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33289_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33289_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275071767" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33290_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33290_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27507176" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33291_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33291_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275071770" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33292_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33292_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2750717)0" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33293_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33293_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275077279" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33294_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33294_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "275077d79" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33295_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33295_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275077282" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33296_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33296_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27507728t" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33297_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33297_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275079578" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33298_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33298_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27507[578" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33299_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33299_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275079581" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33300_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33300_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "275 79581" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33301_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33301_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275079662" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33302_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33302_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275071662" );
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
     * Method: testAbaNumberCheck_33303_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33303_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275079714" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33304_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33304_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27507971" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33305_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33305_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275079879" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33306_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33306_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "275079?79" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33307_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33307_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275079882" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33308_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33308_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "295079882" );
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
     * Method: testAbaNumberCheck_33309_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33309_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275079976" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33310_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33310_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "275%79976" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33311_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33311_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275080253" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33312_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33312_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27580253" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33313_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33313_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275080282" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33314_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33314_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "275m80282" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33315_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33315_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275080334" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33316_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33316_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2750L0334" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33317_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33317_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275080525" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33318_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33318_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27508052?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33319_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33319_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275080567" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33320_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33320_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "275080?67" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33321_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33321_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275080570" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33322_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33322_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "275?80570" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33323_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33323_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275081582" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33324_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33324_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2750?1582" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33325_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33325_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275082439" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33326_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33326_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "275l82439" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33327_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33327_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275082468" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33328_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33328_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "275 82468" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33329_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33329_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275082471" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33330_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33330_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27508?471" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33331_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33331_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275082646" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33332_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33332_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?5082646" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33333_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33333_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275082866" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33334_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33334_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27582866" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33335_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33335_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275970020" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33336_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33336_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27590020" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33337_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33337_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275970130" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33338_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33338_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "275?70130" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33339_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33339_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275970813" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33340_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33340_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27597v813" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33341_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33341_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275970826" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33342_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33342_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27597026" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33343_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33343_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275970981" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33344_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33344_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27?970981" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33345_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33345_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275971003" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33346_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33346_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2759710?3" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33347_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33347_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275971029" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33348_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33348_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2759710?9" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33349_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33349_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275971087" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33350_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33350_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "275971G87" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33351_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33351_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275971113" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33352_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33352_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27597111?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33353_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33353_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275971139" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33354_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33354_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "275971?39" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33355_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33355_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275971142" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33356_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33356_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "275971?42" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33357_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33357_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275971430" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33358_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33358_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "275971?30" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33359_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33359_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275971469" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33360_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33360_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "275971>69" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33361_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33361_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275971498" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33362_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33362_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "275971m98" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33363_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33363_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275971524" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33364_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33364_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "275c71524" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33365_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33365_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275971582" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33366_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33366_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "275!71582" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33367_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33367_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275971634" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33368_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33368_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?5971634" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33369_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33369_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275971692" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33370_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33370_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2759w1692" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33371_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33371_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275971825" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33372_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33372_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27597125" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33373_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33373_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275971838" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33374_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33374_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2759s1838" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33375_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33375_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275971854" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33376_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33376_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "25971854" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33377_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33377_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275971906" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33378_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33378_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2759719?6" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33379_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33379_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275976655" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33380_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33380_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "275976#55" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33381_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33381_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275976833" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33382_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33382_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2759768'3" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33383_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33383_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275976891" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33384_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33384_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27597?891" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33385_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33385_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275976943" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33386_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33386_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27576943" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33387_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33387_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275976956" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33388_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33388_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "275976?56" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33389_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33389_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275977049" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33390_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33390_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2759770+9" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33391_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33391_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275977052" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33392_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33392_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2*5977052" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33393_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33393_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275977078" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33394_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33394_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2759#7078" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33395_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33395_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275977094" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33396_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33396_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27597094" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33397_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33397_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275977120" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33398_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33398_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27p977120" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33399_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33399_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275977146" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33400_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33400_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27597714?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33401_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33401_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275977159" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33402_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33402_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2759?7159" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33403_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33403_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275977256" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33404_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33404_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "275977'56" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33405_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33405_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275977450" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33406_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33406_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27597745+" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33407_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33407_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275977476" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33408_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33408_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27}977476" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33409_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33409_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275977489" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33410_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33410_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27597748?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33411_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33411_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275977515" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33412_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33412_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27?977515" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33413_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33413_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275977560" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33414_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33414_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "275977U60" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33415_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33415_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275977641" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33416_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33416_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "25977641" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33417_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33417_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275977670" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33418_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33418_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "275?77670" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33419_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33419_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275977748" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33420_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33420_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275977743" );
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
     * Method: testAbaNumberCheck_33421_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33421_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275977777" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33422_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33422_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2759777?7" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33423_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33423_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275977803" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33424_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33424_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27977803" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33425_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33425_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275977832" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33426_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33426_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2759`7832" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33427_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33427_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275977858" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33428_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33428_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27]977858" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33429_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33429_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275977890" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33430_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33430_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2759?7890" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33431_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33431_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275977900" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33432_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33432_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27597790?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33433_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33433_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275977926" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33434_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33434_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "275?77926" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33435_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33435_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275978048" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33436_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33436_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "275978?48" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33437_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33437_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275978080" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33438_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33438_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "27597808" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33439_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33439_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275978093" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_33440_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33440_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2759780#3" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_33441_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_33441_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "275978116" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }












}

/* ---------------------------------------------------------------------------------------
 * Class:  com.cardatechnologies.utils.validators.abaroutevalidator.Test_AbaRouteValidator_15.java
 * Date:   2024/02/11
 * --------------------------------------------------------------------------------------- */

