/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.healthchecks.model;

/**
 * The DNS resolution results.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180501")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DNS.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class DNS {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("domainLookupDuration")
        private Double domainLookupDuration;

        public Builder domainLookupDuration(Double domainLookupDuration) {
            this.domainLookupDuration = domainLookupDuration;
            this.__explicitlySet__.add("domainLookupDuration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("addresses")
        private java.util.List<String> addresses;

        public Builder addresses(java.util.List<String> addresses) {
            this.addresses = addresses;
            this.__explicitlySet__.add("addresses");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DNS build() {
            DNS __instance__ = new DNS(domainLookupDuration, addresses);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DNS o) {
            Builder copiedBuilder =
                    domainLookupDuration(o.getDomainLookupDuration()).addresses(o.getAddresses());

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

    /**
     * Total DNS resolution duration, in milliseconds. Calculated using `domainLookupEnd`
     * minus `domainLookupStart`.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("domainLookupDuration")
    Double domainLookupDuration;

    /**
     * The addresses returned by DNS resolution.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("addresses")
    java.util.List<String> addresses;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
