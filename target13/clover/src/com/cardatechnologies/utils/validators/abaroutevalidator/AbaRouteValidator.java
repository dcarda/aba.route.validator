/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//* ---------------------------------------------------------------------------------------
 * Class:  com.cardatechnologies.utils.validators.abaroutevalidator.AbaRouteValidator.java
 * Date:   2015/02/11
 * ---------------------------------------------------------------------------------------
 *
 *  License: Apache 2.0
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 *  this file except in compliance with the License.
 *
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under
 *  the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS
 *  OF ANY KIND, either express or implied including the implied warranties of
 *  merchantability and fitness for a particular purpose.
 *
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.cardatechnologies.utils.validators.abaroutevalidator;

//~--- non-JDK imports --------------------------------------------------------

import com.cardatechnologies.utils.validators.abaroutevalidator.exceptions.AbaRouteValidationException;

/**
 * <b>Description:</b><br>
 *     This class is used to validate a ABA Routing Transit Number.
 *
 * @author     Daniel Carda
 * <br>
 * <br><b>Maintenance History:</b>
 * <br>
<pre>
    yyyy mm dd  Who                       Description
    ----------  ------------------------  ----------------------------------------------------
    2015/02/11  Daniel Carda              Initial Module Creation...
    2020/12/23  Daniel Carda              Started using and ENum for error content.
    2020/12/24  Daniel Carda              Optimized algorithms.
    2021/08/01  Daniel Carda              Improved Class Javadocs
</pre>
 * <hr>
 */
public class AbaRouteValidator {public static class __CLR4_4_100ks242w5i{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1628360972726L,8589935092L,68,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Method description
     *
     * @param  paramAbaRouteNumber
     *         The incoming ABA Number.
     *
     * @return boolean
     *         True if all the characters were digits.
     *         False if there was a problem.
     *
     * @throws AbaRouteValidationException
     *         There was a problem somewhere not related to checking the ABA number.
     */
    private static boolean breakdownAbaNumber( final String paramAbaRouteNumber )
            throws AbaRouteValidationException {try{__CLR4_4_100ks242w5i.R.inc(0);

        // Check first two digits.
        __CLR4_4_100ks242w5i.R.inc(1);validateFedNumber( paramAbaRouteNumber );

        // Alright, now see if the number holds up to scrutiny!
        __CLR4_4_100ks242w5i.R.inc(2);boolean returnBool;

        __CLR4_4_100ks242w5i.R.inc(3);returnBool = validateAbaNumberChecksum( paramAbaRouteNumber );

        // Return the result
        __CLR4_4_100ks242w5i.R.inc(4);return( returnBool );
    }finally{__CLR4_4_100ks242w5i.R.flushNeeded();}}

