package com.cardatechnologies.utils.validators.abaroutevalidator;

//~--- non-JDK imports --------------------------------------------------------

import com.cardatechnologies.utils.validators.abaroutevalidator.exceptions.AbaRouteValidationException;

import junit.framework.TestCase;
import org.junit.Test;

//~--- classes ----------------------------------------------------------------

/**
 * Unit test for simple App.
 */
public class PerformanceTests
        extends TestCase {
    private AbaRouteValidator aObj;

    //~--- constructors -------------------------------------------------------

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public PerformanceTests( String testName ) {
        super( testName );
    }

    //~--- set methods --------------------------------------------------------

    @Override
    protected void setUp()
            throws Exception {
        super.setUp();

        // Make a fresh one!
        aObj = new AbaRouteValidator();
    }

    //~--- methods ------------------------------------------------------------

    // /**
//  * @return the suite of tests being tested
//  */
//  public static Test suite()
//  {
    @Override
    protected void tearDown()
            throws Exception {
        super.tearDown();

        // Remove the reference
        aObj = null;
    }

//  return new TestSuite( AbaRouteValidatorTest.class );
//  }

    /**
     * Rigourous Test :-)
     */
    @Test
    public void testApp() {

        // Okay, this litterally is going to run millions of these just to I can get
        // a guage on performance.
        int _maxLoops = 5000000;


        long startTime = System.nanoTime();

        for( int i = 0; i < _maxLoops; i++ ) {
            try {
                aObj.validate( "302075018" );
                aObj.validate( "011000138" );
                aObj.validate( "011600525" );
                aObj.validate( "021200096" );
                aObj.validate( "021300019" );
                aObj.validate( "021502354" );
                aObj.validate( "061192517" );
                aObj.validate( "062101219" );
                aObj.validate( "062203748" );
                aObj.validate( "063114328" );
                aObj.validate( "063201040" );
                aObj.validate( "243379925" );
                aObj.validate( "251480288" );
                aObj.validate( "253175494" );
                aObj.validate( "253279196" );
                aObj.validate( "255073345" );
                aObj.validate( "261071522" );
                aObj.validate( "261270857" );
                aObj.validate( "301081414" );
                aObj.validate( "301271790" );
                aObj.validate( "303085829" );
                aObj.validate( "304083396" );
                aObj.validate( "307087713" );
                aObj.validate( "311387991" );
                aObj.validate( "311986318" );
                aObj.validate( "312276409" );
                aObj.validate( "301178178" );
                aObj.validate( "302177440" );
                aObj.validate( "303986148" );
                aObj.validate( "311079209" );
                aObj.validate( "311385948" );
                aObj.validate( "311985830" );
                aObj.validate( "312276111" );
                aObj.validate( "313173336" );
            } catch( AbaRouteValidationException e ) {
                fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );
            }
        }

        long endTime = System.nanoTime();

        double duration = (double)(endTime - startTime) / 1000000;  //divide by 1000000 to get milliseconds.

        System.out.println( "Time was: " + duration );
        System.out.println( "Calcs per sec: " + _maxLoops / (duration/1000) );


        // This is a good thing!
        assertTrue(true);
    }

}
