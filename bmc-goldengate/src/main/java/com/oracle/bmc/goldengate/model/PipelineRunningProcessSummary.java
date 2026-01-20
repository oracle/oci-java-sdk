/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * Each replication process and their summary details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PipelineRunningProcessSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PipelineRunningProcessSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "processType",
        "status",
        "lastRecordLagInSeconds",
        "timeLastProcessed"
    })
    public PipelineRunningProcessSummary(
            String name,
            ProcessType processType,
            ProcessStatusType status,
            Float lastRecordLagInSeconds,
            java.util.Date timeLastProcessed) {
        super();
        this.name = name;
        this.processType = processType;
        this.status = status;
        this.lastRecordLagInSeconds = lastRecordLagInSeconds;
        this.timeLastProcessed = timeLastProcessed;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** An object's Display Name. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * An object's Display Name.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The type of process running in a replication. For example, Extract or Replicat. This
         * option applies when retrieving running processes.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("processType")
        private ProcessType processType;

        /**
         * The type of process running in a replication. For example, Extract or Replicat. This
         * option applies when retrieving running processes.
         *
         * @param processType the value to set
         * @return this builder
         */
        public Builder processType(ProcessType processType) {
            this.processType = processType;
            this.__explicitlySet__.add("processType");
            return this;
        }
        /**
         * The status of the Extract or Replicat process. This option applies when retrieving
         * running processes.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private ProcessStatusType status;

        /**
         * The status of the Extract or Replicat process. This option applies when retrieving
         * running processes.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(ProcessStatusType status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * The latency, in seconds, of a process running in a replication. This option applies when
         * retrieving running processes.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lastRecordLagInSeconds")
        private Float lastRecordLagInSeconds;

        /**
         * The latency, in seconds, of a process running in a replication. This option applies when
         * retrieving running processes.
         *
         * @param lastRecordLagInSeconds the value to set
         * @return this builder
         */
        public Builder lastRecordLagInSeconds(Float lastRecordLagInSeconds) {
            this.lastRecordLagInSeconds = lastRecordLagInSeconds;
            this.__explicitlySet__.add("lastRecordLagInSeconds");
            return this;
        }
        /**
         * The date and time the last record was processed by an Extract or Replicat. This option
         * applies when retrieving running processes. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2024-07-25T21:10:29.600Z}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastProcessed")
        private java.util.Date timeLastProcessed;

        /**
         * The date and time the last record was processed by an Extract or Replicat. This option
         * applies when retrieving running processes. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2024-07-25T21:10:29.600Z}.
         *
         * @param timeLastProcessed the value to set
         * @return this builder
         */
        public Builder timeLastProcessed(java.util.Date timeLastProcessed) {
            this.timeLastProcessed = timeLastProcessed;
            this.__explicitlySet__.add("timeLastProcessed");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PipelineRunningProcessSummary build() {
            PipelineRunningProcessSummary model =
                    new PipelineRunningProcessSummary(
                            this.name,
                            this.processType,
                            this.status,
                            this.lastRecordLagInSeconds,
                            this.timeLastProcessed);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PipelineRunningProcessSummary model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("processType")) {
                this.processType(model.getProcessType());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("lastRecordLagInSeconds")) {
                this.lastRecordLagInSeconds(model.getLastRecordLagInSeconds());
            }
            if (model.wasPropertyExplicitlySet("timeLastProcessed")) {
                this.timeLastProcessed(model.getTimeLastProcessed());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** An object's Display Name. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * An object's Display Name.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * The type of process running in a replication. For example, Extract or Replicat. This option
     * applies when retrieving running processes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("processType")
    private final ProcessType processType;

    /**
     * The type of process running in a replication. For example, Extract or Replicat. This option
     * applies when retrieving running processes.
     *
     * @return the value
     */
    public ProcessType getProcessType() {
        return processType;
    }

    /**
     * The status of the Extract or Replicat process. This option applies when retrieving running
     * processes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final ProcessStatusType status;

    /**
     * The status of the Extract or Replicat process. This option applies when retrieving running
     * processes.
     *
     * @return the value
     */
    public ProcessStatusType getStatus() {
        return status;
    }

    /**
     * The latency, in seconds, of a process running in a replication. This option applies when
     * retrieving running processes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lastRecordLagInSeconds")
    private final Float lastRecordLagInSeconds;

    /**
     * The latency, in seconds, of a process running in a replication. This option applies when
     * retrieving running processes.
     *
     * @return the value
     */
    public Float getLastRecordLagInSeconds() {
        return lastRecordLagInSeconds;
    }

    /**
     * The date and time the last record was processed by an Extract or Replicat. This option
     * applies when retrieving running processes. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2024-07-25T21:10:29.600Z}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastProcessed")
    private final java.util.Date timeLastProcessed;

    /**
     * The date and time the last record was processed by an Extract or Replicat. This option
     * applies when retrieving running processes. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2024-07-25T21:10:29.600Z}.
     *
     * @return the value
     */
    public java.util.Date getTimeLastProcessed() {
        return timeLastProcessed;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("PipelineRunningProcessSummary(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", processType=").append(String.valueOf(this.processType));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", lastRecordLagInSeconds=").append(String.valueOf(this.lastRecordLagInSeconds));
        sb.append(", timeLastProcessed=").append(String.valueOf(this.timeLastProcessed));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PipelineRunningProcessSummary)) {
            return false;
        }

        PipelineRunningProcessSummary other = (PipelineRunningProcessSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.processType, other.processType)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(
                        this.lastRecordLagInSeconds, other.lastRecordLagInSeconds)
                && java.util.Objects.equals(this.timeLastProcessed, other.timeLastProcessed)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.processType == null ? 43 : this.processType.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.lastRecordLagInSeconds == null
                                ? 43
                                : this.lastRecordLagInSeconds.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastProcessed == null ? 43 : this.timeLastProcessed.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
