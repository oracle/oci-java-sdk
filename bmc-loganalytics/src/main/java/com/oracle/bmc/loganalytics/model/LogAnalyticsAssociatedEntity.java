/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * LogAnalyticsAssociatedEntity <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = LogAnalyticsAssociatedEntity.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class LogAnalyticsAssociatedEntity
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "entityId",
        "entityName",
        "entityType",
        "entityTypeDisplayName",
        "onHost",
        "associationCount"
    })
    public LogAnalyticsAssociatedEntity(
            String entityId,
            String entityName,
            String entityType,
            String entityTypeDisplayName,
            String onHost,
            Long associationCount) {
        super();
        this.entityId = entityId;
        this.entityName = entityName;
        this.entityType = entityType;
        this.entityTypeDisplayName = entityTypeDisplayName;
        this.onHost = onHost;
        this.associationCount = associationCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
        /** The entity name. */
        @com.fasterxml.jackson.annotation.JsonProperty("entityName")
        private String entityName;

        /**
         * The entity name.
         *
         * @param entityName the value to set
         * @return this builder
         */
        public Builder entityName(String entityName) {
            this.entityName = entityName;
            this.__explicitlySet__.add("entityName");
            return this;
        }
        /** The entity type. */
        @com.fasterxml.jackson.annotation.JsonProperty("entityType")
        private String entityType;

        /**
         * The entity type.
         *
         * @param entityType the value to set
         * @return this builder
         */
        public Builder entityType(String entityType) {
            this.entityType = entityType;
            this.__explicitlySet__.add("entityType");
            return this;
        }
        /** The entity type display name. */
        @com.fasterxml.jackson.annotation.JsonProperty("entityTypeDisplayName")
        private String entityTypeDisplayName;

        /**
         * The entity type display name.
         *
         * @param entityTypeDisplayName the value to set
         * @return this builder
         */
        public Builder entityTypeDisplayName(String entityTypeDisplayName) {
            this.entityTypeDisplayName = entityTypeDisplayName;
            this.__explicitlySet__.add("entityTypeDisplayName");
            return this;
        }
        /** The host associated with the entity. */
        @com.fasterxml.jackson.annotation.JsonProperty("onHost")
        private String onHost;

        /**
         * The host associated with the entity.
         *
         * @param onHost the value to set
         * @return this builder
         */
        public Builder onHost(String onHost) {
            this.onHost = onHost;
            this.__explicitlySet__.add("onHost");
            return this;
        }
        /** The association count for the entity. */
        @com.fasterxml.jackson.annotation.JsonProperty("associationCount")
        private Long associationCount;

        /**
         * The association count for the entity.
         *
         * @param associationCount the value to set
         * @return this builder
         */
        public Builder associationCount(Long associationCount) {
            this.associationCount = associationCount;
            this.__explicitlySet__.add("associationCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsAssociatedEntity build() {
            LogAnalyticsAssociatedEntity model =
                    new LogAnalyticsAssociatedEntity(
                            this.entityId,
                            this.entityName,
                            this.entityType,
                            this.entityTypeDisplayName,
                            this.onHost,
                            this.associationCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsAssociatedEntity model) {
            if (model.wasPropertyExplicitlySet("entityId")) {
                this.entityId(model.getEntityId());
            }
            if (model.wasPropertyExplicitlySet("entityName")) {
                this.entityName(model.getEntityName());
            }
            if (model.wasPropertyExplicitlySet("entityType")) {
                this.entityType(model.getEntityType());
            }
            if (model.wasPropertyExplicitlySet("entityTypeDisplayName")) {
                this.entityTypeDisplayName(model.getEntityTypeDisplayName());
            }
            if (model.wasPropertyExplicitlySet("onHost")) {
                this.onHost(model.getOnHost());
            }
            if (model.wasPropertyExplicitlySet("associationCount")) {
                this.associationCount(model.getAssociationCount());
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

    /** The entity name. */
    @com.fasterxml.jackson.annotation.JsonProperty("entityName")
    private final String entityName;

    /**
     * The entity name.
     *
     * @return the value
     */
    public String getEntityName() {
        return entityName;
    }

    /** The entity type. */
    @com.fasterxml.jackson.annotation.JsonProperty("entityType")
    private final String entityType;

    /**
     * The entity type.
     *
     * @return the value
     */
    public String getEntityType() {
        return entityType;
    }

    /** The entity type display name. */
    @com.fasterxml.jackson.annotation.JsonProperty("entityTypeDisplayName")
    private final String entityTypeDisplayName;

    /**
     * The entity type display name.
     *
     * @return the value
     */
    public String getEntityTypeDisplayName() {
        return entityTypeDisplayName;
    }

    /** The host associated with the entity. */
    @com.fasterxml.jackson.annotation.JsonProperty("onHost")
    private final String onHost;

    /**
     * The host associated with the entity.
     *
     * @return the value
     */
    public String getOnHost() {
        return onHost;
    }

    /** The association count for the entity. */
    @com.fasterxml.jackson.annotation.JsonProperty("associationCount")
    private final Long associationCount;

    /**
     * The association count for the entity.
     *
     * @return the value
     */
    public Long getAssociationCount() {
        return associationCount;
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
        sb.append("LogAnalyticsAssociatedEntity(");
        sb.append("super=").append(super.toString());
        sb.append("entityId=").append(String.valueOf(this.entityId));
        sb.append(", entityName=").append(String.valueOf(this.entityName));
        sb.append(", entityType=").append(String.valueOf(this.entityType));
        sb.append(", entityTypeDisplayName=").append(String.valueOf(this.entityTypeDisplayName));
        sb.append(", onHost=").append(String.valueOf(this.onHost));
        sb.append(", associationCount=").append(String.valueOf(this.associationCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LogAnalyticsAssociatedEntity)) {
            return false;
        }

        LogAnalyticsAssociatedEntity other = (LogAnalyticsAssociatedEntity) o;
        return java.util.Objects.equals(this.entityId, other.entityId)
                && java.util.Objects.equals(this.entityName, other.entityName)
                && java.util.Objects.equals(this.entityType, other.entityType)
                && java.util.Objects.equals(this.entityTypeDisplayName, other.entityTypeDisplayName)
                && java.util.Objects.equals(this.onHost, other.onHost)
                && java.util.Objects.equals(this.associationCount, other.associationCount)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.entityId == null ? 43 : this.entityId.hashCode());
        result = (result * PRIME) + (this.entityName == null ? 43 : this.entityName.hashCode());
        result = (result * PRIME) + (this.entityType == null ? 43 : this.entityType.hashCode());
        result =
                (result * PRIME)
                        + (this.entityTypeDisplayName == null
                                ? 43
                                : this.entityTypeDisplayName.hashCode());
        result = (result * PRIME) + (this.onHost == null ? 43 : this.onHost.hashCode());
        result =
                (result * PRIME)
                        + (this.associationCount == null ? 43 : this.associationCount.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
