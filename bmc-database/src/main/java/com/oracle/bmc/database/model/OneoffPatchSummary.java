/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * An Oracle one-off patch for a specified database version.
 *
 * <p>To use any of the API operations, you must be authorized in an IAM policy. If you're not
 * authorized, talk to an administrator. If you're an administrator who needs to write policies to
 * give users access, see [Getting Started with
 * Policies](https://docs.cloud.oracle.com/Content/Identity/Concepts/policygetstarted.htm).
 *
 * <p>*Warning:** Oracle recommends that you avoid using any confidential information when you
 * supply string values using the API. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = OneoffPatchSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OneoffPatchSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "displayName",
        "dbVersion",
        "releaseUpdate",
        "oneOffPatches",
        "sizeInKBs",
        "lifecycleState",
        "lifecycleDetails",
        "sha256Sum",
        "timeUpdated",
        "timeCreated",
        "timeOfExpiration",
        "freeformTags",
        "definedTags"
    })
    public OneoffPatchSummary(
            String id,
            String compartmentId,
            String displayName,
            String dbVersion,
            String releaseUpdate,
            java.util.List<String> oneOffPatches,
            Float sizeInKBs,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            String sha256Sum,
            java.util.Date timeUpdated,
            java.util.Date timeCreated,
            java.util.Date timeOfExpiration,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.dbVersion = dbVersion;
        this.releaseUpdate = releaseUpdate;
        this.oneOffPatches = oneOffPatches;
        this.sizeInKBs = sizeInKBs;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.sha256Sum = sha256Sum;
        this.timeUpdated = timeUpdated;
        this.timeCreated = timeCreated;
        this.timeOfExpiration = timeOfExpiration;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * one-off patch.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * one-off patch.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** One-off patch name. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * One-off patch name.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * A valid Oracle Database version. For a list of supported versions, use the ListDbVersions
         * operation.
         *
         * <p>This cannot be updated in parallel with any of the following: licenseModel, dbEdition,
         * cpuCoreCount, computeCount, computeModel, adminPassword, whitelistedIps,
         * isMTLSConnectionRequired, openMode, permissionLevel, dbWorkload, privateEndpointLabel,
         * nsgIds, isRefreshable, dbName, scheduledOperations, dbToolsDetails,
         * isLocalDataGuardEnabled, or isFreeTier.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dbVersion")
        private String dbVersion;

        /**
         * A valid Oracle Database version. For a list of supported versions, use the ListDbVersions
         * operation.
         *
         * <p>This cannot be updated in parallel with any of the following: licenseModel, dbEdition,
         * cpuCoreCount, computeCount, computeModel, adminPassword, whitelistedIps,
         * isMTLSConnectionRequired, openMode, permissionLevel, dbWorkload, privateEndpointLabel,
         * nsgIds, isRefreshable, dbName, scheduledOperations, dbToolsDetails,
         * isLocalDataGuardEnabled, or isFreeTier.
         *
         * @param dbVersion the value to set
         * @return this builder
         */
        public Builder dbVersion(String dbVersion) {
            this.dbVersion = dbVersion;
            this.__explicitlySet__.add("dbVersion");
            return this;
        }
        /**
         * The PSU or PBP or Release Updates. To get a list of supported versions, use the {@link
         * #listDbVersions(ListDbVersionsRequest) listDbVersions} operation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("releaseUpdate")
        private String releaseUpdate;

        /**
         * The PSU or PBP or Release Updates. To get a list of supported versions, use the {@link
         * #listDbVersions(ListDbVersionsRequest) listDbVersions} operation.
         *
         * @param releaseUpdate the value to set
         * @return this builder
         */
        public Builder releaseUpdate(String releaseUpdate) {
            this.releaseUpdate = releaseUpdate;
            this.__explicitlySet__.add("releaseUpdate");
            return this;
        }
        /** List of one-off patches for Database Homes. */
        @com.fasterxml.jackson.annotation.JsonProperty("oneOffPatches")
        private java.util.List<String> oneOffPatches;

        /**
         * List of one-off patches for Database Homes.
         *
         * @param oneOffPatches the value to set
         * @return this builder
         */
        public Builder oneOffPatches(java.util.List<String> oneOffPatches) {
            this.oneOffPatches = oneOffPatches;
            this.__explicitlySet__.add("oneOffPatches");
            return this;
        }
        /** The size of one-off patch in kilobytes. */
        @com.fasterxml.jackson.annotation.JsonProperty("sizeInKBs")
        private Float sizeInKBs;

        /**
         * The size of one-off patch in kilobytes.
         *
         * @param sizeInKBs the value to set
         * @return this builder
         */
        public Builder sizeInKBs(Float sizeInKBs) {
            this.sizeInKBs = sizeInKBs;
            this.__explicitlySet__.add("sizeInKBs");
            return this;
        }
        /** The current state of the one-off patch. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the one-off patch.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** Detailed message for the lifecycle state. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Detailed message for the lifecycle state.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /** SHA-256 checksum of the one-off patch. */
        @com.fasterxml.jackson.annotation.JsonProperty("sha256Sum")
        private String sha256Sum;

        /**
         * SHA-256 checksum of the one-off patch.
         *
         * @param sha256Sum the value to set
         * @return this builder
         */
        public Builder sha256Sum(String sha256Sum) {
            this.sha256Sum = sha256Sum;
            this.__explicitlySet__.add("sha256Sum");
            return this;
        }
        /** The date and time one-off patch was updated. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time one-off patch was updated.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The date and time one-off patch was created. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time one-off patch was created.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The date and time until which the one-off patch will be available for download. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfExpiration")
        private java.util.Date timeOfExpiration;

        /**
         * The date and time until which the one-off patch will be available for download.
         *
         * @param timeOfExpiration the value to set
         * @return this builder
         */
        public Builder timeOfExpiration(java.util.Date timeOfExpiration) {
            this.timeOfExpiration = timeOfExpiration;
            this.__explicitlySet__.add("timeOfExpiration");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OneoffPatchSummary build() {
            OneoffPatchSummary model =
                    new OneoffPatchSummary(
                            this.id,
                            this.compartmentId,
                            this.displayName,
                            this.dbVersion,
                            this.releaseUpdate,
                            this.oneOffPatches,
                            this.sizeInKBs,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.sha256Sum,
                            this.timeUpdated,
                            this.timeCreated,
                            this.timeOfExpiration,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OneoffPatchSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("dbVersion")) {
                this.dbVersion(model.getDbVersion());
            }
            if (model.wasPropertyExplicitlySet("releaseUpdate")) {
                this.releaseUpdate(model.getReleaseUpdate());
            }
            if (model.wasPropertyExplicitlySet("oneOffPatches")) {
                this.oneOffPatches(model.getOneOffPatches());
            }
            if (model.wasPropertyExplicitlySet("sizeInKBs")) {
                this.sizeInKBs(model.getSizeInKBs());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("sha256Sum")) {
                this.sha256Sum(model.getSha256Sum());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeOfExpiration")) {
                this.timeOfExpiration(model.getTimeOfExpiration());
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

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * one-off patch.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * one-off patch.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** One-off patch name. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * One-off patch name.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * A valid Oracle Database version. For a list of supported versions, use the ListDbVersions
     * operation.
     *
     * <p>This cannot be updated in parallel with any of the following: licenseModel, dbEdition,
     * cpuCoreCount, computeCount, computeModel, adminPassword, whitelistedIps,
     * isMTLSConnectionRequired, openMode, permissionLevel, dbWorkload, privateEndpointLabel,
     * nsgIds, isRefreshable, dbName, scheduledOperations, dbToolsDetails, isLocalDataGuardEnabled,
     * or isFreeTier.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dbVersion")
    private final String dbVersion;

    /**
     * A valid Oracle Database version. For a list of supported versions, use the ListDbVersions
     * operation.
     *
     * <p>This cannot be updated in parallel with any of the following: licenseModel, dbEdition,
     * cpuCoreCount, computeCount, computeModel, adminPassword, whitelistedIps,
     * isMTLSConnectionRequired, openMode, permissionLevel, dbWorkload, privateEndpointLabel,
     * nsgIds, isRefreshable, dbName, scheduledOperations, dbToolsDetails, isLocalDataGuardEnabled,
     * or isFreeTier.
     *
     * @return the value
     */
    public String getDbVersion() {
        return dbVersion;
    }

    /**
     * The PSU or PBP or Release Updates. To get a list of supported versions, use the {@link
     * #listDbVersions(ListDbVersionsRequest) listDbVersions} operation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("releaseUpdate")
    private final String releaseUpdate;

    /**
     * The PSU or PBP or Release Updates. To get a list of supported versions, use the {@link
     * #listDbVersions(ListDbVersionsRequest) listDbVersions} operation.
     *
     * @return the value
     */
    public String getReleaseUpdate() {
        return releaseUpdate;
    }

    /** List of one-off patches for Database Homes. */
    @com.fasterxml.jackson.annotation.JsonProperty("oneOffPatches")
    private final java.util.List<String> oneOffPatches;

    /**
     * List of one-off patches for Database Homes.
     *
     * @return the value
     */
    public java.util.List<String> getOneOffPatches() {
        return oneOffPatches;
    }

    /** The size of one-off patch in kilobytes. */
    @com.fasterxml.jackson.annotation.JsonProperty("sizeInKBs")
    private final Float sizeInKBs;

    /**
     * The size of one-off patch in kilobytes.
     *
     * @return the value
     */
    public Float getSizeInKBs() {
        return sizeInKBs;
    }

    /** The current state of the one-off patch. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Available("AVAILABLE"),
        Updating("UPDATING"),
        Inactive("INACTIVE"),
        Failed("FAILED"),
        Expired("EXPIRED"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),

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
    /** The current state of the one-off patch. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the one-off patch.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** Detailed message for the lifecycle state. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Detailed message for the lifecycle state.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /** SHA-256 checksum of the one-off patch. */
    @com.fasterxml.jackson.annotation.JsonProperty("sha256Sum")
    private final String sha256Sum;

    /**
     * SHA-256 checksum of the one-off patch.
     *
     * @return the value
     */
    public String getSha256Sum() {
        return sha256Sum;
    }

    /** The date and time one-off patch was updated. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time one-off patch was updated.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The date and time one-off patch was created. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time one-off patch was created.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The date and time until which the one-off patch will be available for download. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfExpiration")
    private final java.util.Date timeOfExpiration;

    /**
     * The date and time until which the one-off patch will be available for download.
     *
     * @return the value
     */
    public java.util.Date getTimeOfExpiration() {
        return timeOfExpiration;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
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
        sb.append("OneoffPatchSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", dbVersion=").append(String.valueOf(this.dbVersion));
        sb.append(", releaseUpdate=").append(String.valueOf(this.releaseUpdate));
        sb.append(", oneOffPatches=").append(String.valueOf(this.oneOffPatches));
        sb.append(", sizeInKBs=").append(String.valueOf(this.sizeInKBs));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", sha256Sum=").append(String.valueOf(this.sha256Sum));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeOfExpiration=").append(String.valueOf(this.timeOfExpiration));
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
        if (!(o instanceof OneoffPatchSummary)) {
            return false;
        }

        OneoffPatchSummary other = (OneoffPatchSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.dbVersion, other.dbVersion)
                && java.util.Objects.equals(this.releaseUpdate, other.releaseUpdate)
                && java.util.Objects.equals(this.oneOffPatches, other.oneOffPatches)
                && java.util.Objects.equals(this.sizeInKBs, other.sizeInKBs)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.sha256Sum, other.sha256Sum)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeOfExpiration, other.timeOfExpiration)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
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
        result = (result * PRIME) + (this.dbVersion == null ? 43 : this.dbVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.releaseUpdate == null ? 43 : this.releaseUpdate.hashCode());
        result =
                (result * PRIME)
                        + (this.oneOffPatches == null ? 43 : this.oneOffPatches.hashCode());
        result = (result * PRIME) + (this.sizeInKBs == null ? 43 : this.sizeInKBs.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.sha256Sum == null ? 43 : this.sha256Sum.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOfExpiration == null ? 43 : this.timeOfExpiration.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
