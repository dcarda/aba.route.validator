/*---------------------------------------------------------------------------------------
 * Class:  net.danielcarda.utils.validators.abaroutevalidator.Test_AbaRouteValidator_34384.java
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
public class Test_AbaRouteValidator_34384 {

    /**
     * Method: testAbaNumberCheck_34384_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34384_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "286582?18" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34385_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34385_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "286582834" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34386_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34386_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "28682834" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34387_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34387_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "286582850" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34388_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34388_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "28658?850" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34389_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34389_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "286582876" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34390_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34390_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2865828?6" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34391_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34391_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "286586254" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34392_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34392_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?6586254" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34393_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34393_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "286586416" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34394_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34394_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "28l586416" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34395_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34395_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291070001" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34396_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34396_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291070005" );
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
     * Method: testAbaNumberCheck_34397_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34397_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291073231" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34398_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34398_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "291?73231" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34399_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34399_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291073503" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34400_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34400_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29?073503" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34401_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34401_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291073833" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34402_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34402_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "21073833" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34403_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34403_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291074065" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34404_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34404_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "291]74065" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34405_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34405_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291074308" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34406_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34406_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2y1074308" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34407_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34407_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291074418" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34408_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34408_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?1074418" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34409_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34409_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291074502" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34410_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34410_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "291074/02" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34411_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34411_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291074544" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34412_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34412_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291070544" );
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
     * Method: testAbaNumberCheck_34413_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34413_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291074612" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34414_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34414_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2910?4612" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34415_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34415_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291074638" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34416_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34416_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2~1074638" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34417_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34417_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291074654" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34418_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34418_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29107-654" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34419_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34419_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291074670" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34420_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34420_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?1074670" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34421_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34421_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291074696" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34422_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34422_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29107k696" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34423_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34423_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291074719" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34424_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34424_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?1074719" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34425_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34425_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291074722" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34426_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34426_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29107M722" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34427_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34427_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291074748" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34428_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34428_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "291?74748" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34429_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34429_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291074751" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34430_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34430_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2910747~1" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34431_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34431_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291074793" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34432_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34432_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2910&4793" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34433_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34433_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291074971" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34434_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34434_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29107497K" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34435_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34435_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291074984" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34436_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34436_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29107498" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34437_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34437_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291075022" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34438_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34438_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29107502." );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34439_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34439_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291075048" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34440_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34440_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2910750G8" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34441_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34441_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291075051" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34442_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34442_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29107551" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34443_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34443_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291075080" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34444_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34444_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "221075080" );
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
     * Method: testAbaNumberCheck_34445_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34445_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291075103" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34446_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34446_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2>1075103" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34447_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34447_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291075116" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34448_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34448_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2910?5116" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34449_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34449_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291075129" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34450_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34450_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "291075}29" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34451_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34451_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291075459" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34452_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34452_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29107o459" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34453_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34453_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291172530" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34454_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34454_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29117253B" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34455_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34455_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291172543" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34456_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34456_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2911C2543" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34457_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34457_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291172556" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34458_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34458_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2K1172556" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34459_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34459_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291172569" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34460_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34460_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "291172{69" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34461_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34461_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291172598" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34462_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34462_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291171598" );
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
     * Method: testAbaNumberCheck_34463_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34463_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291172624" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34464_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34464_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2B1172624" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34465_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34465_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291172637" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34466_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34466_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29172637" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34467_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34467_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291172640" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34468_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34468_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29117264Q" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34469_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34469_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291172682" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34470_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34470_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2911,2682" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34471_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34471_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291172721" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34472_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34472_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2911!2721" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34473_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34473_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291172747" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34474_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34474_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "291172?47" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34475_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34475_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291172763" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34476_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34476_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2911727?3" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34477_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34477_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291172776" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34478_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34478_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29Q172776" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34479_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34479_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291172789" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34480_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34480_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "291172?89" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34481_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34481_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291172792" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34482_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34482_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "291?72792" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34483_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34483_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291172844" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34484_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34484_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29117284" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34485_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34485_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291172860" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34486_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34486_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29)172860" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34487_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34487_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291172909" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34488_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34488_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29112909" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34489_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34489_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291172954" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34490_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34490_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29117295?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34491_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34491_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291172967" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34492_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34492_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2911?2967" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34493_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34493_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291172970" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34494_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34494_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29117297?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34495_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34495_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291172996" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34496_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34496_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29k172996" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34497_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34497_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291173018" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34498_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34498_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "291A73018" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34499_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34499_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291173047" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34500_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34500_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2   1173047" );
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
     * Method: testAbaNumberCheck_34501_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34501_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291173050" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34502_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34502_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "291Z73050" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34503_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34503_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291173076" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34504_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34504_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "291173J76" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34505_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34505_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291173089" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34506_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34506_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29117?089" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34507_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34507_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291173102" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34508_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34508_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29117310" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34509_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34509_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291173128" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34510_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34510_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2911r3128" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34511_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34511_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291181013" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34512_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34512_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "291c81013" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34513_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34513_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291270050" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34514_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34514_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2}1270050" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34515_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34515_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291270270" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34516_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34516_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291270210" );
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
     * Method: testAbaNumberCheck_34517_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34517_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291270416" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34518_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34518_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29?270416" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34519_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34519_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291270461" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34520_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34520_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2912704?1" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34521_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34521_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291270571" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34522_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34522_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2912g0571" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34523_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34523_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291270636" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34524_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34524_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29i270636" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34525_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34525_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291270649" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34526_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34526_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2912706?9" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34527_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34527_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291270665" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34528_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34528_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29Z270665" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34529_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34529_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291270717" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34530_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34530_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29127?717" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34531_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34531_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291271004" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34532_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34532_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "291271?04" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34533_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34533_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291271240" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34534_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34534_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29?271240" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34535_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34535_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291271305" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34536_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34536_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29127105" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34537_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34537_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291273316" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34538_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34538_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29127A316" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34539_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34539_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291273374" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34540_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34540_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?1273374" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34541_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34541_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291273442" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34542_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34542_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29127344C" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34543_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34543_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291273497" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34544_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34544_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2912x3497" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34545_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34545_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291273510" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34546_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34546_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?1273510" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34547_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34547_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291273549" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34548_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34548_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?1273549" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34549_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34549_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291273552" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34550_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34550_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291273582" );
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
     * Method: testAbaNumberCheck_34551_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34551_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291273882" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34552_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34552_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29127388?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34553_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34553_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291273905" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34554_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34554_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "21273905" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34555_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34555_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291273947" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34556_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34556_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29127394?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34557_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34557_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291273950" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34558_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34558_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "291273r50" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34559_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34559_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291273963" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34560_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34560_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2912739?3" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34561_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34561_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291274014" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34562_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34562_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29127014" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34563_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34563_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291274030" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34564_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34564_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2912B4030" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34565_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34565_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291274056" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34566_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34566_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29-274056" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34567_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34567_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291274085" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34568_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34568_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29127?085" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34569_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34569_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291274108" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34570_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34570_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "291274?08" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34571_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34571_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291274111" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34572_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34572_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "201274111" );
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
     * Method: testAbaNumberCheck_34573_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34573_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291275194" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34574_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34574_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291275195" );
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
     * Method: testAbaNumberCheck_34575_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34575_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291275220" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34576_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34576_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "291275J20" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34577_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34577_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291275288" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34578_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34578_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29127d288" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34579_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34579_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291275408" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34580_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34580_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2j1275408" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34581_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34581_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291276481" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34582_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34582_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29127648P" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34583_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34583_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291276562" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34584_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34584_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29127656y" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34585_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34585_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291276591" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34586_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34586_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "291276?91" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34587_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34587_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291276601" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34588_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34588_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "291?76601" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34589_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34589_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291276614" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34590_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34590_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29176614" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34591_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34591_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291276630" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34592_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34592_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29127630" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34593_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34593_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291281560" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34594_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34594_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "291281?60" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34595_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34595_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291370918" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34596_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34596_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29370918" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34597_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34597_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291378130" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34598_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34598_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2913?8130" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34599_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34599_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291378169" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34600_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34600_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "291378?69" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34601_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34601_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291378198" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34602_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34602_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29137819j" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34603_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34603_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291378266" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34604_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34604_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2913?8266" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34605_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34605_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291378295" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34606_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34606_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "296378295" );
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
     * Method: testAbaNumberCheck_34607_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34607_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291378321" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34608_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34608_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "291?78321" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34609_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34609_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291378334" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34610_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34610_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29137833n" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34611_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34611_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291378376" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34612_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34612_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29137?376" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34613_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34613_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291378389" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34614_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34614_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2=1378389" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34615_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34615_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291378392" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34616_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34616_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "291#78392" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34617_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34617_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291378402" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34618_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34618_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2913?8402" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34619_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34619_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291378444" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34620_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34620_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2913?8444" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34621_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34621_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291378460" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34622_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34622_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29137846" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34623_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34623_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291378486" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34624_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34624_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2913784?6" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34625_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34625_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291378512" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34626_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34626_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "291?78512" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34627_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34627_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291378538" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34628_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34628_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2913785?8" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34629_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34629_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291378554" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34630_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34630_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "291378?54" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34631_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34631_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291378583" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34632_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34632_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?1378583" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34633_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34633_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291378606" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34634_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34634_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29?378606" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34635_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34635_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291378635" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34636_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34636_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29137863o" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34637_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34637_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291378648" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34638_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34638_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29137864i" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34639_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34639_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291378693" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34640_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34640_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29137869?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34641_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34641_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291378745" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34642_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34642_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2913?8745" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34643_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34643_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291378758" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34644_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34644_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2913787?8" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34645_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34645_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291378774" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34646_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34646_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29137l774" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34647_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34647_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291378790" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34648_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34648_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291377790" );
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
     * Method: testAbaNumberCheck_34649_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34649_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291378813" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34650_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34650_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29?378813" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34651_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34651_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291378826" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34652_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34652_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291378726" );
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
     * Method: testAbaNumberCheck_34653_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34653_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291378839" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34654_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34654_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29137?839" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34655_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34655_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291378868" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34656_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34656_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29137?868" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34657_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34657_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291378871" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34658_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34658_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29137?871" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34659_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34659_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291378884" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34660_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34660_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2913|8884" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34661_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34661_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291378897" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34662_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34662_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2913?8897" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34663_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34663_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291378936" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34664_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34664_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2913?8936" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34665_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34665_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291378949" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34666_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34666_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "291378w49" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34667_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34667_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291379126" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34668_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34668_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29179126" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34669_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34669_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291379142" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34670_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34670_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29137914?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34671_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34671_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291381570" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34672_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34672_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29181570" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34673_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34673_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291471011" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34674_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34674_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "291M71011" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34675_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34675_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291471024" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34676_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34676_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2914710?4" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34677_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34677_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291471066" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34678_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34678_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29147106" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34679_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34679_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291471134" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34680_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34680_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2b1471134" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34681_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34681_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291471419" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34682_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34682_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2914714o9" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34683_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34683_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291479165" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34684_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34684_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "21479165" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34685_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34685_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291479178" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34686_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34686_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2914D9178" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34687_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34687_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291479217" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34688_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34688_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "291479v17" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34689_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34689_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291479220" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34690_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34690_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "21479220" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34691_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34691_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291479233" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34692_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34692_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "291479?33" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34693_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34693_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291479291" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34694_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34694_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29147-291" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34695_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34695_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291479301" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34696_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34696_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "291479?01" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34697_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34697_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291479356" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34698_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34698_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "291479?56" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34699_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34699_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291479372" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34700_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34700_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2914793l2" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34701_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34701_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291479385" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34702_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34702_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29147938?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34703_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34703_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291479408" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34704_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34704_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29T479408" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34705_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34705_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291479424" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34706_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34706_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "291479-24" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34707_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34707_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291479437" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34708_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34708_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29479437" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34709_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34709_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291479440" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34710_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34710_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2914794g0" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34711_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34711_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291479453" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34712_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34712_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29g479453" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34713_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34713_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291479479" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34714_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34714_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?1479479" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34715_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34715_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291479518" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34716_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34716_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29/479518" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34717_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34717_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291479550" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34718_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34718_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "291479+50" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34719_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34719_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291479563" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34720_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34720_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29147956" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34721_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34721_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291479592" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34722_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34722_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "291?79592" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34723_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34723_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291479602" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34724_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34724_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2)1479602" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34725_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34725_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291479615" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34726_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34726_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29147915" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34727_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34727_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291479657" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34728_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34728_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29147967" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34729_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34729_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291479660" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34730_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34730_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "291479?60" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34731_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34731_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291479673" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34732_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34732_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "291479#73" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34733_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34733_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291479686" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34734_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34734_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?1479686" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34735_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34735_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291479699" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34736_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34736_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29?479699" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34737_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34737_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291479738" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34738_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34738_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2914797-8" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34739_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34739_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291479770" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34740_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34740_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29147977." );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34741_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34741_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291479783" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34742_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34742_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2914?9783" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34743_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34743_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291479806" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34744_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34744_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?1479806" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34745_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34745_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291479835" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34746_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34746_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2914R9835" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34747_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34747_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291479877" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34748_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34748_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2914798?7" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34749_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34749_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291479903" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34750_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34750_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29147903" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34751_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34751_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291479929" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34752_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34752_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2914?9929" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34753_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34753_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291479974" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34754_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34754_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291479975" );
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
     * Method: testAbaNumberCheck_34755_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34755_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291479987" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34756_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34756_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29149987" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34757_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34757_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291480015" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34758_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34758_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29148(015" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34759_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34759_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291480028" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34760_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34760_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2914?0028" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34761_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34761_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291480044" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34762_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34762_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2a1480044" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34763_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34763_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291480060" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34764_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34764_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291483060" );
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
     * Method: testAbaNumberCheck_34765_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34765_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291480073" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34766_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34766_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "291480Y73" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34767_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34767_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291480141" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34768_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34768_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2914801?1" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34769_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34769_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291481441" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34770_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34770_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "291g81441" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34771_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34771_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291481483" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34772_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34772_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29148148" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34773_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34773_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291481496" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34774_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34774_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2T1481496" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34775_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34775_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291481548" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34776_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34776_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29148148" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34777_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34777_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291571267" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34778_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34778_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2915712^7" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34779_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34779_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291571270" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34780_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34780_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2915712?0" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34781_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34781_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291571283" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34782_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34782_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?1571283" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34783_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34783_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291571348" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34784_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34784_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "291?71348" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34785_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34785_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291580151" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34786_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34786_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "291y80151" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34787_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34787_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291580313" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34788_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34788_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?1580313" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34789_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34789_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291580504" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34790_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34790_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "291580}04" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34791_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34791_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291580559" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34792_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34792_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2915805#9" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34793_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34793_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291580562" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34794_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34794_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "291580;62" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34795_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34795_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291580614" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34796_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34796_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29~580614" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34797_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34797_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291580698" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34798_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34798_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2915>0698" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34799_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34799_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291580708" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34800_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34800_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2915H0708" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34801_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34801_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291580711" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34802_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34802_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291580411" );
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
     * Method: testAbaNumberCheck_34803_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34803_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291580724" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34804_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34804_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "291580T24" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34805_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34805_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291580782" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34806_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34806_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29q580782" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34807_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34807_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291871226" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34808_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34808_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29187122?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34809_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34809_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291871336" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34810_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34810_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "298871336" );
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
     * Method: testAbaNumberCheck_34811_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34811_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291871352" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34812_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34812_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?1871352" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34813_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34813_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291878575" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34814_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34814_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?1878575" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34815_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34815_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291880288" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34816_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34816_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2918802?8" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34817_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34817_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291880330" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34818_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34818_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29188|330" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34819_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34819_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291880369" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34820_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34820_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "291880_69" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34821_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34821_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291880411" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34822_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34822_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29188041}" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34823_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34823_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291880424" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34824_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34824_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2918804?4" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34825_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34825_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291880437" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34826_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34826_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2918t0437" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34827_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34827_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291880495" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34828_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34828_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29^880495" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34829_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34829_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291880589" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34830_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34830_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29X880589" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34831_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34831_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291880767" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34832_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34832_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2918b0767" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34833_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34833_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291880806" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34834_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34834_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29188?806" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34835_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34835_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291880848" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34836_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34836_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2918808m8" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34837_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34837_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291880864" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34838_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34838_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2(1880864" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34839_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34839_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291880903" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34840_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34840_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "291?80903" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34841_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34841_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291880916" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34842_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34842_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29188091a" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34843_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34843_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291880961" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34844_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34844_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2]1880961" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34845_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34845_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291881041" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34846_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34846_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?1881041" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34847_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34847_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291881054" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34848_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34848_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29188_054" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34849_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34849_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291881083" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34850_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34850_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2[1881083" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34851_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34851_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291881096" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34852_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34852_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29188?096" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34853_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34853_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291881119" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34854_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34854_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "291?81119" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34855_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34855_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291881122" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34856_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34856_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29?881122" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34857_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34857_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291881151" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34858_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34858_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29188m151" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34859_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34859_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291881164" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34860_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34860_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "291881B64" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34861_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34861_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291881177" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34862_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34862_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "295881177" );
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
     * Method: testAbaNumberCheck_34863_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34863_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291881203" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34864_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34864_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29?881203" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34865_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34865_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291881216" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34866_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34866_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29188?216" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34867_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34867_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291970033" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34868_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34868_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29197033" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34869_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34869_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291970253" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34870_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34870_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29197#253" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34871_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34871_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291970282" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34872_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34872_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2g1970282" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34873_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34873_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291970541" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34874_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34874_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2919705]1" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34875_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34875_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291971320" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34876_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34876_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "291971?20" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34877_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34877_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291971391" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34878_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34878_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "291971,91" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34879_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34879_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291971430" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34880_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34880_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?1971430" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34881_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34881_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291971469" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34882_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34882_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2%1971469" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34883_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34883_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291973153" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34884_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34884_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291973353" );
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
     * Method: testAbaNumberCheck_34885_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34885_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291973166" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34886_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34886_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?1973166" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34887_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34887_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291973195" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34888_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34888_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29197319?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34889_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34889_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291973205" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34890_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34890_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29197?205" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34891_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34891_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291973289" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34892_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34892_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2919?3289" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34893_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34893_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291973292" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34894_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34894_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "291D73292" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34895_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34895_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291973302" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34896_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34896_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "291973L02" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34897_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34897_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291973357" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34898_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34898_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29973357" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34899_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34899_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291973360" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34900_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34900_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291273360" );
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
     * Method: testAbaNumberCheck_34901_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34901_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291973386" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34902_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34902_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29197386" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34903_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34903_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291973454" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34904_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34904_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291993454" );
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
     * Method: testAbaNumberCheck_34905_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34905_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291973470" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34906_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34906_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29197?470" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34907_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34907_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291973629" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34908_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34908_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "291973 29" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34909_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34909_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291973645" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34910_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34910_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29197364?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34911_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34911_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291973674" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34912_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34912_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29973674" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34913_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34913_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291973687" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34914_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34914_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?1973687" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34915_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34915_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291973739" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34916_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34916_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "291973?39" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34917_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34917_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291973755" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34918_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34918_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "291?73755" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34919_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34919_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291973771" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34920_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34920_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29197377?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34921_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34921_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291974123" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34922_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34922_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "291?74123" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34923_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34923_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291974149" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34924_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34924_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2:1974149" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34925_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34925_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291974178" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34926_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34926_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2919?4178" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34927_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34927_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291974194" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34928_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34928_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2919741t4" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34929_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34929_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291974204" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34930_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34930_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "21974204" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34931_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34931_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291975245" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34932_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34932_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2919`5245" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34933_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34933_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291975258" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34934_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34934_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291975255" );
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
     * Method: testAbaNumberCheck_34935_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34935_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291975326" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34936_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34936_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2919`5326" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34937_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34937_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291975355" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34938_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34938_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29197535" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34939_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34939_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291975384" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34940_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34940_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?1975384" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34941_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34941_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291975423" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34942_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34942_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "291?75423" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34943_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34943_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291975465" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34944_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34944_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29175465" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34945_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34945_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291975478" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34946_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34946_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29?975478" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34947_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34947_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291975481" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34948_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34948_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29?975481" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34949_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34949_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291975504" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34950_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34950_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29197M504" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34951_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34951_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291975601" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34952_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34952_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2919O5601" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34953_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34953_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291975614" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34954_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34954_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29197561?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34955_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34955_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291975630" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34956_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34956_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29?975630" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34957_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34957_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291975643" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34958_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34958_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29197564?" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34959_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34959_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291975656" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34960_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34960_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29?975656" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34961_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34961_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291975672" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34962_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34962_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "291?75672" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34963_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34963_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291976493" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34964_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34964_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29f976493" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34965_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34965_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "291981255" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34966_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34966_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29198125r" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34967_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34967_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "292070806" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34968_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34968_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29J070806" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34969_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34969_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "292077511" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34970_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34970_bad( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "292077515" );
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
     * Method: testAbaNumberCheck_34971_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34971_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "292077566" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34972_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34972_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29207756" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34973_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34973_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "292077618" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34974_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34974_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29207761" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34975_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34975_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "292081248" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34976_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34976_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29?081248" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34977_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34977_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "292176661" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34978_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34978_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29?176661" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34979_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34979_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "292176674" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34980_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34980_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "292?76674" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34981_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34981_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "292176690" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34982_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34982_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29217690" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34983_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34983_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "292176700" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34984_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34984_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "292176?00" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34985_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34985_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "292177071" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34986_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34986_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29217071" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34987_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34987_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "292177107" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34988_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34988_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?2177107" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34989_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34989_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "292177136" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34990_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34990_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "2?2177136" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34991_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34991_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "292177165" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34992_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34992_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "292177?65" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34993_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34993_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "292177217" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34994_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34994_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "292?77217" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34995_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34995_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "292177233" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34996_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34996_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29217^233" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34997_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34997_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "292177453" );
        }
        catch( AbaRouteValidationException e ) {

            fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );

            // We're done, just return.
            return;
        }

        // This is a good thing!
        assertTrue( returnBool );
    }

    /**
     * Method: testAbaNumberCheck_34998_bad
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34998_bad( TestInfo testInfo ) {

        // Validate
        try {
            AbaRouteValidator.validate( "29217753" );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            assertEquals( -1004, e.getErrorCode() );
            assertEquals( "net.danielcarda.aba.number.contains.non.ascii.digits", e.getMessage() );

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail( "Should not have got here" );
    }

    /**
     * Method: testAbaNumberCheck_34999_good
     *
     * @param testInfo
     *         Param Desc...
     */
    @Test
    public void testAbaNumberCheck_34999_good( TestInfo testInfo ) {
        boolean returnBool;

        // Validate
        try {
            returnBool = AbaRouteValidator.validate( "292177709" );
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

