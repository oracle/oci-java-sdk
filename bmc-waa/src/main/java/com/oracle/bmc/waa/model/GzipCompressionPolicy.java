/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waa.model;

/**
 * An object that specifies the gzip compression policy.
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
    builder = GzipCompressionPolicy.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class GzipCompressionPolicy
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"isEnabled"})
    public GzipCompressionPolicy(Boolean isEnabled) {
        super();
        this.isEnabled = isEnabled;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * When true, support for gzip compression is enabled. HTTP responses will be compressed with gzip only if the
         * client indicates support for gzip via the "Accept-Encoding: gzip" request header.
         * <p>
         * When false, support for gzip compression is disabled and HTTP responses will not be compressed with gzip
         * even if the client indicates support for gzip.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * When true, support for gzip compression is enabled. HTTP responses will be compressed with gzip only if the
         * client indicates support for gzip via the "Accept-Encoding: gzip" request header.
         * <p>
         * When false, support for gzip compression is disabled and HTTP responses will not be compressed with gzip
         * even if the client indicates support for gzip.
         *
         * @param isEnabled the value to set
         * @return this builder
         **/
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GzipCompressionPolicy build() {
            GzipCompressionPolicy model = new GzipCompressionPolicy(this.isEnabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GzipCompressionPolicy model) {
            if (model.wasPropertyExplicitlySet("isEnabled")) {
                this.isEnabled(model.getIsEnabled());
            }
            return this;
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

    /**
     * When true, support for gzip compression is enabled. HTTP responses will be compressed with gzip only if the
     * client indicates support for gzip via the "Accept-Encoding: gzip" request header.
     * <p>
     * When false, support for gzip compression is disabled and HTTP responses will not be compressed with gzip
     * even if the client indicates support for gzip.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * When true, support for gzip compression is enabled. HTTP responses will be compressed with gzip only if the
     * client indicates support for gzip via the "Accept-Encoding: gzip" request header.
     * <p>
     * When false, support for gzip compression is disabled and HTTP responses will not be compressed with gzip
     * even if the client indicates support for gzip.
     *
     * @return the value
     **/
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("GzipCompressionPolicy(");
        sb.append("super=").append(super.toString());
        sb.append("isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GzipCompressionPolicy)) {
            return false;
        }

        GzipCompressionPolicy other = (GzipCompressionPolicy) o;
        return java.util.Objects.equals(this.isEnabled, other.isEnabled) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
