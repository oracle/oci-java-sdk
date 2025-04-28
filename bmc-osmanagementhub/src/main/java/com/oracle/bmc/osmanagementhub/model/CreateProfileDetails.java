/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Provides the information used to create a new registration profile. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "profileType",
        defaultImpl = CreateProfileDetails.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreateGroupProfileDetails.class,
            name = "GROUP"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreateWindowsStandAloneProfileDetails.class,
            name = "WINDOWS_STANDALONE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreateStationProfileDetails.class,
            name = "STATION"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreateSoftwareSourceProfileDetails.class,
            name = "SOFTWARESOURCE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreateLifecycleProfileDetails.class,
            name = "LIFECYCLE")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class CreateProfileDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "compartmentId",
        "description",
        "managementStationId",
        "registrationType",
        "isDefaultProfile",
        "freeformTags",
        "definedTags"
    })
    protected CreateProfileDetails(
            String displayName,
            String compartmentId,
            String description,
            String managementStationId,
            Profile.RegistrationType registrationType,
            Boolean isDefaultProfile,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.description = description;
        this.managementStationId = managementStationId;
        this.registrationType = registrationType;
        this.isDefaultProfile = isDefaultProfile;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    /**
     * A user-friendly name. Does not have to be unique and you can change the name later. Avoid
     * entering confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique and you can change the name later. Avoid
     * entering confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment that contains the registration profile.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment that contains the registration profile.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** User-specified description of the registration profile. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * User-specified description of the registration profile.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * description: The
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * management station to associate with an instance once registered. This is required when
     * creating a profile for non-OCI instances.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("managementStationId")
    private final String managementStationId;

    /**
     * description: The
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * management station to associate with an instance once registered. This is required when
     * creating a profile for non-OCI instances.
     *
     * @return the value
     */
    public String getManagementStationId() {
        return managementStationId;
    }

    /** The type of instance to register. */
    @com.fasterxml.jackson.annotation.JsonProperty("registrationType")
    private final Profile.RegistrationType registrationType;

    /**
     * The type of instance to register.
     *
     * @return the value
     */
    public Profile.RegistrationType getRegistrationType() {
        return registrationType;
    }

    /**
     * Indicates if the profile is set as the default. There is exactly one default profile for a
     * specified architecture, OS family, registration type, and vendor. When registering an
     * instance with the corresonding characteristics, the default profile is used, unless another
     * profile is specified.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isDefaultProfile")
    private final Boolean isDefaultProfile;

    /**
     * Indicates if the profile is set as the default. There is exactly one default profile for a
     * specified architecture, OS family, registration type, and vendor. When registering an
     * instance with the corresonding characteristics, the default profile is used, unless another
     * profile is specified.
     *
     * @return the value
     */
    public Boolean getIsDefaultProfile() {
        return isDefaultProfile;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("CreateProfileDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", managementStationId=").append(String.valueOf(this.managementStationId));
        sb.append(", registrationType=").append(String.valueOf(this.registrationType));
        sb.append(", isDefaultProfile=").append(String.valueOf(this.isDefaultProfile));
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
        if (!(o instanceof CreateProfileDetails)) {
            return false;
        }

        CreateProfileDetails other = (CreateProfileDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.managementStationId, other.managementStationId)
                && java.util.Objects.equals(this.registrationType, other.registrationType)
                && java.util.Objects.equals(this.isDefaultProfile, other.isDefaultProfile)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.managementStationId == null
                                ? 43
                                : this.managementStationId.hashCode());
        result =
                (result * PRIME)
                        + (this.registrationType == null ? 43 : this.registrationType.hashCode());
        result =
                (result * PRIME)
                        + (this.isDefaultProfile == null ? 43 : this.isDefaultProfile.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
