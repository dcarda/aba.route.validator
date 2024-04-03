---
title: Important Documentation
author: Daniel Carda
---
<h2>ABA Routing Number Validator</h2>

This module provides a validator which will run a few checks on an ABA
routing transit number (ABA RTN) just to make sure it *might* be authentic.

----------------------------------------------------------------------------
# Table of contents
1. [Basic Overview](#overview)
2. [Technolog Stack](#TechStack)
3. [Another paragraph](#paragraph2)

----------------------------------------------------------------------------

This module provides a validator which will run a few checks on an ABA
routing transit number (ABA RTN) just to make sure it *might* be authentic.

Basically, there are a few rules in constructing a ABA number and this module
will try and check to see if those rules have been applied correctly.

The ABA routing transit number (ABA RTN) is a nine-digit code used in the
United States to identify a financial institution.  All financial institutions
in the United States will have at least one ABA RTN number.  The ABA routing
transit number was created in 1910 by the American Bankers Association.

The number is used by the Federal Reserve Banks to process Fedwire fund transfers.  It is also used by the
Automated Clearing Houses to process automated transfers,
bill payments, and deposits.

The ABA RTN number can usually (but not always) be found on the bottom left-hand
corner of your personal check.  The last digit of the ABA number is actually
called a "checksum digit".  It's a crude hash of the first eight digits and provides
an initial check for the numbers authenticity.

![Check Image](images/img.png)

More information about the ABA routing transit number can be found in the Book of Knowledge:
http://en.wikipedia.org/wiki/Routing_transit_number


----------------------------------------------------------------------------
##  Technology Stack <a name="TechStack"></a>

The following software is required to build this project:

| Software |  Version | Download                                                                       |
|:--------:|---------:|--------------------------------------------------------------------------------|
| ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)   |   17.0.9 | https://docs.aws.amazon.com/corretto/latest/corretto-17-ug/downloads-list.html |
|  ![Apache Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white)   |    3.9.6 | https://maven.apache.org/download.cgi                                          |


----------------------------------------------------------------------------
## Social Media

|                                                            Media                                                            | Address                                  |
|:---------------------------------------------------------------------------------------------------------------------------:|------------------------------------------|
|             ![](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)             | https://www.linkedin.com/in/danielcarda/ |
|        ![GitHub](https://img.shields.io/badge/github-%23121011.svg?style=for-the-badge&logo=github&logoColor=white)         | https://github.com/dcarda                |
| ![Apache Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white) | https://maven.apache.org/download.cgi    |


<h2>Examples</h2>
---

The following is s rigious tess will will validate an incoming ABA routing number.

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


##  Copyright

All rights reservered

##  License

This project is licensed under MIT license.

https://opensource.org/license/apache-2-0/

##  Donate

Show your support!


Bitcoin Address:  
35c1dhcpi5kJ6kiY6Pg9HCpXYSQeiZqezD

![Bitcoin](images/BitcoinAddress_QRCode.png)

Shiba Inu Address:  
0xE108399fA5313EB545937694ACb4ba7F5b0467a8

![](images/ShibaInuAddress_QRCode.png)

Ethereum Address:  
0x636BBd19Db23e890A9cE2aef0Da47C4f0Af73c78

![](images/EthereumAddress_ARCode.png)




