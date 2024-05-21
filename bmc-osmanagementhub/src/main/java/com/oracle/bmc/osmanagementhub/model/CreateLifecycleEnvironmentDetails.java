/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Provides the information used to create a lifecycle environment. A lifecycle environment is a user-defined pipeline to deliver curated, versioned content in a prescribed, methodical manner.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateLifecycleEnvironmentDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateLifecycleEnvironmentDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "displayName",
        "description",
        "stages",
        "archType",
        "osFamily",
        "vendorName",
        "location",
        "freeformTags",
        "definedTags"
    })
    public CreateLifecycleEnvironmentDetails(
            String compartmentId,
            String displayName,
            String description,
            java.util.List<CreateLifecycleStageDetails> stages,
            ArchType archType,
            OsFamily osFamily,
            VendorName vendorName,
            ManagedInstanceLocation location,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.description = description;
        this.stages = stages;
        this.archType = archType;
        this.osFamily = osFamily;
        this.vendorName = vendorName;
        this.location = location;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment that contains the lifecycle environment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment that contains the lifecycle environment.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * A user-friendly name for the lifecycle environment. Does not have to be unique and you can change the name later. Avoid entering confidential information.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name for the lifecycle environment. Does not have to be unique and you can change the name later. Avoid entering confidential information.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * User-specified information about the lifecycle environment. Avoid entering confidential information.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * User-specified information about the lifecycle environment. Avoid entering confidential information.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * User-specified list of ranked lifecycle stages used within the lifecycle environment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("stages")
        private java.util.List<CreateLifecycleStageDetails> stages;

        /**
         * User-specified list of ranked lifecycle stages used within the lifecycle environment.
         * @param stages the value to set
         * @return this builder
         **/
        public Builder stages(java.util.List<CreateLifecycleStageDetails> stages) {
            this.stages = stages;
            this.__explicitlySet__.add("stages");
            return this;
        }
        /**
         * The CPU architecture of the managed instances in the lifecycle environment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("archType")
        private ArchType archType;

        /**
         * The CPU architecture of the managed instances in the lifecycle environment.
         * @param archType the value to set
         * @return this builder
         **/
        public Builder archType(ArchType archType) {
            this.archType = archType;
            this.__explicitlySet__.add("archType");
            return this;
        }
        /**
         * The operating system of the managed instances in the lifecycle environment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("osFamily")
        private OsFamily osFamily;

        /**
         * The operating system of the managed instances in the lifecycle environment.
         * @param osFamily the value to set
         * @return this builder
         **/
        public Builder osFamily(OsFamily osFamily) {
            this.osFamily = osFamily;
            this.__explicitlySet__.add("osFamily");
            return this;
        }
        /**
         * The vendor of the operating system used by the managed instances in the lifecycle environment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vendorName")
        private VendorName vendorName;

        /**
         * The vendor of the operating system used by the managed instances in the lifecycle environment.
         * @param vendorName the value to set
         * @return this builder
         **/
        public Builder vendorName(VendorName vendorName) {
            this.vendorName = vendorName;
            this.__explicitlySet__.add("vendorName");
            return this;
        }
        /**
         * The location of managed instances attached to the lifecycle environment. If no location is provided, the default is 'ON_PREMISE.'
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("location")
        private ManagedInstanceLocation location;

        /**
         * The location of managed instances attached to the lifecycle environment. If no location is provided, the default is 'ON_PREMISE.'
         *
         * @param location the value to set
         * @return this builder
         **/
        public Builder location(ManagedInstanceLocation location) {
            this.location = location;
            this.__explicitlySet__.add("location");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
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
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
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

        public CreateLifecycleEnvironmentDetails build() {
            CreateLifecycleEnvironmentDetails model =
                    new CreateLifecycleEnvironmentDetails(
                            this.compartmentId,
                            this.displayName,
                            this.description,
                            this.stages,
                            this.archType,
                            this.osFamily,
                            this.vendorName,
                            this.location,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateLifecycleEnvironmentDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("stages")) {
                this.stages(model.getStages());
            }
            if (model.wasPropertyExplicitlySet("archType")) {
                this.archType(model.getArchType());
            }
            if (model.wasPropertyExplicitlySet("osFamily")) {
                this.osFamily(model.getOsFamily());
            }
            if (model.wasPropertyExplicitlySet("vendorName")) {
                this.vendorName(model.getVendorName());
            }
            if (model.wasPropertyExplicitlySet("location")) {
                this.location(model.getLocation());
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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment that contains the lifecycle environment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment that contains the lifecycle environment.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * A user-friendly name for the lifecycle environment. Does not have to be unique and you can change the name later. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name for the lifecycle environment. Does not have to be unique and you can change the name later. Avoid entering confidential information.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * User-specified information about the lifecycle environment. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * User-specified information about the lifecycle environment. Avoid entering confidential information.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * User-specified list of ranked lifecycle stages used within the lifecycle environment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("stages")
    private final java.util.List<CreateLifecycleStageDetails> stages;

    /**
     * User-specified list of ranked lifecycle stages used within the lifecycle environment.
     * @return the value
     **/
    public java.util.List<CreateLifecycleStageDetails> getStages() {
        return stages;
    }

    /**
     * The CPU architecture of the managed instances in the lifecycle environment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("archType")
    private final ArchType archType;

    /**
     * The CPU architecture of the managed instances in the lifecycle environment.
     * @return the value
     **/
    public ArchType getArchType() {
        return archType;
    }

    /**
     * The operating system of the managed instances in the lifecycle environment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("osFamily")
    private final OsFamily osFamily;

    /**
     * The operating system of the managed instances in the lifecycle environment.
     * @return the value
     **/
    public OsFamily getOsFamily() {
        return osFamily;
    }

    /**
     * The vendor of the operating system used by the managed instances in the lifecycle environment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vendorName")
    private final VendorName vendorName;

    /**
     * The vendor of the operating system used by the managed instances in the lifecycle environment.
     * @return the value
     **/
    public VendorName getVendorName() {
        return vendorName;
    }

    /**
     * The location of managed instances attached to the lifecycle environment. If no location is provided, the default is 'ON_PREMISE.'
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("location")
    private final ManagedInstanceLocation location;

    /**
     * The location of managed instances attached to the lifecycle environment. If no location is provided, the default is 'ON_PREMISE.'
     *
     * @return the value
     **/
    public ManagedInstanceLocation getLocation() {
        return location;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
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
        sb.append("CreateLifecycleEnvironmentDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", stages=").append(String.valueOf(this.stages));
        sb.append(", archType=").append(String.valueOf(this.archType));
        sb.append(", osFamily=").append(String.valueOf(this.osFamily));
        sb.append(", vendorName=").append(String.valueOf(this.vendorName));
        sb.append(", location=").append(String.valueOf(this.location));
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
        if (!(o instanceof CreateLifecycleEnvironmentDetails)) {
            return false;
        }

        CreateLifecycleEnvironmentDetails other = (CreateLifecycleEnvironmentDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.stages, other.stages)
                && java.util.Objects.equals(this.archType, other.archType)
                && java.util.Objects.equals(this.osFamily, other.osFamily)
                && java.util.Objects.equals(this.vendorName, other.vendorName)
                && java.util.Objects.equals(this.location, other.location)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.stages == null ? 43 : this.stages.hashCode());
        result = (result * PRIME) + (this.archType == null ? 43 : this.archType.hashCode());
        result = (result * PRIME) + (this.osFamily == null ? 43 : this.osFamily.hashCode());
        result = (result * PRIME) + (this.vendorName == null ? 43 : this.vendorName.hashCode());
        result = (result * PRIME) + (this.location == null ? 43 : this.location.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
