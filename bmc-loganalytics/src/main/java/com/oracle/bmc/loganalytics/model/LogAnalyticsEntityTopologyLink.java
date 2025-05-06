/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Log Analytics entity relationship link used in hierarchical representation of entity
 * relationships topology. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = LogAnalyticsEntityTopologyLink.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class LogAnalyticsEntityTopologyLink
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "sourceEntityId",
        "destinationEntityId",
        "contexts",
        "timeLastDiscovered"
    })
    public LogAnalyticsEntityTopologyLink(
            String sourceEntityId,
            String destinationEntityId,
            java.util.List<String> contexts,
            java.util.Date timeLastDiscovered) {
        super();
        this.sourceEntityId = sourceEntityId;
        this.destinationEntityId = destinationEntityId;
        this.contexts = contexts;
        this.timeLastDiscovered = timeLastDiscovered;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The log analytics entity OCID. This ID is a reference used by log analytics features and
         * it represents a resource that is provisioned and managed by the customer on their
         * premises or on the cloud.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceEntityId")
        private String sourceEntityId;

        /**
         * The log analytics entity OCID. This ID is a reference used by log analytics features and
         * it represents a resource that is provisioned and managed by the customer on their
         * premises or on the cloud.
         *
         * @param sourceEntityId the value to set
         * @return this builder
         */
        public Builder sourceEntityId(String sourceEntityId) {
            this.sourceEntityId = sourceEntityId;
            this.__explicitlySet__.add("sourceEntityId");
            return this;
        }
        /**
         * The log analytics entity OCID. This ID is a reference used by log analytics features and
         * it represents a resource that is provisioned and managed by the customer on their
         * premises or on the cloud.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("destinationEntityId")
        private String destinationEntityId;

        /**
         * The log analytics entity OCID. This ID is a reference used by log analytics features and
         * it represents a resource that is provisioned and managed by the customer on their
         * premises or on the cloud.
         *
         * @param destinationEntityId the value to set
         * @return this builder
         */
        public Builder destinationEntityId(String destinationEntityId) {
            this.destinationEntityId = destinationEntityId;
            this.__explicitlySet__.add("destinationEntityId");
            return this;
        }
        /** Array of log analytics entity relationship context. */
        @com.fasterxml.jackson.annotation.JsonProperty("contexts")
        private java.util.List<String> contexts;

        /**
         * Array of log analytics entity relationship context.
         *
         * @param contexts the value to set
         * @return this builder
         */
        public Builder contexts(java.util.List<String> contexts) {
            this.contexts = contexts;
            this.__explicitlySet__.add("contexts");
            return this;
        }
        /** The date and time the resource was last discovered, in the format defined by RFC3339. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastDiscovered")
        private java.util.Date timeLastDiscovered;

        /**
         * The date and time the resource was last discovered, in the format defined by RFC3339.
         *
         * @param timeLastDiscovered the value to set
         * @return this builder
         */
        public Builder timeLastDiscovered(java.util.Date timeLastDiscovered) {
            this.timeLastDiscovered = timeLastDiscovered;
            this.__explicitlySet__.add("timeLastDiscovered");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsEntityTopologyLink build() {
            LogAnalyticsEntityTopologyLink model =
                    new LogAnalyticsEntityTopologyLink(
                            this.sourceEntityId,
                            this.destinationEntityId,
                            this.contexts,
                            this.timeLastDiscovered);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsEntityTopologyLink model) {
            if (model.wasPropertyExplicitlySet("sourceEntityId")) {
                this.sourceEntityId(model.getSourceEntityId());
            }
            if (model.wasPropertyExplicitlySet("destinationEntityId")) {
                this.destinationEntityId(model.getDestinationEntityId());
            }
            if (model.wasPropertyExplicitlySet("contexts")) {
                this.contexts(model.getContexts());
            }
            if (model.wasPropertyExplicitlySet("timeLastDiscovered")) {
                this.timeLastDiscovered(model.getTimeLastDiscovered());
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

    /**
     * The log analytics entity OCID. This ID is a reference used by log analytics features and it
     * represents a resource that is provisioned and managed by the customer on their premises or on
     * the cloud.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceEntityId")
    private final String sourceEntityId;

    /**
     * The log analytics entity OCID. This ID is a reference used by log analytics features and it
     * represents a resource that is provisioned and managed by the customer on their premises or on
     * the cloud.
     *
     * @return the value
     */
    public String getSourceEntityId() {
        return sourceEntityId;
    }

    /**
     * The log analytics entity OCID. This ID is a reference used by log analytics features and it
     * represents a resource that is provisioned and managed by the customer on their premises or on
     * the cloud.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("destinationEntityId")
    private final String destinationEntityId;

    /**
     * The log analytics entity OCID. This ID is a reference used by log analytics features and it
     * represents a resource that is provisioned and managed by the customer on their premises or on
     * the cloud.
     *
     * @return the value
     */
    public String getDestinationEntityId() {
        return destinationEntityId;
    }

    /** Array of log analytics entity relationship context. */
    @com.fasterxml.jackson.annotation.JsonProperty("contexts")
    private final java.util.List<String> contexts;

    /**
     * Array of log analytics entity relationship context.
     *
     * @return the value
     */
    public java.util.List<String> getContexts() {
        return contexts;
    }

    /** The date and time the resource was last discovered, in the format defined by RFC3339. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastDiscovered")
    private final java.util.Date timeLastDiscovered;

    /**
     * The date and time the resource was last discovered, in the format defined by RFC3339.
     *
     * @return the value
     */
    public java.util.Date getTimeLastDiscovered() {
        return timeLastDiscovered;
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
        sb.append("LogAnalyticsEntityTopologyLink(");
        sb.append("super=").append(super.toString());
        sb.append("sourceEntityId=").append(String.valueOf(this.sourceEntityId));
        sb.append(", destinationEntityId=").append(String.valueOf(this.destinationEntityId));
        sb.append(", contexts=").append(String.valueOf(this.contexts));
        sb.append(", timeLastDiscovered=").append(String.valueOf(this.timeLastDiscovered));
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
                && java.util.Objects.equals(this.contexts, other.contexts)
                && java.util.Objects.equals(this.timeLastDiscovered, other.timeLastDiscovered)
                && super.equals(other);
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
        result = (result * PRIME) + (this.contexts == null ? 43 : this.contexts.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastDiscovered == null
                                ? 43
                                : this.timeLastDiscovered.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
