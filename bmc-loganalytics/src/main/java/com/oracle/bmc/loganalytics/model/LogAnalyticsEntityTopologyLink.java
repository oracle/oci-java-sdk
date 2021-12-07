/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Log Analytics entity relationship link used in hierarchical representation of entity relationships topology.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LogAnalyticsEntityTopologyLink.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class LogAnalyticsEntityTopologyLink {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("sourceEntityId")
        private String sourceEntityId;

        public Builder sourceEntityId(String sourceEntityId) {
            this.sourceEntityId = sourceEntityId;
            this.__explicitlySet__.add("sourceEntityId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("destinationEntityId")
        private String destinationEntityId;

        public Builder destinationEntityId(String destinationEntityId) {
            this.destinationEntityId = destinationEntityId;
            this.__explicitlySet__.add("destinationEntityId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsEntityTopologyLink build() {
            LogAnalyticsEntityTopologyLink __instance__ =
                    new LogAnalyticsEntityTopologyLink(sourceEntityId, destinationEntityId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsEntityTopologyLink o) {
            Builder copiedBuilder =
                    sourceEntityId(o.getSourceEntityId())
                            .destinationEntityId(o.getDestinationEntityId());

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
     * The log analytics entity OCID. This ID is a reference used by log analytics features and it represents
     * a resource that is provisioned and managed by the customer on their premises or on the cloud.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceEntityId")
    String sourceEntityId;

    /**
     * The log analytics entity OCID. This ID is a reference used by log analytics features and it represents
     * a resource that is provisioned and managed by the customer on their premises or on the cloud.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationEntityId")
    String destinationEntityId;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
