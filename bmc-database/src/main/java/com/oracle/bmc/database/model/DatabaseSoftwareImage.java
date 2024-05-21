/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Database software images are created by specifying a patch set, one-off patches and patches for the database home (listed by {@code ls inventory}).
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DatabaseSoftwareImage.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DatabaseSoftwareImage
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "databaseVersion",
        "displayName",
        "lifecycleState",
        "lifecycleDetails",
        "timeCreated",
        "imageType",
        "imageShapeFamily",
        "patchSet",
        "freeformTags",
        "definedTags",
        "databaseSoftwareImageIncludedPatches",
        "includedPatchesSummary",
        "databaseSoftwareImageOneOffPatches",
        "lsInventory",
        "isUpgradeSupported"
    })
    public DatabaseSoftwareImage(
            String id,
            String compartmentId,
            String databaseVersion,
            String displayName,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Date timeCreated,
            ImageType imageType,
            ImageShapeFamily imageShapeFamily,
            String patchSet,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.List<String> databaseSoftwareImageIncludedPatches,
            String includedPatchesSummary,
            java.util.List<String> databaseSoftwareImageOneOffPatches,
            String lsInventory,
            Boolean isUpgradeSupported) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.databaseVersion = databaseVersion;
        this.displayName = displayName;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.timeCreated = timeCreated;
        this.imageType = imageType;
        this.imageShapeFamily = imageShapeFamily;
        this.patchSet = patchSet;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.databaseSoftwareImageIncludedPatches = databaseSoftwareImageIncludedPatches;
        this.includedPatchesSummary = includedPatchesSummary;
        this.databaseSoftwareImageOneOffPatches = databaseSoftwareImageOneOffPatches;
        this.lsInventory = lsInventory;
        this.isUpgradeSupported = isUpgradeSupported;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the database software image.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the database software image.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The database version with which the database software image is to be built.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("databaseVersion")
        private String databaseVersion;

        /**
         * The database version with which the database software image is to be built.
         * @param databaseVersion the value to set
         * @return this builder
         **/
        public Builder databaseVersion(String databaseVersion) {
            this.databaseVersion = databaseVersion;
            this.__explicitlySet__.add("databaseVersion");
            return this;
        }
        /**
         * The user-friendly name for the database software image. The name does not have to be unique.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly name for the database software image. The name does not have to be unique.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The current state of the database software image.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the database software image.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Detailed message for the lifecycle state.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Detailed message for the lifecycle state.
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * The date and time the database software image was created.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the database software image was created.
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The type of software image. Can be grid or database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("imageType")
        private ImageType imageType;

        /**
         * The type of software image. Can be grid or database.
         * @param imageType the value to set
         * @return this builder
         **/
        public Builder imageType(ImageType imageType) {
            this.imageType = imageType;
            this.__explicitlySet__.add("imageType");
            return this;
        }
        /**
         * To what shape the image is meant for.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("imageShapeFamily")
        private ImageShapeFamily imageShapeFamily;

        /**
         * To what shape the image is meant for.
         * @param imageShapeFamily the value to set
         * @return this builder
         **/
        public Builder imageShapeFamily(ImageShapeFamily imageShapeFamily) {
            this.imageShapeFamily = imageShapeFamily;
            this.__explicitlySet__.add("imageShapeFamily");
            return this;
        }
        /**
         * The PSU or PBP or Release Updates. To get a list of supported versions, use the {@link #listDbVersions(ListDbVersionsRequest) listDbVersions} operation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("patchSet")
        private String patchSet;

        /**
         * The PSU or PBP or Release Updates. To get a list of supported versions, use the {@link #listDbVersions(ListDbVersionsRequest) listDbVersions} operation.
         * @param patchSet the value to set
         * @return this builder
         **/
        public Builder patchSet(String patchSet) {
            this.patchSet = patchSet;
            this.__explicitlySet__.add("patchSet");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * <p>
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
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
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
        /**
         * List of one-off patches for Database Homes.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("databaseSoftwareImageIncludedPatches")
        private java.util.List<String> databaseSoftwareImageIncludedPatches;

        /**
         * List of one-off patches for Database Homes.
         * @param databaseSoftwareImageIncludedPatches the value to set
         * @return this builder
         **/
        public Builder databaseSoftwareImageIncludedPatches(
                java.util.List<String> databaseSoftwareImageIncludedPatches) {
            this.databaseSoftwareImageIncludedPatches = databaseSoftwareImageIncludedPatches;
            this.__explicitlySet__.add("databaseSoftwareImageIncludedPatches");
            return this;
        }
        /**
         * The patches included in the image and the version of the image.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("includedPatchesSummary")
        private String includedPatchesSummary;

        /**
         * The patches included in the image and the version of the image.
         * @param includedPatchesSummary the value to set
         * @return this builder
         **/
        public Builder includedPatchesSummary(String includedPatchesSummary) {
            this.includedPatchesSummary = includedPatchesSummary;
            this.__explicitlySet__.add("includedPatchesSummary");
            return this;
        }
        /**
         * List of one-off patches for Database Homes.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("databaseSoftwareImageOneOffPatches")
        private java.util.List<String> databaseSoftwareImageOneOffPatches;

        /**
         * List of one-off patches for Database Homes.
         * @param databaseSoftwareImageOneOffPatches the value to set
         * @return this builder
         **/
        public Builder databaseSoftwareImageOneOffPatches(
                java.util.List<String> databaseSoftwareImageOneOffPatches) {
            this.databaseSoftwareImageOneOffPatches = databaseSoftwareImageOneOffPatches;
            this.__explicitlySet__.add("databaseSoftwareImageOneOffPatches");
            return this;
        }
        /**
         * The output from the OPatch lsInventory command, which is passed as a string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lsInventory")
        private String lsInventory;

        /**
         * The output from the OPatch lsInventory command, which is passed as a string.
         * @param lsInventory the value to set
         * @return this builder
         **/
        public Builder lsInventory(String lsInventory) {
            this.lsInventory = lsInventory;
            this.__explicitlySet__.add("lsInventory");
            return this;
        }
        /**
         * True if this Database software image is supported for Upgrade.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isUpgradeSupported")
        private Boolean isUpgradeSupported;

        /**
         * True if this Database software image is supported for Upgrade.
         * @param isUpgradeSupported the value to set
         * @return this builder
         **/
        public Builder isUpgradeSupported(Boolean isUpgradeSupported) {
            this.isUpgradeSupported = isUpgradeSupported;
            this.__explicitlySet__.add("isUpgradeSupported");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DatabaseSoftwareImage build() {
            DatabaseSoftwareImage model =
                    new DatabaseSoftwareImage(
                            this.id,
                            this.compartmentId,
                            this.databaseVersion,
                            this.displayName,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.timeCreated,
                            this.imageType,
                            this.imageShapeFamily,
                            this.patchSet,
                            this.freeformTags,
                            this.definedTags,
                            this.databaseSoftwareImageIncludedPatches,
                            this.includedPatchesSummary,
                            this.databaseSoftwareImageOneOffPatches,
                            this.lsInventory,
                            this.isUpgradeSupported);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatabaseSoftwareImage model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("databaseVersion")) {
                this.databaseVersion(model.getDatabaseVersion());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("imageType")) {
                this.imageType(model.getImageType());
            }
            if (model.wasPropertyExplicitlySet("imageShapeFamily")) {
                this.imageShapeFamily(model.getImageShapeFamily());
            }
            if (model.wasPropertyExplicitlySet("patchSet")) {
                this.patchSet(model.getPatchSet());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("databaseSoftwareImageIncludedPatches")) {
                this.databaseSoftwareImageIncludedPatches(
                        model.getDatabaseSoftwareImageIncludedPatches());
            }
            if (model.wasPropertyExplicitlySet("includedPatchesSummary")) {
                this.includedPatchesSummary(model.getIncludedPatchesSummary());
            }
            if (model.wasPropertyExplicitlySet("databaseSoftwareImageOneOffPatches")) {
                this.databaseSoftwareImageOneOffPatches(
                        model.getDatabaseSoftwareImageOneOffPatches());
            }
            if (model.wasPropertyExplicitlySet("lsInventory")) {
                this.lsInventory(model.getLsInventory());
            }
            if (model.wasPropertyExplicitlySet("isUpgradeSupported")) {
                this.isUpgradeSupported(model.getIsUpgradeSupported());
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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the database software image.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the database software image.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The database version with which the database software image is to be built.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseVersion")
    private final String databaseVersion;

    /**
     * The database version with which the database software image is to be built.
     * @return the value
     **/
    public String getDatabaseVersion() {
        return databaseVersion;
    }

    /**
     * The user-friendly name for the database software image. The name does not have to be unique.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly name for the database software image. The name does not have to be unique.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The current state of the database software image.
     **/
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
    /**
     * The current state of the database software image.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the database software image.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Detailed message for the lifecycle state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Detailed message for the lifecycle state.
     * @return the value
     **/
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * The date and time the database software image was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the database software image was created.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The type of software image. Can be grid or database.
     **/
    public enum ImageType {
        GridImage("GRID_IMAGE"),
        DatabaseImage("DATABASE_IMAGE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ImageType.class);

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
    private final ImageType imageType;

    /**
     * The type of software image. Can be grid or database.
     * @return the value
     **/
    public ImageType getImageType() {
        return imageType;
    }

    /**
     * To what shape the image is meant for.
     **/
    public enum ImageShapeFamily {
        VmBmShape("VM_BM_SHAPE"),
        ExadataShape("EXADATA_SHAPE"),
        ExaccShape("EXACC_SHAPE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ImageShapeFamily.class);

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
    private final ImageShapeFamily imageShapeFamily;

    /**
     * To what shape the image is meant for.
     * @return the value
     **/
    public ImageShapeFamily getImageShapeFamily() {
        return imageShapeFamily;
    }

    /**
     * The PSU or PBP or Release Updates. To get a list of supported versions, use the {@link #listDbVersions(ListDbVersionsRequest) listDbVersions} operation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("patchSet")
    private final String patchSet;

    /**
     * The PSU or PBP or Release Updates. To get a list of supported versions, use the {@link #listDbVersions(ListDbVersionsRequest) listDbVersions} operation.
     * @return the value
     **/
    public String getPatchSet() {
        return patchSet;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * List of one-off patches for Database Homes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseSoftwareImageIncludedPatches")
    private final java.util.List<String> databaseSoftwareImageIncludedPatches;

    /**
     * List of one-off patches for Database Homes.
     * @return the value
     **/
    public java.util.List<String> getDatabaseSoftwareImageIncludedPatches() {
        return databaseSoftwareImageIncludedPatches;
    }

    /**
     * The patches included in the image and the version of the image.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("includedPatchesSummary")
    private final String includedPatchesSummary;

    /**
     * The patches included in the image and the version of the image.
     * @return the value
     **/
    public String getIncludedPatchesSummary() {
        return includedPatchesSummary;
    }

    /**
     * List of one-off patches for Database Homes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseSoftwareImageOneOffPatches")
    private final java.util.List<String> databaseSoftwareImageOneOffPatches;

    /**
     * List of one-off patches for Database Homes.
     * @return the value
     **/
    public java.util.List<String> getDatabaseSoftwareImageOneOffPatches() {
        return databaseSoftwareImageOneOffPatches;
    }

    /**
     * The output from the OPatch lsInventory command, which is passed as a string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lsInventory")
    private final String lsInventory;

    /**
     * The output from the OPatch lsInventory command, which is passed as a string.
     * @return the value
     **/
    public String getLsInventory() {
        return lsInventory;
    }

    /**
     * True if this Database software image is supported for Upgrade.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isUpgradeSupported")
    private final Boolean isUpgradeSupported;

    /**
     * True if this Database software image is supported for Upgrade.
     * @return the value
     **/
    public Boolean getIsUpgradeSupported() {
        return isUpgradeSupported;
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
        sb.append("DatabaseSoftwareImage(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", databaseVersion=").append(String.valueOf(this.databaseVersion));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", imageType=").append(String.valueOf(this.imageType));
        sb.append(", imageShapeFamily=").append(String.valueOf(this.imageShapeFamily));
        sb.append(", patchSet=").append(String.valueOf(this.patchSet));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", databaseSoftwareImageIncludedPatches=")
                .append(String.valueOf(this.databaseSoftwareImageIncludedPatches));
        sb.append(", includedPatchesSummary=").append(String.valueOf(this.includedPatchesSummary));
        sb.append(", databaseSoftwareImageOneOffPatches=")
                .append(String.valueOf(this.databaseSoftwareImageOneOffPatches));
        sb.append(", lsInventory=").append(String.valueOf(this.lsInventory));
        sb.append(", isUpgradeSupported=").append(String.valueOf(this.isUpgradeSupported));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatabaseSoftwareImage)) {
            return false;
        }

        DatabaseSoftwareImage other = (DatabaseSoftwareImage) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.databaseVersion, other.databaseVersion)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.imageType, other.imageType)
                && java.util.Objects.equals(this.imageShapeFamily, other.imageShapeFamily)
                && java.util.Objects.equals(this.patchSet, other.patchSet)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(
                        this.databaseSoftwareImageIncludedPatches,
                        other.databaseSoftwareImageIncludedPatches)
                && java.util.Objects.equals(
                        this.includedPatchesSummary, other.includedPatchesSummary)
                && java.util.Objects.equals(
                        this.databaseSoftwareImageOneOffPatches,
                        other.databaseSoftwareImageOneOffPatches)
                && java.util.Objects.equals(this.lsInventory, other.lsInventory)
                && java.util.Objects.equals(this.isUpgradeSupported, other.isUpgradeSupported)
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
        result =
                (result * PRIME)
                        + (this.databaseVersion == null ? 43 : this.databaseVersion.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.imageType == null ? 43 : this.imageType.hashCode());
        result =
                (result * PRIME)
                        + (this.imageShapeFamily == null ? 43 : this.imageShapeFamily.hashCode());
        result = (result * PRIME) + (this.patchSet == null ? 43 : this.patchSet.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseSoftwareImageIncludedPatches == null
                                ? 43
                                : this.databaseSoftwareImageIncludedPatches.hashCode());
        result =
                (result * PRIME)
                        + (this.includedPatchesSummary == null
                                ? 43
                                : this.includedPatchesSummary.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseSoftwareImageOneOffPatches == null
                                ? 43
                                : this.databaseSoftwareImageOneOffPatches.hashCode());
        result = (result * PRIME) + (this.lsInventory == null ? 43 : this.lsInventory.hashCode());
        result =
                (result * PRIME)
                        + (this.isUpgradeSupported == null
                                ? 43
                                : this.isUpgradeSupported.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
