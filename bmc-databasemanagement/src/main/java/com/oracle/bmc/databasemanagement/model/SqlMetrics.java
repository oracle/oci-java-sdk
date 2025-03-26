/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * Metrics of the Sql in the Sql tuning set.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SqlMetrics.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SqlMetrics extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "cpuTime",
        "elapsedTime",
        "bufferGets",
        "diskReads",
        "directWrites",
        "executions"
    })
    public SqlMetrics(
            Long cpuTime,
            Long elapsedTime,
            Long bufferGets,
            Long diskReads,
            Long directWrites,
            Long executions) {
        super();
        this.cpuTime = cpuTime;
        this.elapsedTime = elapsedTime;
        this.bufferGets = bufferGets;
        this.diskReads = diskReads;
        this.directWrites = directWrites;
        this.executions = executions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Total CPU time consumed by the Sql.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cpuTime")
        private Long cpuTime;

        /**
         * Total CPU time consumed by the Sql.
         * @param cpuTime the value to set
         * @return this builder
         **/
        public Builder cpuTime(Long cpuTime) {
            this.cpuTime = cpuTime;
            this.__explicitlySet__.add("cpuTime");
            return this;
        }
        /**
         * Elapsed time of the Sql.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("elapsedTime")
        private Long elapsedTime;

        /**
         * Elapsed time of the Sql.
         * @param elapsedTime the value to set
         * @return this builder
         **/
        public Builder elapsedTime(Long elapsedTime) {
            this.elapsedTime = elapsedTime;
            this.__explicitlySet__.add("elapsedTime");
            return this;
        }
        /**
         * Sum total number of buffer gets.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("bufferGets")
        private Long bufferGets;

        /**
         * Sum total number of buffer gets.
         * @param bufferGets the value to set
         * @return this builder
         **/
        public Builder bufferGets(Long bufferGets) {
            this.bufferGets = bufferGets;
            this.__explicitlySet__.add("bufferGets");
            return this;
        }
        /**
         * Sum total number of disk reads.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("diskReads")
        private Long diskReads;

        /**
         * Sum total number of disk reads.
         * @param diskReads the value to set
         * @return this builder
         **/
        public Builder diskReads(Long diskReads) {
            this.diskReads = diskReads;
            this.__explicitlySet__.add("diskReads");
            return this;
        }
        /**
         * Sum total number of direct path writes.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("directWrites")
        private Long directWrites;

        /**
         * Sum total number of direct path writes.
         * @param directWrites the value to set
         * @return this builder
         **/
        public Builder directWrites(Long directWrites) {
            this.directWrites = directWrites;
            this.__explicitlySet__.add("directWrites");
            return this;
        }
        /**
         * Total executions of this SQL statement.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("executions")
        private Long executions;

        /**
         * Total executions of this SQL statement.
         * @param executions the value to set
         * @return this builder
         **/
        public Builder executions(Long executions) {
            this.executions = executions;
            this.__explicitlySet__.add("executions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlMetrics build() {
            SqlMetrics model =
                    new SqlMetrics(
                            this.cpuTime,
                            this.elapsedTime,
                            this.bufferGets,
                            this.diskReads,
                            this.directWrites,
                            this.executions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlMetrics model) {
            if (model.wasPropertyExplicitlySet("cpuTime")) {
                this.cpuTime(model.getCpuTime());
            }
            if (model.wasPropertyExplicitlySet("elapsedTime")) {
                this.elapsedTime(model.getElapsedTime());
            }
            if (model.wasPropertyExplicitlySet("bufferGets")) {
                this.bufferGets(model.getBufferGets());
            }
            if (model.wasPropertyExplicitlySet("diskReads")) {
                this.diskReads(model.getDiskReads());
            }
            if (model.wasPropertyExplicitlySet("directWrites")) {
                this.directWrites(model.getDirectWrites());
            }
            if (model.wasPropertyExplicitlySet("executions")) {
                this.executions(model.getExecutions());
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
     * Total CPU time consumed by the Sql.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuTime")
    private final Long cpuTime;

    /**
     * Total CPU time consumed by the Sql.
     * @return the value
     **/
    public Long getCpuTime() {
        return cpuTime;
    }

    /**
     * Elapsed time of the Sql.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("elapsedTime")
    private final Long elapsedTime;

    /**
     * Elapsed time of the Sql.
     * @return the value
     **/
    public Long getElapsedTime() {
        return elapsedTime;
    }

    /**
     * Sum total number of buffer gets.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bufferGets")
    private final Long bufferGets;

    /**
     * Sum total number of buffer gets.
     * @return the value
     **/
    public Long getBufferGets() {
        return bufferGets;
    }

    /**
     * Sum total number of disk reads.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("diskReads")
    private final Long diskReads;

    /**
     * Sum total number of disk reads.
     * @return the value
     **/
    public Long getDiskReads() {
        return diskReads;
    }

    /**
     * Sum total number of direct path writes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("directWrites")
    private final Long directWrites;

    /**
     * Sum total number of direct path writes.
     * @return the value
     **/
    public Long getDirectWrites() {
        return directWrites;
    }

    /**
     * Total executions of this SQL statement.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("executions")
    private final Long executions;

    /**
     * Total executions of this SQL statement.
     * @return the value
     **/
    public Long getExecutions() {
        return executions;
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
        sb.append("SqlMetrics(");
        sb.append("super=").append(super.toString());
        sb.append("cpuTime=").append(String.valueOf(this.cpuTime));
        sb.append(", elapsedTime=").append(String.valueOf(this.elapsedTime));
        sb.append(", bufferGets=").append(String.valueOf(this.bufferGets));
        sb.append(", diskReads=").append(String.valueOf(this.diskReads));
        sb.append(", directWrites=").append(String.valueOf(this.directWrites));
        sb.append(", executions=").append(String.valueOf(this.executions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SqlMetrics)) {
            return false;
        }

        SqlMetrics other = (SqlMetrics) o;
        return java.util.Objects.equals(this.cpuTime, other.cpuTime)
                && java.util.Objects.equals(this.elapsedTime, other.elapsedTime)
                && java.util.Objects.equals(this.bufferGets, other.bufferGets)
                && java.util.Objects.equals(this.diskReads, other.diskReads)
                && java.util.Objects.equals(this.directWrites, other.directWrites)
                && java.util.Objects.equals(this.executions, other.executions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.cpuTime == null ? 43 : this.cpuTime.hashCode());
        result = (result * PRIME) + (this.elapsedTime == null ? 43 : this.elapsedTime.hashCode());
        result = (result * PRIME) + (this.bufferGets == null ? 43 : this.bufferGets.hashCode());
        result = (result * PRIME) + (this.diskReads == null ? 43 : this.diskReads.hashCode());
        result = (result * PRIME) + (this.directWrites == null ? 43 : this.directWrites.hashCode());
        result = (result * PRIME) + (this.executions == null ? 43 : this.executions.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
