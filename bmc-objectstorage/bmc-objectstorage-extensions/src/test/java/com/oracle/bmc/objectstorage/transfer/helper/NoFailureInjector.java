/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.transfer.helper;

import java.io.IOException;

public class NoFailureInjector implements FailureInjector {

    public static final NoFailureInjector INSTANCE = new NoFailureInjector();

    private NoFailureInjector() {}

    @Override
    public void onGetObjectRequest() {}

    @Override
    public void onDataRead() throws IOException {}
}
