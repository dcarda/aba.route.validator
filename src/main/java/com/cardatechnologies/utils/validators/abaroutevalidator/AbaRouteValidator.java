/* ---------------------------------------------------------------------------------------
 * Class:  com.cardatechnologies.utils.validators.abaroutevalidator.AbaRouteValidator.java
 * Date:   2015/02/11
 * ---------------------------------------------------------------------------------------
 * Copyright:  Daniel Carda
 *             All Rights Reserved
 * ---------------------------------------------------------------------------------------
 *
 *  License: MIT license
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANT ABILITY, FITNESS FOR A
 * PARTICULAR PURPOSE AND NON INFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.cardatechnologies.utils.validators.abaroutevalidator;

//~--- non-JDK imports --------------------------------------------------------

import com.cardatechnologies.utils.validators.abaroutevalidator.exceptions.AbaRouteValidationException;

/**
 * <b>Description:</b><br>
 *     This class is used to validate a ABA Routing Transit Number.
 *
 * @author     Daniel Carda
 * <br>
 * <br><b>Maintenance History:</b>
 * <br>
<pre>
    yyyy mm dd  Who                       Description
    ----------  ------------------------  ----------------------------------------------------
    2015/02/11  Daniel Carda              Initial Module Creation...
    2020/12/23  Daniel Carda              Started using and ENum for error content.
    2020/12/24  Daniel Carda              Optimized algorithms.
    2021/08/01  Daniel Carda              Improved Class Javadocs
</pre>
 * <hr>
 */
public class AbaRouteValidator {

    /**
     * Method description
     *
     * @param  paramAbaRouteNumber
     *         The incoming ABA Number.
     *
     * @return boolean
     *         True if all the characters were digits.
     *         False if there was a problem.
     *
     * @throws AbaRouteValidationException
     *         There was a problem somewhere not related to checking the ABA number.
     */
    private static boolean breakdownAbaNumber( final String paramAbaRouteNumber )
            throws AbaRouteValidationException {

        // Check first two digits.
        validateFedNumber( paramAbaRouteNumber );

        // Alright, now see if the number holds up to scrutiny!
        boolean returnBool;

        returnBool = validateAbaNumberChecksum( paramAbaRouteNumber );

        // Return the result
        return( returnBool );
    }

    /**
     * This method is the starting point to validate whether a incoming string is
     * a valid ABA Routing Transit Number.
     *
     * @param   paramAbaRouteNumber The ABA number to be tested.
     *
     * @return boolean
     *         True if all the characters were digits.
     *         False if there was a problem.
     *
     * @throws AbaRouteValidationException
     *         A error occurred when parsing the suspect
     *         ABA Routing Transit Number.
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
            throw new AbaRouteValidationException( ErrorCodes.ABA_1000.getErrorCode(),
                                                   ErrorCodes.ABA_1000.getErrorMnemonic() );
        }

        // Quick Check
        // Is the parameter empty/blank
        if( paramAbaRouteNumber.trim().equals( "" ) ) {
            throw new AbaRouteValidationException( ErrorCodes.ABA_1001.getErrorCode(),
                                                   ErrorCodes.ABA_1001.getErrorMnemonic() );
        }

        // Quick Check
        // Make sure the string length is right
        int _strLen;

        _strLen = paramAbaRouteNumber.length();

        // See if it's the right length
        if( _strLen != 9 ) {

            // Is it to short?
            if( _strLen < 9 ) {
                throw new AbaRouteValidationException( ErrorCodes.ABA_1002.getErrorCode(),
                                                       ErrorCodes.ABA_1002.getErrorMnemonic() );
            }
            else {

                // Must be to long.
                throw new AbaRouteValidationException( ErrorCodes.ABA_1003.getErrorCode(),
                                                       ErrorCodes.ABA_1003.getErrorMnemonic() );
            }
        }

        // Quick Check
        // Finally, let's just do a scan and make sure it's a number
        if( !isNumeric( paramAbaRouteNumber ) ) {
            throw new AbaRouteValidationException( ErrorCodes.ABA_1004.getErrorCode(),
                                                   ErrorCodes.ABA_1004.getErrorMnemonic() );
        }

        // -----------------------------------------------------------------------------
        // -----------------------------------------------------------------------------
        // So we got this far, lets start breaking it down.
        boolean returnBool;

        returnBool = breakdownAbaNumber( paramAbaRouteNumber );

        // Must be good!
        return( returnBool );
    }

    /**
     * Method: validateAbaNumberChecksum
     *
     * @param  paramAbaRouteNumber
     *         The target ABA number to test.
     *
     * @return boolean
     *         True if all the characters were digits.
     *         False if there was a problem.
     */
    static private boolean validateAbaNumberChecksum( final String paramAbaRouteNumber ) {

        // Even thought initializing this to zero is redundant, performance tests
        // were slightly improved.
        int checksumTotal = 0;

        // Set up all the ints
        int i1, i2, i3, i4, i5, i6, i7, i8, i9;

        // Break up the string so we can look at the numbers.
        // Although this is a bit simplistic, doing it this way (as opposed to
        // to a loop) produced much faster results.
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
        checksumTotal = ( ( i3 + i6 + i9 ) + ( 3 * ( i1 + i4 + i7 ) ) + ( 7 * ( i2 + i5 + i8 ) ) );

        // Check the modulus and we're done!
        if( ( checksumTotal % 10 ) != 0 ) {

            // Checksum has failed
            return( false );
        }
        else {

            // Checksum is good!
            return( true );
        }
    }

    /**
     * This method will test to see if the first two characters, when combined to create a
     * number, are within an acceptable range.
     *
     * @param  paramAbaRouteNumber The target string to test.
     *
     * @throws AbaRouteValidationException
     *         There was a problem in converting the ABA number.
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
        if( !( ( ( _fedNumb >= 0 ) && ( _fedNumb <= 12 ) )
                || ( ( _fedNumb >= 21 ) && ( _fedNumb <= 32 ) )
                || ( ( _fedNumb >= 61 ) && ( _fedNumb <= 72 ) )
                || ( ( _fedNumb == 80 ) ) ) ) {
            throw new AbaRouteValidationException( ErrorCodes.ABA_1005.getErrorCode(),
                                                   ErrorCodes.ABA_1005.getErrorMnemonic() );
        }
    }

    /**
     * Method: isNumeric
     *
     * Description:
     *         This method will scan the individual numbers in the ABA number
     *         and makre sure they are numeric digits.
     *
     * @param  paramStr
     *         The string which needs to be made up of all numbers.
     *
     * @return boolean
     *         True if all the characters were digits.
     *         False if there was a problem.
     */
    static private boolean isNumeric( final String paramStr ) {

          // Cycle through the character array
          int size = paramStr.length();
          for( int i = 0; i < size; i++ ) {
              if( !Character.isDigit( paramStr.charAt(i) ) ) {

                  // This is bad!
                  return( false );
              }
          }

          // All is well!
        return( true );
    }
}

/* ---------------------------------------------------------------------------------------
 * Class:  com.cardatechnologies.utils.validators.abaroutevalidator.AbaRouteValidator.java
 * Date:   2015/02/11
 * --------------------------------------------------------------------------------------- */
