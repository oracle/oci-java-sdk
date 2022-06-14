/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.model;

/**
 * The amount of time that objects in the bucket should be preserved for and which is calculated in relation to
 * each object's Last-Modified timestamp. If duration is not present, then there is no time limit and the objects
 * in the bucket will be preserved indefinitely.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Duration.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Duration {
    @Deprecated
    @java.beans.ConstructorProperties({"timeAmount", "timeUnit"})
    public Duration(Long timeAmount, TimeUnit timeUnit) {
        super();
        this.timeAmount = timeAmount;
        this.timeUnit = timeUnit;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The timeAmount is interpreted in units defined by the timeUnit parameter, and is calculated in relation
         * to each object's Last-Modified timestamp.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeAmount")
        private Long timeAmount;

        /**
         * The timeAmount is interpreted in units defined by the timeUnit parameter, and is calculated in relation
         * to each object's Last-Modified timestamp.
         *
         * @param timeAmount the value to set
         * @return this builder
         **/
        public Builder timeAmount(Long timeAmount) {
            this.timeAmount = timeAmount;
            this.__explicitlySet__.add("timeAmount");
            return this;
        }
        /**
         * The unit that should be used to interpret timeAmount.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUnit")
        private TimeUnit timeUnit;

        /**
         * The unit that should be used to interpret timeAmount.
         * @param timeUnit the value to set
         * @return this builder
         **/
        public Builder timeUnit(TimeUnit timeUnit) {
            this.timeUnit = timeUnit;
            this.__explicitlySet__.add("timeUnit");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Duration build() {
            Duration __instance__ = new Duration(timeAmount, timeUnit);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Duration o) {
            Builder copiedBuilder = timeAmount(o.getTimeAmount()).timeUnit(o.getTimeUnit());

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
     * The timeAmount is interpreted in units defined by the timeUnit parameter, and is calculated in relation
     * to each object's Last-Modified timestamp.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeAmount")
    private final Long timeAmount;

    /**
     * The timeAmount is interpreted in units defined by the timeUnit parameter, and is calculated in relation
     * to each object's Last-Modified timestamp.
     *
     * @return the value
     **/
    public Long getTimeAmount() {
        return timeAmount;
    }

    /**
     * The unit that should be used to interpret timeAmount.
     **/
    public enum TimeUnit {
        Years("YEARS"),
        Days("DAYS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(TimeUnit.class);

        private final String value;
        private static java.util.Map<String, TimeUnit> map;

        static {
            map = new java.util.HashMap<>();
            for (TimeUnit v : TimeUnit.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        TimeUnit(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TimeUnit create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'TimeUnit', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The unit that should be used to interpret timeAmount.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUnit")
    private final TimeUnit timeUnit;

    /**
     * The unit that should be used to interpret timeAmount.
     * @return the value
     **/
    public TimeUnit getTimeUnit() {
        return timeUnit;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Duration(");
        sb.append("timeAmount=").append(String.valueOf(this.timeAmount));
        sb.append(", timeUnit=").append(String.valueOf(this.timeUnit));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Duration)) {
            return false;
        }

        Duration other = (Duration) o;
        return java.util.Objects.equals(this.timeAmount, other.timeAmount)
                && java.util.Objects.equals(this.timeUnit, other.timeUnit)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.timeAmount == null ? 43 : this.timeAmount.hashCode());
        result = (result * PRIME) + (this.timeUnit == null ? 43 : this.timeUnit.hashCode());
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
