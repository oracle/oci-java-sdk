/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The queued and running statement metrics for Autonomous Databases.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = StatementsAggregateMetrics.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class StatementsAggregateMetrics
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"queuedStatements", "runningStatements"})
    public StatementsAggregateMetrics(
            MetricDataPoint queuedStatements, MetricDataPoint runningStatements) {
        super();
        this.queuedStatements = queuedStatements;
        this.runningStatements = runningStatements;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("queuedStatements")
        private MetricDataPoint queuedStatements;

        public Builder queuedStatements(MetricDataPoint queuedStatements) {
            this.queuedStatements = queuedStatements;
            this.__explicitlySet__.add("queuedStatements");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("runningStatements")
        private MetricDataPoint runningStatements;

        public Builder runningStatements(MetricDataPoint runningStatements) {
            this.runningStatements = runningStatements;
            this.__explicitlySet__.add("runningStatements");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public StatementsAggregateMetrics build() {
            StatementsAggregateMetrics model =
                    new StatementsAggregateMetrics(this.queuedStatements, this.runningStatements);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(StatementsAggregateMetrics model) {
            if (model.wasPropertyExplicitlySet("queuedStatements")) {
                this.queuedStatements(model.getQueuedStatements());
            }
            if (model.wasPropertyExplicitlySet("runningStatements")) {
                this.runningStatements(model.getRunningStatements());
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

    @com.fasterxml.jackson.annotation.JsonProperty("queuedStatements")
    private final MetricDataPoint queuedStatements;

    public MetricDataPoint getQueuedStatements() {
        return queuedStatements;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("runningStatements")
    private final MetricDataPoint runningStatements;

    public MetricDataPoint getRunningStatements() {
        return runningStatements;
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
        sb.append("StatementsAggregateMetrics(");
        sb.append("super=").append(super.toString());
        sb.append("queuedStatements=").append(String.valueOf(this.queuedStatements));
        sb.append(", runningStatements=").append(String.valueOf(this.runningStatements));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StatementsAggregateMetrics)) {
            return false;
        }

        StatementsAggregateMetrics other = (StatementsAggregateMetrics) o;
        return java.util.Objects.equals(this.queuedStatements, other.queuedStatements)
                && java.util.Objects.equals(this.runningStatements, other.runningStatements)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.queuedStatements == null ? 43 : this.queuedStatements.hashCode());
        result =
                (result * PRIME)
                        + (this.runningStatements == null ? 43 : this.runningStatements.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
