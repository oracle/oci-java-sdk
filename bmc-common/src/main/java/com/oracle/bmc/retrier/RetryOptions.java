/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.retrier;

/**
 * Defines the options when retrying
 */
public final class RetryOptions {

    private int markReadLimit;

    public RetryOptions(int markReadLimit) {
        this.markReadLimit =
                markReadLimit > 0 && markReadLimit <= Integer.MAX_VALUE
                        ? markReadLimit
                        : Integer.MAX_VALUE;
    }

    /**
     * Getter for mark read limit when marking the stream for retry.
     * The mark read limit guarantees to read at least that many bytes
     * before invalidating mark
     */
    public int getMarkReadLimit() {
        return this.markReadLimit;
    }

    /**
     * Setter for mark read limit that guarantees at least {@param value} bytes are
     * read before invalidating mark. Ensure the mark read limit is at least the size of
     * the stream to successfully reset the stream
     */
    public synchronized void setMarkReadLimit(int value) {
        if (value > 0 && value <= Integer.MAX_VALUE) {
            this.markReadLimit = value;
        }
    }
}
