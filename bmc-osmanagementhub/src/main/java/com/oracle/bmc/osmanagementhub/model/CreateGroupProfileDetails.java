/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Provides the information used to create a group registration profile.
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
    builder = CreateGroupProfileDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "profileType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateGroupProfileDetails extends CreateProfileDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("managementStationId")
        private String managementStationId;

        public Builder managementStationId(String managementStationId) {
            this.managementStationId = managementStationId;
            this.__explicitlySet__.add("managementStationId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("registrationType")
        private Profile.RegistrationType registrationType;

        public Builder registrationType(Profile.RegistrationType registrationType) {
            this.registrationType = registrationType;
            this.__explicitlySet__.add("registrationType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isDefaultProfile")
        private Boolean isDefaultProfile;

        public Builder isDefaultProfile(Boolean isDefaultProfile) {
            this.isDefaultProfile = isDefaultProfile;
            this.__explicitlySet__.add("isDefaultProfile");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the managed instance group that the instance will join after registration.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceGroupId")
        private String managedInstanceGroupId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the managed instance group that the instance will join after registration.
         * @param managedInstanceGroupId the value to set
         * @return this builder
         **/
        public Builder managedInstanceGroupId(String managedInstanceGroupId) {
            this.managedInstanceGroupId = managedInstanceGroupId;
            this.__explicitlySet__.add("managedInstanceGroupId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateGroupProfileDetails build() {
            CreateGroupProfileDetails model =
                    new CreateGroupProfileDetails(
                            this.displayName,
                            this.compartmentId,
                            this.description,
                            this.managementStationId,
                            this.registrationType,
                            this.isDefaultProfile,
                            this.freeformTags,
                            this.definedTags,
                            this.managedInstanceGroupId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateGroupProfileDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("managementStationId")) {
                this.managementStationId(model.getManagementStationId());
            }
            if (model.wasPropertyExplicitlySet("registrationType")) {
                this.registrationType(model.getRegistrationType());
            }
            if (model.wasPropertyExplicitlySet("isDefaultProfile")) {
                this.isDefaultProfile(model.getIsDefaultProfile());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("managedInstanceGroupId")) {
                this.managedInstanceGroupId(model.getManagedInstanceGroupId());
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

    @Deprecated
    public CreateGroupProfileDetails(
            String displayName,
            String compartmentId,
            String description,
            String managementStationId,
            Profile.RegistrationType registrationType,
            Boolean isDefaultProfile,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String managedInstanceGroupId) {
        super(
                displayName,
                compartmentId,
                description,
                managementStationId,
                registrationType,
                isDefaultProfile,
                freeformTags,
                definedTags);
        this.managedInstanceGroupId = managedInstanceGroupId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the managed instance group that the instance will join after registration.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceGroupId")
    private final String managedInstanceGroupId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the managed instance group that the instance will join after registration.
     * @return the value
     **/
    public String getManagedInstanceGroupId() {
        return managedInstanceGroupId;
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
        sb.append("CreateGroupProfileDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", managedInstanceGroupId=").append(String.valueOf(this.managedInstanceGroupId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateGroupProfileDetails)) {
            return false;
        }

        CreateGroupProfileDetails other = (CreateGroupProfileDetails) o;
        return java.util.Objects.equals(this.managedInstanceGroupId, other.managedInstanceGroupId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.managedInstanceGroupId == null
                                ? 43
                                : this.managedInstanceGroupId.hashCode());
        return result;
    }
}
