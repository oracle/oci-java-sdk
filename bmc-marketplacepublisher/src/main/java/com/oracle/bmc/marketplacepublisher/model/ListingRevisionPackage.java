/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher.model;

/**
 * A base object for all types of listing revision packages. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241201")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "packageType",
        defaultImpl = ListingRevisionPackage.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = StackPackage.class, name = "STACK"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = HelmChartPackage.class,
            name = "HELM_CHART"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = MachineImagePackage.class,
            name = "MACHINE_IMAGE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = ContainerPackage.class,
            name = "CONTAINER_IMAGE")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class ListingRevisionPackage
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "description",
        "listingRevisionId",
        "compartmentId",
        "artifactId",
        "termId",
        "packageVersion",
        "lifecycleState",
        "status",
        "areSecurityUpgradesProvided",
        "isDefault",
        "timeCreated",
        "timeUpdated",
        "extendedMetadata",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    protected ListingRevisionPackage(
            String id,
            String displayName,
            String description,
            String listingRevisionId,
            String compartmentId,
            String artifactId,
            String termId,
            String packageVersion,
            LifecycleState lifecycleState,
            Status status,
            Boolean areSecurityUpgradesProvided,
            Boolean isDefault,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Map<String, String> extendedMetadata,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.description = description;
        this.listingRevisionId = listingRevisionId;
        this.compartmentId = compartmentId;
        this.artifactId = artifactId;
        this.termId = termId;
        this.packageVersion = packageVersion;
        this.lifecycleState = lifecycleState;
        this.status = status;
        this.areSecurityUpgradesProvided = areSecurityUpgradesProvided;
        this.isDefault = isDefault;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.extendedMetadata = extendedMetadata;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    /** The OCID for the listing revision package in Marketplace Publisher. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID for the listing revision package in Marketplace Publisher.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The name of the listing revision package. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The name of the listing revision package.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The description of this package. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of this package.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The unique identifier for the listing revision. */
    @com.fasterxml.jackson.annotation.JsonProperty("listingRevisionId")
    private final String listingRevisionId;

    /**
     * The unique identifier for the listing revision.
     *
     * @return the value
     */
    public String getListingRevisionId() {
        return listingRevisionId;
    }

    /** The unique identifier for the compartment. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The unique identifier for the compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The unique identifier for the artifact. */
    @com.fasterxml.jackson.annotation.JsonProperty("artifactId")
    private final String artifactId;

    /**
     * The unique identifier for the artifact.
     *
     * @return the value
     */
    public String getArtifactId() {
        return artifactId;
    }

    /** The unique identifier for the term. */
    @com.fasterxml.jackson.annotation.JsonProperty("termId")
    private final String termId;

    /**
     * The unique identifier for the term.
     *
     * @return the value
     */
    public String getTermId() {
        return termId;
    }

    /** The version for the package. */
    @com.fasterxml.jackson.annotation.JsonProperty("packageVersion")
    private final String packageVersion;

    /**
     * The version for the package.
     *
     * @return the value
     */
    public String getPackageVersion() {
        return packageVersion;
    }

    /** The current state for the listing revision package. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Updating("UPDATING"),
        Active("ACTIVE"),
        Inactive("INACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The current state for the listing revision package. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state for the listing revision package.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** The current status for the listing revision package. */
    public enum Status implements com.oracle.bmc.http.internal.BmcEnum {
        New("NEW"),
        PublishInProgress("PUBLISH_IN_PROGRESS"),
        UnpublishInProgress("UNPUBLISH_IN_PROGRESS"),
        PublishFailed("PUBLISH_FAILED"),
        Published("PUBLISHED"),
        PublishedAsPrivate("PUBLISHED_AS_PRIVATE"),
        Unpublished("UNPUBLISHED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Status.class);

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Status', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The current status for the listing revision package. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * The current status for the listing revision package.
     *
     * @return the value
     */
    public Status getStatus() {
        return status;
    }

    /** Identifies whether security upgrades will be provided for this package. */
    @com.fasterxml.jackson.annotation.JsonProperty("areSecurityUpgradesProvided")
    private final Boolean areSecurityUpgradesProvided;

    /**
     * Identifies whether security upgrades will be provided for this package.
     *
     * @return the value
     */
    public Boolean getAreSecurityUpgradesProvided() {
        return areSecurityUpgradesProvided;
    }

    /** Identifies that this will be default package for the listing revision. */
    @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
    private final Boolean isDefault;

    /**
     * Identifies that this will be default package for the listing revision.
     *
     * @return the value
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    /**
     * The date and time this listing revision package was created, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time this listing revision package was created, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time this listing revision package was updated, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time this listing revision package was updated, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * Additional metadata key/value pairs for the listing revision package summary.
     *
     * <p>For example:
     *
     * <p>{@code {"partnerListingRevisionPackageStatus":
     * "Published","parentListingRevisionPackageId": "1" }}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("extendedMetadata")
    private final java.util.Map<String, String> extendedMetadata;

    /**
     * Additional metadata key/value pairs for the listing revision package summary.
     *
     * <p>For example:
     *
     * <p>{@code {"partnerListingRevisionPackageStatus":
     * "Published","parentListingRevisionPackageId": "1" }}
     *
     * @return the value
     */
    public java.util.Map<String, String> getExtendedMetadata() {
        return extendedMetadata;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
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
        sb.append("ListingRevisionPackage(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", listingRevisionId=").append(String.valueOf(this.listingRevisionId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", artifactId=").append(String.valueOf(this.artifactId));
        sb.append(", termId=").append(String.valueOf(this.termId));
        sb.append(", packageVersion=").append(String.valueOf(this.packageVersion));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", areSecurityUpgradesProvided=")
                .append(String.valueOf(this.areSecurityUpgradesProvided));
        sb.append(", isDefault=").append(String.valueOf(this.isDefault));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", extendedMetadata=").append(String.valueOf(this.extendedMetadata));
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
        if (!(o instanceof ListingRevisionPackage)) {
            return false;
        }

        ListingRevisionPackage other = (ListingRevisionPackage) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.listingRevisionId, other.listingRevisionId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.artifactId, other.artifactId)
                && java.util.Objects.equals(this.termId, other.termId)
                && java.util.Objects.equals(this.packageVersion, other.packageVersion)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(
                        this.areSecurityUpgradesProvided, other.areSecurityUpgradesProvided)
                && java.util.Objects.equals(this.isDefault, other.isDefault)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.extendedMetadata, other.extendedMetadata)
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
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.listingRevisionId == null ? 43 : this.listingRevisionId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.artifactId == null ? 43 : this.artifactId.hashCode());
        result = (result * PRIME) + (this.termId == null ? 43 : this.termId.hashCode());
        result =
                (result * PRIME)
                        + (this.packageVersion == null ? 43 : this.packageVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.areSecurityUpgradesProvided == null
                                ? 43
                                : this.areSecurityUpgradesProvided.hashCode());
        result = (result * PRIME) + (this.isDefault == null ? 43 : this.isDefault.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.extendedMetadata == null ? 43 : this.extendedMetadata.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
