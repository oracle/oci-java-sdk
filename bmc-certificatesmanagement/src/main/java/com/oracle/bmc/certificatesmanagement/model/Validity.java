/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificatesmanagement.model;

/**
 * An object that describes a period of time during which an entity is valid. If this is not provided when you create a certificate, the validity of the issuing CA is used.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210224")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Validity.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Validity {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfValidityNotBefore")
        private java.util.Date timeOfValidityNotBefore;

        public Builder timeOfValidityNotBefore(java.util.Date timeOfValidityNotBefore) {
            this.timeOfValidityNotBefore = timeOfValidityNotBefore;
            this.__explicitlySet__.add("timeOfValidityNotBefore");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeOfValidityNotAfter")
        private java.util.Date timeOfValidityNotAfter;

        public Builder timeOfValidityNotAfter(java.util.Date timeOfValidityNotAfter) {
            this.timeOfValidityNotAfter = timeOfValidityNotAfter;
            this.__explicitlySet__.add("timeOfValidityNotAfter");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Validity build() {
            Validity __instance__ = new Validity(timeOfValidityNotBefore, timeOfValidityNotAfter);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Validity o) {
            Builder copiedBuilder =
                    timeOfValidityNotBefore(o.getTimeOfValidityNotBefore())
                            .timeOfValidityNotAfter(o.getTimeOfValidityNotAfter());

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
     * The date on which the certificate validity period begins, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * Example: {@code 2019-04-03T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfValidityNotBefore")
    java.util.Date timeOfValidityNotBefore;

    /**
     * The date on which the certificate validity period ends, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * Example: {@code 2019-04-03T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfValidityNotAfter")
    java.util.Date timeOfValidityNotAfter;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
