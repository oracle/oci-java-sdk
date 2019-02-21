/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.streaming.model;

/**
 * Object used to create a stream.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateStreamDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class CreateStreamDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("partitions")
        private Integer partitions;

        public Builder partitions(Integer partitions) {
            this.partitions = partitions;
            this.__explicitlySet__.add("partitions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("retentionInHours")
        private Integer retentionInHours;

        public Builder retentionInHours(Integer retentionInHours) {
            this.retentionInHours = retentionInHours;
            this.__explicitlySet__.add("retentionInHours");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateStreamDetails build() {
            CreateStreamDetails __instance__ =
                    new CreateStreamDetails(
                            name,
                            partitions,
                            compartmentId,
                            retentionInHours,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateStreamDetails o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .partitions(o.getPartitions())
                            .compartmentId(o.getCompartmentId())
                            .retentionInHours(o.getRetentionInHours())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags());

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
     * The name of the stream. Avoid entering confidential information.
     * <p>
     * Example: `TelemetryEvents`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * The number of partitions in the stream.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("partitions")
    Integer partitions;

    /**
     * The OCID of the compartment that contains the stream.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The retention period of the stream, in hours. Accepted values are between 24 and 168 (7 days).
     * If not specified, the stream will have a retention period of 24 hours.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("retentionInHours")
    Integer retentionInHours;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair that is applied with no predefined name, type, or namespace. Exists for cross-compatibility only.
     * For more information, see [Resource Tags](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: `{\"Department\": \"Finance\"}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: `{\"Operations\": {\"CostCenter\": \"42\"}}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
