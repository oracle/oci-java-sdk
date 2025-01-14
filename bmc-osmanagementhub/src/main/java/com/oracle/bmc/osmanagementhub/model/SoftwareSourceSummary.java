/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Provides summary information for a software source. A software source contains a collection of
 * packages. For more information, see [Managing Software
 * Sources](https://docs.cloud.oracle.com/iaas/osmh/doc/software-sources.htm). <br>
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
        property = "softwareSourceType",
        defaultImpl = SoftwareSourceSummary.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = VendorSoftwareSourceSummary.class,
            name = "VENDOR"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = VersionedCustomSoftwareSourceSummary.class,
            name = "VERSIONED"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CustomSoftwareSourceSummary.class,
            name = "CUSTOM")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class SoftwareSourceSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "displayName",
        "repoId",
        "url",
        "timeCreated",
        "timeUpdated",
        "description",
        "availability",
        "availabilityAtOci",
        "osFamily",
        "archType",
        "packageCount",
        "lifecycleState",
        "size",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    protected SoftwareSourceSummary(
            String id,
            String compartmentId,
            String displayName,
            String repoId,
            String url,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String description,
            Availability availability,
            Availability availabilityAtOci,
            OsFamily osFamily,
            ArchType archType,
            Long packageCount,
            SoftwareSource.LifecycleState lifecycleState,
            Double size,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.repoId = repoId;
        this.url = url;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.description = description;
        this.availability = availability;
        this.availabilityAtOci = availabilityAtOci;
        this.osFamily = osFamily;
        this.archType = archType;
        this.packageCount = packageCount;
        this.lifecycleState = lifecycleState;
        this.size = size;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the software source.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the software source.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment that contains the software source.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment that contains the software source.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** User-friendly name for the software source. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * User-friendly name for the software source.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The repository ID for the software source. */
    @com.fasterxml.jackson.annotation.JsonProperty("repoId")
    private final String repoId;

    /**
     * The repository ID for the software source.
     *
     * @return the value
     */
    public String getRepoId() {
        return repoId;
    }

    /**
     * URL for the repository. For vendor software sources, this is the URL to the regional yum
     * server. For custom software sources, this is 'custom/<repoId>'.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    private final String url;

    /**
     * URL for the repository. For vendor software sources, this is the URL to the regional yum
     * server. For custom software sources, this is 'custom/<repoId>'.
     *
     * @return the value
     */
    public String getUrl() {
        return url;
    }

    /**
     * The date and time the software source was created (in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) format).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the software source was created (in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) format).
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the software source was updated (in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) format).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the software source was updated (in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) format).
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** Description of the software source. For custom software sources, this is user-specified. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the software source. For custom software sources, this is user-specified.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** Availability of the software source (for non-OCI environments). */
    @com.fasterxml.jackson.annotation.JsonProperty("availability")
    private final Availability availability;

    /**
     * Availability of the software source (for non-OCI environments).
     *
     * @return the value
     */
    public Availability getAvailability() {
        return availability;
    }

    /** Availability of the software source (for OCI environments). */
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityAtOci")
    private final Availability availabilityAtOci;

    /**
     * Availability of the software source (for OCI environments).
     *
     * @return the value
     */
    public Availability getAvailabilityAtOci() {
        return availabilityAtOci;
    }

    /** The OS family the software source belongs to. */
    @com.fasterxml.jackson.annotation.JsonProperty("osFamily")
    private final OsFamily osFamily;

    /**
     * The OS family the software source belongs to.
     *
     * @return the value
     */
    public OsFamily getOsFamily() {
        return osFamily;
    }

    /** The architecture type supported by the software source. */
    @com.fasterxml.jackson.annotation.JsonProperty("archType")
    private final ArchType archType;

    /**
     * The architecture type supported by the software source.
     *
     * @return the value
     */
    public ArchType getArchType() {
        return archType;
    }

    /** Number of packages the software source contains. */
    @com.fasterxml.jackson.annotation.JsonProperty("packageCount")
    private final Long packageCount;

    /**
     * Number of packages the software source contains.
     *
     * @return the value
     */
    public Long getPackageCount() {
        return packageCount;
    }

    /** The current state of the software source. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final SoftwareSource.LifecycleState lifecycleState;

    /**
     * The current state of the software source.
     *
     * @return the value
     */
    public SoftwareSource.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** The size of the software source in gigabytes (GB). */
    @com.fasterxml.jackson.annotation.JsonProperty("size")
    private final Double size;

    /**
     * The size of the software source in gigabytes (GB).
     *
     * @return the value
     */
    public Double getSize() {
        return size;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
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
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("SoftwareSourceSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", repoId=").append(String.valueOf(this.repoId));
        sb.append(", url=").append(String.valueOf(this.url));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", availability=").append(String.valueOf(this.availability));
        sb.append(", availabilityAtOci=").append(String.valueOf(this.availabilityAtOci));
        sb.append(", osFamily=").append(String.valueOf(this.osFamily));
        sb.append(", archType=").append(String.valueOf(this.archType));
        sb.append(", packageCount=").append(String.valueOf(this.packageCount));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", size=").append(String.valueOf(this.size));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SoftwareSourceSummary)) {
            return false;
        }

        SoftwareSourceSummary other = (SoftwareSourceSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.repoId, other.repoId)
                && java.util.Objects.equals(this.url, other.url)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.availability, other.availability)
                && java.util.Objects.equals(this.availabilityAtOci, other.availabilityAtOci)
                && java.util.Objects.equals(this.osFamily, other.osFamily)
                && java.util.Objects.equals(this.archType, other.archType)
                && java.util.Objects.equals(this.packageCount, other.packageCount)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.size, other.size)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.repoId == null ? 43 : this.repoId.hashCode());
        result = (result * PRIME) + (this.url == null ? 43 : this.url.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.availability == null ? 43 : this.availability.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityAtOci == null ? 43 : this.availabilityAtOci.hashCode());
        result = (result * PRIME) + (this.osFamily == null ? 43 : this.osFamily.hashCode());
        result = (result * PRIME) + (this.archType == null ? 43 : this.archType.hashCode());
        result = (result * PRIME) + (this.packageCount == null ? 43 : this.packageCount.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.size == null ? 43 : this.size.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
