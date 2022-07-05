/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.responses;

public class BmcResponse {
    /**
     * HTTP status code returned by the operation.
     */
    private final int __httpStatusCode__;

    @java.lang.Override
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof BmcResponse)) return false;
        final BmcResponse other = (BmcResponse) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        if (this.get__httpStatusCode__() != other.get__httpStatusCode__()) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof BmcResponse;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.get__httpStatusCode__();
        return result;
    }

    @java.beans.ConstructorProperties({"__httpStatusCode__"})
    public BmcResponse(final int __httpStatusCode__) {
        this.__httpStatusCode__ = __httpStatusCode__;
    }

    /**
     * HTTP status code returned by the operation.
     */
    public int get__httpStatusCode__() {
        return this.__httpStatusCode__;
    }
}
