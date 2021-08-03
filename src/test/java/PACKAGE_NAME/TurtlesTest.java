package PACKAGE_NAME;

import PACKAGE_NAME.Factorials;
import org.junit.Assert;
import org.junit.Test;

import java.time.Duration;
import java.time.Instant;

import static PACKAGE_NAME.GCDD.gcd;

/**
 * Created by kristofer on 7/14/20.
 */
public class TurtlesTest {

    @Test
    public void testFactorials(){
        //given
        int g=1;
        long expected1=1;
        Factorials fact = new Factorials();
        //when
        long actual= fact.factorial(g);
        //then
        Assert.assertEquals(expected1, actual);
    }
    @Test
    public void testGCDD(){
        //given
        int p=10;
        int q=15;
        GCDD good = new GCDD();
        int expected= 5;
        //then
        int actual= gcd(p, q);
        //when
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void testGCDD1(){
        //given
        int p=6;
        int q=0;
        GCDD good = new GCDD();
        int expected= 6;
        //then
        int actual= gcd(p, q);
        //when
        Assert.assertEquals(expected, actual);

    }
//    Instant start = Instant.now();
//    // CODE to be timed goes HERE
//    Instant finish = Instant.now();
//    long timeElapsed = Duration.between(start, finish).toMillis();
    @Test
    public void testTime(){
        int p=2768;
        int q=1701;
        Instant start1= Instant.now();
        GCDD.gcd(p,q);
        Instant finish1 = Instant.now();
        long timeElapsed = Duration.between(start1, finish1).toMillis();
        Instant start2= Instant.now();
        GCDD.gcd2(p,q);
        Instant finish2 = Instant.now();
        long timeElapsed2 = Duration.between(start2, finish2).toMillis();
        System.out.println(timeElapsed);
        System.out.println(timeElapsed2);

        Assert.assertTrue(timeElapsed>timeElapsed2);
    }
}