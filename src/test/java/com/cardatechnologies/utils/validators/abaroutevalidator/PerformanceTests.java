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
    }

    //~--- methods ------------------------------------------------------------

    @Override
    protected void tearDown()
            throws Exception {
        super.tearDown();
    }

    /**
     * Rigourous Test :-)
     */
    @Test
    public void testApp() {

        // Okay, this litterally is going to run millions of these just to I can get
        // a guage on performance.
        int  _maxLoops = 5000000;
        long startTime = System.nanoTime();

        for( int i = 0; i < _maxLoops; i++ ) {
            try {
                AbaRouteValidator.validate( "302075018" );
                AbaRouteValidator.validate( "011000138" );
                AbaRouteValidator.validate( "011600525" );
                AbaRouteValidator.validate( "021200096" );
                AbaRouteValidator.validate( "021300019" );
                AbaRouteValidator.validate( "021502354" );
                AbaRouteValidator.validate( "061192517" );
                AbaRouteValidator.validate( "062101219" );
                AbaRouteValidator.validate( "062203748" );
                AbaRouteValidator.validate( "063114328" );
                AbaRouteValidator.validate( "063201040" );
                AbaRouteValidator.validate( "243379925" );
                AbaRouteValidator.validate( "251480288" );
                AbaRouteValidator.validate( "253175494" );
                AbaRouteValidator.validate( "253279196" );
                AbaRouteValidator.validate( "255073345" );
                AbaRouteValidator.validate( "261071522" );
                AbaRouteValidator.validate( "261270857" );
                AbaRouteValidator.validate( "301081414" );
                AbaRouteValidator.validate( "301271790" );
                AbaRouteValidator.validate( "303085829" );
                AbaRouteValidator.validate( "304083396" );
                AbaRouteValidator.validate( "307087713" );
                AbaRouteValidator.validate( "311387991" );
                AbaRouteValidator.validate( "311986318" );
                AbaRouteValidator.validate( "312276409" );
                AbaRouteValidator.validate( "301178178" );
                AbaRouteValidator.validate( "302177440" );
                AbaRouteValidator.validate( "303986148" );
                AbaRouteValidator.validate( "311079209" );
                AbaRouteValidator.validate( "311385948" );
                AbaRouteValidator.validate( "311985830" );
                AbaRouteValidator.validate( "312276111" );
                AbaRouteValidator.validate( "313173336" );
            } catch( AbaRouteValidationException e ) {
                fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );
            }
        }

        long   endTime  = System.nanoTime();
        double duration = (double) ( endTime - startTime ) / 1000000;    // divide by 1000000 to get milliseconds.

        System.out.println( "Time was: " + duration );
        System.out.println( "Calcs per sec: " + _maxLoops / ( duration / 1000 ) );

        // This is a good thing!
        assertTrue( true );
    }
}