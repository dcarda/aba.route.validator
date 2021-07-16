/* ---------------------------------------------------------------------------------------
 * Class:  com.cardatechnologies.utils.validators.abaroutevalidator.exceptions.AbaRouteValidationExceptionTest.java
 * Date:   2021/07/08
 * ---------------------------------------------------------------------------------------
 *
 * Copyright, (c) 2020 - Carda Technologies, LLC
 * All rights reserved.
 */

package com.cardatechnologies.utils.validators.abaroutevalidator.exceptions;

//~--- non-JDK imports --------------------------------------------------------

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

import com.cardatechnologies.utils.TraceUnitExtension;

/**
 * Package:    com.cardatechnologies.utils.validators.abaroutevalidator.exceptions
 * Class:      AbaRouteValidationExceptionTest.java
 * Desc:       ...
 *
 * @author     Daniel Carda
 *
 * Maintenance History:
 * <p><pre>
  yyyy mm dd  Who               Description
  ----------  ----------------  ----------------------------------------------------
  2021/07/08  JavaDan           Initial Module Creation...
 * </pre>
 *
 * Copyright, © 2020 - Carda Technologies, LLC
 */
@ExtendWith({ TraceUnitExtension.class })
class AbaRouteValidationExceptionTest {

    @Rule
    public org.junit.rules.MethodRule watchman = new org.junit.rules.TestWatchman() {

        public void starting( org.junit.runners.model.FrameworkMethod method ) {
            System.out.println( "Starting Test: " + method.getName() );
        }
        @Override
        public void finished( org.junit.runners.model.FrameworkMethod method ) {
            System.out.println( "  Ending Test: " + method.getName() );
            System.out.println( "" );
        }
    };


    @Test
    void testConstructor() {

        Throwable throwable = new Throwable();

        AbaRouteValidationException abaRouteValidationException = new AbaRouteValidationException( throwable );

        abaRouteValidationException.setErrorCode( 5151 );

        // Run the asserts   --------------------------------------------------
        assertEquals( 5151, abaRouteValidationException.getErrorCode() );
    }




    /**
     * Method: testErrorCode
     */
    @Test
    void testErrorCode() {
        AbaRouteValidationException abaRouteValidationException = new AbaRouteValidationException( 1001, "TestError" );

        abaRouteValidationException.setErrorCode( 5151 );

        // Run the asserts   --------------------------------------------------
        assertEquals( 5151, abaRouteValidationException.getErrorCode() );
    }

    /**
     * Method: testErrorMessage
     */
    @Test
    void testErrorMessage() {
        AbaRouteValidationException abaRouteValidationException = new AbaRouteValidationException( 1001, "TestError" );

        abaRouteValidationException.setErrorMessage( "crazy MeSSage!!!" );

        // Run the asserts   --------------------------------------------------
        assertEquals( "crazy MeSSage!!!", abaRouteValidationException.getErrorMessage() );
    }
}

/* ---------------------------------------------------------------------------------------
 * Copyright, (c) 2009 - Carda Technologies, LLC
 *
 * ---------------------------------------------------------------------------------------
 * Class:  com.cardatechnologies.utils.validators.abaroutevalidator.exceptions.AbaRouteValidationExceptionTest.java
 * Date:   2021/07/08
 * --------------------------------------------------------------------------------------- */
