package com.cardatechnologies.utils.validators.abaroutevalidator;

//~--- non-JDK imports --------------------------------------------------------

import com.cardatechnologies.utils.validators.abaroutevalidator.exceptions.AbaRouteValidationException;
import junit.framework.TestCase;

//~--- JDK imports ------------------------------------------------------------

/**
 * Unit test for simple App.
 */
public class Test_AbaRouteValidator_05 extends TestCase {
    AbaRouteValidator aObj;

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public Test_AbaRouteValidator_05(String testName) {
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


    public void testAbaNumberCheck_7501_good() {
        // Validate 
        try {
            aObj.validate("065201666");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7502_bad() {
        // Validate 
        try {
            aObj.validate("05201666");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7503_good() {
        // Validate 
        try {
            aObj.validate("065201750");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7504_bad() {
        // Validate 
        try {
            aObj.validate("0Ü5201750");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7505_good() {
        // Validate 
        try {
            aObj.validate("065201789");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7506_bad() {
        // Validate 
        try {
            aObj.validate("06520189");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7507_good() {
        // Validate 
        try {
            aObj.validate("065201802");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7508_bad() {
        // Validate 
        try {
            aObj.validate("065201809");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7509_good() {
        // Validate 
        try {
            aObj.validate("065201831");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7510_bad() {
        // Validate 
        try {
            aObj.validate("06520z831");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7511_good() {
        // Validate 
        try {
            aObj.validate("065201860");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7512_bad() {
        // Validate 
        try {
            aObj.validate("06520o860");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7513_good() {
        // Validate 
        try {
            aObj.validate("065201886");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7514_bad() {
        // Validate 
        try {
            aObj.validate("05201886");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7515_good() {
        // Validate 
        try {
            aObj.validate("065202063");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7516_bad() {
        // Validate 
        try {
            aObj.validate("06202063");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7517_good() {
        // Validate 
        try {
            aObj.validate("065202089");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7518_bad() {
        // Validate 
        try {
            aObj.validate("06520208K");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7519_good() {
        // Validate 
        try {
            aObj.validate("065202186");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7520_bad() {
        // Validate 
        try {
            aObj.validate("06520É186");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7521_good() {
        // Validate 
        try {
            aObj.validate("065202393");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7522_bad() {
        // Validate 
        try {
            aObj.validate("0652023V3");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7523_good() {
        // Validate 
        try {
            aObj.validate("065202445");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7524_bad() {
        // Validate 
        try {
            aObj.validate("0[5202445");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7525_good() {
        // Validate 
        try {
            aObj.validate("065202461");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7526_bad() {
        // Validate 
        try {
            aObj.validate("065=02461");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7527_good() {
        // Validate 
        try {
            aObj.validate("065202555");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7528_bad() {
        // Validate 
        try {
            aObj.validate("0652025:5");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7529_good() {
        // Validate 
        try {
            aObj.validate("065202568");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7530_bad() {
        // Validate 
        try {
            aObj.validate("065202^68");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7531_good() {
        // Validate 
        try {
            aObj.validate("065202607");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7532_bad() {
        // Validate 
        try {
            aObj.validate("06520260¤");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7533_good() {
        // Validate 
        try {
            aObj.validate("065202694");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7534_bad() {
        // Validate 
        try {
            aObj.validate("0652=2694");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7535_good() {
        // Validate 
        try {
            aObj.validate("065202791");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7536_bad() {
        // Validate 
        try {
            aObj.validate("065202Y91");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7537_good() {
        // Validate 
        try {
            aObj.validate("065202830");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7538_bad() {
        // Validate 
        try {
            aObj.validate("0652028¾0");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7539_good() {
        // Validate 
        try {
            aObj.validate("065202953");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7540_bad() {
        // Validate 
        try {
            aObj.validate("0652029W3");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7541_good() {
        // Validate 
        try {
            aObj.validate("065203004");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7542_bad() {
        // Validate 
        try {
            aObj.validate("0652030B4");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7543_good() {
        // Validate 
        try {
            aObj.validate("065203091");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7544_bad() {
        // Validate 
        try {
            aObj.validate("0652030$1");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7545_good() {
        // Validate 
        try {
            aObj.validate("065203143");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7546_bad() {
        // Validate 
        try {
            aObj.validate("0652031§3");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7547_good() {
        // Validate 
        try {
            aObj.validate("065203224");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7548_bad() {
        // Validate 
        try {
            aObj.validate("06É203224");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7549_good() {
        // Validate 
        try {
            aObj.validate("065203431");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7550_bad() {
        // Validate 
        try {
            aObj.validate("0652£3431");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7551_good() {
        // Validate 
        try {
            aObj.validate("065203499");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7552_bad() {
        // Validate 
        try {
            aObj.validate("06520499");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7553_good() {
        // Validate 
        try {
            aObj.validate("065203567");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7554_bad() {
        // Validate 
        try {
            aObj.validate("065703567");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7555_good() {
        // Validate 
        try {
            aObj.validate("065203648");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7556_bad() {
        // Validate 
        try {
            aObj.validate("0Ö5203648");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7557_good() {
        // Validate 
        try {
            aObj.validate("065203729");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7558_bad() {
        // Validate 
        try {
            aObj.validate("06520329");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7559_good() {
        // Validate 
        try {
            aObj.validate("065204184");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7560_bad() {
        // Validate 
        try {
            aObj.validate("065Z04184");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7561_good() {
        // Validate 
        try {
            aObj.validate("065204197");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7562_bad() {
        // Validate 
        try {
            aObj.validate("06520r197");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7563_good() {
        // Validate 
        try {
            aObj.validate("065204249");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7564_bad() {
        // Validate 
        try {
            aObj.validate("06c204249");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7565_good() {
        // Validate 
        try {
            aObj.validate("065204391");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7566_bad() {
        // Validate 
        try {
            aObj.validate("065¿04391");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7567_good() {
        // Validate 
        try {
            aObj.validate("065204443");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7568_bad() {
        // Validate 
        try {
            aObj.validate("06520444n");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7569_good() {
        // Validate 
        try {
            aObj.validate("065204472");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7570_bad() {
        // Validate 
        try {
            aObj.validate("065204Y72");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7571_good() {
        // Validate 
        try {
            aObj.validate("065204511");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7572_bad() {
        // Validate 
        try {
            aObj.validate("06520451#");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7573_good() {
        // Validate 
        try {
            aObj.validate("065204579");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7574_bad() {
        // Validate 
        try {
            aObj.validate("0652G4579");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7575_good() {
        // Validate 
        try {
            aObj.validate("065204663");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7576_bad() {
        // Validate 
        try {
            aObj.validate("065Y04663");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7577_good() {
        // Validate 
        try {
            aObj.validate("065204760");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7578_bad() {
        // Validate 
        try {
            aObj.validate("0652W4760");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7579_good() {
        // Validate 
        try {
            aObj.validate("065204841");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7580_bad() {
        // Validate 
        try {
            aObj.validate("06520481");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7581_good() {
        // Validate 
        try {
            aObj.validate("065204951");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7582_bad() {
        // Validate 
        try {
            aObj.validate("05204951");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7583_good() {
        // Validate 
        try {
            aObj.validate("065204964");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7584_bad() {
        // Validate 
        try {
            aObj.validate("0?5204964");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7585_good() {
        // Validate 
        try {
            aObj.validate("065204977");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7586_bad() {
        // Validate 
        try {
            aObj.validate("0Ì5204977");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7587_good() {
        // Validate 
        try {
            aObj.validate("065204980");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7588_bad() {
        // Validate 
        try {
            aObj.validate("06¼204980");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7589_good() {
        // Validate 
        try {
            aObj.validate("065204993");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7590_bad() {
        // Validate 
        try {
            aObj.validate("0=5204993");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7591_good() {
        // Validate 
        try {
            aObj.validate("065205031");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7592_bad() {
        // Validate 
        try {
            aObj.validate("0652050.1");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7593_good() {
        // Validate 
        try {
            aObj.validate("065205125");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7594_bad() {
        // Validate 
        try {
            aObj.validate("06520525");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7595_good() {
        // Validate 
        try {
            aObj.validate("065205183");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7596_bad() {
        // Validate 
        try {
            aObj.validate("06520183");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7597_good() {
        // Validate 
        try {
            aObj.validate("065205219");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7598_bad() {
        // Validate 
        try {
            aObj.validate("065205X19");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7599_good() {
        // Validate 
        try {
            aObj.validate("065205264");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7600_bad() {
        // Validate 
        try {
            aObj.validate("0652052]4");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7601_good() {
        // Validate 
        try {
            aObj.validate("065205329");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7602_bad() {
        // Validate 
        try {
            aObj.validate("065205Û29");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7603_good() {
        // Validate 
        try {
            aObj.validate("065205468");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7604_bad() {
        // Validate 
        try {
            aObj.validate("06520468");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7605_good() {
        // Validate 
        try {
            aObj.validate("065205484");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7606_bad() {
        // Validate 
        try {
            aObj.validate("06520544");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7607_good() {
        // Validate 
        try {
            aObj.validate("065205507");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7608_bad() {
        // Validate 
        try {
            aObj.validate("06505507");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7609_good() {
        // Validate 
        try {
            aObj.validate("065205549");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7610_bad() {
        // Validate 
        try {
            aObj.validate("065205=49");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7611_good() {
        // Validate 
        try {
            aObj.validate("065300020");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7612_bad() {
        // Validate 
        try {
            aObj.validate("0653³0020");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7613_good() {
        // Validate 
        try {
            aObj.validate("065300211");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7614_bad() {
        // Validate 
        try {
            aObj.validate("06530011");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7615_good() {
        // Validate 
        try {
            aObj.validate("065300279");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7616_bad() {
        // Validate 
        try {
            aObj.validate("06530027N");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7617_good() {
        // Validate 
        try {
            aObj.validate("065300402");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7618_bad() {
        // Validate 
        try {
            aObj.validate("065300«02");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7619_good() {
        // Validate 
        try {
            aObj.validate("065300486");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7620_bad() {
        // Validate 
        try {
            aObj.validate("06530048¤");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7621_good() {
        // Validate 
        try {
            aObj.validate("065300703");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7622_bad() {
        // Validate 
        try {
            aObj.validate("06530|703");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7623_good() {
        // Validate 
        try {
            aObj.validate("065300790");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7624_bad() {
        // Validate 
        try {
            aObj.validate("06300790");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7625_good() {
        // Validate 
        try {
            aObj.validate("065301061");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7626_bad() {
        // Validate 
        try {
            aObj.validate("06530106Ã");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7627_good() {
        // Validate 
        try {
            aObj.validate("065301155");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7628_bad() {
        // Validate 
        try {
            aObj.validate("065301=55");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7629_good() {
        // Validate 
        try {
            aObj.validate("065301197");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7630_bad() {
        // Validate 
        try {
            aObj.validate("06=301197");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7631_good() {
        // Validate 
        try {
            aObj.validate("065301265");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7632_bad() {
        // Validate 
        try {
            aObj.validate("06530165");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7633_good() {
        // Validate 
        try {
            aObj.validate("065301281");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7634_bad() {
        // Validate 
        try {
            aObj.validate("06q301281");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7635_good() {
        // Validate 
        try {
            aObj.validate("065301362");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7636_bad() {
        // Validate 
        try {
            aObj.validate("0653013#2");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7637_good() {
        // Validate 
        try {
            aObj.validate("065301540");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7638_bad() {
        // Validate 
        try {
            aObj.validate("06530154À");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7639_good() {
        // Validate 
        try {
            aObj.validate("065301566");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7640_bad() {
        // Validate 
        try {
            aObj.validate("06530566");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7641_good() {
        // Validate 
        try {
            aObj.validate("065301605");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7642_bad() {
        // Validate 
        try {
            aObj.validate("065301¹05");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7643_good() {
        // Validate 
        try {
            aObj.validate("065301647");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7644_bad() {
        // Validate 
        try {
            aObj.validate("06301647");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7645_good() {
        // Validate 
        try {
            aObj.validate("065301650");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7646_bad() {
        // Validate 
        try {
            aObj.validate("0653¨1650");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7647_good() {
        // Validate 
        try {
            aObj.validate("065301689");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7648_bad() {
        // Validate 
        try {
            aObj.validate("06530168I");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7649_good() {
        // Validate 
        try {
            aObj.validate("065301744");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7650_bad() {
        // Validate 
        try {
            aObj.validate("06301744");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7651_good() {
        // Validate 
        try {
            aObj.validate("065301854");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7652_bad() {
        // Validate 
        try {
            aObj.validate("065D01854");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7653_good() {
        // Validate 
        try {
            aObj.validate("065301883");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7654_bad() {
        // Validate 
        try {
            aObj.validate("06531883");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7655_good() {
        // Validate 
        try {
            aObj.validate("065301948");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7656_bad() {
        // Validate 
        try {
            aObj.validate("065301947");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7657_good() {
        // Validate 
        try {
            aObj.validate("065301993");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7658_bad() {
        // Validate 
        try {
            aObj.validate("0653019&3");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7659_good() {
        // Validate 
        try {
            aObj.validate("065302044");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7660_bad() {
        // Validate 
        try {
            aObj.validate("0t5302044");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7661_good() {
        // Validate 
        try {
            aObj.validate("065302154");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7662_bad() {
        // Validate 
        try {
            aObj.validate("0=5302154");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7663_good() {
        // Validate 
        try {
            aObj.validate("065302183");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7664_bad() {
        // Validate 
        try {
            aObj.validate("0653021e3");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7665_good() {
        // Validate 
        try {
            aObj.validate("065302196");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7666_bad() {
        // Validate 
        try {
            aObj.validate("06530216");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7667_good() {
        // Validate 
        try {
            aObj.validate("065302303");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7668_bad() {
        // Validate 
        try {
            aObj.validate("06530303");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7669_good() {
        // Validate 
        try {
            aObj.validate("065302358");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7670_bad() {
        // Validate 
        try {
            aObj.validate("06302358");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7671_good() {
        // Validate 
        try {
            aObj.validate("065302468");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7672_bad() {
        // Validate 
        try {
            aObj.validate("06530246¼");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7673_good() {
        // Validate 
        try {
            aObj.validate("065302484");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7674_bad() {
        // Validate 
        try {
            aObj.validate("065302z84");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7675_good() {
        // Validate 
        try {
            aObj.validate("065302507");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7676_bad() {
        // Validate 
        try {
            aObj.validate("06530250e");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7677_good() {
        // Validate 
        try {
            aObj.validate("065302633");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7678_bad() {
        // Validate 
        try {
            aObj.validate("065[02633");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7679_good() {
        // Validate 
        try {
            aObj.validate("065302675");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7680_bad() {
        // Validate 
        try {
            aObj.validate("0653026¤5");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7681_good() {
        // Validate 
        try {
            aObj.validate("065302701");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7682_bad() {
        // Validate 
        try {
            aObj.validate("0653027F1");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7683_good() {
        // Validate 
        try {
            aObj.validate("065302895");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7684_bad() {
        // Validate 
        try {
            aObj.validate("06³302895");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7685_good() {
        // Validate 
        try {
            aObj.validate("065302963");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7686_bad() {
        // Validate 
        try {
            aObj.validate("06*302963");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7687_good() {
        // Validate 
        try {
            aObj.validate("065303056");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7688_bad() {
        // Validate 
        try {
            aObj.validate("065r03056");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7689_good() {
        // Validate 
        try {
            aObj.validate("065303069");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7690_bad() {
        // Validate 
        try {
            aObj.validate("0653030Ò9");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7691_good() {
        // Validate 
        try {
            aObj.validate("065303085");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7692_bad() {
        // Validate 
        try {
            aObj.validate("06530-085");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7693_good() {
        // Validate 
        try {
            aObj.validate("065303124");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7694_bad() {
        // Validate 
        try {
            aObj.validate("0653031c4");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7695_good() {
        // Validate 
        try {
            aObj.validate("065303292");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7696_bad() {
        // Validate 
        try {
            aObj.validate("0653}3292");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7697_good() {
        // Validate 
        try {
            aObj.validate("065303315");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7698_bad() {
        // Validate 
        try {
            aObj.validate("0653033j5");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7699_good() {
        // Validate 
        try {
            aObj.validate("065303328");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7700_bad() {
        // Validate 
        try {
            aObj.validate("065303327");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7701_good() {
        // Validate 
        try {
            aObj.validate("065303360");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7702_bad() {
        // Validate 
        try {
            aObj.validate("065U03360");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7703_good() {
        // Validate 
        try {
            aObj.validate("065303386");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7704_bad() {
        // Validate 
        try {
            aObj.validate("0d5303386");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7705_good() {
        // Validate 
        try {
            aObj.validate("065303467");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7706_bad() {
        // Validate 
        try {
            aObj.validate("06303467");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7707_good() {
        // Validate 
        try {
            aObj.validate("065303522");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7708_bad() {
        // Validate 
        try {
            aObj.validate("0653\3522");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7709_good() {
        // Validate 
        try {
            aObj.validate("065303771");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7710_bad() {
        // Validate 
        try {
            aObj.validate("06-303771");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7711_good() {
        // Validate 
        try {
            aObj.validate("065303784");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7712_bad() {
        // Validate 
        try {
            aObj.validate("0653037º4");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7713_good() {
        // Validate 
        try {
            aObj.validate("065303807");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7714_bad() {
        // Validate 
        try {
            aObj.validate("0653µ3807");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7715_good() {
        // Validate 
        try {
            aObj.validate("065303810");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7716_bad() {
        // Validate 
        try {
            aObj.validate("0P5303810");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7717_good() {
        // Validate 
        try {
            aObj.validate("065303920");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7718_bad() {
        // Validate 
        try {
            aObj.validate("06530920");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7719_good() {
        // Validate 
        try {
            aObj.validate("065304084");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7720_bad() {
        // Validate 
        try {
            aObj.validate("06504084");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7721_good() {
        // Validate 
        try {
            aObj.validate("065304327");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7722_bad() {
        // Validate 
        try {
            aObj.validate("065|04327");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7723_good() {
        // Validate 
        try {
            aObj.validate("065304369");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7724_bad() {
        // Validate 
        try {
            aObj.validate("0653'4369");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7725_good() {
        // Validate 
        try {
            aObj.validate("065304385");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7726_bad() {
        // Validate 
        try {
            aObj.validate("0_5304385");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7727_good() {
        // Validate 
        try {
            aObj.validate("065304424");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7728_bad() {
        // Validate 
        try {
            aObj.validate("0653#4424");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7729_good() {
        // Validate 
        try {
            aObj.validate("065304673");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7730_bad() {
        // Validate 
        try {
            aObj.validate("065304672");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7731_good() {
        // Validate 
        try {
            aObj.validate("065305151");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7732_bad() {
        // Validate 
        try {
            aObj.validate("06505151");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7733_good() {
        // Validate 
        try {
            aObj.validate("065305326");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7734_bad() {
        // Validate 
        try {
            aObj.validate("0653053=6");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7735_good() {
        // Validate 
        try {
            aObj.validate("065305436");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7736_bad() {
        // Validate 
        try {
            aObj.validate("065Ã05436");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7737_good() {
        // Validate 
        try {
            aObj.validate("065305478");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7738_bad() {
        // Validate 
        try {
            aObj.validate("06535478");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7739_good() {
        // Validate 
        try {
            aObj.validate("065305863");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7740_bad() {
        // Validate 
        try {
            aObj.validate("06305863");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7741_good() {
        // Validate 
        try {
            aObj.validate("065305902");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7742_bad() {
        // Validate 
        try {
            aObj.validate("06530902");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7743_good() {
        // Validate 
        try {
            aObj.validate("065306066");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7744_bad() {
        // Validate 
        try {
            aObj.validate("06530606");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7745_good() {
        // Validate 
        try {
            aObj.validate("065306079");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7746_bad() {
        // Validate 
        try {
            aObj.validate("0653)6079");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7747_good() {
        // Validate 
        try {
            aObj.validate("065306095");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7748_bad() {
        // Validate 
        try {
            aObj.validate("0653-6095");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7749_good() {
        // Validate 
        try {
            aObj.validate("065306118");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7750_bad() {
        // Validate 
        try {
            aObj.validate("06530^118");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7751_good() {
        // Validate 
        try {
            aObj.validate("065306134");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7752_bad() {
        // Validate 
        try {
            aObj.validate("065386134");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7753_good() {
        // Validate 
        try {
            aObj.validate("065306147");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7754_bad() {
        // Validate 
        try {
            aObj.validate("06530614");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7755_good() {
        // Validate 
        try {
            aObj.validate("065306189");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7756_bad() {
        // Validate 
        try {
            aObj.validate("065Ó06189");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7757_good() {
        // Validate 
        try {
            aObj.validate("065306192");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7758_bad() {
        // Validate 
        try {
            aObj.validate("06530619e");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7759_good() {
        // Validate 
        try {
            aObj.validate("065306202");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7760_bad() {
        // Validate 
        try {
            aObj.validate("06306202");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7761_good() {
        // Validate 
        try {
            aObj.validate("065382514");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7762_bad() {
        // Validate 
        try {
            aObj.validate("065+82514");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7763_good() {
        // Validate 
        try {
            aObj.validate("065382530");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7764_bad() {
        // Validate 
        try {
            aObj.validate("0M5382530");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7765_good() {
        // Validate 
        try {
            aObj.validate("065400137");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7766_bad() {
        // Validate 
        try {
            aObj.validate("06540013");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7767_good() {
        // Validate 
        try {
            aObj.validate("065400140");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7768_bad() {
        // Validate 
        try {
            aObj.validate("06540014T");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7769_good() {
        // Validate 
        try {
            aObj.validate("065400153");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7770_bad() {
        // Validate 
        try {
            aObj.validate("0~5400153");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7771_good() {
        // Validate 
        try {
            aObj.validate("065400483");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7772_bad() {
        // Validate 
        try {
            aObj.validate("065D00483");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7773_good() {
        // Validate 
        try {
            aObj.validate("065400603");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7774_bad() {
        // Validate 
        try {
            aObj.validate("0654006½3");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7775_good() {
        // Validate 
        try {
            aObj.validate("065400687");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7776_bad() {
        // Validate 
        try {
            aObj.validate("06540087");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7777_good() {
        // Validate 
        try {
            aObj.validate("065400755");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7778_bad() {
        // Validate 
        try {
            aObj.validate("0654)0755");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7779_good() {
        // Validate 
        try {
            aObj.validate("065400894");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7780_bad() {
        // Validate 
        try {
            aObj.validate("0z5400894");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7781_good() {
        // Validate 
        try {
            aObj.validate("065401000");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7782_bad() {
        // Validate 
        try {
            aObj.validate("06540100i");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7783_good() {
        // Validate 
        try {
            aObj.validate("065401084");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7784_bad() {
        // Validate 
        try {
            aObj.validate("06540J084");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7785_good() {
        // Validate 
        try {
            aObj.validate("065401107");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7786_bad() {
        // Validate 
        try {
            aObj.validate("0Å5401107");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7787_good() {
        // Validate 
        try {
            aObj.validate("065401181");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7788_bad() {
        // Validate 
        try {
            aObj.validate("06r401181");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7789_good() {
        // Validate 
        try {
            aObj.validate("065401246");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7790_bad() {
        // Validate 
        try {
            aObj.validate("0654012`6");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7791_good() {
        // Validate 
        try {
            aObj.validate("065401369");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7792_bad() {
        // Validate 
        try {
            aObj.validate("06540136¤");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7793_good() {
        // Validate 
        try {
            aObj.validate("065401408");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7794_bad() {
        // Validate 
        try {
            aObj.validate("06»401408");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7795_good() {
        // Validate 
        try {
            aObj.validate("065401411");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7796_bad() {
        // Validate 
        try {
            aObj.validate("06¬401411");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7797_good() {
        // Validate 
        try {
            aObj.validate("065401505");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7798_bad() {
        // Validate 
        try {
            aObj.validate("065t01505");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7799_good() {
        // Validate 
        try {
            aObj.validate("065401673");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7800_bad() {
        // Validate 
        try {
            aObj.validate("065403673");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7801_good() {
        // Validate 
        try {
            aObj.validate("065401712");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7802_bad() {
        // Validate 
        try {
            aObj.validate("065401(12");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7803_good() {
        // Validate 
        try {
            aObj.validate("065402290");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7804_bad() {
        // Validate 
        try {
            aObj.validate("06540229Ì");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7805_good() {
        // Validate 
        try {
            aObj.validate("065402313");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7806_bad() {
        // Validate 
        try {
            aObj.validate("06402313");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7807_good() {
        // Validate 
        try {
            aObj.validate("065402339");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7808_bad() {
        // Validate 
        try {
            aObj.validate("06402339");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7809_good() {
        // Validate 
        try {
            aObj.validate("065402368");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7810_bad() {
        // Validate 
        try {
            aObj.validate("0Ã5402368");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7811_good() {
        // Validate 
        try {
            aObj.validate("065402423");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7812_bad() {
        // Validate 
        try {
            aObj.validate("0654M2423");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7813_good() {
        // Validate 
        try {
            aObj.validate("065402494");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7814_bad() {
        // Validate 
        try {
            aObj.validate("06540494");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7815_good() {
        // Validate 
        try {
            aObj.validate("065402517");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7816_bad() {
        // Validate 
        try {
            aObj.validate("06502517");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7817_good() {
        // Validate 
        try {
            aObj.validate("065402520");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7818_bad() {
        // Validate 
        try {
            aObj.validate("065º02520");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7819_good() {
        // Validate 
        try {
            aObj.validate("065402850");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7820_bad() {
        // Validate 
        try {
            aObj.validate("06540850");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7821_good() {
        // Validate 
        try {
            aObj.validate("065402889");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7822_bad() {
        // Validate 
        try {
            aObj.validate("065402}89");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7823_good() {
        // Validate 
        try {
            aObj.validate("065402892");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7824_bad() {
        // Validate 
        try {
            aObj.validate("065402ª92");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7825_good() {
        // Validate 
        try {
            aObj.validate("065403105");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7826_bad() {
        // Validate 
        try {
            aObj.validate("06540=105");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7827_good() {
        // Validate 
        try {
            aObj.validate("065403150");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7828_bad() {
        // Validate 
        try {
            aObj.validate("06540©150");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7829_good() {
        // Validate 
        try {
            aObj.validate("065403370");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7830_bad() {
        // Validate 
        try {
            aObj.validate("06540337");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7831_good() {
        // Validate 
        try {
            aObj.validate("065403383");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7832_bad() {
        // Validate 
        try {
            aObj.validate("06540i383");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7833_good() {
        // Validate 
        try {
            aObj.validate("065403477");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7834_bad() {
        // Validate 
        try {
            aObj.validate("0654034V7");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7835_good() {
        // Validate 
        try {
            aObj.validate("065403545");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7836_bad() {
        // Validate 
        try {
            aObj.validate("065y03545");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7837_good() {
        // Validate 
        try {
            aObj.validate("065403587");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7838_bad() {
        // Validate 
        try {
            aObj.validate("065403j87");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7839_good() {
        // Validate 
        try {
            aObj.validate("065403626");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7840_bad() {
        // Validate 
        try {
            aObj.validate("06540362");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7841_good() {
        // Validate 
        try {
            aObj.validate("065403875");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7842_bad() {
        // Validate 
        try {
            aObj.validate("06540375");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7843_good() {
        // Validate 
        try {
            aObj.validate("065404159");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7844_bad() {
        // Validate 
        try {
            aObj.validate("06540415");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7845_good() {
        // Validate 
        try {
            aObj.validate("065404256");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7846_bad() {
        // Validate 
        try {
            aObj.validate("06ª404256");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7847_good() {
        // Validate 
        try {
            aObj.validate("065404340");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7848_bad() {
        // Validate 
        try {
            aObj.validate("06540430");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7849_good() {
        // Validate 
        try {
            aObj.validate("065404353");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7850_bad() {
        // Validate 
        try {
            aObj.validate("06540435");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7851_good() {
        // Validate 
        try {
            aObj.validate("065404418");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7852_bad() {
        // Validate 
        try {
            aObj.validate("06Ä404418");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7853_good() {
        // Validate 
        try {
            aObj.validate("065404492");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7854_bad() {
        // Validate 
        try {
            aObj.validate("06504492");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7855_good() {
        // Validate 
        try {
            aObj.validate("065404544");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7856_bad() {
        // Validate 
        try {
            aObj.validate("0f5404544");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7857_good() {
        // Validate 
        try {
            aObj.validate("065404560");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7858_bad() {
        // Validate 
        try {
            aObj.validate("0654045¾0");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7859_good() {
        // Validate 
        try {
            aObj.validate("065404735");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7860_bad() {
        // Validate 
        try {
            aObj.validate("06Y404735");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7861_good() {
        // Validate 
        try {
            aObj.validate("065404913");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7862_bad() {
        // Validate 
        try {
            aObj.validate("0}5404913");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7863_good() {
        // Validate 
        try {
            aObj.validate("065405132");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7864_bad() {
        // Validate 
        try {
            aObj.validate("06Ø405132");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7865_good() {
        // Validate 
        try {
            aObj.validate("065405145");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7866_bad() {
        // Validate 
        try {
            aObj.validate("06540145");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7867_good() {
        // Validate 
        try {
            aObj.validate("065405226");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7868_bad() {
        // Validate 
        try {
            aObj.validate("06540522¡");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7869_good() {
        // Validate 
        try {
            aObj.validate("065405242");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7870_bad() {
        // Validate 
        try {
            aObj.validate("06540£242");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7871_good() {
        // Validate 
        try {
            aObj.validate("065405255");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7872_bad() {
        // Validate 
        try {
            aObj.validate("06540525{");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7873_good() {
        // Validate 
        try {
            aObj.validate("065405284");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7874_bad() {
        // Validate 
        try {
            aObj.validate("065405285");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7875_good() {
        // Validate 
        try {
            aObj.validate("065405297");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7876_bad() {
        // Validate 
        try {
            aObj.validate("06540529²");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7877_good() {
        // Validate 
        try {
            aObj.validate("065405349");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7878_bad() {
        // Validate 
        try {
            aObj.validate("06540549");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7879_good() {
        // Validate 
        try {
            aObj.validate("065405365");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7880_bad() {
        // Validate 
        try {
            aObj.validate("06<405365");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7881_good() {
        // Validate 
        try {
            aObj.validate("065405378");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7882_bad() {
        // Validate 
        try {
            aObj.validate("0K5405378");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7883_good() {
        // Validate 
        try {
            aObj.validate("065405381");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7884_bad() {
        // Validate 
        try {
            aObj.validate("0654[5381");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7885_good() {
        // Validate 
        try {
            aObj.validate("065405417");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7886_bad() {
        // Validate 
        try {
            aObj.validate("065405418");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7887_good() {
        // Validate 
        try {
            aObj.validate("065405420");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7888_bad() {
        // Validate 
        try {
            aObj.validate("065405Ø20");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7889_good() {
        // Validate 
        try {
            aObj.validate("065405459");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7890_bad() {
        // Validate 
        try {
            aObj.validate("065405C59");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7891_good() {
        // Validate 
        try {
            aObj.validate("065405491");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7892_bad() {
        // Validate 
        try {
            aObj.validate("065905491");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7893_good() {
        // Validate 
        try {
            aObj.validate("065405527");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7894_bad() {
        // Validate 
        try {
            aObj.validate("0±5405527");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7895_good() {
        // Validate 
        try {
            aObj.validate("065482595");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7896_bad() {
        // Validate 
        try {
            aObj.validate("06542595");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7897_good() {
        // Validate 
        try {
            aObj.validate("065500752");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7898_bad() {
        // Validate 
        try {
            aObj.validate("06550052");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7899_good() {
        // Validate 
        try {
            aObj.validate("065501353");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7900_bad() {
        // Validate 
        try {
            aObj.validate("06550135");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7901_good() {
        // Validate 
        try {
            aObj.validate("065502608");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7902_bad() {
        // Validate 
        try {
            aObj.validate("065502½08");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7903_good() {
        // Validate 
        try {
            aObj.validate("065502789");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7904_bad() {
        // Validate 
        try {
            aObj.validate("065502389");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7905_good() {
        // Validate 
        try {
            aObj.validate("065503348");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7906_bad() {
        // Validate 
        try {
            aObj.validate("06550\348");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7907_good() {
        // Validate 
        try {
            aObj.validate("065503681");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7908_bad() {
        // Validate 
        try {
            aObj.validate("0655{3681");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7909_good() {
        // Validate 
        try {
            aObj.validate("065505870");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7910_bad() {
        // Validate 
        try {
            aObj.validate("065505871");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7911_good() {
        // Validate 
        try {
            aObj.validate("065506222");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7912_bad() {
        // Validate 
        try {
            aObj.validate("06550622");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7913_good() {
        // Validate 
        try {
            aObj.validate("065506332");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7914_bad() {
        // Validate 
        try {
            aObj.validate("0²5506332");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7915_good() {
        // Validate 
        try {
            aObj.validate("066000581");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7916_bad() {
        // Validate 
        try {
            aObj.validate("06600581");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7917_good() {
        // Validate 
        try {
            aObj.validate("066004367");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7918_bad() {
        // Validate 
        try {
            aObj.validate("06600y367");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7919_good() {
        // Validate 
        try {
            aObj.validate("066004600");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7920_bad() {
        // Validate 
        try {
            aObj.validate("0f6004600");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7921_good() {
        // Validate 
        try {
            aObj.validate("066005311");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7922_bad() {
        // Validate 
        try {
            aObj.validate("066005>11");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7923_good() {
        // Validate 
        try {
            aObj.validate("066005502");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7924_bad() {
        // Validate 
        try {
            aObj.validate("06#005502");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7925_good() {
        // Validate 
        try {
            aObj.validate("066006349");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7926_bad() {
        // Validate 
        try {
            aObj.validate("066006Ü49");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7927_good() {
        // Validate 
        try {
            aObj.validate("066007681");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7928_bad() {
        // Validate 
        try {
            aObj.validate("06600761");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7929_good() {
        // Validate 
        try {
            aObj.validate("066009029");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7930_bad() {
        // Validate 
        try {
            aObj.validate("06600902)");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7931_good() {
        // Validate 
        try {
            aObj.validate("066009155");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7932_bad() {
        // Validate 
        try {
            aObj.validate("06600915");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7933_good() {
        // Validate 
        try {
            aObj.validate("066009456");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7934_bad() {
        // Validate 
        try {
            aObj.validate("066*09456");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7935_good() {
        // Validate 
        try {
            aObj.validate("066009650");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7936_bad() {
        // Validate 
        try {
            aObj.validate("066009670");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7937_good() {
        // Validate 
        try {
            aObj.validate("066010351");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7938_bad() {
        // Validate 
        try {
            aObj.validate("06601d351");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7939_good() {
        // Validate 
        try {
            aObj.validate("066010445");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7940_bad() {
        // Validate 
        try {
            aObj.validate("06c010445");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7941_good() {
        // Validate 
        try {
            aObj.validate("066010490");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7942_bad() {
        // Validate 
        try {
            aObj.validate("066'10490");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7943_good() {
        // Validate 
        try {
            aObj.validate("066010597");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7944_bad() {
        // Validate 
        try {
            aObj.validate("0660105 7");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7945_good() {
        // Validate 
        try {
            aObj.validate("066010678");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7946_bad() {
        // Validate 
        try {
            aObj.validate("0660106t8");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7947_good() {
        // Validate 
        try {
            aObj.validate("066010694");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7948_bad() {
        // Validate 
        try {
            aObj.validate("0660[0694");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7949_good() {
        // Validate 
        try {
            aObj.validate("066010720");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7950_bad() {
        // Validate 
        try {
            aObj.validate("06601070");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7951_good() {
        // Validate 
        try {
            aObj.validate("066010801");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7952_bad() {
        // Validate 
        try {
            aObj.validate("0660#0801");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7953_good() {
        // Validate 
        try {
            aObj.validate("066010869");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7954_bad() {
        // Validate 
        try {
            aObj.validate("06610869");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7955_good() {
        // Validate 
        try {
            aObj.validate("066011350");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7956_bad() {
        // Validate 
        try {
            aObj.validate("06601Â350");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7957_good() {
        // Validate 
        try {
            aObj.validate("066011376");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7958_bad() {
        // Validate 
        try {
            aObj.validate("06ß011376");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7959_good() {
        // Validate 
        try {
            aObj.validate("066011389");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7960_bad() {
        // Validate 
        try {
            aObj.validate("066011:89");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7961_good() {
        // Validate 
        try {
            aObj.validate("066011392");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7962_bad() {
        // Validate 
        try {
            aObj.validate("0660Ä1392");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7963_good() {
        // Validate 
        try {
            aObj.validate("066011567");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7964_bad() {
        // Validate 
        try {
            aObj.validate("066L11567");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7965_good() {
        // Validate 
        try {
            aObj.validate("066012207");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7966_bad() {
        // Validate 
        try {
            aObj.validate("06612207");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7967_good() {
        // Validate 
        try {
            aObj.validate("066012333");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7968_bad() {
        // Validate 
        try {
            aObj.validate("066012Ü33");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7969_good() {
        // Validate 
        try {
            aObj.validate("066012867");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7970_bad() {
        // Validate 
        try {
            aObj.validate("066Ø12867");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7971_good() {
        // Validate 
        try {
            aObj.validate("066013989");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7972_bad() {
        // Validate 
        try {
            aObj.validate("06601398=");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7973_good() {
        // Validate 
        try {
            aObj.validate("066014069");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7974_bad() {
        // Validate 
        try {
            aObj.validate("06W014069");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7975_good() {
        // Validate 
        try {
            aObj.validate("066014085");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7976_bad() {
        // Validate 
        try {
            aObj.validate("06614085");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7977_good() {
        // Validate 
        try {
            aObj.validate("066014153");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7978_bad() {
        // Validate 
        try {
            aObj.validate("06601Ñ153");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7979_good() {
        // Validate 
        try {
            aObj.validate("066014726");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7980_bad() {
        // Validate 
        try {
            aObj.validate("066014»26");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7981_good() {
        // Validate 
        try {
            aObj.validate("066014959");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7982_bad() {
        // Validate 
        try {
            aObj.validate("06r014959");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7983_good() {
        // Validate 
        try {
            aObj.validate("066015084");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7984_bad() {
        // Validate 
        try {
            aObj.validate("06601584");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7985_good() {
        // Validate 
        try {
            aObj.validate("066015181");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7986_bad() {
        // Validate 
        try {
            aObj.validate("06601[181");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7987_good() {
        // Validate 
        try {
            aObj.validate("066015440");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7988_bad() {
        // Validate 
        try {
            aObj.validate("0660154|0");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7989_good() {
        // Validate 
        try {
            aObj.validate("066015576");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7990_bad() {
        // Validate 
        try {
            aObj.validate("06m015576");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7991_good() {
        // Validate 
        try {
            aObj.validate("066015767");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7992_bad() {
        // Validate 
        try {
            aObj.validate("06=015767");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7993_good() {
        // Validate 
        try {
            aObj.validate("066016054");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7994_bad() {
        // Validate 
        try {
            aObj.validate("0660160^4");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7995_good() {
        // Validate 
        try {
            aObj.validate("066016711");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7996_bad() {
        // Validate 
        try {
            aObj.validate("066012711");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7997_good() {
        // Validate 
        try {
            aObj.validate("066016766");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_7998_bad() {
        // Validate 
        try {
            aObj.validate("06601676¶");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_7999_good() {
        // Validate 
        try {
            aObj.validate("067000438");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8000_bad() {
        // Validate 
        try {
            aObj.validate("067000a38");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8001_good() {
        // Validate 
        try {
            aObj.validate("067001013");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8002_bad() {
        // Validate 
        try {
            aObj.validate("06700n013");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8003_good() {
        // Validate 
        try {
            aObj.validate("067001097");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8004_bad() {
        // Validate 
        try {
            aObj.validate("06¨001097");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8005_good() {
        // Validate 
        try {
            aObj.validate("067001246");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8006_bad() {
        // Validate 
        try {
            aObj.validate("0670012 6");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8007_good() {
        // Validate 
        try {
            aObj.validate("067001275");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8008_bad() {
        // Validate 
        try {
            aObj.validate("06700125");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8009_good() {
        // Validate 
        try {
            aObj.validate("067001699");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8010_bad() {
        // Validate 
        try {
            aObj.validate("06700?699");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8011_good() {
        // Validate 
        try {
            aObj.validate("067002436");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8012_bad() {
        // Validate 
        try {
            aObj.validate("06700243P");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8013_good() {
        // Validate 
        try {
            aObj.validate("067002533");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8014_bad() {
        // Validate 
        try {
            aObj.validate("06700¯533");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8015_good() {
        // Validate 
        try {
            aObj.validate("067003671");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8016_bad() {
        // Validate 
        try {
            aObj.validate("06700367-");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8017_good() {
        // Validate 
        try {
            aObj.validate("067003778");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8018_bad() {
        // Validate 
        try {
            aObj.validate("06·003778");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8019_good() {
        // Validate 
        try {
            aObj.validate("067003927");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8020_bad() {
        // Validate 
        try {
            aObj.validate("0670039,7");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8021_good() {
        // Validate 
        try {
            aObj.validate("067003985");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8022_bad() {
        // Validate 
        try {
            aObj.validate("067003905");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8023_good() {
        // Validate 
        try {
            aObj.validate("067004764");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8024_bad() {
        // Validate 
        try {
            aObj.validate("06700464");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8025_good() {
        // Validate 
        try {
            aObj.validate("067005145");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8026_bad() {
        // Validate 
        try {
            aObj.validate("06Ú005145");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8027_good() {
        // Validate 
        try {
            aObj.validate("067005158");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8028_bad() {
        // Validate 
        try {
            aObj.validate("06t005158");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8029_good() {
        // Validate 
        try {
            aObj.validate("067005475");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8030_bad() {
        // Validate 
        try {
            aObj.validate("06700547");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8031_good() {
        // Validate 
        try {
            aObj.validate("067005679");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8032_bad() {
        // Validate 
        try {
            aObj.validate("0670056F9");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8033_good() {
        // Validate 
        try {
            aObj.validate("067005873");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8034_bad() {
        // Validate 
        try {
            aObj.validate("067%05873");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8035_good() {
        // Validate 
        try {
            aObj.validate("067006063");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8036_bad() {
        // Validate 
        try {
            aObj.validate("06P006063");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8037_good() {
        // Validate 
        try {
            aObj.validate("067006173");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8038_bad() {
        // Validate 
        try {
            aObj.validate("06006173");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8039_good() {
        // Validate 
        try {
            aObj.validate("067006238");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8040_bad() {
        // Validate 
        try {
            aObj.validate("06700623E");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8041_good() {
        // Validate 
        try {
            aObj.validate("067006432");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8042_bad() {
        // Validate 
        try {
            aObj.validate("0670G6432");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8043_good() {
        // Validate 
        try {
            aObj.validate("067006762");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8044_bad() {
        // Validate 
        try {
            aObj.validate("067006062");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8045_good() {
        // Validate 
        try {
            aObj.validate("067006775");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8046_bad() {
        // Validate 
        try {
            aObj.validate("0Î7006775");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8047_good() {
        // Validate 
        try {
            aObj.validate("067007130");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8048_bad() {
        // Validate 
        try {
            aObj.validate("0670«7130");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8049_good() {
        // Validate 
        try {
            aObj.validate("067007156");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8050_bad() {
        // Validate 
        try {
            aObj.validate("0>7007156");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8051_good() {
        // Validate 
        try {
            aObj.validate("067007240");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8052_bad() {
        // Validate 
        try {
            aObj.validate("06007240");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8053_good() {
        // Validate 
        try {
            aObj.validate("067007758");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8054_bad() {
        // Validate 
        try {
            aObj.validate("06700*758");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8055_good() {
        // Validate 
        try {
            aObj.validate("067007949");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8056_bad() {
        // Validate 
        try {
            aObj.validate("06[007949");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8057_good() {
        // Validate 
        try {
            aObj.validate("067007952");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8058_bad() {
        // Validate 
        try {
            aObj.validate("06700795");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8059_good() {
        // Validate 
        try {
            aObj.validate("067008155");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8060_bad() {
        // Validate 
        try {
            aObj.validate("06700155");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8061_good() {
        // Validate 
        try {
            aObj.validate("067008414");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8062_bad() {
        // Validate 
        try {
            aObj.validate("06700844");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8063_good() {
        // Validate 
        try {
            aObj.validate("067008579");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8064_bad() {
        // Validate 
        try {
            aObj.validate("0Z7008579");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8065_good() {
        // Validate 
        try {
            aObj.validate("067008582");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8066_bad() {
        // Validate 
        try {
            aObj.validate("0670O8582");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8067_good() {
        // Validate 
        try {
            aObj.validate("067008993");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8068_bad() {
        // Validate 
        try {
            aObj.validate("06700893");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8069_good() {
        // Validate 
        try {
            aObj.validate("067009044");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8070_bad() {
        // Validate 
        try {
            aObj.validate("07009044");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8071_good() {
        // Validate 
        try {
            aObj.validate("067009280");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8072_bad() {
        // Validate 
        try {
            aObj.validate("067009250");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8073_good() {
        // Validate 
        try {
            aObj.validate("067009390");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8074_bad() {
        // Validate 
        try {
            aObj.validate("06700939r");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8075_good() {
        // Validate 
        try {
            aObj.validate("067009646");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8076_bad() {
        // Validate 
        try {
            aObj.validate("07009646");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8077_good() {
        // Validate 
        try {
            aObj.validate("067009785");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8078_bad() {
        // Validate 
        try {
            aObj.validate("06700978¢");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8079_good() {
        // Validate 
        try {
            aObj.validate("067010169");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8080_bad() {
        // Validate 
        try {
            aObj.validate("067010D69");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8081_good() {
        // Validate 
        try {
            aObj.validate("067010266");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8082_bad() {
        // Validate 
        try {
            aObj.validate("065010266");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8083_good() {
        // Validate 
        try {
            aObj.validate("067010509");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8084_bad() {
        // Validate 
        try {
            aObj.validate("07010509");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8085_good() {
        // Validate 
        try {
            aObj.validate("067010512");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8086_bad() {
        // Validate 
        try {
            aObj.validate("067>10512");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8087_good() {
        // Validate 
        try {
            aObj.validate("067010583");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8088_bad() {
        // Validate 
        try {
            aObj.validate("0I7010583");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8089_good() {
        // Validate 
        try {
            aObj.validate("067010635");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8090_bad() {
        // Validate 
        try {
            aObj.validate("06701¬635");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8091_good() {
        // Validate 
        try {
            aObj.validate("067011142");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8092_bad() {
        // Validate 
        try {
            aObj.validate("06701K142");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8093_good() {
        // Validate 
        try {
            aObj.validate("067011294");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8094_bad() {
        // Validate 
        try {
            aObj.validate("067¿11294");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8095_good() {
        // Validate 
        try {
            aObj.validate("067011456");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8096_bad() {
        // Validate 
        try {
            aObj.validate("06701145Ã");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8097_good() {
        // Validate 
        try {
            aObj.validate("067011692");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8098_bad() {
        // Validate 
        try {
            aObj.validate("087011692");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8099_good() {
        // Validate 
        try {
            aObj.validate("067011760");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8100_bad() {
        // Validate 
        try {
            aObj.validate("06701Q760");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8101_good() {
        // Validate 
        try {
            aObj.validate("067011812");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8102_bad() {
        // Validate 
        try {
            aObj.validate("06011812");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8103_good() {
        // Validate 
        try {
            aObj.validate("067011825");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8104_bad() {
        // Validate 
        try {
            aObj.validate("0670=1825");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8105_good() {
        // Validate 
        try {
            aObj.validate("067011977");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8106_bad() {
        // Validate 
        try {
            aObj.validate("0670119¼7");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8107_good() {
        // Validate 
        try {
            aObj.validate("067011993");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8108_bad() {
        // Validate 
        try {
            aObj.validate("0µ7011993");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8109_good() {
        // Validate 
        try {
            aObj.validate("067012028");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8110_bad() {
        // Validate 
        try {
            aObj.validate("06712028");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8111_good() {
        // Validate 
        try {
            aObj.validate("067012057");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8112_bad() {
        // Validate 
        try {
            aObj.validate("06701205°");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8113_good() {
        // Validate 
        try {
            aObj.validate("067012099");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8114_bad() {
        // Validate 
        try {
            aObj.validate("06712099");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8115_good() {
        // Validate 
        try {
            aObj.validate("067012413");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8116_bad() {
        // Validate 
        try {
            aObj.validate("067012°13");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8117_good() {
        // Validate 
        try {
            aObj.validate("067012471");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8118_bad() {
        // Validate 
        try {
            aObj.validate("067012481");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8119_good() {
        // Validate 
        try {
            aObj.validate("067012484");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8120_bad() {
        // Validate 
        try {
            aObj.validate("0M7012484");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8121_good() {
        // Validate 
        try {
            aObj.validate("067012565");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8122_bad() {
        // Validate 
        try {
            aObj.validate("067012Y65");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8123_good() {
        // Validate 
        try {
            aObj.validate("067012688");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8124_bad() {
        // Validate 
        try {
            aObj.validate("067012q88");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8125_good() {
        // Validate 
        try {
            aObj.validate("067012811");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8126_bad() {
        // Validate 
        try {
            aObj.validate("06701281E");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8127_good() {
        // Validate 
        try {
            aObj.validate("067012882");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8128_bad() {
        // Validate 
        try {
            aObj.validate("06701282");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8129_good() {
        // Validate 
        try {
            aObj.validate("067012895");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8130_bad() {
        // Validate 
        try {
            aObj.validate("06701289-");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8131_good() {
        // Validate 
        try {
            aObj.validate("067012921");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8132_bad() {
        // Validate 
        try {
            aObj.validate("06012921");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8133_good() {
        // Validate 
        try {
            aObj.validate("067013124");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8134_bad() {
        // Validate 
        try {
            aObj.validate("06`013124");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8135_good() {
        // Validate 
        try {
            aObj.validate("067013179");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8136_bad() {
        // Validate 
        try {
            aObj.validate("06701317");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8137_good() {
        // Validate 
        try {
            aObj.validate("067013247");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8138_bad() {
        // Validate 
        try {
            aObj.validate("06z013247");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8139_good() {
        // Validate 
        try {
            aObj.validate("067013564");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8140_bad() {
        // Validate 
        try {
            aObj.validate("0×7013564");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8141_good() {
        // Validate 
        try {
            aObj.validate("067013700");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8142_bad() {
        // Validate 
        try {
            aObj.validate("06013700");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8143_good() {
        // Validate 
        try {
            aObj.validate("067013836");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8144_bad() {
        // Validate 
        try {
            aObj.validate("0´7013836");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8145_good() {
        // Validate 
        try {
            aObj.validate("067013852");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8146_bad() {
        // Validate 
        try {
            aObj.validate("06701-852");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8147_good() {
        // Validate 
        try {
            aObj.validate("067014026");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8148_bad() {
        // Validate 
        try {
            aObj.validate("0670n4026");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8149_good() {
        // Validate 
        try {
            aObj.validate("067014071");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8150_bad() {
        // Validate 
        try {
            aObj.validate("06701471");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8151_good() {
        // Validate 
        try {
            aObj.validate("067014110");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8152_bad() {
        // Validate 
        try {
            aObj.validate("067014100");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8153_good() {
        // Validate 
        try {
            aObj.validate("067014123");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8154_bad() {
        // Validate 
        try {
            aObj.validate("0670;4123");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8155_good() {
        // Validate 
        try {
            aObj.validate("067014181");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8156_bad() {
        // Validate 
        try {
            aObj.validate("067014È81");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8157_good() {
        // Validate 
        try {
            aObj.validate("067014194");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8158_bad() {
        // Validate 
        try {
            aObj.validate("06j014194");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8159_good() {
        // Validate 
        try {
            aObj.validate("067014246");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8160_bad() {
        // Validate 
        try {
            aObj.validate("06701E246");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8161_good() {
        // Validate 
        try {
            aObj.validate("067014291");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8162_bad() {
        // Validate 
        try {
            aObj.validate("06701Ä291");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8163_good() {
        // Validate 
        try {
            aObj.validate("067014301");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8164_bad() {
        // Validate 
        try {
            aObj.validate("06704301");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8165_good() {
        // Validate 
        try {
            aObj.validate("067014330");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8166_bad() {
        // Validate 
        try {
            aObj.validate("06704330");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8167_good() {
        // Validate 
        try {
            aObj.validate("067014343");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8168_bad() {
        // Validate 
        try {
            aObj.validate("0670s4343");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8169_good() {
        // Validate 
        try {
            aObj.validate("067014372");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8170_bad() {
        // Validate 
        try {
            aObj.validate("067Ç14372");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8171_good() {
        // Validate 
        try {
            aObj.validate("067014437");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8172_bad() {
        // Validate 
        try {
            aObj.validate("0G7014437");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8173_good() {
        // Validate 
        try {
            aObj.validate("067014453");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8174_bad() {
        // Validate 
        try {
            aObj.validate("067Ê14453");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8175_good() {
        // Validate 
        try {
            aObj.validate("067014466");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8176_bad() {
        // Validate 
        try {
            aObj.validate("06701466");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8177_good() {
        // Validate 
        try {
            aObj.validate("067014521");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8178_bad() {
        // Validate 
        try {
            aObj.validate("0670145j1");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8179_good() {
        // Validate 
        try {
            aObj.validate("067014592");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8180_bad() {
        // Validate 
        try {
            aObj.validate("087014592");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8181_good() {
        // Validate 
        try {
            aObj.validate("067014615");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8182_bad() {
        // Validate 
        try {
            aObj.validate("06701461±");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8183_good() {
        // Validate 
        try {
            aObj.validate("067014673");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8184_bad() {
        // Validate 
        try {
            aObj.validate("06701467Û");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8185_good() {
        // Validate 
        try {
            aObj.validate("067014686");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8186_bad() {
        // Validate 
        try {
            aObj.validate("0¿7014686");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8187_good() {
        // Validate 
        try {
            aObj.validate("067014712");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8188_bad() {
        // Validate 
        try {
            aObj.validate("067014i12");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8189_good() {
        // Validate 
        try {
            aObj.validate("067014738");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8190_bad() {
        // Validate 
        try {
            aObj.validate("0670147.8");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8191_good() {
        // Validate 
        try {
            aObj.validate("067014767");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8192_bad() {
        // Validate 
        try {
            aObj.validate("06714767");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8193_good() {
        // Validate 
        try {
            aObj.validate("067014822");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8194_bad() {
        // Validate 
        try {
            aObj.validate("068014822");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8195_good() {
        // Validate 
        try {
            aObj.validate("067014851");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8196_bad() {
        // Validate 
        try {
            aObj.validate("06701485x");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8197_good() {
        // Validate 
        try {
            aObj.validate("067014961");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8198_bad() {
        // Validate 
        try {
            aObj.validate("027014961");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8199_good() {
        // Validate 
        try {
            aObj.validate("067014987");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8200_bad() {
        // Validate 
        try {
            aObj.validate("06701498I");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8201_good() {
        // Validate 
        try {
            aObj.validate("067015012");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8202_bad() {
        // Validate 
        try {
            aObj.validate("0 7015012");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8203_good() {
        // Validate 
        try {
            aObj.validate("067015096");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8204_bad() {
        // Validate 
        try {
            aObj.validate("0670150É6");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8205_good() {
        // Validate 
        try {
            aObj.validate("067015119");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8206_bad() {
        // Validate 
        try {
            aObj.validate("067015319");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8207_good() {
        // Validate 
        try {
            aObj.validate("067015164");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8208_bad() {
        // Validate 
        try {
            aObj.validate("0670o5164");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8209_good() {
        // Validate 
        try {
            aObj.validate("067015203");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8210_bad() {
        // Validate 
        try {
            aObj.validate("06715203");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8211_good() {
        // Validate 
        try {
            aObj.validate("067015232");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8212_bad() {
        // Validate 
        try {
            aObj.validate("067015©32");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8213_good() {
        // Validate 
        try {
            aObj.validate("067015258");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8214_bad() {
        // Validate 
        try {
            aObj.validate("06701258");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8215_good() {
        // Validate 
        try {
            aObj.validate("067015274");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8216_bad() {
        // Validate 
        try {
            aObj.validate("067·15274");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8217_good() {
        // Validate 
        try {
            aObj.validate("067015287");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8218_bad() {
        // Validate 
        try {
            aObj.validate("0670152w7");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8219_good() {
        // Validate 
        try {
            aObj.validate("067015313");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8220_bad() {
        // Validate 
        try {
            aObj.validate("067015314");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8221_good() {
        // Validate 
        try {
            aObj.validate("067015326");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8222_bad() {
        // Validate 
        try {
            aObj.validate("06701É326");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8223_good() {
        // Validate 
        try {
            aObj.validate("067015355");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8224_bad() {
        // Validate 
        try {
            aObj.validate("067015_55");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8225_good() {
        // Validate 
        try {
            aObj.validate("067015397");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8226_bad() {
        // Validate 
        try {
            aObj.validate("06701539©");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8227_good() {
        // Validate 
        try {
            aObj.validate("067015478");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8228_bad() {
        // Validate 
        try {
            aObj.validate("0670µ5478");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8229_good() {
        // Validate 
        try {
            aObj.validate("067015546");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8230_bad() {
        // Validate 
        try {
            aObj.validate("067¼15546");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8231_good() {
        // Validate 
        try {
            aObj.validate("067015601");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8232_bad() {
        // Validate 
        try {
            aObj.validate("06701560×");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8233_good() {
        // Validate 
        try {
            aObj.validate("067015643");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8234_bad() {
        // Validate 
        try {
            aObj.validate("06715643");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8235_good() {
        // Validate 
        try {
            aObj.validate("067015656");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8236_bad() {
        // Validate 
        try {
            aObj.validate("07015656");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8237_good() {
        // Validate 
        try {
            aObj.validate("067015724");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8238_bad() {
        // Validate 
        try {
            aObj.validate("0670Ä5724");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8239_good() {
        // Validate 
        try {
            aObj.validate("067015779");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8240_bad() {
        // Validate 
        try {
            aObj.validate("06J015779");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8241_good() {
        // Validate 
        try {
            aObj.validate("067015795");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8242_bad() {
        // Validate 
        try {
            aObj.validate("0Ä7015795");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8243_good() {
        // Validate 
        try {
            aObj.validate("067015863");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8244_bad() {
        // Validate 
        try {
            aObj.validate("0¹7015863");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8245_good() {
        // Validate 
        try {
            aObj.validate("067015928");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8246_bad() {
        // Validate 
        try {
            aObj.validate("067=15928");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8247_good() {
        // Validate 
        try {
            aObj.validate("067015944");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8248_bad() {
        // Validate 
        try {
            aObj.validate("07015944");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8249_good() {
        // Validate 
        try {
            aObj.validate("067015973");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8250_bad() {
        // Validate 
        try {
            aObj.validate("067´15973");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8251_good() {
        // Validate 
        try {
            aObj.validate("067015986");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8252_bad() {
        // Validate 
        try {
            aObj.validate("06015986");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8253_good() {
        // Validate 
        try {
            aObj.validate("067015999");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8254_bad() {
        // Validate 
        try {
            aObj.validate("0670159#9");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8255_good() {
        // Validate 
        try {
            aObj.validate("067016037");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8256_bad() {
        // Validate 
        try {
            aObj.validate("067z16037");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8257_good() {
        // Validate 
        try {
            aObj.validate("067016040");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8258_bad() {
        // Validate 
        try {
            aObj.validate("0670160W0");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8259_good() {
        // Validate 
        try {
            aObj.validate("067016105");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8260_bad() {
        // Validate 
        try {
            aObj.validate("06016105");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8261_good() {
        // Validate 
        try {
            aObj.validate("067016118");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8262_bad() {
        // Validate 
        try {
            aObj.validate("067016»18");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8263_good() {
        // Validate 
        try {
            aObj.validate("067016192");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8264_bad() {
        // Validate 
        try {
            aObj.validate("067	16192");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8265_good() {
        // Validate 
        try {
            aObj.validate("067016231");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8266_bad() {
        // Validate 
        try {
            aObj.validate("06016231");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8267_good() {
        // Validate 
        try {
            aObj.validate("067016244");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8268_bad() {
        // Validate 
        try {
            aObj.validate("0670*6244");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8269_good() {
        // Validate 
        try {
            aObj.validate("067016257");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8270_bad() {
        // Validate 
        try {
            aObj.validate("0670Ë6257");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8271_good() {
        // Validate 
        try {
            aObj.validate("067016312");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8272_bad() {
        // Validate 
        try {
            aObj.validate("0X7016312");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8273_good() {
        // Validate 
        try {
            aObj.validate("067016325");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8274_bad() {
        // Validate 
        try {
            aObj.validate("06701632T");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8275_good() {
        // Validate 
        try {
            aObj.validate("067016341");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8276_bad() {
        // Validate 
        try {
            aObj.validate("067016331");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8277_good() {
        // Validate 
        try {
            aObj.validate("067016354");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8278_bad() {
        // Validate 
        try {
            aObj.validate("0670T6354");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8279_good() {
        // Validate 
        try {
            aObj.validate("067016367");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8280_bad() {
        // Validate 
        try {
            aObj.validate("0t7016367");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8281_good() {
        // Validate 
        try {
            aObj.validate("067016383");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8282_bad() {
        // Validate 
        try {
            aObj.validate("067016Q83");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8283_good() {
        // Validate 
        try {
            aObj.validate("067016396");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8284_bad() {
        // Validate 
        try {
            aObj.validate("067016m96");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8285_good() {
        // Validate 
        try {
            aObj.validate("067016448");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8286_bad() {
        // Validate 
        try {
            aObj.validate("06)016448");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8287_good() {
        // Validate 
        try {
            aObj.validate("067016558");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8288_bad() {
        // Validate 
        try {
            aObj.validate("06701§558");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8289_good() {
        // Validate 
        try {
            aObj.validate("067016574");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8290_bad() {
        // Validate 
        try {
            aObj.validate("06701657t");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8291_good() {
        // Validate 
        try {
            aObj.validate("067016590");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8292_bad() {
        // Validate 
        try {
            aObj.validate("07016590");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8293_good() {
        // Validate 
        try {
            aObj.validate("067016655");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8294_bad() {
        // Validate 
        try {
            aObj.validate("0670166p5");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8295_good() {
        // Validate 
        try {
            aObj.validate("067091719");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8296_bad() {
        // Validate 
        try {
            aObj.validate("06701719");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8297_good() {
        // Validate 
        try {
            aObj.validate("067091764");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8298_bad() {
        // Validate 
        try {
            aObj.validate("06709176");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8299_good() {
        // Validate 
        try {
            aObj.validate("067091780");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8300_bad() {
        // Validate 
        try {
            aObj.validate("06709¾780");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8301_good() {
        // Validate 
        try {
            aObj.validate("067091942");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8302_bad() {
        // Validate 
        try {
            aObj.validate("0670Ø1942");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8303_good() {
        // Validate 
        try {
            aObj.validate("067092022");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8304_bad() {
        // Validate 
        try {
            aObj.validate("06092022");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8305_good() {
        // Validate 
        try {
            aObj.validate("067092035");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8306_bad() {
        // Validate 
        try {
            aObj.validate("06709203");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8307_good() {
        // Validate 
        try {
            aObj.validate("067092064");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8308_bad() {
        // Validate 
        try {
            aObj.validate("0O7092064");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8309_good() {
        // Validate 
        try {
            aObj.validate("067092200");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8310_bad() {
        // Validate 
        try {
            aObj.validate("0670922N0");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8311_good() {
        // Validate 
        try {
            aObj.validate("067092310");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8312_bad() {
        // Validate 
        try {
            aObj.validate("0W7092310");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8313_good() {
        // Validate 
        try {
            aObj.validate("067092501");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8314_bad() {
        // Validate 
        try {
            aObj.validate("067092(01");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8315_good() {
        // Validate 
        try {
            aObj.validate("067092556");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8316_bad() {
        // Validate 
        try {
            aObj.validate("0670925f6");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8317_good() {
        // Validate 
        try {
            aObj.validate("067092640");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8318_bad() {
        // Validate 
        try {
            aObj.validate("067092¶40");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8319_good() {
        // Validate 
        try {
            aObj.validate("067092679");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8320_bad() {
        // Validate 
        try {
            aObj.validate("06709267 ");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8321_good() {
        // Validate 
        try {
            aObj.validate("067092886");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8322_bad() {
        // Validate 
        try {
            aObj.validate("06792886");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8323_good() {
        // Validate 
        try {
            aObj.validate("067092912");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8324_bad() {
        // Validate 
        try {
            aObj.validate("0670c2912");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8325_good() {
        // Validate 
        try {
            aObj.validate("067092967");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8326_bad() {
        // Validate 
        try {
            aObj.validate("0ß7092967");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8327_good() {
        // Validate 
        try {
            aObj.validate("071000013");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8328_bad() {
        // Validate 
        try {
            aObj.validate("071000Ê13");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8329_good() {
        // Validate 
        try {
            aObj.validate("071000039");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8330_bad() {
        // Validate 
        try {
            aObj.validate("071@00039");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8331_good() {
        // Validate 
        try {
            aObj.validate("071000152");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8332_bad() {
        // Validate 
        try {
            aObj.validate("07000152");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8333_good() {
        // Validate 
        try {
            aObj.validate("071000288");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8334_bad() {
        // Validate 
        try {
            aObj.validate("0z1000288");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8335_good() {
        // Validate 
        try {
            aObj.validate("071000301");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8336_bad() {
        // Validate 
        try {
            aObj.validate("071ª00301");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8337_good() {
        // Validate 
        try {
            aObj.validate("071000343");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8338_bad() {
        // Validate 
        try {
            aObj.validate("071007343");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8339_good() {
        // Validate 
        try {
            aObj.validate("071000505");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8340_bad() {
        // Validate 
        try {
            aObj.validate("071-00505");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8341_good() {
        // Validate 
        try {
            aObj.validate("071000521");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8342_bad() {
        // Validate 
        try {
            aObj.validate("0q1000521");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8343_good() {
        // Validate 
        try {
            aObj.validate("071000806");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8344_bad() {
        // Validate 
        try {
            aObj.validate("07100Ñ806");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8345_good() {
        // Validate 
        try {
            aObj.validate("071001041");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8346_bad() {
        // Validate 
        try {
            aObj.validate("071001045");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8347_good() {
        // Validate 
        try {
            aObj.validate("071001122");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8348_bad() {
        // Validate 
        try {
            aObj.validate("07100112");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8349_good() {
        // Validate 
        try {
            aObj.validate("071001180");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8350_bad() {
        // Validate 
        try {
            aObj.validate("07100118°");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8351_good() {
        // Validate 
        try {
            aObj.validate("071001216");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8352_bad() {
        // Validate 
        try {
            aObj.validate("0%1001216");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8353_good() {
        // Validate 
        try {
            aObj.validate("071001232");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8354_bad() {
        // Validate 
        try {
            aObj.validate("07Û001232");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8355_good() {
        // Validate 
        try {
            aObj.validate("071001261");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8356_bad() {
        // Validate 
        try {
            aObj.validate("0710_1261");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8357_good() {
        // Validate 
        try {
            aObj.validate("071001274");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8358_bad() {
        // Validate 
        try {
            aObj.validate("0710012°4");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8359_good() {
        // Validate 
        try {
            aObj.validate("071001368");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8360_bad() {
        // Validate 
        try {
            aObj.validate("071§01368");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8361_good() {
        // Validate 
        try {
            aObj.validate("071001449");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8362_bad() {
        // Validate 
        try {
            aObj.validate("07101449");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8363_good() {
        // Validate 
        try {
            aObj.validate("071001465");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8364_bad() {
        // Validate 
        try {
            aObj.validate("07100465");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8365_good() {
        // Validate 
        try {
            aObj.validate("071001481");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8366_bad() {
        // Validate 
        try {
            aObj.validate("07100481");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8367_good() {
        // Validate 
        try {
            aObj.validate("071001504");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8368_bad() {
        // Validate 
        try {
            aObj.validate("0Å1001504");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8369_good() {
        // Validate 
        try {
            aObj.validate("071001533");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8370_bad() {
        // Validate 
        try {
            aObj.validate("0710?1533");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8371_good() {
        // Validate 
        try {
            aObj.validate("071001588");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8372_bad() {
        // Validate 
        try {
            aObj.validate("0710Ñ1588");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8373_good() {
        // Validate 
        try {
            aObj.validate("071001630");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8374_bad() {
        // Validate 
        try {
            aObj.validate("07101630");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8375_good() {
        // Validate 
        try {
            aObj.validate("071001685");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8376_bad() {
        // Validate 
        try {
            aObj.validate("07m001685");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8377_good() {
        // Validate 
        try {
            aObj.validate("071001737");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8378_bad() {
        // Validate 
        try {
            aObj.validate("07101737");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8379_good() {
        // Validate 
        try {
            aObj.validate("071002024");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8380_bad() {
        // Validate 
        try {
            aObj.validate("0710020=4");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8381_good() {
        // Validate 
        try {
            aObj.validate("071002040");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8382_bad() {
        // Validate 
        try {
            aObj.validate("0710Ã2040");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8383_good() {
        // Validate 
        try {
            aObj.validate("071002053");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8384_bad() {
        // Validate 
        try {
            aObj.validate("07y002053");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8385_good() {
        // Validate 
        try {
            aObj.validate("071002095");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8386_bad() {
        // Validate 
        try {
            aObj.validate("061002095");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8387_good() {
        // Validate 
        try {
            aObj.validate("071002134");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8388_bad() {
        // Validate 
        try {
            aObj.validate("07#002134");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8389_good() {
        // Validate 
        try {
            aObj.validate("071002147");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8390_bad() {
        // Validate 
        try {
            aObj.validate("0g1002147");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8391_good() {
        // Validate 
        try {
            aObj.validate("071002150");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8392_bad() {
        // Validate 
        try {
            aObj.validate("071»02150");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8393_good() {
        // Validate 
        try {
            aObj.validate("071002257");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8394_bad() {
        // Validate 
        try {
            aObj.validate("01002257");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8395_good() {
        // Validate 
        try {
            aObj.validate("071002286");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8396_bad() {
        // Validate 
        try {
            aObj.validate("07100228Ë");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8397_good() {
        // Validate 
        try {
            aObj.validate("071002341");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8398_bad() {
        // Validate 
        try {
            aObj.validate("07102341");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8399_good() {
        // Validate 
        try {
            aObj.validate("071002419");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8400_bad() {
        // Validate 
        try {
            aObj.validate("0710024W9");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8401_good() {
        // Validate 
        try {
            aObj.validate("071002422");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8402_bad() {
        // Validate 
        try {
            aObj.validate("071002421");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8403_good() {
        // Validate 
        try {
            aObj.validate("071002503");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8404_bad() {
        // Validate 
        try {
            aObj.validate("07t002503");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8405_good() {
        // Validate 
        try {
            aObj.validate("071002707");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8406_bad() {
        // Validate 
        try {
            aObj.validate("0710K2707");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8407_good() {
        // Validate 
        try {
            aObj.validate("071002914");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8408_bad() {
        // Validate 
        try {
            aObj.validate("07100291­");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8409_good() {
        // Validate 
        try {
            aObj.validate("071002943");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8410_bad() {
        // Validate 
        try {
            aObj.validate("071002Ò43");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8411_good() {
        // Validate 
        try {
            aObj.validate("071003007");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8412_bad() {
        // Validate 
        try {
            aObj.validate("0710t3007");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8413_good() {
        // Validate 
        try {
            aObj.validate("071003405");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8414_bad() {
        // Validate 
        try {
            aObj.validate("071t03405");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8415_good() {
        // Validate 
        try {
            aObj.validate("071004022");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8416_bad() {
        // Validate 
        try {
            aObj.validate("07100022");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8417_good() {
        // Validate 
        try {
            aObj.validate("071004158");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8418_bad() {
        // Validate 
        try {
            aObj.validate("07100415n");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8419_good() {
        // Validate 
        try {
            aObj.validate("071004161");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8420_bad() {
        // Validate 
        try {
            aObj.validate("071004?61");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8421_good() {
        // Validate 
        try {
            aObj.validate("071004200");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8422_bad() {
        // Validate 
        try {
            aObj.validate("0710É4200");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8423_good() {
        // Validate 
        try {
            aObj.validate("071004226");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8424_bad() {
        // Validate 
        try {
            aObj.validate("0710042Å6");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8425_good() {
        // Validate 
        try {
            aObj.validate("071004239");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8426_bad() {
        // Validate 
        try {
            aObj.validate("0v1004239");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8427_good() {
        // Validate 
        try {
            aObj.validate("071004271");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8428_bad() {
        // Validate 
        try {
            aObj.validate("07100Ô271");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8429_good() {
        // Validate 
        try {
            aObj.validate("071004284");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8430_bad() {
        // Validate 
        try {
            aObj.validate("07104284");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8431_good() {
        // Validate 
        try {
            aObj.validate("071004349");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8432_bad() {
        // Validate 
        try {
            aObj.validate("07100434");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8433_good() {
        // Validate 
        try {
            aObj.validate("071004365");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8434_bad() {
        // Validate 
        try {
            aObj.validate("07100436ß");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8435_good() {
        // Validate 
        try {
            aObj.validate("071004378");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8436_bad() {
        // Validate 
        try {
            aObj.validate("0Þ1004378");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8437_good() {
        // Validate 
        try {
            aObj.validate("071004381");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8438_bad() {
        // Validate 
        try {
            aObj.validate("071s04381");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8439_good() {
        // Validate 
        try {
            aObj.validate("071004420");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8440_bad() {
        // Validate 
        try {
            aObj.validate("07100442}");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8441_good() {
        // Validate 
        try {
            aObj.validate("071004433");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8442_bad() {
        // Validate 
        try {
            aObj.validate("07100½433");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8443_good() {
        // Validate 
        try {
            aObj.validate("071004446");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8444_bad() {
        // Validate 
        try {
            aObj.validate("07100444");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8445_good() {
        // Validate 
        try {
            aObj.validate("071004501");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8446_bad() {
        // Validate 
        try {
            aObj.validate("071t04501");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8447_good() {
        // Validate 
        try {
            aObj.validate("071004527");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8448_bad() {
        // Validate 
        try {
            aObj.validate("07o004527");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8449_good() {
        // Validate 
        try {
            aObj.validate("071004530");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8450_bad() {
        // Validate 
        try {
            aObj.validate("0710045	0");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8451_good() {
        // Validate 
        try {
            aObj.validate("071004543");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8452_bad() {
        // Validate 
        try {
            aObj.validate("07100¦543");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8453_good() {
        // Validate 
        try {
            aObj.validate("071005160");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8454_bad() {
        // Validate 
        try {
            aObj.validate("07100×160");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8455_good() {
        // Validate 
        try {
            aObj.validate("071005254");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8456_bad() {
        // Validate 
        try {
            aObj.validate("07100525");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8457_good() {
        // Validate 
        try {
            aObj.validate("071005979");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8458_bad() {
        // Validate 
        try {
            aObj.validate("07100979");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8459_good() {
        // Validate 
        try {
            aObj.validate("071006282");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8460_bad() {
        // Validate 
        try {
            aObj.validate("071006>82");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8461_good() {
        // Validate 
        try {
            aObj.validate("071006486");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8462_bad() {
        // Validate 
        try {
            aObj.validate("07006486");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8463_good() {
        // Validate 
        try {
            aObj.validate("071006651");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8464_bad() {
        // Validate 
        try {
            aObj.validate("07106651");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8465_good() {
        // Validate 
        try {
            aObj.validate("071006774");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8466_bad() {
        // Validate 
        try {
            aObj.validate("07106774");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8467_good() {
        // Validate 
        try {
            aObj.validate("071006868");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8468_bad() {
        // Validate 
        try {
            aObj.validate("075006868");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8469_good() {
        // Validate 
        try {
            aObj.validate("071025629");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8470_bad() {
        // Validate 
        try {
            aObj.validate("0J1025629");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8471_good() {
        // Validate 
        try {
            aObj.validate("071025645");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8472_bad() {
        // Validate 
        try {
            aObj.validate("01025645");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8473_good() {
        // Validate 
        try {
            aObj.validate("071025661");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8474_bad() {
        // Validate 
        try {
            aObj.validate("071055661");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8475_good() {
        // Validate 
        try {
            aObj.validate("071025771");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8476_bad() {
        // Validate 
        try {
            aObj.validate("071w25771");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8477_good() {
        // Validate 
        try {
            aObj.validate("071025797");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8478_bad() {
        // Validate 
        try {
            aObj.validate("07102577");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8479_good() {
        // Validate 
        try {
            aObj.validate("071025849");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8480_bad() {
        // Validate 
        try {
            aObj.validate("0-1025849");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8481_good() {
        // Validate 
        try {
            aObj.validate("071026123");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8482_bad() {
        // Validate 
        try {
            aObj.validate("07026123");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8483_good() {
        // Validate 
        try {
            aObj.validate("071026356");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8484_bad() {
        // Validate 
        try {
            aObj.validate("07c026356");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8485_good() {
        // Validate 
        try {
            aObj.validate("071026385");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8486_bad() {
        // Validate 
        try {
            aObj.validate("0710263H5");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8487_good() {
        // Validate 
        try {
            aObj.validate("071026408");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8488_bad() {
        // Validate 
        try {
            aObj.validate("0710264U8");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8489_good() {
        // Validate 
        try {
            aObj.validate("071026495");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8490_bad() {
        // Validate 
        try {
            aObj.validate("07102y495");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8491_good() {
        // Validate 
        try {
            aObj.validate("071026576");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8492_bad() {
        // Validate 
        try {
            aObj.validate("0,1026576");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8493_good() {
        // Validate 
        try {
            aObj.validate("071026628");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8494_bad() {
        // Validate 
        try {
            aObj.validate("0710@6628");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8495_good() {
        // Validate 
        try {
            aObj.validate("071026686");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8496_bad() {
        // Validate 
        try {
            aObj.validate("07026686");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8497_good() {
        // Validate 
        try {
            aObj.validate("071026835");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8498_bad() {
        // Validate 
        try {
            aObj.validate("07106835");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8499_good() {
        // Validate 
        try {
            aObj.validate("071026848");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8500_bad() {
        // Validate 
        try {
            aObj.validate("0710268g8");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8501_good() {
        // Validate 
        try {
            aObj.validate("071027106");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8502_bad() {
        // Validate 
        try {
            aObj.validate("07102710¬");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8503_good() {
        // Validate 
        try {
            aObj.validate("071050432");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8504_bad() {
        // Validate 
        try {
            aObj.validate("07105042");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8505_good() {
        // Validate 
        try {
            aObj.validate("071074528");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8506_bad() {
        // Validate 
        try {
            aObj.validate("071n74528");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8507_good() {
        // Validate 
        try {
            aObj.validate("071093130");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8508_bad() {
        // Validate 
        try {
            aObj.validate("071093131");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8509_good() {
        // Validate 
        try {
            aObj.validate("071093295");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8510_bad() {
        // Validate 
        try {
            aObj.validate("0Å1093295");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8511_good() {
        // Validate 
        try {
            aObj.validate("071093305");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8512_bad() {
        // Validate 
        try {
            aObj.validate("07103305");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8513_good() {
        // Validate 
        try {
            aObj.validate("071100010");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8514_bad() {
        // Validate 
        try {
            aObj.validate("07110010");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8515_good() {
        // Validate 
        try {
            aObj.validate("071100049");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8516_bad() {
        // Validate 
        try {
            aObj.validate("07110Ô049");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8517_good() {
        // Validate 
        try {
            aObj.validate("071100117");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8518_bad() {
        // Validate 
        try {
            aObj.validate("07110011");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8519_good() {
        // Validate 
        try {
            aObj.validate("071100269");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8520_bad() {
        // Validate 
        try {
            aObj.validate("07%100269");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8521_good() {
        // Validate 
        try {
            aObj.validate("071100324");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8522_bad() {
        // Validate 
        try {
            aObj.validate("0!1100324");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8523_good() {
        // Validate 
        try {
            aObj.validate("071100706");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8524_bad() {
        // Validate 
        try {
            aObj.validate("07110¸706");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8525_good() {
        // Validate 
        try {
            aObj.validate("071100719");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8526_bad() {
        // Validate 
        try {
            aObj.validate("0j1100719");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8527_good() {
        // Validate 
        try {
            aObj.validate("071100858");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8528_bad() {
        // Validate 
        try {
            aObj.validate("0711f0858");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8529_good() {
        // Validate 
        try {
            aObj.validate("071101022");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8530_bad() {
        // Validate 
        try {
            aObj.validate("0711«1022");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8531_good() {
        // Validate 
        try {
            aObj.validate("071101174");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8532_bad() {
        // Validate 
        try {
            aObj.validate("07110C174");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8533_good() {
        // Validate 
        try {
            aObj.validate("071101307");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8534_bad() {
        // Validate 
        try {
            aObj.validate("071101¥07");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8535_good() {
        // Validate 
        try {
            aObj.validate("071101310");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8536_bad() {
        // Validate 
        try {
            aObj.validate("0=1101310");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8537_good() {
        // Validate 
        try {
            aObj.validate("071101967");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8538_bad() {
        // Validate 
        try {
            aObj.validate("07110967");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8539_good() {
        // Validate 
        try {
            aObj.validate("071101996");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8540_bad() {
        // Validate 
        try {
            aObj.validate("0711019R6");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8541_good() {
        // Validate 
        try {
            aObj.validate("071102076");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8542_bad() {
        // Validate 
        try {
            aObj.validate("07110207³");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8543_good() {
        // Validate 
        try {
            aObj.validate("071102173");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8544_bad() {
        // Validate 
        try {
            aObj.validate("07$102173");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8545_good() {
        // Validate 
        try {
            aObj.validate("071102199");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8546_bad() {
        // Validate 
        try {
            aObj.validate("0711021'9");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8547_good() {
        // Validate 
        try {
            aObj.validate("071102238");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8548_bad() {
        // Validate 
        try {
            aObj.validate("071c02238");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8549_good() {
        // Validate 
        try {
            aObj.validate("071102322");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8550_bad() {
        // Validate 
        try {
            aObj.validate("07110Ê322");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8551_good() {
        // Validate 
        try {
            aObj.validate("071102487");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8552_bad() {
        // Validate 
        try {
            aObj.validate("07110®487");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8553_good() {
        // Validate 
        try {
            aObj.validate("071102500");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8554_bad() {
        // Validate 
        try {
            aObj.validate("071102@00");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8555_good() {
        // Validate 
        try {
            aObj.validate("071102568");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8556_bad() {
        // Validate 
        try {
            aObj.validate("0711Z2568");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8557_good() {
        // Validate 
        try {
            aObj.validate("071102827");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8558_bad() {
        // Validate 
        try {
            aObj.validate("071a02827");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8559_good() {
        // Validate 
        try {
            aObj.validate("071102830");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8560_bad() {
        // Validate 
        try {
            aObj.validate("0711<2830");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8561_good() {
        // Validate 
        try {
            aObj.validate("071102995");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8562_bad() {
        // Validate 
        try {
            aObj.validate("07;102995");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8563_good() {
        // Validate 
        try {
            aObj.validate("071103376");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8564_bad() {
        // Validate 
        try {
            aObj.validate("07110_376");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8565_good() {
        // Validate 
        try {
            aObj.validate("071103389");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8566_bad() {
        // Validate 
        try {
            aObj.validate("07113389");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8567_good() {
        // Validate 
        try {
            aObj.validate("071103473");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8568_bad() {
        // Validate 
        try {
            aObj.validate("0711034¶3");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8569_good() {
        // Validate 
        try {
            aObj.validate("071103509");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8570_bad() {
        // Validate 
        try {
            aObj.validate("07²103509");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8571_good() {
        // Validate 
        try {
            aObj.validate("071103619");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8572_bad() {
        // Validate 
        try {
            aObj.validate("071ª03619");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8573_good() {
        // Validate 
        try {
            aObj.validate("071103635");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8574_bad() {
        // Validate 
        try {
            aObj.validate("07110635");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8575_good() {
        // Validate 
        try {
            aObj.validate("071103949");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8576_bad() {
        // Validate 
        try {
            aObj.validate("07103949");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8577_good() {
        // Validate 
        try {
            aObj.validate("071103952");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8578_bad() {
        // Validate 
        try {
            aObj.validate("071183952");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8579_good() {
        // Validate 
        try {
            aObj.validate("071104427");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8580_bad() {
        // Validate 
        try {
            aObj.validate("071104426");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8581_good() {
        // Validate 
        try {
            aObj.validate("071104430");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8582_bad() {
        // Validate 
        try {
            aObj.validate("07110t430");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8583_good() {
        // Validate 
        try {
            aObj.validate("071104647");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8584_bad() {
        // Validate 
        try {
            aObj.validate("0711-4647");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8585_good() {
        // Validate 
        try {
            aObj.validate("071104692");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8586_bad() {
        // Validate 
        try {
            aObj.validate("07104692");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8587_good() {
        // Validate 
        try {
            aObj.validate("071104715");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8588_bad() {
        // Validate 
        try {
            aObj.validate("071104¿15");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8589_good() {
        // Validate 
        try {
            aObj.validate("071104731");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8590_bad() {
        // Validate 
        try {
            aObj.validate("071Ã04731");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8591_good() {
        // Validate 
        try {
            aObj.validate("071105002");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8592_bad() {
        // Validate 
        try {
            aObj.validate("071105©02");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8593_good() {
        // Validate 
        try {
            aObj.validate("071105154");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8594_bad() {
        // Validate 
        try {
            aObj.validate("0711051+4");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8595_good() {
        // Validate 
        try {
            aObj.validate("071105471");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8596_bad() {
        // Validate 
        try {
            aObj.validate("07110547z");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8597_good() {
        // Validate 
        try {
            aObj.validate("071105507");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8598_bad() {
        // Validate 
        try {
            aObj.validate("07110507");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8599_good() {
        // Validate 
        try {
            aObj.validate("071105536");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8600_bad() {
        // Validate 
        try {
            aObj.validate("01105536");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8601_good() {
        // Validate 
        try {
            aObj.validate("071105581");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8602_bad() {
        // Validate 
        try {
            aObj.validate("07]105581");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8603_good() {
        // Validate 
        try {
            aObj.validate("071105756");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8604_bad() {
        // Validate 
        try {
            aObj.validate("07110575");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8605_good() {
        // Validate 
        try {
            aObj.validate("071105798");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8606_bad() {
        // Validate 
        try {
            aObj.validate("07110579");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8607_good() {
        // Validate 
        try {
            aObj.validate("071105866");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8608_bad() {
        // Validate 
        try {
            aObj.validate("0711k5866");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8609_good() {
        // Validate 
        try {
            aObj.validate("071105882");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8610_bad() {
        // Validate 
        try {
            aObj.validate("0711g5882");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8611_good() {
        // Validate 
        try {
            aObj.validate("071106030");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8612_bad() {
        // Validate 
        try {
            aObj.validate("01106030");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8613_good() {
        // Validate 
        try {
            aObj.validate("071106043");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8614_bad() {
        // Validate 
        try {
            aObj.validate("07110j043");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8615_good() {
        // Validate 
        try {
            aObj.validate("071106069");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8616_bad() {
        // Validate 
        try {
            aObj.validate("07110606¯");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8617_good() {
        // Validate 
        try {
            aObj.validate("071106195");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8618_bad() {
        // Validate 
        try {
            aObj.validate("07110695");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8619_good() {
        // Validate 
        try {
            aObj.validate("071106205");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8620_bad() {
        // Validate 
        try {
            aObj.validate("07o106205");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8621_good() {
        // Validate 
        try {
            aObj.validate("071106218");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8622_bad() {
        // Validate 
        try {
            aObj.validate("07110628");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8623_good() {
        // Validate 
        try {
            aObj.validate("071106250");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8624_bad() {
        // Validate 
        try {
            aObj.validate("07106250");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8625_good() {
        // Validate 
        try {
            aObj.validate("071106344");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8626_bad() {
        // Validate 
        try {
            aObj.validate("01106344");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8627_good() {
        // Validate 
        try {
            aObj.validate("071106593");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8628_bad() {
        // Validate 
        try {
            aObj.validate("07110Æ593");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8629_good() {
        // Validate 
        try {
            aObj.validate("071106687");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8630_bad() {
        // Validate 
        try {
            aObj.validate("07110J687");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8631_good() {
        // Validate 
        try {
            aObj.validate("071107123");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8632_bad() {
        // Validate 
        try {
            aObj.validate("0711m7123");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8633_good() {
        // Validate 
        try {
            aObj.validate("071107220");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8634_bad() {
        // Validate 
        try {
            aObj.validate("071d07220");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8635_good() {
        // Validate 
        try {
            aObj.validate("071107233");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8636_bad() {
        // Validate 
        try {
            aObj.validate("07107233");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8637_good() {
        // Validate 
        try {
            aObj.validate("071107259");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8638_bad() {
        // Validate 
        try {
            aObj.validate("0T1107259");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8639_good() {
        // Validate 
        try {
            aObj.validate("071107262");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8640_bad() {
        // Validate 
        try {
            aObj.validate("07&107262");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8641_good() {
        // Validate 
        try {
            aObj.validate("071107356");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8642_bad() {
        // Validate 
        try {
            aObj.validate("071³07356");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8643_good() {
        // Validate 
        try {
            aObj.validate("071107424");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8644_bad() {
        // Validate 
        try {
            aObj.validate("07117424");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8645_good() {
        // Validate 
        try {
            aObj.validate("071107453");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8646_bad() {
        // Validate 
        try {
            aObj.validate("07|107453");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8647_good() {
        // Validate 
        try {
            aObj.validate("071107563");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8648_bad() {
        // Validate 
        try {
            aObj.validate("0©1107563");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8649_good() {
        // Validate 
        try {
            aObj.validate("071107699");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8650_bad() {
        // Validate 
        try {
            aObj.validate("01107699");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8651_good() {
        // Validate 
        try {
            aObj.validate("071107783");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8652_bad() {
        // Validate 
        try {
            aObj.validate("07110783");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8653_good() {
        // Validate 
        try {
            aObj.validate("071107806");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8654_bad() {
        // Validate 
        try {
            aObj.validate("0711078)6");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8655_good() {
        // Validate 
        try {
            aObj.validate("071107987");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8656_bad() {
        // Validate 
        try {
            aObj.validate("071107>87");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8657_good() {
        // Validate 
        try {
            aObj.validate("071108038");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8658_bad() {
        // Validate 
        try {
            aObj.validate("07110Q038");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8659_good() {
        // Validate 
        try {
            aObj.validate("071108041");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8660_bad() {
        // Validate 
        try {
            aObj.validate("07108041");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8661_good() {
        // Validate 
        try {
            aObj.validate("071108083");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8662_bad() {
        // Validate 
        try {
            aObj.validate("01108083");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8663_good() {
        // Validate 
        try {
            aObj.validate("071108096");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8664_bad() {
        // Validate 
        try {
            aObj.validate("0711Y8096");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8665_good() {
        // Validate 
        try {
            aObj.validate("071108106");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8666_bad() {
        // Validate 
        try {
            aObj.validate("07108106");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8667_good() {
        // Validate 
        try {
            aObj.validate("071108193");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8668_bad() {
        // Validate 
        try {
            aObj.validate("0@1108193");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8669_good() {
        // Validate 
        try {
            aObj.validate("071108290");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8670_bad() {
        // Validate 
        try {
            aObj.validate("071!08290");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8671_good() {
        // Validate 
        try {
            aObj.validate("071108300");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8672_bad() {
        // Validate 
        try {
            aObj.validate("071108H00");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8673_good() {
        // Validate 
        try {
            aObj.validate("071108313");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8674_bad() {
        // Validate 
        try {
            aObj.validate("07110§313");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8675_good() {
        // Validate 
        try {
            aObj.validate("071108326");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8676_bad() {
        // Validate 
        try {
            aObj.validate("0711t8326");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8677_good() {
        // Validate 
        try {
            aObj.validate("071108355");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8678_bad() {
        // Validate 
        try {
            aObj.validate("071108Ç55");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8679_good() {
        // Validate 
        try {
            aObj.validate("071108407");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8680_bad() {
        // Validate 
        try {
            aObj.validate("07110P407");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8681_good() {
        // Validate 
        try {
            aObj.validate("071108423");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8682_bad() {
        // Validate 
        try {
            aObj.validate("07I108423");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8683_good() {
        // Validate 
        try {
            aObj.validate("071108449");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8684_bad() {
        // Validate 
        try {
            aObj.validate("0711j8449");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8685_good() {
        // Validate 
        try {
            aObj.validate("071108452");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8686_bad() {
        // Validate 
        try {
            aObj.validate("0711084r2");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8687_good() {
        // Validate 
        try {
            aObj.validate("071108559");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8688_bad() {
        // Validate 
        try {
            aObj.validate("07110C559");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8689_good() {
        // Validate 
        try {
            aObj.validate("071108630");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8690_bad() {
        // Validate 
        try {
            aObj.validate("07110863");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8691_good() {
        // Validate 
        try {
            aObj.validate("071108643");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8692_bad() {
        // Validate 
        try {
            aObj.validate("07110864");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8693_good() {
        // Validate 
        try {
            aObj.validate("071108669");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8694_bad() {
        // Validate 
        try {
            aObj.validate("071108É69");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8695_good() {
        // Validate 
        try {
            aObj.validate("071108698");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8696_bad() {
        // Validate 
        try {
            aObj.validate("07110?698");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8697_good() {
        // Validate 
        try {
            aObj.validate("071108740");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8698_bad() {
        // Validate 
        try {
            aObj.validate("0ß1108740");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8699_good() {
        // Validate 
        try {
            aObj.validate("071108766");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8700_bad() {
        // Validate 
        try {
            aObj.validate("07110§766");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8701_good() {
        // Validate 
        try {
            aObj.validate("071108782");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8702_bad() {
        // Validate 
        try {
            aObj.validate("07110782");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8703_good() {
        // Validate 
        try {
            aObj.validate("071108834");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8704_bad() {
        // Validate 
        try {
            aObj.validate("0711É8834");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8705_good() {
        // Validate 
        try {
            aObj.validate("071109037");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8706_bad() {
        // Validate 
        try {
            aObj.validate("07110907");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8707_good() {
        // Validate 
        try {
            aObj.validate("071109082");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8708_bad() {
        // Validate 
        try {
            aObj.validate("07110]082");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8709_good() {
        // Validate 
        try {
            aObj.validate("071109163");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8710_bad() {
        // Validate 
        try {
            aObj.validate("0711091Ö3");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8711_good() {
        // Validate 
        try {
            aObj.validate("071109189");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8712_bad() {
        // Validate 
        try {
            aObj.validate("0~1109189");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8713_good() {
        // Validate 
        try {
            aObj.validate("071109202");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8714_bad() {
        // Validate 
        try {
            aObj.validate("0711092Y2");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8715_good() {
        // Validate 
        try {
            aObj.validate("071109228");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8716_bad() {
        // Validate 
        try {
            aObj.validate("071109A28");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8717_good() {
        // Validate 
        try {
            aObj.validate("071109325");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8718_bad() {
        // Validate 
        try {
            aObj.validate("07q109325");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8719_good() {
        // Validate 
        try {
            aObj.validate("071109338");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8720_bad() {
        // Validate 
        try {
            aObj.validate("071109³38");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8721_good() {
        // Validate 
        try {
            aObj.validate("071109406");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8722_bad() {
        // Validate 
        try {
            aObj.validate("0711094Z6");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8723_good() {
        // Validate 
        try {
            aObj.validate("071109435");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8724_bad() {
        // Validate 
        try {
            aObj.validate("01109435");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8725_good() {
        // Validate 
        try {
            aObj.validate("071109464");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8726_bad() {
        // Validate 
        try {
            aObj.validate("0711½9464");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8727_good() {
        // Validate 
        try {
            aObj.validate("071109558");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8728_bad() {
        // Validate 
        try {
            aObj.validate("07F109558");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8729_good() {
        // Validate 
        try {
            aObj.validate("071109655");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8730_bad() {
        // Validate 
        try {
            aObj.validate("07110965º");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8731_good() {
        // Validate 
        try {
            aObj.validate("071109684");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8732_bad() {
        // Validate 
        try {
            aObj.validate("0711096Û4");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8733_good() {
        // Validate 
        try {
            aObj.validate("071109707");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8734_bad() {
        // Validate 
        try {
            aObj.validate("07110È707");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8735_good() {
        // Validate 
        try {
            aObj.validate("071109752");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8736_bad() {
        // Validate 
        try {
            aObj.validate("071}09752");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8737_good() {
        // Validate 
        try {
            aObj.validate("071109820");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8738_bad() {
        // Validate 
        try {
            aObj.validate("0711X9820");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8739_good() {
        // Validate 
        try {
            aObj.validate("071109846");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8740_bad() {
        // Validate 
        try {
            aObj.validate("07110984H");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8741_good() {
        // Validate 
        try {
            aObj.validate("071109891");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8742_bad() {
        // Validate 
        try {
            aObj.validate("07110)891");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8743_good() {
        // Validate 
        try {
            aObj.validate("071110000");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8744_bad() {
        // Validate 
        try {
            aObj.validate("0711e0000");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8745_good() {
        // Validate 
        try {
            aObj.validate("071110042");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8746_bad() {
        // Validate 
        try {
            aObj.validate("01110042");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8747_good() {
        // Validate 
        try {
            aObj.validate("071110107");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8748_bad() {
        // Validate 
        try {
            aObj.validate("07111007");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8749_good() {
        // Validate 
        try {
            aObj.validate("071110149");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8750_bad() {
        // Validate 
        try {
            aObj.validate("071119149");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8751_good() {
        // Validate 
        try {
            aObj.validate("071110262");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8752_bad() {
        // Validate 
        try {
            aObj.validate("0711102¹2");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8753_good() {
        // Validate 
        try {
            aObj.validate("071110369");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8754_bad() {
        // Validate 
        try {
            aObj.validate("0711Ç0369");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8755_good() {
        // Validate 
        try {
            aObj.validate("071110424");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8756_bad() {
        // Validate 
        try {
            aObj.validate("0711l0424");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8757_good() {
        // Validate 
        try {
            aObj.validate("071110521");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8758_bad() {
        // Validate 
        try {
            aObj.validate("07110521");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8759_good() {
        // Validate 
        try {
            aObj.validate("071110550");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8760_bad() {
        // Validate 
        try {
            aObj.validate("07110550");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8761_good() {
        // Validate 
        try {
            aObj.validate("071110712");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8762_bad() {
        // Validate 
        try {
            aObj.validate("0@1110712");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8763_good() {
        // Validate 
        try {
            aObj.validate("071110819");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8764_bad() {
        // Validate 
        try {
            aObj.validate("07111081");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8765_good() {
        // Validate 
        try {
            aObj.validate("071110929");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8766_bad() {
        // Validate 
        try {
            aObj.validate("0711·0929");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8767_good() {
        // Validate 
        try {
            aObj.validate("071111313");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8768_bad() {
        // Validate 
        try {
            aObj.validate("07111Ø313");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8769_good() {
        // Validate 
        try {
            aObj.validate("071111339");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8770_bad() {
        // Validate 
        try {
            aObj.validate("07111ª339");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8771_good() {
        // Validate 
        try {
            aObj.validate("071111371");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8772_bad() {
        // Validate 
        try {
            aObj.validate("0711113$1");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8773_good() {
        // Validate 
        try {
            aObj.validate("071111397");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8774_bad() {
        // Validate 
        try {
            aObj.validate("0711113É7");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8775_good() {
        // Validate 
        try {
            aObj.validate("071111407");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8776_bad() {
        // Validate 
        try {
            aObj.validate("071111Ü07");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8777_good() {
        // Validate 
        try {
            aObj.validate("071111481");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8778_bad() {
        // Validate 
        try {
            aObj.validate("07111148¨");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8779_good() {
        // Validate 
        try {
            aObj.validate("071111863");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8780_bad() {
        // Validate 
        try {
            aObj.validate("0½1111863");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8781_good() {
        // Validate 
        try {
            aObj.validate("071111957");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8782_bad() {
        // Validate 
        try {
            aObj.validate("071S11957");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8783_good() {
        // Validate 
        try {
            aObj.validate("071111986");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8784_bad() {
        // Validate 
        try {
            aObj.validate("071Î11986");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8785_good() {
        // Validate 
        try {
            aObj.validate("071112037");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8786_bad() {
        // Validate 
        try {
            aObj.validate("0711120*7");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8787_good() {
        // Validate 
        try {
            aObj.validate("071112040");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8788_bad() {
        // Validate 
        try {
            aObj.validate("07111n040");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8789_good() {
        // Validate 
        try {
            aObj.validate("071112066");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8790_bad() {
        // Validate 
        try {
            aObj.validate("071a12066");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8791_good() {
        // Validate 
        try {
            aObj.validate("071112105");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8792_bad() {
        // Validate 
        try {
            aObj.validate("071L12105");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8793_good() {
        // Validate 
        try {
            aObj.validate("071112176");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8794_bad() {
        // Validate 
        try {
            aObj.validate("0/1112176");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8795_good() {
        // Validate 
        try {
            aObj.validate("071112202");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8796_bad() {
        // Validate 
        try {
            aObj.validate("0711122v2");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8797_good() {
        // Validate 
        try {
            aObj.validate("071112260");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8798_bad() {
        // Validate 
        try {
            aObj.validate("07112260");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8799_good() {
        // Validate 
        try {
            aObj.validate("071112354");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8800_bad() {
        // Validate 
        try {
            aObj.validate("07112354");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8801_good() {
        // Validate 
        try {
            aObj.validate("071112480");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8802_bad() {
        // Validate 
        try {
            aObj.validate("0¹1112480");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8803_good() {
        // Validate 
        try {
            aObj.validate("071112503");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8804_bad() {
        // Validate 
        try {
            aObj.validate("0711125B3");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8805_good() {
        // Validate 
        try {
            aObj.validate("071112561");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8806_bad() {
        // Validate 
        try {
            aObj.validate("071Æ12561");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8807_good() {
        // Validate 
        try {
            aObj.validate("071112668");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8808_bad() {
        // Validate 
        try {
            aObj.validate("0711K2668");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8809_good() {
        // Validate 
        try {
            aObj.validate("071112684");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8810_bad() {
        // Validate 
        try {
            aObj.validate("07111268S");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8811_good() {
        // Validate 
        try {
            aObj.validate("071112804");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8812_bad() {
        // Validate 
        try {
            aObj.validate("071112g04");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8813_good() {
        // Validate 
        try {
            aObj.validate("071112817");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8814_bad() {
        // Validate 
        try {
            aObj.validate("0711#2817");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8815_good() {
        // Validate 
        try {
            aObj.validate("071112901");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8816_bad() {
        // Validate 
        try {
            aObj.validate("071b12901");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8817_good() {
        // Validate 
        try {
            aObj.validate("071113049");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8818_bad() {
        // Validate 
        try {
            aObj.validate("07111´049");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8819_good() {
        // Validate 
        try {
            aObj.validate("071113162");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8820_bad() {
        // Validate 
        try {
            aObj.validate("0711n3162");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8821_good() {
        // Validate 
        try {
            aObj.validate("071113175");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8822_bad() {
        // Validate 
        try {
            aObj.validate("071113171");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8823_good() {
        // Validate 
        try {
            aObj.validate("071113188");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8824_bad() {
        // Validate 
        try {
            aObj.validate("071Ñ13188");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8825_good() {
        // Validate 
        try {
            aObj.validate("071113298");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8826_bad() {
        // Validate 
        try {
            aObj.validate("0711132Ã8");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8827_good() {
        // Validate 
        try {
            aObj.validate("071113434");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8828_bad() {
        // Validate 
        try {
            aObj.validate("07111F434");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8829_good() {
        // Validate 
        try {
            aObj.validate("071113476");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8830_bad() {
        // Validate 
        try {
            aObj.validate("07111=476");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8831_good() {
        // Validate 
        try {
            aObj.validate("071113528");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8832_bad() {
        // Validate 
        try {
            aObj.validate("07»113528");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8833_good() {
        // Validate 
        try {
            aObj.validate("071113719");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8834_bad() {
        // Validate 
        try {
            aObj.validate("0711137¿9");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8835_good() {
        // Validate 
        try {
            aObj.validate("071113748");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8836_bad() {
        // Validate 
        try {
            aObj.validate("0711137k8");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8837_good() {
        // Validate 
        try {
            aObj.validate("071113751");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8838_bad() {
        // Validate 
        try {
            aObj.validate("071¼13751");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8839_good() {
        // Validate 
        try {
            aObj.validate("071113793");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8840_bad() {
        // Validate 
        try {
            aObj.validate("0{1113793");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8841_good() {
        // Validate 
        try {
            aObj.validate("071113984");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8842_bad() {
        // Validate 
        try {
            aObj.validate("0711O3984");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8843_good() {
        // Validate 
        try {
            aObj.validate("071114080");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8844_bad() {
        // Validate 
        try {
            aObj.validate("07111408");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8845_good() {
        // Validate 
        try {
            aObj.validate("071114093");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8846_bad() {
        // Validate 
        try {
            aObj.validate("070114093");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8847_good() {
        // Validate 
        try {
            aObj.validate("071114255");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8848_bad() {
        // Validate 
        try {
            aObj.validate("07111455");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8849_good() {
        // Validate 
        try {
            aObj.validate("071114378");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8850_bad() {
        // Validate 
        try {
            aObj.validate("07111Ì378");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8851_good() {
        // Validate 
        try {
            aObj.validate("071114491");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8852_bad() {
        // Validate 
        try {
            aObj.validate("07111491");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8853_good() {
        // Validate 
        try {
            aObj.validate("071114763");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8854_bad() {
        // Validate 
        try {
            aObj.validate("071114\63");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8855_good() {
        // Validate 
        try {
            aObj.validate("071114938");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8856_bad() {
        // Validate 
        try {
            aObj.validate("07111493~");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8857_good() {
        // Validate 
        try {
            aObj.validate("071115018");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8858_bad() {
        // Validate 
        try {
            aObj.validate("0711H5018");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8859_good() {
        // Validate 
        try {
            aObj.validate("071115157");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8860_bad() {
        // Validate 
        try {
            aObj.validate("0¬1115157");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8861_good() {
        // Validate 
        try {
            aObj.validate("071115322");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8862_bad() {
        // Validate 
        try {
            aObj.validate("0Ô1115322");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8863_good() {
        // Validate 
        try {
            aObj.validate("071115416");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8864_bad() {
        // Validate 
        try {
            aObj.validate("07111416");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8865_good() {
        // Validate 
        try {
            aObj.validate("071115526");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8866_bad() {
        // Validate 
        try {
            aObj.validate("0711155\6");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8867_good() {
        // Validate 
        try {
            aObj.validate("071115665");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8868_bad() {
        // Validate 
        try {
            aObj.validate("07111565");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8869_good() {
        // Validate 
        try {
            aObj.validate("071115720");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8870_bad() {
        // Validate 
        try {
            aObj.validate("07111720");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8871_good() {
        // Validate 
        try {
            aObj.validate("071115801");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8872_bad() {
        // Validate 
        try {
            aObj.validate("07*115801");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8873_good() {
        // Validate 
        try {
            aObj.validate("071115953");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8874_bad() {
        // Validate 
        try {
            aObj.validate("0711`5953");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8875_good() {
        // Validate 
        try {
            aObj.validate("071115966");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8876_bad() {
        // Validate 
        try {
            aObj.validate("07115966");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8877_good() {
        // Validate 
        try {
            aObj.validate("071115995");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8878_bad() {
        // Validate 
        try {
            aObj.validate("0711´5995");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8879_good() {
        // Validate 
        try {
            aObj.validate("071116062");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8880_bad() {
        // Validate 
        try {
            aObj.validate("07116062");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8881_good() {
        // Validate 
        try {
            aObj.validate("071116224");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8882_bad() {
        // Validate 
        try {
            aObj.validate("0711162m4");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8883_good() {
        // Validate 
        try {
            aObj.validate("071116295");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8884_bad() {
        // Validate 
        try {
            aObj.validate("071116~95");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8885_good() {
        // Validate 
        try {
            aObj.validate("071116376");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8886_bad() {
        // Validate 
        try {
            aObj.validate("07111637#");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8887_good() {
        // Validate 
        try {
            aObj.validate("071116677");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8888_bad() {
        // Validate 
        try {
            aObj.validate("071116377");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8889_good() {
        // Validate 
        try {
            aObj.validate("071116813");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8890_bad() {
        // Validate 
        try {
            aObj.validate("07116813");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8891_good() {
        // Validate 
        try {
            aObj.validate("071117184");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8892_bad() {
        // Validate 
        try {
            aObj.validate("07111t184");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8893_good() {
        // Validate 
        try {
            aObj.validate("071117760");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8894_bad() {
        // Validate 
        try {
            aObj.validate("0711177}0");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8895_good() {
        // Validate 
        try {
            aObj.validate("071118170");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8896_bad() {
        // Validate 
        try {
            aObj.validate("0711181l0");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8897_good() {
        // Validate 
        try {
            aObj.validate("071118222");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8898_bad() {
        // Validate 
        try {
            aObj.validate("071K18222");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8899_good() {
        // Validate 
        try {
            aObj.validate("071118264");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8900_bad() {
        // Validate 
        try {
            aObj.validate("07±118264");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8901_good() {
        // Validate 
        try {
            aObj.validate("071118277");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8902_bad() {
        // Validate 
        try {
            aObj.validate("071118`77");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8903_good() {
        // Validate 
        try {
            aObj.validate("071118471");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8904_bad() {
        // Validate 
        try {
            aObj.validate("07118471");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8905_good() {
        // Validate 
        try {
            aObj.validate("071118659");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8906_bad() {
        // Validate 
        try {
            aObj.validate("07111869");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8907_good() {
        // Validate 
        try {
            aObj.validate("071118798");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8908_bad() {
        // Validate 
        try {
            aObj.validate("0711187R8");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8909_good() {
        // Validate 
        try {
            aObj.validate("071119195");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8910_bad() {
        // Validate 
        try {
            aObj.validate("01119195");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8911_good() {
        // Validate 
        try {
            aObj.validate("071119234");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8912_bad() {
        // Validate 
        try {
            aObj.validate("07111924");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8913_good() {
        // Validate 
        try {
            aObj.validate("071119289");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8914_bad() {
        // Validate 
        try {
            aObj.validate("0711Ü9289");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8915_good() {
        // Validate 
        try {
            aObj.validate("071119506");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8916_bad() {
        // Validate 
        try {
            aObj.validate("071z19506");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8917_good() {
        // Validate 
        try {
            aObj.validate("071119519");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8918_bad() {
        // Validate 
        try {
            aObj.validate("071119g19");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8919_good() {
        // Validate 
        try {
            aObj.validate("071119522");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8920_bad() {
        // Validate 
        try {
            aObj.validate("0711195E2");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8921_good() {
        // Validate 
        try {
            aObj.validate("071119807");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8922_bad() {
        // Validate 
        try {
            aObj.validate("07111980O");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8923_good() {
        // Validate 
        try {
            aObj.validate("071119865");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8924_bad() {
        // Validate 
        try {
            aObj.validate("071169865");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8925_good() {
        // Validate 
        try {
            aObj.validate("071119975");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8926_bad() {
        // Validate 
        try {
            aObj.validate("07119975");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8927_good() {
        // Validate 
        try {
            aObj.validate("071120207");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8928_bad() {
        // Validate 
        try {
            aObj.validate("0Ç1120207");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8929_good() {
        // Validate 
        try {
            aObj.validate("071120252");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8930_bad() {
        // Validate 
        try {
            aObj.validate("0711[0252");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8931_good() {
        // Validate 
        try {
            aObj.validate("071120320");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8932_bad() {
        // Validate 
        try {
            aObj.validate("071º20320");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8933_good() {
        // Validate 
        try {
            aObj.validate("071120647");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8934_bad() {
        // Validate 
        try {
            aObj.validate("01120647");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8935_good() {
        // Validate 
        try {
            aObj.validate("071121196");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8936_bad() {
        // Validate 
        try {
            aObj.validate("07112196");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8937_good() {
        // Validate 
        try {
            aObj.validate("071121471");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8938_bad() {
        // Validate 
        try {
            aObj.validate("07112141");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8939_good() {
        // Validate 
        try {
            aObj.validate("071121594");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8940_bad() {
        // Validate 
        try {
            aObj.validate("01121594");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8941_good() {
        // Validate 
        try {
            aObj.validate("071121604");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8942_bad() {
        // Validate 
        try {
            aObj.validate("0¦1121604");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8943_good() {
        // Validate 
        try {
            aObj.validate("071121620");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8944_bad() {
        // Validate 
        try {
            aObj.validate("071W21620");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8945_good() {
        // Validate 
        try {
            aObj.validate("071121727");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8946_bad() {
        // Validate 
        try {
            aObj.validate("07Ë121727");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8947_good() {
        // Validate 
        try {
            aObj.validate("071121772");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8948_bad() {
        // Validate 
        try {
            aObj.validate("07112Ê772");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8949_good() {
        // Validate 
        try {
            aObj.validate("071121808");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8950_bad() {
        // Validate 
        try {
            aObj.validate("07121808");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8951_good() {
        // Validate 
        try {
            aObj.validate("071121963");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8952_bad() {
        // Validate 
        try {
            aObj.validate("071!21963");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8953_good() {
        // Validate 
        try {
            aObj.validate("071121992");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8954_bad() {
        // Validate 
        try {
            aObj.validate("07111992");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8955_good() {
        // Validate 
        try {
            aObj.validate("071122030");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8956_bad() {
        // Validate 
        try {
            aObj.validate("07112203f");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8957_good() {
        // Validate 
        try {
            aObj.validate("071122056");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8958_bad() {
        // Validate 
        try {
            aObj.validate("01122056");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8959_good() {
        // Validate 
        try {
            aObj.validate("071122205");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8960_bad() {
        // Validate 
        try {
            aObj.validate("071122¬05");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8961_good() {
        // Validate 
        try {
            aObj.validate("071122247");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8962_bad() {
        // Validate 
        try {
            aObj.validate("0Q1122247");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8963_good() {
        // Validate 
        try {
            aObj.validate("071122263");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8964_bad() {
        // Validate 
        try {
            aObj.validate("07112226T");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8965_good() {
        // Validate 
        try {
            aObj.validate("071122276");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8966_bad() {
        // Validate 
        try {
            aObj.validate("071122,76");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8967_good() {
        // Validate 
        try {
            aObj.validate("071122412");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8968_bad() {
        // Validate 
        try {
            aObj.validate("07E122412");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8969_good() {
        // Validate 
        try {
            aObj.validate("071122467");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8970_bad() {
        // Validate 
        try {
            aObj.validate("07112K467");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8971_good() {
        // Validate 
        try {
            aObj.validate("071122535");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8972_bad() {
        // Validate 
        try {
            aObj.validate("07Ë122535");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8973_good() {
        // Validate 
        try {
            aObj.validate("071122564");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8974_bad() {
        // Validate 
        try {
            aObj.validate("071122z64");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8975_good() {
        // Validate 
        try {
            aObj.validate("071122616");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8976_bad() {
        // Validate 
        try {
            aObj.validate("0711226'6");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8977_good() {
        // Validate 
        try {
            aObj.validate("071122645");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8978_bad() {
        // Validate 
        try {
            aObj.validate("0¼1122645");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8979_good() {
        // Validate 
        try {
            aObj.validate("071122661");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8980_bad() {
        // Validate 
        try {
            aObj.validate("071Õ22661");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8981_good() {
        // Validate 
        try {
            aObj.validate("071122687");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8982_bad() {
        // Validate 
        try {
            aObj.validate("071¥22687");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8983_good() {
        // Validate 
        try {
            aObj.validate("071122713");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8984_bad() {
        // Validate 
        try {
            aObj.validate("0711Ñ2713");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8985_good() {
        // Validate 
        try {
            aObj.validate("071122933");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8986_bad() {
        // Validate 
        try {
            aObj.validate("07122933");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8987_good() {
        // Validate 
        try {
            aObj.validate("071123123");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8988_bad() {
        // Validate 
        try {
            aObj.validate("07123123");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8989_good() {
        // Validate 
        try {
            aObj.validate("071123149");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8990_bad() {
        // Validate 
        try {
            aObj.validate("07112314");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8991_good() {
        // Validate 
        try {
            aObj.validate("071123204");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8992_bad() {
        // Validate 
        try {
            aObj.validate("0711 3204");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8993_good() {
        // Validate 
        try {
            aObj.validate("071123262");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8994_bad() {
        // Validate 
        try {
            aObj.validate("07112326ª");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8995_good() {
        // Validate 
        try {
            aObj.validate("071123385");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8996_bad() {
        // Validate 
        try {
            aObj.validate("07112­385");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8997_good() {
        // Validate 
        try {
            aObj.validate("071123398");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_8998_bad() {
        // Validate 
        try {
            aObj.validate("073123398");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_8999_good() {
        // Validate 
        try {
            aObj.validate("071123518");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9000_bad() {
        // Validate 
        try {
            aObj.validate("07112351²");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9001_good() {
        // Validate 
        try {
            aObj.validate("071123990");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9002_bad() {
        // Validate 
        try {
            aObj.validate("0711W3990");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9003_good() {
        // Validate 
        try {
            aObj.validate("071124038");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9004_bad() {
        // Validate 
        try {
            aObj.validate("0711 4038");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9005_good() {
        // Validate 
        try {
            aObj.validate("071124339");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9006_bad() {
        // Validate 
        try {
            aObj.validate("071124349");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9007_good() {
        // Validate 
        try {
            aObj.validate("071124371");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9008_bad() {
        // Validate 
        try {
            aObj.validate("0711243I1");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9009_good() {
        // Validate 
        try {
            aObj.validate("071124614");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9010_bad() {
        // Validate 
        try {
            aObj.validate("0711[4614");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9011_good() {
        // Validate 
        try {
            aObj.validate("071124669");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9012_bad() {
        // Validate 
        try {
            aObj.validate("07112469");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9013_good() {
        // Validate 
        try {
            aObj.validate("071124740");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9014_bad() {
        // Validate 
        try {
            aObj.validate("07112|740");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9015_good() {
        // Validate 
        try {
            aObj.validate("071124805");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9016_bad() {
        // Validate 
        try {
            aObj.validate("071124l05");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9017_good() {
        // Validate 
        try {
            aObj.validate("071124821");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9018_bad() {
        // Validate 
        try {
            aObj.validate("071124/21");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9019_good() {
        // Validate 
        try {
            aObj.validate("071124902");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9020_bad() {
        // Validate 
        try {
            aObj.validate("07112S902");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9021_good() {
        // Validate 
        try {
            aObj.validate("071124931");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9022_bad() {
        // Validate 
        try {
            aObj.validate("01124931");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9023_good() {
        // Validate 
        try {
            aObj.validate("071125024");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9024_bad() {
        // Validate 
        try {
            aObj.validate("071'25024");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9025_good() {
        // Validate 
        try {
            aObj.validate("071125587");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9026_bad() {
        // Validate 
        try {
            aObj.validate("0C1125587");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9027_good() {
        // Validate 
        try {
            aObj.validate("071125891");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9028_bad() {
        // Validate 
        try {
            aObj.validate("0F1125891");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9029_good() {
        // Validate 
        try {
            aObj.validate("071125914");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9030_bad() {
        // Validate 
        try {
            aObj.validate("071=25914");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9031_good() {
        // Validate 
        try {
            aObj.validate("071125943");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9032_bad() {
        // Validate 
        try {
            aObj.validate("0711A5943");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9033_good() {
        // Validate 
        try {
            aObj.validate("071126078");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9034_bad() {
        // Validate 
        try {
            aObj.validate("0Ò1126078");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9035_good() {
        // Validate 
        try {
            aObj.validate("071126269");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9036_bad() {
        // Validate 
        try {
            aObj.validate("0711Ô6269");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9037_good() {
        // Validate 
        try {
            aObj.validate("071126489");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9038_bad() {
        // Validate 
        try {
            aObj.validate("0711264×9");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9039_good() {
        // Validate 
        try {
            aObj.validate("071126531");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9040_bad() {
        // Validate 
        try {
            aObj.validate("071126a31");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9041_good() {
        // Validate 
        try {
            aObj.validate("071126609");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9042_bad() {
        // Validate 
        try {
            aObj.validate("07112660");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9043_good() {
        // Validate 
        try {
            aObj.validate("071126706");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9044_bad() {
        // Validate 
        try {
            aObj.validate("07126706");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9045_good() {
        // Validate 
        try {
            aObj.validate("071126764");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9046_bad() {
        // Validate 
        try {
            aObj.validate("07112v764");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9047_good() {
        // Validate 
        try {
            aObj.validate("071126955");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9048_bad() {
        // Validate 
        try {
            aObj.validate("071126n55");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9049_good() {
        // Validate 
        try {
            aObj.validate("071127022");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9050_bad() {
        // Validate 
        try {
            aObj.validate("07112c022");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9051_good() {
        // Validate 
        try {
            aObj.validate("071127035");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9052_bad() {
        // Validate 
        try {
            aObj.validate("0711270|5");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9053_good() {
        // Validate 
        try {
            aObj.validate("071127093");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9054_bad() {
        // Validate 
        try {
            aObj.validate("0711§7093");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9055_good() {
        // Validate 
        try {
            aObj.validate("071127132");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9056_bad() {
        // Validate 
        try {
            aObj.validate("07117132");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9057_good() {
        // Validate 
        try {
            aObj.validate("071127145");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9058_bad() {
        // Validate 
        try {
            aObj.validate("07112714Ê");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9059_good() {
        // Validate 
        try {
            aObj.validate("071127158");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9060_bad() {
        // Validate 
        try {
            aObj.validate("07112s158");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9061_good() {
        // Validate 
        try {
            aObj.validate("071174431");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9062_bad() {
        // Validate 
        try {
            aObj.validate("07174431");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9063_good() {
        // Validate 
        try {
            aObj.validate("071174512");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9064_bad() {
        // Validate 
        try {
            aObj.validate("071F74512");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9065_good() {
        // Validate 
        try {
            aObj.validate("071193250");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9066_bad() {
        // Validate 
        try {
            aObj.validate("0711932>0");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9067_good() {
        // Validate 
        try {
            aObj.validate("071193331");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9068_bad() {
        // Validate 
        try {
            aObj.validate("071193¿31");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9069_good() {
        // Validate 
        try {
            aObj.validate("071200538");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9070_bad() {
        // Validate 
        try {
            aObj.validate("0712J0538");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9071_good() {
        // Validate 
        try {
            aObj.validate("071201320");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9072_bad() {
        // Validate 
        try {
            aObj.validate("07120¾320");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9073_good() {
        // Validate 
        try {
            aObj.validate("071201647");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9074_bad() {
        // Validate 
        try {
            aObj.validate("0712}1647");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9075_good() {
        // Validate 
        try {
            aObj.validate("071202756");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9076_bad() {
        // Validate 
        try {
            aObj.validate("07120275j");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9077_good() {
        // Validate 
        try {
            aObj.validate("071205850");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9078_bad() {
        // Validate 
        try {
            aObj.validate("07120850");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9079_good() {
        // Validate 
        try {
            aObj.validate("071208297");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9080_bad() {
        // Validate 
        try {
            aObj.validate("071	08297");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9081_good() {
        // Validate 
        try {
            aObj.validate("071211734");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9082_bad() {
        // Validate 
        try {
            aObj.validate("0712117±4");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9083_good() {
        // Validate 
        try {
            aObj.validate("071212128");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9084_bad() {
        // Validate 
        try {
            aObj.validate("07122128");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9085_good() {
        // Validate 
        try {
            aObj.validate("071214126");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9086_bad() {
        // Validate 
        try {
            aObj.validate("07=214126");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9087_good() {
        // Validate 
        try {
            aObj.validate("071214249");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9088_bad() {
        // Validate 
        try {
            aObj.validate("0712@4249");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9089_good() {
        // Validate 
        try {
            aObj.validate("071214333");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9090_bad() {
        // Validate 
        try {
            aObj.validate("01214333");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9091_good() {
        // Validate 
        try {
            aObj.validate("071214472");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9092_bad() {
        // Validate 
        try {
            aObj.validate("0712G4472");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9093_good() {
        // Validate 
        try {
            aObj.validate("071214579");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9094_bad() {
        // Validate 
        try {
            aObj.validate("07121[579");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9095_good() {
        // Validate 
        try {
            aObj.validate("071900456");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9096_bad() {
        // Validate 
        try {
            aObj.validate("071h00456");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9097_good() {
        // Validate 
        try {
            aObj.validate("071900595");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9098_bad() {
        // Validate 
        try {
            aObj.validate("0[1900595");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9099_good() {
        // Validate 
        try {
            aObj.validate("071900663");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9100_bad() {
        // Validate 
        try {
            aObj.validate("071900¢63");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9101_good() {
        // Validate 
        try {
            aObj.validate("071900760");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9102_bad() {
        // Validate 
        try {
            aObj.validate("071900z60");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9103_good() {
        // Validate 
        try {
            aObj.validate("071900786");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9104_bad() {
        // Validate 
        try {
            aObj.validate("071900À86");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9105_good() {
        // Validate 
        try {
            aObj.validate("071900799");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9106_bad() {
        // Validate 
        try {
            aObj.validate("07100799");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9107_good() {
        // Validate 
        try {
            aObj.validate("071900825");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9108_bad() {
        // Validate 
        try {
            aObj.validate("07190(825");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9109_good() {
        // Validate 
        try {
            aObj.validate("071900883");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9110_bad() {
        // Validate 
        try {
            aObj.validate("07190¯883");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9111_good() {
        // Validate 
        try {
            aObj.validate("071900948");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9112_bad() {
        // Validate 
        try {
            aObj.validate("0719009N8");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9113_good() {
        // Validate 
        try {
            aObj.validate("071900993");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9114_bad() {
        // Validate 
        try {
            aObj.validate("07»900993");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9115_good() {
        // Validate 
        try {
            aObj.validate("071901154");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9116_bad() {
        // Validate 
        try {
            aObj.validate("0719G1154");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9117_good() {
        // Validate 
        try {
            aObj.validate("071901604");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9118_bad() {
        // Validate 
        try {
            aObj.validate("07190160");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9119_good() {
        // Validate 
        try {
            aObj.validate("071901811");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9120_bad() {
        // Validate 
        try {
            aObj.validate("07190181=");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9121_good() {
        // Validate 
        try {
            aObj.validate("071901837");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9122_bad() {
        // Validate 
        try {
            aObj.validate("07Î901837");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9123_good() {
        // Validate 
        try {
            aObj.validate("071901882");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9124_bad() {
        // Validate 
        try {
            aObj.validate("071901a82");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9125_good() {
        // Validate 
        try {
            aObj.validate("071901947");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9126_bad() {
        // Validate 
        try {
            aObj.validate("0719H1947");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9127_good() {
        // Validate 
        try {
            aObj.validate("071902030");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9128_bad() {
        // Validate 
        try {
            aObj.validate("0719z2030");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9129_good() {
        // Validate 
        try {
            aObj.validate("071902043");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9130_bad() {
        // Validate 
        try {
            aObj.validate("07190243");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9131_good() {
        // Validate 
        try {
            aObj.validate("071902399");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9132_bad() {
        // Validate 
        try {
            aObj.validate("07902399");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9133_good() {
        // Validate 
        try {
            aObj.validate("071902629");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9134_bad() {
        // Validate 
        try {
            aObj.validate("071902'29");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9135_good() {
        // Validate 
        try {
            aObj.validate("071902797");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9136_bad() {
        // Validate 
        try {
            aObj.validate("07190279ª");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9137_good() {
        // Validate 
        try {
            aObj.validate("071902878");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9138_bad() {
        // Validate 
        try {
            aObj.validate("07902878");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9139_good() {
        // Validate 
        try {
            aObj.validate("071903055");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9140_bad() {
        // Validate 
        try {
            aObj.validate("07 903055");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9141_good() {
        // Validate 
        try {
            aObj.validate("071903110");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9142_bad() {
        // Validate 
        try {
            aObj.validate("071903/10");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9143_good() {
        // Validate 
        try {
            aObj.validate("071903123");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9144_bad() {
        // Validate 
        try {
            aObj.validate("07Ø903123");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9145_good() {
        // Validate 
        try {
            aObj.validate("071903136");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9146_bad() {
        // Validate 
        try {
            aObj.validate("07Â903136");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9147_good() {
        // Validate 
        try {
            aObj.validate("071903929");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9148_bad() {
        // Validate 
        try {
            aObj.validate("07903929");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9149_good() {
        // Validate 
        try {
            aObj.validate("071904290");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9150_bad() {
        // Validate 
        try {
            aObj.validate("01904290");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9151_good() {
        // Validate 
        try {
            aObj.validate("071904355");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9152_bad() {
        // Validate 
        try {
            aObj.validate("071908355");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9153_good() {
        // Validate 
        try {
            aObj.validate("071904371");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9154_bad() {
        // Validate 
        try {
            aObj.validate("071904372");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9155_good() {
        // Validate 
        try {
            aObj.validate("071904478");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9156_bad() {
        // Validate 
        try {
            aObj.validate("071)04478");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9157_good() {
        // Validate 
        try {
            aObj.validate("071904517");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9158_bad() {
        // Validate 
        try {
            aObj.validate("0719045Ò7");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9159_good() {
        // Validate 
        try {
            aObj.validate("071904627");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9160_bad() {
        // Validate 
        try {
            aObj.validate("07194627");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9161_good() {
        // Validate 
        try {
            aObj.validate("071904779");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9162_bad() {
        // Validate 
        try {
            aObj.validate("07190477i");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9163_good() {
        // Validate 
        try {
            aObj.validate("071904889");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9164_bad() {
        // Validate 
        try {
            aObj.validate("07¼904889");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9165_good() {
        // Validate 
        try {
            aObj.validate("071905040");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9166_bad() {
        // Validate 
        try {
            aObj.validate("07105040");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9167_good() {
        // Validate 
        try {
            aObj.validate("071905082");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9168_bad() {
        // Validate 
        try {
            aObj.validate("0¹1905082");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9169_good() {
        // Validate 
        try {
            aObj.validate("071905095");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9170_bad() {
        // Validate 
        try {
            aObj.validate("0Ì1905095");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9171_good() {
        // Validate 
        try {
            aObj.validate("071905309");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9172_bad() {
        // Validate 
        try {
            aObj.validate("0719À5309");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9173_good() {
        // Validate 
        try {
            aObj.validate("071905613");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9174_bad() {
        // Validate 
        try {
            aObj.validate("07905613");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9175_good() {
        // Validate 
        try {
            aObj.validate("071905817");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9176_bad() {
        // Validate 
        try {
            aObj.validate("07195817");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9177_good() {
        // Validate 
        try {
            aObj.validate("071905846");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9178_bad() {
        // Validate 
        try {
            aObj.validate("07!905846");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9179_good() {
        // Validate 
        try {
            aObj.validate("071905930");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9180_bad() {
        // Validate 
        try {
            aObj.validate("07190593");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9181_good() {
        // Validate 
        try {
            aObj.validate("071905943");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9182_bad() {
        // Validate 
        try {
            aObj.validate("07195943");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9183_good() {
        // Validate 
        try {
            aObj.validate("071905985");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9184_bad() {
        // Validate 
        try {
            aObj.validate("0Å1905985");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9185_good() {
        // Validate 
        try {
            aObj.validate("071906573");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9186_bad() {
        // Validate 
        try {
            aObj.validate("0719m6573");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9187_good() {
        // Validate 
        try {
            aObj.validate("071906641");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9188_bad() {
        // Validate 
        try {
            aObj.validate("0719066J1");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9189_good() {
        // Validate 
        try {
            aObj.validate("071908021");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9190_bad() {
        // Validate 
        try {
            aObj.validate("07Ë908021");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9191_good() {
        // Validate 
        try {
            aObj.validate("071908063");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9192_bad() {
        // Validate 
        try {
            aObj.validate("0719¾8063");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9193_good() {
        // Validate 
        try {
            aObj.validate("071908144");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9194_bad() {
        // Validate 
        try {
            aObj.validate("07190844");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9195_good() {
        // Validate 
        try {
            aObj.validate("071908160");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9196_bad() {
        // Validate 
        try {
            aObj.validate("07~908160");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9197_good() {
        // Validate 
        try {
            aObj.validate("071908490");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9198_bad() {
        // Validate 
        try {
            aObj.validate("071 08490");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9199_good() {
        // Validate 
        try {
            aObj.validate("071908678");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9200_bad() {
        // Validate 
        try {
            aObj.validate("071918678");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9201_good() {
        // Validate 
        try {
            aObj.validate("071908827");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9202_bad() {
        // Validate 
        try {
            aObj.validate("07190²827");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9203_good() {
        // Validate 
        try {
            aObj.validate("071908869");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9204_bad() {
        // Validate 
        try {
            aObj.validate("0719088u9");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9205_good() {
        // Validate 
        try {
            aObj.validate("071908908");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9206_bad() {
        // Validate 
        try {
            aObj.validate("0¢1908908");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9207_good() {
        // Validate 
        try {
            aObj.validate("071909046");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9208_bad() {
        // Validate 
        try {
            aObj.validate("07190946");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9209_good() {
        // Validate 
        try {
            aObj.validate("071909062");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9210_bad() {
        // Validate 
        try {
            aObj.validate("07190906b");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9211_good() {
        // Validate 
        try {
            aObj.validate("071909091");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9212_bad() {
        // Validate 
        try {
            aObj.validate("07909091");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9213_good() {
        // Validate 
        try {
            aObj.validate("071909198");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9214_bad() {
        // Validate 
        try {
            aObj.validate("07190¨198");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9215_good() {
        // Validate 
        try {
            aObj.validate("071909211");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9216_bad() {
        // Validate 
        try {
            aObj.validate("07199211");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9217_good() {
        // Validate 
        try {
            aObj.validate("071909240");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9218_bad() {
        // Validate 
        try {
            aObj.validate("07190940");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9219_good() {
        // Validate 
        try {
            aObj.validate("071909253");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9220_bad() {
        // Validate 
        try {
            aObj.validate("078909253");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9221_good() {
        // Validate 
        try {
            aObj.validate("071909305");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9222_bad() {
        // Validate 
        try {
            aObj.validate("07190'305");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9223_good() {
        // Validate 
        try {
            aObj.validate("071909363");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9224_bad() {
        // Validate 
        try {
            aObj.validate("0719`9363");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9225_good() {
        // Validate 
        try {
            aObj.validate("071909871");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9226_bad() {
        // Validate 
        try {
            aObj.validate("07109871");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9227_good() {
        // Validate 
        try {
            aObj.validate("071910187");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9228_bad() {
        // Validate 
        try {
            aObj.validate("07¦910187");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9229_good() {
        // Validate 
        try {
            aObj.validate("071910721");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9230_bad() {
        // Validate 
        try {
            aObj.validate("0q1910721");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9231_good() {
        // Validate 
        try {
            aObj.validate("071910776");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9232_bad() {
        // Validate 
        try {
            aObj.validate("071910¨76");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9233_good() {
        // Validate 
        try {
            aObj.validate("071911270");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9234_bad() {
        // Validate 
        try {
            aObj.validate("071911=70");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9235_good() {
        // Validate 
        try {
            aObj.validate("071911296");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9236_bad() {
        // Validate 
        try {
            aObj.validate("07191129Ö");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9237_good() {
        // Validate 
        try {
            aObj.validate("071911364");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9238_bad() {
        // Validate 
        try {
            aObj.validate("07191364");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9239_good() {
        // Validate 
        try {
            aObj.validate("071911416");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9240_bad() {
        // Validate 
        try {
            aObj.validate("07191q416");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9241_good() {
        // Validate 
        try {
            aObj.validate("071911584");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9242_bad() {
        // Validate 
        try {
            aObj.validate("07191¢584");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9243_good() {
        // Validate 
        try {
            aObj.validate("071911652");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9244_bad() {
        // Validate 
        try {
            aObj.validate("071911½52");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9245_good() {
        // Validate 
        try {
            aObj.validate("071911704");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9246_bad() {
        // Validate 
        try {
            aObj.validate("071s11704");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9247_good() {
        // Validate 
        try {
            aObj.validate("071911788");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9248_bad() {
        // Validate 
        try {
            aObj.validate("0¼1911788");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9249_good() {
        // Validate 
        try {
            aObj.validate("071912813");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9250_bad() {
        // Validate 
        try {
            aObj.validate("0719128Þ3");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9251_good() {
        // Validate 
        try {
            aObj.validate("071913058");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9252_bad() {
        // Validate 
        try {
            aObj.validate("07193058");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9253_good() {
        // Validate 
        try {
            aObj.validate("071913087");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9254_bad() {
        // Validate 
        try {
            aObj.validate("071413087");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9255_good() {
        // Validate 
        try {
            aObj.validate("071913278");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9256_bad() {
        // Validate 
        try {
            aObj.validate("0719132Ì8");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9257_good() {
        // Validate 
        try {
            aObj.validate("071913566");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9258_bad() {
        // Validate 
        try {
            aObj.validate("07191356~");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9259_good() {
        // Validate 
        try {
            aObj.validate("071913650");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9260_bad() {
        // Validate 
        try {
            aObj.validate("07193650");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9261_good() {
        // Validate 
        try {
            aObj.validate("071913731");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9262_bad() {
        // Validate 
        try {
            aObj.validate("07191373=");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9263_good() {
        // Validate 
        try {
            aObj.validate("071914138");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9264_bad() {
        // Validate 
        try {
            aObj.validate("0M1914138");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9265_good() {
        // Validate 
        try {
            aObj.validate("071914358");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9266_bad() {
        // Validate 
        try {
            aObj.validate("07191435¨");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9267_good() {
        // Validate 
        try {
            aObj.validate("071915218");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9268_bad() {
        // Validate 
        try {
            aObj.validate("0­1915218");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9269_good() {
        // Validate 
        try {
            aObj.validate("071915580");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9270_bad() {
        // Validate 
        try {
            aObj.validate("07191550");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9271_good() {
        // Validate 
        try {
            aObj.validate("071915797");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9272_bad() {
        // Validate 
        try {
            aObj.validate("07191579L");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9273_good() {
        // Validate 
        try {
            aObj.validate("071916042");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9274_bad() {
        // Validate 
        try {
            aObj.validate("07196042");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9275_good() {
        // Validate 
        try {
            aObj.validate("071916123");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9276_bad() {
        // Validate 
        try {
            aObj.validate("07°916123");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9277_good() {
        // Validate 
        try {
            aObj.validate("071916408");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9278_bad() {
        // Validate 
        try {
            aObj.validate("072916408");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9279_good() {
        // Validate 
        try {
            aObj.validate("071916482");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9280_bad() {
        // Validate 
        try {
            aObj.validate("07196482");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9281_good() {
        // Validate 
        try {
            aObj.validate("071916550");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9282_bad() {
        // Validate 
        try {
            aObj.validate("07Û916550");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9283_good() {
        // Validate 
        try {
            aObj.validate("071916602");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9284_bad() {
        // Validate 
        try {
            aObj.validate("071016602");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9285_good() {
        // Validate 
        try {
            aObj.validate("071916822");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9286_bad() {
        // Validate 
        try {
            aObj.validate("0719168Ó2");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9287_good() {
        // Validate 
        try {
            aObj.validate("071916916");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9288_bad() {
        // Validate 
        try {
            aObj.validate("0t1916916");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9289_good() {
        // Validate 
        try {
            aObj.validate("071917232");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9290_bad() {
        // Validate 
        try {
            aObj.validate("071117232");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9291_good() {
        // Validate 
        try {
            aObj.validate("071917326");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9292_bad() {
        // Validate 
        try {
            aObj.validate("07191732q");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9293_good() {
        // Validate 
        try {
            aObj.validate("071918150");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9294_bad() {
        // Validate 
        try {
            aObj.validate("071918¡50");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9295_good() {
        // Validate 
        try {
            aObj.validate("071918286");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9296_bad() {
        // Validate 
        try {
            aObj.validate("071918v86");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9297_good() {
        // Validate 
        try {
            aObj.validate("071918309");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9298_bad() {
        // Validate 
        try {
            aObj.validate("07Ì918309");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9299_good() {
        // Validate 
        try {
            aObj.validate("071918383");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9300_bad() {
        // Validate 
        try {
            aObj.validate("07198383");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9301_good() {
        // Validate 
        try {
            aObj.validate("071918545");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9302_bad() {
        // Validate 
        try {
            aObj.validate("071*18545");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9303_good() {
        // Validate 
        try {
            aObj.validate("071918561");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9304_bad() {
        // Validate 
        try {
            aObj.validate("07118561");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9305_good() {
        // Validate 
        try {
            aObj.validate("071918765");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9306_bad() {
        // Validate 
        try {
            aObj.validate("0Æ1918765");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9307_good() {
        // Validate 
        try {
            aObj.validate("071919117");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9308_bad() {
        // Validate 
        try {
            aObj.validate("07191911½");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9309_good() {
        // Validate 
        try {
            aObj.validate("071919463");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9310_bad() {
        // Validate 
        try {
            aObj.validate("07191946");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9311_good() {
        // Validate 
        try {
            aObj.validate("071920135");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9312_bad() {
        // Validate 
        try {
            aObj.validate("07Ó920135");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9313_good() {
        // Validate 
        try {
            aObj.validate("071920164");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9314_bad() {
        // Validate 
        try {
            aObj.validate("07192014");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9315_good() {
        // Validate 
        try {
            aObj.validate("071920300");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9316_bad() {
        // Validate 
        try {
            aObj.validate("071920F00");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9317_good() {
        // Validate 
        try {
            aObj.validate("071920559");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9318_bad() {
        // Validate 
        try {
            aObj.validate("07£920559");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9319_good() {
        // Validate 
        try {
            aObj.validate("071920656");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9320_bad() {
        // Validate 
        try {
            aObj.validate("0719206}6");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9321_good() {
        // Validate 
        try {
            aObj.validate("071920957");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9322_bad() {
        // Validate 
        try {
            aObj.validate("0719209º7");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9323_good() {
        // Validate 
        try {
            aObj.validate("071920960");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9324_bad() {
        // Validate 
        try {
            aObj.validate("071«20960");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9325_good() {
        // Validate 
        try {
            aObj.validate("071921176");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9326_bad() {
        // Validate 
        try {
            aObj.validate("0719211Q6");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9327_good() {
        // Validate 
        try {
            aObj.validate("071921244");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9328_bad() {
        // Validate 
        try {
            aObj.validate("07192144");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9329_good() {
        // Validate 
        try {
            aObj.validate("071921396");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9330_bad() {
        // Validate 
        try {
            aObj.validate("0^1921396");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9331_good() {
        // Validate 
        try {
            aObj.validate("071921464");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9332_bad() {
        // Validate 
        try {
            aObj.validate("07192h464");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9333_good() {
        // Validate 
        try {
            aObj.validate("071921529");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9334_bad() {
        // Validate 
        try {
            aObj.validate("07192152");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9335_good() {
        // Validate 
        try {
            aObj.validate("071921532");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9336_bad() {
        // Validate 
        try {
            aObj.validate("0719§1532");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9337_good() {
        // Validate 
        try {
            aObj.validate("071921668");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9338_bad() {
        // Validate 
        try {
            aObj.validate("0719f1668");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9339_good() {
        // Validate 
        try {
            aObj.validate("071921697");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9340_bad() {
        // Validate 
        try {
            aObj.validate("071W21697");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9341_good() {
        // Validate 
        try {
            aObj.validate("071921707");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9342_bad() {
        // Validate 
        try {
            aObj.validate("0719Ó1707");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9343_good() {
        // Validate 
        try {
            aObj.validate("071921749");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9344_bad() {
        // Validate 
        try {
            aObj.validate("071D21749");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9345_good() {
        // Validate 
        try {
            aObj.validate("071921794");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9346_bad() {
        // Validate 
        try {
            aObj.validate("07192174");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9347_good() {
        // Validate 
        try {
            aObj.validate("071921833");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9348_bad() {
        // Validate 
        try {
            aObj.validate("07192133");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9349_good() {
        // Validate 
        try {
            aObj.validate("071921846");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9350_bad() {
        // Validate 
        try {
            aObj.validate("0719h1846");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9351_good() {
        // Validate 
        try {
            aObj.validate("071921891");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9352_bad() {
        // Validate 
        try {
            aObj.validate("0719218}1");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9353_good() {
        // Validate 
        try {
            aObj.validate("071921956");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9354_bad() {
        // Validate 
        try {
            aObj.validate("07192195");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9355_good() {
        // Validate 
        try {
            aObj.validate("071921985");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9356_bad() {
        // Validate 
        try {
            aObj.validate("071h21985");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9357_good() {
        // Validate 
        try {
            aObj.validate("071922010");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9358_bad() {
        // Validate 
        try {
            aObj.validate("071922050");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9359_good() {
        // Validate 
        try {
            aObj.validate("071922094");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9360_bad() {
        // Validate 
        try {
            aObj.validate("0A1922094");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9361_good() {
        // Validate 
        try {
            aObj.validate("071922117");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9362_bad() {
        // Validate 
        try {
            aObj.validate("071922j17");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9363_good() {
        // Validate 
        try {
            aObj.validate("071922175");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9364_bad() {
        // Validate 
        try {
            aObj.validate("0719221¹5");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9365_good() {
        // Validate 
        try {
            aObj.validate("071922188");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9366_bad() {
        // Validate 
        try {
            aObj.validate("07192218");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9367_good() {
        // Validate 
        try {
            aObj.validate("071922227");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9368_bad() {
        // Validate 
        try {
            aObj.validate("071#22227");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9369_good() {
        // Validate 
        try {
            aObj.validate("071922256");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9370_bad() {
        // Validate 
        try {
            aObj.validate("0È1922256");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9371_good() {
        // Validate 
        try {
            aObj.validate("071922298");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9372_bad() {
        // Validate 
        try {
            aObj.validate("0W1922298");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9373_good() {
        // Validate 
        try {
            aObj.validate("071922337");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9374_bad() {
        // Validate 
        try {
            aObj.validate("0m1922337");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9375_good() {
        // Validate 
        try {
            aObj.validate("071922340");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9376_bad() {
        // Validate 
        try {
            aObj.validate("07192230");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9377_good() {
        // Validate 
        try {
            aObj.validate("071922366");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9378_bad() {
        // Validate 
        try {
            aObj.validate("07R922366");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9379_good() {
        // Validate 
        try {
            aObj.validate("071922379");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9380_bad() {
        // Validate 
        try {
            aObj.validate("0719N2379");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9381_good() {
        // Validate 
        try {
            aObj.validate("071922421");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9382_bad() {
        // Validate 
        try {
            aObj.validate("07R922421");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9383_good() {
        // Validate 
        try {
            aObj.validate("071922476");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9384_bad() {
        // Validate 
        try {
            aObj.validate("07192246");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9385_good() {
        // Validate 
        try {
            aObj.validate("071922557");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9386_bad() {
        // Validate 
        try {
            aObj.validate("07192»557");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9387_good() {
        // Validate 
        try {
            aObj.validate("071922609");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9388_bad() {
        // Validate 
        try {
            aObj.validate("071922	09");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9389_good() {
        // Validate 
        try {
            aObj.validate("071922638");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9390_bad() {
        // Validate 
        try {
            aObj.validate("074922638");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9391_good() {
        // Validate 
        try {
            aObj.validate("071922670");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9392_bad() {
        // Validate 
        try {
            aObj.validate("0^1922670");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9393_good() {
        // Validate 
        try {
            aObj.validate("071922696");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9394_bad() {
        // Validate 
        try {
            aObj.validate("07>922696");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9395_good() {
        // Validate 
        try {
            aObj.validate("071922764");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9396_bad() {
        // Validate 
        try {
            aObj.validate("0)1922764");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9397_good() {
        // Validate 
        try {
            aObj.validate("071922777");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9398_bad() {
        // Validate 
        try {
            aObj.validate("01922777");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9399_good() {
        // Validate 
        try {
            aObj.validate("071922874");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9400_bad() {
        // Validate 
        try {
            aObj.validate("07192874");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9401_good() {
        // Validate 
        try {
            aObj.validate("071922887");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9402_bad() {
        // Validate 
        try {
            aObj.validate("0719228¾7");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9403_good() {
        // Validate 
        try {
            aObj.validate("071922955");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9404_bad() {
        // Validate 
        try {
            aObj.validate("07a922955");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9405_good() {
        // Validate 
        try {
            aObj.validate("071922968");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9406_bad() {
        // Validate 
        try {
            aObj.validate("071928968");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9407_good() {
        // Validate 
        try {
            aObj.validate("071922984");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9408_bad() {
        // Validate 
        try {
            aObj.validate("07192298¼");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9409_good() {
        // Validate 
        try {
            aObj.validate("071923035");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9410_bad() {
        // Validate 
        try {
            aObj.validate("07192035");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9411_good() {
        // Validate 
        try {
            aObj.validate("071923048");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9412_bad() {
        // Validate 
        try {
            aObj.validate("0719230Õ8");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9413_good() {
        // Validate 
        try {
            aObj.validate("071923132");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9414_bad() {
        // Validate 
        try {
            aObj.validate("07192332");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9415_good() {
        // Validate 
        try {
            aObj.validate("071923190");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9416_bad() {
        // Validate 
        try {
            aObj.validate("07192¾190");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9417_good() {
        // Validate 
        try {
            aObj.validate("071923213");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9418_bad() {
        // Validate 
        try {
            aObj.validate("07192323");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9419_good() {
        // Validate 
        try {
            aObj.validate("071923226");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9420_bad() {
        // Validate 
        try {
            aObj.validate("07192326");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9421_good() {
        // Validate 
        try {
            aObj.validate("071923255");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9422_bad() {
        // Validate 
        try {
            aObj.validate("07923255");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9423_good() {
        // Validate 
        try {
            aObj.validate("071923284");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9424_bad() {
        // Validate 
        try {
            aObj.validate("07192328l");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9425_good() {
        // Validate 
        try {
            aObj.validate("071923307");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9426_bad() {
        // Validate 
        try {
            aObj.validate("07923307");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9427_good() {
        // Validate 
        try {
            aObj.validate("071923310");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9428_bad() {
        // Validate 
        try {
            aObj.validate("07²923310");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9429_good() {
        // Validate 
        try {
            aObj.validate("071923323");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9430_bad() {
        // Validate 
        try {
            aObj.validate("071923Ô23");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9431_good() {
        // Validate 
        try {
            aObj.validate("071923336");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9432_bad() {
        // Validate 
        try {
            aObj.validate("071P23336");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9433_good() {
        // Validate 
        try {
            aObj.validate("071923349");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9434_bad() {
        // Validate 
        try {
            aObj.validate("0719233Ò9");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9435_good() {
        // Validate 
        try {
            aObj.validate("071923352");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9436_bad() {
        // Validate 
        try {
            aObj.validate("07192Ñ352");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9437_good() {
        // Validate 
        try {
            aObj.validate("071923378");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9438_bad() {
        // Validate 
        try {
            aObj.validate("0719*3378");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9439_good() {
        // Validate 
        try {
            aObj.validate("071923404");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9440_bad() {
        // Validate 
        try {
            aObj.validate("07b923404");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9441_good() {
        // Validate 
        try {
            aObj.validate("071923543");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9442_bad() {
        // Validate 
        try {
            aObj.validate("07193543");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9443_good() {
        // Validate 
        try {
            aObj.validate("071923569");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9444_bad() {
        // Validate 
        try {
            aObj.validate("071M23569");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9445_good() {
        // Validate 
        try {
            aObj.validate("071923666");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9446_bad() {
        // Validate 
        try {
            aObj.validate("01923666");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9447_good() {
        // Validate 
        try {
            aObj.validate("071923695");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9448_bad() {
        // Validate 
        try {
            aObj.validate("07192)695");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9449_good() {
        // Validate 
        try {
            aObj.validate("071923747");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9450_bad() {
        // Validate 
        try {
            aObj.validate("0719237'7");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9451_good() {
        // Validate 
        try {
            aObj.validate("071923750");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9452_bad() {
        // Validate 
        try {
            aObj.validate("0719237g0");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9453_good() {
        // Validate 
        try {
            aObj.validate("071923815");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9454_bad() {
        // Validate 
        try {
            aObj.validate("07123815");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9455_good() {
        // Validate 
        try {
            aObj.validate("071923828");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9456_bad() {
        // Validate 
        try {
            aObj.validate("071943828");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9457_good() {
        // Validate 
        try {
            aObj.validate("071923857");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9458_bad() {
        // Validate 
        try {
            aObj.validate("071;23857");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9459_good() {
        // Validate 
        try {
            aObj.validate("071923909");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9460_bad() {
        // Validate 
        try {
            aObj.validate("071T23909");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9461_good() {
        // Validate 
        try {
            aObj.validate("071923954");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9462_bad() {
        // Validate 
        try {
            aObj.validate("07¡923954");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9463_good() {
        // Validate 
        try {
            aObj.validate("071924005");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9464_bad() {
        // Validate 
        try {
            aObj.validate("07194005");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9465_good() {
        // Validate 
        try {
            aObj.validate("071924063");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9466_bad() {
        // Validate 
        try {
            aObj.validate("07192406,");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9467_good() {
        // Validate 
        try {
            aObj.validate("071924089");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9468_bad() {
        // Validate 
        try {
            aObj.validate("07192408p");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9469_good() {
        // Validate 
        try {
            aObj.validate("071924131");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9470_bad() {
        // Validate 
        try {
            aObj.validate("071924Ù31");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9471_good() {
        // Validate 
        try {
            aObj.validate("071924160");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9472_bad() {
        // Validate 
        try {
            aObj.validate("071¾24160");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9473_good() {
        // Validate 
        try {
            aObj.validate("071924212");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9474_bad() {
        // Validate 
        try {
            aObj.validate("0719!4212");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9475_good() {
        // Validate 
        try {
            aObj.validate("071924241");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9476_bad() {
        // Validate 
        try {
            aObj.validate("07124241");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9477_good() {
        // Validate 
        try {
            aObj.validate("071924306");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9478_bad() {
        // Validate 
        try {
            aObj.validate("07192430a");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9479_good() {
        // Validate 
        try {
            aObj.validate("071924319");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9480_bad() {
        // Validate 
        try {
            aObj.validate("01924319");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9481_good() {
        // Validate 
        try {
            aObj.validate("071924393");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9482_bad() {
        // Validate 
        try {
            aObj.validate("071924h93");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9483_good() {
        // Validate 
        try {
            aObj.validate("071924458");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9484_bad() {
        // Validate 
        try {
            aObj.validate("071J24458");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9485_good() {
        // Validate 
        try {
            aObj.validate("071924513");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9486_bad() {
        // Validate 
        try {
            aObj.validate("0719{4513");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9487_good() {
        // Validate 
        try {
            aObj.validate("071924584");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9488_bad() {
        // Validate 
        try {
            aObj.validate("07192484");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9489_good() {
        // Validate 
        try {
            aObj.validate("071924652");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9490_bad() {
        // Validate 
        try {
            aObj.validate("07192462");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9491_good() {
        // Validate 
        try {
            aObj.validate("071924681");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9492_bad() {
        // Validate 
        try {
            aObj.validate("081924681");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9493_good() {
        // Validate 
        try {
            aObj.validate("071924775");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9494_bad() {
        // Validate 
        try {
            aObj.validate("0_1924775");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9495_good() {
        // Validate 
        try {
            aObj.validate("071924872");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9496_bad() {
        // Validate 
        try {
            aObj.validate("071924+72");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9497_good() {
        // Validate 
        try {
            aObj.validate("071924898");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9498_bad() {
        // Validate 
        try {
            aObj.validate("07192898");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9499_good() {
        // Validate 
        try {
            aObj.validate("071924924");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9500_bad() {
        // Validate 
        try {
            aObj.validate("07192:924");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9501_good() {
        // Validate 
        try {
            aObj.validate("071924979");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9502_bad() {
        // Validate 
        try {
            aObj.validate("07ß924979");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9503_good() {
        // Validate 
        try {
            aObj.validate("071925017");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9504_bad() {
        // Validate 
        try {
            aObj.validate("07925017");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9505_good() {
        // Validate 
        try {
            aObj.validate("071925033");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9506_bad() {
        // Validate 
        try {
            aObj.validate("0719´5033");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9507_good() {
        // Validate 
        try {
            aObj.validate("071925046");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9508_bad() {
        // Validate 
        try {
            aObj.validate("071925^46");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9509_good() {
        // Validate 
        try {
            aObj.validate("071925062");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9510_bad() {
        // Validate 
        try {
            aObj.validate("0719Û5062");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9511_good() {
        // Validate 
        try {
            aObj.validate("071925130");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9512_bad() {
        // Validate 
        try {
            aObj.validate("07192513=");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9513_good() {
        // Validate 
        try {
            aObj.validate("071925156");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9514_bad() {
        // Validate 
        try {
            aObj.validate("071925F56");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9515_good() {
        // Validate 
        try {
            aObj.validate("071925169");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9516_bad() {
        // Validate 
        try {
            aObj.validate("07125169");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9517_good() {
        // Validate 
        try {
            aObj.validate("071925172");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9518_bad() {
        // Validate 
        try {
            aObj.validate("07G925172");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9519_good() {
        // Validate 
        try {
            aObj.validate("071925211");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9520_bad() {
        // Validate 
        try {
            aObj.validate("07^925211");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9521_good() {
        // Validate 
        try {
            aObj.validate("071925224");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9522_bad() {
        // Validate 
        try {
            aObj.validate("071925F24");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9523_good() {
        // Validate 
        try {
            aObj.validate("071925237");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9524_bad() {
        // Validate 
        try {
            aObj.validate("071925s37");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9525_good() {
        // Validate 
        try {
            aObj.validate("071925240");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9526_bad() {
        // Validate 
        try {
            aObj.validate("0719252Ô0");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9527_good() {
        // Validate 
        try {
            aObj.validate("071925305");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9528_bad() {
        // Validate 
        try {
            aObj.validate("0719Å5305");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9529_good() {
        // Validate 
        try {
            aObj.validate("071925334");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9530_bad() {
        // Validate 
        try {
            aObj.validate("0{1925334");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9531_good() {
        // Validate 
        try {
            aObj.validate("071925350");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9532_bad() {
        // Validate 
        try {
            aObj.validate("07T925350");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9533_good() {
        // Validate 
        try {
            aObj.validate("071925376");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9534_bad() {
        // Validate 
        try {
            aObj.validate("07#925376");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9535_good() {
        // Validate 
        try {
            aObj.validate("071925389");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9536_bad() {
        // Validate 
        try {
            aObj.validate("07192389");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9537_good() {
        // Validate 
        try {
            aObj.validate("071925392");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9538_bad() {
        // Validate 
        try {
            aObj.validate("071Q25392");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9539_good() {
        // Validate 
        try {
            aObj.validate("071925402");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9540_bad() {
        // Validate 
        try {
            aObj.validate("071925®02");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9541_good() {
        // Validate 
        try {
            aObj.validate("071925431");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9542_bad() {
        // Validate 
        try {
            aObj.validate("0719254e1");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9543_good() {
        // Validate 
        try {
            aObj.validate("071925444");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9544_bad() {
        // Validate 
        try {
            aObj.validate("0719254Ô4");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9545_good() {
        // Validate 
        try {
            aObj.validate("071925457");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9546_bad() {
        // Validate 
        try {
            aObj.validate("07192545)");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9547_good() {
        // Validate 
        try {
            aObj.validate("071925460");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9548_bad() {
        // Validate 
        try {
            aObj.validate("0w1925460");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9549_good() {
        // Validate 
        try {
            aObj.validate("071925509");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9550_bad() {
        // Validate 
        try {
            aObj.validate("07925509");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9551_good() {
        // Validate 
        try {
            aObj.validate("071925525");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9552_bad() {
        // Validate 
        try {
            aObj.validate("071¹25525");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9553_good() {
        // Validate 
        try {
            aObj.validate("071925538");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9554_bad() {
        // Validate 
        try {
            aObj.validate("071925¾38");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9555_good() {
        // Validate 
        try {
            aObj.validate("071925541");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9556_bad() {
        // Validate 
        try {
            aObj.validate("01925541");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9557_good() {
        // Validate 
        try {
            aObj.validate("071925554");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9558_bad() {
        // Validate 
        try {
            aObj.validate("01925554");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9559_good() {
        // Validate 
        try {
            aObj.validate("071925567");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9560_bad() {
        // Validate 
        try {
            aObj.validate("071925[67");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9561_good() {
        // Validate 
        try {
            aObj.validate("071925596");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9562_bad() {
        // Validate 
        try {
            aObj.validate("07192ß596");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9563_good() {
        // Validate 
        try {
            aObj.validate("071925635");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9564_bad() {
        // Validate 
        try {
            aObj.validate("0719256!5");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9565_good() {
        // Validate 
        try {
            aObj.validate("071925651");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9566_bad() {
        // Validate 
        try {
            aObj.validate("071925661");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9567_good() {
        // Validate 
        try {
            aObj.validate("071925677");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9568_bad() {
        // Validate 
        try {
            aObj.validate("07Þ925677");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9569_good() {
        // Validate 
        try {
            aObj.validate("071925680");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9570_bad() {
        // Validate 
        try {
            aObj.validate("01925680");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9571_good() {
        // Validate 
        try {
            aObj.validate("071925693");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9572_bad() {
        // Validate 
        try {
            aObj.validate("0719ª5693");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9573_good() {
        // Validate 
        try {
            aObj.validate("071925716");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9574_bad() {
        // Validate 
        try {
            aObj.validate("07925716");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9575_good() {
        // Validate 
        try {
            aObj.validate("071925745");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9576_bad() {
        // Validate 
        try {
            aObj.validate("0719½5745");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9577_good() {
        // Validate 
        try {
            aObj.validate("071925758");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9578_bad() {
        // Validate 
        try {
            aObj.validate("071925756");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9579_good() {
        // Validate 
        try {
            aObj.validate("071925787");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9580_bad() {
        // Validate 
        try {
            aObj.validate("0719257Î7");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9581_good() {
        // Validate 
        try {
            aObj.validate("071925826");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9582_bad() {
        // Validate 
        try {
            aObj.validate("07192526");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9583_good() {
        // Validate 
        try {
            aObj.validate("071925839");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9584_bad() {
        // Validate 
        try {
            aObj.validate("07925839");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9585_good() {
        // Validate 
        try {
            aObj.validate("071925855");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9586_bad() {
        // Validate 
        try {
            aObj.validate("07192855");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9587_good() {
        // Validate 
        try {
            aObj.validate("071925871");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9588_bad() {
        // Validate 
        try {
            aObj.validate("07192587~");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9589_good() {
        // Validate 
        try {
            aObj.validate("071925884");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9590_bad() {
        // Validate 
        try {
            aObj.validate("07192588É");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9591_good() {
        // Validate 
        try {
            aObj.validate("071925923");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9592_bad() {
        // Validate 
        try {
            aObj.validate("0719A5923");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9593_good() {
        // Validate 
        try {
            aObj.validate("071925965");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9594_bad() {
        // Validate 
        try {
            aObj.validate("07192596|");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9595_good() {
        // Validate 
        try {
            aObj.validate("071925981");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9596_bad() {
        // Validate 
        try {
            aObj.validate("07195981");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9597_good() {
        // Validate 
        try {
            aObj.validate("071926016");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9598_bad() {
        // Validate 
        try {
            aObj.validate("07192601º");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9599_good() {
        // Validate 
        try {
            aObj.validate("071926045");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9600_bad() {
        // Validate 
        try {
            aObj.validate("07192604·");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9601_good() {
        // Validate 
        try {
            aObj.validate("071926058");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9602_bad() {
        // Validate 
        try {
            aObj.validate("071+26058");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9603_good() {
        // Validate 
        try {
            aObj.validate("071926061");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9604_bad() {
        // Validate 
        try {
            aObj.validate("0719?6061");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9605_good() {
        // Validate 
        try {
            aObj.validate("071926087");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9606_bad() {
        // Validate 
        try {
            aObj.validate("07Ô926087");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9607_good() {
        // Validate 
        try {
            aObj.validate("071926090");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9608_bad() {
        // Validate 
        try {
            aObj.validate("0719260f0");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9609_good() {
        // Validate 
        try {
            aObj.validate("071926155");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9610_bad() {
        // Validate 
        try {
            aObj.validate("0719t6155");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9611_good() {
        // Validate 
        try {
            aObj.validate("071926184");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9612_bad() {
        // Validate 
        try {
            aObj.validate("0=1926184");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9613_good() {
        // Validate 
        try {
            aObj.validate("071926197");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9614_bad() {
        // Validate 
        try {
            aObj.validate("07926197");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9615_good() {
        // Validate 
        try {
            aObj.validate("071926210");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9616_bad() {
        // Validate 
        try {
            aObj.validate("071°26210");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9617_good() {
        // Validate 
        try {
            aObj.validate("071926249");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9618_bad() {
        // Validate 
        try {
            aObj.validate("07192c249");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9619_good() {
        // Validate 
        try {
            aObj.validate("071926252");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9620_bad() {
        // Validate 
        try {
            aObj.validate("07192625g");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9621_good() {
        // Validate 
        try {
            aObj.validate("071926281");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9622_bad() {
        // Validate 
        try {
            aObj.validate("07192628d");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9623_good() {
        // Validate 
        try {
            aObj.validate("071926320");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9624_bad() {
        // Validate 
        try {
            aObj.validate("031926320");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9625_good() {
        // Validate 
        try {
            aObj.validate("071926333");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9626_bad() {
        // Validate 
        try {
            aObj.validate("07196333");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9627_good() {
        // Validate 
        try {
            aObj.validate("071926362");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9628_bad() {
        // Validate 
        try {
            aObj.validate("07ª926362");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9629_good() {
        // Validate 
        try {
            aObj.validate("071926375");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9630_bad() {
        // Validate 
        try {
            aObj.validate("0Å1926375");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9631_good() {
        // Validate 
        try {
            aObj.validate("071926391");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9632_bad() {
        // Validate 
        try {
            aObj.validate("07192391");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9633_good() {
        // Validate 
        try {
            aObj.validate("071926430");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9634_bad() {
        // Validate 
        try {
            aObj.validate("07126430");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9635_good() {
        // Validate 
        try {
            aObj.validate("071926443");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9636_bad() {
        // Validate 
        try {
            aObj.validate("07926443");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9637_good() {
        // Validate 
        try {
            aObj.validate("071926456");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9638_bad() {
        // Validate 
        try {
            aObj.validate("0719i6456");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9639_good() {
        // Validate 
        try {
            aObj.validate("071926472");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9640_bad() {
        // Validate 
        try {
            aObj.validate("0[1926472");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9641_good() {
        // Validate 
        try {
            aObj.validate("071926508");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9642_bad() {
        // Validate 
        try {
            aObj.validate("0719265´8");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9643_good() {
        // Validate 
        try {
            aObj.validate("071926511");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9644_bad() {
        // Validate 
        try {
            aObj.validate("07926511");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9645_good() {
        // Validate 
        try {
            aObj.validate("071926553");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9646_bad() {
        // Validate 
        try {
            aObj.validate("07192653");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9647_good() {
        // Validate 
        try {
            aObj.validate("071926566");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9648_bad() {
        // Validate 
        try {
            aObj.validate("01926566");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9649_good() {
        // Validate 
        try {
            aObj.validate("071926582");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9650_bad() {
        // Validate 
        try {
            aObj.validate("07192658z");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9651_good() {
        // Validate 
        try {
            aObj.validate("071926618");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9652_bad() {
        // Validate 
        try {
            aObj.validate("07r926618");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9653_good() {
        // Validate 
        try {
            aObj.validate("071926634");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9654_bad() {
        // Validate 
        try {
            aObj.validate("07#926634");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9655_good() {
        // Validate 
        try {
            aObj.validate("071926650");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9656_bad() {
        // Validate 
        try {
            aObj.validate("0719266¨0");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9657_good() {
        // Validate 
        try {
            aObj.validate("071926676");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9658_bad() {
        // Validate 
        try {
            aObj.validate("07192667");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9659_good() {
        // Validate 
        try {
            aObj.validate("071926692");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9660_bad() {
        // Validate 
        try {
            aObj.validate("0719P6692");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9661_good() {
        // Validate 
        try {
            aObj.validate("071926715");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9662_bad() {
        // Validate 
        try {
            aObj.validate("0719x6715");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9663_good() {
        // Validate 
        try {
            aObj.validate("071926731");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9664_bad() {
        // Validate 
        try {
            aObj.validate("07192673N");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9665_good() {
        // Validate 
        try {
            aObj.validate("071926809");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9666_bad() {
        // Validate 
        try {
            aObj.validate("07192680L");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9667_good() {
        // Validate 
        try {
            aObj.validate("071926854");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9668_bad() {
        // Validate 
        try {
            aObj.validate("071926Ö54");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9669_good() {
        // Validate 
        try {
            aObj.validate("071926867");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9670_bad() {
        // Validate 
        try {
            aObj.validate("071926Ñ67");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9671_good() {
        // Validate 
        try {
            aObj.validate("071926870");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9672_bad() {
        // Validate 
        try {
            aObj.validate("07196870");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9673_good() {
        // Validate 
        try {
            aObj.validate("071926919");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9674_bad() {
        // Validate 
        try {
            aObj.validate("07192Z919");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9675_good() {
        // Validate 
        try {
            aObj.validate("071926980");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9676_bad() {
        // Validate 
        try {
            aObj.validate("07´926980");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9677_good() {
        // Validate 
        try {
            aObj.validate("071927002");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9678_bad() {
        // Validate 
        try {
            aObj.validate("07192R002");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9679_good() {
        // Validate 
        try {
            aObj.validate("071927060");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9680_bad() {
        // Validate 
        try {
            aObj.validate("07Ä927060");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9681_good() {
        // Validate 
        try {
            aObj.validate("071974372");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9682_bad() {
        // Validate 
        try {
            aObj.validate("07197432");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9683_good() {
        // Validate 
        try {
            aObj.validate("071974408");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9684_bad() {
        // Validate 
        try {
            aObj.validate("07197440");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9685_good() {
        // Validate 
        try {
            aObj.validate("071974440");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9686_bad() {
        // Validate 
        try {
            aObj.validate("07194440");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9687_good() {
        // Validate 
        try {
            aObj.validate("071974466");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9688_bad() {
        // Validate 
        try {
            aObj.validate("0719T4466");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9689_good() {
        // Validate 
        try {
            aObj.validate("071974479");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9690_bad() {
        // Validate 
        try {
            aObj.validate("07974479");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9691_good() {
        // Validate 
        try {
            aObj.validate("071974505");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9692_bad() {
        // Validate 
        try {
            aObj.validate("07197450");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9693_good() {
        // Validate 
        try {
            aObj.validate("071993159");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9694_bad() {
        // Validate 
        try {
            aObj.validate("07}993159");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9695_good() {
        // Validate 
        try {
            aObj.validate("071993162");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9696_bad() {
        // Validate 
        try {
            aObj.validate("071¤93162");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9697_good() {
        // Validate 
        try {
            aObj.validate("071993214");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9698_bad() {
        // Validate 
        try {
            aObj.validate("071993`14");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9699_good() {
        // Validate 
        try {
            aObj.validate("071993324");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9700_bad() {
        // Validate 
        try {
            aObj.validate("0719[3324");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9701_good() {
        // Validate 
        try {
            aObj.validate("071993340");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9702_bad() {
        // Validate 
        try {
            aObj.validate("071993º40");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9703_good() {
        // Validate 
        try {
            aObj.validate("072000096");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9704_bad() {
        // Validate 
        try {
            aObj.validate("07200006");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9705_good() {
        // Validate 
        try {
            aObj.validate("072000326");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9706_bad() {
        // Validate 
        try {
            aObj.validate("07000326");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9707_good() {
        // Validate 
        try {
            aObj.validate("072000339");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9708_bad() {
        // Validate 
        try {
            aObj.validate("071000339");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9709_good() {
        // Validate 
        try {
            aObj.validate("072000805");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9710_bad() {
        // Validate 
        try {
            aObj.validate("07200080");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9711_good() {
        // Validate 
        try {
            aObj.validate("072000915");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9712_bad() {
        // Validate 
        try {
            aObj.validate("072000(15");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9713_good() {
        // Validate 
        try {
            aObj.validate("072001079");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9714_bad() {
        // Validate 
        try {
            aObj.validate("072×01079");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9715_good() {
        // Validate 
        try {
            aObj.validate("072013915");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9716_bad() {
        // Validate 
        try {
            aObj.validate("07201915");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9717_good() {
        // Validate 
        try {
            aObj.validate("072400052");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9718_bad() {
        // Validate 
        try {
            aObj.validate("0724000c2");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9719_good() {
        // Validate 
        try {
            aObj.validate("072400337");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9720_bad() {
        // Validate 
        try {
            aObj.validate("07240033®");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9721_good() {
        // Validate 
        try {
            aObj.validate("072400353");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9722_bad() {
        // Validate 
        try {
            aObj.validate("07400353");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9723_good() {
        // Validate 
        try {
            aObj.validate("072400421");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9724_bad() {
        // Validate 
        try {
            aObj.validate("072x00421");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9725_good() {
        // Validate 
        try {
            aObj.validate("072400447");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9726_bad() {
        // Validate 
        try {
            aObj.validate("0724004h7");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9727_good() {
        // Validate 
        try {
            aObj.validate("072400528");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9728_bad() {
        // Validate 
        try {
            aObj.validate("0724­0528");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9729_good() {
        // Validate 
        try {
            aObj.validate("072400670");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9730_bad() {
        // Validate 
        try {
            aObj.validate("07400670");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9731_good() {
        // Validate 
        try {
            aObj.validate("072400858");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9732_bad() {
        // Validate 
        try {
            aObj.validate("07200858");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9733_good() {
        // Validate 
        try {
            aObj.validate("072401006");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9734_bad() {
        // Validate 
        try {
            aObj.validate("07240!006");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9735_good() {
        // Validate 
        try {
            aObj.validate("072401035");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9736_bad() {
        // Validate 
        try {
            aObj.validate("072401p35");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9737_good() {
        // Validate 
        try {
            aObj.validate("072401048");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9738_bad() {
        // Validate 
        try {
            aObj.validate("07240108");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9739_good() {
        // Validate 
        try {
            aObj.validate("072401064");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9740_bad() {
        // Validate 
        try {
            aObj.validate("07_401064");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9741_good() {
        // Validate 
        try {
            aObj.validate("072401404");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9742_bad() {
        // Validate 
        try {
            aObj.validate("07401404");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9743_good() {
        // Validate 
        try {
            aObj.validate("072401514");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9744_bad() {
        // Validate 
        try {
            aObj.validate("07240154");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9745_good() {
        // Validate 
        try {
            aObj.validate("072401530");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9746_bad() {
        // Validate 
        try {
            aObj.validate("07241530");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9747_good() {
        // Validate 
        try {
            aObj.validate("072401585");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9748_bad() {
        // Validate 
        try {
            aObj.validate("07-401585");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9749_good() {
        // Validate 
        try {
            aObj.validate("072401608");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9750_bad() {
        // Validate 
        try {
            aObj.validate("07240108");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9751_good() {
        // Validate 
        try {
            aObj.validate("072401682");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9752_bad() {
        // Validate 
        try {
            aObj.validate("07=401682");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9753_good() {
        // Validate 
        try {
            aObj.validate("072401705");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9754_bad() {
        // Validate 
        try {
            aObj.validate("07401705");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9755_good() {
        // Validate 
        try {
            aObj.validate("072401789");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9756_bad() {
        // Validate 
        try {
            aObj.validate("07£401789");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9757_good() {
        // Validate 
        try {
            aObj.validate("072401831");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9758_bad() {
        // Validate 
        try {
            aObj.validate("02401831");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9759_good() {
        // Validate 
        try {
            aObj.validate("072402034");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9760_bad() {
        // Validate 
        try {
            aObj.validate("07&402034");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9761_good() {
        // Validate 
        try {
            aObj.validate("072402076");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9762_bad() {
        // Validate 
        try {
            aObj.validate("07Ö402076");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9763_good() {
        // Validate 
        try {
            aObj.validate("072402115");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9764_bad() {
        // Validate 
        try {
            aObj.validate("07240211±");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9765_good() {
        // Validate 
        try {
            aObj.validate("072402157");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9766_bad() {
        // Validate 
        try {
            aObj.validate("07240257");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9767_good() {
        // Validate 
        try {
            aObj.validate("072402199");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9768_bad() {
        // Validate 
        try {
            aObj.validate("072402198");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9769_good() {
        // Validate 
        try {
            aObj.validate("072402212");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9770_bad() {
        // Validate 
        try {
            aObj.validate("072402272");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9771_good() {
        // Validate 
        try {
            aObj.validate("072402283");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9772_bad() {
        // Validate 
        try {
            aObj.validate("0724022½3");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9773_good() {
        // Validate 
        try {
            aObj.validate("072402348");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9774_bad() {
        // Validate 
        try {
            aObj.validate("07402348");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9775_good() {
        // Validate 
        try {
            aObj.validate("072402364");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9776_bad() {
        // Validate 
        try {
            aObj.validate("0E2402364");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9777_good() {
        // Validate 
        try {
            aObj.validate("072402610");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9778_bad() {
        // Validate 
        try {
            aObj.validate("07402610");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9779_good() {
        // Validate 
        try {
            aObj.validate("072402652");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9780_bad() {
        // Validate 
        try {
            aObj.validate("07240262");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9781_good() {
        // Validate 
        try {
            aObj.validate("072402665");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9782_bad() {
        // Validate 
        try {
            aObj.validate("0Ç2402665");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9783_good() {
        // Validate 
        try {
            aObj.validate("072402694");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9784_bad() {
        // Validate 
        try {
            aObj.validate("0¢2402694");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9785_good() {
        // Validate 
        try {
            aObj.validate("072402704");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9786_bad() {
        // Validate 
        try {
            aObj.validate("07240-704");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9787_good() {
        // Validate 
        try {
            aObj.validate("072402788");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9788_bad() {
        // Validate 
        try {
            aObj.validate("0724+2788");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9789_good() {
        // Validate 
        try {
            aObj.validate("072402856");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9790_bad() {
        // Validate 
        try {
            aObj.validate("07N402856");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9791_good() {
        // Validate 
        try {
            aObj.validate("072402869");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9792_bad() {
        // Validate 
        try {
            aObj.validate("0724028`9");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9793_good() {
        // Validate 
        try {
            aObj.validate("072403004");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9794_bad() {
        // Validate 
        try {
            aObj.validate("07240300M");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9795_good() {
        // Validate 
        try {
            aObj.validate("072403046");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9796_bad() {
        // Validate 
        try {
            aObj.validate("072403446");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9797_good() {
        // Validate 
        try {
            aObj.validate("072403211");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9798_bad() {
        // Validate 
        try {
            aObj.validate("0724a3211");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9799_good() {
        // Validate 
        try {
            aObj.validate("072403347");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9800_bad() {
        // Validate 
        try {
            aObj.validate("0F2403347");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9801_good() {
        // Validate 
        try {
            aObj.validate("072403350");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9802_bad() {
        // Validate 
        try {
            aObj.validate("072v03350");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9803_good() {
        // Validate 
        try {
            aObj.validate("072403402");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9804_bad() {
        // Validate 
        try {
            aObj.validate("072r03402");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9805_good() {
        // Validate 
        try {
            aObj.validate("072403473");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9806_bad() {
        // Validate 
        try {
            aObj.validate("0Ä2403473");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9807_good() {
        // Validate 
        try {
            aObj.validate("072403554");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9808_bad() {
        // Validate 
        try {
            aObj.validate("07240554");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9809_good() {
        // Validate 
        try {
            aObj.validate("072403635");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9810_bad() {
        // Validate 
        try {
            aObj.validate("07240363[");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9811_good() {
        // Validate 
        try {
            aObj.validate("072403677");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9812_bad() {
        // Validate 
        try {
            aObj.validate("07203677");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9813_good() {
        // Validate 
        try {
            aObj.validate("072403907");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9814_bad() {
        // Validate 
        try {
            aObj.validate("07ß403907");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9815_good() {
        // Validate 
        try {
            aObj.validate("072403978");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9816_bad() {
        // Validate 
        try {
            aObj.validate("0724039«8");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9817_good() {
        // Validate 
        try {
            aObj.validate("072403994");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9818_bad() {
        // Validate 
        try {
            aObj.validate("07240394");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9819_good() {
        // Validate 
        try {
            aObj.validate("072404058");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9820_bad() {
        // Validate 
        try {
            aObj.validate("07240405");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9821_good() {
        // Validate 
        try {
            aObj.validate("072404142");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9822_bad() {
        // Validate 
        try {
            aObj.validate("07240414");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9823_good() {
        // Validate 
        try {
            aObj.validate("072404197");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9824_bad() {
        // Validate 
        try {
            aObj.validate("07240©197");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9825_good() {
        // Validate 
        try {
            aObj.validate("072404320");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9826_bad() {
        // Validate 
        try {
            aObj.validate("072404®20");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9827_good() {
        // Validate 
        try {
            aObj.validate("072404333");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9828_bad() {
        // Validate 
        try {
            aObj.validate("07240;333");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9829_good() {
        // Validate 
        try {
            aObj.validate("072404485");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9830_bad() {
        // Validate 
        try {
            aObj.validate("07240Q485");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9831_good() {
        // Validate 
        try {
            aObj.validate("072404508");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9832_bad() {
        // Validate 
        try {
            aObj.validate("072404>08");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9833_good() {
        // Validate 
        try {
            aObj.validate("072404650");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9834_bad() {
        // Validate 
        try {
            aObj.validate("0724[4650");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9835_good() {
        // Validate 
        try {
            aObj.validate("072404757");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9836_bad() {
        // Validate 
        try {
            aObj.validate("0724047'7");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9837_good() {
        // Validate 
        try {
            aObj.validate("072404786");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9838_bad() {
        // Validate 
        try {
            aObj.validate("0724047W6");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9839_good() {
        // Validate 
        try {
            aObj.validate("072404841");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9840_bad() {
        // Validate 
        try {
            aObj.validate("02404841");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9841_good() {
        // Validate 
        try {
            aObj.validate("072404867");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9842_bad() {
        // Validate 
        try {
            aObj.validate("072404¢67");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9843_good() {
        // Validate 
        try {
            aObj.validate("072404883");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9844_bad() {
        // Validate 
        try {
            aObj.validate("0724;4883");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9845_good() {
        // Validate 
        try {
            aObj.validate("072404948");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9846_bad() {
        // Validate 
        try {
            aObj.validate("072404>48");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9847_good() {
        // Validate 
        try {
            aObj.validate("072404977");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9848_bad() {
        // Validate 
        try {
            aObj.validate("07244977");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9849_good() {
        // Validate 
        try {
            aObj.validate("072404993");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9850_bad() {
        // Validate 
        try {
            aObj.validate("072Ã04993");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9851_good() {
        // Validate 
        try {
            aObj.validate("072405167");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9852_bad() {
        // Validate 
        try {
            aObj.validate("0724051®7");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9853_good() {
        // Validate 
        try {
            aObj.validate("072405206");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9854_bad() {
        // Validate 
        try {
            aObj.validate("072405006");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9855_good() {
        // Validate 
        try {
            aObj.validate("072405280");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9856_bad() {
        // Validate 
        try {
            aObj.validate("072]05280");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9857_good() {
        // Validate 
        try {
            aObj.validate("072405442");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9858_bad() {
        // Validate 
        try {
            aObj.validate("0724054R2");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9859_good() {
        // Validate 
        try {
            aObj.validate("072405455");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9860_bad() {
        // Validate 
        try {
            aObj.validate("07245455");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9861_good() {
        // Validate 
        try {
            aObj.validate("072405604");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9862_bad() {
        // Validate 
        try {
            aObj.validate("072400604");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9863_good() {
        // Validate 
        try {
            aObj.validate("072405620");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9864_bad() {
        // Validate 
        try {
            aObj.validate("02405620");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9865_good() {
        // Validate 
        try {
            aObj.validate("072405662");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9866_bad() {
        // Validate 
        try {
            aObj.validate("07245662");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9867_good() {
        // Validate 
        try {
            aObj.validate("072405688");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9868_bad() {
        // Validate 
        try {
            aObj.validate("072475688");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9869_good() {
        // Validate 
        try {
            aObj.validate("072405743");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9870_bad() {
        // Validate 
        try {
            aObj.validate("0¾2405743");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9871_good() {
        // Validate 
        try {
            aObj.validate("072406412");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9872_bad() {
        // Validate 
        try {
            aObj.validate("0*2406412");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9873_good() {
        // Validate 
        try {
            aObj.validate("072406506");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9874_bad() {
        // Validate 
        try {
            aObj.validate("0724065\6");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9875_good() {
        // Validate 
        try {
            aObj.validate("072406522");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9876_bad() {
        // Validate 
        try {
            aObj.validate("07w406522");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9877_good() {
        // Validate 
        try {
            aObj.validate("072406768");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9878_bad() {
        // Validate 
        try {
            aObj.validate("07240676");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9879_good() {
        // Validate 
        try {
            aObj.validate("072406771");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9880_bad() {
        // Validate 
        try {
            aObj.validate("07406771");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9881_good() {
        // Validate 
        try {
            aObj.validate("072406865");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9882_bad() {
        // Validate 
        try {
            aObj.validate("0{2406865");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9883_good() {
        // Validate 
        try {
            aObj.validate("072406975");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9884_bad() {
        // Validate 
        try {
            aObj.validate("07240697(");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9885_good() {
        // Validate 
        try {
            aObj.validate("072407000");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9886_bad() {
        // Validate 
        try {
            aObj.validate("07247000");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9887_good() {
        // Validate 
        try {
            aObj.validate("072407084");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9888_bad() {
        // Validate 
        try {
            aObj.validate("07207084");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9889_good() {
        // Validate 
        try {
            aObj.validate("072407110");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9890_bad() {
        // Validate 
        try {
            aObj.validate("0n2407110");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9891_good() {
        // Validate 
        try {
            aObj.validate("072407123");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9892_bad() {
        // Validate 
        try {
            aObj.validate("07240723");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9893_good() {
        // Validate 
        try {
            aObj.validate("072407495");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9894_bad() {
        // Validate 
        try {
            aObj.validate("072407×95");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9895_good() {
        // Validate 
        try {
            aObj.validate("072407660");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9896_bad() {
        // Validate 
        try {
            aObj.validate("02407660");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9897_good() {
        // Validate 
        try {
            aObj.validate("072407741");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9898_bad() {
        // Validate 
        try {
            aObj.validate("072707741");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9899_good() {
        // Validate 
        try {
            aObj.validate("072407929");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9900_bad() {
        // Validate 
        try {
            aObj.validate("0724079Î9");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9901_good() {
        // Validate 
        try {
            aObj.validate("072407987");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9902_bad() {
        // Validate 
        try {
            aObj.validate("07407987");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9903_good() {
        // Validate 
        try {
            aObj.validate("072408232");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9904_bad() {
        // Validate 
        try {
            aObj.validate("07240823:");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9905_good() {
        // Validate 
        try {
            aObj.validate("072408274");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9906_bad() {
        // Validate 
        try {
            aObj.validate("0724Z8274");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9907_good() {
        // Validate 
        try {
            aObj.validate("072408290");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9908_bad() {
        // Validate 
        try {
            aObj.validate("072408210");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9909_good() {
        // Validate 
        try {
            aObj.validate("072408436");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9910_bad() {
        // Validate 
        try {
            aObj.validate("0724084Û6");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9911_good() {
        // Validate 
        try {
            aObj.validate("072408504");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9912_bad() {
        // Validate 
        try {
            aObj.validate("07¥408504");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9913_good() {
        // Validate 
        try {
            aObj.validate("072408546");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9914_bad() {
        // Validate 
        try {
            aObj.validate("07240854");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9915_good() {
        // Validate 
        try {
            aObj.validate("072408708");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9916_bad() {
        // Validate 
        try {
            aObj.validate("072408709");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9917_good() {
        // Validate 
        try {
            aObj.validate("072408805");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9918_bad() {
        // Validate 
        try {
            aObj.validate("07240¼805");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9919_good() {
        // Validate 
        try {
            aObj.validate("072408892");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9920_bad() {
        // Validate 
        try {
            aObj.validate("07408892");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9921_good() {
        // Validate 
        try {
            aObj.validate("072409464");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9922_bad() {
        // Validate 
        try {
            aObj.validate("07Ê409464");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9923_good() {
        // Validate 
        try {
            aObj.validate("072409794");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9924_bad() {
        // Validate 
        try {
            aObj.validate("072409u94");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9925_good() {
        // Validate 
        try {
            aObj.validate("072409888");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9926_bad() {
        // Validate 
        try {
            aObj.validate("0724098{8");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9927_good() {
        // Validate 
        try {
            aObj.validate("072410013");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9928_bad() {
        // Validate 
        try {
            aObj.validate("0P2410013");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9929_good() {
        // Validate 
        try {
            aObj.validate("072410123");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9930_bad() {
        // Validate 
        try {
            aObj.validate("07241012Q");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9931_good() {
        // Validate 
        try {
            aObj.validate("072410165");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9932_bad() {
        // Validate 
        try {
            aObj.validate("07410165");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9933_good() {
        // Validate 
        try {
            aObj.validate("072410194");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9934_bad() {
        // Validate 
        try {
            aObj.validate("07241094");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9935_good() {
        // Validate 
        try {
            aObj.validate("072410343");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9936_bad() {
        // Validate 
        try {
            aObj.validate("0724103-3");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9937_good() {
        // Validate 
        try {
            aObj.validate("072410550");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9938_bad() {
        // Validate 
        try {
            aObj.validate("072010550");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9939_good() {
        // Validate 
        try {
            aObj.validate("072410903");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9940_bad() {
        // Validate 
        try {
            aObj.validate("02410903");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9941_good() {
        // Validate 
        try {
            aObj.validate("072410929");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9942_bad() {
        // Validate 
        try {
            aObj.validate("072410³29");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9943_good() {
        // Validate 
        try {
            aObj.validate("072411025");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9944_bad() {
        // Validate 
        try {
            aObj.validate("07411025");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9945_good() {
        // Validate 
        try {
            aObj.validate("072411436");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9946_bad() {
        // Validate 
        try {
            aObj.validate("0724W1436");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9947_good() {
        // Validate 
        try {
            aObj.validate("072411643");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9948_bad() {
        // Validate 
        try {
            aObj.validate("07241Ù643");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9949_good() {
        // Validate 
        try {
            aObj.validate("072411708");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9950_bad() {
        // Validate 
        try {
            aObj.validate("07241170°");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9951_good() {
        // Validate 
        try {
            aObj.validate("072412008");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9952_bad() {
        // Validate 
        try {
            aObj.validate("07241200Ë");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9953_good() {
        // Validate 
        try {
            aObj.validate("072412037");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9954_bad() {
        // Validate 
        try {
            aObj.validate("072412£37");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9955_good() {
        // Validate 
        try {
            aObj.validate("072412176");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9956_bad() {
        // Validate 
        try {
            aObj.validate("0Z2412176");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9957_good() {
        // Validate 
        try {
            aObj.validate("072412354");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9958_bad() {
        // Validate 
        try {
            aObj.validate("07212354");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9959_good() {
        // Validate 
        try {
            aObj.validate("072412435");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9960_bad() {
        // Validate 
        try {
            aObj.validate("07241243Ù");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9961_good() {
        // Validate 
        try {
            aObj.validate("072412655");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9962_bad() {
        // Validate 
        try {
            aObj.validate("07241255");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9963_good() {
        // Validate 
        try {
            aObj.validate("072412778");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9964_bad() {
        // Validate 
        try {
            aObj.validate("07412778");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9965_good() {
        // Validate 
        try {
            aObj.validate("072412927");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9966_bad() {
        // Validate 
        try {
            aObj.validate("072y12927");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9967_good() {
        // Validate 
        try {
            aObj.validate("072412972");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9968_bad() {
        // Validate 
        try {
            aObj.validate("07241'972");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9969_good() {
        // Validate 
        try {
            aObj.validate("072412985");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9970_bad() {
        // Validate 
        try {
            aObj.validate("07241295");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9971_good() {
        // Validate 
        try {
            aObj.validate("072413036");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9972_bad() {
        // Validate 
        try {
            aObj.validate("0¾2413036");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9973_good() {
        // Validate 
        try {
            aObj.validate("072413104");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9974_bad() {
        // Validate 
        try {
            aObj.validate("07413104");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9975_good() {
        // Validate 
        try {
            aObj.validate("072413133");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9976_bad() {
        // Validate 
        try {
            aObj.validate("07241X133");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9977_good() {
        // Validate 
        try {
            aObj.validate("072413175");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9978_bad() {
        // Validate 
        try {
            aObj.validate("074413175");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9979_good() {
        // Validate 
        try {
            aObj.validate("072413201");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9980_bad() {
        // Validate 
        try {
            aObj.validate("07213201");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9981_good() {
        // Validate 
        try {
            aObj.validate("072413227");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9982_bad() {
        // Validate 
        try {
            aObj.validate("0724132e7");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9983_good() {
        // Validate 
        try {
            aObj.validate("072413256");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9984_bad() {
        // Validate 
        try {
            aObj.validate("07241325");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9985_good() {
        // Validate 
        try {
            aObj.validate("072413285");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9986_bad() {
        // Validate 
        try {
            aObj.validate("07413285");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9987_good() {
        // Validate 
        try {
            aObj.validate("072413298");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9988_bad() {
        // Validate 
        try {
            aObj.validate("072483298");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9989_good() {
        // Validate 
        try {
            aObj.validate("072413421");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9990_bad() {
        // Validate 
        try {
            aObj.validate("072413¸21");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9991_good() {
        // Validate 
        try {
            aObj.validate("072413450");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9992_bad() {
        // Validate 
        try {
            aObj.validate("07243450");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9993_good() {
        // Validate 
        try {
            aObj.validate("072413557");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9994_bad() {
        // Validate 
        try {
            aObj.validate("07213557");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9995_good() {
        // Validate 
        try {
            aObj.validate("072413560");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9996_bad() {
        // Validate 
        try {
            aObj.validate("0724135H0");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9997_good() {
        // Validate 
        try {
            aObj.validate("072413586");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }

    public void testAbaNumberCheck_9998_bad() {
        // Validate 
        try {
            aObj.validate("02413586");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return. 
            return;
        }
        // If it gets here its bad 
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_9999_good() {
        // Validate 
        try {
            aObj.validate("072413599");
        } catch (AbaRouteValidationException e) {
            // This should not have happened 
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing! 
        assertTrue(true);
    }


}


//~ Formatted by Jindent --- http://www.jindent.com
