/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client.jersey.internal;

import com.oracle.bmc.http.client.io.DuplicatableInputStream;
import com.oracle.bmc.http.client.jersey.io.internal.LengthLimitedInputStream;

import java.io.InputStream;

/**
 * Class for ApacheInputStream that implements a DuplicatableInputStream. Apache connector in Jersey
 * v2.32 supports passing an HttpEntity as the body. In this case Apache connector will not read
 * entire data into memory. Content length is a must to use this conversion.
 */
public class ApacheDuplicatableInputStreamEntity extends ApacheInputStreamEntity
        implements DuplicatableInputStream {

    public ApacheDuplicatableInputStreamEntity(DuplicatableInputStream in, Long contentLength) {
        super(new LengthLimitedInputStream((InputStream) in, contentLength), contentLength);
    }

    @Override
    public InputStream duplicate() {
        return ((DuplicatableInputStream) in).duplicate();
    }
}