    /**
     * This method is the starting point to validate whether a incoming string is
     * a valid ABA Routing Transit Number.
     *
     * @param   paramAbaRouteNumber The ABA number to be tested.
     *
     * @return boolean
     *         True if all the characters were digits.
     *         False if there was a problem.
     *
     * @throws AbaRouteValidationException
     *         A error occurred when parsing the suspect
     *         ABA Routing Transit Number.
     */
    static public boolean validate( final String paramAbaRouteNumber )
            throws AbaRouteValidationException {try{__CLR4_4_100ks242w5i.R.inc(5);

        // http://en.wikipedia.org/wiki/Routing_transit_number
        //
        // See FRB Regulation CC, Appendix A, which available online here:
        // <http://www.bankersonline.com/regs/229/a229a.html>
        // Quick Check
        // Is the parameter null
        __CLR4_4_100ks242w5i.R.inc(6);if( (((paramAbaRouteNumber == null )&&(__CLR4_4_100ks242w5i.R.iget(7)!=0|true))||(__CLR4_4_100ks242w5i.R.iget(8)==0&false))) {{
            __CLR4_4_100ks242w5i.R.inc(9);throw new AbaRouteValidationException( ErrorCodes.ABA_1000.getErrorCode(),
                                                   ErrorCodes.ABA_1000.getErrorMnemonic() );
        }

        // Quick Check
        // Is the parameter empty/blank
        }__CLR4_4_100ks242w5i.R.inc(10);if( (((paramAbaRouteNumber.trim().equals( "" ) )&&(__CLR4_4_100ks242w5i.R.iget(11)!=0|true))||(__CLR4_4_100ks242w5i.R.iget(12)==0&false))) {{
            __CLR4_4_100ks242w5i.R.inc(13);throw new AbaRouteValidationException( ErrorCodes.ABA_1001.getErrorCode(),
                                                   ErrorCodes.ABA_1001.getErrorMnemonic() );
        }

        // Quick Check
        // Make sure the string length is right
        }__CLR4_4_100ks242w5i.R.inc(14);int _strLen;

        __CLR4_4_100ks242w5i.R.inc(15);_strLen = paramAbaRouteNumber.length();

        // See if it's the right length
        __CLR4_4_100ks242w5i.R.inc(16);if( (((_strLen != 9 )&&(__CLR4_4_100ks242w5i.R.iget(17)!=0|true))||(__CLR4_4_100ks242w5i.R.iget(18)==0&false))) {{

            // Is it to short?
            __CLR4_4_100ks242w5i.R.inc(19);if( (((_strLen < 9 )&&(__CLR4_4_100ks242w5i.R.iget(20)!=0|true))||(__CLR4_4_100ks242w5i.R.iget(21)==0&false))) {{
                __CLR4_4_100ks242w5i.R.inc(22);throw new AbaRouteValidationException( ErrorCodes.ABA_1002.getErrorCode(),
                                                       ErrorCodes.ABA_1002.getErrorMnemonic() );
            }
            }else {{

                // Must be to long.
                __CLR4_4_100ks242w5i.R.inc(23);throw new AbaRouteValidationException( ErrorCodes.ABA_1003.getErrorCode(),
                                                       ErrorCodes.ABA_1003.getErrorMnemonic() );
            }
        }}

        // Quick Check
        // Finally, let's just do a scan and make sure it's a number
        }__CLR4_4_100ks242w5i.R.inc(24);if( (((!isNumeric( paramAbaRouteNumber ) )&&(__CLR4_4_100ks242w5i.R.iget(25)!=0|true))||(__CLR4_4_100ks242w5i.R.iget(26)==0&false))) {{
            __CLR4_4_100ks242w5i.R.inc(27);throw new AbaRouteValidationException( ErrorCodes.ABA_1004.getErrorCode(),
                                                   ErrorCodes.ABA_1004.getErrorMnemonic() );
        }

        // -----------------------------------------------------------------------------
        // -----------------------------------------------------------------------------
        // So we got this far, lets start breaking it down.
        }__CLR4_4_100ks242w5i.R.inc(28);boolean returnBool;

        __CLR4_4_100ks242w5i.R.inc(29);returnBool = breakdownAbaNumber( paramAbaRouteNumber );

        // Must be good!
        __CLR4_4_100ks242w5i.R.inc(30);return( returnBool );
    }finally{__CLR4_4_100ks242w5i.R.flushNeeded();}}

    /**
     * Method: validateAbaNumberChecksum
     *
     * @param  paramAbaRouteNumber
     *         The target ABA number to test.
     *
     * @return boolean
     *         True if all the characters were digits.
     *         False if there was a problem.
     */
    static private boolean validateAbaNumberChecksum( final String paramAbaRouteNumber ) {try{__CLR4_4_100ks242w5i.R.inc(31);

        // Even thought initializing this to zero is redundant, performance tests
        // were slightly improved.
        __CLR4_4_100ks242w5i.R.inc(32);int checksumTotal = 0;

        // Set up all the ints
        __CLR4_4_100ks242w5i.R.inc(33);int i1, i2, i3, i4, i5, i6, i7, i8, i9;

        // Break up the string so we can look at the numbers.
        // Although this is a bit simplistic, doing it this way (as opposed to
        // to a loop) produced much faster results.
        __CLR4_4_100ks242w5i.R.inc(34);i1 = Character.getNumericValue( paramAbaRouteNumber.charAt( 0 ) );
        __CLR4_4_100ks242w5i.R.inc(35);i2 = Character.getNumericValue( paramAbaRouteNumber.charAt( 1 ) );
        __CLR4_4_100ks242w5i.R.inc(36);i3 = Character.getNumericValue( paramAbaRouteNumber.charAt( 2 ) );
        __CLR4_4_100ks242w5i.R.inc(37);i4 = Character.getNumericValue( paramAbaRouteNumber.charAt( 3 ) );
        __CLR4_4_100ks242w5i.R.inc(38);i5 = Character.getNumericValue( paramAbaRouteNumber.charAt( 4 ) );
        __CLR4_4_100ks242w5i.R.inc(39);i6 = Character.getNumericValue( paramAbaRouteNumber.charAt( 5 ) );
        __CLR4_4_100ks242w5i.R.inc(40);i7 = Character.getNumericValue( paramAbaRouteNumber.charAt( 6 ) );
        __CLR4_4_100ks242w5i.R.inc(41);i8 = Character.getNumericValue( paramAbaRouteNumber.charAt( 7 ) );
        __CLR4_4_100ks242w5i.R.inc(42);i9 = Character.getNumericValue( paramAbaRouteNumber.charAt( 8 ) );

        // Okay, lets crank it through the formula
        __CLR4_4_100ks242w5i.R.inc(43);checksumTotal = ( ( i3 + i6 + i9 ) + ( 3 * ( i1 + i4 + i7 ) ) + ( 7 * ( i2 + i5 + i8 ) ) );

        // Check the modulus and we're done!
        __CLR4_4_100ks242w5i.R.inc(44);if( (((( checksumTotal % 10 ) != 0 )&&(__CLR4_4_100ks242w5i.R.iget(45)!=0|true))||(__CLR4_4_100ks242w5i.R.iget(46)==0&false))) {{

            // Checksum has failed
            __CLR4_4_100ks242w5i.R.inc(47);return( false );
        }
        }else {{

            // Checksum is good!
            __CLR4_4_100ks242w5i.R.inc(48);return( true );
        }
    }}finally{__CLR4_4_100ks242w5i.R.flushNeeded();}}

