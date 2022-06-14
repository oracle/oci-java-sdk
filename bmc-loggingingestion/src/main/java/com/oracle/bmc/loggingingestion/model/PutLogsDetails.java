/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loggingingestion.model;

/**
 * The request body for the PutLogs request.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200831")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PutLogsDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PutLogsDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"specversion", "logEntryBatches"})
    public PutLogsDetails(String specversion, java.util.List<LogEntryBatch> logEntryBatches) {
        super();
        this.specversion = specversion;
        this.logEntryBatches = logEntryBatches;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Required for identifying the version of the data format being used.
         * Permitted values include: "1.0"
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("specversion")
        private String specversion;

        /**
         * Required for identifying the version of the data format being used.
         * Permitted values include: "1.0"
         *
         * @param specversion the value to set
         * @return this builder
         **/
        public Builder specversion(String specversion) {
            this.specversion = specversion;
            this.__explicitlySet__.add("specversion");
            return this;
        }
        /**
         * List of log-batches. Each batch has a single source, type and subject.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("logEntryBatches")
        private java.util.List<LogEntryBatch> logEntryBatches;

        /**
         * List of log-batches. Each batch has a single source, type and subject.
         *
         * @param logEntryBatches the value to set
         * @return this builder
         **/
        public Builder logEntryBatches(java.util.List<LogEntryBatch> logEntryBatches) {
            this.logEntryBatches = logEntryBatches;
            this.__explicitlySet__.add("logEntryBatches");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PutLogsDetails build() {
            PutLogsDetails __instance__ = new PutLogsDetails(specversion, logEntryBatches);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PutLogsDetails o) {
            Builder copiedBuilder =
                    specversion(o.getSpecversion()).logEntryBatches(o.getLogEntryBatches());

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
     * Required for identifying the version of the data format being used.
     * Permitted values include: "1.0"
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("specversion")
    private final String specversion;

    /**
     * Required for identifying the version of the data format being used.
     * Permitted values include: "1.0"
     *
     * @return the value
     **/
    public String getSpecversion() {
        return specversion;
    }

    /**
     * List of log-batches. Each batch has a single source, type and subject.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("logEntryBatches")
    private final java.util.List<LogEntryBatch> logEntryBatches;

    /**
     * List of log-batches. Each batch has a single source, type and subject.
     *
     * @return the value
     **/
    public java.util.List<LogEntryBatch> getLogEntryBatches() {
        return logEntryBatches;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("PutLogsDetails(");
        sb.append("specversion=").append(String.valueOf(this.specversion));
        sb.append(", logEntryBatches=").append(String.valueOf(this.logEntryBatches));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PutLogsDetails)) {
            return false;
        }

        PutLogsDetails other = (PutLogsDetails) o;
        return java.util.Objects.equals(this.specversion, other.specversion)
                && java.util.Objects.equals(this.logEntryBatches, other.logEntryBatches)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.specversion == null ? 43 : this.specversion.hashCode());
        result =
                (result * PRIME)
                        + (this.logEntryBatches == null ? 43 : this.logEntryBatches.hashCode());
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
