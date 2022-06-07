/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.model;

/**
 * The IP rate limiting configuration. Defines the amount of allowed requests from a unique IP address and the resulting block response code when that threshold is exceeded.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AddressRateLimiting.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AddressRateLimiting {
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
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("allowedRatePerAddress")
        private Integer allowedRatePerAddress;

        public Builder allowedRatePerAddress(Integer allowedRatePerAddress) {
            this.allowedRatePerAddress = allowedRatePerAddress;
            this.__explicitlySet__.add("allowedRatePerAddress");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maxDelayedCountPerAddress")
        private Integer maxDelayedCountPerAddress;

        public Builder maxDelayedCountPerAddress(Integer maxDelayedCountPerAddress) {
            this.maxDelayedCountPerAddress = maxDelayedCountPerAddress;
            this.__explicitlySet__.add("maxDelayedCountPerAddress");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("blockResponseCode")
        private Integer blockResponseCode;

        public Builder blockResponseCode(Integer blockResponseCode) {
            this.blockResponseCode = blockResponseCode;
            this.__explicitlySet__.add("blockResponseCode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AddressRateLimiting build() {
            AddressRateLimiting __instance__ =
                    new AddressRateLimiting(
                            isEnabled,
                            allowedRatePerAddress,
                            maxDelayedCountPerAddress,
                            blockResponseCode);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AddressRateLimiting o) {
            Builder copiedBuilder =
                    isEnabled(o.getIsEnabled())
                            .allowedRatePerAddress(o.getAllowedRatePerAddress())
                            .maxDelayedCountPerAddress(o.getMaxDelayedCountPerAddress())
                            .blockResponseCode(o.getBlockResponseCode());

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

    /**
     * Enables or disables the address rate limiting Web Application Firewall feature.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /**
     * The number of allowed requests per second from one IP address. If unspecified, defaults to {@code 1}.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("allowedRatePerAddress")
    private final Integer allowedRatePerAddress;

    public Integer getAllowedRatePerAddress() {
        return allowedRatePerAddress;
    }

    /**
     * The maximum number of requests allowed to be queued before subsequent requests are dropped. If unspecified, defaults to {@code 10}.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxDelayedCountPerAddress")
    private final Integer maxDelayedCountPerAddress;

    public Integer getMaxDelayedCountPerAddress() {
        return maxDelayedCountPerAddress;
    }

    /**
     * The response status code returned when a request is blocked. If unspecified, defaults to {@code 503}. The list of available response codes: {@code 400}, {@code 401}, {@code 403}, {@code 404}, {@code 405}, {@code 408}, {@code 409}, {@code 411}, {@code 412}, {@code 413}, {@code 414}, {@code 415}, {@code 416}, {@code 422}, {@code 494}, {@code 495}, {@code 496}, {@code 497}, {@code 499}, {@code 500}, {@code 501}, {@code 502}, {@code 503}, {@code 504}, {@code 507}.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("blockResponseCode")
    private final Integer blockResponseCode;

    public Integer getBlockResponseCode() {
        return blockResponseCode;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AddressRateLimiting(");
        sb.append("isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", allowedRatePerAddress=").append(String.valueOf(this.allowedRatePerAddress));
        sb.append(", maxDelayedCountPerAddress=")
                .append(String.valueOf(this.maxDelayedCountPerAddress));
        sb.append(", blockResponseCode=").append(String.valueOf(this.blockResponseCode));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
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
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
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
