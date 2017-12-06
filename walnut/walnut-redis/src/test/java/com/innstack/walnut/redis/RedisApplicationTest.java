package com.innstack.walnut.redis;

import org.junit.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 * <p>
 * Created by ${USER} on ${DATE}.
 */
public class RedisApplicationTest {

    protected static final Logger logger = LoggerFactory.getLogger(RedisApplicationTest.class);

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        logger.info("===setUpBeforeClass=====");
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        logger.info("===tearDownAfterClass===");
    }

    @Before
    public void setUp() throws Exception {
        logger.info("=========setUp==========");
    }

    @After
    public void tearDown() throws Exception {
        logger.info("=========tearDown=======");
    }

    @Test
    public void testAssertEquals() {
        logger.debug("testAssertEquals");
        assertEquals("a", "a");
    }

    @Test
    public void testAssertTrue() {
        logger.debug("testAssertTrue");
        assertTrue(true);
    }

    @Test
    public void testAssertFalse() {
        logger.debug("testAssertFalse");
        assertFalse(false);
    }

    @Test(expected = RuntimeException.class)
    public void testException() {
        logger.debug("testException");
        throw new RuntimeException();
    }
}