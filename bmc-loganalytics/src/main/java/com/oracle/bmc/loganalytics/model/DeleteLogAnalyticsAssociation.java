/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * DeleteLogAnalyticsAssociation <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DeleteLogAnalyticsAssociation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class DeleteLogAnalyticsAssociation
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "agentId",
        "sourceName",
        "sourceTypeName",
        "entityId",
        "entityTypeName",
        "host",
        "logGroupId"
    })
    public DeleteLogAnalyticsAssociation(
            String agentId,
            String sourceName,
            String sourceTypeName,
            String entityId,
            String entityTypeName,
            String host,
            String logGroupId) {
        super();
        this.agentId = agentId;
        this.sourceName = sourceName;
        this.sourceTypeName = sourceTypeName;
        this.entityId = entityId;
        this.entityTypeName = entityTypeName;
        this.host = host;
        this.logGroupId = logGroupId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The agent unique identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("agentId")
        private String agentId;

        /**
         * The agent unique identifier.
         *
         * @param agentId the value to set
         * @return this builder
         */
        public Builder agentId(String agentId) {
            this.agentId = agentId;
            this.__explicitlySet__.add("agentId");
            return this;
        }
        /** The source name. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceName")
        private String sourceName;

        /**
         * The source name.
         *
         * @param sourceName the value to set
         * @return this builder
         */
        public Builder sourceName(String sourceName) {
            this.sourceName = sourceName;
            this.__explicitlySet__.add("sourceName");
            return this;
        }
        /** The source type internal name. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceTypeName")
        private String sourceTypeName;

        /**
         * The source type internal name.
         *
         * @param sourceTypeName the value to set
         * @return this builder
         */
        public Builder sourceTypeName(String sourceTypeName) {
            this.sourceTypeName = sourceTypeName;
            this.__explicitlySet__.add("sourceTypeName");
            return this;
        }
        /** The entity unique identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("entityId")
        private String entityId;

        /**
         * The entity unique identifier.
         *
         * @param entityId the value to set
         * @return this builder
         */
        public Builder entityId(String entityId) {
            this.entityId = entityId;
            this.__explicitlySet__.add("entityId");
            return this;
        }
        /** The entity type internal name. */
        @com.fasterxml.jackson.annotation.JsonProperty("entityTypeName")
        private String entityTypeName;

        /**
         * The entity type internal name.
         *
         * @param entityTypeName the value to set
         * @return this builder
         */
        public Builder entityTypeName(String entityTypeName) {
            this.entityTypeName = entityTypeName;
            this.__explicitlySet__.add("entityTypeName");
            return this;
        }
        /** The host name. */
        @com.fasterxml.jackson.annotation.JsonProperty("host")
        private String host;

        /**
         * The host name.
         *
         * @param host the value to set
         * @return this builder
         */
        public Builder host(String host) {
            this.host = host;
            this.__explicitlySet__.add("host");
            return this;
        }
        /** The log group unique identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("logGroupId")
        private String logGroupId;

        /**
         * The log group unique identifier.
         *
         * @param logGroupId the value to set
         * @return this builder
         */
        public Builder logGroupId(String logGroupId) {
            this.logGroupId = logGroupId;
            this.__explicitlySet__.add("logGroupId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DeleteLogAnalyticsAssociation build() {
            DeleteLogAnalyticsAssociation model =
                    new DeleteLogAnalyticsAssociation(
                            this.agentId,
                            this.sourceName,
                            this.sourceTypeName,
                            this.entityId,
                            this.entityTypeName,
                            this.host,
                            this.logGroupId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DeleteLogAnalyticsAssociation model) {
            if (model.wasPropertyExplicitlySet("agentId")) {
                this.agentId(model.getAgentId());
            }
            if (model.wasPropertyExplicitlySet("sourceName")) {
                this.sourceName(model.getSourceName());
            }
            if (model.wasPropertyExplicitlySet("sourceTypeName")) {
                this.sourceTypeName(model.getSourceTypeName());
            }
            if (model.wasPropertyExplicitlySet("entityId")) {
                this.entityId(model.getEntityId());
            }
            if (model.wasPropertyExplicitlySet("entityTypeName")) {
                this.entityTypeName(model.getEntityTypeName());
            }
            if (model.wasPropertyExplicitlySet("host")) {
                this.host(model.getHost());
            }
            if (model.wasPropertyExplicitlySet("logGroupId")) {
                this.logGroupId(model.getLogGroupId());
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

    /** The agent unique identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("agentId")
    private final String agentId;

    /**
     * The agent unique identifier.
     *
     * @return the value
     */
    public String getAgentId() {
        return agentId;
    }

    /** The source name. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceName")
    private final String sourceName;

    /**
     * The source name.
     *
     * @return the value
     */
    public String getSourceName() {
        return sourceName;
    }

    /** The source type internal name. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceTypeName")
    private final String sourceTypeName;

    /**
     * The source type internal name.
     *
     * @return the value
     */
    public String getSourceTypeName() {
        return sourceTypeName;
    }

    /** The entity unique identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("entityId")
    private final String entityId;

    /**
     * The entity unique identifier.
     *
     * @return the value
     */
    public String getEntityId() {
        return entityId;
    }

    /** The entity type internal name. */
    @com.fasterxml.jackson.annotation.JsonProperty("entityTypeName")
    private final String entityTypeName;

    /**
     * The entity type internal name.
     *
     * @return the value
     */
    public String getEntityTypeName() {
        return entityTypeName;
    }

    /** The host name. */
    @com.fasterxml.jackson.annotation.JsonProperty("host")
    private final String host;

    /**
     * The host name.
     *
     * @return the value
     */
    public String getHost() {
        return host;
    }

    /** The log group unique identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("logGroupId")
    private final String logGroupId;

    /**
     * The log group unique identifier.
     *
     * @return the value
     */
    public String getLogGroupId() {
        return logGroupId;
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
        sb.append("DeleteLogAnalyticsAssociation(");
        sb.append("super=").append(super.toString());
        sb.append("agentId=").append(String.valueOf(this.agentId));
        sb.append(", sourceName=").append(String.valueOf(this.sourceName));
        sb.append(", sourceTypeName=").append(String.valueOf(this.sourceTypeName));
        sb.append(", entityId=").append(String.valueOf(this.entityId));
        sb.append(", entityTypeName=").append(String.valueOf(this.entityTypeName));
        sb.append(", host=").append(String.valueOf(this.host));
        sb.append(", logGroupId=").append(String.valueOf(this.logGroupId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeleteLogAnalyticsAssociation)) {
            return false;
        }

        DeleteLogAnalyticsAssociation other = (DeleteLogAnalyticsAssociation) o;
        return java.util.Objects.equals(this.agentId, other.agentId)
                && java.util.Objects.equals(this.sourceName, other.sourceName)
                && java.util.Objects.equals(this.sourceTypeName, other.sourceTypeName)
                && java.util.Objects.equals(this.entityId, other.entityId)
                && java.util.Objects.equals(this.entityTypeName, other.entityTypeName)
                && java.util.Objects.equals(this.host, other.host)
                && java.util.Objects.equals(this.logGroupId, other.logGroupId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.agentId == null ? 43 : this.agentId.hashCode());
        result = (result * PRIME) + (this.sourceName == null ? 43 : this.sourceName.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceTypeName == null ? 43 : this.sourceTypeName.hashCode());
        result = (result * PRIME) + (this.entityId == null ? 43 : this.entityId.hashCode());
        result =
                (result * PRIME)
                        + (this.entityTypeName == null ? 43 : this.entityTypeName.hashCode());
        result = (result * PRIME) + (this.host == null ? 43 : this.host.hashCode());
        result = (result * PRIME) + (this.logGroupId == null ? 43 : this.logGroupId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
