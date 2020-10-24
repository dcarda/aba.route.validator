<h2>ABA Routing Number Validator</h2>


   This module provides a validator which will run a few checks on an ABA 
   routing transit number (ABA RTN) just to make sure it *might* be authentic.
     
   Basically, there are a few rules in constructing a ABA number and this module 
   will try and check to see if those rules have been applied correctly.

   The ABA routing transit number (ABA RTN) is a nine digit code used in the 
   United States to identify a financial institution.  All financial institutions 
   in the United States will have at least one ABA RTN number.  The ABA routing 
   transit number was created in 1910 by the American Bankers Association.  
   
   The number is used by the Federal Reserve Banks to process Fedwire fund transfers.  It is also used by the Automated Clearing Houses to process automated transfers, 
   bill payments, and deposits.  

   The ABA RTN number can usually (but not always) be found on the bottom left-hand 
   corner of your personal check.  The last digit of the ABA number is actually 
   called a "check digit".  It's a crude hash of the first eight digits and provides 
   an initial check for the numbers authenticity.  

   More information about the ABA routing transit number can be found in the Book of Knowledge:
   http://en.wikipedia.org/wiki/Routing_transit_number

<h2>Examples</h2>
---
    /**
     * Rigorous Test :-)
     */
    public void testAbaValidation() {

        // This is the ABA RTN for Wells Fargo.
        String _abaString = "121000248";

        // Try and validate the number.
        try {

            // Run the validation.
            boolean _isValid;
            _isValid = validateNumber( _abaString );

            if ( _isValid == false)
            {
                ; // Throw error here
            }
        } catch( AbaRouteValidationException e ) {
            ;    // Do something interesting here...
        }
    }

---

    /**
     * This method will validate an incoming ABA Routing Transit Number.
     *
     * @param paramAbaNumber The ABA number to be validated.
     *
     * @return True if valid.  False if not valid.
     *
     * @throws AbaRouteValidationException Something went *really* wrong.
     */
    public boolean validateNumber( final String paramAbaNumber )
            throws AbaRouteValidationException {
        boolean _isValid;

        // Static call to validate.
        _isValid = AbaRouteValidator.validate( paramAbaNumber );

        // Return the result
        return ( _isValid );
    }
--- 
