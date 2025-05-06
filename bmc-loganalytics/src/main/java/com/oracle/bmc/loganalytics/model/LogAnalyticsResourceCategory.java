/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * A resource and its category. <br>
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
        builder = LogAnalyticsResourceCategory.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class LogAnalyticsResourceCategory
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "resourceId",
        "resourceType",
        "categoryName",
        "isSystem",
        "resourceDisplayName",
        "compartmentId"
    })
    public LogAnalyticsResourceCategory(
            String resourceId,
            String resourceType,
            String categoryName,
            Boolean isSystem,
            String resourceDisplayName,
            String compartmentId) {
        super();
        this.resourceId = resourceId;
        this.resourceType = resourceType;
        this.categoryName = categoryName;
        this.isSystem = isSystem;
        this.resourceDisplayName = resourceDisplayName;
        this.compartmentId = compartmentId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The unique identifier of the resource, usually a name or ocid. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        /**
         * The unique identifier of the resource, usually a name or ocid.
         *
         * @param resourceId the value to set
         * @return this builder
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
            return this;
        }
        /** The resource type. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private String resourceType;

        /**
         * The resource type.
         *
         * @param resourceType the value to set
         * @return this builder
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
            return this;
        }
        /** The category name to which this resource belongs. */
        @com.fasterxml.jackson.annotation.JsonProperty("categoryName")
        private String categoryName;

        /**
         * The category name to which this resource belongs.
         *
         * @param categoryName the value to set
         * @return this builder
         */
        public Builder categoryName(String categoryName) {
            this.categoryName = categoryName;
            this.__explicitlySet__.add("categoryName");
            return this;
        }
        /**
         * The system flag. A value of false denotes a user-created category assignment. A value of
         * true denotes an Oracle-defined category assignment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isSystem")
        private Boolean isSystem;

        /**
         * The system flag. A value of false denotes a user-created category assignment. A value of
         * true denotes an Oracle-defined category assignment.
         *
         * @param isSystem the value to set
         * @return this builder
         */
        public Builder isSystem(Boolean isSystem) {
            this.isSystem = isSystem;
            this.__explicitlySet__.add("isSystem");
            return this;
        }
        /** The resource display name. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceDisplayName")
        private String resourceDisplayName;

        /**
         * The resource display name.
         *
         * @param resourceDisplayName the value to set
         * @return this builder
         */
        public Builder resourceDisplayName(String resourceDisplayName) {
            this.resourceDisplayName = resourceDisplayName;
            this.__explicitlySet__.add("resourceDisplayName");
            return this;
        }
        /** Compartment ID of the resource */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment ID of the resource
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsResourceCategory build() {
            LogAnalyticsResourceCategory model =
                    new LogAnalyticsResourceCategory(
                            this.resourceId,
                            this.resourceType,
                            this.categoryName,
                            this.isSystem,
                            this.resourceDisplayName,
                            this.compartmentId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsResourceCategory model) {
            if (model.wasPropertyExplicitlySet("resourceId")) {
                this.resourceId(model.getResourceId());
            }
            if (model.wasPropertyExplicitlySet("resourceType")) {
                this.resourceType(model.getResourceType());
            }
            if (model.wasPropertyExplicitlySet("categoryName")) {
                this.categoryName(model.getCategoryName());
            }
            if (model.wasPropertyExplicitlySet("isSystem")) {
                this.isSystem(model.getIsSystem());
            }
            if (model.wasPropertyExplicitlySet("resourceDisplayName")) {
                this.resourceDisplayName(model.getResourceDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
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

    /** The unique identifier of the resource, usually a name or ocid. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    private final String resourceId;

    /**
     * The unique identifier of the resource, usually a name or ocid.
     *
     * @return the value
     */
    public String getResourceId() {
        return resourceId;
    }

    /** The resource type. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    private final String resourceType;

    /**
     * The resource type.
     *
     * @return the value
     */
    public String getResourceType() {
        return resourceType;
    }

    /** The category name to which this resource belongs. */
    @com.fasterxml.jackson.annotation.JsonProperty("categoryName")
    private final String categoryName;

    /**
     * The category name to which this resource belongs.
     *
     * @return the value
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * The system flag. A value of false denotes a user-created category assignment. A value of true
     * denotes an Oracle-defined category assignment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isSystem")
    private final Boolean isSystem;

    /**
     * The system flag. A value of false denotes a user-created category assignment. A value of true
     * denotes an Oracle-defined category assignment.
     *
     * @return the value
     */
    public Boolean getIsSystem() {
        return isSystem;
    }

    /** The resource display name. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceDisplayName")
    private final String resourceDisplayName;

    /**
     * The resource display name.
     *
     * @return the value
     */
    public String getResourceDisplayName() {
        return resourceDisplayName;
    }

    /** Compartment ID of the resource */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment ID of the resource
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
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
        sb.append("LogAnalyticsResourceCategory(");
        sb.append("super=").append(super.toString());
        sb.append("resourceId=").append(String.valueOf(this.resourceId));
        sb.append(", resourceType=").append(String.valueOf(this.resourceType));
        sb.append(", categoryName=").append(String.valueOf(this.categoryName));
        sb.append(", isSystem=").append(String.valueOf(this.isSystem));
        sb.append(", resourceDisplayName=").append(String.valueOf(this.resourceDisplayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LogAnalyticsResourceCategory)) {
            return false;
        }

        LogAnalyticsResourceCategory other = (LogAnalyticsResourceCategory) o;
        return java.util.Objects.equals(this.resourceId, other.resourceId)
                && java.util.Objects.equals(this.resourceType, other.resourceType)
                && java.util.Objects.equals(this.categoryName, other.categoryName)
                && java.util.Objects.equals(this.isSystem, other.isSystem)
                && java.util.Objects.equals(this.resourceDisplayName, other.resourceDisplayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.resourceId == null ? 43 : this.resourceId.hashCode());
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result = (result * PRIME) + (this.categoryName == null ? 43 : this.categoryName.hashCode());
        result = (result * PRIME) + (this.isSystem == null ? 43 : this.isSystem.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceDisplayName == null
                                ? 43
                                : this.resourceDisplayName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
