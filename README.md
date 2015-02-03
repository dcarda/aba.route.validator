#  ABA Routhing Transmit Number

Basic Overview:


This module provides a validator which will run a few checks on an ABA routing transmit number (ABA RTN)  to make sure it *might* be authentic. Basically, there are a few rules in constructing a ABA number and this module will try and check to see if those rules have been applied correctly.

The ABA routing transmit number (ABA RTN) is a nine digit code used in the United States to identify a financial institution. All financial institutions in the United States will have at least one ABA RTN number. The ABA routing transmit number was created in 1910 by the American Bankers Association. The number is used by the Federal Reserve Banks to process Fedwire fund transfers. It is also used by the Automated Clearing House to process automated transfers, bill payments, and deposits.

The ABA RTN number can usually (but not always) be found on the bottom left-hand corner of your personal check. 

The last digit of the ABA number is actually called a “check digit”. It’s a crude hash of the first eight digits and provides an initial check for the numbers authenticity.

More information about the ABA routing transmit number can be found in the Book of Knowledge:
<p>http://en.wikipedia.org/wiki/Routing_transit_number</p>


### How To Include In Your Project
This link should have all the information you need!

file:///D:/projects/CardaTech/aba.route.validator/target/site/dependency-info.html


### Example
```javascript
public void testNullParam() {
        AbaRouteValidator aObj = null;
        String abaNumber = null;

        // Validate
        try {
            aObj.validate(abaNumber);
        } catch (AbaRouteValidationException e) {

            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail("Should not have got here");
    }```
