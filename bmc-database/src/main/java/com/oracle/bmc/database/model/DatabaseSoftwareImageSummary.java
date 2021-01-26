/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The Database service supports the creation of database software images for use in creating and patching DB systems and databases.
 * <p>
 * To use any of the API operations, you must be authorized in an IAM policy. If you are not authorized, talk to an administrator. If you are an administrator who needs to write policies to give users access, see [Getting Started with Policies](https://docs.cloud.oracle.com/Content/Identity/Concepts/policygetstarted.htm).
 * <p>
 * For information about access control and compartments, see [Overview of the Identity Service](https://docs.cloud.oracle.com/Content/Identity/Concepts/overview.htm).
 * <p>
 **Warning:** Oracle recommends that you avoid using any confidential information when you supply string values using the API.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DatabaseSoftwareImageSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class DatabaseSoftwareImageSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseVersion")
        private String databaseVersion;

        public Builder databaseVersion(String databaseVersion) {
            this.databaseVersion = databaseVersion;
            this.__explicitlySet__.add("databaseVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("imageType")
        private ImageType imageType;

        public Builder imageType(ImageType imageType) {
            this.imageType = imageType;
            this.__explicitlySet__.add("imageType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("imageShapeFamily")
        private ImageShapeFamily imageShapeFamily;

        public Builder imageShapeFamily(ImageShapeFamily imageShapeFamily) {
            this.imageShapeFamily = imageShapeFamily;
            this.__explicitlySet__.add("imageShapeFamily");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("patchSet")
        private String patchSet;

        public Builder patchSet(String patchSet) {
            this.patchSet = patchSet;
            this.__explicitlySet__.add("patchSet");
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

        @com.fasterxml.jackson.annotation.JsonProperty("databaseSoftwareImageIncludedPatches")
        private java.util.List<String> databaseSoftwareImageIncludedPatches;

        public Builder databaseSoftwareImageIncludedPatches(
                java.util.List<String> databaseSoftwareImageIncludedPatches) {
            this.databaseSoftwareImageIncludedPatches = databaseSoftwareImageIncludedPatches;
            this.__explicitlySet__.add("databaseSoftwareImageIncludedPatches");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("includedPatchesSummary")
        private String includedPatchesSummary;

        public Builder includedPatchesSummary(String includedPatchesSummary) {
            this.includedPatchesSummary = includedPatchesSummary;
            this.__explicitlySet__.add("includedPatchesSummary");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseSoftwareImageOneOffPatches")
        private java.util.List<String> databaseSoftwareImageOneOffPatches;

        public Builder databaseSoftwareImageOneOffPatches(
                java.util.List<String> databaseSoftwareImageOneOffPatches) {
            this.databaseSoftwareImageOneOffPatches = databaseSoftwareImageOneOffPatches;
            this.__explicitlySet__.add("databaseSoftwareImageOneOffPatches");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lsInventory")
        private String lsInventory;

        public Builder lsInventory(String lsInventory) {
            this.lsInventory = lsInventory;
            this.__explicitlySet__.add("lsInventory");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isUpgradeSupported")
        private Boolean isUpgradeSupported;

        public Builder isUpgradeSupported(Boolean isUpgradeSupported) {
            this.isUpgradeSupported = isUpgradeSupported;
            this.__explicitlySet__.add("isUpgradeSupported");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DatabaseSoftwareImageSummary build() {
            DatabaseSoftwareImageSummary __instance__ =
                    new DatabaseSoftwareImageSummary(
                            id,
                            compartmentId,
                            databaseVersion,
                            displayName,
                            lifecycleState,
                            lifecycleDetails,
                            timeCreated,
                            imageType,
                            imageShapeFamily,
                            patchSet,
                            freeformTags,
                            definedTags,
                            databaseSoftwareImageIncludedPatches,
                            includedPatchesSummary,
                            databaseSoftwareImageOneOffPatches,
                            lsInventory,
                            isUpgradeSupported);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatabaseSoftwareImageSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .compartmentId(o.getCompartmentId())
                            .databaseVersion(o.getDatabaseVersion())
                            .displayName(o.getDisplayName())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleDetails(o.getLifecycleDetails())
                            .timeCreated(o.getTimeCreated())
                            .imageType(o.getImageType())
                            .imageShapeFamily(o.getImageShapeFamily())
                            .patchSet(o.getPatchSet())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .databaseSoftwareImageIncludedPatches(
                                    o.getDatabaseSoftwareImageIncludedPatches())
                            .includedPatchesSummary(o.getIncludedPatchesSummary())
                            .databaseSoftwareImageOneOffPatches(
                                    o.getDatabaseSoftwareImageOneOffPatches())
                            .lsInventory(o.getLsInventory())
                            .isUpgradeSupported(o.getIsUpgradeSupported());

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

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the database software image.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The database version with which the database software image is to be built.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseVersion")
    String databaseVersion;

    /**
     * The user-friendly name for the database software image. The name does not have to be unique.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;
    /**
     * The current state of the database software image.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
        Provisioning("PROVISIONING"),
        Available("AVAILABLE"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Failed("FAILED"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),
        Updating("UPDATING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
    /**
     * The current state of the database software image.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * Detailed message for the lifecycle state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    String lifecycleDetails;

    /**
     * The date and time the database software image was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;
    /**
     * The type of software image. Can be grid or database.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum ImageType {
        GridImage("GRID_IMAGE"),
        DatabaseImage("DATABASE_IMAGE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, ImageType> map;

        static {
            map = new java.util.HashMap<>();
            for (ImageType v : ImageType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ImageType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ImageType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ImageType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of software image. Can be grid or database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("imageType")
    ImageType imageType;
    /**
     * To what shape the image is meant for.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum ImageShapeFamily {
        VmBmShape("VM_BM_SHAPE"),
        ExadataShape("EXADATA_SHAPE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, ImageShapeFamily> map;

        static {
            map = new java.util.HashMap<>();
            for (ImageShapeFamily v : ImageShapeFamily.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ImageShapeFamily(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ImageShapeFamily create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ImageShapeFamily', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * To what shape the image is meant for.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("imageShapeFamily")
    ImageShapeFamily imageShapeFamily;

    /**
     * The PSU or PBP or Release Updates. To get a list of supported versions, use the {@link #listDbVersions(ListDbVersionsRequest) listDbVersions} operation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("patchSet")
    String patchSet;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: `{\"Department\": \"Finance\"}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * List of one-off patches for Database Homes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseSoftwareImageIncludedPatches")
    java.util.List<String> databaseSoftwareImageIncludedPatches;

    /**
     * The patches included in the image and the version of the image
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("includedPatchesSummary")
    String includedPatchesSummary;

    /**
     * List of one-off patches for Database Homes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseSoftwareImageOneOffPatches")
    java.util.List<String> databaseSoftwareImageOneOffPatches;

    /**
     * output from lsinventory which will get passed as a string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lsInventory")
    String lsInventory;

    /**
     * True if this Database software image is supported for Upgrade.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isUpgradeSupported")
    Boolean isUpgradeSupported;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
