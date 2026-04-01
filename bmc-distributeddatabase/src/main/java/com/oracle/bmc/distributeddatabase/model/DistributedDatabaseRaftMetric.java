/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.distributeddatabase.model;

/**
 * Raft metrics for shards and catalog for the Globally distributed database.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DistributedDatabaseRaftMetric.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DistributedDatabaseRaftMetric
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"raftMetrics", "configTasks"})
    public DistributedDatabaseRaftMetric(
            java.util.Map<String, Object> raftMetrics, java.util.Map<String, Object> configTasks) {
        super();
        this.raftMetrics = raftMetrics;
        this.configTasks = configTasks;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Raft metrics for the Globally distributed database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("raftMetrics")
        private java.util.Map<String, Object> raftMetrics;

        /**
         * Raft metrics for the Globally distributed database.
         * @param raftMetrics the value to set
         * @return this builder
         **/
        public Builder raftMetrics(java.util.Map<String, Object> raftMetrics) {
            this.raftMetrics = raftMetrics;
            this.__explicitlySet__.add("raftMetrics");
            return this;
        }
        /**
         * Details of in-progress configuration tasks.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("configTasks")
        private java.util.Map<String, Object> configTasks;

        /**
         * Details of in-progress configuration tasks.
         * @param configTasks the value to set
         * @return this builder
         **/
        public Builder configTasks(java.util.Map<String, Object> configTasks) {
            this.configTasks = configTasks;
            this.__explicitlySet__.add("configTasks");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DistributedDatabaseRaftMetric build() {
            DistributedDatabaseRaftMetric model =
                    new DistributedDatabaseRaftMetric(this.raftMetrics, this.configTasks);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DistributedDatabaseRaftMetric model) {
            if (model.wasPropertyExplicitlySet("raftMetrics")) {
                this.raftMetrics(model.getRaftMetrics());
            }
            if (model.wasPropertyExplicitlySet("configTasks")) {
                this.configTasks(model.getConfigTasks());
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

    /**
     * Raft metrics for the Globally distributed database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("raftMetrics")
    private final java.util.Map<String, Object> raftMetrics;

    /**
     * Raft metrics for the Globally distributed database.
     * @return the value
     **/
    public java.util.Map<String, Object> getRaftMetrics() {
        return raftMetrics;
    }

    /**
     * Details of in-progress configuration tasks.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("configTasks")
    private final java.util.Map<String, Object> configTasks;

    /**
     * Details of in-progress configuration tasks.
     * @return the value
     **/
    public java.util.Map<String, Object> getConfigTasks() {
        return configTasks;
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
        sb.append("DistributedDatabaseRaftMetric(");
        sb.append("super=").append(super.toString());
        sb.append("raftMetrics=").append(String.valueOf(this.raftMetrics));
        sb.append(", configTasks=").append(String.valueOf(this.configTasks));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DistributedDatabaseRaftMetric)) {
            return false;
        }

        DistributedDatabaseRaftMetric other = (DistributedDatabaseRaftMetric) o;
        return java.util.Objects.equals(this.raftMetrics, other.raftMetrics)
                && java.util.Objects.equals(this.configTasks, other.configTasks)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.raftMetrics == null ? 43 : this.raftMetrics.hashCode());
        result = (result * PRIME) + (this.configTasks == null ? 43 : this.configTasks.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
