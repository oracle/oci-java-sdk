/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.streaming.model;

/**
 * Settings for the Kafka compatibility layer.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180418")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = KafkaSettings.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class KafkaSettings {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("bootstrapServers")
        private String bootstrapServers;

        public Builder bootstrapServers(String bootstrapServers) {
            this.bootstrapServers = bootstrapServers;
            this.__explicitlySet__.add("bootstrapServers");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("autoCreateTopicsEnable")
        private Boolean autoCreateTopicsEnable;

        public Builder autoCreateTopicsEnable(Boolean autoCreateTopicsEnable) {
            this.autoCreateTopicsEnable = autoCreateTopicsEnable;
            this.__explicitlySet__.add("autoCreateTopicsEnable");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("logRetentionHours")
        private Integer logRetentionHours;

        public Builder logRetentionHours(Integer logRetentionHours) {
            this.logRetentionHours = logRetentionHours;
            this.__explicitlySet__.add("logRetentionHours");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("numPartitions")
        private Integer numPartitions;

        public Builder numPartitions(Integer numPartitions) {
            this.numPartitions = numPartitions;
            this.__explicitlySet__.add("numPartitions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public KafkaSettings build() {
            KafkaSettings __instance__ =
                    new KafkaSettings(
                            bootstrapServers,
                            autoCreateTopicsEnable,
                            logRetentionHours,
                            numPartitions);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(KafkaSettings o) {
            Builder copiedBuilder =
                    bootstrapServers(o.getBootstrapServers())
                            .autoCreateTopicsEnable(o.getAutoCreateTopicsEnable())
                            .logRetentionHours(o.getLogRetentionHours())
                            .numPartitions(o.getNumPartitions());

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

    /**
     * Bootstrap servers.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bootstrapServers")
    String bootstrapServers;

    /**
     * Enable auto creation of topic on the server.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("autoCreateTopicsEnable")
    Boolean autoCreateTopicsEnable;

    /**
     * The number of hours to keep a log file before deleting it (in hours).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("logRetentionHours")
    Integer logRetentionHours;

    /**
     * The default number of log partitions per topic.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("numPartitions")
    Integer numPartitions;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
