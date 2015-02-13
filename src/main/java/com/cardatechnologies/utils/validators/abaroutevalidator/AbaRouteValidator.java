/* ***************************************************************************************
 * Class: com.cardatechnologies.utils.validators.abaroutevalidator.AbaRouteValidator.java
 * Date:  2015/02/11
 * ***************************************************************************************
 *
 * Copyright 2015 - CardaTechnologies, LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * ***************************************************************************************
 */

package com.cardatechnologies.utils.validators.abaroutevalidator;

//~--- non-JDK imports --------------------------------------------------------

import com.cardatechnologies.utils.validators.abaroutevalidator.exceptions.AbaRouteValidationException;

//~--- classes ----------------------------------------------------------------

/**
 * <dl>
 * <dt><font face="Arial"><span class="simpleTagLabel">All Rights Reserved</span></font></dt>
 * <dd>Copyright &copy; 2015 - CardaTechnologies, LLC</dd>
 * <dt><font face="Arial"><span class="simpleTagLabel">Class Description:</span></font></dt>
 * <dd>This class is used to validate a ABA Routing Transit Number.</dd>
 * </dl>
 *
 * @version        1.0.0
 * @author         Daniel Carda
 */
public class AbaRouteValidator {

    /**
     * Method description
     *
     * @param paramAbaRouteNumber The incoming ABA Number.
     *
     * @throws AbaRouteValidationException
     */
     private static void breakdownAbaNumber( final String paramAbaRouteNumber )
            throws AbaRouteValidationException {

        // Check first two digits.
        validateFedNumber( paramAbaRouteNumber );

        // Alright, now see if the number holds up to scrunity!
        validateAbaNumberChecksum( paramAbaRouteNumber );
    }

    //~--- get methods --------------------------------------------------------

    /**
     * Method description
     *
     *
     * @param paramStr The string which needs to be made up of all numbers.
     *
     * @return True if all the characters were digits.  False if there was a problem.
     */
    static private boolean isNumeric( final String paramStr ) {

        // Cycle through the character array
        for( char _char : paramStr.toCharArray() ) {
            if( !Character.isDigit( _char ) ) {

                // This is bad!
                return ( false );
            }
        }

        // All is well!
        return ( true );
    }

    //~--- methods ------------------------------------------------------------

    /**
     * This method is the starting point to validate whether a incoming string is
     * an ABA Routing Transit Number.
     *
     * @param paramAbaRouteNumber The ABA number to be tested.
     *
     * @return  True if it passes validation.  False if it fails validation.
     *
     * @throws AbaRouteValidationException A error occurred when parsing the suspect
     *                                     ABA Routing Transit Number.
     */
    static public boolean validate( final String paramAbaRouteNumber )
            throws AbaRouteValidationException {

        // http://en.wikipedia.org/wiki/Routing_transit_number
        //
        // See FRB Regulation CC, Appendix A, which available online here:
        // <http://www.bankersonline.com/regs/229/a229a.html>
        // Quick Check
        // Is the parameter null
        if( paramAbaRouteNumber == null ) {
            throw new AbaRouteValidationException( "The ABA Route Number was null." );
        }

        // Quick Check
        // Is the parameter empty
        if( paramAbaRouteNumber.trim().equals( "" ) ) {
            throw new AbaRouteValidationException( "The ABA Route Number was empty." );
        }

        // Quick Check
        // Make sure the string length is right
        int _strLen;

        _strLen = paramAbaRouteNumber.length();

        // See if it's the right length
        if( _strLen != 9 ) {

            // Is it to short?
            if( _strLen < 9 ) {
                throw new AbaRouteValidationException( "The ABA Route Number was not long enough.  (Size was "
                        + _strLen + ")." );
            } else {

                // Must be to long.
                throw new AbaRouteValidationException( "The ABA Route Number was tot long.  (Size was " + _strLen
                        + ")." );
            }
        }

        // Quick Check
        // Finally, let's just do a scan and make sure it's a number
        if( !isNumeric( paramAbaRouteNumber ) ) {
            throw new AbaRouteValidationException(
                "The ABA Route Number appears to have alphanumeric or formatting characters in it." );
        }

        // -----------------------------------------------------------------------------
        // -----------------------------------------------------------------------------
        // So we got this far, lets start breaking it down.
        breakdownAbaNumber( paramAbaRouteNumber );

        // Must be good!
        return ( true );
    }

    /**
     * Method description
     *
     *
     * @param paramAbaRouteNumber The target ABA number to test.
     *
     * @throws AbaRouteValidationException
     */
    static private void validateAbaNumberChecksum( final String paramAbaRouteNumber )
            throws AbaRouteValidationException {

        // Set up all the int's
        int i1, i2, i3, i4, i5, i6, i7, i8, i9;

        // Break up the string so we can look at the numbers.
        i1 = Character.getNumericValue( paramAbaRouteNumber.charAt( 0 ) );
        i2 = Character.getNumericValue( paramAbaRouteNumber.charAt( 1 ) );
        i3 = Character.getNumericValue( paramAbaRouteNumber.charAt( 2 ) );
        i4 = Character.getNumericValue( paramAbaRouteNumber.charAt( 3 ) );
        i5 = Character.getNumericValue( paramAbaRouteNumber.charAt( 4 ) );
        i6 = Character.getNumericValue( paramAbaRouteNumber.charAt( 5 ) );
        i7 = Character.getNumericValue( paramAbaRouteNumber.charAt( 6 ) );
        i8 = Character.getNumericValue( paramAbaRouteNumber.charAt( 7 ) );
        i9 = Character.getNumericValue( paramAbaRouteNumber.charAt( 8 ) );

        // Okay, lets crank it through the formula
        int checksumTotal;

        checksumTotal = ( ( i3 + i6 + i9 ) + ( 3 * ( i1 + i4 + i7 ) ) + ( 7 * ( i2 + i5 + i8 ) ) );

        // Check the modulus and we're done!
        if( ( checksumTotal % 10 ) != 0 ) {
            throw new AbaRouteValidationException( "The ABA Route Number has failed its checksum test." );
        }
    }

    /**
     * This method will test to see if the first two characters, when combined to create a
     * number, are within an acceptable range.
     *
     * @param paramAbaRouteNumber The target string to test.
     *
     * @throws AbaRouteValidationException
     */
    static private void validateFedNumber( final String paramAbaRouteNumber )
            throws AbaRouteValidationException {

        // String off the first 2 numbers and see if they validate.
        String _tempStr;

        _tempStr = paramAbaRouteNumber.substring( 0, 2 );

        // Now, convert the substring to an int
        int _fedNumb;

        _fedNumb = Integer.parseInt( _tempStr );

        // Okay, let's see if it works!
        if( !( ( ( _fedNumb >= 0 ) && ( _fedNumb <= 12 ) ) || ( ( _fedNumb >= 21 ) && ( _fedNumb <= 32 ) )
                || ( ( _fedNumb >= 61 ) && ( _fedNumb <= 72 ) ) || ( ( _fedNumb == 80 ) ) ) ) {
            throw new AbaRouteValidationException(
                "The first two characters of the ABA Routing Number do no correspond to a valid Federal ABA prefix." );
        }
    }
}

/* ***************************************************************************************
 * Copyright 2015 - CardaTechnologies, LLC
 *
 * Class: com.cardatechnologies.utils.validators.abaroutevalidator.AbaRouteValidator.java  
 * Date:  2015/02/11
 *************************************************************************************** */
