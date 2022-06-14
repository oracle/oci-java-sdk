/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LogAnalyticsEntityTopologyLink.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class LogAnalyticsEntityTopologyLink {
    @Deprecated
    @java.beans.ConstructorProperties({"sourceEntityId", "destinationEntityId"})
    public LogAnalyticsEntityTopologyLink(String sourceEntityId, String destinationEntityId) {
        super();
        this.sourceEntityId = sourceEntityId;
        this.destinationEntityId = destinationEntityId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The log analytics entity OCID. This ID is a reference used by log analytics features and it represents
         * a resource that is provisioned and managed by the customer on their premises or on the cloud.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sourceEntityId")
        private String sourceEntityId;

        /**
         * The log analytics entity OCID. This ID is a reference used by log analytics features and it represents
         * a resource that is provisioned and managed by the customer on their premises or on the cloud.
         *
         * @param sourceEntityId the value to set
         * @return this builder
         **/
        public Builder sourceEntityId(String sourceEntityId) {
            this.sourceEntityId = sourceEntityId;
            this.__explicitlySet__.add("sourceEntityId");
            return this;
        }
        /**
         * The log analytics entity OCID. This ID is a reference used by log analytics features and it represents
         * a resource that is provisioned and managed by the customer on their premises or on the cloud.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("destinationEntityId")
        private String destinationEntityId;

        /**
         * The log analytics entity OCID. This ID is a reference used by log analytics features and it represents
         * a resource that is provisioned and managed by the customer on their premises or on the cloud.
         *
         * @param destinationEntityId the value to set
         * @return this builder
         **/
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The log analytics entity OCID. This ID is a reference used by log analytics features and it represents
     * a resource that is provisioned and managed by the customer on their premises or on the cloud.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceEntityId")
    private final String sourceEntityId;

    /**
     * The log analytics entity OCID. This ID is a reference used by log analytics features and it represents
     * a resource that is provisioned and managed by the customer on their premises or on the cloud.
     *
     * @return the value
     **/
    public String getSourceEntityId() {
        return sourceEntityId;
    }

    /**
     * The log analytics entity OCID. This ID is a reference used by log analytics features and it represents
     * a resource that is provisioned and managed by the customer on their premises or on the cloud.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationEntityId")
    private final String destinationEntityId;

    /**
     * The log analytics entity OCID. This ID is a reference used by log analytics features and it represents
     * a resource that is provisioned and managed by the customer on their premises or on the cloud.
     *
     * @return the value
     **/
    public String getDestinationEntityId() {
        return destinationEntityId;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("LogAnalyticsEntityTopologyLink(");
        sb.append("sourceEntityId=").append(String.valueOf(this.sourceEntityId));
        sb.append(", destinationEntityId=").append(String.valueOf(this.destinationEntityId));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LogAnalyticsEntityTopologyLink)) {
            return false;
        }

        LogAnalyticsEntityTopologyLink other = (LogAnalyticsEntityTopologyLink) o;
        return java.util.Objects.equals(this.sourceEntityId, other.sourceEntityId)
                && java.util.Objects.equals(this.destinationEntityId, other.destinationEntityId)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.sourceEntityId == null ? 43 : this.sourceEntityId.hashCode());
        result =
                (result * PRIME)
                        + (this.destinationEntityId == null
                                ? 43
                                : this.destinationEntityId.hashCode());
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
