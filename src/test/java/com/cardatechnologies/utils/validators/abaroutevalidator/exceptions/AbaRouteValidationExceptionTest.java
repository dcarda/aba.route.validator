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

import com.cardatechnologies.utils.TestWatcherExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

import com.cardatechnologies.utils.TraceUnitExtension;

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
    2021/07/08  Daniel Carda              Initial Module Creation...
    2021/08/07  Daniel Carda              Improved class header JavaDoc.
</pre>
 * <hr>
 */
@ExtendWith({ TraceUnitExtension.class, TestWatcherExtension.class })
class AbaRouteValidationExceptionTest {

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
