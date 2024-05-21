/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataflow.model;

/**
 * A collection of metrics related to a particular pool.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200129")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PoolMetrics.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PoolMetrics extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "timeLastStarted",
        "timeLastStopped",
        "timeLastUsed",
        "timeLastMetricsUpdated",
        "activeRunsCount",
        "activelyUsedNodeCount"
    })
    public PoolMetrics(
            java.util.Date timeLastStarted,
            java.util.Date timeLastStopped,
            java.util.Date timeLastUsed,
            java.util.Date timeLastMetricsUpdated,
            Long activeRunsCount,
            java.util.List<NodeCount> activelyUsedNodeCount) {
        super();
        this.timeLastStarted = timeLastStarted;
        this.timeLastStopped = timeLastStopped;
        this.timeLastUsed = timeLastUsed;
        this.timeLastMetricsUpdated = timeLastMetricsUpdated;
        this.activeRunsCount = activeRunsCount;
        this.activelyUsedNodeCount = activelyUsedNodeCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The last time this pool was started.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastStarted")
        private java.util.Date timeLastStarted;

        /**
         * The last time this pool was started.
         *
         * @param timeLastStarted the value to set
         * @return this builder
         **/
        public Builder timeLastStarted(java.util.Date timeLastStarted) {
            this.timeLastStarted = timeLastStarted;
            this.__explicitlySet__.add("timeLastStarted");
            return this;
        }
        /**
         * The last time this pool was stopped.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastStopped")
        private java.util.Date timeLastStopped;

        /**
         * The last time this pool was stopped.
         *
         * @param timeLastStopped the value to set
         * @return this builder
         **/
        public Builder timeLastStopped(java.util.Date timeLastStopped) {
            this.timeLastStopped = timeLastStopped;
            this.__explicitlySet__.add("timeLastStopped");
            return this;
        }
        /**
         * The last time a run used this pool.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastUsed")
        private java.util.Date timeLastUsed;

        /**
         * The last time a run used this pool.
         *
         * @param timeLastUsed the value to set
         * @return this builder
         **/
        public Builder timeLastUsed(java.util.Date timeLastUsed) {
            this.timeLastUsed = timeLastUsed;
            this.__explicitlySet__.add("timeLastUsed");
            return this;
        }
        /**
         * The last time the mertics were updated for this.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastMetricsUpdated")
        private java.util.Date timeLastMetricsUpdated;

        /**
         * The last time the mertics were updated for this.
         *
         * @param timeLastMetricsUpdated the value to set
         * @return this builder
         **/
        public Builder timeLastMetricsUpdated(java.util.Date timeLastMetricsUpdated) {
            this.timeLastMetricsUpdated = timeLastMetricsUpdated;
            this.__explicitlySet__.add("timeLastMetricsUpdated");
            return this;
        }
        /**
         * The number of runs that are currently running that are using this pool.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("activeRunsCount")
        private Long activeRunsCount;

        /**
         * The number of runs that are currently running that are using this pool.
         *
         * @param activeRunsCount the value to set
         * @return this builder
         **/
        public Builder activeRunsCount(Long activeRunsCount) {
            this.activeRunsCount = activeRunsCount;
            this.__explicitlySet__.add("activeRunsCount");
            return this;
        }
        /**
         * A count of the nodes that are currently being used for each shape in this pool.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("activelyUsedNodeCount")
        private java.util.List<NodeCount> activelyUsedNodeCount;

        /**
         * A count of the nodes that are currently being used for each shape in this pool.
         *
         * @param activelyUsedNodeCount the value to set
         * @return this builder
         **/
        public Builder activelyUsedNodeCount(java.util.List<NodeCount> activelyUsedNodeCount) {
            this.activelyUsedNodeCount = activelyUsedNodeCount;
            this.__explicitlySet__.add("activelyUsedNodeCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PoolMetrics build() {
            PoolMetrics model =
                    new PoolMetrics(
                            this.timeLastStarted,
                            this.timeLastStopped,
                            this.timeLastUsed,
                            this.timeLastMetricsUpdated,
                            this.activeRunsCount,
                            this.activelyUsedNodeCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PoolMetrics model) {
            if (model.wasPropertyExplicitlySet("timeLastStarted")) {
                this.timeLastStarted(model.getTimeLastStarted());
            }
            if (model.wasPropertyExplicitlySet("timeLastStopped")) {
                this.timeLastStopped(model.getTimeLastStopped());
            }
            if (model.wasPropertyExplicitlySet("timeLastUsed")) {
                this.timeLastUsed(model.getTimeLastUsed());
            }
            if (model.wasPropertyExplicitlySet("timeLastMetricsUpdated")) {
                this.timeLastMetricsUpdated(model.getTimeLastMetricsUpdated());
            }
            if (model.wasPropertyExplicitlySet("activeRunsCount")) {
                this.activeRunsCount(model.getActiveRunsCount());
            }
            if (model.wasPropertyExplicitlySet("activelyUsedNodeCount")) {
                this.activelyUsedNodeCount(model.getActivelyUsedNodeCount());
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
     * The last time this pool was started.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastStarted")
    private final java.util.Date timeLastStarted;

    /**
     * The last time this pool was started.
     *
     * @return the value
     **/
    public java.util.Date getTimeLastStarted() {
        return timeLastStarted;
    }

    /**
     * The last time this pool was stopped.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastStopped")
    private final java.util.Date timeLastStopped;

    /**
     * The last time this pool was stopped.
     *
     * @return the value
     **/
    public java.util.Date getTimeLastStopped() {
        return timeLastStopped;
    }

    /**
     * The last time a run used this pool.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastUsed")
    private final java.util.Date timeLastUsed;

    /**
     * The last time a run used this pool.
     *
     * @return the value
     **/
    public java.util.Date getTimeLastUsed() {
        return timeLastUsed;
    }

    /**
     * The last time the mertics were updated for this.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastMetricsUpdated")
    private final java.util.Date timeLastMetricsUpdated;

    /**
     * The last time the mertics were updated for this.
     *
     * @return the value
     **/
    public java.util.Date getTimeLastMetricsUpdated() {
        return timeLastMetricsUpdated;
    }

    /**
     * The number of runs that are currently running that are using this pool.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("activeRunsCount")
    private final Long activeRunsCount;

    /**
     * The number of runs that are currently running that are using this pool.
     *
     * @return the value
     **/
    public Long getActiveRunsCount() {
        return activeRunsCount;
    }

    /**
     * A count of the nodes that are currently being used for each shape in this pool.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("activelyUsedNodeCount")
    private final java.util.List<NodeCount> activelyUsedNodeCount;

    /**
     * A count of the nodes that are currently being used for each shape in this pool.
     *
     * @return the value
     **/
    public java.util.List<NodeCount> getActivelyUsedNodeCount() {
        return activelyUsedNodeCount;
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
        sb.append("PoolMetrics(");
        sb.append("super=").append(super.toString());
        sb.append("timeLastStarted=").append(String.valueOf(this.timeLastStarted));
        sb.append(", timeLastStopped=").append(String.valueOf(this.timeLastStopped));
        sb.append(", timeLastUsed=").append(String.valueOf(this.timeLastUsed));
        sb.append(", timeLastMetricsUpdated=").append(String.valueOf(this.timeLastMetricsUpdated));
        sb.append(", activeRunsCount=").append(String.valueOf(this.activeRunsCount));
        sb.append(", activelyUsedNodeCount=").append(String.valueOf(this.activelyUsedNodeCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PoolMetrics)) {
            return false;
        }

        PoolMetrics other = (PoolMetrics) o;
        return java.util.Objects.equals(this.timeLastStarted, other.timeLastStarted)
                && java.util.Objects.equals(this.timeLastStopped, other.timeLastStopped)
                && java.util.Objects.equals(this.timeLastUsed, other.timeLastUsed)
                && java.util.Objects.equals(
                        this.timeLastMetricsUpdated, other.timeLastMetricsUpdated)
                && java.util.Objects.equals(this.activeRunsCount, other.activeRunsCount)
                && java.util.Objects.equals(this.activelyUsedNodeCount, other.activelyUsedNodeCount)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.timeLastStarted == null ? 43 : this.timeLastStarted.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastStopped == null ? 43 : this.timeLastStopped.hashCode());
        result = (result * PRIME) + (this.timeLastUsed == null ? 43 : this.timeLastUsed.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastMetricsUpdated == null
                                ? 43
                                : this.timeLastMetricsUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.activeRunsCount == null ? 43 : this.activeRunsCount.hashCode());
        result =
                (result * PRIME)
                        + (this.activelyUsedNodeCount == null
                                ? 43
                                : this.activelyUsedNodeCount.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
