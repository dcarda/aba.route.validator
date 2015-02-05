package com.cardatechnologies.utils.validators.abaroutevalidator;

//~--- non-JDK imports --------------------------------------------------------

import com.cardatechnologies.utils.validators.abaroutevalidator.exceptions.AbaRouteValidationException;
import junit.framework.TestCase;

//~--- JDK imports ------------------------------------------------------------

/**
 * Unit test for simple App.
 */
public class Test_AbaRouteValidator_03 extends TestCase {
    AbaRouteValidator aObj;

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public Test_AbaRouteValidator_03(String testName) {
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


    public void testAbaNumberCheck_2500_bad() {
        // Validate
        try {
            aObj.validate("0]1201350");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2501_good() {
        // Validate
        try {
            aObj.validate("041201512");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2502_bad() {
        // Validate
        try {
            aObj.validate("04201512");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2503_good() {
        // Validate
        try {
            aObj.validate("041201635");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2504_bad() {
        // Validate
        try {
            aObj.validate("0412016Ò5");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2505_good() {
        // Validate
        try {
            aObj.validate("041201703");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2506_bad() {
        // Validate
        try {
            aObj.validate("0'1201703");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2507_good() {
        // Validate
        try {
            aObj.validate("041201813");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2508_bad() {
        // Validate
        try {
            aObj.validate("04120113");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2509_good() {
        // Validate
        try {
            aObj.validate("041201936");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2510_bad() {
        // Validate
        try {
            aObj.validate("04201936");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2511_good() {
        // Validate
        try {
            aObj.validate("041201994");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2512_bad() {
        // Validate
        try {
            aObj.validate("041d01994");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2513_good() {
        // Validate
        try {
            aObj.validate("041202003");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2514_bad() {
        // Validate
        try {
            aObj.validate("041202y03");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2515_good() {
        // Validate
        try {
            aObj.validate("041202113");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2516_bad() {
        // Validate
        try {
            aObj.validate("04120213");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2517_good() {
        // Validate
        try {
            aObj.validate("041202443");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2518_bad() {
        // Validate
        try {
            aObj.validate("04120s443");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2519_good() {
        // Validate
        try {
            aObj.validate("041202511");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2520_bad() {
        // Validate
        try {
            aObj.validate("0412Ú2511");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2521_good() {
        // Validate
        try {
            aObj.validate("041202540");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2522_bad() {
        // Validate
        try {
            aObj.validate("0412025É0");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2523_good() {
        // Validate
        try {
            aObj.validate("041202582");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2524_bad() {
        // Validate
        try {
            aObj.validate("0G1202582");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2525_good() {
        // Validate
        try {
            aObj.validate("041202663");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2526_bad() {
        // Validate
        try {
            aObj.validate("041P02663");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2527_good() {
        // Validate
        try {
            aObj.validate("041202702");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2528_bad() {
        // Validate
        try {
            aObj.validate("0412#2702");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2529_good() {
        // Validate
        try {
            aObj.validate("041202744");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2530_bad() {
        // Validate
        try {
            aObj.validate("04120274");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2531_good() {
        // Validate
        try {
            aObj.validate("041202760");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2532_bad() {
        // Validate
        try {
            aObj.validate("04122760");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2533_good() {
        // Validate
        try {
            aObj.validate("041202812");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2534_bad() {
        // Validate
        try {
            aObj.validate("04120281<");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2535_good() {
        // Validate
        try {
            aObj.validate("041202922");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2536_bad() {
        // Validate
        try {
            aObj.validate("041202122");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2537_good() {
        // Validate
        try {
            aObj.validate("041202980");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2538_bad() {
        // Validate
        try {
            aObj.validate("04202980");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2539_good() {
        // Validate
        try {
            aObj.validate("041203374");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2540_bad() {
        // Validate
        try {
            aObj.validate("0412Å3374");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2541_good() {
        // Validate
        try {
            aObj.validate("041203400");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2542_bad() {
        // Validate
        try {
            aObj.validate("041603400");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2543_good() {
        // Validate
        try {
            aObj.validate("041203455");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2544_bad() {
        // Validate
        try {
            aObj.validate("0412034?5");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2545_good() {
        // Validate
        try {
            aObj.validate("041203594");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2546_bad() {
        // Validate
        try {
            aObj.validate("04120394");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2547_good() {
        // Validate
        try {
            aObj.validate("041203811");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2548_bad() {
        // Validate
        try {
            aObj.validate("04123811");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2549_good() {
        // Validate
        try {
            aObj.validate("041203824");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2550_bad() {
        // Validate
        try {
            aObj.validate("0412`3824");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2551_good() {
        // Validate
        try {
            aObj.validate("041203895");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2552_bad() {
        // Validate
        try {
            aObj.validate("0412038}5");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2553_good() {
        // Validate
        try {
            aObj.validate("041204166");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2554_bad() {
        // Validate
        try {
            aObj.validate("0¶1204166");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2555_good() {
        // Validate
        try {
            aObj.validate("041204713");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2556_bad() {
        // Validate
        try {
            aObj.validate("04104713");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2557_good() {
        // Validate
        try {
            aObj.validate("041204726");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2558_bad() {
        // Validate
        try {
            aObj.validate("04120476");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2559_good() {
        // Validate
        try {
            aObj.validate("041204739");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2560_bad() {
        // Validate
        try {
            aObj.validate("04104739");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2561_good() {
        // Validate
        try {
            aObj.validate("041204852");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2562_bad() {
        // Validate
        try {
            aObj.validate("031204852");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2563_good() {
        // Validate
        try {
            aObj.validate("041205246");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2564_bad() {
        // Validate
        try {
            aObj.validate("04125246");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2565_good() {
        // Validate
        try {
            aObj.validate("041205259");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2566_bad() {
        // Validate
        try {
            aObj.validate("0412W5259");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2567_good() {
        // Validate
        try {
            aObj.validate("041205518");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2568_bad() {
        // Validate
        try {
            aObj.validate("04120558");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2569_good() {
        // Validate
        try {
            aObj.validate("041205521");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2570_bad() {
        // Validate
        try {
            aObj.validate("04120£521");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2571_good() {
        // Validate
        try {
            aObj.validate("041205631");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2572_bad() {
        // Validate
        try {
            aObj.validate("04120531");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2573_good() {
        // Validate
        try {
            aObj.validate("041205673");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2574_bad() {
        // Validate
        try {
            aObj.validate("0412y5673");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2575_good() {
        // Validate
        try {
            aObj.validate("041205929");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2576_bad() {
        // Validate
        try {
            aObj.validate("04205929");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2577_good() {
        // Validate
        try {
            aObj.validate("041205958");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2578_bad() {
        // Validate
        try {
            aObj.validate("0C1205958");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2579_good() {
        // Validate
        try {
            aObj.validate("041206135");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2580_bad() {
        // Validate
        try {
            aObj.validate("0(1206135");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2581_good() {
        // Validate
        try {
            aObj.validate("041206436");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2582_bad() {
        // Validate
        try {
            aObj.validate("04120¡436");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2583_good() {
        // Validate
        try {
            aObj.validate("041206782");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2584_bad() {
        // Validate
        try {
            aObj.validate("04120678´");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2585_good() {
        // Validate
        try {
            aObj.validate("041206876");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2586_bad() {
        // Validate
        try {
            aObj.validate("04120687s");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2587_good() {
        // Validate
        try {
            aObj.validate("041207040");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2588_bad() {
        // Validate
        try {
            aObj.validate("04120u040");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2589_good() {
        // Validate
        try {
            aObj.validate("041207150");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2590_bad() {
        // Validate
        try {
            aObj.validate("0412.7150");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2591_good() {
        // Validate
        try {
            aObj.validate("041207341");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2592_bad() {
        // Validate
        try {
            aObj.validate("041207©41");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2593_good() {
        // Validate
        try {
            aObj.validate("041208421");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2594_bad() {
        // Validate
        try {
            aObj.validate("0Ø1208421");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2595_good() {
        // Validate
        try {
            aObj.validate("041208719");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2596_bad() {
        // Validate
        try {
            aObj.validate("04120871b");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2597_good() {
        // Validate
        try {
            aObj.validate("041208735");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2598_bad() {
        // Validate
        try {
            aObj.validate("04120875");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2599_good() {
        // Validate
        try {
            aObj.validate("041208748");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2600_bad() {
        // Validate
        try {
            aObj.validate("0w1208748");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2601_good() {
        // Validate
        try {
            aObj.validate("041208777");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2602_bad() {
        // Validate
        try {
            aObj.validate("04Ã208777");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2603_good() {
        // Validate
        try {
            aObj.validate("041208803");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2604_bad() {
        // Validate
        try {
            aObj.validate("04120Ú803");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2605_good() {
        // Validate
        try {
            aObj.validate("041209080");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2606_bad() {
        // Validate
        try {
            aObj.validate("04120q080");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2607_good() {
        // Validate
        try {
            aObj.validate("041209129");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2608_bad() {
        // Validate
        try {
            aObj.validate("04120129");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2609_good() {
        // Validate
        try {
            aObj.validate("041209307");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2610_bad() {
        // Validate
        try {
            aObj.validate("0412093±7");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2611_good() {
        // Validate
        try {
            aObj.validate("041209420");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2612_bad() {
        // Validate
        try {
            aObj.validate("041209a20");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2613_good() {
        // Validate
        try {
            aObj.validate("041209488");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2614_bad() {
        // Validate
        try {
            aObj.validate("04120948a");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2615_good() {
        // Validate
        try {
            aObj.validate("041209624");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2616_bad() {
        // Validate
        try {
            aObj.validate("0412096]4");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2617_good() {
        // Validate
        try {
            aObj.validate("041209789");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2618_bad() {
        // Validate
        try {
            aObj.validate("04120978z");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2619_good() {
        // Validate
        try {
            aObj.validate("041210053");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2620_bad() {
        // Validate
        try {
            aObj.validate("04Û210053");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2621_good() {
        // Validate
        try {
            aObj.validate("041210299");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2622_bad() {
        // Validate
        try {
            aObj.validate("0Å1210299");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2623_good() {
        // Validate
        try {
            aObj.validate("041210338");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2624_bad() {
        // Validate
        try {
            aObj.validate("04121033");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2625_good() {
        // Validate
        try {
            aObj.validate("041210370");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2626_bad() {
        // Validate
        try {
            aObj.validate("04w210370");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2627_good() {
        // Validate
        try {
            aObj.validate("041210448");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2628_bad() {
        // Validate
        try {
            aObj.validate("0412104¦8");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2629_good() {
        // Validate
        try {
            aObj.validate("041210781");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2630_bad() {
        // Validate
        try {
            aObj.validate("04*210781");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2631_good() {
        // Validate
        try {
            aObj.validate("041210943");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2632_bad() {
        // Validate
        try {
            aObj.validate("0412$0943");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2633_good() {
        // Validate
        try {
            aObj.validate("041210985");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2634_bad() {
        // Validate
        try {
            aObj.validate("04²210985");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2635_good() {
        // Validate
        try {
            aObj.validate("041211243");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2636_bad() {
        // Validate
        try {
            aObj.validate("0412º1243");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2637_good() {
        // Validate
        try {
            aObj.validate("041211298");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2638_bad() {
        // Validate
        try {
            aObj.validate("041¤11298");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2639_good() {
        // Validate
        try {
            aObj.validate("041211382");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2640_bad() {
        // Validate
        try {
            aObj.validate("04121132");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2641_good() {
        // Validate
        try {
            aObj.validate("041211609");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2642_bad() {
        // Validate
        try {
            aObj.validate("04121169");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2643_good() {
        // Validate
        try {
            aObj.validate("041212145");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2644_bad() {
        // Validate
        try {
            aObj.validate("04=212145");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2645_good() {
        // Validate
        try {
            aObj.validate("041212433");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2646_bad() {
        // Validate
        try {
            aObj.validate("0Û1212433");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2647_good() {
        // Validate
        try {
            aObj.validate("041212637");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2648_bad() {
        // Validate
        try {
            aObj.validate("04È212637");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2649_good() {
        // Validate
        try {
            aObj.validate("041212815");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2650_bad() {
        // Validate
        try {
            aObj.validate("0412P2815");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2651_good() {
        // Validate
        try {
            aObj.validate("041212873");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2652_bad() {
        // Validate
        try {
            aObj.validate("04121|873");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2653_good() {
        // Validate
        try {
            aObj.validate("041212899");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2654_bad() {
        // Validate
        try {
            aObj.validate("04121299");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2655_good() {
        // Validate
        try {
            aObj.validate("041212983");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2656_bad() {
        // Validate
        try {
            aObj.validate("04122983");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2657_good() {
        // Validate
        try {
            aObj.validate("041213704");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2658_bad() {
        // Validate
        try {
            aObj.validate("04121V704");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2659_good() {
        // Validate
        try {
            aObj.validate("041213759");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2660_bad() {
        // Validate
        try {
            aObj.validate("041213Y59");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2661_good() {
        // Validate
        try {
            aObj.validate("041213814");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2662_bad() {
        // Validate
        try {
            aObj.validate("04121381k");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2663_good() {
        // Validate
        try {
            aObj.validate("041213872");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2664_bad() {
        // Validate
        try {
            aObj.validate("041213^72");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2665_good() {
        // Validate
        try {
            aObj.validate("041213885");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2666_bad() {
        // Validate
        try {
            aObj.validate("0412138g5");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2667_good() {
        // Validate
        try {
            aObj.validate("041214680");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2668_bad() {
        // Validate
        try {
            aObj.validate("041214Ñ80");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2669_good() {
        // Validate
        try {
            aObj.validate("041215016");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2670_bad() {
        // Validate
        try {
            aObj.validate("0412150&6");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2671_good() {
        // Validate
        try {
            aObj.validate("041215032");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2672_bad() {
        // Validate
        try {
            aObj.validate("04121»032");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2673_good() {
        // Validate
        try {
            aObj.validate("041215278");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2674_bad() {
        // Validate
        try {
            aObj.validate("04121£278");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2675_good() {
        // Validate
        try {
            aObj.validate("041215498");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2676_bad() {
        // Validate
        try {
            aObj.validate("041215+98");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2677_good() {
        // Validate
        try {
            aObj.validate("041215508");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2678_bad() {
        // Validate
        try {
            aObj.validate("04121Ë508");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2679_good() {
        // Validate
        try {
            aObj.validate("041215537");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2680_bad() {
        // Validate
        try {
            aObj.validate("0T1215537");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2681_good() {
        // Validate
        try {
            aObj.validate("041215553");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2682_bad() {
        // Validate
        try {
            aObj.validate("04215553");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2683_good() {
        // Validate
        try {
            aObj.validate("041215582");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2684_bad() {
        // Validate
        try {
            aObj.validate("0412155­2");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2685_good() {
        // Validate
        try {
            aObj.validate("041215621");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2686_bad() {
        // Validate
        try {
            aObj.validate("04121562]");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2687_good() {
        // Validate
        try {
            aObj.validate("041215663");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2688_bad() {
        // Validate
        try {
            aObj.validate("031215663");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2689_good() {
        // Validate
        try {
            aObj.validate("041215692");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2690_bad() {
        // Validate
        try {
            aObj.validate("04115692");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2691_good() {
        // Validate
        try {
            aObj.validate("041215757");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2692_bad() {
        // Validate
        try {
            aObj.validate("04121E757");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2693_good() {
        // Validate
        try {
            aObj.validate("041215773");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2694_bad() {
        // Validate
        try {
            aObj.validate("04121577");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2695_good() {
        // Validate
        try {
            aObj.validate("041215786");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2696_bad() {
        // Validate
        try {
            aObj.validate("071215786");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2697_good() {
        // Validate
        try {
            aObj.validate("041215812");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2698_bad() {
        // Validate
        try {
            aObj.validate("0412_5812");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2699_good() {
        // Validate
        try {
            aObj.validate("041215825");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2700_bad() {
        // Validate
        try {
            aObj.validate("041215k25");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2701_good() {
        // Validate
        try {
            aObj.validate("041215854");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2702_bad() {
        // Validate
        try {
            aObj.validate("041215 54");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2703_good() {
        // Validate
        try {
            aObj.validate("041215883");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2704_bad() {
        // Validate
        try {
            aObj.validate("0£1215883");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2705_good() {
        // Validate
        try {
            aObj.validate("041215906");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2706_bad() {
        // Validate
        try {
            aObj.validate("04121506");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2707_good() {
        // Validate
        try {
            aObj.validate("041215935");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2708_bad() {
        // Validate
        try {
            aObj.validate("0Û1215935");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2709_good() {
        // Validate
        try {
            aObj.validate("041272279");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2710_bad() {
        // Validate
        try {
            aObj.validate("041272$79");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2711_good() {
        // Validate
        try {
            aObj.validate("041284377");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2712_bad() {
        // Validate
        try {
            aObj.validate("041234377");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2713_good() {
        // Validate
        try {
            aObj.validate("041284393");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2714_bad() {
        // Validate
        try {
            aObj.validate("04&284393");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2715_good() {
        // Validate
        try {
            aObj.validate("041284403");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2716_bad() {
        // Validate
        try {
            aObj.validate("04284403");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2717_good() {
        // Validate
        try {
            aObj.validate("041284490");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2718_bad() {
        // Validate
        try {
            aObj.validate("04128H490");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2719_good() {
        // Validate
        try {
            aObj.validate("041284539");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2720_bad() {
        // Validate
        try {
            aObj.validate("04284539");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2721_good() {
        // Validate
        try {
            aObj.validate("042000013");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2722_bad() {
        // Validate
        try {
            aObj.validate("042M00013");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2723_good() {
        // Validate
        try {
            aObj.validate("042000314");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2724_bad() {
        // Validate
        try {
            aObj.validate("045000314");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2725_good() {
        // Validate
        try {
            aObj.validate("042000398");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2726_bad() {
        // Validate
        try {
            aObj.validate("04200039&");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2727_good() {
        // Validate
        try {
            aObj.validate("042000424");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2728_bad() {
        // Validate
        try {
            aObj.validate("042000o24");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2729_good() {
        // Validate
        try {
            aObj.validate("042000550");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2730_bad() {
        // Validate
        try {
            aObj.validate("042V00550");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2731_good() {
        // Validate
        try {
            aObj.validate("042000916");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2732_bad() {
        // Validate
        try {
            aObj.validate("04200091n");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2733_good() {
        // Validate
        try {
            aObj.validate("042015422");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2734_bad() {
        // Validate
        try {
            aObj.validate("04Ç015422");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2735_good() {
        // Validate
        try {
            aObj.validate("042015846");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2736_bad() {
        // Validate
        try {
            aObj.validate("04201846");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2737_good() {
        // Validate
        try {
            aObj.validate("042074544");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2738_bad() {
        // Validate
        try {
            aObj.validate("0Õ2074544");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2739_good() {
        // Validate
        try {
            aObj.validate("042100049");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2740_bad() {
        // Validate
        try {
            aObj.validate("0421¿0049");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2741_good() {
        // Validate
        try {
            aObj.validate("042100146");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2742_bad() {
        // Validate
        try {
            aObj.validate("0]2100146");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2743_good() {
        // Validate
        try {
            aObj.validate("042100175");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2744_bad() {
        // Validate
        try {
            aObj.validate("04210175");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2745_good() {
        // Validate
        try {
            aObj.validate("042100188");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2746_bad() {
        // Validate
        try {
            aObj.validate("0¥2100188");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2747_good() {
        // Validate
        try {
            aObj.validate("042100191");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2748_bad() {
        // Validate
        try {
            aObj.validate("042Ñ00191");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2749_good() {
        // Validate
        try {
            aObj.validate("042100230");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2750_bad() {
        // Validate
        try {
            aObj.validate("04210¾230");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2751_good() {
        // Validate
        try {
            aObj.validate("042100272");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2752_bad() {
        // Validate
        try {
            aObj.validate("04210022");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2753_good() {
        // Validate
        try {
            aObj.validate("042100803");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2754_bad() {
        // Validate
        try {
            aObj.validate("042100883");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2755_good() {
        // Validate
        try {
            aObj.validate("042100861");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2756_bad() {
        // Validate
        try {
            aObj.validate("04210861");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2757_good() {
        // Validate
        try {
            aObj.validate("042101006");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2758_bad() {
        // Validate
        try {
            aObj.validate("04210100É");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2759_good() {
        // Validate
        try {
            aObj.validate("042101174");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2760_bad() {
        // Validate
        try {
            aObj.validate("042d01174");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2761_good() {
        // Validate
        try {
            aObj.validate("042101190");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2762_bad() {
        // Validate
        try {
            aObj.validate("042Ç01190");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2763_good() {
        // Validate
        try {
            aObj.validate("042101268");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2764_bad() {
        // Validate
        try {
            aObj.validate("04210F268");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2765_good() {
        // Validate
        try {
            aObj.validate("042101271");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2766_bad() {
        // Validate
        try {
            aObj.validate("042101ª71");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2767_good() {
        // Validate
        try {
            aObj.validate("042101404");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2768_bad() {
        // Validate
        try {
            aObj.validate("04210104");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2769_good() {
        // Validate
        try {
            aObj.validate("042101446");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2770_bad() {
        // Validate
        try {
            aObj.validate("042101 46");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2771_good() {
        // Validate
        try {
            aObj.validate("042101459");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2772_bad() {
        // Validate
        try {
            aObj.validate("0T2101459");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2773_good() {
        // Validate
        try {
            aObj.validate("042101475");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2774_bad() {
        // Validate
        try {
            aObj.validate("02101475");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2775_good() {
        // Validate
        try {
            aObj.validate("042101488");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2776_bad() {
        // Validate
        try {
            aObj.validate("042101438");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2777_good() {
        // Validate
        try {
            aObj.validate("042101514");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2778_bad() {
        // Validate
        try {
            aObj.validate("0421015l4");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2779_good() {
        // Validate
        try {
            aObj.validate("042101556");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2780_bad() {
        // Validate
        try {
            aObj.validate("04210155Ì");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2781_good() {
        // Validate
        try {
            aObj.validate("042101569");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2782_bad() {
        // Validate
        try {
            aObj.validate("04210\569");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2783_good() {
        // Validate
        try {
            aObj.validate("042101572");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2784_bad() {
        // Validate
        try {
            aObj.validate("0´2101572");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2785_good() {
        // Validate
        try {
            aObj.validate("042101679");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2786_bad() {
        // Validate
        try {
            aObj.validate("04'101679");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2787_good() {
        // Validate
        try {
            aObj.validate("042101750");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2788_bad() {
        // Validate
        try {
            aObj.validate("04210750");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2789_good() {
        // Validate
        try {
            aObj.validate("042101792");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2790_bad() {
        // Validate
        try {
            aObj.validate("04210179³");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2791_good() {
        // Validate
        try {
            aObj.validate("042101886");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2792_bad() {
        // Validate
        try {
            aObj.validate("04210188:");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2793_good() {
        // Validate
        try {
            aObj.validate("042101925");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2794_bad() {
        // Validate
        try {
            aObj.validate("04210195");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2795_good() {
        // Validate
        try {
            aObj.validate("042102018");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2796_bad() {
        // Validate
        try {
            aObj.validate("04210018");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2797_good() {
        // Validate
        try {
            aObj.validate("042102050");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2798_bad() {
        // Validate
        try {
            aObj.validate("0421J2050");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2799_good() {
        // Validate
        try {
            aObj.validate("042102115");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2800_bad() {
        // Validate
        try {
            aObj.validate("0Þ2102115");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2801_good() {
        // Validate
        try {
            aObj.validate("042102160");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2802_bad() {
        // Validate
        try {
            aObj.validate("04210160");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2803_good() {
        // Validate
        try {
            aObj.validate("042102254");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2804_bad() {
        // Validate
        try {
            aObj.validate("042102255");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2805_good() {
        // Validate
        try {
            aObj.validate("042102267");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2806_bad() {
        // Validate
        try {
            aObj.validate("042302267");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2807_good() {
        // Validate
        try {
            aObj.validate("042102270");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2808_bad() {
        // Validate
        try {
            aObj.validate("0421I2270");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2809_good() {
        // Validate
        try {
            aObj.validate("042102283");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2810_bad() {
        // Validate
        try {
            aObj.validate("042102284");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2811_good() {
        // Validate
        try {
            aObj.validate("042102296");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2812_bad() {
        // Validate
        try {
            aObj.validate("0º2102296");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2813_good() {
        // Validate
        try {
            aObj.validate("042102335");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2814_bad() {
        // Validate
        try {
            aObj.validate("04102335");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2815_good() {
        // Validate
        try {
            aObj.validate("042102351");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2816_bad() {
        // Validate
        try {
            aObj.validate("042102x51");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2817_good() {
        // Validate
        try {
            aObj.validate("042102403");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2818_bad() {
        // Validate
        try {
            aObj.validate("042102U03");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2819_good() {
        // Validate
        try {
            aObj.validate("042102416");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2820_bad() {
        // Validate
        try {
            aObj.validate("0421/2416");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2821_good() {
        // Validate
        try {
            aObj.validate("042102474");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2822_bad() {
        // Validate
        try {
            aObj.validate("04210247]");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2823_good() {
        // Validate
        try {
            aObj.validate("042102513");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2824_bad() {
        // Validate
        try {
            aObj.validate("04202513");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2825_good() {
        // Validate
        try {
            aObj.validate("042102555");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2826_bad() {
        // Validate
        try {
            aObj.validate("072102555");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2827_good() {
        // Validate
        try {
            aObj.validate("042102568");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2828_bad() {
        // Validate
        try {
            aObj.validate("04210`568");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2829_good() {
        // Validate
        try {
            aObj.validate("042102571");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2830_bad() {
        // Validate
        try {
            aObj.validate("04210257{");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2831_good() {
        // Validate
        try {
            aObj.validate("042102597");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2832_bad() {
        // Validate
        try {
            aObj.validate("0¥2102597");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2833_good() {
        // Validate
        try {
            aObj.validate("042102652");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2834_bad() {
        // Validate
        try {
            aObj.validate("04210£652");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2835_good() {
        // Validate
        try {
            aObj.validate("042102694");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2836_bad() {
        // Validate
        try {
            aObj.validate("0Ù2102694");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2837_good() {
        // Validate
        try {
            aObj.validate("042102717");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2838_bad() {
        // Validate
        try {
            aObj.validate("0421027Ù7");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2839_good() {
        // Validate
        try {
            aObj.validate("042102788");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2840_bad() {
        // Validate
        try {
            aObj.validate("0`2102788");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2841_good() {
        // Validate
        try {
            aObj.validate("042102898");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2842_bad() {
        // Validate
        try {
            aObj.validate("04102898");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2843_good() {
        // Validate
        try {
            aObj.validate("042102940");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2844_bad() {
        // Validate
        try {
            aObj.validate("04210µ940");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2845_good() {
        // Validate
        try {
            aObj.validate("042103237");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2846_bad() {
        // Validate
        try {
            aObj.validate("04Y103237");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2847_good() {
        // Validate
        try {
            aObj.validate("042103253");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2848_bad() {
        // Validate
        try {
            aObj.validate("04`103253");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2849_good() {
        // Validate
        try {
            aObj.validate("042103347");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2850_bad() {
        // Validate
        try {
            aObj.validate("04210334V");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2851_good() {
        // Validate
        try {
            aObj.validate("042103350");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2852_bad() {
        // Validate
        try {
            aObj.validate("04203350");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2853_good() {
        // Validate
        try {
            aObj.validate("042103363");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2854_bad() {
        // Validate
        try {
            aObj.validate("0421033H3");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2855_good() {
        // Validate
        try {
            aObj.validate("042103460");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2856_bad() {
        // Validate
        try {
            aObj.validate("04210340");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2857_good() {
        // Validate
        try {
            aObj.validate("042103473");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2858_bad() {
        // Validate
        try {
            aObj.validate("0421%3473");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2859_good() {
        // Validate
        try {
            aObj.validate("042103826");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2860_bad() {
        // Validate
        try {
            aObj.validate("0421\3826");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2861_good() {
        // Validate
        try {
            aObj.validate("042103994");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2862_bad() {
        // Validate
        try {
            aObj.validate("0421039º4");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2863_good() {
        // Validate
        try {
            aObj.validate("042104126");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2864_bad() {
        // Validate
        try {
            aObj.validate("04204126");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2865_good() {
        // Validate
        try {
            aObj.validate("042104168");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2866_bad() {
        // Validate
        try {
            aObj.validate("0421`4168");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2867_good() {
        // Validate
        try {
            aObj.validate("042104236");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2868_bad() {
        // Validate
        try {
            aObj.validate("042104_36");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2869_good() {
        // Validate
        try {
            aObj.validate("042104249");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2870_bad() {
        // Validate
        try {
            aObj.validate("042104z49");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2871_good() {
        // Validate
        try {
            aObj.validate("042104401");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2872_bad() {
        // Validate
        try {
            aObj.validate("0421044u1");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2873_good() {
        // Validate
        try {
            aObj.validate("042104469");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2874_bad() {
        // Validate
        try {
            aObj.validate("0[2104469");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2875_good() {
        // Validate
        try {
            aObj.validate("042104579");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2876_bad() {
        // Validate
        try {
            aObj.validate("04210457²");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2877_good() {
        // Validate
        try {
            aObj.validate("042104825");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2878_bad() {
        // Validate
        try {
            aObj.validate("04210482");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2879_good() {
        // Validate
        try {
            aObj.validate("042104854");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2880_bad() {
        // Validate
        try {
            aObj.validate("04210485¼");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2881_good() {
        // Validate
        try {
            aObj.validate("042105154");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2882_bad() {
        // Validate
        try {
            aObj.validate("04210515");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2883_good() {
        // Validate
        try {
            aObj.validate("042105170");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2884_bad() {
        // Validate
        try {
            aObj.validate("042i05170");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2885_good() {
        // Validate
        try {
            aObj.validate("042105196");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2886_bad() {
        // Validate
        try {
            aObj.validate("0421051À6");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2887_good() {
        // Validate
        try {
            aObj.validate("042105442");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2888_bad() {
        // Validate
        try {
            aObj.validate("04210542");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2889_good() {
        // Validate
        try {
            aObj.validate("042105484");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2890_bad() {
        // Validate
        try {
            aObj.validate("042}05484");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2891_good() {
        // Validate
        try {
            aObj.validate("042105785");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2892_bad() {
        // Validate
        try {
            aObj.validate("0p2105785");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2893_good() {
        // Validate
        try {
            aObj.validate("042105882");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2894_bad() {
        // Validate
        try {
            aObj.validate("04|105882");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2895_good() {
        // Validate
        try {
            aObj.validate("042105921");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2896_bad() {
        // Validate
        try {
            aObj.validate("04210592T");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2897_good() {
        // Validate
        try {
            aObj.validate("042105947");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2898_bad() {
        // Validate
        try {
            aObj.validate("0421059w7");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2899_good() {
        // Validate
        try {
            aObj.validate("042106331");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2900_bad() {
        // Validate
        try {
            aObj.validate("04210_331");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2901_good() {
        // Validate
        try {
            aObj.validate("042106580");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2902_bad() {
        // Validate
        try {
            aObj.validate("04210658¾");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2903_good() {
        // Validate
        try {
            aObj.validate("042107068");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2904_bad() {
        // Validate
        try {
            aObj.validate("04210708");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2905_good() {
        // Validate
        try {
            aObj.validate("042107424");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2906_bad() {
        // Validate
        try {
            aObj.validate("04217424");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2907_good() {
        // Validate
        try {
            aObj.validate("042107592");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2908_bad() {
        // Validate
        try {
            aObj.validate("04210Ñ592");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2909_good() {
        // Validate
        try {
            aObj.validate("042107602");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2910_bad() {
        // Validate
        try {
            aObj.validate("042U07602");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2911_good() {
        // Validate
        try {
            aObj.validate("042107657");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2912_bad() {
        // Validate
        try {
            aObj.validate("0421¢7657");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2913_good() {
        // Validate
        try {
            aObj.validate("042107673");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2914_bad() {
        // Validate
        try {
            aObj.validate("042*07673");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2915_good() {
        // Validate
        try {
            aObj.validate("042107738");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2916_bad() {
        // Validate
        try {
            aObj.validate("04107738");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2917_good() {
        // Validate
        try {
            aObj.validate("042107754");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2918_bad() {
        // Validate
        try {
            aObj.validate("0421¶7754");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2919_good() {
        // Validate
        try {
            aObj.validate("042107806");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2920_bad() {
        // Validate
        try {
            aObj.validate("0Ü2107806");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2921_good() {
        // Validate
        try {
            aObj.validate("042107819");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2922_bad() {
        // Validate
        try {
            aObj.validate("04210w819");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2923_good() {
        // Validate
        try {
            aObj.validate("042107851");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2924_bad() {
        // Validate
        try {
            aObj.validate("04¯107851");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2925_good() {
        // Validate
        try {
            aObj.validate("042108122");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2926_bad() {
        // Validate
        try {
            aObj.validate("0J2108122");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2927_good() {
        // Validate
        try {
            aObj.validate("042108151");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2928_bad() {
        // Validate
        try {
            aObj.validate("02108151");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2929_good() {
        // Validate
        try {
            aObj.validate("042108261");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2930_bad() {
        // Validate
        try {
            aObj.validate("0421082.1");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2931_good() {
        // Validate
        try {
            aObj.validate("042108274");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2932_bad() {
        // Validate
        try {
            aObj.validate("04210827");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2933_good() {
        // Validate
        try {
            aObj.validate("042108290");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2934_bad() {
        // Validate
        try {
            aObj.validate("0421082c0");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2935_good() {
        // Validate
        try {
            aObj.validate("042108342");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2936_bad() {
        // Validate
        try {
            aObj.validate("04C108342");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2937_good() {
        // Validate
        try {
            aObj.validate("042108397");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2938_bad() {
        // Validate
        try {
            aObj.validate("04210ß397");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2939_good() {
        // Validate
        try {
            aObj.validate("042108407");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2940_bad() {
        // Validate
        try {
            aObj.validate("04210840x");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2941_good() {
        // Validate
        try {
            aObj.validate("042108449");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2942_bad() {
        // Validate
        try {
            aObj.validate("02108449");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2943_good() {
        // Validate
        try {
            aObj.validate("042108478");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2944_bad() {
        // Validate
        try {
            aObj.validate("042108C78");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2945_good() {
        // Validate
        try {
            aObj.validate("042108481");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2946_bad() {
        // Validate
        try {
            aObj.validate("0-2108481");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2947_good() {
        // Validate
        try {
            aObj.validate("042108517");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2948_bad() {
        // Validate
        try {
            aObj.validate("02108517");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2949_good() {
        // Validate
        try {
            aObj.validate("042108520");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2950_bad() {
        // Validate
        try {
            aObj.validate("04F108520");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2951_good() {
        // Validate
        try {
            aObj.validate("042108559");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2952_bad() {
        // Validate
        try {
            aObj.validate("04210855");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2953_good() {
        // Validate
        try {
            aObj.validate("042108575");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2954_bad() {
        // Validate
        try {
            aObj.validate("04(108575");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2955_good() {
        // Validate
        try {
            aObj.validate("042108588");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2956_bad() {
        // Validate
        try {
            aObj.validate("041108588");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2957_good() {
        // Validate
        try {
            aObj.validate("042174473");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2958_bad() {
        // Validate
        try {
            aObj.validate("0421744Ó3");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2959_good() {
        // Validate
        try {
            aObj.validate("042174486");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2960_bad() {
        // Validate
        try {
            aObj.validate("042174s86");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2961_good() {
        // Validate
        try {
            aObj.validate("042174499");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2962_bad() {
        // Validate
        try {
            aObj.validate("042174x99");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2963_good() {
        // Validate
        try {
            aObj.validate("042174509");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2964_bad() {
        // Validate
        try {
            aObj.validate("0}2174509");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2965_good() {
        // Validate
        try {
            aObj.validate("042174512");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2966_bad() {
        // Validate
        try {
            aObj.validate("0421Õ4512");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2967_good() {
        // Validate
        try {
            aObj.validate("042174525");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2968_bad() {
        // Validate
        try {
            aObj.validate("0421Ã4525");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2969_good() {
        // Validate
        try {
            aObj.validate("042174567");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2970_bad() {
        // Validate
        try {
            aObj.validate("04174567");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2971_good() {
        // Validate
        try {
            aObj.validate("042187033");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2972_bad() {
        // Validate
        try {
            aObj.validate("04287033");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2973_good() {
        // Validate
        try {
            aObj.validate("042200279");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2974_bad() {
        // Validate
        try {
            aObj.validate("0±2200279");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2975_good() {
        // Validate
        try {
            aObj.validate("042200295");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2976_bad() {
        // Validate
        try {
            aObj.validate("04220029");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2977_good() {
        // Validate
        try {
            aObj.validate("042200910");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2978_bad() {
        // Validate
        try {
            aObj.validate("0422009½0");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2979_good() {
        // Validate
        try {
            aObj.validate("042201786");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2980_bad() {
        // Validate
        try {
            aObj.validate("0c2201786");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2981_good() {
        // Validate
        try {
            aObj.validate("042201854");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2982_bad() {
        // Validate
        try {
            aObj.validate("04Ö201854");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2983_good() {
        // Validate
        try {
            aObj.validate("042201948");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2984_bad() {
        // Validate
        try {
            aObj.validate("04221948");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2985_good() {
        // Validate
        try {
            aObj.validate("042202138");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2986_bad() {
        // Validate
        try {
            aObj.validate("0422021Ã8");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2987_good() {
        // Validate
        try {
            aObj.validate("042202196");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2988_bad() {
        // Validate
        try {
            aObj.validate("04220'196");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2989_good() {
        // Validate
        try {
            aObj.validate("042202219");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2990_bad() {
        // Validate
        try {
            aObj.validate("0422022È9");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2991_good() {
        // Validate
        try {
            aObj.validate("042202264");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2992_bad() {
        // Validate
        try {
            aObj.validate("02202264");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2993_good() {
        // Validate
        try {
            aObj.validate("042202426");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2994_bad() {
        // Validate
        try {
            aObj.validate("04220242J");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2995_good() {
        // Validate
        try {
            aObj.validate("042202688");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2996_bad() {
        // Validate
        try {
            aObj.validate("04220288");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2997_good() {
        // Validate
        try {
            aObj.validate("042202895");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_2998_bad() {
        // Validate
        try {
            aObj.validate("04`202895");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_2999_good() {
        // Validate
        try {
            aObj.validate("042203001");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3000_bad() {
        // Validate
        try {
            aObj.validate("04220-001");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3001_good() {
        // Validate
        try {
            aObj.validate("042204110");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3002_bad() {
        // Validate
        try {
            aObj.validate("0422041Ó0");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3003_good() {
        // Validate
        try {
            aObj.validate("042204123");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3004_bad() {
        // Validate
        try {
            aObj.validate("042204¸23");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3005_good() {
        // Validate
        try {
            aObj.validate("042204932");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3006_bad() {
        // Validate
        try {
            aObj.validate("02204932");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3007_good() {
        // Validate
        try {
            aObj.validate("042205009");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3008_bad() {
        // Validate
        try {
            aObj.validate("042205»09");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3009_good() {
        // Validate
        try {
            aObj.validate("042205038");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3010_bad() {
        // Validate
        try {
            aObj.validate("0<2205038");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3011_good() {
        // Validate
        try {
            aObj.validate("042205481");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3012_bad() {
        // Validate
        try {
            aObj.validate("042205p81");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3013_good() {
        // Validate
        try {
            aObj.validate("042205708");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3014_bad() {
        // Validate
        try {
            aObj.validate("0¿2205708");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3015_good() {
        // Validate
        try {
            aObj.validate("042206422");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3016_bad() {
        // Validate
        try {
            aObj.validate("02206422");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3017_good() {
        // Validate
        try {
            aObj.validate("042206503");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3018_bad() {
        // Validate
        try {
            aObj.validate("0422¥6503");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3019_good() {
        // Validate
        try {
            aObj.validate("042206574");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3020_bad() {
        // Validate
        try {
            aObj.validate("042'06574");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3021_good() {
        // Validate
        try {
            aObj.validate("042206804");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3022_bad() {
        // Validate
        try {
            aObj.validate("04¦206804");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3023_good() {
        // Validate
        try {
            aObj.validate("042207308");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3024_bad() {
        // Validate
        try {
            aObj.validate("0422­7308");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3025_good() {
        // Validate
        try {
            aObj.validate("042207379");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3026_bad() {
        // Validate
        try {
            aObj.validate("0422Ì7379");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3027_good() {
        // Validate
        try {
            aObj.validate("042207735");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3028_bad() {
        // Validate
        try {
            aObj.validate("04d207735");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3029_good() {
        // Validate
        try {
            aObj.validate("042208006");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3030_bad() {
        // Validate
        try {
            aObj.validate("04228006");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3031_good() {
        // Validate
        try {
            aObj.validate("042208174");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3032_bad() {
        // Validate
        try {
            aObj.validate("04220874");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3033_good() {
        // Validate
        try {
            aObj.validate("042208556");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3034_bad() {
        // Validate
        try {
            aObj.validate("04220855E");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3035_good() {
        // Validate
        try {
            aObj.validate("042210722");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3036_bad() {
        // Validate
        try {
            aObj.validate("04221072H");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3037_good() {
        // Validate
        try {
            aObj.validate("042211572");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3038_bad() {
        // Validate
        try {
            aObj.validate("0422×1572");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3039_good() {
        // Validate
        try {
            aObj.validate("042212050");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3040_bad() {
        // Validate
        try {
            aObj.validate("04212050");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3041_good() {
        // Validate
        try {
            aObj.validate("042212568");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3042_bad() {
        // Validate
        try {
            aObj.validate("0422a2568");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3043_good() {
        // Validate
        try {
            aObj.validate("042213389");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3044_bad() {
        // Validate
        try {
            aObj.validate("02213389");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3045_good() {
        // Validate
        try {
            aObj.validate("042213842");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3046_bad() {
        // Validate
        try {
            aObj.validate("04n213842");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3047_good() {
        // Validate
        try {
            aObj.validate("042215060");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3048_bad() {
        // Validate
        try {
            aObj.validate("042215E60");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3049_good() {
        // Validate
        try {
            aObj.validate("042215248");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3050_bad() {
        // Validate
        try {
            aObj.validate("0C2215248");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3051_good() {
        // Validate
        try {
            aObj.validate("042215468");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3052_bad() {
        // Validate
        try {
            aObj.validate("042215463");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3053_good() {
        // Validate
        try {
            aObj.validate("042215565");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3054_bad() {
        // Validate
        try {
            aObj.validate("0_2215565");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3055_good() {
        // Validate
        try {
            aObj.validate("042215578");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3056_bad() {
        // Validate
        try {
            aObj.validate("04221557");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3057_good() {
        // Validate
        try {
            aObj.validate("042215688");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3058_bad() {
        // Validate
        try {
            aObj.validate("04221688");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3059_good() {
        // Validate
        try {
            aObj.validate("042215921");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3060_bad() {
        // Validate
        try {
            aObj.validate("04221591");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3061_good() {
        // Validate
        try {
            aObj.validate("042286853");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3062_bad() {
        // Validate
        try {
            aObj.validate("04228685­");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3063_good() {
        // Validate
        try {
            aObj.validate("042286905");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3064_bad() {
        // Validate
        try {
            aObj.validate("0422869)5");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3065_good() {
        // Validate
        try {
            aObj.validate("042286947");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3066_bad() {
        // Validate
        try {
            aObj.validate("04228647");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3067_good() {
        // Validate
        try {
            aObj.validate("042305420");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3068_bad() {
        // Validate
        try {
            aObj.validate("04205420");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3069_good() {
        // Validate
        try {
            aObj.validate("042306720");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3070_bad() {
        // Validate
        try {
            aObj.validate("04230/720");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3071_good() {
        // Validate
        try {
            aObj.validate("042307224");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3072_bad() {
        // Validate
        try {
            aObj.validate("042307024");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3073_good() {
        // Validate
        try {
            aObj.validate("042309222");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3074_bad() {
        // Validate
        try {
            aObj.validate("042J09222");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3075_good() {
        // Validate
        try {
            aObj.validate("042310525");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3076_bad() {
        // Validate
        try {
            aObj.validate("0423105[5");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3077_good() {
        // Validate
        try {
            aObj.validate("042311650");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3078_bad() {
        // Validate
        try {
            aObj.validate("04231160");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3079_good() {
        // Validate
        try {
            aObj.validate("043000096");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3080_bad() {
        // Validate
        try {
            aObj.validate("04300096");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3081_good() {
        // Validate
        try {
            aObj.validate("043000106");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3082_bad() {
        // Validate
        try {
            aObj.validate("0430´0106");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3083_good() {
        // Validate
        try {
            aObj.validate("043000122");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3084_bad() {
        // Validate
        try {
            aObj.validate("04300012");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3085_good() {
        // Validate
        try {
            aObj.validate("043000261");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3086_bad() {
        // Validate
        try {
            aObj.validate("043000(61");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3087_good() {
        // Validate
        try {
            aObj.validate("043000630");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3088_bad() {
        // Validate
        try {
            aObj.validate("04@000630");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3089_good() {
        // Validate
        try {
            aObj.validate("043000847");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3090_bad() {
        // Validate
        try {
            aObj.validate("04300847");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3091_good() {
        // Validate
        try {
            aObj.validate("043001024");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3092_bad() {
        // Validate
        try {
            aObj.validate("043Ù01024");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3093_good() {
        // Validate
        try {
            aObj.validate("043001435");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3094_bad() {
        // Validate
        try {
            aObj.validate("04300135");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3095_good() {
        // Validate
        try {
            aObj.validate("043002023");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3096_bad() {
        // Validate
        try {
            aObj.validate("04300l023");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3097_good() {
        // Validate
        try {
            aObj.validate("043002900");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3098_bad() {
        // Validate
        try {
            aObj.validate("04300290");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3099_good() {
        // Validate
        try {
            aObj.validate("043018868");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3100_bad() {
        // Validate
        try {
            aObj.validate("04318868");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3101_good() {
        // Validate
        try {
            aObj.validate("043019003");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3102_bad() {
        // Validate
        try {
            aObj.validate("04301003");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3103_good() {
        // Validate
        try {
            aObj.validate("043086968");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3104_bad() {
        // Validate
        try {
            aObj.validate("043086g68");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3105_good() {
        // Validate
        try {
            aObj.validate("043202946");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3106_bad() {
        // Validate
        try {
            aObj.validate("04320946");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3107_good() {
        // Validate
        try {
            aObj.validate("043205079");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3108_bad() {
        // Validate
        try {
            aObj.validate("04320507Ê");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3109_good() {
        // Validate
        try {
            aObj.validate("043205875");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3110_bad() {
        // Validate
        try {
            aObj.validate("04320Î875");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3111_good() {
        // Validate
        try {
            aObj.validate("043208296");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3112_bad() {
        // Validate
        try {
            aObj.validate("043208^96");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3113_good() {
        // Validate
        try {
            aObj.validate("043209431");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3114_bad() {
        // Validate
        try {
            aObj.validate("043209331");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3115_good() {
        // Validate
        try {
            aObj.validate("043211160");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3116_bad() {
        // Validate
        try {
            aObj.validate("043214160");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3117_good() {
        // Validate
        try {
            aObj.validate("043300712");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3118_bad() {
        // Validate
        try {
            aObj.validate("03300712");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3119_good() {
        // Validate
        try {
            aObj.validate("043300738");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3120_bad() {
        // Validate
        try {
            aObj.validate("04330073µ");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3121_good() {
        // Validate
        try {
            aObj.validate("043301216");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3122_bad() {
        // Validate
        try {
            aObj.validate("04330121}");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3123_good() {
        // Validate
        try {
            aObj.validate("043301504");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3124_bad() {
        // Validate
        try {
            aObj.validate("04330`504");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3125_good() {
        // Validate
        try {
            aObj.validate("043301601");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3126_bad() {
        // Validate
        try {
            aObj.validate("043701601");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3127_good() {
        // Validate
        try {
            aObj.validate("043301876");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3128_bad() {
        // Validate
        try {
            aObj.validate("04330187:");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3129_good() {
        // Validate
        try {
            aObj.validate("043302493");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3130_bad() {
        // Validate
        try {
            aObj.validate("04330243");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3131_good() {
        // Validate
        try {
            aObj.validate("043303447");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3132_bad() {
        // Validate
        try {
            aObj.validate("043303°47");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3133_good() {
        // Validate
        try {
            aObj.validate("043303832");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3134_bad() {
        // Validate
        try {
            aObj.validate("0Â3303832");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3135_good() {
        // Validate
        try {
            aObj.validate("043303887");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3136_bad() {
        // Validate
        try {
            aObj.validate("043303Æ87");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3137_good() {
        // Validate
        try {
            aObj.validate("043304239");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3138_bad() {
        // Validate
        try {
            aObj.validate("0¯3304239");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3139_good() {
        // Validate
        try {
            aObj.validate("043305092");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3140_bad() {
        // Validate
        try {
            aObj.validate("04¹305092");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3141_good() {
        // Validate
        try {
            aObj.validate("043305131");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3142_bad() {
        // Validate
        try {
            aObj.validate("04330513c");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3143_good() {
        // Validate
        try {
            aObj.validate("043306826");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3144_bad() {
        // Validate
        try {
            aObj.validate("0433068.6");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3145_good() {
        // Validate
        try {
            aObj.validate("043306855");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3146_bad() {
        // Validate
        try {
            aObj.validate("04306855");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3147_good() {
        // Validate
        try {
            aObj.validate("043306910");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3148_bad() {
        // Validate
        try {
            aObj.validate("043304910");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3149_good() {
        // Validate
        try {
            aObj.validate("043307508");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3150_bad() {
        // Validate
        try {
            aObj.validate("0433¨7508");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3151_good() {
        // Validate
        try {
            aObj.validate("043307524");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3152_bad() {
        // Validate
        try {
            aObj.validate("043307|24");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3153_good() {
        // Validate
        try {
            aObj.validate("043307841");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3154_bad() {
        // Validate
        try {
            aObj.validate("04330784b");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3155_good() {
        // Validate
        try {
            aObj.validate("043308277");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3156_bad() {
        // Validate
        try {
            aObj.validate("04338277");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3157_good() {
        // Validate
        try {
            aObj.validate("043308426");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3158_bad() {
        // Validate
        try {
            aObj.validate("04330842Ä");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3159_good() {
        // Validate
        try {
            aObj.validate("043308468");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3160_bad() {
        // Validate
        try {
            aObj.validate("04(308468");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3161_good() {
        // Validate
        try {
            aObj.validate("043308620");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3162_bad() {
        // Validate
        try {
            aObj.validate("0433086Ë0");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3163_good() {
        // Validate
        try {
            aObj.validate("043308691");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3164_bad() {
        // Validate
        try {
            aObj.validate("043308!91");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3165_good() {
        // Validate
        try {
            aObj.validate("043309632");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3166_bad() {
        // Validate
        try {
            aObj.validate("0k3309632");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3167_good() {
        // Validate
        try {
            aObj.validate("043309713");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3168_bad() {
        // Validate
        try {
            aObj.validate("043*09713");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3169_good() {
        // Validate
        try {
            aObj.validate("043309975");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3170_bad() {
        // Validate
        try {
            aObj.validate("0433099Ù5");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3171_good() {
        // Validate
        try {
            aObj.validate("043310139");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3172_bad() {
        // Validate
        try {
            aObj.validate("0433{0139");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3173_good() {
        // Validate
        try {
            aObj.validate("043310281");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3174_bad() {
        // Validate
        try {
            aObj.validate("043310e81");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3175_good() {
        // Validate
        try {
            aObj.validate("043310980");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3176_bad() {
        // Validate
        try {
            aObj.validate("0433109L0");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3177_good() {
        // Validate
        try {
            aObj.validate("043311497");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3178_bad() {
        // Validate
        try {
            aObj.validate("04331ª497");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3179_good() {
        // Validate
        try {
            aObj.validate("043311662");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3180_bad() {
        // Validate
        try {
            aObj.validate("04331O662");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3181_good() {
        // Validate
        try {
            aObj.validate("043312344");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3182_bad() {
        // Validate
        try {
            aObj.validate("04332344");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3183_good() {
        // Validate
        try {
            aObj.validate("043312373");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3184_bad() {
        // Validate
        try {
            aObj.validate("043312É73");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3185_good() {
        // Validate
        try {
            aObj.validate("043312386");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3186_bad() {
        // Validate
        try {
            aObj.validate("04331238ª");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3187_good() {
        // Validate
        try {
            aObj.validate("043313259");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3188_bad() {
        // Validate
        try {
            aObj.validate("04331359");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3189_good() {
        // Validate
        try {
            aObj.validate("043314164");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3190_bad() {
        // Validate
        try {
            aObj.validate("0433141^4");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3191_good() {
        // Validate
        try {
            aObj.validate("043314449");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3192_bad() {
        // Validate
        try {
            aObj.validate("04331449");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3193_good() {
        // Validate
        try {
            aObj.validate("043314847");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3194_bad() {
        // Validate
        try {
            aObj.validate("043334847");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3195_good() {
        // Validate
        try {
            aObj.validate("043315147");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3196_bad() {
        // Validate
        try {
            aObj.validate("04i315147");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3197_good() {
        // Validate
        try {
            aObj.validate("043315448");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3198_bad() {
        // Validate
        try {
            aObj.validate("03315448");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3199_good() {
        // Validate
        try {
            aObj.validate("043315561");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3200_bad() {
        // Validate
        try {
            aObj.validate("04331¥561");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3201_good() {
        // Validate
        try {
            aObj.validate("043316256");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3202_bad() {
        // Validate
        try {
            aObj.validate("04331A256");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3203_good() {
        // Validate
        try {
            aObj.validate("043316942");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3204_bad() {
        // Validate
        try {
            aObj.validate("0433;6942");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3205_good() {
        // Validate
        try {
            aObj.validate("043317569");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3206_bad() {
        // Validate
        try {
            aObj.validate("0433J7569");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3207_good() {
        // Validate
        try {
            aObj.validate("043317679");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3208_bad() {
        // Validate
        try {
            aObj.validate("03317679");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3209_good() {
        // Validate
        try {
            aObj.validate("043318092");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3210_bad() {
        // Validate
        try {
            aObj.validate("0433Ü8092");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3211_good() {
        // Validate
        try {
            aObj.validate("043318500");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3212_bad() {
        // Validate
        try {
            aObj.validate("043318u00");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3213_good() {
        // Validate
        try {
            aObj.validate("043318791");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3214_bad() {
        // Validate
        try {
            aObj.validate("04331Æ791");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3215_good() {
        // Validate
        try {
            aObj.validate("043318814");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3216_bad() {
        // Validate
        try {
            aObj.validate("0~3318814");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3217_good() {
        // Validate
        try {
            aObj.validate("043386891");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3218_bad() {
        // Validate
        try {
            aObj.validate("04338891");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3219_good() {
        // Validate
        try {
            aObj.validate("043386914");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3220_bad() {
        // Validate
        try {
            aObj.validate("0H3386914");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3221_good() {
        // Validate
        try {
            aObj.validate("043386985");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3222_bad() {
        // Validate
        try {
            aObj.validate("04338698");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3223_good() {
        // Validate
        try {
            aObj.validate("043400036");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3224_bad() {
        // Validate
        try {
            aObj.validate("04;400036");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3225_good() {
        // Validate
        try {
            aObj.validate("043400052");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3226_bad() {
        // Validate
        try {
            aObj.validate("04300052");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3227_good() {
        // Validate
        try {
            aObj.validate("043401006");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3228_bad() {
        // Validate
        try {
            aObj.validate("04340106");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3229_good() {
        // Validate
        try {
            aObj.validate("043401190");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3230_bad() {
        // Validate
        try {
            aObj.validate("0434{1190");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3231_good() {
        // Validate
        try {
            aObj.validate("043401637");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3232_bad() {
        // Validate
        try {
            aObj.validate("04341637");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3233_good() {
        // Validate
        try {
            aObj.validate("043401967");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3234_bad() {
        // Validate
        try {
            aObj.validate("04340196$");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3235_good() {
        // Validate
        try {
            aObj.validate("043403224");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3236_bad() {
        // Validate
        try {
            aObj.validate("04#403224");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3237_good() {
        // Validate
        try {
            aObj.validate("043403282");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3238_bad() {
        // Validate
        try {
            aObj.validate("0Ø3403282");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3239_good() {
        // Validate
        try {
            aObj.validate("043404443");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3240_bad() {
        // Validate
        try {
            aObj.validate("0434044²3");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3241_good() {
        // Validate
        try {
            aObj.validate("043404647");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3242_bad() {
        // Validate
        try {
            aObj.validate("04340464");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3243_good() {
        // Validate
        try {
            aObj.validate("043487046");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3244_bad() {
        // Validate
        try {
            aObj.validate("04348704");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3245_good() {
        // Validate
        try {
            aObj.validate("043736881");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3246_bad() {
        // Validate
        try {
            aObj.validate("043Þ36881");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3247_good() {
        // Validate
        try {
            aObj.validate("044000011");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3248_bad() {
        // Validate
        try {
            aObj.validate("044Ã00011");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3249_good() {
        // Validate
        try {
            aObj.validate("044000024");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3250_bad() {
        // Validate
        try {
            aObj.validate("04400B024");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3251_good() {
        // Validate
        try {
            aObj.validate("044000037");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3252_bad() {
        // Validate
        try {
            aObj.validate("04(000037");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3253_good() {
        // Validate
        try {
            aObj.validate("044000642");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3254_bad() {
        // Validate
        try {
            aObj.validate("0Y4000642");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3255_good() {
        // Validate
        try {
            aObj.validate("044000804");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3256_bad() {
        // Validate
        try {
            aObj.validate("04400804");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3257_good() {
        // Validate
        try {
            aObj.validate("044002051");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3258_bad() {
        // Validate
        try {
            aObj.validate("04400Â051");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3259_good() {
        // Validate
        try {
            aObj.validate("044002161");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3260_bad() {
        // Validate
        try {
            aObj.validate("0440021[1");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3261_good() {
        // Validate
        try {
            aObj.validate("044002679");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3262_bad() {
        // Validate
        try {
            aObj.validate("044002+79");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3263_good() {
        // Validate
        try {
            aObj.validate("044002802");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3264_bad() {
        // Validate
        try {
            aObj.validate("04402802");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3265_good() {
        // Validate
        try {
            aObj.validate("044002909");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3266_bad() {
        // Validate
        try {
            aObj.validate("0440029}9");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3267_good() {
        // Validate
        try {
            aObj.validate("044011453");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3268_bad() {
        // Validate
        try {
            aObj.validate("04401143");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3269_good() {
        // Validate
        try {
            aObj.validate("044015747");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3270_bad() {
        // Validate
        try {
            aObj.validate("04401574I");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3271_good() {
        // Validate
        try {
            aObj.validate("044015831");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3272_bad() {
        // Validate
        try {
            aObj.validate("04°015831");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3273_good() {
        // Validate
        try {
            aObj.validate("044015860");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3274_bad() {
        // Validate
        try {
            aObj.validate("044015865");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3275_good() {
        // Validate
        try {
            aObj.validate("044072243");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3276_bad() {
        // Validate
        try {
            aObj.validate("04¢072243");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3277_good() {
        // Validate
        try {
            aObj.validate("044072298");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3278_bad() {
        // Validate
        try {
            aObj.validate("0440722¾8");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3279_good() {
        // Validate
        try {
            aObj.validate("044072308");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3280_bad() {
        // Validate
        try {
            aObj.validate("04402308");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3281_good() {
        // Validate
        try {
            aObj.validate("044072311");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3282_bad() {
        // Validate
        try {
            aObj.validate("044Ó72311");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3283_good() {
        // Validate
        try {
            aObj.validate("044072324");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3284_bad() {
        // Validate
        try {
            aObj.validate("0440~2324");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3285_good() {
        // Validate
        try {
            aObj.validate("044072337");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3286_bad() {
        // Validate
        try {
            aObj.validate("04F072337");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3287_good() {
        // Validate
        try {
            aObj.validate("044084354");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3288_bad() {
        // Validate
        try {
            aObj.validate("04404354");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3289_good() {
        // Validate
        try {
            aObj.validate("044084422");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3290_bad() {
        // Validate
        try {
            aObj.validate("04s084422");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3291_good() {
        // Validate
        try {
            aObj.validate("044101169");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3292_bad() {
        // Validate
        try {
            aObj.validate("04410119");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3293_good() {
        // Validate
        try {
            aObj.validate("044101305");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3294_bad() {
        // Validate
        try {
            aObj.validate("0441013f5");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3295_good() {
        // Validate
        try {
            aObj.validate("044101745");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3296_bad() {
        // Validate
        try {
            aObj.validate("0441Î1745");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3297_good() {
        // Validate
        try {
            aObj.validate("044102362");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3298_bad() {
        // Validate
        try {
            aObj.validate("044s02362");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3299_good() {
        // Validate
        try {
            aObj.validate("044102524");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3300_bad() {
        // Validate
        try {
            aObj.validate("044108524");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3301_good() {
        // Validate
        try {
            aObj.validate("044102647");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3302_bad() {
        // Validate
        try {
            aObj.validate("044102643");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3303_good() {
        // Validate
        try {
            aObj.validate("044102977");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3304_bad() {
        // Validate
        try {
            aObj.validate("044Î02977");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3305_good() {
        // Validate
        try {
            aObj.validate("044103086");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3306_bad() {
        // Validate
        try {
            aObj.validate("04410308{");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3307_good() {
        // Validate
        try {
            aObj.validate("044103523");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3308_bad() {
        // Validate
        try {
            aObj.validate("0441­3523");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3309_good() {
        // Validate
        try {
            aObj.validate("044103536");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3310_bad() {
        // Validate
        try {
            aObj.validate("0A4103536");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3311_good() {
        // Validate
        try {
            aObj.validate("044103976");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3312_bad() {
        // Validate
        try {
            aObj.validate("04410Y976");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3313_good() {
        // Validate
        try {
            aObj.validate("044105576");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3314_bad() {
        // Validate
        try {
            aObj.validate("0c4105576");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3315_good() {
        // Validate
        try {
            aObj.validate("044105819");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3316_bad() {
        // Validate
        try {
            aObj.validate("0Ô4105819");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3317_good() {
        // Validate
        try {
            aObj.validate("044106384");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3318_bad() {
        // Validate
        try {
            aObj.validate("04410\384");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3319_good() {
        // Validate
        try {
            aObj.validate("044106397");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3320_bad() {
        // Validate
        try {
            aObj.validate("0441063v7");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3321_good() {
        // Validate
        try {
            aObj.validate("044106588");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3322_bad() {
        // Validate
        try {
            aObj.validate("044N06588");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3323_good() {
        // Validate
        try {
            aObj.validate("044106944");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3324_bad() {
        // Validate
        try {
            aObj.validate("04b106944");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3325_good() {
        // Validate
        try {
            aObj.validate("044107163");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3326_bad() {
        // Validate
        try {
            aObj.validate("04107163");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3327_good() {
        // Validate
        try {
            aObj.validate("044107600");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3328_bad() {
        // Validate
        try {
            aObj.validate("04N107600");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3329_good() {
        // Validate
        try {
            aObj.validate("044107613");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3330_bad() {
        // Validate
        try {
            aObj.validate("0441Ó7613");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3331_good() {
        // Validate
        try {
            aObj.validate("044107707");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3332_bad() {
        // Validate
        try {
            aObj.validate("04410l707");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3333_good() {
        // Validate
        try {
            aObj.validate("044107778");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3334_bad() {
        // Validate
        try {
            aObj.validate("044}07778");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3335_good() {
        // Validate
        try {
            aObj.validate("044108078");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3336_bad() {
        // Validate
        try {
            aObj.validate("04408078");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3337_good() {
        // Validate
        try {
            aObj.validate("044108641");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3338_bad() {
        // Validate
        try {
            aObj.validate("04410Õ641");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3339_good() {
        // Validate
        try {
            aObj.validate("044109297");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3340_bad() {
        // Validate
        try {
            aObj.validate("04410929[");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3341_good() {
        // Validate
        try {
            aObj.validate("044109336");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3342_bad() {
        // Validate
        try {
            aObj.validate("044£09336");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3343_good() {
        // Validate
        try {
            aObj.validate("044109417");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3344_bad() {
        // Validate
        try {
            aObj.validate("0È4109417");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3345_good() {
        // Validate
        try {
            aObj.validate("044110147");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3346_bad() {
        // Validate
        try {
            aObj.validate("044ß10147");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3347_good() {
        // Validate
        try {
            aObj.validate("044110707");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3348_bad() {
        // Validate
        try {
            aObj.validate("04¼110707");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3349_good() {
        // Validate
        try {
            aObj.validate("044111188");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3350_bad() {
        // Validate
        try {
            aObj.validate("04111188");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3351_good() {
        // Validate
        try {
            aObj.validate("044111191");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3352_bad() {
        // Validate
        try {
            aObj.validate("0*4111191");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3353_good() {
        // Validate
        try {
            aObj.validate("044111557");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3354_bad() {
        // Validate
        try {
            aObj.validate("0441w1557");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3355_good() {
        // Validate
        try {
            aObj.validate("044112187");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3356_bad() {
        // Validate
        try {
            aObj.validate("044112­87");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3357_good() {
        // Validate
        try {
            aObj.validate("044112488");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3358_bad() {
        // Validate
        try {
            aObj.validate("04412488");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3359_good() {
        // Validate
        try {
            aObj.validate("044114716");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3360_bad() {
        // Validate
        try {
            aObj.validate("0441147(6");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3361_good() {
        // Validate
        try {
            aObj.validate("044115090");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3362_bad() {
        // Validate
        try {
            aObj.validate("04415090");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3363_good() {
        // Validate
        try {
            aObj.validate("044115126");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3364_bad() {
        // Validate
        try {
            aObj.validate("04115126");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3365_good() {
        // Validate
        try {
            aObj.validate("044115443");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3366_bad() {
        // Validate
        try {
            aObj.validate("04411544Ü");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3367_good() {
        // Validate
        try {
            aObj.validate("044115511");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3368_bad() {
        // Validate
        try {
            aObj.validate("0_4115511");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3369_good() {
        // Validate
        try {
            aObj.validate("044115760");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3370_bad() {
        // Validate
        try {
            aObj.validate("04411¸760");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3371_good() {
        // Validate
        try {
            aObj.validate("044115809");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3372_bad() {
        // Validate
        try {
            aObj.validate("04411À809");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3373_good() {
        // Validate
        try {
            aObj.validate("044115870");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3374_bad() {
        // Validate
        try {
            aObj.validate("044H15870");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3375_good() {
        // Validate
        try {
            aObj.validate("044115919");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3376_bad() {
        // Validate
        try {
            aObj.validate("0¤4115919");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3377_good() {
        // Validate
        try {
            aObj.validate("044172282");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3378_bad() {
        // Validate
        try {
            aObj.validate("044W72282");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3379_good() {
        // Validate
        try {
            aObj.validate("044201030");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3380_bad() {
        // Validate
        try {
            aObj.validate("0442010,0");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3381_good() {
        // Validate
        try {
            aObj.validate("044202071");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3382_bad() {
        // Validate
        try {
            aObj.validate("04420271");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3383_good() {
        // Validate
        try {
            aObj.validate("044202466");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3384_bad() {
        // Validate
        try {
            aObj.validate("04420466");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3385_good() {
        // Validate
        try {
            aObj.validate("044202505");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3386_bad() {
        // Validate
        try {
            aObj.validate("0442Â2505");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3387_good() {
        // Validate
        try {
            aObj.validate("044203850");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3388_bad() {
        // Validate
        try {
            aObj.validate("0442038S0");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3389_good() {
        // Validate
        try {
            aObj.validate("044203863");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3390_bad() {
        // Validate
        try {
            aObj.validate("04¾203863");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3391_good() {
        // Validate
        try {
            aObj.validate("044204370");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3392_bad() {
        // Validate
        try {
            aObj.validate("0}4204370");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3393_good() {
        // Validate
        try {
            aObj.validate("044205146");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3394_bad() {
        // Validate
        try {
            aObj.validate("04420546");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3395_good() {
        // Validate
        try {
            aObj.validate("044206475");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3396_bad() {
        // Validate
        try {
            aObj.validate("0Þ4206475");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3397_good() {
        // Validate
        try {
            aObj.validate("044207283");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3398_bad() {
        // Validate
        try {
            aObj.validate("04p207283");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3399_good() {
        // Validate
        try {
            aObj.validate("044207872");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3400_bad() {
        // Validate
        try {
            aObj.validate("044207Â72");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3401_good() {
        // Validate
        try {
            aObj.validate("044208512");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3402_bad() {
        // Validate
        try {
            aObj.validate("044J08512");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3403_good() {
        // Validate
        try {
            aObj.validate("044208936");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3404_bad() {
        // Validate
        try {
            aObj.validate("04428936");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3405_good() {
        // Validate
        try {
            aObj.validate("044210063");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3406_bad() {
        // Validate
        try {
            aObj.validate("044¨10063");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3407_good() {
        // Validate
        try {
            aObj.validate("044210403");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3408_bad() {
        // Validate
        try {
            aObj.validate("0442104t3");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3409_good() {
        // Validate
        try {
            aObj.validate("044211910");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3410_bad() {
        // Validate
        try {
            aObj.validate("04421910");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3411_good() {
        // Validate
        try {
            aObj.validate("044212139");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3412_bad() {
        // Validate
        try {
            aObj.validate("04421139");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3413_good() {
        // Validate
        try {
            aObj.validate("044212168");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3414_bad() {
        // Validate
        try {
            aObj.validate("0442121$8");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3415_good() {
        // Validate
        try {
            aObj.validate("044212265");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3416_bad() {
        // Validate
        try {
            aObj.validate("04421226Æ");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3417_good() {
        // Validate
        try {
            aObj.validate("044212922");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3418_bad() {
        // Validate
        try {
            aObj.validate("0442Î2922");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3419_good() {
        // Validate
        try {
            aObj.validate("044213895");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3420_bad() {
        // Validate
        try {
            aObj.validate("04421Ü895");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3421_good() {
        // Validate
        try {
            aObj.validate("044215521");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3422_bad() {
        // Validate
        try {
            aObj.validate("04421ª521");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3423_good() {
        // Validate
        try {
            aObj.validate("044215796");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3424_bad() {
        // Validate
        try {
            aObj.validate("04421579");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3425_good() {
        // Validate
        try {
            aObj.validate("044215893");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3426_bad() {
        // Validate
        try {
            aObj.validate("04415893");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3427_good() {
        // Validate
        try {
            aObj.validate("051000017");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3428_bad() {
        // Validate
        try {
            aObj.validate("05100;017");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3429_good() {
        // Validate
        try {
            aObj.validate("051000020");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3430_bad() {
        // Validate
        try {
            aObj.validate("05100002Ú");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3431_good() {
        // Validate
        try {
            aObj.validate("051000033");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3432_bad() {
        // Validate
        try {
            aObj.validate("0Ö1000033");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3433_good() {
        // Validate
        try {
            aObj.validate("051000101");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3434_bad() {
        // Validate
        try {
            aObj.validate("05100W101");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3435_good() {
        // Validate
        try {
            aObj.validate("051000127");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3436_bad() {
        // Validate
        try {
            aObj.validate("01000127");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3437_good() {
        // Validate
        try {
            aObj.validate("051000253");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3438_bad() {
        // Validate
        try {
            aObj.validate("0510×0253");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3439_good() {
        // Validate
        try {
            aObj.validate("051001414");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3440_bad() {
        // Validate
        try {
            aObj.validate("051y01414");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3441_good() {
        // Validate
        try {
            aObj.validate("051005012");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3442_bad() {
        // Validate
        try {
            aObj.validate("05¤005012");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3443_good() {
        // Validate
        try {
            aObj.validate("051005106");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3444_bad() {
        // Validate
        try {
            aObj.validate("051¾05106");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3445_good() {
        // Validate
        try {
            aObj.validate("051005245");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3446_bad() {
        // Validate
        try {
            aObj.validate("05105245");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3447_good() {
        // Validate
        try {
            aObj.validate("051005504");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3448_bad() {
        // Validate
        try {
            aObj.validate("051405504");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3449_good() {
        // Validate
        try {
            aObj.validate("051006778");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3450_bad() {
        // Validate
        try {
            aObj.validate("05100f778");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3451_good() {
        // Validate
        try {
            aObj.validate("051008828");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3452_bad() {
        // Validate
        try {
            aObj.validate("051008Ú28");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3453_good() {
        // Validate
        try {
            aObj.validate("051008996");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3454_bad() {
        // Validate
        try {
            aObj.validate("0510089}6");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3455_good() {
        // Validate
        try {
            aObj.validate("051009296");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3456_bad() {
        // Validate
        try {
            aObj.validate("05(009296");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3457_good() {
        // Validate
        try {
            aObj.validate("051009364");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3458_bad() {
        // Validate
        try {
            aObj.validate("05100f364");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3459_good() {
        // Validate
        try {
            aObj.validate("051009649");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3460_bad() {
        // Validate
        try {
            aObj.validate("05Ì009649");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3461_good() {
        // Validate
        try {
            aObj.validate("051036706");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3462_bad() {
        // Validate
        try {
            aObj.validate("05103606");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3463_good() {
        // Validate
        try {
            aObj.validate("051050009");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3464_bad() {
        // Validate
        try {
            aObj.validate("05}050009");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3465_good() {
        // Validate
        try {
            aObj.validate("051050339");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3466_bad() {
        // Validate
        try {
            aObj.validate("05º050339");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3467_good() {
        // Validate
        try {
            aObj.validate("051074030");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3468_bad() {
        // Validate
        try {
            aObj.validate("051074(30");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3469_good() {
        // Validate
        try {
            aObj.validate("051085427");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3470_bad() {
        // Validate
        try {
            aObj.validate("0510854Q7");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3471_good() {
        // Validate
        try {
            aObj.validate("051085537");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3472_bad() {
        // Validate
        try {
            aObj.validate("0`1085537");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3473_good() {
        // Validate
        try {
            aObj.validate("051400361");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3474_bad() {
        // Validate
        try {
            aObj.validate("0514003¯1");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3475_good() {
        // Validate
        try {
            aObj.validate("051400507");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3476_bad() {
        // Validate
        try {
            aObj.validate("051¸00507");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3477_good() {
        // Validate
        try {
            aObj.validate("051400549");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3478_bad() {
        // Validate
        try {
            aObj.validate("05Ä400549");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3479_good() {
        // Validate
        try {
            aObj.validate("051400646");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3480_bad() {
        // Validate
        try {
            aObj.validate("0514m0646");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3481_good() {
        // Validate
        try {
            aObj.validate("051400701");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3482_bad() {
        // Validate
        try {
            aObj.validate("0+1400701");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3483_good() {
        // Validate
        try {
            aObj.validate("051400730");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3484_bad() {
        // Validate
        try {
            aObj.validate("05140073");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3485_good() {
        // Validate
        try {
            aObj.validate("051401027");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3486_bad() {
        // Validate
        try {
            aObj.validate("05140½027");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3487_good() {
        // Validate
        try {
            aObj.validate("051401043");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3488_bad() {
        // Validate
        try {
            aObj.validate("051Ë01043");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3489_good() {
        // Validate
        try {
            aObj.validate("051401153");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3490_bad() {
        // Validate
        try {
            aObj.validate("05¤401153");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3491_good() {
        // Validate
        try {
            aObj.validate("051401218");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3492_bad() {
        // Validate
        try {
            aObj.validate("05140121Ê");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3493_good() {
        // Validate
        try {
            aObj.validate("051401331");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3494_bad() {
        // Validate
        try {
            aObj.validate("05140133I");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3495_good() {
        // Validate
        try {
            aObj.validate("051401836");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3496_bad() {
        // Validate
        try {
            aObj.validate("05G401836");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3497_good() {
        // Validate
        try {
            aObj.validate("051401849");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3498_bad() {
        // Validate
        try {
            aObj.validate("051U01849");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3499_good() {
        // Validate
        try {
            aObj.validate("051402000");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3500_bad() {
        // Validate
        try {
            aObj.validate("0_1402000");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3501_good() {
        // Validate
        try {
            aObj.validate("051402071");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3502_bad() {
        // Validate
        try {
            aObj.validate("05Ñ402071");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3503_good() {
        // Validate
        try {
            aObj.validate("051402149");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3504_bad() {
        // Validate
        try {
            aObj.validate("0514u2149");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3505_good() {
        // Validate
        try {
            aObj.validate("051402204");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3506_bad() {
        // Validate
        try {
            aObj.validate("0514.2204");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3507_good() {
        // Validate
        try {
            aObj.validate("051402220");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3508_bad() {
        // Validate
        try {
            aObj.validate("05n402220");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3509_good() {
        // Validate
        try {
            aObj.validate("051402233");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3510_bad() {
        // Validate
        try {
            aObj.validate("05102233");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3511_good() {
        // Validate
        try {
            aObj.validate("051402259");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3512_bad() {
        // Validate
        try {
            aObj.validate("05q402259");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3513_good() {
        // Validate
        try {
            aObj.validate("051402356");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3514_bad() {
        // Validate
        try {
            aObj.validate("05140235§");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3515_good() {
        // Validate
        try {
            aObj.validate("051402372");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3516_bad() {
        // Validate
        try {
            aObj.validate("0Ñ1402372");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3517_good() {
        // Validate
        try {
            aObj.validate("051402482");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3518_bad() {
        // Validate
        try {
            aObj.validate("05140242");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3519_good() {
        // Validate
        try {
            aObj.validate("051402518");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3520_bad() {
        // Validate
        try {
            aObj.validate("05¬402518");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3521_good() {
        // Validate
        try {
            aObj.validate("051402550");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3522_bad() {
        // Validate
        try {
            aObj.validate("05140>550");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3523_good() {
        // Validate
        try {
            aObj.validate("051402589");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3524_bad() {
        // Validate
        try {
            aObj.validate("051¼02589");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3525_good() {
        // Validate
        try {
            aObj.validate("051402822");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3526_bad() {
        // Validate
        try {
            aObj.validate("0514028b2");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3527_good() {
        // Validate
        try {
            aObj.validate("051402835");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3528_bad() {
        // Validate
        try {
            aObj.validate("051S02835");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3529_good() {
        // Validate
        try {
            aObj.validate("051402932");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3530_bad() {
        // Validate
        try {
            aObj.validate("051402$32");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3531_good() {
        // Validate
        try {
            aObj.validate("051402958");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3532_bad() {
        // Validate
        try {
            aObj.validate("051402¡58");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3533_good() {
        // Validate
        try {
            aObj.validate("051402961");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3534_bad() {
        // Validate
        try {
            aObj.validate("01402961");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3535_good() {
        // Validate
        try {
            aObj.validate("051402974");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3536_bad() {
        // Validate
        try {
            aObj.validate("051482974");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3537_good() {
        // Validate
        try {
            aObj.validate("051402987");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3538_bad() {
        // Validate
        try {
            aObj.validate("051402w87");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3539_good() {
        // Validate
        try {
            aObj.validate("051403041");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3540_bad() {
        // Validate
        try {
            aObj.validate("0;1403041");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3541_good() {
        // Validate
        try {
            aObj.validate("051403122");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3542_bad() {
        // Validate
        try {
            aObj.validate("05403122");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3543_good() {
        // Validate
        try {
            aObj.validate("051403164");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3544_bad() {
        // Validate
        try {
            aObj.validate("05`403164");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3545_good() {
        // Validate
        try {
            aObj.validate("051403423");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3546_bad() {
        // Validate
        try {
            aObj.validate("05140×423");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3547_good() {
        // Validate
        try {
            aObj.validate("051403465");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3548_bad() {
        // Validate
        try {
            aObj.validate("0514°3465");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3549_good() {
        // Validate
        try {
            aObj.validate("051403517");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3550_bad() {
        // Validate
        try {
            aObj.validate("0514035y7");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3551_good() {
        // Validate
        try {
            aObj.validate("051403588");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3552_bad() {
        // Validate
        try {
            aObj.validate("01403588");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3553_good() {
        // Validate
        try {
            aObj.validate("051403630");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3554_bad() {
        // Validate
        try {
            aObj.validate("05403630");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3555_good() {
        // Validate
        try {
            aObj.validate("051403643");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3556_bad() {
        // Validate
        try {
            aObj.validate("0514036(3");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3557_good() {
        // Validate
        try {
            aObj.validate("051403672");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3558_bad() {
        // Validate
        try {
            aObj.validate("0t1403672");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3559_good() {
        // Validate
        try {
            aObj.validate("051403711");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3560_bad() {
        // Validate
        try {
            aObj.validate("051403Þ11");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3561_good() {
        // Validate
        try {
            aObj.validate("051403766");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3562_bad() {
        // Validate
        try {
            aObj.validate("05140376È");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3563_good() {
        // Validate
        try {
            aObj.validate("051403779");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3564_bad() {
        // Validate
        try {
            aObj.validate("050403779");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3565_good() {
        // Validate
        try {
            aObj.validate("051403818");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3566_bad() {
        // Validate
        try {
            aObj.validate("051403·18");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3567_good() {
        // Validate
        try {
            aObj.validate("051403850");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3568_bad() {
        // Validate
        try {
            aObj.validate("0´1403850");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3569_good() {
        // Validate
        try {
            aObj.validate("051403915");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3570_bad() {
        // Validate
        try {
            aObj.validate("05140391±");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3571_good() {
        // Validate
        try {
            aObj.validate("051403931");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3572_bad() {
        // Validate
        try {
            aObj.validate("05140_931");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3573_good() {
        // Validate
        try {
            aObj.validate("051403957");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3574_bad() {
        // Validate
        try {
            aObj.validate("0514È3957");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3575_good() {
        // Validate
        try {
            aObj.validate("051404008");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3576_bad() {
        // Validate
        try {
            aObj.validate("05140400D");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3577_good() {
        // Validate
        try {
            aObj.validate("051404037");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3578_bad() {
        // Validate
        try {
            aObj.validate("05b404037");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3579_good() {
        // Validate
        try {
            aObj.validate("051404040");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3580_bad() {
        // Validate
        try {
            aObj.validate("051404´40");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3581_good() {
        // Validate
        try {
            aObj.validate("051404118");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3582_bad() {
        // Validate
        try {
            aObj.validate("0b1404118");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3583_good() {
        // Validate
        try {
            aObj.validate("051404163");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3584_bad() {
        // Validate
        try {
            aObj.validate("05404163");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3585_good() {
        // Validate
        try {
            aObj.validate("051404231");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3586_bad() {
        // Validate
        try {
            aObj.validate("05404231");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3587_good() {
        // Validate
        try {
            aObj.validate("051404260");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3588_bad() {
        // Validate
        try {
            aObj.validate("05140426");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3589_good() {
        // Validate
        try {
            aObj.validate("051404325");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3590_bad() {
        // Validate
        try {
            aObj.validate("051+04325");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3591_good() {
        // Validate
        try {
            aObj.validate("051404383");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3592_bad() {
        // Validate
        try {
            aObj.validate("051e04383");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3593_good() {
        // Validate
        try {
            aObj.validate("051404419");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3594_bad() {
        // Validate
        try {
            aObj.validate("05140441Ø");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3595_good() {
        // Validate
        try {
            aObj.validate("051404464");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3596_bad() {
        // Validate
        try {
            aObj.validate("01404464");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3597_good() {
        // Validate
        try {
            aObj.validate("051404529");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3598_bad() {
        // Validate
        try {
            aObj.validate("05144529");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3599_good() {
        // Validate
        try {
            aObj.validate("051404545");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3600_bad() {
        // Validate
        try {
            aObj.validate("051\04545");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3601_good() {
        // Validate
        try {
            aObj.validate("051404600");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3602_bad() {
        // Validate
        try {
            aObj.validate("051404³00");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3603_good() {
        // Validate
        try {
            aObj.validate("051404642");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3604_bad() {
        // Validate
        try {
            aObj.validate("05140464");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3605_good() {
        // Validate
        try {
            aObj.validate("051404684");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3606_bad() {
        // Validate
        try {
            aObj.validate("05140468s");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3607_good() {
        // Validate
        try {
            aObj.validate("051404697");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3608_bad() {
        // Validate
        try {
            aObj.validate("05#404697");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3609_good() {
        // Validate
        try {
            aObj.validate("051404752");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3610_bad() {
        // Validate
        try {
            aObj.validate("051{04752");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3611_good() {
        // Validate
        try {
            aObj.validate("051404778");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3612_bad() {
        // Validate
        try {
            aObj.validate("051404@78");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3613_good() {
        // Validate
        try {
            aObj.validate("051404846");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3614_bad() {
        // Validate
        try {
            aObj.validate("051Q04846");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3615_good() {
        // Validate
        try {
            aObj.validate("051404901");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3616_bad() {
        // Validate
        try {
            aObj.validate("051¤04901");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3617_good() {
        // Validate
        try {
            aObj.validate("051404914");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3618_bad() {
        // Validate
        try {
            aObj.validate("05G404914");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3619_good() {
        // Validate
        try {
            aObj.validate("051404930");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3620_bad() {
        // Validate
        try {
            aObj.validate("05140493¦");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3621_good() {
        // Validate
        try {
            aObj.validate("051404969");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3622_bad() {
        // Validate
        try {
            aObj.validate("05404969");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3623_good() {
        // Validate
        try {
            aObj.validate("051404985");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3624_bad() {
        // Validate
        try {
            aObj.validate("051²04985");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3625_good() {
        // Validate
        try {
            aObj.validate("051405094");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3626_bad() {
        // Validate
        try {
            aObj.validate("01405094");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3627_good() {
        // Validate
        try {
            aObj.validate("051405117");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3628_bad() {
        // Validate
        try {
            aObj.validate("05w405117");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3629_good() {
        // Validate
        try {
            aObj.validate("051405188");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3630_bad() {
        // Validate
        try {
            aObj.validate("05140588");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3631_good() {
        // Validate
        try {
            aObj.validate("051405272");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3632_bad() {
        // Validate
        try {
            aObj.validate("051S05272");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3633_good() {
        // Validate
        try {
            aObj.validate("051405285");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3634_bad() {
        // Validate
        try {
            aObj.validate("0514A5285");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3635_good() {
        // Validate
        try {
            aObj.validate("051405324");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3636_bad() {
        // Validate
        try {
            aObj.validate("0514053¯4");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3637_good() {
        // Validate
        try {
            aObj.validate("051405395");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3638_bad() {
        // Validate
        try {
            aObj.validate("051Ã05395");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3639_good() {
        // Validate
        try {
            aObj.validate("051405405");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3640_bad() {
        // Validate
        try {
            aObj.validate("05405405");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3641_good() {
        // Validate
        try {
            aObj.validate("051405434");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3642_bad() {
        // Validate
        try {
            aObj.validate("051o05434");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3643_good() {
        // Validate
        try {
            aObj.validate("051405447");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3644_bad() {
        // Validate
        try {
            aObj.validate("058405447");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3645_good() {
        // Validate
        try {
            aObj.validate("051405450");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3646_bad() {
        // Validate
        try {
            aObj.validate("051405458");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3647_good() {
        // Validate
        try {
            aObj.validate("051405476");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3648_bad() {
        // Validate
        try {
            aObj.validate("051405Õ76");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3649_good() {
        // Validate
        try {
            aObj.validate("051405492");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3650_bad() {
        // Validate
        try {
            aObj.validate("05U405492");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3651_good() {
        // Validate
        try {
            aObj.validate("051405515");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3652_bad() {
        // Validate
        try {
            aObj.validate("05140515");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3653_good() {
        // Validate
        try {
            aObj.validate("051405528");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3654_bad() {
        // Validate
        try {
            aObj.validate("05140¢528");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3655_good() {
        // Validate
        try {
            aObj.validate("051405670");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3656_bad() {
        // Validate
        try {
            aObj.validate("0514u5670");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3657_good() {
        // Validate
        try {
            aObj.validate("051405735");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3658_bad() {
        // Validate
        try {
            aObj.validate("05140575");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3659_good() {
        // Validate
        try {
            aObj.validate("051405803");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3660_bad() {
        // Validate
        try {
            aObj.validate("0Ê1405803");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3661_good() {
        // Validate
        try {
            aObj.validate("051406543");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3662_bad() {
        // Validate
        try {
            aObj.validate("051{06543");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3663_good() {
        // Validate
        try {
            aObj.validate("051406909");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3664_bad() {
        // Validate
        try {
            aObj.validate("0514069Ô9");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3665_good() {
        // Validate
        try {
            aObj.validate("051407050");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3666_bad() {
        // Validate
        try {
            aObj.validate("05147050");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3667_good() {
        // Validate
        try {
            aObj.validate("051407128");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3668_bad() {
        // Validate
        try {
            aObj.validate("01407128");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3669_good() {
        // Validate
        try {
            aObj.validate("051407296");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3670_bad() {
        // Validate
        try {
            aObj.validate("0i1407296");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3671_good() {
        // Validate
        try {
            aObj.validate("051408839");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3672_bad() {
        // Validate
        try {
            aObj.validate("051z08839");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3673_good() {
        // Validate
        try {
            aObj.validate("051408868");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3674_bad() {
        // Validate
        try {
            aObj.validate("051408¬68");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3675_good() {
        // Validate
        try {
            aObj.validate("051408897");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3676_bad() {
        // Validate
        try {
            aObj.validate("051401897");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3677_good() {
        // Validate
        try {
            aObj.validate("051408907");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3678_bad() {
        // Validate
        try {
            aObj.validate("05_408907");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3679_good() {
        // Validate
        try {
            aObj.validate("051408910");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3680_bad() {
        // Validate
        try {
            aObj.validate("0514089­0");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3681_good() {
        // Validate
        try {
            aObj.validate("051408923");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3682_bad() {
        // Validate
        try {
            aObj.validate("05140:923");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3683_good() {
        // Validate
        try {
            aObj.validate("051408936");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3684_bad() {
        // Validate
        try {
            aObj.validate("0514089/6");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3685_good() {
        // Validate
        try {
            aObj.validate("051408949");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3686_bad() {
        // Validate
        try {
            aObj.validate("051/08949");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3687_good() {
        // Validate
        try {
            aObj.validate("051408952");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3688_bad() {
        // Validate
        try {
            aObj.validate("0514±8952");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3689_good() {
        // Validate
        try {
            aObj.validate("051409016");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3690_bad() {
        // Validate
        try {
            aObj.validate("0514090 6");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3691_good() {
        // Validate
        try {
            aObj.validate("051409029");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3692_bad() {
        // Validate
        try {
            aObj.validate("05140902[");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3693_good() {
        // Validate
        try {
            aObj.validate("051409058");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3694_bad() {
        // Validate
        try {
            aObj.validate("05140905");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3695_good() {
        // Validate
        try {
            aObj.validate("051409061");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3696_bad() {
        // Validate
        try {
            aObj.validate("0514|9061");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3697_good() {
        // Validate
        try {
            aObj.validate("051409074");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3698_bad() {
        // Validate
        try {
            aObj.validate("0514A9074");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3699_good() {
        // Validate
        try {
            aObj.validate("051409087");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3700_bad() {
        // Validate
        try {
            aObj.validate("0514f9087");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3701_good() {
        // Validate
        try {
            aObj.validate("051409100");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3702_bad() {
        // Validate
        try {
            aObj.validate("05140¦100");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3703_good() {
        // Validate
        try {
            aObj.validate("051409139");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3704_bad() {
        // Validate
        try {
            aObj.validate("051409M39");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3705_good() {
        // Validate
        try {
            aObj.validate("051409142");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3706_bad() {
        // Validate
        try {
            aObj.validate("05140Â142");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3707_good() {
        // Validate
        try {
            aObj.validate("051409155");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3708_bad() {
        // Validate
        try {
            aObj.validate("0514Ô9155");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3709_good() {
        // Validate
        try {
            aObj.validate("051409168");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3710_bad() {
        // Validate
        try {
            aObj.validate("05140916");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3711_good() {
        // Validate
        try {
            aObj.validate("051409171");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3712_bad() {
        // Validate
        try {
            aObj.validate("05Ä409171");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3713_good() {
        // Validate
        try {
            aObj.validate("051409184");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3714_bad() {
        // Validate
        try {
            aObj.validate("05I409184");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3715_good() {
        // Validate
        try {
            aObj.validate("051409197");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3716_bad() {
        // Validate
        try {
            aObj.validate("05149197");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3717_good() {
        // Validate
        try {
            aObj.validate("051409207");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3718_bad() {
        // Validate
        try {
            aObj.validate("0514]9207");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3719_good() {
        // Validate
        try {
            aObj.validate("051409210");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3720_bad() {
        // Validate
        try {
            aObj.validate("05140921");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3721_good() {
        // Validate
        try {
            aObj.validate("051409223");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3722_bad() {
        // Validate
        try {
            aObj.validate("0514+9223");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3723_good() {
        // Validate
        try {
            aObj.validate("051409252");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3724_bad() {
        // Validate
        try {
            aObj.validate("051409W52");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3725_good() {
        // Validate
        try {
            aObj.validate("051409278");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3726_bad() {
        // Validate
        try {
            aObj.validate("05149278");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3727_good() {
        // Validate
        try {
            aObj.validate("051409304");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3728_bad() {
        // Validate
        try {
            aObj.validate("05140930");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3729_good() {
        // Validate
        try {
            aObj.validate("051409320");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3730_bad() {
        // Validate
        try {
            aObj.validate("05140920");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3731_good() {
        // Validate
        try {
            aObj.validate("051409333");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3732_bad() {
        // Validate
        try {
            aObj.validate("05140933(");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3733_good() {
        // Validate
        try {
            aObj.validate("051409346");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3734_bad() {
        // Validate
        try {
            aObj.validate("05109346");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3735_good() {
        // Validate
        try {
            aObj.validate("051409414");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3736_bad() {
        // Validate
        try {
            aObj.validate("05140914");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3737_good() {
        // Validate
        try {
            aObj.validate("051409427");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3738_bad() {
        // Validate
        try {
            aObj.validate("05149427");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3739_good() {
        // Validate
        try {
            aObj.validate("051409443");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3740_bad() {
        // Validate
        try {
            aObj.validate("0Ò1409443");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3741_good() {
        // Validate
        try {
            aObj.validate("051409456");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3742_bad() {
        // Validate
        try {
            aObj.validate("0514p9456");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3743_good() {
        // Validate
        try {
            aObj.validate("051409524");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3744_bad() {
        // Validate
        try {
            aObj.validate("0V1409524");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3745_good() {
        // Validate
        try {
            aObj.validate("051409537");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3746_bad() {
        // Validate
        try {
            aObj.validate("05140953 ");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3747_good() {
        // Validate
        try {
            aObj.validate("051409540");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3748_bad() {
        // Validate
        try {
            aObj.validate("05a409540");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3749_good() {
        // Validate
        try {
            aObj.validate("051409566");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3750_bad() {
        // Validate
        try {
            aObj.validate("05140966");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3751_good() {
        // Validate
        try {
            aObj.validate("051409579");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3752_bad() {
        // Validate
        try {
            aObj.validate("05140959");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3753_good() {
        // Validate
        try {
            aObj.validate("051409582");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3754_bad() {
        // Validate
        try {
            aObj.validate("05149582");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3755_good() {
        // Validate
        try {
            aObj.validate("051409595");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3756_bad() {
        // Validate
        try {
            aObj.validate("0514¥9595");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3757_good() {
        // Validate
        try {
            aObj.validate("051409605");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3758_bad() {
        // Validate
        try {
            aObj.validate("051409R05");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3759_good() {
        // Validate
        try {
            aObj.validate("051409618");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3760_bad() {
        // Validate
        try {
            aObj.validate("0¨1409618");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3761_good() {
        // Validate
        try {
            aObj.validate("051409650");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3762_bad() {
        // Validate
        try {
            aObj.validate("05140960");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3763_good() {
        // Validate
        try {
            aObj.validate("051485315");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3764_bad() {
        // Validate
        try {
            aObj.validate("0514·5315");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3765_good() {
        // Validate
        try {
            aObj.validate("051485438");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3766_bad() {
        // Validate
        try {
            aObj.validate("0514854'8");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3767_good() {
        // Validate
        try {
            aObj.validate("051485441");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3768_bad() {
        // Validate
        try {
            aObj.validate("05148441");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3769_good() {
        // Validate
        try {
            aObj.validate("051485522");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3770_bad() {
        // Validate
        try {
            aObj.validate("0514j5522");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3771_good() {
        // Validate
        try {
            aObj.validate("051485551");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3772_bad() {
        // Validate
        try {
            aObj.validate("05185551");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3773_good() {
        // Validate
        try {
            aObj.validate("051485690");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3774_bad() {
        // Validate
        try {
            aObj.validate("05148Ó690");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3775_good() {
        // Validate
        try {
            aObj.validate("051500481");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3776_bad() {
        // Validate
        try {
            aObj.validate("0'1500481");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3777_good() {
        // Validate
        try {
            aObj.validate("051500520");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3778_bad() {
        // Validate
        try {
            aObj.validate("05150052k");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3779_good() {
        // Validate
        try {
            aObj.validate("051500562");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3780_bad() {
        // Validate
        try {
            aObj.validate("05150056");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3781_good() {
        // Validate
        try {
            aObj.validate("051500601");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3782_bad() {
        // Validate
        try {
            aObj.validate("0515006P1");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3783_good() {
        // Validate
        try {
            aObj.validate("051500614");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3784_bad() {
        // Validate
        try {
            aObj.validate("05150614");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3785_good() {
        // Validate
        try {
            aObj.validate("051500753");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3786_bad() {
        // Validate
        try {
            aObj.validate("0¡1500753");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3787_good() {
        // Validate
        try {
            aObj.validate("051501024");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3788_bad() {
        // Validate
        try {
            aObj.validate("05150102¼");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3789_good() {
        // Validate
        try {
            aObj.validate("051501134");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3790_bad() {
        // Validate
        try {
            aObj.validate("05É501134");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3791_good() {
        // Validate
        try {
            aObj.validate("051501150");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3792_bad() {
        // Validate
        try {
            aObj.validate("051001150");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3793_good() {
        // Validate
        try {
            aObj.validate("051501163");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3794_bad() {
        // Validate
        try {
            aObj.validate("05150113");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3795_good() {
        // Validate
        try {
            aObj.validate("051501257");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3796_bad() {
        // Validate
        try {
            aObj.validate("05150257");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3797_good() {
        // Validate
        try {
            aObj.validate("051501299");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3798_bad() {
        // Validate
        try {
            aObj.validate("0515\1299");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3799_good() {
        // Validate
        try {
            aObj.validate("051501325");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3800_bad() {
        // Validate
        try {
            aObj.validate("05150132");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3801_good() {
        // Validate
        try {
            aObj.validate("051501354");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3802_bad() {
        // Validate
        try {
            aObj.validate("05150135_");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3803_good() {
        // Validate
        try {
            aObj.validate("051501448");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3804_bad() {
        // Validate
        try {
            aObj.validate("0Î1501448");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3805_good() {
        // Validate
        try {
            aObj.validate("051501451");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3806_bad() {
        // Validate
        try {
            aObj.validate("05150145¯");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3807_good() {
        // Validate
        try {
            aObj.validate("051501545");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3808_bad() {
        // Validate
        try {
            aObj.validate("05150154}");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3809_good() {
        // Validate
        try {
            aObj.validate("051501558");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3810_bad() {
        // Validate
        try {
            aObj.validate("051501¬58");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3811_good() {
        // Validate
        try {
            aObj.validate("051501642");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3812_bad() {
        // Validate
        try {
            aObj.validate("05150164Ñ");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3813_good() {
        // Validate
        try {
            aObj.validate("051501671");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3814_bad() {
        // Validate
        try {
            aObj.validate("051²01671");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3815_good() {
        // Validate
        try {
            aObj.validate("051501723");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3816_bad() {
        // Validate
        try {
            aObj.validate("05150123");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3817_good() {
        // Validate
        try {
            aObj.validate("051501749");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3818_bad() {
        // Validate
        try {
            aObj.validate("05150174]");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3819_good() {
        // Validate
        try {
            aObj.validate("051501765");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3820_bad() {
        // Validate
        try {
            aObj.validate("01501765");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3821_good() {
        // Validate
        try {
            aObj.validate("051501778");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3822_bad() {
        // Validate
        try {
            aObj.validate("0515+1778");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3823_good() {
        // Validate
        try {
            aObj.validate("051501817");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3824_bad() {
        // Validate
        try {
            aObj.validate("05150181~");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3825_good() {
        // Validate
        try {
            aObj.validate("051501820");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3826_bad() {
        // Validate
        try {
            aObj.validate("05150182W");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3827_good() {
        // Validate
        try {
            aObj.validate("051501846");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3828_bad() {
        // Validate
        try {
            aObj.validate("0515018\6");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3829_good() {
        // Validate
        try {
            aObj.validate("051501875");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3830_bad() {
        // Validate
        try {
            aObj.validate("05150185");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3831_good() {
        // Validate
        try {
            aObj.validate("051502159");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3832_bad() {
        // Validate
        try {
            aObj.validate("05Ô502159");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3833_good() {
        // Validate
        try {
            aObj.validate("051502175");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3834_bad() {
        // Validate
        try {
            aObj.validate("05150217L");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3835_good() {
        // Validate
        try {
            aObj.validate("051502201");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3836_bad() {
        // Validate
        try {
            aObj.validate("05¿502201");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3837_good() {
        // Validate
        try {
            aObj.validate("051502285");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3838_bad() {
        // Validate
        try {
            aObj.validate("058502285");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3839_good() {
        // Validate
        try {
            aObj.validate("051502298");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3840_bad() {
        // Validate
        try {
            aObj.validate("05502298");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3841_good() {
        // Validate
        try {
            aObj.validate("051502395");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3842_bad() {
        // Validate
        try {
            aObj.validate("05150Ò395");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3843_good() {
        // Validate
        try {
            aObj.validate("051502421");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3844_bad() {
        // Validate
        try {
            aObj.validate("051p02421");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3845_good() {
        // Validate
        try {
            aObj.validate("051502434");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3846_bad() {
        // Validate
        try {
            aObj.validate("0H1502434");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3847_good() {
        // Validate
        try {
            aObj.validate("051502476");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3848_bad() {
        // Validate
        try {
            aObj.validate("0515|2476");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3849_good() {
        // Validate
        try {
            aObj.validate("051502489");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3850_bad() {
        // Validate
        try {
            aObj.validate("0515È2489");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3851_good() {
        // Validate
        try {
            aObj.validate("051502492");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3852_bad() {
        // Validate
        try {
            aObj.validate("05102492");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3853_good() {
        // Validate
        try {
            aObj.validate("051502528");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3854_bad() {
        // Validate
        try {
            aObj.validate("051502,28");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3855_good() {
        // Validate
        try {
            aObj.validate("051502599");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3856_bad() {
        // Validate
        try {
            aObj.validate("051502¿99");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3857_good() {
        // Validate
        try {
            aObj.validate("051502625");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3858_bad() {
        // Validate
        try {
            aObj.validate("051I02625");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3859_good() {
        // Validate
        try {
            aObj.validate("051502641");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3860_bad() {
        // Validate
        try {
            aObj.validate("051M02641");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3861_good() {
        // Validate
        try {
            aObj.validate("051502667");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3862_bad() {
        // Validate
        try {
            aObj.validate("051µ02667");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3863_good() {
        // Validate
        try {
            aObj.validate("051502748");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3864_bad() {
        // Validate
        try {
            aObj.validate("05L502748");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3865_good() {
        // Validate
        try {
            aObj.validate("051502858");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3866_bad() {
        // Validate
        try {
            aObj.validate("0515u2858");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3867_good() {
        // Validate
        try {
            aObj.validate("051502887");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3868_bad() {
        // Validate
        try {
            aObj.validate("05µ502887");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3869_good() {
        // Validate
        try {
            aObj.validate("051502913");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3870_bad() {
        // Validate
        try {
            aObj.validate("0(1502913");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3871_good() {
        // Validate
        try {
            aObj.validate("051503051");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3872_bad() {
        // Validate
        try {
            aObj.validate("051503l51");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3873_good() {
        // Validate
        try {
            aObj.validate("051503103");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3874_bad() {
        // Validate
        try {
            aObj.validate("05150103");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3875_good() {
        // Validate
        try {
            aObj.validate("051503145");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3876_bad() {
        // Validate
        try {
            aObj.validate("05150345");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3877_good() {
        // Validate
        try {
            aObj.validate("051503161");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3878_bad() {
        // Validate
        try {
            aObj.validate("05150316`");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3879_good() {
        // Validate
        try {
            aObj.validate("051503174");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3880_bad() {
        // Validate
        try {
            aObj.validate("051503374");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3881_good() {
        // Validate
        try {
            aObj.validate("051503213");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3882_bad() {
        // Validate
        try {
            aObj.validate("05`503213");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3883_good() {
        // Validate
        try {
            aObj.validate("051503323");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3884_bad() {
        // Validate
        try {
            aObj.validate("0[1503323");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3885_good() {
        // Validate
        try {
            aObj.validate("051503394");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3886_bad() {
        // Validate
        try {
            aObj.validate("05Ì503394");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3887_good() {
        // Validate
        try {
            aObj.validate("051503491");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3888_bad() {
        // Validate
        try {
            aObj.validate("05150/491");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3889_good() {
        // Validate
        try {
            aObj.validate("051503556");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3890_bad() {
        // Validate
        try {
            aObj.validate("05B503556");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3891_good() {
        // Validate
        try {
            aObj.validate("051503909");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3892_bad() {
        // Validate
        try {
            aObj.validate("05150309");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3893_good() {
        // Validate
        try {
            aObj.validate("051503938");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3894_bad() {
        // Validate
        try {
            aObj.validate("051503	38");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3895_good() {
        // Validate
        try {
            aObj.validate("051504254");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3896_bad() {
        // Validate
        try {
            aObj.validate("05150425");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3897_good() {
        // Validate
        try {
            aObj.validate("051504319");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3898_bad() {
        // Validate
        try {
            aObj.validate("05150319");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3899_good() {
        // Validate
        try {
            aObj.validate("051504377");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3900_bad() {
        // Validate
        try {
            aObj.validate("051¬04377");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3901_good() {
        // Validate
        try {
            aObj.validate("051504429");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3902_bad() {
        // Validate
        try {
            aObj.validate("0515w4429");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3903_good() {
        // Validate
        try {
            aObj.validate("051504432");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3904_bad() {
        // Validate
        try {
            aObj.validate("051564432");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3905_good() {
        // Validate
        try {
            aObj.validate("051504500");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3906_bad() {
        // Validate
        try {
            aObj.validate("051504_00");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3907_good() {
        // Validate
        try {
            aObj.validate("051504542");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3908_bad() {
        // Validate
        try {
            aObj.validate("051b04542");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3909_good() {
        // Validate
        try {
            aObj.validate("051504568");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3910_bad() {
        // Validate
        try {
            aObj.validate("0Å1504568");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3911_good() {
        // Validate
        try {
            aObj.validate("051504571");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3912_bad() {
        // Validate
        try {
            aObj.validate("05504571");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3913_good() {
        // Validate
        try {
            aObj.validate("051504584");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3914_bad() {
        // Validate
        try {
            aObj.validate("0}1504584");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3915_good() {
        // Validate
        try {
            aObj.validate("051504597");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3916_bad() {
        // Validate
        try {
            aObj.validate("0515045|7");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3917_good() {
        // Validate
        try {
            aObj.validate("051504607");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3918_bad() {
        // Validate
        try {
            aObj.validate("05154607");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3919_good() {
        // Validate
        try {
            aObj.validate("051504623");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3920_bad() {
        // Validate
        try {
            aObj.validate("05150462Å");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3921_good() {
        // Validate
        try {
            aObj.validate("051504652");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3922_bad() {
        // Validate
        try {
            aObj.validate("0¿1504652");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3923_good() {
        // Validate
        try {
            aObj.validate("051504665");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3924_bad() {
        // Validate
        try {
            aObj.validate("05150j665");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3925_good() {
        // Validate
        try {
            aObj.validate("051504704");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3926_bad() {
        // Validate
        try {
            aObj.validate("05150704");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3927_good() {
        // Validate
        try {
            aObj.validate("051580184");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3928_bad() {
        // Validate
        try {
            aObj.validate("05158e184");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3929_good() {
        // Validate
        try {
            aObj.validate("051736158");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3930_bad() {
        // Validate
        try {
            aObj.validate("05173615È");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3931_good() {
        // Validate
        try {
            aObj.validate("051900023");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3932_bad() {
        // Validate
        try {
            aObj.validate("051?00023");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3933_good() {
        // Validate
        try {
            aObj.validate("051900366");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3934_bad() {
        // Validate
        try {
            aObj.validate("05900366");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3935_good() {
        // Validate
        try {
            aObj.validate("051900395");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3936_bad() {
        // Validate
        try {
            aObj.validate("0519(0395");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3937_good() {
        // Validate
        try {
            aObj.validate("051901705");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3938_bad() {
        // Validate
        try {
            aObj.validate("0519017Ú5");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3939_good() {
        // Validate
        try {
            aObj.validate("051902416");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3940_bad() {
        // Validate
        try {
            aObj.validate("05190241z");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3941_good() {
        // Validate
        try {
            aObj.validate("051903761");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3942_bad() {
        // Validate
        try {
            aObj.validate("0519Ê3761");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3943_good() {
        // Validate
        try {
            aObj.validate("051904524");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3944_bad() {
        // Validate
        try {
            aObj.validate("051t04524");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3945_good() {
        // Validate
        try {
            aObj.validate("051904634");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3946_bad() {
        // Validate
        try {
            aObj.validate("051904-34");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3947_good() {
        // Validate
        try {
            aObj.validate("051904676");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3948_bad() {
        // Validate
        try {
            aObj.validate("051804676");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3949_good() {
        // Validate
        try {
            aObj.validate("052000016");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3950_bad() {
        // Validate
        try {
            aObj.validate("052@00016");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3951_good() {
        // Validate
        try {
            aObj.validate("052000113");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3952_bad() {
        // Validate
        try {
            aObj.validate("052+00113");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3953_good() {
        // Validate
        try {
            aObj.validate("052000168");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3954_bad() {
        // Validate
        try {
            aObj.validate("05200016°");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3955_good() {
        // Validate
        try {
            aObj.validate("052000278");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3956_bad() {
        // Validate
        try {
            aObj.validate("052D00278");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3957_good() {
        // Validate
        try {
            aObj.validate("052000618");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3958_bad() {
        // Validate
        try {
            aObj.validate("0520006Ú8");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3959_good() {
        // Validate
        try {
            aObj.validate("052000634");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3960_bad() {
        // Validate
        try {
            aObj.validate("052Ó00634");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3961_good() {
        // Validate
        try {
            aObj.validate("052000773");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3962_bad() {
        // Validate
        try {
            aObj.validate("05200073");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3963_good() {
        // Validate
        try {
            aObj.validate("052000896");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3964_bad() {
        // Validate
        try {
            aObj.validate("05R000896");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3965_good() {
        // Validate
        try {
            aObj.validate("052001633");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3966_bad() {
        // Validate
        try {
            aObj.validate("05201633");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3967_good() {
        // Validate
        try {
            aObj.validate("052001772");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3968_bad() {
        // Validate
        try {
            aObj.validate("02001772");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3969_good() {
        // Validate
        try {
            aObj.validate("052001963");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3970_bad() {
        // Validate
        try {
            aObj.validate("05201963");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3971_good() {
        // Validate
        try {
            aObj.validate("052002166");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3972_bad() {
        // Validate
        try {
            aObj.validate("05202166");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3973_good() {
        // Validate
        try {
            aObj.validate("052073519");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3974_bad() {
        // Validate
        try {
            aObj.validate("052070519");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3975_good() {
        // Validate
        try {
            aObj.validate("052073564");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3976_bad() {
        // Validate
        try {
            aObj.validate("0z2073564");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3977_good() {
        // Validate
        try {
            aObj.validate("052080256");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3978_bad() {
        // Validate
        try {
            aObj.validate("0¸2080256");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3979_good() {
        // Validate
        try {
            aObj.validate("052080395");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3980_bad() {
        // Validate
        try {
            aObj.validate("05208035");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3981_good() {
        // Validate
        try {
            aObj.validate("052100042");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3982_bad() {
        // Validate
        try {
            aObj.validate("05P100042");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3983_good() {
        // Validate
        try {
            aObj.validate("052100408");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3984_bad() {
        // Validate
        try {
            aObj.validate("05210008");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3985_good() {
        // Validate
        try {
            aObj.validate("052100466");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3986_bad() {
        // Validate
        try {
            aObj.validate("05210046");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3987_good() {
        // Validate
        try {
            aObj.validate("052100547");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3988_bad() {
        // Validate
        try {
            aObj.validate("05210054");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3989_good() {
        // Validate
        try {
            aObj.validate("052100699");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3990_bad() {
        // Validate
        try {
            aObj.validate("05k100699");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3991_good() {
        // Validate
        try {
            aObj.validate("052100725");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3992_bad() {
        // Validate
        try {
            aObj.validate("05200725");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3993_good() {
        // Validate
        try {
            aObj.validate("052100741");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3994_bad() {
        // Validate
        try {
            aObj.validate("0521007Â1");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3995_good() {
        // Validate
        try {
            aObj.validate("052100893");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3996_bad() {
        // Validate
        try {
            aObj.validate("052100}93");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3997_good() {
        // Validate
        try {
            aObj.validate("052100929");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_3998_bad() {
        // Validate
        try {
            aObj.validate("05\100929");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_3999_good() {
        // Validate
        try {
            aObj.validate("052100932");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4000_bad() {
        // Validate
        try {
            aObj.validate("05210092");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4001_good() {
        // Validate
        try {
            aObj.validate("052100987");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4002_bad() {
        // Validate
        try {
            aObj.validate("052Y00987");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4003_good() {
        // Validate
        try {
            aObj.validate("052101012");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4004_bad() {
        // Validate
        try {
            aObj.validate("052°01012");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4005_good() {
        // Validate
        try {
            aObj.validate("052101106");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4006_bad() {
        // Validate
        try {
            aObj.validate("0521*1106");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4007_good() {
        // Validate
        try {
            aObj.validate("052101588");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4008_bad() {
        // Validate
        try {
            aObj.validate("0521t1588");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4009_good() {
        // Validate
        try {
            aObj.validate("052101669");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4010_bad() {
        // Validate
        try {
            aObj.validate("05210º669");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4011_good() {
        // Validate
        try {
            aObj.validate("052101931");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4012_bad() {
        // Validate
        try {
            aObj.validate("05210193>");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4013_good() {
        // Validate
        try {
            aObj.validate("052101957");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4014_bad() {
        // Validate
        try {
            aObj.validate("0521019Å7");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4015_good() {
        // Validate
        try {
            aObj.validate("052102215");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4016_bad() {
        // Validate
        try {
            aObj.validate("052Î02215");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4017_good() {
        // Validate
        try {
            aObj.validate("052102228");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4018_bad() {
        // Validate
        try {
            aObj.validate("05210222");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4019_good() {
        // Validate
        try {
            aObj.validate("052102312");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4020_bad() {
        // Validate
        try {
            aObj.validate("05¯102312");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4021_good() {
        // Validate
        try {
            aObj.validate("052102516");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4022_bad() {
        // Validate
        try {
            aObj.validate("05210251&");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4023_good() {
        // Validate
        try {
            aObj.validate("052102590");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4024_bad() {
        // Validate
        try {
            aObj.validate("05210r590");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4025_good() {
        // Validate
        try {
            aObj.validate("052102901");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4026_bad() {
        // Validate
        try {
            aObj.validate("0521029`1");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4027_good() {
        // Validate
        try {
            aObj.validate("052103065");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4028_bad() {
        // Validate
        try {
            aObj.validate("05D103065");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4029_good() {
        // Validate
        try {
            aObj.validate("052103515");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4030_bad() {
        // Validate
        try {
            aObj.validate("05210351Ã");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4031_good() {
        // Validate
        try {
            aObj.validate("052103544");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4032_bad() {
        // Validate
        try {
            aObj.validate("0521035:4");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4033_good() {
        // Validate
        try {
            aObj.validate("052173464");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4034_bad() {
        // Validate
        try {
            aObj.validate("052173-64");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4035_good() {
        // Validate
        try {
            aObj.validate("052201925");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4036_bad() {
        // Validate
        try {
            aObj.validate("05221925");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4037_good() {
        // Validate
        try {
            aObj.validate("052201938");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4038_bad() {
        // Validate
        try {
            aObj.validate("05220193$");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4039_good() {
        // Validate
        try {
            aObj.validate("052202225");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4040_bad() {
        // Validate
        try {
            aObj.validate("052Ö02225");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4041_good() {
        // Validate
        try {
            aObj.validate("052203046");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4042_bad() {
        // Validate
        try {
            aObj.validate("0522030®6");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4043_good() {
        // Validate
        try {
            aObj.validate("052203703");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4044_bad() {
        // Validate
        try {
            aObj.validate("05220370¹");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4045_good() {
        // Validate
        try {
            aObj.validate("052204346");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4046_bad() {
        // Validate
        try {
            aObj.validate("052204{46");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4047_good() {
        // Validate
        try {
            aObj.validate("052204359");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4048_bad() {
        // Validate
        try {
            aObj.validate("05220435T");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4049_good() {
        // Validate
        try {
            aObj.validate("052204715");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4050_bad() {
        // Validate
        try {
            aObj.validate("05$204715");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4051_good() {
        // Validate
        try {
            aObj.validate("052204728");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4052_bad() {
        // Validate
        try {
            aObj.validate("05204728");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4053_good() {
        // Validate
        try {
            aObj.validate("053000183");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4054_bad() {
        // Validate
        try {
            aObj.validate("03000183");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4055_good() {
        // Validate
        try {
            aObj.validate("053000196");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4056_bad() {
        // Validate
        try {
            aObj.validate("0¶3000196");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4057_good() {
        // Validate
        try {
            aObj.validate("053000206");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4058_bad() {
        // Validate
        try {
            aObj.validate("053030206");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4059_good() {
        // Validate
        try {
            aObj.validate("053000219");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4060_bad() {
        // Validate
        try {
            aObj.validate("0530	0219");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4061_good() {
        // Validate
        try {
            aObj.validate("053003931");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4062_bad() {
        // Validate
        try {
            aObj.validate("0530039|1");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4063_good() {
        // Validate
        try {
            aObj.validate("053010445");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4064_bad() {
        // Validate
        try {
            aObj.validate("05301044:");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4065_good() {
        // Validate
        try {
            aObj.validate("053010665");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4066_bad() {
        // Validate
        try {
            aObj.validate("0530g0665");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4067_good() {
        // Validate
        try {
            aObj.validate("053012029");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4068_bad() {
        // Validate
        try {
            aObj.validate("0I3012029");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4069_good() {
        // Validate
        try {
            aObj.validate("053012087");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4070_bad() {
        // Validate
        try {
            aObj.validate("05301208!");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4071_good() {
        // Validate
        try {
            aObj.validate("053012197");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4072_bad() {
        // Validate
        try {
            aObj.validate("05302197");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4073_good() {
        // Validate
        try {
            aObj.validate("053012265");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4074_bad() {
        // Validate
        try {
            aObj.validate("053¹12265");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4075_good() {
        // Validate
        try {
            aObj.validate("053012582");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4076_bad() {
        // Validate
        try {
            aObj.validate("053012552");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4077_good() {
        // Validate
        try {
            aObj.validate("053012647");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4078_bad() {
        // Validate
        try {
            aObj.validate("05302647");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4079_good() {
        // Validate
        try {
            aObj.validate("053012728");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4080_bad() {
        // Validate
        try {
            aObj.validate("05u012728");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4081_good() {
        // Validate
        try {
            aObj.validate("053012760");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4082_bad() {
        // Validate
        try {
            aObj.validate("05301276");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4083_good() {
        // Validate
        try {
            aObj.validate("053012838");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4084_bad() {
        // Validate
        try {
            aObj.validate("0Þ3012838");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4085_good() {
        // Validate
        try {
            aObj.validate("053020202");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4086_bad() {
        // Validate
        try {
            aObj.validate("0¹3020202");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4087_good() {
        // Validate
        try {
            aObj.validate("053100025");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4088_bad() {
        // Validate
        try {
            aObj.validate("053100f25");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4089_good() {
        // Validate
        try {
            aObj.validate("053100038");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4090_bad() {
        // Validate
        try {
            aObj.validate("05310C038");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4091_good() {
        // Validate
        try {
            aObj.validate("053100258");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4092_bad() {
        // Validate
        try {
            aObj.validate("05310258");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4093_good() {
        // Validate
        try {
            aObj.validate("053100300");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4094_bad() {
        // Validate
        try {
            aObj.validate("053100309");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4095_good() {
        // Validate
        try {
            aObj.validate("053100355");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4096_bad() {
        // Validate
        try {
            aObj.validate("053t00355");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4097_good() {
        // Validate
        try {
            aObj.validate("053100452");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4098_bad() {
        // Validate
        try {
            aObj.validate("0(3100452");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4099_good() {
        // Validate
        try {
            aObj.validate("053100465");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4100_bad() {
        // Validate
        try {
            aObj.validate("0Ö3100465");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4101_good() {
        // Validate
        try {
            aObj.validate("053100494");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4102_bad() {
        // Validate
        try {
            aObj.validate("0Ä3100494");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4103_good() {
        // Validate
        try {
            aObj.validate("053100520");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4104_bad() {
        // Validate
        try {
            aObj.validate("05310]520");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4105_good() {
        // Validate
        try {
            aObj.validate("053100559");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4106_bad() {
        // Validate
        try {
            aObj.validate("05310055");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4107_good() {
        // Validate
        try {
            aObj.validate("053100685");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4108_bad() {
        // Validate
        try {
            aObj.validate("053100#85");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4109_good() {
        // Validate
        try {
            aObj.validate("053100698");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4110_bad() {
        // Validate
        try {
            aObj.validate("05310	698");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4111_good() {
        // Validate
        try {
            aObj.validate("053100724");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4112_bad() {
        // Validate
        try {
            aObj.validate("05310724");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4113_good() {
        // Validate
        try {
            aObj.validate("053100737");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4114_bad() {
        // Validate
        try {
            aObj.validate("05310¯737");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4115_good() {
        // Validate
        try {
            aObj.validate("053100850");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4116_bad() {
        // Validate
        try {
            aObj.validate("05310085(");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4117_good() {
        // Validate
        try {
            aObj.validate("053101121");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4118_bad() {
        // Validate
        try {
            aObj.validate("093101121");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4119_good() {
        // Validate
        try {
            aObj.validate("053101273");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4120_bad() {
        // Validate
        try {
            aObj.validate("05310127*");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4121_good() {
        // Validate
        try {
            aObj.validate("053101341");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4122_bad() {
        // Validate
        try {
            aObj.validate("03101341");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4123_good() {
        // Validate
        try {
            aObj.validate("053101396");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4124_bad() {
        // Validate
        try {
            aObj.validate("0531:1396");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4125_good() {
        // Validate
        try {
            aObj.validate("053101529");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4126_bad() {
        // Validate
        try {
            aObj.validate("053À01529");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4127_good() {
        // Validate
        try {
            aObj.validate("053101561");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4128_bad() {
        // Validate
        try {
            aObj.validate("05310156");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4129_good() {
        // Validate
        try {
            aObj.validate("053101626");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4130_bad() {
        // Validate
        try {
            aObj.validate("053101¥26");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4131_good() {
        // Validate
        try {
            aObj.validate("053101668");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4132_bad() {
        // Validate
        try {
            aObj.validate("05310E668");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4133_good() {
        // Validate
        try {
            aObj.validate("053101684");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4134_bad() {
        // Validate
        try {
            aObj.validate("0531016©4");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4135_good() {
        // Validate
        try {
            aObj.validate("053101707");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4136_bad() {
        // Validate
        try {
            aObj.validate("05310170®");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4137_good() {
        // Validate
        try {
            aObj.validate("053102117");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4138_bad() {
        // Validate
        try {
            aObj.validate("05}102117");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4139_good() {
        // Validate
        try {
            aObj.validate("053102191");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4140_bad() {
        // Validate
        try {
            aObj.validate("0531q2191");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4141_good() {
        // Validate
        try {
            aObj.validate("053102463");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4142_bad() {
        // Validate
        try {
            aObj.validate("053Q02463");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4143_good() {
        // Validate
        try {
            aObj.validate("053102531");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4144_bad() {
        // Validate
        try {
            aObj.validate("0¢3102531");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4145_good() {
        // Validate
        try {
            aObj.validate("053102586");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4146_bad() {
        // Validate
        try {
            aObj.validate("05310q586");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4147_good() {
        // Validate
        try {
            aObj.validate("053102719");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4148_bad() {
        // Validate
        try {
            aObj.validate("05t102719");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4149_good() {
        // Validate
        try {
            aObj.validate("053102816");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4150_bad() {
        // Validate
        try {
            aObj.validate("0531028'6");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4151_good() {
        // Validate
        try {
            aObj.validate("053103404");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4152_bad() {
        // Validate
        try {
            aObj.validate("0531034Õ4");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4153_good() {
        // Validate
        try {
            aObj.validate("053103420");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4154_bad() {
        // Validate
        try {
            aObj.validate("05*103420");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4155_good() {
        // Validate
        try {
            aObj.validate("053103585");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4156_bad() {
        // Validate
        try {
            aObj.validate("05g103585");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4157_good() {
        // Validate
        try {
            aObj.validate("053103637");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4158_bad() {
        // Validate
        try {
            aObj.validate("05¦103637");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4159_good() {
        // Validate
        try {
            aObj.validate("053103640");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4160_bad() {
        // Validate
        try {
            aObj.validate("05310340");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4161_good() {
        // Validate
        try {
            aObj.validate("053103682");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4162_bad() {
        // Validate
        try {
            aObj.validate("05310362");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4163_good() {
        // Validate
        try {
            aObj.validate("053104568");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4164_bad() {
        // Validate
        try {
            aObj.validate("0531?4568");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4165_good() {
        // Validate
        try {
            aObj.validate("053104762");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4166_bad() {
        // Validate
        try {
            aObj.validate("053104¨62");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4167_good() {
        // Validate
        try {
            aObj.validate("053104843");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4168_bad() {
        // Validate
        try {
            aObj.validate("003104843");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4169_good() {
        // Validate
        try {
            aObj.validate("053104869");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4170_bad() {
        // Validate
        try {
            aObj.validate("05310869");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4171_good() {
        // Validate
        try {
            aObj.validate("053105059");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4172_bad() {
        // Validate
        try {
            aObj.validate("053105V59");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4173_good() {
        // Validate
        try {
            aObj.validate("053105208");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4174_bad() {
        // Validate
        try {
            aObj.validate("0 3105208");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4175_good() {
        // Validate
        try {
            aObj.validate("053105936");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4176_bad() {
        // Validate
        try {
            aObj.validate("0531 5936");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4177_good() {
        // Validate
        try {
            aObj.validate("053106113");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4178_bad() {
        // Validate
        try {
            aObj.validate("05310611g");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4179_good() {
        // Validate
        try {
            aObj.validate("053106799");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4180_bad() {
        // Validate
        try {
            aObj.validate("0¦3106799");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4181_good() {
        // Validate
        try {
            aObj.validate("053107303");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4182_bad() {
        // Validate
        try {
            aObj.validate("0531F7303");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4183_good() {
        // Validate
        try {
            aObj.validate("053107633");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4184_bad() {
        // Validate
        try {
            aObj.validate("053107634");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4185_good() {
        // Validate
        try {
            aObj.validate("053107646");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4186_bad() {
        // Validate
        try {
            aObj.validate("0i3107646");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4187_good() {
        // Validate
        try {
            aObj.validate("053107963");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4188_bad() {
        // Validate
        try {
            aObj.validate("05310796­");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4189_good() {
        // Validate
        try {
            aObj.validate("053107989");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4190_bad() {
        // Validate
        try {
            aObj.validate("05310798Î");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4191_good() {
        // Validate
        try {
            aObj.validate("053108137");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4192_bad() {
        // Validate
        try {
            aObj.validate("05310813r");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4193_good() {
        // Validate
        try {
            aObj.validate("053108247");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4194_bad() {
        // Validate
        try {
            aObj.validate("05310[247");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4195_good() {
        // Validate
        try {
            aObj.validate("053108580");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4196_bad() {
        // Validate
        try {
            aObj.validate("013108580");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4197_good() {
        // Validate
        try {
            aObj.validate("053109084");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4198_bad() {
        // Validate
        try {
            aObj.validate("05109084");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4199_good() {
        // Validate
        try {
            aObj.validate("053109204");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4200_bad() {
        // Validate
        try {
            aObj.validate("0531>9204");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4201_good() {
        // Validate
        try {
            aObj.validate("053109327");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4202_bad() {
        // Validate
        try {
            aObj.validate("053109:27");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4203_good() {
        // Validate
        try {
            aObj.validate("053109505");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4204_bad() {
        // Validate
        try {
            aObj.validate("0531095b5");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4205_good() {
        // Validate
        try {
            aObj.validate("053109851");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4206_bad() {
        // Validate
        try {
            aObj.validate("0531Ö9851");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4207_good() {
        // Validate
        try {
            aObj.validate("053109877");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4208_bad() {
        // Validate
        try {
            aObj.validate("0531098²7");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4209_good() {
        // Validate
        try {
            aObj.validate("053110002");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4210_bad() {
        // Validate
        try {
            aObj.validate("053É10002");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4211_good() {
        // Validate
        try {
            aObj.validate("053110112");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4212_bad() {
        // Validate
        try {
            aObj.validate("05310112");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4213_good() {
        // Validate
        try {
            aObj.validate("053110303");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4214_bad() {
        // Validate
        try {
            aObj.validate("03110303");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4215_good() {
        // Validate
        try {
            aObj.validate("053110374");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4216_bad() {
        // Validate
        try {
            aObj.validate("0531c0374");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4217_good() {
        // Validate
        try {
            aObj.validate("053110400");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4218_bad() {
        // Validate
        try {
            aObj.validate("0531104¸0");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4219_good() {
        // Validate
        try {
            aObj.validate("053110507");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4220_bad() {
        // Validate
        try {
            aObj.validate("05311<507");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4221_good() {
        // Validate
        try {
            aObj.validate("053110633");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4222_bad() {
        // Validate
        try {
            aObj.validate("05311063v");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4223_good() {
        // Validate
        try {
            aObj.validate("053110730");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4224_bad() {
        // Validate
        try {
            aObj.validate("0531+0730");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4225_good() {
        // Validate
        try {
            aObj.validate("053111014");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4226_bad() {
        // Validate
        try {
            aObj.validate("05311101)");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4227_good() {
        // Validate
        try {
            aObj.validate("053111577");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4228_bad() {
        // Validate
        try {
            aObj.validate("05311157");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4229_good() {
        // Validate
        try {
            aObj.validate("053111632");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4230_bad() {
        // Validate
        try {
            aObj.validate("05111632");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4231_good() {
        // Validate
        try {
            aObj.validate("053111658");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4232_bad() {
        // Validate
        try {
            aObj.validate("053111M58");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4233_good() {
        // Validate
        try {
            aObj.validate("053111674");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4234_bad() {
        // Validate
        try {
            aObj.validate("053111t74");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4235_good() {
        // Validate
        try {
            aObj.validate("053111690");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4236_bad() {
        // Validate
        try {
            aObj.validate("05311169O");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4237_good() {
        // Validate
        try {
            aObj.validate("053111700");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4238_bad() {
        // Validate
        try {
            aObj.validate("05311170Ø");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4239_good() {
        // Validate
        try {
            aObj.validate("053111726");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4240_bad() {
        // Validate
        try {
            aObj.validate("05111726");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4241_good() {
        // Validate
        try {
            aObj.validate("053111810");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4242_bad() {
        // Validate
        try {
            aObj.validate("0531Ç1810");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4243_good() {
        // Validate
        try {
            aObj.validate("053111836");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4244_bad() {
        // Validate
        try {
            aObj.validate("0531G1836");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4245_good() {
        // Validate
        try {
            aObj.validate("053111849");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4246_bad() {
        // Validate
        try {
            aObj.validate("05311149");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4247_good() {
        // Validate
        try {
            aObj.validate("053111920");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4248_bad() {
        // Validate
        try {
            aObj.validate("053|11920");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4249_good() {
        // Validate
        try {
            aObj.validate("053111988");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4250_bad() {
        // Validate
        try {
            aObj.validate("0531119	8");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4251_good() {
        // Validate
        try {
            aObj.validate("053111991");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4252_bad() {
        // Validate
        try {
            aObj.validate("05311199Ç");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4253_good() {
        // Validate
        try {
            aObj.validate("053112000");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4254_bad() {
        // Validate
        try {
            aObj.validate("05311000");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4255_good() {
        // Validate
        try {
            aObj.validate("053112039");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4256_bad() {
        // Validate
        try {
            aObj.validate("05311239");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4257_good() {
        // Validate
        try {
            aObj.validate("053112042");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4258_bad() {
        // Validate
        try {
            aObj.validate("05311b042");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4259_good() {
        // Validate
        try {
            aObj.validate("053112055");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4260_bad() {
        // Validate
        try {
            aObj.validate("053112Æ55");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4261_good() {
        // Validate
        try {
            aObj.validate("053112068");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4262_bad() {
        // Validate
        try {
            aObj.validate("0531É2068");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4263_good() {
        // Validate
        try {
            aObj.validate("053112071");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4264_bad() {
        // Validate
        try {
            aObj.validate("05311f071");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4265_good() {
        // Validate
        try {
            aObj.validate("053112097");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4266_bad() {
        // Validate
        try {
            aObj.validate("0S3112097");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4267_good() {
        // Validate
        try {
            aObj.validate("053112110");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4268_bad() {
        // Validate
        try {
            aObj.validate("0531121K0");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4269_good() {
        // Validate
        try {
            aObj.validate("053112136");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4270_bad() {
        // Validate
        try {
            aObj.validate("05311)136");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4271_good() {
        // Validate
        try {
            aObj.validate("053112149");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4272_bad() {
        // Validate
        try {
            aObj.validate("03112149");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4273_good() {
        // Validate
        try {
            aObj.validate("053112152");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4274_bad() {
        // Validate
        try {
            aObj.validate("05311215");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4275_good() {
        // Validate
        try {
            aObj.validate("053112178");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4276_bad() {
        // Validate
        try {
            aObj.validate("05312178");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4277_good() {
        // Validate
        try {
            aObj.validate("053112204");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4278_bad() {
        // Validate
        try {
            aObj.validate("05311220Ú");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4279_good() {
        // Validate
        try {
            aObj.validate("053112217");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4280_bad() {
        // Validate
        try {
            aObj.validate("053©12217");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4281_good() {
        // Validate
        try {
            aObj.validate("053112220");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4282_bad() {
        // Validate
        try {
            aObj.validate("05311220");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4283_good() {
        // Validate
        try {
            aObj.validate("053112233");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4284_bad() {
        // Validate
        try {
            aObj.validate("05311223~");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4285_good() {
        // Validate
        try {
            aObj.validate("053112246");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4286_bad() {
        // Validate
        try {
            aObj.validate("05311224");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4287_good() {
        // Validate
        try {
            aObj.validate("053112259");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4288_bad() {
        // Validate
        try {
            aObj.validate("03112259");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4289_good() {
        // Validate
        try {
            aObj.validate("053112275");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4290_bad() {
        // Validate
        try {
            aObj.validate("05311227");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4291_good() {
        // Validate
        try {
            aObj.validate("053112288");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4292_bad() {
        // Validate
        try {
            aObj.validate("05º112288");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4293_good() {
        // Validate
        try {
            aObj.validate("053112291");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4294_bad() {
        // Validate
        try {
            aObj.validate("053#12291");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4295_good() {
        // Validate
        try {
            aObj.validate("053112314");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4296_bad() {
        // Validate
        try {
            aObj.validate("05311231");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4297_good() {
        // Validate
        try {
            aObj.validate("053112327");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4298_bad() {
        // Validate
        try {
            aObj.validate("0F3112327");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4299_good() {
        // Validate
        try {
            aObj.validate("053112330");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4300_bad() {
        // Validate
        try {
            aObj.validate("053»12330");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4301_good() {
        // Validate
        try {
            aObj.validate("053112343");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4302_bad() {
        // Validate
        try {
            aObj.validate("0[3112343");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4303_good() {
        // Validate
        try {
            aObj.validate("053112356");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4304_bad() {
        // Validate
        try {
            aObj.validate("05311235");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4305_good() {
        // Validate
        try {
            aObj.validate("053112372");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4306_bad() {
        // Validate
        try {
            aObj.validate("0531j2372");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4307_good() {
        // Validate
        try {
            aObj.validate("053112385");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4308_bad() {
        // Validate
        try {
            aObj.validate("05311h385");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4309_good() {
        // Validate
        try {
            aObj.validate("053112408");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4310_bad() {
        // Validate
        try {
            aObj.validate("0531Ö2408");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4311_good() {
        // Validate
        try {
            aObj.validate("053112411");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4312_bad() {
        // Validate
        try {
            aObj.validate("0¤3112411");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4313_good() {
        // Validate
        try {
            aObj.validate("053112424");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4314_bad() {
        // Validate
        try {
            aObj.validate("05311¥424");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4315_good() {
        // Validate
        try {
            aObj.validate("053112437");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4316_bad() {
        // Validate
        try {
            aObj.validate("05311Ø437");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4317_good() {
        // Validate
        try {
            aObj.validate("053112440");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4318_bad() {
        // Validate
        try {
            aObj.validate("05311240");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4319_good() {
        // Validate
        try {
            aObj.validate("053112453");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4320_bad() {
        // Validate
        try {
            aObj.validate("05311453");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4321_good() {
        // Validate
        try {
            aObj.validate("053112466");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4322_bad() {
        // Validate
        try {
            aObj.validate("0Þ3112466");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4323_good() {
        // Validate
        try {
            aObj.validate("053112479");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4324_bad() {
        // Validate
        try {
            aObj.validate("05311247<");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4325_good() {
        // Validate
        try {
            aObj.validate("053112482");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4326_bad() {
        // Validate
        try {
            aObj.validate("05311282");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4327_good() {
        // Validate
        try {
            aObj.validate("053112495");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4328_bad() {
        // Validate
        try {
            aObj.validate("05112495");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4329_good() {
        // Validate
        try {
            aObj.validate("053112505");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4330_bad() {
        // Validate
        try {
            aObj.validate("053u12505");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4331_good() {
        // Validate
        try {
            aObj.validate("053112518");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4332_bad() {
        // Validate
        try {
            aObj.validate("05311h518");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4333_good() {
        // Validate
        try {
            aObj.validate("053112521");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4334_bad() {
        // Validate
        try {
            aObj.validate("05311251");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4335_good() {
        // Validate
        try {
            aObj.validate("053112534");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4336_bad() {
        // Validate
        try {
            aObj.validate("0q3112534");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4337_good() {
        // Validate
        try {
            aObj.validate("053112547");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4338_bad() {
        // Validate
        try {
            aObj.validate("05312547");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4339_good() {
        // Validate
        try {
            aObj.validate("053112550");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4340_bad() {
        // Validate
        try {
            aObj.validate("05º112550");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4341_good() {
        // Validate
        try {
            aObj.validate("053112563");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4342_bad() {
        // Validate
        try {
            aObj.validate("05311Û563");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4343_good() {
        // Validate
        try {
            aObj.validate("053112576");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4344_bad() {
        // Validate
        try {
            aObj.validate("053?12576");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4345_good() {
        // Validate
        try {
            aObj.validate("053112592");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4346_bad() {
        // Validate
        try {
            aObj.validate("03112592");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4347_good() {
        // Validate
        try {
            aObj.validate("053112602");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4348_bad() {
        // Validate
        try {
            aObj.validate("05Ù112602");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4349_good() {
        // Validate
        try {
            aObj.validate("053112615");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4350_bad() {
        // Validate
        try {
            aObj.validate("0531s2615");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4351_good() {
        // Validate
        try {
            aObj.validate("053112631");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4352_bad() {
        // Validate
        try {
            aObj.validate("0531©2631");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4353_good() {
        // Validate
        try {
            aObj.validate("053112657");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4354_bad() {
        // Validate
        try {
            aObj.validate("053112c57");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4355_good() {
        // Validate
        try {
            aObj.validate("053112660");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4356_bad() {
        // Validate
        try {
            aObj.validate("053912660");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4357_good() {
        // Validate
        try {
            aObj.validate("053112673");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4358_bad() {
        // Validate
        try {
            aObj.validate("0m3112673");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4359_good() {
        // Validate
        try {
            aObj.validate("053112686");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4360_bad() {
        // Validate
        try {
            aObj.validate("053112086");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4361_good() {
        // Validate
        try {
            aObj.validate("053112709");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4362_bad() {
        // Validate
        try {
            aObj.validate("05311270");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4363_good() {
        // Validate
        try {
            aObj.validate("053112712");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4364_bad() {
        // Validate
        try {
            aObj.validate("05311212");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4365_good() {
        // Validate
        try {
            aObj.validate("053112738");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4366_bad() {
        // Validate
        try {
            aObj.validate("053}12738");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4367_good() {
        // Validate
        try {
            aObj.validate("053112754");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4368_bad() {
        // Validate
        try {
            aObj.validate("0531H2754");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4369_good() {
        // Validate
        try {
            aObj.validate("053112770");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4370_bad() {
        // Validate
        try {
            aObj.validate("053112Ñ70");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4371_good() {
        // Validate
        try {
            aObj.validate("053112783");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4372_bad() {
        // Validate
        try {
            aObj.validate("05311278q");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4373_good() {
        // Validate
        try {
            aObj.validate("053112796");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4374_bad() {
        // Validate
        try {
            aObj.validate("053E12796");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4375_good() {
        // Validate
        try {
            aObj.validate("053112806");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4376_bad() {
        // Validate
        try {
            aObj.validate("053Û12806");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4377_good() {
        // Validate
        try {
            aObj.validate("053112822");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4378_bad() {
        // Validate
        try {
            aObj.validate("0531128s2");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4379_good() {
        // Validate
        try {
            aObj.validate("053112848");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4380_bad() {
        // Validate
        try {
            aObj.validate("03112848");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4381_good() {
        // Validate
        try {
            aObj.validate("053112851");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4382_bad() {
        // Validate
        try {
            aObj.validate("05311285");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4383_good() {
        // Validate
        try {
            aObj.validate("053112864");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4384_bad() {
        // Validate
        try {
            aObj.validate("0531Ä2864");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4385_good() {
        // Validate
        try {
            aObj.validate("053112880");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4386_bad() {
        // Validate
        try {
            aObj.validate("05311880");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4387_good() {
        // Validate
        try {
            aObj.validate("053174019");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4388_bad() {
        // Validate
        try {
            aObj.validate("03174019");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4389_good() {
        // Validate
        try {
            aObj.validate("053174048");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4390_bad() {
        // Validate
        try {
            aObj.validate("05317404G");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4391_good() {
        // Validate
        try {
            aObj.validate("053174051");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4392_bad() {
        // Validate
        try {
            aObj.validate("053174n51");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4393_good() {
        // Validate
        try {
            aObj.validate("053174103");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4394_bad() {
        // Validate
        try {
            aObj.validate("053174{03");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4395_good() {
        // Validate
        try {
            aObj.validate("053174213");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4396_bad() {
        // Validate
        try {
            aObj.validate("05317421Ç");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4397_good() {
        // Validate
        try {
            aObj.validate("053174239");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4398_bad() {
        // Validate
        try {
            aObj.validate("0531¥4239");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4399_good() {
        // Validate
        try {
            aObj.validate("053185066");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4400_bad() {
        // Validate
        try {
            aObj.validate("0`3185066");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4401_good() {
        // Validate
        try {
            aObj.validate("053185079");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4402_bad() {
        // Validate
        try {
            aObj.validate("05318579");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4403_good() {
        // Validate
        try {
            aObj.validate("053185105");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4404_bad() {
        // Validate
        try {
            aObj.validate("05318515");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4405_good() {
        // Validate
        try {
            aObj.validate("053185192");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4406_bad() {
        // Validate
        try {
            aObj.validate("05185192");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4407_good() {
        // Validate
        try {
            aObj.validate("053185299");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4408_bad() {
        // Validate
        try {
            aObj.validate("05Â185299");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4409_good() {
        // Validate
        try {
            aObj.validate("053185406");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4410_bad() {
        // Validate
        try {
            aObj.validate("05385406");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4411_good() {
        // Validate
        try {
            aObj.validate("053185503");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4412_bad() {
        // Validate
        try {
            aObj.validate("05318Ê503");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4413_good() {
        // Validate
        try {
            aObj.validate("053185574");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4414_bad() {
        // Validate
        try {
            aObj.validate("05318w574");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4415_good() {
        // Validate
        try {
            aObj.validate("053185587");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4416_bad() {
        // Validate
        try {
            aObj.validate("05385587");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4417_good() {
        // Validate
        try {
            aObj.validate("053185613");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4418_bad() {
        // Validate
        try {
            aObj.validate("05315613");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4419_good() {
        // Validate
        try {
            aObj.validate("053185668");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4420_bad() {
        // Validate
        try {
            aObj.validate("0531856Ë8");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4421_good() {
        // Validate
        try {
            aObj.validate("053185671");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4422_bad() {
        // Validate
        try {
            aObj.validate("0Å3185671");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4423_good() {
        // Validate
        try {
            aObj.validate("053200019");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4424_bad() {
        // Validate
        try {
            aObj.validate("05&200019");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4425_good() {
        // Validate
        try {
            aObj.validate("053200064");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4426_bad() {
        // Validate
        try {
            aObj.validate("053Ò00064");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4427_good() {
        // Validate
        try {
            aObj.validate("053200446");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4428_bad() {
        // Validate
        try {
            aObj.validate("05320446");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4429_good() {
        // Validate
        try {
            aObj.validate("053200666");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4430_bad() {
        // Validate
        try {
            aObj.validate("0[3200666");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4431_good() {
        // Validate
        try {
            aObj.validate("053200983");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4432_bad() {
        // Validate
        try {
            aObj.validate("05320Ö983");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4433_good() {
        // Validate
        try {
            aObj.validate("053201034");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4434_bad() {
        // Validate
        try {
            aObj.validate("05320y034");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4435_good() {
        // Validate
        try {
            aObj.validate("053201186");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4436_bad() {
        // Validate
        try {
            aObj.validate("0532011©6");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4437_good() {
        // Validate
        try {
            aObj.validate("053201487");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4438_bad() {
        // Validate
        try {
            aObj.validate("05r201487");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4439_good() {
        // Validate
        try {
            aObj.validate("053201607");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4440_bad() {
        // Validate
        try {
            aObj.validate("05Ñ201607");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4441_good() {
        // Validate
        try {
            aObj.validate("053201610");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4442_bad() {
        // Validate
        try {
            aObj.validate("053201½10");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4443_good() {
        // Validate
        try {
            aObj.validate("053201746");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4444_bad() {
        // Validate
        try {
            aObj.validate("053201Õ46");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4445_good() {
        // Validate
        try {
            aObj.validate("053201814");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4446_bad() {
        // Validate
        try {
            aObj.validate("0532018Z4");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4447_good() {
        // Validate
        try {
            aObj.validate("053201827");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4448_bad() {
        // Validate
        try {
            aObj.validate("053Ñ01827");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4449_good() {
        // Validate
        try {
            aObj.validate("053201856");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4450_bad() {
        // Validate
        try {
            aObj.validate("0532018Ò6");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4451_good() {
        // Validate
        try {
            aObj.validate("053201869");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4452_bad() {
        // Validate
        try {
            aObj.validate("05¬201869");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4453_good() {
        // Validate
        try {
            aObj.validate("053201872");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4454_bad() {
        // Validate
        try {
            aObj.validate("053201877");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4455_good() {
        // Validate
        try {
            aObj.validate("053201885");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4456_bad() {
        // Validate
        try {
            aObj.validate("05h201885");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4457_good() {
        // Validate
        try {
            aObj.validate("053201924");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4458_bad() {
        // Validate
        try {
            aObj.validate("053Å01924");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4459_good() {
        // Validate
        try {
            aObj.validate("053201953");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4460_bad() {
        // Validate
        try {
            aObj.validate("0532019Ô3");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4461_good() {
        // Validate
        try {
            aObj.validate("053201982");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4462_bad() {
        // Validate
        try {
            aObj.validate("0532019[2");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4463_good() {
        // Validate
        try {
            aObj.validate("053202062");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4464_bad() {
        // Validate
        try {
            aObj.validate("05320206'");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4465_good() {
        // Validate
        try {
            aObj.validate("053202091");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4466_bad() {
        // Validate
        try {
            aObj.validate("05202091");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4467_good() {
        // Validate
        try {
            aObj.validate("053202114");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4468_bad() {
        // Validate
        try {
            aObj.validate("05322114");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4469_good() {
        // Validate
        try {
            aObj.validate("053202127");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4470_bad() {
        // Validate
        try {
            aObj.validate("0532Ü2127");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4471_good() {
        // Validate
        try {
            aObj.validate("053202130");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4472_bad() {
        // Validate
        try {
            aObj.validate("05202130");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4473_good() {
        // Validate
        try {
            aObj.validate("053202208");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4474_bad() {
        // Validate
        try {
            aObj.validate("0532022o8");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4475_good() {
        // Validate
        try {
            aObj.validate("053202240");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4476_bad() {
        // Validate
        try {
            aObj.validate("05320Û240");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4477_good() {
        // Validate
        try {
            aObj.validate("053202279");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4478_bad() {
        // Validate
        try {
            aObj.validate("05202279");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4479_good() {
        // Validate
        try {
            aObj.validate("053202282");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4480_bad() {
        // Validate
        try {
            aObj.validate("053202Ù82");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4481_good() {
        // Validate
        try {
            aObj.validate("053202305");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4482_bad() {
        // Validate
        try {
            aObj.validate("0A3202305");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4483_good() {
        // Validate
        try {
            aObj.validate("053202318");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4484_bad() {
        // Validate
        try {
            aObj.validate("0\3202318");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4485_good() {
        // Validate
        try {
            aObj.validate("053202321");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4486_bad() {
        // Validate
        try {
            aObj.validate("053Û02321");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4487_good() {
        // Validate
        try {
            aObj.validate("053202350");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4488_bad() {
        // Validate
        try {
            aObj.validate("05320250");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4489_good() {
        // Validate
        try {
            aObj.validate("053202596");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4490_bad() {
        // Validate
        try {
            aObj.validate("05320|596");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4491_good() {
        // Validate
        try {
            aObj.validate("053202871");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4492_bad() {
        // Validate
        try {
            aObj.validate("05320287}");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4493_good() {
        // Validate
        try {
            aObj.validate("053203210");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4494_bad() {
        // Validate
        try {
            aObj.validate("05320321v");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4495_good() {
        // Validate
        try {
            aObj.validate("053204280");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4496_bad() {
        // Validate
        try {
            aObj.validate("05z204280");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4497_good() {
        // Validate
        try {
            aObj.validate("053206657");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4498_bad() {
        // Validate
        try {
            aObj.validate("05320665");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4499_good() {
        // Validate
        try {
            aObj.validate("053206660");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4500_bad() {
        // Validate
        try {
            aObj.validate("05320660");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4501_good() {
        // Validate
        try {
            aObj.validate("053206699");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4502_bad() {
        // Validate
        try {
            aObj.validate("05320¨699");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4503_good() {
        // Validate
        try {
            aObj.validate("053206738");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4504_bad() {
        // Validate
        try {
            aObj.validate("053W06738");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4505_good() {
        // Validate
        try {
            aObj.validate("053206741");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4506_bad() {
        // Validate
        try {
            aObj.validate("05206741");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4507_good() {
        // Validate
        try {
            aObj.validate("053206783");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4508_bad() {
        // Validate
        try {
            aObj.validate("0t3206783");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4509_good() {
        // Validate
        try {
            aObj.validate("053206819");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4510_bad() {
        // Validate
        try {
            aObj.validate("053Ã06819");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4511_good() {
        // Validate
        try {
            aObj.validate("053206877");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4512_bad() {
        // Validate
        try {
            aObj.validate("05320Ä877");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4513_good() {
        // Validate
        try {
            aObj.validate("053206893");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4514_bad() {
        // Validate
        try {
            aObj.validate("05Õ206893");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4515_good() {
        // Validate
        try {
            aObj.validate("053206961");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4516_bad() {
        // Validate
        try {
            aObj.validate("05320696«");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4517_good() {
        // Validate
        try {
            aObj.validate("053207054");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4518_bad() {
        // Validate
        try {
            aObj.validate("05ª207054");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4519_good() {
        // Validate
        try {
            aObj.validate("053207106");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4520_bad() {
        // Validate
        try {
            aObj.validate("05320 106");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4521_good() {
        // Validate
        try {
            aObj.validate("053207119");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4522_bad() {
        // Validate
        try {
            aObj.validate("0532071¦9");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4523_good() {
        // Validate
        try {
            aObj.validate("053207122");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4524_bad() {
        // Validate
        try {
            aObj.validate("053(07122");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4525_good() {
        // Validate
        try {
            aObj.validate("053207164");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4526_bad() {
        // Validate
        try {
            aObj.validate("053^07164");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4527_good() {
        // Validate
        try {
            aObj.validate("053207216");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4528_bad() {
        // Validate
        try {
            aObj.validate("03207216");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4529_good() {
        // Validate
        try {
            aObj.validate("053207339");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4530_bad() {
        // Validate
        try {
            aObj.validate("0G3207339");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4531_good() {
        // Validate
        try {
            aObj.validate("053207371");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4532_bad() {
        // Validate
        try {
            aObj.validate("0532¿7371");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4533_good() {
        // Validate
        try {
            aObj.validate("053207397");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4534_bad() {
        // Validate
        try {
            aObj.validate("0532073:7");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4535_good() {
        // Validate
        try {
            aObj.validate("053207533");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4536_bad() {
        // Validate
        try {
            aObj.validate("0532075*3");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4537_good() {
        // Validate
        try {
            aObj.validate("053207614");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4538_bad() {
        // Validate
        try {
            aObj.validate("05320714");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4539_good() {
        // Validate
        try {
            aObj.validate("053207669");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4540_bad() {
        // Validate
        try {
            aObj.validate("0/3207669");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4541_good() {
        // Validate
        try {
            aObj.validate("053207685");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4542_bad() {
        // Validate
        try {
            aObj.validate("05|207685");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4543_good() {
        // Validate
        try {
            aObj.validate("053207766");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4544_bad() {
        // Validate
        try {
            aObj.validate("0532077ß6");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4545_good() {
        // Validate
        try {
            aObj.validate("053207902");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4546_bad() {
        // Validate
        try {
            aObj.validate("05320702");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4547_good() {
        // Validate
        try {
            aObj.validate("053207931");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4548_bad() {
        // Validate
        try {
            aObj.validate("053207/31");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4549_good() {
        // Validate
        try {
            aObj.validate("053207944");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4550_bad() {
        // Validate
        try {
            aObj.validate("05320794");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4551_good() {
        // Validate
        try {
            aObj.validate("053207957");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4552_bad() {
        // Validate
        try {
            aObj.validate("05Õ207957");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4553_good() {
        // Validate
        try {
            aObj.validate("053207960");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4554_bad() {
        // Validate
        try {
            aObj.validate("053v07960");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4555_good() {
        // Validate
        try {
            aObj.validate("053207973");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4556_bad() {
        // Validate
        try {
            aObj.validate("05320797:");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4557_good() {
        // Validate
        try {
            aObj.validate("053207986");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4558_bad() {
        // Validate
        try {
            aObj.validate("05320798");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4559_good() {
        // Validate
        try {
            aObj.validate("053207999");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4560_bad() {
        // Validate
        try {
            aObj.validate("053207¼99");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4561_good() {
        // Validate
        try {
            aObj.validate("053208008");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4562_bad() {
        // Validate
        try {
            aObj.validate("05320808");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4563_good() {
        // Validate
        try {
            aObj.validate("053208011");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4564_bad() {
        // Validate
        try {
            aObj.validate("0532.8011");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4565_good() {
        // Validate
        try {
            aObj.validate("053208024");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4566_bad() {
        // Validate
        try {
            aObj.validate("05]208024");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4567_good() {
        // Validate
        try {
            aObj.validate("053208037");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4568_bad() {
        // Validate
        try {
            aObj.validate("05Ü208037");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4569_good() {
        // Validate
        try {
            aObj.validate("053208040");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4570_bad() {
        // Validate
        try {
            aObj.validate("0Ø3208040");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4571_good() {
        // Validate
        try {
            aObj.validate("053208053");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4572_bad() {
        // Validate
        try {
            aObj.validate("0Ü3208053");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4573_good() {
        // Validate
        try {
            aObj.validate("053208066");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4574_bad() {
        // Validate
        try {
            aObj.validate("05308066");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4575_good() {
        // Validate
        try {
            aObj.validate("053208079");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4576_bad() {
        // Validate
        try {
            aObj.validate("058208079");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4577_good() {
        // Validate
        try {
            aObj.validate("053208095");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4578_bad() {
        // Validate
        try {
            aObj.validate("0532A8095");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4579_good() {
        // Validate
        try {
            aObj.validate("053208105");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4580_bad() {
        // Validate
        try {
            aObj.validate("053D08105");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4581_good() {
        // Validate
        try {
            aObj.validate("053208118");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4582_bad() {
        // Validate
        try {
            aObj.validate("05¡208118");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4583_good() {
        // Validate
        try {
            aObj.validate("053208121");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4584_bad() {
        // Validate
        try {
            aObj.validate("053228121");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4585_good() {
        // Validate
        try {
            aObj.validate("053208134");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4586_bad() {
        // Validate
        try {
            aObj.validate("0532_8134");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4587_good() {
        // Validate
        try {
            aObj.validate("053208147");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4588_bad() {
        // Validate
        try {
            aObj.validate("0532Û8147");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4589_good() {
        // Validate
        try {
            aObj.validate("053208150");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4590_bad() {
        // Validate
        try {
            aObj.validate("0532H8150");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4591_good() {
        // Validate
        try {
            aObj.validate("053208163");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4592_bad() {
        // Validate
        try {
            aObj.validate("05320863");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4593_good() {
        // Validate
        try {
            aObj.validate("053208176");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4594_bad() {
        // Validate
        try {
            aObj.validate("05320817`");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4595_good() {
        // Validate
        try {
            aObj.validate("053208192");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4596_bad() {
        // Validate
        try {
            aObj.validate("0532081?2");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4597_good() {
        // Validate
        try {
            aObj.validate("053208202");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4598_bad() {
        // Validate
        try {
            aObj.validate("03208202");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4599_good() {
        // Validate
        try {
            aObj.validate("053208215");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4600_bad() {
        // Validate
        try {
            aObj.validate("0J3208215");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4601_good() {
        // Validate
        try {
            aObj.validate("053208231");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4602_bad() {
        // Validate
        try {
            aObj.validate("0K3208231");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4603_good() {
        // Validate
        try {
            aObj.validate("053208244");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4604_bad() {
        // Validate
        try {
            aObj.validate("03208244");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4605_good() {
        // Validate
        try {
            aObj.validate("053208260");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4606_bad() {
        // Validate
        try {
            aObj.validate("053208O60");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4607_good() {
        // Validate
        try {
            aObj.validate("053208273");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4608_bad() {
        // Validate
        try {
            aObj.validate("0532082U3");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4609_good() {
        // Validate
        try {
            aObj.validate("053208309");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4610_bad() {
        // Validate
        try {
            aObj.validate("053ß08309");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4611_good() {
        // Validate
        try {
            aObj.validate("053208312");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4612_bad() {
        // Validate
        try {
            aObj.validate("053208j12");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4613_good() {
        // Validate
        try {
            aObj.validate("053208338");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4614_bad() {
        // Validate
        try {
            aObj.validate("053P08338");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4615_good() {
        // Validate
        try {
            aObj.validate("053273981");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4616_bad() {
        // Validate
        try {
            aObj.validate("053~73981");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4617_good() {
        // Validate
        try {
            aObj.validate("053274061");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4618_bad() {
        // Validate
        try {
            aObj.validate("0532740d1");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4619_good() {
        // Validate
        try {
            aObj.validate("053274074");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4620_bad() {
        // Validate
        try {
            aObj.validate("05327É074");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4621_good() {
        // Validate
        try {
            aObj.validate("053274090");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4622_bad() {
        // Validate
        try {
            aObj.validate("0532740q0");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4623_good() {
        // Validate
        try {
            aObj.validate("053274113");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4624_bad() {
        // Validate
        try {
            aObj.validate("053D74113");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4625_good() {
        // Validate
        try {
            aObj.validate("053274139");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4626_bad() {
        // Validate
        try {
            aObj.validate("0¹3274139");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4627_good() {
        // Validate
        try {
            aObj.validate("053274142");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4628_bad() {
        // Validate
        try {
            aObj.validate("05324142");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4629_good() {
        // Validate
        try {
            aObj.validate("053274155");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4630_bad() {
        // Validate
        try {
            aObj.validate("05327455");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4631_good() {
        // Validate
        try {
            aObj.validate("053274168");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4632_bad() {
        // Validate
        try {
            aObj.validate("05327416_");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4633_good() {
        // Validate
        try {
            aObj.validate("053274223");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4634_bad() {
        // Validate
        try {
            aObj.validate("05v274223");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4635_good() {
        // Validate
        try {
            aObj.validate("053285115");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4636_bad() {
        // Validate
        try {
            aObj.validate("053285D15");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4637_good() {
        // Validate
        try {
            aObj.validate("053285160");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4638_bad() {
        // Validate
        try {
            aObj.validate("05328516É");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4639_good() {
        // Validate
        try {
            aObj.validate("053285173");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4640_bad() {
        // Validate
        try {
            aObj.validate("0532S5173");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4641_good() {
        // Validate
        try {
            aObj.validate("053285238");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4642_bad() {
        // Validate
        try {
            aObj.validate("05385238");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4643_good() {
        // Validate
        try {
            aObj.validate("053285241");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4644_bad() {
        // Validate
        try {
            aObj.validate("05328241");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4645_good() {
        // Validate
        try {
            aObj.validate("053285487");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4646_bad() {
        // Validate
        try {
            aObj.validate("05328}487");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4647_good() {
        // Validate
        try {
            aObj.validate("053285717");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4648_bad() {
        // Validate
        try {
            aObj.validate("0532«5717");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4649_good() {
        // Validate
        try {
            aObj.validate("053900225");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4650_bad() {
        // Validate
        try {
            aObj.validate("053900}25");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4651_good() {
        // Validate
        try {
            aObj.validate("053900377");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4652_bad() {
        // Validate
        try {
            aObj.validate("0539003F7");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4653_good() {
        // Validate
        try {
            aObj.validate("053901198");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4654_bad() {
        // Validate
        try {
            aObj.validate("053901Ë98");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4655_good() {
        // Validate
        try {
            aObj.validate("053901473");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4656_bad() {
        // Validate
        try {
            aObj.validate("053±01473");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4657_good() {
        // Validate
        try {
            aObj.validate("053902168");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4658_bad() {
        // Validate
        try {
            aObj.validate("053W02168");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4659_good() {
        // Validate
        try {
            aObj.validate("053902197");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4660_bad() {
        // Validate
        try {
            aObj.validate("053902Â97");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4661_good() {
        // Validate
        try {
            aObj.validate("053904483");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4662_bad() {
        // Validate
        try {
            aObj.validate("05390b483");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4663_good() {
        // Validate
        try {
            aObj.validate("053905877");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4664_bad() {
        // Validate
        try {
            aObj.validate("05¦905877");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4665_good() {
        // Validate
        try {
            aObj.validate("053906041");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4666_bad() {
        // Validate
        try {
            aObj.validate("0539060~1");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4667_good() {
        // Validate
        try {
            aObj.validate("053908081");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4668_bad() {
        // Validate
        try {
            aObj.validate("0539T8081");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4669_good() {
        // Validate
        try {
            aObj.validate("053908188");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4670_bad() {
        // Validate
        try {
            aObj.validate("05308188");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4671_good() {
        // Validate
        try {
            aObj.validate("054000030");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4672_bad() {
        // Validate
        try {
            aObj.validate("05¢000030");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4673_good() {
        // Validate
        try {
            aObj.validate("054000043");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4674_bad() {
        // Validate
        try {
            aObj.validate("05400004N");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4675_good() {
        // Validate
        try {
            aObj.validate("054000056");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4676_bad() {
        // Validate
        try {
            aObj.validate("0540000¹6");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4677_good() {
        // Validate
        try {
            aObj.validate("054000551");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4678_bad() {
        // Validate
        try {
            aObj.validate("05400051");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4679_good() {
        // Validate
        try {
            aObj.validate("054000807");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4680_bad() {
        // Validate
        try {
            aObj.validate("05F000807");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4681_good() {
        // Validate
        try {
            aObj.validate("054000959");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4682_bad() {
        // Validate
        try {
            aObj.validate("05U000959");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4683_good() {
        // Validate
        try {
            aObj.validate("054001204");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4684_bad() {
        // Validate
        try {
            aObj.validate("05w001204");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4685_good() {
        // Validate
        try {
            aObj.validate("054001220");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4686_bad() {
        // Validate
        try {
            aObj.validate("054<01220");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4687_good() {
        // Validate
        try {
            aObj.validate("054001314");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4688_bad() {
        // Validate
        try {
            aObj.validate("054:01314");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4689_good() {
        // Validate
        try {
            aObj.validate("054001518");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4690_bad() {
        // Validate
        try {
            aObj.validate("0540015©8");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4691_good() {
        // Validate
        try {
            aObj.validate("054001534");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4692_bad() {
        // Validate
        try {
            aObj.validate("054001)34");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4693_good() {
        // Validate
        try {
            aObj.validate("054001547");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4694_bad() {
        // Validate
        try {
            aObj.validate("05400i547");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4695_good() {
        // Validate
        try {
            aObj.validate("054001550");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4696_bad() {
        // Validate
        try {
            aObj.validate("05401550");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4697_good() {
        // Validate
        try {
            aObj.validate("054001602");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4698_bad() {
        // Validate
        try {
            aObj.validate("05400160:");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4699_good() {
        // Validate
        try {
            aObj.validate("054001628");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4700_bad() {
        // Validate
        try {
            aObj.validate("054<01628");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4701_good() {
        // Validate
        try {
            aObj.validate("054001631");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4702_bad() {
        // Validate
        try {
            aObj.validate("05Æ001631");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4703_good() {
        // Validate
        try {
            aObj.validate("054001644");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4704_bad() {
        // Validate
        try {
            aObj.validate("0¼4001644");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4705_good() {
        // Validate
        try {
            aObj.validate("054001673");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4706_bad() {
        // Validate
        try {
            aObj.validate("054½01673");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4707_good() {
        // Validate
        try {
            aObj.validate("054001686");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4708_bad() {
        // Validate
        try {
            aObj.validate("05400686");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4709_good() {
        // Validate
        try {
            aObj.validate("054001699");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4710_bad() {
        // Validate
        try {
            aObj.validate("05400P699");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4711_good() {
        // Validate
        try {
            aObj.validate("054001709");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4712_bad() {
        // Validate
        try {
            aObj.validate("05*001709");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4713_good() {
        // Validate
        try {
            aObj.validate("054001712");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4714_bad() {
        // Validate
        try {
            aObj.validate("05401712");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4715_good() {
        // Validate
        try {
            aObj.validate("054001725");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4716_bad() {
        // Validate
        try {
            aObj.validate("0540017*5");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4717_good() {
        // Validate
        try {
            aObj.validate("054001741");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4718_bad() {
        // Validate
        try {
            aObj.validate("04001741");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4719_good() {
        // Validate
        try {
            aObj.validate("054073630");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4720_bad() {
        // Validate
        try {
            aObj.validate("0540736 0");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4721_good() {
        // Validate
        try {
            aObj.validate("054080160");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4722_bad() {
        // Validate
        try {
            aObj.validate("0540801;0");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4723_good() {
        // Validate
        try {
            aObj.validate("054080212");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4724_bad() {
        // Validate
        try {
            aObj.validate("05408021À");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4725_good() {
        // Validate
        try {
            aObj.validate("055000110");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4726_bad() {
        // Validate
        try {
            aObj.validate("055p00110");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4727_good() {
        // Validate
        try {
            aObj.validate("055000165");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4728_bad() {
        // Validate
        try {
            aObj.validate("05500165");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4729_good() {
        // Validate
        try {
            aObj.validate("055000259");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4730_bad() {
        // Validate
        try {
            aObj.validate("05500025R");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4731_good() {
        // Validate
        try {
            aObj.validate("055000262");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4732_bad() {
        // Validate
        try {
            aObj.validate("05500262");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4733_good() {
        // Validate
        try {
            aObj.validate("055000288");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4734_bad() {
        // Validate
        try {
            aObj.validate("055E00288");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4735_good() {
        // Validate
        try {
            aObj.validate("055000372");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4736_bad() {
        // Validate
        try {
            aObj.validate("055000µ72");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4737_good() {
        // Validate
        try {
            aObj.validate("055000615");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4738_bad() {
        // Validate
        try {
            aObj.validate("05_000615");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4739_good() {
        // Validate
        try {
            aObj.validate("055000657");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4740_bad() {
        // Validate
        try {
            aObj.validate("05500657");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4741_good() {
        // Validate
        try {
            aObj.validate("055000770");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4742_bad() {
        // Validate
        try {
            aObj.validate("0´5000770");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4743_good() {
        // Validate
        try {
            aObj.validate("055001054");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4744_bad() {
        // Validate
        try {
            aObj.validate("05501054");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4745_good() {
        // Validate
        try {
            aObj.validate("055001070");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4746_bad() {
        // Validate
        try {
            aObj.validate("055t01070");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4747_good() {
        // Validate
        try {
            aObj.validate("055001096");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4748_bad() {
        // Validate
        try {
            aObj.validate("05001096");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4749_good() {
        // Validate
        try {
            aObj.validate("055001122");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4750_bad() {
        // Validate
        try {
            aObj.validate("05500112S");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4751_good() {
        // Validate
        try {
            aObj.validate("055001151");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4752_bad() {
        // Validate
        try {
            aObj.validate("05500151");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4753_good() {
        // Validate
        try {
            aObj.validate("055001258");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4754_bad() {
        // Validate
        try {
            aObj.validate("0550012.8");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4755_good() {
        // Validate
        try {
            aObj.validate("055001384");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4756_bad() {
        // Validate
        try {
            aObj.validate("055x01384");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4757_good() {
        // Validate
        try {
            aObj.validate("055001698");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4758_bad() {
        // Validate
        try {
            aObj.validate("055j01698");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4759_good() {
        // Validate
        try {
            aObj.validate("055001711");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4760_bad() {
        // Validate
        try {
            aObj.validate("0550017H1");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4761_good() {
        // Validate
        try {
            aObj.validate("055001766");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4762_bad() {
        // Validate
        try {
            aObj.validate("05500176");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4763_good() {
        // Validate
        try {
            aObj.validate("055001876");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4764_bad() {
        // Validate
        try {
            aObj.validate("05500187(");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4765_good() {
        // Validate
        try {
            aObj.validate("055001986");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4766_bad() {
        // Validate
        try {
            aObj.validate("05001986");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4767_good() {
        // Validate
        try {
            aObj.validate("055002150");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4768_bad() {
        // Validate
        try {
            aObj.validate("0550µ2150");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4769_good() {
        // Validate
        try {
            aObj.validate("055002244");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4770_bad() {
        // Validate
        try {
            aObj.validate("05500224¾");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4771_good() {
        // Validate
        try {
            aObj.validate("055002260");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4772_bad() {
        // Validate
        try {
            aObj.validate("055062260");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4773_good() {
        // Validate
        try {
            aObj.validate("055002286");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4774_bad() {
        // Validate
        try {
            aObj.validate("055002287");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4775_good() {
        // Validate
        try {
            aObj.validate("055002338");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4776_bad() {
        // Validate
        try {
            aObj.validate("0550023?8");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4777_good() {
        // Validate
        try {
            aObj.validate("055002341");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4778_bad() {
        // Validate
        try {
            aObj.validate("05®002341");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4779_good() {
        // Validate
        try {
            aObj.validate("055002367");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4780_bad() {
        // Validate
        try {
            aObj.validate("0550½2367");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4781_good() {
        // Validate
        try {
            aObj.validate("055002406");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4782_bad() {
        // Validate
        try {
            aObj.validate("05500À406");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4783_good() {
        // Validate
        try {
            aObj.validate("055002480");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4784_bad() {
        // Validate
        try {
            aObj.validate("05002480");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4785_good() {
        // Validate
        try {
            aObj.validate("055002503");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4786_bad() {
        // Validate
        try {
            aObj.validate("05B002503");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4787_good() {
        // Validate
        try {
            aObj.validate("055002532");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4788_bad() {
        // Validate
        try {
            aObj.validate("05}002532");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4789_good() {
        // Validate
        try {
            aObj.validate("055002558");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4790_bad() {
        // Validate
        try {
            aObj.validate("05500255");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4791_good() {
        // Validate
        try {
            aObj.validate("055002574");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4792_bad() {
        // Validate
        try {
            aObj.validate("0q5002574");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4793_good() {
        // Validate
        try {
            aObj.validate("055002707");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4794_bad() {
        // Validate
        try {
            aObj.validate("05500270'");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4795_good() {
        // Validate
        try {
            aObj.validate("055002723");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4796_bad() {
        // Validate
        try {
            aObj.validate("0550027?3");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4797_good() {
        // Validate
        try {
            aObj.validate("055002862");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4798_bad() {
        // Validate
        try {
            aObj.validate("05500286");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4799_good() {
        // Validate
        try {
            aObj.validate("055002998");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4800_bad() {
        // Validate
        try {
            aObj.validate("055062998");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4801_good() {
        // Validate
        try {
            aObj.validate("055003094");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4802_bad() {
        // Validate
        try {
            aObj.validate("055h03094");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4803_good() {
        // Validate
        try {
            aObj.validate("055003133");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4804_bad() {
        // Validate
        try {
            aObj.validate("05500­133");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4805_good() {
        // Validate
        try {
            aObj.validate("055003162");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4806_bad() {
        // Validate
        try {
            aObj.validate("055¶03162");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4807_good() {
        // Validate
        try {
            aObj.validate("055003201");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4808_bad() {
        // Validate
        try {
            aObj.validate("05500320");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4809_good() {
        // Validate
        try {
            aObj.validate("055003214");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4810_bad() {
        // Validate
        try {
            aObj.validate("05503214");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4811_good() {
        // Validate
        try {
            aObj.validate("055003272");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4812_bad() {
        // Validate
        try {
            aObj.validate("05500322");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4813_good() {
        // Validate
        try {
            aObj.validate("055003298");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4814_bad() {
        // Validate
        try {
            aObj.validate("055003Æ98");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4815_good() {
        // Validate
        try {
            aObj.validate("055003308");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4816_bad() {
        // Validate
        try {
            aObj.validate("05003308");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4817_good() {
        // Validate
        try {
            aObj.validate("055003337");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4818_bad() {
        // Validate
        try {
            aObj.validate("05503337");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4819_good() {
        // Validate
        try {
            aObj.validate("055003340");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4820_bad() {
        // Validate
        try {
            aObj.validate("055003_40");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4821_good() {
        // Validate
        try {
            aObj.validate("055003353");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4822_bad() {
        // Validate
        try {
            aObj.validate("0550033.3");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4823_good() {
        // Validate
        try {
            aObj.validate("055003366");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4824_bad() {
        // Validate
        try {
            aObj.validate("05g003366");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4825_good() {
        // Validate
        try {
            aObj.validate("055003395");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4826_bad() {
        // Validate
        try {
            aObj.validate("05500335");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4827_good() {
        // Validate
        try {
            aObj.validate("055003405");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4828_bad() {
        // Validate
        try {
            aObj.validate("055f03405");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4829_good() {
        // Validate
        try {
            aObj.validate("055003418");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4830_bad() {
        // Validate
        try {
            aObj.validate("055¹03418");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4831_good() {
        // Validate
        try {
            aObj.validate("055003421");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4832_bad() {
        // Validate
        try {
            aObj.validate("05500342K");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4833_good() {
        // Validate
        try {
            aObj.validate("055003434");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4834_bad() {
        // Validate
        try {
            aObj.validate("0550034x4");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4835_good() {
        // Validate
        try {
            aObj.validate("055003447");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4836_bad() {
        // Validate
        try {
            aObj.validate("0550034#7");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4837_good() {
        // Validate
        try {
            aObj.validate("055003450");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4838_bad() {
        // Validate
        try {
            aObj.validate("05500450");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4839_good() {
        // Validate
        try {
            aObj.validate("055003463");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4840_bad() {
        // Validate
        try {
            aObj.validate("05500346");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4841_good() {
        // Validate
        try {
            aObj.validate("055003489");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4842_bad() {
        // Validate
        try {
            aObj.validate("055p03489");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4843_good() {
        // Validate
        try {
            aObj.validate("055003492");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4844_bad() {
        // Validate
        try {
            aObj.validate("0550·3492");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4845_good() {
        // Validate
        try {
            aObj.validate("055003528");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4846_bad() {
        // Validate
        try {
            aObj.validate("05003528");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4847_good() {
        // Validate
        try {
            aObj.validate("055003560");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4848_bad() {
        // Validate
        try {
            aObj.validate("05500356");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4849_good() {
        // Validate
        try {
            aObj.validate("055036100");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4850_bad() {
        // Validate
        try {
            aObj.validate("05¹036100");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4851_good() {
        // Validate
        try {
            aObj.validate("055073448");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4852_bad() {
        // Validate
        try {
            aObj.validate("055¨73448");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4853_good() {
        // Validate
        try {
            aObj.validate("055073532");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4854_bad() {
        // Validate
        try {
            aObj.validate("0y5073532");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4855_good() {
        // Validate
        try {
            aObj.validate("055073587");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4856_bad() {
        // Validate
        try {
            aObj.validate("05073587");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4857_good() {
        // Validate
        try {
            aObj.validate("055080156");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4858_bad() {
        // Validate
        try {
            aObj.validate("05580156");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4859_good() {
        // Validate
        try {
            aObj.validate("055080266");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4860_bad() {
        // Validate
        try {
            aObj.validate("05,080266");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4861_good() {
        // Validate
        try {
            aObj.validate("055080295");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4862_bad() {
        // Validate
        try {
            aObj.validate("055080)95");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4863_good() {
        // Validate
        try {
            aObj.validate("055080318");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4864_bad() {
        // Validate
        try {
            aObj.validate("05508031");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4865_good() {
        // Validate
        try {
            aObj.validate("055080376");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4866_bad() {
        // Validate
        try {
            aObj.validate("0À5080376");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4867_good() {
        // Validate
        try {
            aObj.validate("055080402");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4868_bad() {
        // Validate
        try {
            aObj.validate("0550Ä0402");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4869_good() {
        // Validate
        try {
            aObj.validate("055080415");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4870_bad() {
        // Validate
        try {
            aObj.validate("055040415");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4871_good() {
        // Validate
        try {
            aObj.validate("055080431");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4872_bad() {
        // Validate
        try {
            aObj.validate("0550804P1");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4873_good() {
        // Validate
        try {
            aObj.validate("056001011");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4874_bad() {
        // Validate
        try {
            aObj.validate("05²001011");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4875_good() {
        // Validate
        try {
            aObj.validate("056001066");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4876_bad() {
        // Validate
        try {
            aObj.validate("056m01066");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4877_good() {
        // Validate
        try {
            aObj.validate("056003158");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4878_bad() {
        // Validate
        try {
            aObj.validate("05600315¤");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4879_good() {
        // Validate
        try {
            aObj.validate("056003174");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4880_bad() {
        // Validate
        try {
            aObj.validate("0560Ë3174");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4881_good() {
        // Validate
        try {
            aObj.validate("056004089");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4882_bad() {
        // Validate
        try {
            aObj.validate("05600g089");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4883_good() {
        // Validate
        try {
            aObj.validate("056004241");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4884_bad() {
        // Validate
        try {
            aObj.validate("0560042Æ1");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4885_good() {
        // Validate
        try {
            aObj.validate("056004445");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4886_bad() {
        // Validate
        try {
            aObj.validate("0560o4445");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4887_good() {
        // Validate
        try {
            aObj.validate("056004623");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4888_bad() {
        // Validate
        try {
            aObj.validate("0&6004623");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4889_good() {
        // Validate
        try {
            aObj.validate("056004720");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4890_bad() {
        // Validate
        try {
            aObj.validate("0560µ4720");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4891_good() {
        // Validate
        try {
            aObj.validate("056005075");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4892_bad() {
        // Validate
        try {
            aObj.validate("05600507¨");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4893_good() {
        // Validate
        try {
            aObj.validate("056005169");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4894_bad() {
        // Validate
        try {
            aObj.validate("056005{69");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4895_good() {
        // Validate
        try {
            aObj.validate("056005253");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4896_bad() {
        // Validate
        try {
            aObj.validate("0560052t3");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4897_good() {
        // Validate
        try {
            aObj.validate("056005318");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4898_bad() {
        // Validate
        try {
            aObj.validate("05605318");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4899_good() {
        // Validate
        try {
            aObj.validate("056005363");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4900_bad() {
        // Validate
        try {
            aObj.validate("056005	63");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4901_good() {
        // Validate
        try {
            aObj.validate("056005376");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4902_bad() {
        // Validate
        try {
            aObj.validate("05600576");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4903_good() {
        // Validate
        try {
            aObj.validate("056006786");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4904_bad() {
        // Validate
        try {
            aObj.validate("05600786");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4905_good() {
        // Validate
        try {
            aObj.validate("056007387");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4906_bad() {
        // Validate
        try {
            aObj.validate("0560073q7");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4907_good() {
        // Validate
        try {
            aObj.validate("056007604");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4908_bad() {
        // Validate
        try {
            aObj.validate("05Î007604");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4909_good() {
        // Validate
        try {
            aObj.validate("056008849");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4910_bad() {
        // Validate
        try {
            aObj.validate("05600884a");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4911_good() {
        // Validate
        try {
            aObj.validate("056008852");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4912_bad() {
        // Validate
        try {
            aObj.validate("0560088-2");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4913_good() {
        // Validate
        try {
            aObj.validate("056008878");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4914_bad() {
        // Validate
        try {
            aObj.validate("0Å6008878");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4915_good() {
        // Validate
        try {
            aObj.validate("056008881");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4916_bad() {
        // Validate
        try {
            aObj.validate("05600881");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4917_good() {
        // Validate
        try {
            aObj.validate("056008962");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4918_bad() {
        // Validate
        try {
            aObj.validate("05 008962");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4919_good() {
        // Validate
        try {
            aObj.validate("056009039");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4920_bad() {
        // Validate
        try {
            aObj.validate("0560090x9");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4921_good() {
        // Validate
        try {
            aObj.validate("056009110");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4922_bad() {
        // Validate
        try {
            aObj.validate("05|009110");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4923_good() {
        // Validate
        try {
            aObj.validate("056009123");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4924_bad() {
        // Validate
        try {
            aObj.validate("056009103");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4925_good() {
        // Validate
        try {
            aObj.validate("056009233");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4926_bad() {
        // Validate
        try {
            aObj.validate("05T009233");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4927_good() {
        // Validate
        try {
            aObj.validate("056009246");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4928_bad() {
        // Validate
        try {
            aObj.validate("0560A9246");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4929_good() {
        // Validate
        try {
            aObj.validate("056009262");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4930_bad() {
        // Validate
        try {
            aObj.validate("0560092<2");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4931_good() {
        // Validate
        try {
            aObj.validate("056009288");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4932_bad() {
        // Validate
        try {
            aObj.validate("05600288");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4933_good() {
        // Validate
        try {
            aObj.validate("056009314");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4934_bad() {
        // Validate
        try {
            aObj.validate("0560×9314");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4935_good() {
        // Validate
        try {
            aObj.validate("056009356");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4936_bad() {
        // Validate
        try {
            aObj.validate("06009356");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4937_good() {
        // Validate
        try {
            aObj.validate("056009479");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4938_bad() {
        // Validate
        try {
            aObj.validate("056009979");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4939_good() {
        // Validate
        try {
            aObj.validate("056009482");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4940_bad() {
        // Validate
        try {
            aObj.validate("06009482");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4941_good() {
        // Validate
        try {
            aObj.validate("056009505");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4942_bad() {
        // Validate
        try {
            aObj.validate("0^6009505");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4943_good() {
        // Validate
        try {
            aObj.validate("056073502");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4944_bad() {
        // Validate
        try {
            aObj.validate("05673502");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4945_good() {
        // Validate
        try {
            aObj.validate("056073573");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4946_bad() {
        // Validate
        try {
            aObj.validate("056073.73");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4947_good() {
        // Validate
        try {
            aObj.validate("056073599");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4948_bad() {
        // Validate
        try {
            aObj.validate("0560 3599");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4949_good() {
        // Validate
        try {
            aObj.validate("056073612");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4950_bad() {
        // Validate
        try {
            aObj.validate("05607612");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4951_good() {
        // Validate
        try {
            aObj.validate("056073654");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4952_bad() {
        // Validate
        try {
            aObj.validate("05607354");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4953_good() {
        // Validate
        try {
            aObj.validate("056080126");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4954_bad() {
        // Validate
        try {
            aObj.validate("05608012§");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4955_good() {
        // Validate
        try {
            aObj.validate("056080249");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4956_bad() {
        // Validate
        try {
            aObj.validate("05)080249");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4957_good() {
        // Validate
        try {
            aObj.validate("056080346");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4958_bad() {
        // Validate
        try {
            aObj.validate("05608s346");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4959_good() {
        // Validate
        try {
            aObj.validate("057000668");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4960_bad() {
        // Validate
        try {
            aObj.validate("05700066¬");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4961_good() {
        // Validate
        try {
            aObj.validate("057000697");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4962_bad() {
        // Validate
        try {
            aObj.validate("05700697");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4963_good() {
        // Validate
        try {
            aObj.validate("057001418");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4964_bad() {
        // Validate
        try {
            aObj.validate("0570H1418");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4965_good() {
        // Validate
        try {
            aObj.validate("057001971");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4966_bad() {
        // Validate
        try {
            aObj.validate("05700171");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4967_good() {
        // Validate
        try {
            aObj.validate("057004680");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4968_bad() {
        // Validate
        try {
            aObj.validate("0V7004680");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4969_good() {
        // Validate
        try {
            aObj.validate("057004693");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4970_bad() {
        // Validate
        try {
            aObj.validate("0¯7004693");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4971_good() {
        // Validate
        try {
            aObj.validate("061000010");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4972_bad() {
        // Validate
        try {
            aObj.validate("06100001Ã");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4973_good() {
        // Validate
        try {
            aObj.validate("061000052");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4974_bad() {
        // Validate
        try {
            aObj.validate("0610:0052");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4975_good() {
        // Validate
        try {
            aObj.validate("061000078");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4976_bad() {
        // Validate
        try {
            aObj.validate("06100078");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4977_good() {
        // Validate
        try {
            aObj.validate("061000104");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4978_bad() {
        // Validate
        try {
            aObj.validate("069000104");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4979_good() {
        // Validate
        try {
            aObj.validate("061000146");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4980_bad() {
        // Validate
        try {
            aObj.validate("06100146");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4981_good() {
        // Validate
        try {
            aObj.validate("061000227");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4982_bad() {
        // Validate
        try {
            aObj.validate("0610Ø0227");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4983_good() {
        // Validate
        try {
            aObj.validate("061000256");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4984_bad() {
        // Validate
        try {
            aObj.validate("01000256");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4985_good() {
        // Validate
        try {
            aObj.validate("061001323");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4986_bad() {
        // Validate
        try {
            aObj.validate("01001323");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4987_good() {
        // Validate
        try {
            aObj.validate("061003664");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4988_bad() {
        // Validate
        try {
            aObj.validate("06100P664");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4989_good() {
        // Validate
        try {
            aObj.validate("061003787");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4990_bad() {
        // Validate
        try {
            aObj.validate("062003787");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4991_good() {
        // Validate
        try {
            aObj.validate("061004812");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4992_bad() {
        // Validate
        try {
            aObj.validate("061004;12");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4993_good() {
        // Validate
        try {
            aObj.validate("061008766");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4994_bad() {
        // Validate
        try {
            aObj.validate("061008776");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
        // If it gets here its bad
        fail("Should not have got here");
    }

    public void testAbaNumberCheck_4995_good() {
        // Validate
        try {
            aObj.validate("061010220");
        } catch (AbaRouteValidationException e) {
            // This should not have happened
            fail(e.getClass().getSimpleName() + "\n" + e.getMessage());
        }

        // This is a good thing!
        assertTrue(true);
    }

    public void testAbaNumberCheck_4996_bad() {
        // Validate
        try {
            aObj.validate("06101220");
        } catch (AbaRouteValidationException e) {
            // This is good.  We were expecting an exception.
            assertTrue(true);

            // We're done, just return.
            return;
        }
    }


}


//~ Formatted by Jindent --- http://www.jindent.com