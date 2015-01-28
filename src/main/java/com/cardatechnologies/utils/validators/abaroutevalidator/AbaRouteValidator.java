package com.cardatechnologies.utils.validators.abaroutevalidator;

//~--- non-JDK imports --------------------------------------------------------

import com.cardatechnologies.utils.validators.abaroutevalidator.exceptions.AbaRouteValidationException;

public class AbaRouteValidator {
    public AbaRouteValidator() {}


    public boolean validate(final String paramAbaRouteNumber) throws AbaRouteValidationException {

        // http://en.wikipedia.org/wiki/Routing_transit_number
        //
        // See FRB Regulation CC, Appendix A, which available online here:
        // <http://www.bankersonline.com/regs/229/a229a.html>

        // Quick Check
        // Is the parameter null
        if (paramAbaRouteNumber == null) {
            throw new AbaRouteValidationException("The ABA Route Number was null.");
        }

        // Quick Check
        // Is the parameter empty
        if (paramAbaRouteNumber == null) {
            throw new AbaRouteValidationException("The ABA Route Number was empty.");
        }

        // Quick Check
        // Make sure the string length is right
        int _strLen;

        _strLen = paramAbaRouteNumber.length();

        // Is if it's the right length
        if (_strLen != 9) {

            // Is it to short?
            if (_strLen < 9) {
                throw new AbaRouteValidationException("The ABA Route Number was not long enough.  (Size was " + _strLen
                        + ").");
            } else {

                // Must be to long.
                throw new AbaRouteValidationException("The ABA Route Number was tot long.  (Size was " + _strLen
                        + ").");
            }
        }

        // Quick Check
        // Finally, let's just do a scan and make sure it's a number
        if (!isNumeric(paramAbaRouteNumber)) {
            throw new AbaRouteValidationException(
                "The ABA Route Number appears to have alphanumeric or formatting characters in it.");
        }

        // -----------------------------------------------------------------------------
        // -----------------------------------------------------------------------------
        // So we got this far, lets start breaking it down.
        breakdownAbaNumber(paramAbaRouteNumber);

        // Must be good!
        return (true);
    }

    public void validateAbaNumberChecksum(final String paramAbaRouteNumber) throws AbaRouteValidationException {

        // Set up all the int's
        int i1;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;

        // create the temp char
        char _tempChar ;

        // I1
        _tempChar = paramAbaRouteNumber.charAt(0);
        i1        = Character.getNumericValue(_tempChar);

        // I2
        _tempChar = paramAbaRouteNumber.charAt(1);
        i2        = Character.getNumericValue(_tempChar);

        // I3
        _tempChar = paramAbaRouteNumber.charAt(2);
        i3        = Character.getNumericValue(_tempChar);

        // I4
        _tempChar = paramAbaRouteNumber.charAt(3);
        i4        = Character.getNumericValue(_tempChar);

        // I5
        _tempChar = paramAbaRouteNumber.charAt(4);
        i5        = Character.getNumericValue(_tempChar);

        // I6
        _tempChar = paramAbaRouteNumber.charAt(5);
        i6        = Character.getNumericValue(_tempChar);

        // I7
        _tempChar = paramAbaRouteNumber.charAt(6);
        i7        = Character.getNumericValue(_tempChar);

        // I8
        _tempChar = paramAbaRouteNumber.charAt(7);
        i8        = Character.getNumericValue(_tempChar);

        // I9
        _tempChar = paramAbaRouteNumber.charAt(8);
        i9        = Character.getNumericValue(_tempChar);

        // Okay, lets crank it through the formula
        int checksumTotal;

        checksumTotal = ((i1 * 3) + (i2 * 7) + (i3) +

        //
        (i4 * 3) + (i5 * 7) + (i6) +

        //
        (i7 * 3) + (i8 * 7) + (i9));

        // Check the modulus and we're done!
        if ((checksumTotal % 10) != 0) {
            throw new AbaRouteValidationException("The ABA Route Number has failed its checksum test.");
        }
    }

    public void breakdownAbaNumber(final String paramAbaRouteNumber) throws AbaRouteValidationException {

        // Check first two digits.
        validateFedNumber(paramAbaRouteNumber);

        // Alright, now see if the number holds up to scrunity!
        validateAbaNumberChecksum(paramAbaRouteNumber);
    }

    public void validateFedNumber(final String paramAbaRouteNumber) throws AbaRouteValidationException {

        // String off the first 2 numbers and see if they validate.
        String _tempStr;

        _tempStr = paramAbaRouteNumber.substring(0, 2);

        // Now, convert the substring to an int
        int _fedNumb;

        _fedNumb = Integer.parseInt(_tempStr);

        // Okay, let's see if it works!
        if (!(((_fedNumb >= 0) && (_fedNumb <= 12)) || ((_fedNumb >= 21) && (_fedNumb <= 32))
                || ((_fedNumb >= 61) && (_fedNumb <= 72)) || ((_fedNumb == 80)))) {
            throw new AbaRouteValidationException(
                "The first two characters of the ABA Routing Number do no correspond to a valid Federal ABA prefix.");
        }
    }

    public boolean isNumeric(final String str) {

        // Cycle through the character array
        for (char _char : str.toCharArray()) {
            if (!Character.isDigit(_char)) {

                // This is bad!
                return (false);
            }
        }

        // All is well!
        return (true);
    }
    public boolean dupMethod(final String str) {

        // Cycle through the character array
        for (char _char : str.toCharArray()) {
            if (!Character.isDigit(_char)) {

                // This is bad!
                return (false);
            }
        }

        // All is well!
        return (true);
    }
}
