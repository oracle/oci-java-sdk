/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.responses;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class BmcResponse {
    /** HTTP status code returned by the operation. */
    private final int __httpStatusCode__;

    /** HTTP response headers returned by the operation. */
    private final Map<String, List<String>> headers;

    @java.beans.ConstructorProperties({"__httpStatusCode__"})
    public BmcResponse(final int __httpStatusCode__) {
        this.__httpStatusCode__ = __httpStatusCode__;
        this.headers = null;
    }

    @java.beans.ConstructorProperties({"__httpStatusCode__", "headers"})
    public BmcResponse(final int __httpStatusCode__, final Map<String, List<String>> headers) {
        this.__httpStatusCode__ = __httpStatusCode__;
        this.headers = headers;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object o) {

        if (o == this) return true;
        if (!(o instanceof BmcResponse)) return false;
        final BmcResponse other = (BmcResponse) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        if (this.get__httpStatusCode__() != other.get__httpStatusCode__()) return false;
        return Objects.equals(this.getHeaders(), other.getHeaders());
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof BmcResponse;
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.get__httpStatusCode__(), this.getHeaders());
    }
    /**
     * HTTP status code returned by the operation.
     *
     * @return HTTP status code
     */
    public int get__httpStatusCode__() {
        return this.__httpStatusCode__;
    }

    /**
     * HTTP response headers returned by the operation.
     *
     * @return all HTTP response headers
     */
    public Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    public interface Builder<T extends BmcResponse> {
        Builder<T> __httpStatusCode__(int __httpStatusCode__);

        Builder<T> headers(Map<String, List<String>> headers);

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @param o other request from which to copy values
         * @return this builder instance
         */
        Builder<T> copy(T o);

        default Builder<T> isNotModified(boolean notModified) {
            return this;
        }

        /**
         * Build the response.
         *
         * @return response
         */
        T build();
    }
}
