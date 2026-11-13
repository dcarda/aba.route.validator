/*---------------------------------------------------------------------------------------
 * Class:  net.danielcarda.utils.validators.abaroutevalidator.Test_AbaRouteValidator_10924.java
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
 *   2020/12/20  Daniel Carda              Updated unit tests.
 *   2020/12/22  Daniel Carda              Improved unit test results.
 *   2020/12/23  Daniel Carda              Updated module to use JUint Jupiter.
 *   2021/05/14  Daniel Carda              Added @Rule and TraceUnitExtension.
 *   2021/08/07  Daniel Carda              Improved class header JavaDoc.
 *   2024/02/11  Daniel Carda              Updated to run with JUnit 5.
 * </pre>
 * <hr>
 */
@ExtendWith({ TraceUnitExtension.class, TestWatcherExtension.class })
public class Test_AbaRouteValidator_10924 {

    /**
     * Method: testAbaNumberCheck_10924_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10924_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "073922?11" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_10925_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10925_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "073922937" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_10926_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10926_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "073922?37" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_10927_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10927_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "073922940" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_10928_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10928_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07392294v" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_10929_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10929_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "073922953" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_10930_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10930_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07392F953" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_10931_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10931_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "073922966" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_10932_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10932_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0739?2966" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_10933_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10933_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "073922979" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_10934_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10934_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "073922P79" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_10935_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10935_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "073922995" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_10936_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10936_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0739?2995" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_10937_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10937_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "073923017" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_10938_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10938_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0739230?7" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_10939_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10939_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "073923020" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_10940_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10940_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07=923020" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_10941_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10941_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "073923033" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_10942_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10942_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07?923033" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_10943_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10943_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "073972071" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_10944_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10944_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "073972?71" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_10945_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10945_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "073972084" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_10946_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10946_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07397Z084" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_10947_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10947_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "073972110" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_10948_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10948_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07397110" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_10949_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10949_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "073972165" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_10950_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10950_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0739721?5" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_10951_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10951_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "073972181" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_10952_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10952_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "073972{81" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_10953_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10953_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "073983125" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_10954_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10954_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07398315" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_10955_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10955_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "073983141" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_10956_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10956_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07398314?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_10957_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10957_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "073983170" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_10958_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10958_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07398317x" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_10959_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10959_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "073983206" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_10960_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10960_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0739832?6" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_10961_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10961_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "073983235" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_10962_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10962_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0739M3235" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_10963_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10963_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074000010" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_10964_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10964_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "074+00010" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_10965_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10965_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074000065" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_10966_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10966_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0R4000065" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_10967_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10967_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074000078" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_10968_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10968_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0740?0078" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_10969_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10969_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074000162" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_10970_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10970_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07400016=" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_10971_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10971_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074000515" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_10972_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10972_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0a4000515" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_10973_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10973_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074001019" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_10974_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10974_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0740'1019" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_10975_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10975_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074001048" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_10976_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10976_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0740010D8" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_10977_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10977_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074006674" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_10978_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10978_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07400664" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_10979_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10979_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074014035" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_10980_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10980_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "074014?35" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_10981_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10981_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074014187" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_10982_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10982_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07401418?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_10983_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10983_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074014213" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_10984_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10984_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "074014Y13" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_10985_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10985_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074014420" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_10986_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10986_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "074014}20" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_10987_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10987_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074014433" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_10988_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10988_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07401433" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_10989_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10989_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074036026" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_10990_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10990_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "074E36026" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_10991_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10991_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074036039" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_10992_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10992_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07?036039" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_10993_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10993_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074036042" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_10994_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10994_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07403604?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_10995_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10995_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074036055" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_10996_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10996_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0740360'5" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_10997_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10997_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074036068" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_10998_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10998_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07436068" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_10999_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_10999_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074036071" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11000_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11000_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07403607?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11001_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11001_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074036084" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11002_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11002_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0?4036084" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11003_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11003_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074036181" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11004_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11004_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0740361}1" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11005_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11005_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074036194" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11006_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11006_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0740361p4" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11007_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11007_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074071926" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11008_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11008_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "074071+26" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11009_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11009_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074900194" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11010_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11010_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "074900?94" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11011_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11011_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074900275" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11012_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11012_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "074?00275" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11013_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11013_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074900356" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11014_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11014_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0?4900356" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11015_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11015_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074900657" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11016_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11016_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0749006?7" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11017_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11017_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074900783" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11018_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11018_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07490078t" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11019_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11019_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074901009" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11020_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11020_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "074901h09" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11021_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11021_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074901290" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11022_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11022_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07g901290" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11023_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11023_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074901672" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11024_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11024_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0?4901672" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11025_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11025_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074902082" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11026_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11026_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "074?02082" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11027_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11027_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074902215" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11028_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11028_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07?902215" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11029_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11029_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074902228" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11030_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11030_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07402228" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11031_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11031_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074902341" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11032_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11032_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0749?2341" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11033_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11033_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074902503" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11034_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11034_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07902503" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11035_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11035_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074903308" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11036_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11036_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07;903308" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11037_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11037_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074903337" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11038_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11038_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0749033?7" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11039_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11039_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074903353" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11040_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11040_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07490y353" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11041_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11041_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074903544" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11042_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11042_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "074?03544" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11043_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11043_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074903670" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11044_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11044_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "074?03670" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11045_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11045_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074903719" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11046_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11046_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07*903719" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11047_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11047_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074903764" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11048_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11048_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07493764" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11049_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11049_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074903803" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11050_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11050_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "074<03803" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11051_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11051_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074903890" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11052_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11052_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "074903?90" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11053_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11053_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074903955" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11054_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11054_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07X903955" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11055_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11055_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074904132" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11056_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11056_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07490413&" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11057_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11057_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074904158" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11058_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11058_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07404158" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11059_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11059_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074904187" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11060_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11060_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07490417" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11061_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11061_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074904190" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11062_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11062_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0)4904190" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11063_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11063_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074904352" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11064_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11064_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0749043t2" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11065_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11065_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074904365" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11066_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11066_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "071904365" );
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
     * Method: testAbaNumberCheck_11067_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11067_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074904394" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11068_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11068_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0O4904394" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11069_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11069_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074904530" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11070_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11070_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "074?04530" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11071_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11071_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074904640" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11072_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11072_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "074904?40" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11073_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11073_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074904860" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11074_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11074_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0l4904860" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11075_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11075_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074904954" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11076_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11076_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0?4904954" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11077_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11077_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074905173" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11078_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11078_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07(905173" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11079_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11079_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074905225" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11080_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11080_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "074d05225" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11081_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11081_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074905319" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11082_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11082_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0749053W9" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11083_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11083_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074905380" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11084_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11084_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0A4905380" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11085_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11085_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074905403" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11086_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11086_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "078905403" );
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
     * Method: testAbaNumberCheck_11087_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11087_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074905461" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11088_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11088_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0749?5461" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11089_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11089_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074905474" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11090_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11090_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "074905C74" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11091_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11091_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074905539" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11092_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11092_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0#4905539" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11093_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11093_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074905872" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11094_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11094_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0749058?2" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11095_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11095_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074905953" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11096_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11096_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0749059?3" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11097_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11097_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074906059" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11098_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11098_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07490605?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11099_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11099_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074906091" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11100_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11100_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0{4906091" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11101_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11101_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074906211" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11102_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11102_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07490621r" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11103_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11103_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074906347" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11104_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11104_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "074906P47" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11105_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11105_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074906428" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11106_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11106_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07490642?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11107_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11107_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074906541" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11108_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11108_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0k4906541" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11109_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11109_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074906622" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11110_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11110_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0749066?2" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11111_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11111_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074906729" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11112_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11112_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0?4906729" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11113_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11113_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074906800" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11114_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11114_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0*4906800" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11115_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11115_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074906826" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11116_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11116_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0749068?6" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11117_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11117_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074906949" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11118_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11118_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "074906j49" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11119_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11119_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074907126" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11120_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11120_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07490?126" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11121_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11121_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074907317" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11122_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11122_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07490717" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11123_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11123_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074907414" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11124_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11124_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07i907414" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11125_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11125_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074907634" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11126_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11126_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07?907634" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11127_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11127_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074908112" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11128_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11128_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "074908:12" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11129_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11129_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074908138" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11130_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11130_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0749081?8" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11131_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11131_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074908303" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11132_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11132_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "074908?03" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11133_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11133_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074908426" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11134_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11134_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0749084\6" );
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
     * Method: testAbaNumberCheck_11135_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11135_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074908471" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11136_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11136_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0?4908471" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11137_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11137_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074908510" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11138_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11138_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0749?8510" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11139_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11139_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074908594" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11140_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11140_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "074?08594" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11141_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11141_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074908688" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11142_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11142_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07?908688" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11143_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11143_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074908921" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11144_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11144_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0749089?1" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11145_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11145_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074908934" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11146_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11146_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07490i934" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11147_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11147_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074909111" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11148_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11148_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0749091y1" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11149_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11149_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074909153" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11150_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11150_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07490915" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11151_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11151_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074909218" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11152_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11152_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07?909218" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11153_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11153_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074909357" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11154_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11154_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07?909357" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11155_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11155_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074909470" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11156_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11156_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0749094?0" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11157_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11157_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074909661" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11158_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11158_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07499661" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11159_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11159_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074909988" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11160_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11160_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07490998X" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11161_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11161_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074910087" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11162_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11162_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "074910Y87" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11163_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11163_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074910126" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11164_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11164_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07{910126" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11165_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11165_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074910692" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11166_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11166_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "074S10692" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11167_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11167_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074910799" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11168_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11168_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07U910799" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11169_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11169_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074910854" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11170_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11170_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0749108$4" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11171_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11171_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074911138" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11172_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11172_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0749%1138" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11173_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11173_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074911219" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11174_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11174_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "074911'19" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11175_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11175_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074911578" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11176_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11176_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "074911X78" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11177_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11177_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074911581" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11178_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11178_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07491158?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11179_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11179_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074912302" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11180_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11180_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07492302" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11181_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11181_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074912344" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11182_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11182_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07?912344" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11183_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11183_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074912483" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11184_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11184_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07y912483" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11185_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11185_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074912577" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11186_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11186_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0749^2577" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11187_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11187_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074912603" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11188_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11188_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0k4912603" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11189_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11189_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074912645" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11190_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11190_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07491N645" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11191_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11191_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074912674" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11192_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11192_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07412674" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11193_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11193_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074912690" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11194_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11194_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "074?12690" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11195_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11195_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074912755" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11196_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11196_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07491275" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11197_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11197_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074912784" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11198_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11198_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "074912?84" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11199_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11199_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074912807" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11200_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11200_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0749128?7" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11201_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11201_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074912849" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11202_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11202_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "074]12849" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11203_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11203_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074912865" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11204_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11204_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0749128E5" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11205_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11205_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074912988" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11206_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11206_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07491298?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11207_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11207_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074913194" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11208_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11208_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07491S194" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11209_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11209_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074913233" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11210_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11210_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "04913233" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11211_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11211_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074913275" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11212_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11212_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0749132i5" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11213_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11213_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074913301" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11214_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11214_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07913301" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11215_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11215_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074913314" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11216_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11216_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07491331w" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11217_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11217_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074913327" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11218_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11218_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0:4913327" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11219_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11219_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074913660" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11220_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11220_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07491366}" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11221_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11221_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074913699" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11222_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11222_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07491v699" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11223_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11223_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074913712" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11224_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11224_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07491372" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11225_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11225_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074913851" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11226_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11226_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "074_13851" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11227_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11227_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074914067" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11228_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11228_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0?4914067" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11229_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11229_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074914229" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11230_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11230_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07491u229" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11231_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11231_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074914274" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11232_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11232_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "074914?74" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11233_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11233_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074914313" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11234_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11234_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "074914N13" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11235_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11235_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074914407" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11236_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11236_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0749(4407" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11237_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11237_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074914449" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11238_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11238_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07491?449" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11239_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11239_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074914452" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11240_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11240_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0749|4452" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11241_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11241_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074914481" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11242_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11242_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0?4914481" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11243_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11243_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074914517" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11244_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11244_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0749145?7" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11245_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11245_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074914533" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11246_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11246_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07`914533" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11247_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11247_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074914614" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11248_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11248_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07491P614" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11249_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11249_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074914627" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11250_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11250_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "074914I27" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11251_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11251_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074914643" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11252_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11252_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07491.643" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11253_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11253_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074914656" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11254_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11254_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0749I4656" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11255_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11255_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074971945" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11256_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11256_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "074?71945" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11257_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11257_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074986804" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11258_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11258_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "04986804" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11259_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11259_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "074986820" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11260_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11260_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "074986U20" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11261_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11261_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075000019" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11262_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11262_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0750?0019" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11263_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11263_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075000022" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11264_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11264_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07o000022" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11265_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11265_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075000051" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11266_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11266_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07500005_" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11267_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11267_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075000103" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11268_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11268_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0i5000103" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11269_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11269_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075000569" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11270_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11270_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07500056?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11271_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11271_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075000666" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11272_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11272_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07500066?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11273_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11273_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075000721" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11274_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11274_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07500072?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11275_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11275_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075000734" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11276_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11276_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0750?0734" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11277_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11277_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075000941" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11278_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11278_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075000441" );
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
     * Method: testAbaNumberCheck_11279_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11279_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075001047" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11280_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11280_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0750010?7" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11281_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11281_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075001199" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11282_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11282_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0?5001199" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11283_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11283_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075001322" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11284_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11284_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "095001322" );
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
     * Method: testAbaNumberCheck_11285_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11285_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075005496" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11286_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11286_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "035005496" );
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
     * Method: testAbaNumberCheck_11287_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11287_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075009188" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11288_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11288_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "075009?88" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11289_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11289_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075010193" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11290_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11290_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07501019f" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11291_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11291_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075011888" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11292_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11292_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "075011?88" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11293_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11293_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075011930" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11294_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11294_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07501?930" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11295_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11295_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075012531" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11296_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11296_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "075012k31" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11297_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11297_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075012683" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11298_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11298_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0750?2683" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11299_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11299_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075017853" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11300_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11300_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07017853" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11301_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11301_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075017947" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11302_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11302_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0?5017947" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11303_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11303_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075072157" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11304_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11304_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075372157" );
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
     * Method: testAbaNumberCheck_11305_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11305_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075072199" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11306_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11306_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0750#2199" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11307_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11307_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075083214" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11308_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11308_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0750832X4" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11309_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11309_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075083243" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11310_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11310_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0750832?3" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11311_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11311_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075900148" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11312_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11312_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07590b148" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11313_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11313_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075900229" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11314_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11314_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "075?00229" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11315_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11315_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075900465" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11316_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11316_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07590?465" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11317_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11317_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075900575" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11318_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11318_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0759005?5" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11319_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11319_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075900766" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11320_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11320_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07590076?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11321_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11321_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075900863" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11322_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11322_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0759Q0863" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11323_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11323_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075900902" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11324_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11324_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0=5900902" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11325_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11325_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075900973" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11326_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11326_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0?5900973" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11327_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11327_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075900986" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11328_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11328_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07590098*" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11329_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11329_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075901011" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11330_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11330_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07?901011" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11331_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11331_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075901037" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11332_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11332_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "075#01037" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11333_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11333_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075901082" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11334_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11334_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07590V082" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11335_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11335_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075901121" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11336_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11336_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0759?1121" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11337_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11337_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075901134" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11338_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11338_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07590134" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11339_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11339_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075901273" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11340_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11340_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0759012>3" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11341_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11341_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075901341" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11342_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11342_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07)901341" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11343_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11343_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075901354" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11344_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11344_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0759013{4" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11345_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11345_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075901480" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11346_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11346_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0759?1480" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11347_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11347_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075901516" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11348_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11348_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0?5901516" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11349_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11349_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075901561" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11350_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11350_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07590156g" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11351_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11351_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075901590" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11352_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11352_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075901591" );
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
     * Method: testAbaNumberCheck_11353_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11353_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075901642" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11354_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11354_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0759016?2" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11355_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11355_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075901710" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11356_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11356_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0?5901710" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11357_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11357_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075901723" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11358_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11358_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "075?01723" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11359_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11359_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075901956" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11360_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11360_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07?901956" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11361_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11361_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075901972" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11362_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11362_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07590197+" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11363_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11363_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075901998" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11364_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11364_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "075901?98" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11365_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11365_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075902007" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11366_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11366_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "075902?07" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11367_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11367_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075902049" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11368_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11368_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0759020I9" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11369_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11369_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075902052" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11370_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11370_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0?5902052" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11371_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11371_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075902065" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11372_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11372_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0759020?5" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11373_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11373_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075902104" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11374_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11374_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07?902104" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11375_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11375_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075902120" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11376_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11376_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07?902120" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11377_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11377_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075902175" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11378_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11378_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "075902B75" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11379_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11379_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075902188" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11380_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11380_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0759_2188" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11381_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11381_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075902227" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11382_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11382_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075902228" );
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
     * Method: testAbaNumberCheck_11383_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11383_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075902272" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11384_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11384_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0759022?2" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11385_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11385_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075902308" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11386_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11386_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "075?02308" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11387_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11387_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075902337" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11388_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11388_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07590?337" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11389_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11389_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075902340" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11390_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11390_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0?5902340" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11391_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11391_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075902421" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11392_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11392_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07590:421" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11393_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11393_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075902463" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11394_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11394_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0v5902463" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11395_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11395_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075902560" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11396_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11396_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07590)560" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11397_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11397_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075902573" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11398_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11398_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0759?2573" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11399_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11399_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075902609" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11400_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11400_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0?5902609" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11401_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11401_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075902625" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11402_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11402_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07?902625" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11403_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11403_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075902670" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11404_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11404_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07590670" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11405_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11405_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075902722" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11406_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11406_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07590222" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11407_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11407_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075902735" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11408_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11408_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "075902?35" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11409_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11409_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075902816" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11410_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11410_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07590281)" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11411_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11411_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075902832" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11412_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11412_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07590283" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11413_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11413_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075902968" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11414_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11414_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07590?968" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11415_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11415_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075903006" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11416_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11416_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07590300]" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11417_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11417_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075903019" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11418_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11418_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07590301" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11419_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11419_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075903116" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11420_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11420_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0759.3116" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11421_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11421_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075903158" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11422_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11422_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07590358" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11423_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11423_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075903161" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11424_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11424_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07590316?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11425_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11425_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075903174" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11426_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11426_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0759/3174" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11427_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11427_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075903200" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11428_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11428_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0_5903200" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11429_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11429_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075903226" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11430_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11430_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "075903?26" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11431_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11431_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075903242" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11432_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11432_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0759032?2" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11433_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11433_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075903394" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11434_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11434_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "075903|94" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11435_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11435_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075903446" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11436_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11436_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07`903446" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11437_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11437_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075903527" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11438_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11438_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0759035W7" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11439_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11439_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075903530" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11440_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11440_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07503530" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11441_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11441_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075903637" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11442_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11442_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07590637" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11443_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11443_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075903705" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11444_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11444_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075906705" );
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
     * Method: testAbaNumberCheck_11445_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11445_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075903750" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11446_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11446_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "05903750" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11447_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11447_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075903763" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11448_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11448_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07!903763" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11449_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11449_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075903789" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11450_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11450_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07590378?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11451_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11451_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075903792" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11452_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11452_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075903799" );
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
     * Method: testAbaNumberCheck_11453_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11453_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075903831" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11454_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11454_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07*903831" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11455_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11455_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075903912" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11456_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11456_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0759*3912" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11457_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11457_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075903983" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11458_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11458_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "075?03983" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11459_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11459_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075904092" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11460_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11460_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "075!04092" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11461_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11461_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075904115" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11462_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11462_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075934115" );
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
     * Method: testAbaNumberCheck_11463_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11463_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075904238" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11464_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11464_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07590?238" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11465_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11465_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075904254" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11466_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11466_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0759C4254" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11467_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11467_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075904377" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11468_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11468_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0759043?7" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11469_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11469_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075904380" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11470_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11470_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07590438r" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11471_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11471_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075904445" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11472_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11472_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "05904445" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11473_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11473_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075904513" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11474_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11474_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0759?4513" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11475_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11475_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075904526" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11476_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11476_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "075904*26" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11477_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11477_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075904542" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11478_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11478_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "075904?42" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11479_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11479_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075904597" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11480_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11480_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07590459" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11481_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11481_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075904762" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11482_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11482_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0759047_2" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11483_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11483_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075904775" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11484_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11484_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07590475" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11485_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11485_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075904856" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11486_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11486_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075934856" );
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
     * Method: testAbaNumberCheck_11487_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11487_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075904872" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11488_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11488_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07590487x" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11489_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11489_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075904937" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11490_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11490_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "075f04937" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11491_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11491_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075904953" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11492_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11492_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07590495?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11493_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11493_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075905004" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11494_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11494_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07590500?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11495_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11495_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075905033" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11496_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11496_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "075K05033" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11497_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11497_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075905059" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11498_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11498_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07590?059" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11499_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11499_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075905253" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11500_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11500_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "075905?53" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11501_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11501_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075905363" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11502_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11502_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "075?05363" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11503_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11503_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075905431" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11504_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11504_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "075905@31" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11505_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11505_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075905457" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11506_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11506_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07590)457" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11507_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11507_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075905486" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11508_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11508_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0759?5486" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11509_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11509_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075905554" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11510_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11510_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07?905554" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11511_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11511_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075905622" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11512_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11512_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0759?5622" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11513_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11513_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075905664" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11514_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11514_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0?5905664" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11515_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11515_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075905732" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11516_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11516_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0759?5732" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11517_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11517_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075905787" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11518_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11518_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07590578?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11519_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11519_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075905868" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11520_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11520_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07590568" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11521_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11521_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075905871" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11522_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11522_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "075/05871" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11523_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11523_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075905910" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11524_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11524_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0759v5910" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11525_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11525_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075905936" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11526_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11526_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0759?5936" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11527_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11527_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075905965" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11528_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11528_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "075905S65" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11529_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11529_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075905994" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11530_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11530_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07+905994" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11531_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11531_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075906003" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11532_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11532_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07?906003" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11533_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11533_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075906016" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11534_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11534_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075909016" );
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
     * Method: testAbaNumberCheck_11535_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11535_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075906032" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11536_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11536_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0759)6032" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11537_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11537_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075906061" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11538_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11538_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075406061" );
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
     * Method: testAbaNumberCheck_11539_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11539_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075906087" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11540_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11540_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0759.6087" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11541_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11541_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075906126" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11542_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11542_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "075?06126" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11543_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11543_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075906142" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11544_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11544_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07590612" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11545_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11545_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075906171" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11546_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11546_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07=906171" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11547_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11547_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075906197" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11548_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11548_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07590619P" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11549_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11549_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075906236" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11550_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11550_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0759?6236" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11551_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11551_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075906304" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11552_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11552_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07590?304" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11553_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11553_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075906346" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11554_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11554_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "075?06346" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11555_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11555_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075906362" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11556_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11556_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0759?6362" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11557_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11557_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075906469" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11558_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11558_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07590646D" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11559_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11559_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075906524" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11560_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11560_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "05906524" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11561_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11561_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075906595" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11562_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11562_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07[906595" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11563_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11563_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075906634" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11564_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11564_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07906634" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11565_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11565_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075906702" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11566_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11566_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0759[6702" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11567_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11567_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075906838" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11568_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11568_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07:906838" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11569_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11569_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075906854" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11570_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11570_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0759068U4" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11571_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11571_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075906896" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11572_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11572_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07590689?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11573_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11573_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075906948" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11574_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11574_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07590948" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11575_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11575_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075906951" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11576_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11576_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075906751" );
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
     * Method: testAbaNumberCheck_11577_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11577_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075906977" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11578_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11578_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "075906%77" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11579_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11579_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075907002" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11580_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11580_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0759?7002" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11581_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11581_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075907031" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11582_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11582_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07?907031" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11583_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11583_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075907073" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11584_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11584_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07590?073" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11585_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11585_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075907099" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11586_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11586_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "075907F99" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11587_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11587_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075907112" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11588_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11588_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "075907?12" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11589_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11589_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075907235" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11590_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11590_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "075?07235" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11591_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11591_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075907248" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11592_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11592_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "075907l48" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11593_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11593_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075907345" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11594_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11594_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07S907345" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11595_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11595_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075907374" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11596_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11596_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075927374" );
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
     * Method: testAbaNumberCheck_11597_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11597_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075907413" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11598_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11598_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07?907413" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11599_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11599_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075907442" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11600_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11600_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0759?7442" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11601_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11601_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075907497" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11602_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11602_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0759?7497" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11603_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11603_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075907552" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11604_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11604_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07590}552" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11605_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11605_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075907581" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11606_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11606_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07590758Z" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11607_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11607_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075907594" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11608_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11608_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07907594" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11609_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11609_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075907646" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11610_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11610_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07907646" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11611_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11611_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075907743" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11612_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11612_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07597743" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11613_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11613_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075907808" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11614_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11614_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "075I07808" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11615_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11615_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075907866" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11616_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11616_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "075907j66" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11617_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11617_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075907947" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11618_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11618_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07590794A" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11619_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11619_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075908001" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11620_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11620_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0E5908001" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11621_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11621_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075908027" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11622_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11622_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0?5908027" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11623_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11623_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075908043" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11624_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11624_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0759080?3" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11625_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11625_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075908098" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11626_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11626_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0759?8098" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11627_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11627_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075908195" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11628_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11628_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075908295" );
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
     * Method: testAbaNumberCheck_11629_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11629_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075908205" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11630_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11630_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07590820?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11631_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11631_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075908218" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11632_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11632_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07590?218" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11633_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11633_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075908276" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11634_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11634_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0?5908276" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11635_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11635_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075908616" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11636_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11636_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "075H08616" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11637_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11637_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075908658" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11638_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11638_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0759086v8" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11639_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11639_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075908687" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11640_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11640_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "075908?87" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11641_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11641_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075908920" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11642_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11642_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07?908920" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11643_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11643_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075909178" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11644_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11644_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "075^09178" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11645_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11645_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075909204" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11646_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11646_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "075?09204" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11647_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11647_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075909408" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11648_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11648_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07?909408" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11649_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11649_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075909576" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11650_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11650_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075909566" );
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
     * Method: testAbaNumberCheck_11651_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11651_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075909589" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11652_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11652_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075709589" );
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
     * Method: testAbaNumberCheck_11653_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11653_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075909660" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11654_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11654_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "075909?60" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11655_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11655_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075909903" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11656_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11656_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0?5909903" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11657_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11657_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075909945" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11658_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11658_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0759 9945" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11659_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11659_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075910206" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11660_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11660_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "075_10206" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11661_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11661_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075910387" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11662_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11662_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0c5910387" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11663_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11663_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075910400" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11664_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11664_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07591040?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11665_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11665_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075910484" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11666_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11666_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0759104_4" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11667_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11667_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075910523" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11668_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11668_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0759?0523" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11669_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11669_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075910659" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11670_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11670_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07510659" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11671_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11671_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075910798" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11672_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11672_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07591079?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11673_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11673_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075910882" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11674_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11674_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07591?882" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11675_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11675_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075910921" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11676_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11676_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075910922" );
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
     * Method: testAbaNumberCheck_11677_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11677_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075910992" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11678_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11678_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07910992" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11679_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11679_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075911182" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11680_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11680_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07?911182" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11681_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11681_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075911195" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11682_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11682_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "075?11195" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11683_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11683_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075911205" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11684_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11684_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07591120U" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11685_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11685_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075911357" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11686_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11686_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "075?11357" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11687_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11687_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075911360" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11688_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11688_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0759113(0" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11689_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11689_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075911373" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11690_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11690_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "075911?73" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11691_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11691_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075911603" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11692_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11692_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0759116?3" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11693_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11693_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075911616" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11694_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11694_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0759?1616" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11695_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11695_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075911713" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11696_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11696_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0759?1713" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11697_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11697_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075911742" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11698_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11698_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0759117 2" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11699_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11699_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075911768" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11700_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11700_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07591?768" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11701_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11701_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075911852" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11702_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11702_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0?5911852" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11703_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11703_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075911920" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11704_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11704_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07591190" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11705_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11705_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075911988" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11706_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11706_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0759119L8" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11707_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11707_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075912165" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11708_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11708_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "075912i65" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11709_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11709_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075912233" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11710_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11710_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07591233" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11711_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11711_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075912275" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11712_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11712_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "075912?75" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11713_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11713_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075912479" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11714_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11714_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0759?2479" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11715_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11715_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075912615" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11716_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11716_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07912615" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11717_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11717_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075912628" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11718_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11718_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07591'628" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11719_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11719_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075912644" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11720_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11720_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07591?644" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11721_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11721_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075912673" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11722_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11722_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "075U12673" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11723_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11723_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075912712" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11724_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11724_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "075912?12" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11725_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11725_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075912738" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11726_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11726_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07591?738" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11727_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11727_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075912741" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11728_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11728_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0759127?1" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11729_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11729_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075912770" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11730_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11730_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "075?12770" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11731_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11731_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075912783" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11732_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11732_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07591783" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11733_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11733_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075912806" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11734_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11734_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "075912@06" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11735_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11735_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075912819" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11736_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11736_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "075912?19" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11737_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11737_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075912822" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11738_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11738_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07591?822" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11739_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11739_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075912835" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11740_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11740_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "075912+35" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11741_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11741_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075912848" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11742_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11742_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0759128c8" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11743_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11743_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075912851" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11744_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11744_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07591@851" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11745_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11745_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075912864" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11746_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11746_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07591?864" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11747_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11747_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075912877" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11748_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11748_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0759128(7" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11749_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11749_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075917791" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11750_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11750_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "075917x91" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11751_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11751_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075917843" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11752_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11752_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07591784?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11753_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11753_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075917869" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11754_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11754_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07591769" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11755_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11755_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075917872" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11756_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11756_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07591787?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11757_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11757_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075917898" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11758_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11758_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0759?7898" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11759_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11759_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075917908" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11760_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11760_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07597908" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11761_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11761_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075917911" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11762_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11762_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07?917911" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11763_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11763_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075917924" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11764_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11764_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07591792}" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11765_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11765_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075917937" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11766_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11766_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07591:937" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11767_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11767_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075917979" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11768_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11768_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0759179o9" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11769_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11769_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075918004" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11770_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11770_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "075918?04" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11771_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11771_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075918017" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11772_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11772_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07_918017" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11773_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11773_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075918033" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11774_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11774_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "075918;33" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11775_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11775_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075918075" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11776_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11776_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "075918?75" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11777_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11777_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075918091" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11778_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11778_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "05918091" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11779_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11779_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075918101" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11780_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11780_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0759181#1" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11781_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11781_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075918130" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11782_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11782_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0?5918130" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11783_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11783_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075918185" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11784_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11784_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075918885" );
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
     * Method: testAbaNumberCheck_11785_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11785_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075918198" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11786_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11786_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07591819G" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11787_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11787_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075918237" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11788_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11788_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0759?8237" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11789_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11789_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075918282" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11790_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11790_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07591?282" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11791_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11791_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075918295" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11792_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11792_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0759]8295" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11793_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11793_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075918305" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11794_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11794_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "05918305" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11795_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11795_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075918318" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11796_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11796_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0759?8318" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11797_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11797_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075918334" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11798_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11798_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07W918334" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11799_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11799_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075918389" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11800_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11800_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07591838-" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11801_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11801_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075918402" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11802_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11802_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07918402" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11803_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11803_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075972105" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11804_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11804_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "05972105" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11805_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11805_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075972134" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11806_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11806_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "05972134" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11807_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11807_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075972147" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11808_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11808_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0759?2147" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11809_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11809_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075972176" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11810_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11810_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075572176" );
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
     * Method: testAbaNumberCheck_11811_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11811_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "075972202" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11812_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11812_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "07597?202" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11813_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11813_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "081000032" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11814_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11814_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "08100032" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11815_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11815_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "081000045" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11816_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11816_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "08100?045" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11817_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11817_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "081000058" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11818_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11818_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0U1000058" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11819_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11819_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "081000168" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11820_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11820_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "08%000168" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11821_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11821_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "081000210" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11822_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11822_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0810002$0" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11823_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11823_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "081000524" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11824_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11824_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "081000m24" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11825_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11825_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "081000553" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11826_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11826_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "081000y53" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11827_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11827_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "081000566" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11828_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11828_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0810?0566" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11829_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11829_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "081000605" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11830_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11830_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "081000I05" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11831_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11831_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "081000676" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11832_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11832_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "081?00676" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11833_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11833_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "081000702" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11834_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11834_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "08100070" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11835_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11835_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "081000728" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11836_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11836_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "08D000728" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11837_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11837_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "081000980" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11838_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11838_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "081?00980" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11839_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11839_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "081000993" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11840_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11840_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "081s00993" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11841_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11841_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "081001073" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11842_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11842_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "08A001073" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11843_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11843_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "081001387" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11844_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11844_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "0?1001387" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11845_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11845_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "081001413" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_11846_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11846_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "08100141?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_11847_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_11847_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "081001439" );
        }
        catch( AbaRouteValidationException e ) {

            // This should not have happened
            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // There's nothing left to do.  Just return
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }





}

/* ---------------------------------------------------------------------------------------
 * Class:  com.cardatechnologies.utils.validators.abaroutevalidator.Test_AbaRouteValidator_06.java
 * Date:   2024/02/11
 * --------------------------------------------------------------------------------------- */

