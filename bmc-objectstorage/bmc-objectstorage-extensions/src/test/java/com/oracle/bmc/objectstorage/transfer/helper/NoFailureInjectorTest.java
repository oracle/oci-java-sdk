/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.transfer.helper;

import org.junit.Test;

public class NoFailureInjectorTest {

    @Test
    public void neverFails() throws Exception {
        final FailureInjector failureInjector = NoFailureInjector.INSTANCE;
        for (int i = 0; i < 10; ++i) {
            failureInjector.onDataRead();
            failureInjector.onGetObjectRequest();
        }
    }
}
