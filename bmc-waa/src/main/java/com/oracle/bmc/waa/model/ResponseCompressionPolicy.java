/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waa.model;

/**
 * An object that specifies a compression policy for HTTP response from ENABLEMENT POINT to the client.
 * <p>
 * This compression policy can be used to enable support for HTTP response compression algorithms like gzip and
 * configure the conditions of when a compression algorithm will be used.
 * <p>
 * HTTP responses will only be compressed if the client indicates support for one of the enabled compression
 * algorithms via the "Accept-Encoding" request header.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211230")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ResponseCompressionPolicy.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ResponseCompressionPolicy {
    @Deprecated
    @java.beans.ConstructorProperties({"gzipCompression"})
    public ResponseCompressionPolicy(GzipCompressionPolicy gzipCompression) {
        super();
        this.gzipCompression = gzipCompression;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("gzipCompression")
        private GzipCompressionPolicy gzipCompression;

        public Builder gzipCompression(GzipCompressionPolicy gzipCompression) {
            this.gzipCompression = gzipCompression;
            this.__explicitlySet__.add("gzipCompression");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResponseCompressionPolicy build() {
            ResponseCompressionPolicy __instance__ = new ResponseCompressionPolicy(gzipCompression);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResponseCompressionPolicy o) {
            Builder copiedBuilder = gzipCompression(o.getGzipCompression());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @com.fasterxml.jackson.annotation.JsonProperty("gzipCompression")
    private final GzipCompressionPolicy gzipCompression;

    public GzipCompressionPolicy getGzipCompression() {
        return gzipCompression;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ResponseCompressionPolicy(");
        sb.append("gzipCompression=").append(String.valueOf(this.gzipCompression));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResponseCompressionPolicy)) {
            return false;
        }

        ResponseCompressionPolicy other = (ResponseCompressionPolicy) o;
        return java.util.Objects.equals(this.gzipCompression, other.gzipCompression)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.gzipCompression == null ? 43 : this.gzipCompression.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
