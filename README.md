#  ABA Routhing Transmit Number

Basic Overview:


This module provides a validator which will run a few checks on an ABA routing transmit number (ABA RTN)  to make sure it *might* be authentic. Basically, there are a few rules in constructing a ABA number and this module will try and check to see if those rules have been applied correctly.

The ABA routing transmit number (ABA RTN) is a nine digit code used in the United States to identify a financial institution. All financial institutions in the United States will have at least one ABA RTN number. The ABA routing transmit number was created in 1910 by the American Bankers Association. The number is used by the Federal Reserve Banks to process Fedwire fund transfers. It is also used by the Automated Clearing House to process automated transfers, bill payments, and deposits.

The ABA RTN number can usually (but not always) be found on the bottom left-hand corner of your personal check. 

The last digit of the ABA number is actually called a “check digit”. It’s a crude hash of the first eight digits and provides an initial check for the numbers authenticity.

More information about the ABA routing transmit number can be found in the Book of Knowledge:
<p>http://en.wikipedia.org/wiki/Routing_transit_number</p>


### How To Include This Module In Your Project
This link should have all the information you need!

http://dcarda.github.io/aba.route.validator/dependency-info.html

### Example

Here's an example of the validator in action!

```java

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
     * This method will validate an incoming ABA Routing Transmit Number.
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
```

## Bug tracker

Have a bug or a feature request? Please create an issue and I'll see what I can do!

+ https://github.com/dcarda/aba.route.validator/issues

## Author

**Daniel Carda - CardaTechnologies, LLC**

+ http://www.danielcarda.net/
+ https://github.com/dcarda/aba.route.validator

## Copyright and license

Copyright (c) 2015 - CardaTechnologies, LLC

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this work except in compliance with the License.
You may obtain a copy of the License in the LICENSE file, or at:

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

