 ------
 Introduction
 ------
 Daniel Carda
 ------
 29 January 2015
 ------

~~ Copyright c 2007  Red Hat Middleware, LLC. All rights reserved.
~~
~~ This copyrighted material is made available to anyone wishing to use, modify,
~~ copy, or redistribute it subject to the terms and conditions of the GNU
~~ Lesser General Public License, v. 2.1. This program is distributed in the
~~ hope that it will be useful, but WITHOUT A WARRANTY; without even the implied
~~ warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
~~ Lesser General Public License for more details. You should have received a
~~ copy of the GNU Lesser General Public License, v.2.1 along with this
~~ distribution; if not, write to the Free Software Foundation, Inc.,
~~ 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301, USA.
~~
~~ Red Hat Author(s): Steve Ebersole

ABA Routing Number Validator

   This module provides a validator which will run a few c hecks on an ABA 
   routing transit number (ABA RTN) just to make sure it *might* be authentic.  
   Basically, there are a few rules in constructing a ABA number and this module 
   will try and check to see if those rules have been applied correctly.

   The ABA routing transit number (ABA RTN) is a nine digit code used in the 
   United States to identify a financial institution.  All financial institutions 
   in the United States will have at least one ABA RTN number.  The ABA routing 
   transit number was created in 1910 by the American Bankers Association.  
   The number is used by the Federal Reserve Banks to process Fedwire fund transfers.  
   It is also used by the Automated Clearing House to process automated transfers, 
   bill payments, and deposits.  

   The ABA RTN number can usually (but not always) be found on the bottom left-hand 
   corner of your personal check.  The last digit of the ABA number is actually 
   called a "check digit".  It's a crude hash of the first eight digits and provides 
   an initial check for the numbers authenticity.  

   More information about the ABA routing transit number can be found in the Book of Knowledge:
   http://en.wikipedia.org/wiki/Routing_transit_number


* Examples

---  ------------------
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
---  ------------------


* Donate

    The ABA Routing Transit Number Validator is [open source] and licensed under [Apache license][apache-license].

    In the end, if you _really_ like the module and want to support the author, I will
    be honored to accept a small donation.

    http://cardatechnologies.com/aba-pricing-donations/


[mvn-site]: http://maven.apache.org/guides/mini/guide-site.html
[apache-license]: http://www.apache.org/licenses/LICENSE-2.0
[donate]: http://cardatechnologies.com/aba-pricing-donations/

