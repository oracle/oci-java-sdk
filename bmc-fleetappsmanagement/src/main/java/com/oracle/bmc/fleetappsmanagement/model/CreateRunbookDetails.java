/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * The information about new Runbook.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230831")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateRunbookDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateRunbookDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "description",
        "runbookRelevance",
        "operation",
        "osType",
        "platform",
        "isDefault",
        "estimatedTime",
        "associations",
        "compartmentId",
        "freeformTags",
        "definedTags"
    })
    public CreateRunbookDetails(
            String displayName,
            String description,
            Runbook.RunbookRelevance runbookRelevance,
            String operation,
            OsType osType,
            String platform,
            Boolean isDefault,
            String estimatedTime,
            Associations associations,
            String compartmentId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.runbookRelevance = runbookRelevance;
        this.operation = operation;
        this.osType = osType;
        this.platform = platform;
        this.isDefault = isDefault;
        this.estimatedTime = estimatedTime;
        this.associations = associations;
        this.compartmentId = compartmentId;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         * <p>
         * Example: {@code My new resource}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         * <p>
         * Example: {@code My new resource}
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * A user-friendly description. To provide some insight about the resource.
         * Avoid entering confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A user-friendly description. To provide some insight about the resource.
         * Avoid entering confidential information.
         *
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Type of runbook structure.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("runbookRelevance")
        private Runbook.RunbookRelevance runbookRelevance;

        /**
         * Type of runbook structure.
         * @param runbookRelevance the value to set
         * @return this builder
         **/
        public Builder runbookRelevance(Runbook.RunbookRelevance runbookRelevance) {
            this.runbookRelevance = runbookRelevance;
            this.__explicitlySet__.add("runbookRelevance");
            return this;
        }
        /**
         * The lifecycle operation performed by the task.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("operation")
        private String operation;

        /**
         * The lifecycle operation performed by the task.
         * @param operation the value to set
         * @return this builder
         **/
        public Builder operation(String operation) {
            this.operation = operation;
            this.__explicitlySet__.add("operation");
            return this;
        }
        /**
         * The OS type for the runbook.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("osType")
        private OsType osType;

        /**
         * The OS type for the runbook.
         * @param osType the value to set
         * @return this builder
         **/
        public Builder osType(OsType osType) {
            this.osType = osType;
            this.__explicitlySet__.add("osType");
            return this;
        }
        /**
         * The platform of the runbook.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("platform")
        private String platform;

        /**
         * The platform of the runbook.
         * @param platform the value to set
         * @return this builder
         **/
        public Builder platform(String platform) {
            this.platform = platform;
            this.__explicitlySet__.add("platform");
            return this;
        }
        /**
         * Is the runbook default?
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
        private Boolean isDefault;

        /**
         * Is the runbook default?
         * @param isDefault the value to set
         * @return this builder
         **/
        public Builder isDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            this.__explicitlySet__.add("isDefault");
            return this;
        }
        /**
         * Estimated time to successfully complete the runbook execution
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("estimatedTime")
        private String estimatedTime;

        /**
         * Estimated time to successfully complete the runbook execution
         * @param estimatedTime the value to set
         * @return this builder
         **/
        public Builder estimatedTime(String estimatedTime) {
            this.estimatedTime = estimatedTime;
            this.__explicitlySet__.add("estimatedTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("associations")
        private Associations associations;

        public Builder associations(Associations associations) {
            this.associations = associations;
            this.__explicitlySet__.add("associations");
            return this;
        }
        /**
         * OCID of the compartment to which the resource belongs to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * OCID of the compartment to which the resource belongs to.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateRunbookDetails build() {
            CreateRunbookDetails model =
                    new CreateRunbookDetails(
                            this.displayName,
                            this.description,
                            this.runbookRelevance,
                            this.operation,
                            this.osType,
                            this.platform,
                            this.isDefault,
                            this.estimatedTime,
                            this.associations,
                            this.compartmentId,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateRunbookDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("runbookRelevance")) {
                this.runbookRelevance(model.getRunbookRelevance());
            }
            if (model.wasPropertyExplicitlySet("operation")) {
                this.operation(model.getOperation());
            }
            if (model.wasPropertyExplicitlySet("osType")) {
                this.osType(model.getOsType());
            }
            if (model.wasPropertyExplicitlySet("platform")) {
                this.platform(model.getPlatform());
            }
            if (model.wasPropertyExplicitlySet("isDefault")) {
                this.isDefault(model.getIsDefault());
            }
            if (model.wasPropertyExplicitlySet("estimatedTime")) {
                this.estimatedTime(model.getEstimatedTime());
            }
            if (model.wasPropertyExplicitlySet("associations")) {
                this.associations(model.getAssociations());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     * <p>
     * Example: {@code My new resource}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     * <p>
     * Example: {@code My new resource}
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * A user-friendly description. To provide some insight about the resource.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A user-friendly description. To provide some insight about the resource.
     * Avoid entering confidential information.
     *
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Type of runbook structure.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("runbookRelevance")
    private final Runbook.RunbookRelevance runbookRelevance;

    /**
     * Type of runbook structure.
     * @return the value
     **/
    public Runbook.RunbookRelevance getRunbookRelevance() {
        return runbookRelevance;
    }

    /**
     * The lifecycle operation performed by the task.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operation")
    private final String operation;

    /**
     * The lifecycle operation performed by the task.
     * @return the value
     **/
    public String getOperation() {
        return operation;
    }

    /**
     * The OS type for the runbook.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("osType")
    private final OsType osType;

    /**
     * The OS type for the runbook.
     * @return the value
     **/
    public OsType getOsType() {
        return osType;
    }

    /**
     * The platform of the runbook.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("platform")
    private final String platform;

    /**
     * The platform of the runbook.
     * @return the value
     **/
    public String getPlatform() {
        return platform;
    }

    /**
     * Is the runbook default?
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
    private final Boolean isDefault;

    /**
     * Is the runbook default?
     * @return the value
     **/
    public Boolean getIsDefault() {
        return isDefault;
    }

    /**
     * Estimated time to successfully complete the runbook execution
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("estimatedTime")
    private final String estimatedTime;

    /**
     * Estimated time to successfully complete the runbook execution
     * @return the value
     **/
    public String getEstimatedTime() {
        return estimatedTime;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("associations")
    private final Associations associations;

    public Associations getAssociations() {
        return associations;
    }

    /**
     * OCID of the compartment to which the resource belongs to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * OCID of the compartment to which the resource belongs to.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("CreateRunbookDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", runbookRelevance=").append(String.valueOf(this.runbookRelevance));
        sb.append(", operation=").append(String.valueOf(this.operation));
        sb.append(", osType=").append(String.valueOf(this.osType));
        sb.append(", platform=").append(String.valueOf(this.platform));
        sb.append(", isDefault=").append(String.valueOf(this.isDefault));
        sb.append(", estimatedTime=").append(String.valueOf(this.estimatedTime));
        sb.append(", associations=").append(String.valueOf(this.associations));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateRunbookDetails)) {
            return false;
        }

        CreateRunbookDetails other = (CreateRunbookDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.runbookRelevance, other.runbookRelevance)
                && java.util.Objects.equals(this.operation, other.operation)
                && java.util.Objects.equals(this.osType, other.osType)
                && java.util.Objects.equals(this.platform, other.platform)
                && java.util.Objects.equals(this.isDefault, other.isDefault)
                && java.util.Objects.equals(this.estimatedTime, other.estimatedTime)
                && java.util.Objects.equals(this.associations, other.associations)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.runbookRelevance == null ? 43 : this.runbookRelevance.hashCode());
        result = (result * PRIME) + (this.operation == null ? 43 : this.operation.hashCode());
        result = (result * PRIME) + (this.osType == null ? 43 : this.osType.hashCode());
        result = (result * PRIME) + (this.platform == null ? 43 : this.platform.hashCode());
        result = (result * PRIME) + (this.isDefault == null ? 43 : this.isDefault.hashCode());
        result =
                (result * PRIME)
                        + (this.estimatedTime == null ? 43 : this.estimatedTime.hashCode());
        result = (result * PRIME) + (this.associations == null ? 43 : this.associations.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
