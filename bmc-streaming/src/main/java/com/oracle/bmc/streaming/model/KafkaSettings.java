/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.streaming.model;

/**
 * Settings for the Kafka compatibility layer. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180418")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = KafkaSettings.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class KafkaSettings extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "bootstrapServers",
        "autoCreateTopicsEnable",
        "logRetentionHours",
        "numPartitions"
    })
    public KafkaSettings(
            String bootstrapServers,
            Boolean autoCreateTopicsEnable,
            Integer logRetentionHours,
            Integer numPartitions) {
        super();
        this.bootstrapServers = bootstrapServers;
        this.autoCreateTopicsEnable = autoCreateTopicsEnable;
        this.logRetentionHours = logRetentionHours;
        this.numPartitions = numPartitions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Bootstrap servers. */
        @com.fasterxml.jackson.annotation.JsonProperty("bootstrapServers")
        private String bootstrapServers;

        /**
         * Bootstrap servers.
         *
         * @param bootstrapServers the value to set
         * @return this builder
         */
        public Builder bootstrapServers(String bootstrapServers) {
            this.bootstrapServers = bootstrapServers;
            this.__explicitlySet__.add("bootstrapServers");
            return this;
        }
        /** Enable auto creation of topic on the server. */
        @com.fasterxml.jackson.annotation.JsonProperty("autoCreateTopicsEnable")
        private Boolean autoCreateTopicsEnable;

        /**
         * Enable auto creation of topic on the server.
         *
         * @param autoCreateTopicsEnable the value to set
         * @return this builder
         */
        public Builder autoCreateTopicsEnable(Boolean autoCreateTopicsEnable) {
            this.autoCreateTopicsEnable = autoCreateTopicsEnable;
            this.__explicitlySet__.add("autoCreateTopicsEnable");
            return this;
        }
        /** The number of hours to keep a log file before deleting it (in hours). */
        @com.fasterxml.jackson.annotation.JsonProperty("logRetentionHours")
        private Integer logRetentionHours;

        /**
         * The number of hours to keep a log file before deleting it (in hours).
         *
         * @param logRetentionHours the value to set
         * @return this builder
         */
        public Builder logRetentionHours(Integer logRetentionHours) {
            this.logRetentionHours = logRetentionHours;
            this.__explicitlySet__.add("logRetentionHours");
            return this;
        }
        /** The default number of log partitions per topic. */
        @com.fasterxml.jackson.annotation.JsonProperty("numPartitions")
        private Integer numPartitions;

        /**
         * The default number of log partitions per topic.
         *
         * @param numPartitions the value to set
         * @return this builder
         */
        public Builder numPartitions(Integer numPartitions) {
            this.numPartitions = numPartitions;
            this.__explicitlySet__.add("numPartitions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public KafkaSettings build() {
            KafkaSettings model =
                    new KafkaSettings(
                            this.bootstrapServers,
                            this.autoCreateTopicsEnable,
                            this.logRetentionHours,
                            this.numPartitions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(KafkaSettings model) {
            if (model.wasPropertyExplicitlySet("bootstrapServers")) {
                this.bootstrapServers(model.getBootstrapServers());
            }
            if (model.wasPropertyExplicitlySet("autoCreateTopicsEnable")) {
                this.autoCreateTopicsEnable(model.getAutoCreateTopicsEnable());
            }
            if (model.wasPropertyExplicitlySet("logRetentionHours")) {
                this.logRetentionHours(model.getLogRetentionHours());
            }
            if (model.wasPropertyExplicitlySet("numPartitions")) {
                this.numPartitions(model.getNumPartitions());
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

    /** Bootstrap servers. */
    @com.fasterxml.jackson.annotation.JsonProperty("bootstrapServers")
    private final String bootstrapServers;

    /**
     * Bootstrap servers.
     *
     * @return the value
     */
    public String getBootstrapServers() {
        return bootstrapServers;
    }

    /** Enable auto creation of topic on the server. */
    @com.fasterxml.jackson.annotation.JsonProperty("autoCreateTopicsEnable")
    private final Boolean autoCreateTopicsEnable;

    /**
     * Enable auto creation of topic on the server.
     *
     * @return the value
     */
    public Boolean getAutoCreateTopicsEnable() {
        return autoCreateTopicsEnable;
    }

    /** The number of hours to keep a log file before deleting it (in hours). */
    @com.fasterxml.jackson.annotation.JsonProperty("logRetentionHours")
    private final Integer logRetentionHours;

    /**
     * The number of hours to keep a log file before deleting it (in hours).
     *
     * @return the value
     */
    public Integer getLogRetentionHours() {
        return logRetentionHours;
    }

    /** The default number of log partitions per topic. */
    @com.fasterxml.jackson.annotation.JsonProperty("numPartitions")
    private final Integer numPartitions;

    /**
     * The default number of log partitions per topic.
     *
     * @return the value
     */
    public Integer getNumPartitions() {
        return numPartitions;
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
        sb.append("KafkaSettings(");
        sb.append("super=").append(super.toString());
        sb.append("bootstrapServers=").append(String.valueOf(this.bootstrapServers));
        sb.append(", autoCreateTopicsEnable=").append(String.valueOf(this.autoCreateTopicsEnable));
        sb.append(", logRetentionHours=").append(String.valueOf(this.logRetentionHours));
        sb.append(", numPartitions=").append(String.valueOf(this.numPartitions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof KafkaSettings)) {
            return false;
        }

        KafkaSettings other = (KafkaSettings) o;
        return java.util.Objects.equals(this.bootstrapServers, other.bootstrapServers)
                && java.util.Objects.equals(
                        this.autoCreateTopicsEnable, other.autoCreateTopicsEnable)
                && java.util.Objects.equals(this.logRetentionHours, other.logRetentionHours)
                && java.util.Objects.equals(this.numPartitions, other.numPartitions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.bootstrapServers == null ? 43 : this.bootstrapServers.hashCode());
        result =
                (result * PRIME)
                        + (this.autoCreateTopicsEnable == null
                                ? 43
                                : this.autoCreateTopicsEnable.hashCode());
        result =
                (result * PRIME)
                        + (this.logRetentionHours == null ? 43 : this.logRetentionHours.hashCode());
        result =
                (result * PRIME)
                        + (this.numPartitions == null ? 43 : this.numPartitions.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
