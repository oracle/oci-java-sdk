/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * **Deprecated.** For information about connection strings to connect to an Oracle Autonomous Data Warehouse, see {@link #autonomousDatabaseConnectionStrings(AutonomousDatabaseConnectionStringsRequest) autonomousDatabaseConnectionStrings}.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AutonomousDataWarehouseConnectionStrings.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AutonomousDataWarehouseConnectionStrings {
    @Deprecated
    @java.beans.ConstructorProperties({"high", "medium", "low", "allConnectionStrings"})
    public AutonomousDataWarehouseConnectionStrings(
            String high,
            String medium,
            String low,
            java.util.Map<String, String> allConnectionStrings) {
        super();
        this.high = high;
        this.medium = medium;
        this.low = low;
        this.allConnectionStrings = allConnectionStrings;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("high")
        private String high;

        public Builder high(String high) {
            this.high = high;
            this.__explicitlySet__.add("high");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("medium")
        private String medium;

        public Builder medium(String medium) {
            this.medium = medium;
            this.__explicitlySet__.add("medium");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("low")
        private String low;

        public Builder low(String low) {
            this.low = low;
            this.__explicitlySet__.add("low");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("allConnectionStrings")
        private java.util.Map<String, String> allConnectionStrings;

        public Builder allConnectionStrings(java.util.Map<String, String> allConnectionStrings) {
            this.allConnectionStrings = allConnectionStrings;
            this.__explicitlySet__.add("allConnectionStrings");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AutonomousDataWarehouseConnectionStrings build() {
            AutonomousDataWarehouseConnectionStrings __instance__ =
                    new AutonomousDataWarehouseConnectionStrings(
                            high, medium, low, allConnectionStrings);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AutonomousDataWarehouseConnectionStrings o) {
            Builder copiedBuilder =
                    high(o.getHigh())
                            .medium(o.getMedium())
                            .low(o.getLow())
                            .allConnectionStrings(o.getAllConnectionStrings());

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
     * The High database service provides the highest level of resources to each SQL statement resulting in the highest performance, but supports the fewest number of concurrent SQL statements.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("high")
    private final String high;

    public String getHigh() {
        return high;
    }

    /**
     * The Medium database service provides a lower level of resources to each SQL statement potentially resulting a lower level of performance, but supports more concurrent SQL statements.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("medium")
    private final String medium;

    public String getMedium() {
        return medium;
    }

    /**
     * The Low database service provides the least level of resources to each SQL statement, but supports the most number of concurrent SQL statements.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("low")
    private final String low;

    public String getLow() {
        return low;
    }

    /**
     * Returns all connection strings that can be used to connect to the Autonomous Data Warehouse.
     * For more information, please see [Predefined Database Service Names for Autonomous Transaction Processing](https://docs.oracle.com/en/cloud/paas/atp-cloud/atpug/connect-predefined.html#GUID-9747539B-FD46-44F1-8FF8-F5AC650F15BE)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("allConnectionStrings")
    private final java.util.Map<String, String> allConnectionStrings;

    public java.util.Map<String, String> getAllConnectionStrings() {
        return allConnectionStrings;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AutonomousDataWarehouseConnectionStrings(");
        sb.append("high=").append(String.valueOf(this.high));
        sb.append(", medium=").append(String.valueOf(this.medium));
        sb.append(", low=").append(String.valueOf(this.low));
        sb.append(", allConnectionStrings=").append(String.valueOf(this.allConnectionStrings));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AutonomousDataWarehouseConnectionStrings)) {
            return false;
        }

        AutonomousDataWarehouseConnectionStrings other =
                (AutonomousDataWarehouseConnectionStrings) o;
        return java.util.Objects.equals(this.high, other.high)
                && java.util.Objects.equals(this.medium, other.medium)
                && java.util.Objects.equals(this.low, other.low)
                && java.util.Objects.equals(this.allConnectionStrings, other.allConnectionStrings)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.high == null ? 43 : this.high.hashCode());
        result = (result * PRIME) + (this.medium == null ? 43 : this.medium.hashCode());
        result = (result * PRIME) + (this.low == null ? 43 : this.low.hashCode());
        result =
                (result * PRIME)
                        + (this.allConnectionStrings == null
                                ? 43
                                : this.allConnectionStrings.hashCode());
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
