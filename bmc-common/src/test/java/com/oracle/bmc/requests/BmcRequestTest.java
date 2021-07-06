/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.requests;

import com.oracle.bmc.retrier.RetryConfiguration;
import com.oracle.bmc.util.internal.Consumer;
import com.oracle.bmc.waiter.FixedTimeDelayStrategy;
import javax.ws.rs.client.Invocation;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class BmcRequestTest {
    BmcRequest<?> obj1 = new BmcRequest();
    BmcRequest<?> obj2 = new BmcRequest();
    BmcRequest<?> obj3 = new BmcRequest();
    BmcRequest<?> obj4 = new BmcRequest();

    Consumer<Invocation.Builder> invocationCallback1 =
            builder -> builder.cookie("Cookie1", "Value1");
    Consumer<Invocation.Builder> invocationCallback2 =
            builder -> builder.cookie("Cookie2", "Value2");

    RetryConfiguration retryConfiguration1 =
            RetryConfiguration.builder().delayStrategy(new FixedTimeDelayStrategy(5L)).build();
    RetryConfiguration retryConfiguration2 =
            RetryConfiguration.builder().delayStrategy(new FixedTimeDelayStrategy(10L)).build();

    @Before
    public void setup() {
        // obj1 and obj2 have the same configurations.
        obj1.setInvocationCallback(invocationCallback1);
        obj1.setRetryConfiguration(retryConfiguration1);

        obj2.setInvocationCallback(invocationCallback1);
        obj2.setRetryConfiguration(retryConfiguration1);

        obj3.setInvocationCallback(invocationCallback2);
        obj3.setRetryConfiguration(retryConfiguration1);

        obj4.setInvocationCallback(invocationCallback1);
        obj4.setRetryConfiguration(retryConfiguration2);
    }

    @Test
    public void testEquals() {
        // same objects
        assertEquals(obj1, obj2);
        assertEquals(obj2, obj1);

        // different invocation callback
        assertFalse(obj1.equals(obj3));
        assertFalse(obj3.equals(obj1));

        // different retry configuration
        assertFalse(obj1.equals(obj4));
        assertFalse(obj4.equals(obj1));

        // neither invocation callback or retry are the same
        assertFalse(obj3.equals(obj4));
        assertFalse(obj4.equals(obj3));
    }

    @Test
    public void testHashCode() {
        // only obj1 and obj2 are the same.
        assertEquals(obj1.hashCode(), obj2.hashCode());
        assertNotEquals(obj1.hashCode(), obj3.hashCode());
        assertNotEquals(obj2.hashCode(), obj3.hashCode());
        assertNotEquals(obj3.hashCode(), obj4.hashCode());
    }
}