    /**
     * This method will test to see if the first two characters, when combined to create a
     * number, are within an acceptable range.
     *
     * @param  paramAbaRouteNumber The target string to test.
     *
     * @throws AbaRouteValidationException
     *         There was a problem in converting the ABA number.
     */
    static private void validateFedNumber( final String paramAbaRouteNumber )
            throws AbaRouteValidationException {try{__CLR4_4_100ks242w5i.R.inc(49);

        // String off the first 2 numbers and see if they validate.
        __CLR4_4_100ks242w5i.R.inc(50);String _tempStr;

        __CLR4_4_100ks242w5i.R.inc(51);_tempStr = paramAbaRouteNumber.substring( 0, 2 );

        // Now, convert the substring to an int
        __CLR4_4_100ks242w5i.R.inc(52);int _fedNumb;

        __CLR4_4_100ks242w5i.R.inc(53);_fedNumb = Integer.parseInt( _tempStr );

        // Okay, let's see if it works!
        __CLR4_4_100ks242w5i.R.inc(54);if( (((!( ( ( _fedNumb >= 0 ) && ( _fedNumb <= 12 ) )
                || ( ( _fedNumb >= 21 ) && ( _fedNumb <= 32 ) )
                || ( ( _fedNumb >= 61 ) && ( _fedNumb <= 72 ) )
                || ( ( _fedNumb == 80 ) ) ) )&&(__CLR4_4_100ks242w5i.R.iget(55)!=0|true))||(__CLR4_4_100ks242w5i.R.iget(56)==0&false))) {{
            __CLR4_4_100ks242w5i.R.inc(57);throw new AbaRouteValidationException( ErrorCodes.ABA_1005.getErrorCode(),
                                                   ErrorCodes.ABA_1005.getErrorMnemonic() );
        }
    }}finally{__CLR4_4_100ks242w5i.R.flushNeeded();}}

    /**
     * Method: isNumeric
     *
     * Description:
     *         This method will scan the individual numbers in the ABA number
     *         and makre sure they are numeric digits.
     *
     * @param  paramStr
     *         The string which needs to be made up of all numbers.
     *
     * @return boolean
     *         True if all the characters were digits.
     *         False if there was a problem.
     */
    static private boolean isNumeric( final String paramStr ) {try{__CLR4_4_100ks242w5i.R.inc(58);

          // Cycle through the character array
          __CLR4_4_100ks242w5i.R.inc(59);int size = paramStr.length();
          __CLR4_4_100ks242w5i.R.inc(60);for( int i = 0; (((i < size)&&(__CLR4_4_100ks242w5i.R.iget(61)!=0|true))||(__CLR4_4_100ks242w5i.R.iget(62)==0&false)); i++ ) {{
              __CLR4_4_100ks242w5i.R.inc(63);if( (((!Character.isDigit( paramStr.charAt(i) ) )&&(__CLR4_4_100ks242w5i.R.iget(64)!=0|true))||(__CLR4_4_100ks242w5i.R.iget(65)==0&false))) {{

                  // This is bad!
                  __CLR4_4_100ks242w5i.R.inc(66);return( false );
              }
          }}

          // All is well!
        }__CLR4_4_100ks242w5i.R.inc(67);return( true );
    }finally{__CLR4_4_100ks242w5i.R.flushNeeded();}}
}

/* ---------------------------------------------------------------------------------------
 *
 *  License: Apache 2.0
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 *  this file except in compliance with the License.
 *
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under
 *  the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS
 *  OF ANY KIND, either express or implied including the implied warranties of
 *  merchantability and fitness for a particular purpose.
 *
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 * ---------------------------------------------------------------------------------------
 * Class:  com.cardatechnologies.utils.validators.abaroutevalidator.AbaRouteValidator.java
 * Date:   2015/02/11
 * --------------------------------------------------------------------------------------- */
