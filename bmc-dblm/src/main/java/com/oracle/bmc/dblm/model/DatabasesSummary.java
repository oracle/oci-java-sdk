/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dblm.model;

/**
 * Summary of a databases. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240102")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DatabasesSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DatabasesSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "databaseId",
        "databaseName",
        "databaseType",
        "release",
        "releaseFullVersion",
        "oracleHomePath",
        "currentPatchWatermark",
        "hostOrCluster",
        "imageDetails",
        "patchComplianceDetails",
        "patchActivityDetails",
        "patchUser",
        "sudoFilePath",
        "additionalPatches",
        "vulnerabilitiesSummary",
        "lifecycleState",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public DatabasesSummary(
            String databaseId,
            String databaseName,
            DatabaseType databaseType,
            String release,
            String releaseFullVersion,
            String oracleHomePath,
            String currentPatchWatermark,
            String hostOrCluster,
            ImageDetails imageDetails,
            PatchComplianceDetails patchComplianceDetails,
            PatchActivityDetails patchActivityDetails,
            String patchUser,
            String sudoFilePath,
            java.util.List<AdditionalPatches> additionalPatches,
            Object vulnerabilitiesSummary,
            LifecycleState lifecycleState,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.databaseId = databaseId;
        this.databaseName = databaseName;
        this.databaseType = databaseType;
        this.release = release;
        this.releaseFullVersion = releaseFullVersion;
        this.oracleHomePath = oracleHomePath;
        this.currentPatchWatermark = currentPatchWatermark;
        this.hostOrCluster = hostOrCluster;
        this.imageDetails = imageDetails;
        this.patchComplianceDetails = patchComplianceDetails;
        this.patchActivityDetails = patchActivityDetails;
        this.patchUser = patchUser;
        this.sudoFilePath = sudoFilePath;
        this.additionalPatches = additionalPatches;
        this.vulnerabilitiesSummary = vulnerabilitiesSummary;
        this.lifecycleState = lifecycleState;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Database ocid. */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseId")
        private String databaseId;

        /**
         * Database ocid.
         *
         * @param databaseId the value to set
         * @return this builder
         */
        public Builder databaseId(String databaseId) {
            this.databaseId = databaseId;
            this.__explicitlySet__.add("databaseId");
            return this;
        }
        /** Database name. */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseName")
        private String databaseName;

        /**
         * Database name.
         *
         * @param databaseName the value to set
         * @return this builder
         */
        public Builder databaseName(String databaseName) {
            this.databaseName = databaseName;
            this.__explicitlySet__.add("databaseName");
            return this;
        }
        /** Database type. */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseType")
        private DatabaseType databaseType;

        /**
         * Database type.
         *
         * @param databaseType the value to set
         * @return this builder
         */
        public Builder databaseType(DatabaseType databaseType) {
            this.databaseType = databaseType;
            this.__explicitlySet__.add("databaseType");
            return this;
        }
        /** Database release. */
        @com.fasterxml.jackson.annotation.JsonProperty("release")
        private String release;

        /**
         * Database release.
         *
         * @param release the value to set
         * @return this builder
         */
        public Builder release(String release) {
            this.release = release;
            this.__explicitlySet__.add("release");
            return this;
        }
        /** Database release full version. */
        @com.fasterxml.jackson.annotation.JsonProperty("releaseFullVersion")
        private String releaseFullVersion;

        /**
         * Database release full version.
         *
         * @param releaseFullVersion the value to set
         * @return this builder
         */
        public Builder releaseFullVersion(String releaseFullVersion) {
            this.releaseFullVersion = releaseFullVersion;
            this.__explicitlySet__.add("releaseFullVersion");
            return this;
        }
        /** Path to the Oracle home. */
        @com.fasterxml.jackson.annotation.JsonProperty("oracleHomePath")
        private String oracleHomePath;

        /**
         * Path to the Oracle home.
         *
         * @param oracleHomePath the value to set
         * @return this builder
         */
        public Builder oracleHomePath(String oracleHomePath) {
            this.oracleHomePath = oracleHomePath;
            this.__explicitlySet__.add("oracleHomePath");
            return this;
        }
        /** This is the hashcode representing the list of patches applied. */
        @com.fasterxml.jackson.annotation.JsonProperty("currentPatchWatermark")
        private String currentPatchWatermark;

        /**
         * This is the hashcode representing the list of patches applied.
         *
         * @param currentPatchWatermark the value to set
         * @return this builder
         */
        public Builder currentPatchWatermark(String currentPatchWatermark) {
            this.currentPatchWatermark = currentPatchWatermark;
            this.__explicitlySet__.add("currentPatchWatermark");
            return this;
        }
        /** For SI, hosted on host and for RAC, host on cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("hostOrCluster")
        private String hostOrCluster;

        /**
         * For SI, hosted on host and for RAC, host on cluster.
         *
         * @param hostOrCluster the value to set
         * @return this builder
         */
        public Builder hostOrCluster(String hostOrCluster) {
            this.hostOrCluster = hostOrCluster;
            this.__explicitlySet__.add("hostOrCluster");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("imageDetails")
        private ImageDetails imageDetails;

        public Builder imageDetails(ImageDetails imageDetails) {
            this.imageDetails = imageDetails;
            this.__explicitlySet__.add("imageDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("patchComplianceDetails")
        private PatchComplianceDetails patchComplianceDetails;

        public Builder patchComplianceDetails(PatchComplianceDetails patchComplianceDetails) {
            this.patchComplianceDetails = patchComplianceDetails;
            this.__explicitlySet__.add("patchComplianceDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("patchActivityDetails")
        private PatchActivityDetails patchActivityDetails;

        public Builder patchActivityDetails(PatchActivityDetails patchActivityDetails) {
            this.patchActivityDetails = patchActivityDetails;
            this.__explicitlySet__.add("patchActivityDetails");
            return this;
        }
        /**
         * Intermediate user to be used for patching, created and maintained by customers. This user
         * requires sudo access to switch as Oracle home owner and root user
         */
        @com.fasterxml.jackson.annotation.JsonProperty("patchUser")
        private String patchUser;

        /**
         * Intermediate user to be used for patching, created and maintained by customers. This user
         * requires sudo access to switch as Oracle home owner and root user
         *
         * @param patchUser the value to set
         * @return this builder
         */
        public Builder patchUser(String patchUser) {
            this.patchUser = patchUser;
            this.__explicitlySet__.add("patchUser");
            return this;
        }
        /** Path to sudo binary (executable) file */
        @com.fasterxml.jackson.annotation.JsonProperty("sudoFilePath")
        private String sudoFilePath;

        /**
         * Path to sudo binary (executable) file
         *
         * @param sudoFilePath the value to set
         * @return this builder
         */
        public Builder sudoFilePath(String sudoFilePath) {
            this.sudoFilePath = sudoFilePath;
            this.__explicitlySet__.add("sudoFilePath");
            return this;
        }
        /** List of additional patches on database. */
        @com.fasterxml.jackson.annotation.JsonProperty("additionalPatches")
        private java.util.List<AdditionalPatches> additionalPatches;

        /**
         * List of additional patches on database.
         *
         * @param additionalPatches the value to set
         * @return this builder
         */
        public Builder additionalPatches(java.util.List<AdditionalPatches> additionalPatches) {
            this.additionalPatches = additionalPatches;
            this.__explicitlySet__.add("additionalPatches");
            return this;
        }
        /** Summary of vulnerabilities found in registered resources grouped by severity. */
        @com.fasterxml.jackson.annotation.JsonProperty("vulnerabilitiesSummary")
        private Object vulnerabilitiesSummary;

        /**
         * Summary of vulnerabilities found in registered resources grouped by severity.
         *
         * @param vulnerabilitiesSummary the value to set
         * @return this builder
         */
        public Builder vulnerabilitiesSummary(Object vulnerabilitiesSummary) {
            this.vulnerabilitiesSummary = vulnerabilitiesSummary;
            this.__explicitlySet__.add("vulnerabilitiesSummary");
            return this;
        }
        /** The current state of the database. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the database.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
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
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
         * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
         * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DatabasesSummary build() {
            DatabasesSummary model =
                    new DatabasesSummary(
                            this.databaseId,
                            this.databaseName,
                            this.databaseType,
                            this.release,
                            this.releaseFullVersion,
                            this.oracleHomePath,
                            this.currentPatchWatermark,
                            this.hostOrCluster,
                            this.imageDetails,
                            this.patchComplianceDetails,
                            this.patchActivityDetails,
                            this.patchUser,
                            this.sudoFilePath,
                            this.additionalPatches,
                            this.vulnerabilitiesSummary,
                            this.lifecycleState,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatabasesSummary model) {
            if (model.wasPropertyExplicitlySet("databaseId")) {
                this.databaseId(model.getDatabaseId());
            }
            if (model.wasPropertyExplicitlySet("databaseName")) {
                this.databaseName(model.getDatabaseName());
            }
            if (model.wasPropertyExplicitlySet("databaseType")) {
                this.databaseType(model.getDatabaseType());
            }
            if (model.wasPropertyExplicitlySet("release")) {
                this.release(model.getRelease());
            }
            if (model.wasPropertyExplicitlySet("releaseFullVersion")) {
                this.releaseFullVersion(model.getReleaseFullVersion());
            }
            if (model.wasPropertyExplicitlySet("oracleHomePath")) {
                this.oracleHomePath(model.getOracleHomePath());
            }
            if (model.wasPropertyExplicitlySet("currentPatchWatermark")) {
                this.currentPatchWatermark(model.getCurrentPatchWatermark());
            }
            if (model.wasPropertyExplicitlySet("hostOrCluster")) {
                this.hostOrCluster(model.getHostOrCluster());
            }
            if (model.wasPropertyExplicitlySet("imageDetails")) {
                this.imageDetails(model.getImageDetails());
            }
            if (model.wasPropertyExplicitlySet("patchComplianceDetails")) {
                this.patchComplianceDetails(model.getPatchComplianceDetails());
            }
            if (model.wasPropertyExplicitlySet("patchActivityDetails")) {
                this.patchActivityDetails(model.getPatchActivityDetails());
            }
            if (model.wasPropertyExplicitlySet("patchUser")) {
                this.patchUser(model.getPatchUser());
            }
            if (model.wasPropertyExplicitlySet("sudoFilePath")) {
                this.sudoFilePath(model.getSudoFilePath());
            }
            if (model.wasPropertyExplicitlySet("additionalPatches")) {
                this.additionalPatches(model.getAdditionalPatches());
            }
            if (model.wasPropertyExplicitlySet("vulnerabilitiesSummary")) {
                this.vulnerabilitiesSummary(model.getVulnerabilitiesSummary());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
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

    /** Database ocid. */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseId")
    private final String databaseId;

    /**
     * Database ocid.
     *
     * @return the value
     */
    public String getDatabaseId() {
        return databaseId;
    }

    /** Database name. */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseName")
    private final String databaseName;

    /**
     * Database name.
     *
     * @return the value
     */
    public String getDatabaseName() {
        return databaseName;
    }

    /** Database type. */
    public enum DatabaseType implements com.oracle.bmc.http.internal.BmcEnum {
        Si("SI"),
        Rac("RAC"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DatabaseType.class);

        private final String value;
        private static java.util.Map<String, DatabaseType> map;

        static {
            map = new java.util.HashMap<>();
            for (DatabaseType v : DatabaseType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DatabaseType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DatabaseType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DatabaseType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Database type. */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseType")
    private final DatabaseType databaseType;

    /**
     * Database type.
     *
     * @return the value
     */
    public DatabaseType getDatabaseType() {
        return databaseType;
    }

    /** Database release. */
    @com.fasterxml.jackson.annotation.JsonProperty("release")
    private final String release;

    /**
     * Database release.
     *
     * @return the value
     */
    public String getRelease() {
        return release;
    }

    /** Database release full version. */
    @com.fasterxml.jackson.annotation.JsonProperty("releaseFullVersion")
    private final String releaseFullVersion;

    /**
     * Database release full version.
     *
     * @return the value
     */
    public String getReleaseFullVersion() {
        return releaseFullVersion;
    }

    /** Path to the Oracle home. */
    @com.fasterxml.jackson.annotation.JsonProperty("oracleHomePath")
    private final String oracleHomePath;

    /**
     * Path to the Oracle home.
     *
     * @return the value
     */
    public String getOracleHomePath() {
        return oracleHomePath;
    }

    /** This is the hashcode representing the list of patches applied. */
    @com.fasterxml.jackson.annotation.JsonProperty("currentPatchWatermark")
    private final String currentPatchWatermark;

    /**
     * This is the hashcode representing the list of patches applied.
     *
     * @return the value
     */
    public String getCurrentPatchWatermark() {
        return currentPatchWatermark;
    }

    /** For SI, hosted on host and for RAC, host on cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("hostOrCluster")
    private final String hostOrCluster;

    /**
     * For SI, hosted on host and for RAC, host on cluster.
     *
     * @return the value
     */
    public String getHostOrCluster() {
        return hostOrCluster;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("imageDetails")
    private final ImageDetails imageDetails;

    public ImageDetails getImageDetails() {
        return imageDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("patchComplianceDetails")
    private final PatchComplianceDetails patchComplianceDetails;

    public PatchComplianceDetails getPatchComplianceDetails() {
        return patchComplianceDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("patchActivityDetails")
    private final PatchActivityDetails patchActivityDetails;

    public PatchActivityDetails getPatchActivityDetails() {
        return patchActivityDetails;
    }

    /**
     * Intermediate user to be used for patching, created and maintained by customers. This user
     * requires sudo access to switch as Oracle home owner and root user
     */
    @com.fasterxml.jackson.annotation.JsonProperty("patchUser")
    private final String patchUser;

    /**
     * Intermediate user to be used for patching, created and maintained by customers. This user
     * requires sudo access to switch as Oracle home owner and root user
     *
     * @return the value
     */
    public String getPatchUser() {
        return patchUser;
    }

    /** Path to sudo binary (executable) file */
    @com.fasterxml.jackson.annotation.JsonProperty("sudoFilePath")
    private final String sudoFilePath;

    /**
     * Path to sudo binary (executable) file
     *
     * @return the value
     */
    public String getSudoFilePath() {
        return sudoFilePath;
    }

    /** List of additional patches on database. */
    @com.fasterxml.jackson.annotation.JsonProperty("additionalPatches")
    private final java.util.List<AdditionalPatches> additionalPatches;

    /**
     * List of additional patches on database.
     *
     * @return the value
     */
    public java.util.List<AdditionalPatches> getAdditionalPatches() {
        return additionalPatches;
    }

    /** Summary of vulnerabilities found in registered resources grouped by severity. */
    @com.fasterxml.jackson.annotation.JsonProperty("vulnerabilitiesSummary")
    private final Object vulnerabilitiesSummary;

    /**
     * Summary of vulnerabilities found in registered resources grouped by severity.
     *
     * @return the value
     */
    public Object getVulnerabilitiesSummary() {
        return vulnerabilitiesSummary;
    }

    /** The current state of the database. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Updating("UPDATING"),
        Active("ACTIVE"),
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
    /** The current state of the database. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the database.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
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
        sb.append("DatabasesSummary(");
        sb.append("super=").append(super.toString());
        sb.append("databaseId=").append(String.valueOf(this.databaseId));
        sb.append(", databaseName=").append(String.valueOf(this.databaseName));
        sb.append(", databaseType=").append(String.valueOf(this.databaseType));
        sb.append(", release=").append(String.valueOf(this.release));
        sb.append(", releaseFullVersion=").append(String.valueOf(this.releaseFullVersion));
        sb.append(", oracleHomePath=").append(String.valueOf(this.oracleHomePath));
        sb.append(", currentPatchWatermark=").append(String.valueOf(this.currentPatchWatermark));
        sb.append(", hostOrCluster=").append(String.valueOf(this.hostOrCluster));
        sb.append(", imageDetails=").append(String.valueOf(this.imageDetails));
        sb.append(", patchComplianceDetails=").append(String.valueOf(this.patchComplianceDetails));
        sb.append(", patchActivityDetails=").append(String.valueOf(this.patchActivityDetails));
        sb.append(", patchUser=").append(String.valueOf(this.patchUser));
        sb.append(", sudoFilePath=").append(String.valueOf(this.sudoFilePath));
        sb.append(", additionalPatches=").append(String.valueOf(this.additionalPatches));
        sb.append(", vulnerabilitiesSummary=").append(String.valueOf(this.vulnerabilitiesSummary));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
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
        if (!(o instanceof DatabasesSummary)) {
            return false;
        }

        DatabasesSummary other = (DatabasesSummary) o;
        return java.util.Objects.equals(this.databaseId, other.databaseId)
                && java.util.Objects.equals(this.databaseName, other.databaseName)
                && java.util.Objects.equals(this.databaseType, other.databaseType)
                && java.util.Objects.equals(this.release, other.release)
                && java.util.Objects.equals(this.releaseFullVersion, other.releaseFullVersion)
                && java.util.Objects.equals(this.oracleHomePath, other.oracleHomePath)
                && java.util.Objects.equals(this.currentPatchWatermark, other.currentPatchWatermark)
                && java.util.Objects.equals(this.hostOrCluster, other.hostOrCluster)
                && java.util.Objects.equals(this.imageDetails, other.imageDetails)
                && java.util.Objects.equals(
                        this.patchComplianceDetails, other.patchComplianceDetails)
                && java.util.Objects.equals(this.patchActivityDetails, other.patchActivityDetails)
                && java.util.Objects.equals(this.patchUser, other.patchUser)
                && java.util.Objects.equals(this.sudoFilePath, other.sudoFilePath)
                && java.util.Objects.equals(this.additionalPatches, other.additionalPatches)
                && java.util.Objects.equals(
                        this.vulnerabilitiesSummary, other.vulnerabilitiesSummary)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.databaseId == null ? 43 : this.databaseId.hashCode());
        result = (result * PRIME) + (this.databaseName == null ? 43 : this.databaseName.hashCode());
        result = (result * PRIME) + (this.databaseType == null ? 43 : this.databaseType.hashCode());
        result = (result * PRIME) + (this.release == null ? 43 : this.release.hashCode());
        result =
                (result * PRIME)
                        + (this.releaseFullVersion == null
                                ? 43
                                : this.releaseFullVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.oracleHomePath == null ? 43 : this.oracleHomePath.hashCode());
        result =
                (result * PRIME)
                        + (this.currentPatchWatermark == null
                                ? 43
                                : this.currentPatchWatermark.hashCode());
        result =
                (result * PRIME)
                        + (this.hostOrCluster == null ? 43 : this.hostOrCluster.hashCode());
        result = (result * PRIME) + (this.imageDetails == null ? 43 : this.imageDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.patchComplianceDetails == null
                                ? 43
                                : this.patchComplianceDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.patchActivityDetails == null
                                ? 43
                                : this.patchActivityDetails.hashCode());
        result = (result * PRIME) + (this.patchUser == null ? 43 : this.patchUser.hashCode());
        result = (result * PRIME) + (this.sudoFilePath == null ? 43 : this.sudoFilePath.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalPatches == null ? 43 : this.additionalPatches.hashCode());
        result =
                (result * PRIME)
                        + (this.vulnerabilitiesSummary == null
                                ? 43
                                : this.vulnerabilitiesSummary.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
