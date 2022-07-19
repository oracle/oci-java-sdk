/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * LogAnalyticsSourceEntityType
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
    builder = LogAnalyticsSourceEntityType.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class LogAnalyticsSourceEntityType {
    @Deprecated
    @java.beans.ConstructorProperties({
        "sourceId",
        "entityType",
        "entityTypeCategory",
        "entityTypeDisplayName"
    })
    public LogAnalyticsSourceEntityType(
            Long sourceId,
            String entityType,
            String entityTypeCategory,
            String entityTypeDisplayName) {
        super();
        this.sourceId = sourceId;
        this.entityType = entityType;
        this.entityTypeCategory = entityTypeCategory;
        this.entityTypeDisplayName = entityTypeDisplayName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The source unique identifier.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
        private Long sourceId;

        /**
         * The source unique identifier.
         * @param sourceId the value to set
         * @return this builder
         **/
        public Builder sourceId(Long sourceId) {
            this.sourceId = sourceId;
            this.__explicitlySet__.add("sourceId");
            return this;
        }
        /**
         * The entity type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("entityType")
        private String entityType;

        /**
         * The entity type.
         * @param entityType the value to set
         * @return this builder
         **/
        public Builder entityType(String entityType) {
            this.entityType = entityType;
            this.__explicitlySet__.add("entityType");
            return this;
        }
        /**
         * The type category.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("entityTypeCategory")
        private String entityTypeCategory;

        /**
         * The type category.
         * @param entityTypeCategory the value to set
         * @return this builder
         **/
        public Builder entityTypeCategory(String entityTypeCategory) {
            this.entityTypeCategory = entityTypeCategory;
            this.__explicitlySet__.add("entityTypeCategory");
            return this;
        }
        /**
         * The entity type display name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("entityTypeDisplayName")
        private String entityTypeDisplayName;

        /**
         * The entity type display name.
         * @param entityTypeDisplayName the value to set
         * @return this builder
         **/
        public Builder entityTypeDisplayName(String entityTypeDisplayName) {
            this.entityTypeDisplayName = entityTypeDisplayName;
            this.__explicitlySet__.add("entityTypeDisplayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsSourceEntityType build() {
            LogAnalyticsSourceEntityType __instance__ =
                    new LogAnalyticsSourceEntityType(
                            sourceId, entityType, entityTypeCategory, entityTypeDisplayName);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsSourceEntityType o) {
            Builder copiedBuilder =
                    sourceId(o.getSourceId())
                            .entityType(o.getEntityType())
                            .entityTypeCategory(o.getEntityTypeCategory())
                            .entityTypeDisplayName(o.getEntityTypeDisplayName());

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
     * The source unique identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
    private final Long sourceId;

    /**
     * The source unique identifier.
     * @return the value
     **/
    public Long getSourceId() {
        return sourceId;
    }

    /**
     * The entity type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityType")
    private final String entityType;

    /**
     * The entity type.
     * @return the value
     **/
    public String getEntityType() {
        return entityType;
    }

    /**
     * The type category.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityTypeCategory")
    private final String entityTypeCategory;

    /**
     * The type category.
     * @return the value
     **/
    public String getEntityTypeCategory() {
        return entityTypeCategory;
    }

    /**
     * The entity type display name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityTypeDisplayName")
    private final String entityTypeDisplayName;

    /**
     * The entity type display name.
     * @return the value
     **/
    public String getEntityTypeDisplayName() {
        return entityTypeDisplayName;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("LogAnalyticsSourceEntityType(");
        sb.append("sourceId=").append(String.valueOf(this.sourceId));
        sb.append(", entityType=").append(String.valueOf(this.entityType));
        sb.append(", entityTypeCategory=").append(String.valueOf(this.entityTypeCategory));
        sb.append(", entityTypeDisplayName=").append(String.valueOf(this.entityTypeDisplayName));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LogAnalyticsSourceEntityType)) {
            return false;
        }

        LogAnalyticsSourceEntityType other = (LogAnalyticsSourceEntityType) o;
        return java.util.Objects.equals(this.sourceId, other.sourceId)
                && java.util.Objects.equals(this.entityType, other.entityType)
                && java.util.Objects.equals(this.entityTypeCategory, other.entityTypeCategory)
                && java.util.Objects.equals(this.entityTypeDisplayName, other.entityTypeDisplayName)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.sourceId == null ? 43 : this.sourceId.hashCode());
        result = (result * PRIME) + (this.entityType == null ? 43 : this.entityType.hashCode());
        result =
                (result * PRIME)
                        + (this.entityTypeCategory == null
                                ? 43
                                : this.entityTypeCategory.hashCode());
        result =
                (result * PRIME)
                        + (this.entityTypeDisplayName == null
                                ? 43
                                : this.entityTypeDisplayName.hashCode());
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
