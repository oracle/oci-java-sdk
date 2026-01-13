/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.model;

/**
 * The IP rate limiting configuration. Defines the amount of allowed requests from a unique IP
 * address and the resulting block response code when that threshold is exceeded. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AddressRateLimiting.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AddressRateLimiting
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "isEnabled",
        "allowedRatePerAddress",
        "maxDelayedCountPerAddress",
        "blockResponseCode"
    })
    public AddressRateLimiting(
            Boolean isEnabled,
            Integer allowedRatePerAddress,
            Integer maxDelayedCountPerAddress,
            Integer blockResponseCode) {
        super();
        this.isEnabled = isEnabled;
        this.allowedRatePerAddress = allowedRatePerAddress;
        this.maxDelayedCountPerAddress = maxDelayedCountPerAddress;
        this.blockResponseCode = blockResponseCode;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Enables or disables the address rate limiting Web Application Firewall feature. */
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * Enables or disables the address rate limiting Web Application Firewall feature.
         *
         * @param isEnabled the value to set
         * @return this builder
         */
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }
        /**
         * The number of allowed requests per second from one IP address. If unspecified, defaults
         * to {@code 1}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("allowedRatePerAddress")
        private Integer allowedRatePerAddress;

        /**
         * The number of allowed requests per second from one IP address. If unspecified, defaults
         * to {@code 1}.
         *
         * @param allowedRatePerAddress the value to set
         * @return this builder
         */
        public Builder allowedRatePerAddress(Integer allowedRatePerAddress) {
            this.allowedRatePerAddress = allowedRatePerAddress;
            this.__explicitlySet__.add("allowedRatePerAddress");
            return this;
        }
        /**
         * The maximum number of requests allowed to be queued before subsequent requests are
         * dropped. If unspecified, defaults to {@code 10}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maxDelayedCountPerAddress")
        private Integer maxDelayedCountPerAddress;

        /**
         * The maximum number of requests allowed to be queued before subsequent requests are
         * dropped. If unspecified, defaults to {@code 10}.
         *
         * @param maxDelayedCountPerAddress the value to set
         * @return this builder
         */
        public Builder maxDelayedCountPerAddress(Integer maxDelayedCountPerAddress) {
            this.maxDelayedCountPerAddress = maxDelayedCountPerAddress;
            this.__explicitlySet__.add("maxDelayedCountPerAddress");
            return this;
        }
        /**
         * The response status code returned when a request is blocked. If unspecified, defaults to
         * {@code 503}. The list of available response codes: {@code 400}, {@code 401}, {@code 403},
         * {@code 404}, {@code 405}, {@code 408}, {@code 409}, {@code 411}, {@code 412}, {@code
         * 413}, {@code 414}, {@code 415}, {@code 416}, {@code 422}, {@code 494}, {@code 495},
         * {@code 496}, {@code 497}, {@code 499}, {@code 500}, {@code 501}, {@code 502}, {@code
         * 503}, {@code 504}, {@code 507}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("blockResponseCode")
        private Integer blockResponseCode;

        /**
         * The response status code returned when a request is blocked. If unspecified, defaults to
         * {@code 503}. The list of available response codes: {@code 400}, {@code 401}, {@code 403},
         * {@code 404}, {@code 405}, {@code 408}, {@code 409}, {@code 411}, {@code 412}, {@code
         * 413}, {@code 414}, {@code 415}, {@code 416}, {@code 422}, {@code 494}, {@code 495},
         * {@code 496}, {@code 497}, {@code 499}, {@code 500}, {@code 501}, {@code 502}, {@code
         * 503}, {@code 504}, {@code 507}.
         *
         * @param blockResponseCode the value to set
         * @return this builder
         */
        public Builder blockResponseCode(Integer blockResponseCode) {
            this.blockResponseCode = blockResponseCode;
            this.__explicitlySet__.add("blockResponseCode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AddressRateLimiting build() {
            AddressRateLimiting model =
                    new AddressRateLimiting(
                            this.isEnabled,
                            this.allowedRatePerAddress,
                            this.maxDelayedCountPerAddress,
                            this.blockResponseCode);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AddressRateLimiting model) {
            if (model.wasPropertyExplicitlySet("isEnabled")) {
                this.isEnabled(model.getIsEnabled());
            }
            if (model.wasPropertyExplicitlySet("allowedRatePerAddress")) {
                this.allowedRatePerAddress(model.getAllowedRatePerAddress());
            }
            if (model.wasPropertyExplicitlySet("maxDelayedCountPerAddress")) {
                this.maxDelayedCountPerAddress(model.getMaxDelayedCountPerAddress());
            }
            if (model.wasPropertyExplicitlySet("blockResponseCode")) {
                this.blockResponseCode(model.getBlockResponseCode());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** Enables or disables the address rate limiting Web Application Firewall feature. */
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * Enables or disables the address rate limiting Web Application Firewall feature.
     *
     * @return the value
     */
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /**
     * The number of allowed requests per second from one IP address. If unspecified, defaults to
     * {@code 1}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("allowedRatePerAddress")
    private final Integer allowedRatePerAddress;

    /**
     * The number of allowed requests per second from one IP address. If unspecified, defaults to
     * {@code 1}.
     *
     * @return the value
     */
    public Integer getAllowedRatePerAddress() {
        return allowedRatePerAddress;
    }

    /**
     * The maximum number of requests allowed to be queued before subsequent requests are dropped.
     * If unspecified, defaults to {@code 10}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxDelayedCountPerAddress")
    private final Integer maxDelayedCountPerAddress;

    /**
     * The maximum number of requests allowed to be queued before subsequent requests are dropped.
     * If unspecified, defaults to {@code 10}.
     *
     * @return the value
     */
    public Integer getMaxDelayedCountPerAddress() {
        return maxDelayedCountPerAddress;
    }

    /**
     * The response status code returned when a request is blocked. If unspecified, defaults to
     * {@code 503}. The list of available response codes: {@code 400}, {@code 401}, {@code 403},
     * {@code 404}, {@code 405}, {@code 408}, {@code 409}, {@code 411}, {@code 412}, {@code 413},
     * {@code 414}, {@code 415}, {@code 416}, {@code 422}, {@code 494}, {@code 495}, {@code 496},
     * {@code 497}, {@code 499}, {@code 500}, {@code 501}, {@code 502}, {@code 503}, {@code 504},
     * {@code 507}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("blockResponseCode")
    private final Integer blockResponseCode;

    /**
     * The response status code returned when a request is blocked. If unspecified, defaults to
     * {@code 503}. The list of available response codes: {@code 400}, {@code 401}, {@code 403},
     * {@code 404}, {@code 405}, {@code 408}, {@code 409}, {@code 411}, {@code 412}, {@code 413},
     * {@code 414}, {@code 415}, {@code 416}, {@code 422}, {@code 494}, {@code 495}, {@code 496},
     * {@code 497}, {@code 499}, {@code 500}, {@code 501}, {@code 502}, {@code 503}, {@code 504},
     * {@code 507}.
     *
     * @return the value
     */
    public Integer getBlockResponseCode() {
        return blockResponseCode;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AddressRateLimiting(");
        sb.append("super=").append(super.toString());
        sb.append("isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", allowedRatePerAddress=").append(String.valueOf(this.allowedRatePerAddress));
        sb.append(", maxDelayedCountPerAddress=")
                .append(String.valueOf(this.maxDelayedCountPerAddress));
        sb.append(", blockResponseCode=").append(String.valueOf(this.blockResponseCode));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AddressRateLimiting)) {
            return false;
        }

        AddressRateLimiting other = (AddressRateLimiting) o;
        return java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.allowedRatePerAddress, other.allowedRatePerAddress)
                && java.util.Objects.equals(
                        this.maxDelayedCountPerAddress, other.maxDelayedCountPerAddress)
                && java.util.Objects.equals(this.blockResponseCode, other.blockResponseCode)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.allowedRatePerAddress == null
                                ? 43
                                : this.allowedRatePerAddress.hashCode());
        result =
                (result * PRIME)
                        + (this.maxDelayedCountPerAddress == null
                                ? 43
                                : this.maxDelayedCountPerAddress.hashCode());
        result =
                (result * PRIME)
                        + (this.blockResponseCode == null ? 43 : this.blockResponseCode.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
