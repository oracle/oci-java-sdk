/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificates.model;

/**
 * An object that describes a period of time during which an entity is valid.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210224")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Validity.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Validity {
    @Deprecated
    @java.beans.ConstructorProperties({"timeOfValidityNotBefore", "timeOfValidityNotAfter"})
    public Validity(java.util.Date timeOfValidityNotBefore, java.util.Date timeOfValidityNotAfter) {
        super();
        this.timeOfValidityNotBefore = timeOfValidityNotBefore;
        this.timeOfValidityNotAfter = timeOfValidityNotAfter;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The date on which the certificate validity period begins, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * Example: {@code 2019-04-03T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfValidityNotBefore")
    private final java.util.Date timeOfValidityNotBefore;

    public java.util.Date getTimeOfValidityNotBefore() {
        return timeOfValidityNotBefore;
    }

    /**
     * The date on which the certificate validity period ends, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * Example: {@code 2019-04-03T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfValidityNotAfter")
    private final java.util.Date timeOfValidityNotAfter;

    public java.util.Date getTimeOfValidityNotAfter() {
        return timeOfValidityNotAfter;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Validity(");
        sb.append("timeOfValidityNotBefore=").append(String.valueOf(this.timeOfValidityNotBefore));
        sb.append(", timeOfValidityNotAfter=").append(String.valueOf(this.timeOfValidityNotAfter));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Validity)) {
            return false;
        }

        Validity other = (Validity) o;
        return java.util.Objects.equals(this.timeOfValidityNotBefore, other.timeOfValidityNotBefore)
                && java.util.Objects.equals(
                        this.timeOfValidityNotAfter, other.timeOfValidityNotAfter)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.timeOfValidityNotBefore == null
                                ? 43
                                : this.timeOfValidityNotBefore.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOfValidityNotAfter == null
                                ? 43
                                : this.timeOfValidityNotAfter.hashCode());
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
