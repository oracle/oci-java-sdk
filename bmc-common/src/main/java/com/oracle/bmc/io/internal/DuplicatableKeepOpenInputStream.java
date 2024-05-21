/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.io.internal;

import com.oracle.bmc.io.DuplicatableInputStream;

import java.io.InputStream;

/**
 * In Java we cannot specify a type parameter as requiring a type both extend an abstract class, such
 * as InputStream and implement an interface such as DuplicatableInputStream. As such we are in the unenviable position
 * of needing to accept a parameter and then check its type.
 */
public class DuplicatableKeepOpenInputStream extends KeepOpenInputStream
        implements DuplicatableInputStream {
    /**
     * Creates a KeepOpenInputStream while retaining its marking as a DuplicatableInputStream
     * @param is The DuplicatableInputStream that will be kept open. This is checked with instanceof.
     */
    public DuplicatableKeepOpenInputStream(InputStream is) {
        super(is);
        if (!(is instanceof DuplicatableInputStream)) {
            throw new IllegalArgumentException(
                    String.format(
                            "InputStream '%s' is not a DuplicatableInputStream, duplication won't work",
                            is.getClass().getName()));
        }
    }

    @Override
    public InputStream duplicate() {
        return new DuplicatableKeepOpenInputStream(
                ((DuplicatableInputStream) innerStream).duplicate());
    }
}
