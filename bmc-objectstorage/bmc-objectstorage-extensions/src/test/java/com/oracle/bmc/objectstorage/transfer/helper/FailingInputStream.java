/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.transfer.helper;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class FailingInputStream extends FilterInputStream {

    private final FailureInjector failureInjector;

    public FailingInputStream(FailureInjector failureInjector, InputStream in) {
        super(in);
        this.failureInjector = failureInjector;
    }

    @Override
    public int read() throws IOException {
        this.failureInjector.onDataRead();
        return super.read();
    }

    @Override
    public int read(byte[] b) throws IOException {
        this.failureInjector.onDataRead();
        return super.read(b);
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        this.failureInjector.onDataRead();
        return super.read(b, off, len);
    }
}
