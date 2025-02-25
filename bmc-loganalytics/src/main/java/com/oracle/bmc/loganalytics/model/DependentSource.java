/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * A source that uses the parser, either directly or indirectly.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DependentSource.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DependentSource extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "sourceName",
        "sourceDisplayName",
        "sourceId",
        "sourceType",
        "isSystem",
        "isAutoAssociationEnabled",
        "entityTypes",
        "dependencies"
    })
    public DependentSource(
            String sourceName,
            String sourceDisplayName,
            Long sourceId,
            String sourceType,
            Boolean isSystem,
            Boolean isAutoAssociationEnabled,
            java.util.List<LogAnalyticsSourceEntityType> entityTypes,
            java.util.List<Dependency> dependencies) {
        super();
        this.sourceName = sourceName;
        this.sourceDisplayName = sourceDisplayName;
        this.sourceId = sourceId;
        this.sourceType = sourceType;
        this.isSystem = isSystem;
        this.isAutoAssociationEnabled = isAutoAssociationEnabled;
        this.entityTypes = entityTypes;
        this.dependencies = dependencies;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The source name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sourceName")
        private String sourceName;

        /**
         * The source name.
         * @param sourceName the value to set
         * @return this builder
         **/
        public Builder sourceName(String sourceName) {
            this.sourceName = sourceName;
            this.__explicitlySet__.add("sourceName");
            return this;
        }
        /**
         * The source display name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sourceDisplayName")
        private String sourceDisplayName;

        /**
         * The source display name.
         * @param sourceDisplayName the value to set
         * @return this builder
         **/
        public Builder sourceDisplayName(String sourceDisplayName) {
            this.sourceDisplayName = sourceDisplayName;
            this.__explicitlySet__.add("sourceDisplayName");
            return this;
        }
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
         * The source type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sourceType")
        private String sourceType;

        /**
         * The source type.
         * @param sourceType the value to set
         * @return this builder
         **/
        public Builder sourceType(String sourceType) {
            this.sourceType = sourceType;
            this.__explicitlySet__.add("sourceType");
            return this;
        }
        /**
         * The system flag.  A value of false denotes a custom, or user
         * defined object.  A value of true denotes a built in object.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isSystem")
        private Boolean isSystem;

        /**
         * The system flag.  A value of false denotes a custom, or user
         * defined object.  A value of true denotes a built in object.
         *
         * @param isSystem the value to set
         * @return this builder
         **/
        public Builder isSystem(Boolean isSystem) {
            this.isSystem = isSystem;
            this.__explicitlySet__.add("isSystem");
            return this;
        }
        /**
         * A flag indicating whether or not the source is marked for auto association.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isAutoAssociationEnabled")
        private Boolean isAutoAssociationEnabled;

        /**
         * A flag indicating whether or not the source is marked for auto association.
         *
         * @param isAutoAssociationEnabled the value to set
         * @return this builder
         **/
        public Builder isAutoAssociationEnabled(Boolean isAutoAssociationEnabled) {
            this.isAutoAssociationEnabled = isAutoAssociationEnabled;
            this.__explicitlySet__.add("isAutoAssociationEnabled");
            return this;
        }
        /**
         * The entity types.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("entityTypes")
        private java.util.List<LogAnalyticsSourceEntityType> entityTypes;

        /**
         * The entity types.
         * @param entityTypes the value to set
         * @return this builder
         **/
        public Builder entityTypes(java.util.List<LogAnalyticsSourceEntityType> entityTypes) {
            this.entityTypes = entityTypes;
            this.__explicitlySet__.add("entityTypes");
            return this;
        }
        /**
         * The list of dependencies defined by the source.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dependencies")
        private java.util.List<Dependency> dependencies;

        /**
         * The list of dependencies defined by the source.
         * @param dependencies the value to set
         * @return this builder
         **/
        public Builder dependencies(java.util.List<Dependency> dependencies) {
            this.dependencies = dependencies;
            this.__explicitlySet__.add("dependencies");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DependentSource build() {
            DependentSource model =
                    new DependentSource(
                            this.sourceName,
                            this.sourceDisplayName,
                            this.sourceId,
                            this.sourceType,
                            this.isSystem,
                            this.isAutoAssociationEnabled,
                            this.entityTypes,
                            this.dependencies);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DependentSource model) {
            if (model.wasPropertyExplicitlySet("sourceName")) {
                this.sourceName(model.getSourceName());
            }
            if (model.wasPropertyExplicitlySet("sourceDisplayName")) {
                this.sourceDisplayName(model.getSourceDisplayName());
            }
            if (model.wasPropertyExplicitlySet("sourceId")) {
                this.sourceId(model.getSourceId());
            }
            if (model.wasPropertyExplicitlySet("sourceType")) {
                this.sourceType(model.getSourceType());
            }
            if (model.wasPropertyExplicitlySet("isSystem")) {
                this.isSystem(model.getIsSystem());
            }
            if (model.wasPropertyExplicitlySet("isAutoAssociationEnabled")) {
                this.isAutoAssociationEnabled(model.getIsAutoAssociationEnabled());
            }
            if (model.wasPropertyExplicitlySet("entityTypes")) {
                this.entityTypes(model.getEntityTypes());
            }
            if (model.wasPropertyExplicitlySet("dependencies")) {
                this.dependencies(model.getDependencies());
            }
            return this;
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
     * The source name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceName")
    private final String sourceName;

    /**
     * The source name.
     * @return the value
     **/
    public String getSourceName() {
        return sourceName;
    }

    /**
     * The source display name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceDisplayName")
    private final String sourceDisplayName;

    /**
     * The source display name.
     * @return the value
     **/
    public String getSourceDisplayName() {
        return sourceDisplayName;
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
     * The source type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceType")
    private final String sourceType;

    /**
     * The source type.
     * @return the value
     **/
    public String getSourceType() {
        return sourceType;
    }

    /**
     * The system flag.  A value of false denotes a custom, or user
     * defined object.  A value of true denotes a built in object.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSystem")
    private final Boolean isSystem;

    /**
     * The system flag.  A value of false denotes a custom, or user
     * defined object.  A value of true denotes a built in object.
     *
     * @return the value
     **/
    public Boolean getIsSystem() {
        return isSystem;
    }

    /**
     * A flag indicating whether or not the source is marked for auto association.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoAssociationEnabled")
    private final Boolean isAutoAssociationEnabled;

    /**
     * A flag indicating whether or not the source is marked for auto association.
     *
     * @return the value
     **/
    public Boolean getIsAutoAssociationEnabled() {
        return isAutoAssociationEnabled;
    }

    /**
     * The entity types.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityTypes")
    private final java.util.List<LogAnalyticsSourceEntityType> entityTypes;

    /**
     * The entity types.
     * @return the value
     **/
    public java.util.List<LogAnalyticsSourceEntityType> getEntityTypes() {
        return entityTypes;
    }

    /**
     * The list of dependencies defined by the source.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dependencies")
    private final java.util.List<Dependency> dependencies;

    /**
     * The list of dependencies defined by the source.
     * @return the value
     **/
    public java.util.List<Dependency> getDependencies() {
        return dependencies;
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
        sb.append("DependentSource(");
        sb.append("super=").append(super.toString());
        sb.append("sourceName=").append(String.valueOf(this.sourceName));
        sb.append(", sourceDisplayName=").append(String.valueOf(this.sourceDisplayName));
        sb.append(", sourceId=").append(String.valueOf(this.sourceId));
        sb.append(", sourceType=").append(String.valueOf(this.sourceType));
        sb.append(", isSystem=").append(String.valueOf(this.isSystem));
        sb.append(", isAutoAssociationEnabled=")
                .append(String.valueOf(this.isAutoAssociationEnabled));
        sb.append(", entityTypes=").append(String.valueOf(this.entityTypes));
        sb.append(", dependencies=").append(String.valueOf(this.dependencies));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DependentSource)) {
            return false;
        }

        DependentSource other = (DependentSource) o;
        return java.util.Objects.equals(this.sourceName, other.sourceName)
                && java.util.Objects.equals(this.sourceDisplayName, other.sourceDisplayName)
                && java.util.Objects.equals(this.sourceId, other.sourceId)
                && java.util.Objects.equals(this.sourceType, other.sourceType)
                && java.util.Objects.equals(this.isSystem, other.isSystem)
                && java.util.Objects.equals(
                        this.isAutoAssociationEnabled, other.isAutoAssociationEnabled)
                && java.util.Objects.equals(this.entityTypes, other.entityTypes)
                && java.util.Objects.equals(this.dependencies, other.dependencies)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.sourceName == null ? 43 : this.sourceName.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceDisplayName == null ? 43 : this.sourceDisplayName.hashCode());
        result = (result * PRIME) + (this.sourceId == null ? 43 : this.sourceId.hashCode());
        result = (result * PRIME) + (this.sourceType == null ? 43 : this.sourceType.hashCode());
        result = (result * PRIME) + (this.isSystem == null ? 43 : this.isSystem.hashCode());
        result =
                (result * PRIME)
                        + (this.isAutoAssociationEnabled == null
                                ? 43
                                : this.isAutoAssociationEnabled.hashCode());
        result = (result * PRIME) + (this.entityTypes == null ? 43 : this.entityTypes.hashCode());
        result = (result * PRIME) + (this.dependencies == null ? 43 : this.dependencies.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
