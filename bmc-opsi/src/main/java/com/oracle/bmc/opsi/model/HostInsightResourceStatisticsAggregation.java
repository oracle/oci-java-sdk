/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Contains host details and resource statistics.
 *
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
    builder = HostInsightResourceStatisticsAggregation.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class HostInsightResourceStatisticsAggregation {
    @Deprecated
    @java.beans.ConstructorProperties({"hostDetails", "currentStatistics"})
    public HostInsightResourceStatisticsAggregation(
            HostDetails hostDetails, HostResourceStatistics currentStatistics) {
        super();
        this.hostDetails = hostDetails;
        this.currentStatistics = currentStatistics;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("hostDetails")
        private HostDetails hostDetails;

        public Builder hostDetails(HostDetails hostDetails) {
            this.hostDetails = hostDetails;
            this.__explicitlySet__.add("hostDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("currentStatistics")
        private HostResourceStatistics currentStatistics;

        public Builder currentStatistics(HostResourceStatistics currentStatistics) {
            this.currentStatistics = currentStatistics;
            this.__explicitlySet__.add("currentStatistics");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HostInsightResourceStatisticsAggregation build() {
            HostInsightResourceStatisticsAggregation __instance__ =
                    new HostInsightResourceStatisticsAggregation(hostDetails, currentStatistics);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HostInsightResourceStatisticsAggregation o) {
            Builder copiedBuilder =
                    hostDetails(o.getHostDetails()).currentStatistics(o.getCurrentStatistics());

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

    @com.fasterxml.jackson.annotation.JsonProperty("hostDetails")
    private final HostDetails hostDetails;

    public HostDetails getHostDetails() {
        return hostDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("currentStatistics")
    private final HostResourceStatistics currentStatistics;

    public HostResourceStatistics getCurrentStatistics() {
        return currentStatistics;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("HostInsightResourceStatisticsAggregation(");
        sb.append("hostDetails=").append(String.valueOf(this.hostDetails));
        sb.append(", currentStatistics=").append(String.valueOf(this.currentStatistics));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HostInsightResourceStatisticsAggregation)) {
            return false;
        }

        HostInsightResourceStatisticsAggregation other =
                (HostInsightResourceStatisticsAggregation) o;
        return java.util.Objects.equals(this.hostDetails, other.hostDetails)
                && java.util.Objects.equals(this.currentStatistics, other.currentStatistics)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.hostDetails == null ? 43 : this.hostDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.currentStatistics == null ? 43 : this.currentStatistics.hashCode());
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
