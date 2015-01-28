package com.cardatechnologies.utils.validators.abaroutevalidator;

//~--- non-JDK imports --------------------------------------------------------

import com.cardatechnologies.utils.validators.abaroutevalidator.exceptions.AbaRouteValidationException;
import junit.framework.TestCase;

//~--- JDK imports ------------------------------------------------------------


/**
 * Unit test for simple App.
 */
public class Test_AbaRouteValidator_01 extends TestCase {
    private AbaRouteValidator aObj;

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public Test_AbaRouteValidator_01(String testName) {
        super(testName);
    }

    //  /**
//   * @return the suite of tests being tested
//   */
//  public static Test suite()
//  {
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();

        // Remove the reference
        aObj = null;
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        // Make a fresh one!
        aObj = new AbaRouteValidator();
    }

//  return new TestSuite( AbaRouteValidatorTest.class );
//  }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {

        // Validate
        try {
            aObj.validate("302075018");
        } catch (AbaRouteValidationException e) {
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testNullParam() {
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
    }

    public void testParamToLong() {
        String abaNumber = "123451234512";

        // Validate
        try {
            aObj.validate(abaNumber);
        } catch (AbaRouteValidationException e) {
            assertTrue(true);

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testParamToShort() {
        String abaNumber = "123412";

        // Validate
        try {
            aObj.validate(abaNumber);
        } catch (AbaRouteValidationException e) {
            assertTrue(true);

            // We're done, just return.
            return;
        }

        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testBlankParam() {
        String abaNumber = "";

        // Validate
        try {
            aObj.validate(abaNumber);
        } catch (AbaRouteValidationException e) {
            assertTrue(true);

            return;
        }

        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testParamNonNumeric() {
        String abaNumber = "123456a89";

        // Validate
        try {
            aObj.validate(abaNumber);
        } catch (AbaRouteValidationException e) {
            assertTrue(true);

            return;
        }

        // If it gets here its bad
        fail("Should not have got here");
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
