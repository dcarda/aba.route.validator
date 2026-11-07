





#  ABA Routhing Transit Number

This module provides a validator which will run a few checks on an ABA
routing transit number (ABA RTN) just to make sure it *might* be authentic.

----------------------------------------------------------------------------
# Table of contents
1. [Basic Overview](#overview)
2. [Technolog Stack](#TechStack)
3. [Another paragraph](#paragraph2)


----------------------------------------------------------------------------
## Basic Overview: <a name="overview"></a>


The ABA routing transit number (ABA RTN) is a nine digit code used in the United States to identify a financial institution. All financial institutions in the United States will have at least one ABA RTN number. The ABA routing transit number was created in 1910 by the American Bankers Association. The number is used by the Federal Reserve Banks to process Fedwire fund transfers. It is also used by the Automated Clearing House to process automated transfers, bill payments, and deposits.

The ABA RTN number can usually (but not always) be found on the bottom left-hand corner of your personal check.

The last digit of the ABA number is actually called a “check digit”. It’s a crude hash of the first eight digits and provides an initial check for the numbers authenticity.

More information about the ABA routing transit number can be found in the Book of Knowledge:
<p>http://en.wikipedia.org/wiki/Routing_transit_number</p>


## Technology Stack <a name="TechStack"></a>

The following software is required to build this project:

| Software | Version | Download                                                                        |
|:--------:|---------|:--------------------------------------------------------------------------------|
|  ![JAVA](https://img.shields.io/badge/_-JAVA-B07219.svg?style=for-the-badge) | 17.0.9  | https://docs.aws.amazon.com/corretto/latest/corretto-17-ug/downloads-list.html  |
| ![Apache Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white)  | 3.9.6   | https://maven.apache.org/download.cgi                                           |


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
```

## Bug tracker

Have a bug or a feature request? Please create an issue and I'll see what I can do!

+ https://github.com/dcarda/aba.route.validator/issues

<!--  ───────────────────────────────────────────────────────────────────────────  -->

## Author

**Daniel Carda - CardaTechnologies, LLC**

+ http://www.danielcarda.net/
+ https://github.com/dcarda/aba.route.validator

## About the Developer  👋

Follow this link to learn more about me:  [Daniel Carda](https://github.com/dcarda)

<!-- End:  Developer  -->
<!--  ───────────────────────────────────────────────────────────────────────────  -->



##  Copyright

(c) 2015-2024  Daniel Carda <GoneBy2025@CardaTechnologies.com>\
All rights reserved.

<!-- End:  Copyright -->
<!--  ───────────────────────────────────────────────────────────────────────────  -->

##  License

[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](LICENSE)

[dcarda/aba.route.validator](https://github.com/dcarda/aba.route.validator)** is licensed under the terms of the [Apache 2.0](https://choosealicense.com/licenses/apache-2.0/) license and is available for free.  

 
 <sup align="right">For information, see <a href="[[https://tldrlegal.com/license/mit-license](https://choosealicense.com/licenses/apache-2.0/)]([https://www.apache.org/licenses/LICENSE-2.0](https://choosealicense.com/licenses/apache-2.0/))">Apache 2.0</a></sup>



<!-- End:  License -->
<!--  ───────────────────────────────────────────────────────────────────────────  -->

##  Donate
Donations are always welcome!  Help me out this this and other projects!

[Show your support!](.github/donate.md)

<!-- End:  Donate -->

<!--  ───────────────────────────────────────────────────────────────────────────  -->
----------------------------------------------------------------------------
<p  align="center">
  <i>© <a href="https://danielcarda.net/">Daniel Carda</a> 2015-2027</i><br>
  <i>Licensed under <a href="https://choosealicense.com/licenses/apache-2.0/">Apache 2.0</a></i><br>
  <a href="https://github.com/lissy93">
  <img src="https://i.ibb.co/4KtpYxb/octocat-clean-mini.png" /></a><br>
  <sup>Thanks for visiting :thumbsup: </sup>
</p>

<!-- End:  Thanks for visiting -->
<!--  ───────────────────────────────────────────────────────────────────────────  -->

