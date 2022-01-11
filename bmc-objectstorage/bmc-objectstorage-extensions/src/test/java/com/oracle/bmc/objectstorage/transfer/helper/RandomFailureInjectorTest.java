/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.transfer.helper;

import org.junit.Assert;
import org.junit.Test;

public class RandomFailureInjectorTest {

    @Test
    public void alwaysFails() {
        final FailureInjector failureInjector = new RandomFailureInjector(1.0, Integer.MAX_VALUE);
        for (int i = 0; i < 10; ++i) {
            try {
                failureInjector.onGetObjectRequest();
                Assert.fail("Expected an exception");
            } catch (Exception e) {
                // expected
            }
            try {
                failureInjector.onDataRead();
                Assert.fail("Expected an exception");
            } catch (Exception e) {
                // expected
            }
        }
    }

    @Test
    public void limitedFailures() throws Exception {
        final FailureInjector failureInjector = new RandomFailureInjector(1.0, 2);
        try {
            failureInjector.onGetObjectRequest();
            Assert.fail("Expected an exception");
        } catch (Exception e) {
            // expected
        }
        try {
            failureInjector.onDataRead();
            Assert.fail("Expected an exception");
        } catch (Exception e) {
            // expected
        }
        failureInjector.onGetObjectRequest();
        failureInjector.onDataRead();
    }

    @Test
    public void onGetObjectSometimesFails() throws Exception {
        final FailureInjector failureInjector = new RandomFailureInjector(0.5, Integer.MAX_VALUE);

        // With a 50% chance of failure we should see at least one failure here
        for (int i = 0; i < 100; ++i) {
            try {
                failureInjector.onGetObjectRequest();
                return;
            } catch (Exception e) {
                // Ignore
            }
        }
        Assert.fail("Expected at least one call to succeed");
    }

    @Test
    public void onDataReadSometimesFails() throws Exception {
        final FailureInjector failureInjector = new RandomFailureInjector(0.5, Integer.MAX_VALUE);

        // With a 50% chance of failure we should see at least one success
        for (int i = 0; i < 100; ++i) {
            try {
                failureInjector.onDataRead();
                return;
            } catch (Exception e) {
                // Ignore
            }
        }
        Assert.fail("Expected at least one call to succeed");
    }

    @Test
    public void onGetObjectRequestSometimesSucceeds() throws Exception {
        final FailureInjector failureInjector = new RandomFailureInjector(0.5, Integer.MAX_VALUE);

        // With a 50% chance of failure we should see at least one failure here
        for (int i = 0; i < 100; ++i) {
            try {
                failureInjector.onGetObjectRequest();
            } catch (Exception e) {
                return;
            }
        }
        Assert.fail("Expected at least one call to fail");
    }

    @Test
    public void onDataReadRequestSometimesSucceeds() throws Exception {
        final FailureInjector failureInjector = new RandomFailureInjector(0.5, Integer.MAX_VALUE);

        // With a 50% chance of failure we should see at least one failure here
        for (int i = 0; i < 100; ++i) {
            try {
                failureInjector.onDataRead();
            } catch (Exception e) {
                return;
            }
        }
        Assert.fail("Expected at least one call to fail");
    }
}
