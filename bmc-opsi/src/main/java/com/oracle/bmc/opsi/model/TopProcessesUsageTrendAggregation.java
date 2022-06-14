/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Usage data per host top process
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = TopProcessesUsageTrendAggregation.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TopProcessesUsageTrendAggregation {
    @Deprecated
    @java.beans.ConstructorProperties({"command", "usageData"})
    public TopProcessesUsageTrendAggregation(
            String command, java.util.List<TopProcessesUsageTrend> usageData) {
        super();
        this.command = command;
        this.usageData = usageData;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Command line and arguments used to launch process
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("command")
        private String command;

        /**
         * Command line and arguments used to launch process
         * @param command the value to set
         * @return this builder
         **/
        public Builder command(String command) {
            this.command = command;
            this.__explicitlySet__.add("command");
            return this;
        }
        /**
         * List of usage data samples for a top process
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("usageData")
        private java.util.List<TopProcessesUsageTrend> usageData;

        /**
         * List of usage data samples for a top process
         * @param usageData the value to set
         * @return this builder
         **/
        public Builder usageData(java.util.List<TopProcessesUsageTrend> usageData) {
            this.usageData = usageData;
            this.__explicitlySet__.add("usageData");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TopProcessesUsageTrendAggregation build() {
            TopProcessesUsageTrendAggregation __instance__ =
                    new TopProcessesUsageTrendAggregation(command, usageData);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TopProcessesUsageTrendAggregation o) {
            Builder copiedBuilder = command(o.getCommand()).usageData(o.getUsageData());

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
     * Command line and arguments used to launch process
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("command")
    private final String command;

    /**
     * Command line and arguments used to launch process
     * @return the value
     **/
    public String getCommand() {
        return command;
    }

    /**
     * List of usage data samples for a top process
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("usageData")
    private final java.util.List<TopProcessesUsageTrend> usageData;

    /**
     * List of usage data samples for a top process
     * @return the value
     **/
    public java.util.List<TopProcessesUsageTrend> getUsageData() {
        return usageData;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("TopProcessesUsageTrendAggregation(");
        sb.append("command=").append(String.valueOf(this.command));
        sb.append(", usageData=").append(String.valueOf(this.usageData));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TopProcessesUsageTrendAggregation)) {
            return false;
        }

        TopProcessesUsageTrendAggregation other = (TopProcessesUsageTrendAggregation) o;
        return java.util.Objects.equals(this.command, other.command)
                && java.util.Objects.equals(this.usageData, other.usageData)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.command == null ? 43 : this.command.hashCode());
        result = (result * PRIME) + (this.usageData == null ? 43 : this.usageData.hashCode());
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
