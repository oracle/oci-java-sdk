/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * A backup of the current state of the GoldenGate deployment. Can be used to restore a deployment,
 * or create a new deployment with that state as the starting deployment state. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DeploymentBackup.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DeploymentBackup
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "deploymentId",
        "deploymentType",
        "compartmentId",
        "displayName",
        "isAutomatic",
        "backupSourceType",
        "lifecycleState",
        "lifecycleDetails",
        "timeOfBackup",
        "timeBackupFinished",
        "sizeInBytes",
        "backupType",
        "oggVersion",
        "namespaceName",
        "bucketName",
        "objectName",
        "timeCreated",
        "timeUpdated",
        "freeformTags",
        "definedTags",
        "systemTags",
        "isMetadataOnly",
        "locks"
    })
    public DeploymentBackup(
            String id,
            String deploymentId,
            DeploymentType deploymentType,
            String compartmentId,
            String displayName,
            Boolean isAutomatic,
            BackupSourceType backupSourceType,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Date timeOfBackup,
            java.util.Date timeBackupFinished,
            Long sizeInBytes,
            DeploymentBackupType backupType,
            String oggVersion,
            String namespaceName,
            String bucketName,
            String objectName,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            Boolean isMetadataOnly,
            java.util.List<ResourceLock> locks) {
        super();
        this.id = id;
        this.deploymentId = deploymentId;
        this.deploymentType = deploymentType;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.isAutomatic = isAutomatic;
        this.backupSourceType = backupSourceType;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.timeOfBackup = timeOfBackup;
        this.timeBackupFinished = timeBackupFinished;
        this.sizeInBytes = sizeInBytes;
        this.backupType = backupType;
        this.oggVersion = oggVersion;
        this.namespaceName = namespaceName;
        this.bucketName = bucketName;
        this.objectName = objectName;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
        this.isMetadataOnly = isMetadataOnly;
        this.locks = locks;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * backup being referenced.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * backup being referenced.
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * deployment being referenced.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("deploymentId")
        private String deploymentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * deployment being referenced.
         *
         * @param deploymentId the value to set
         * @return this builder
         */
        public Builder deploymentId(String deploymentId) {
            this.deploymentId = deploymentId;
            this.__explicitlySet__.add("deploymentId");
            return this;
        }
        /**
         * The type of deployment, which can be any one of the Allowed values. NOTE: Use of the
         * value 'OGG' is maintained for backward compatibility purposes. Its use is discouraged in
         * favor of 'DATABASE_ORACLE'.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("deploymentType")
        private DeploymentType deploymentType;

        /**
         * The type of deployment, which can be any one of the Allowed values. NOTE: Use of the
         * value 'OGG' is maintained for backward compatibility purposes. Its use is discouraged in
         * favor of 'DATABASE_ORACLE'.
         *
         * @param deploymentType the value to set
         * @return this builder
         */
        public Builder deploymentType(DeploymentType deploymentType) {
            this.deploymentType = deploymentType;
            this.__explicitlySet__.add("deploymentType");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment being referenced.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment being referenced.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** An object's Display Name. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * An object's Display Name.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** True if this object is automatically created */
        @com.fasterxml.jackson.annotation.JsonProperty("isAutomatic")
        private Boolean isAutomatic;

        /**
         * True if this object is automatically created
         *
         * @param isAutomatic the value to set
         * @return this builder
         */
        public Builder isAutomatic(Boolean isAutomatic) {
            this.isAutomatic = isAutomatic;
            this.__explicitlySet__.add("isAutomatic");
            return this;
        }
        /** Possible deployment backup source types. */
        @com.fasterxml.jackson.annotation.JsonProperty("backupSourceType")
        private BackupSourceType backupSourceType;

        /**
         * Possible deployment backup source types.
         *
         * @param backupSourceType the value to set
         * @return this builder
         */
        public Builder backupSourceType(BackupSourceType backupSourceType) {
            this.backupSourceType = backupSourceType;
            this.__explicitlySet__.add("backupSourceType");
            return this;
        }
        /** Possible lifecycle states. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * Possible lifecycle states.
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
         * Describes the object's current state in detail. For example, it can be used to provide
         * actionable information for a resource in a Failed state.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Describes the object's current state in detail. For example, it can be used to provide
         * actionable information for a resource in a Failed state.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * The time of the resource backup. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfBackup")
        private java.util.Date timeOfBackup;

        /**
         * The time of the resource backup. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         *
         * @param timeOfBackup the value to set
         * @return this builder
         */
        public Builder timeOfBackup(java.util.Date timeOfBackup) {
            this.timeOfBackup = timeOfBackup;
            this.__explicitlySet__.add("timeOfBackup");
            return this;
        }
        /**
         * The time of the resource backup finish. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeBackupFinished")
        private java.util.Date timeBackupFinished;

        /**
         * The time of the resource backup finish. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         *
         * @param timeBackupFinished the value to set
         * @return this builder
         */
        public Builder timeBackupFinished(java.util.Date timeBackupFinished) {
            this.timeBackupFinished = timeBackupFinished;
            this.__explicitlySet__.add("timeBackupFinished");
            return this;
        }
        /** The size of the backup stored in object storage (in bytes) */
        @com.fasterxml.jackson.annotation.JsonProperty("sizeInBytes")
        private Long sizeInBytes;

        /**
         * The size of the backup stored in object storage (in bytes)
         *
         * @param sizeInBytes the value to set
         * @return this builder
         */
        public Builder sizeInBytes(Long sizeInBytes) {
            this.sizeInBytes = sizeInBytes;
            this.__explicitlySet__.add("sizeInBytes");
            return this;
        }
        /** Possible Deployment backup types. */
        @com.fasterxml.jackson.annotation.JsonProperty("backupType")
        private DeploymentBackupType backupType;

        /**
         * Possible Deployment backup types.
         *
         * @param backupType the value to set
         * @return this builder
         */
        public Builder backupType(DeploymentBackupType backupType) {
            this.backupType = backupType;
            this.__explicitlySet__.add("backupType");
            return this;
        }
        /** Version of OGG */
        @com.fasterxml.jackson.annotation.JsonProperty("oggVersion")
        private String oggVersion;

        /**
         * Version of OGG
         *
         * @param oggVersion the value to set
         * @return this builder
         */
        public Builder oggVersion(String oggVersion) {
            this.oggVersion = oggVersion;
            this.__explicitlySet__.add("oggVersion");
            return this;
        }
        /** Name of namespace that serves as a container for all of your buckets */
        @com.fasterxml.jackson.annotation.JsonProperty("namespaceName")
        private String namespaceName;

        /**
         * Name of namespace that serves as a container for all of your buckets
         *
         * @param namespaceName the value to set
         * @return this builder
         */
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            this.__explicitlySet__.add("namespaceName");
            return this;
        }
        /** Name of the bucket where the object is to be uploaded in the object storage */
        @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
        private String bucketName;

        /**
         * Name of the bucket where the object is to be uploaded in the object storage
         *
         * @param bucketName the value to set
         * @return this builder
         */
        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
            this.__explicitlySet__.add("bucketName");
            return this;
        }
        /** Name of the object to be uploaded to object storage */
        @com.fasterxml.jackson.annotation.JsonProperty("objectName")
        private String objectName;

        /**
         * Name of the object to be uploaded to object storage
         *
         * @param objectName the value to set
         * @return this builder
         */
        public Builder objectName(String objectName) {
            this.objectName = objectName;
            this.__explicitlySet__.add("objectName");
            return this;
        }
        /**
         * The time the resource was created. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the resource was created. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The time the resource was last updated. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the resource was last updated. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * A simple key-value pair that is applied without any predefined name, type, or scope.
         * Exists for cross-compatibility only.
         *
         * <p>Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * A simple key-value pair that is applied without any predefined name, type, or scope.
         * Exists for cross-compatibility only.
         *
         * <p>Example: {@code {"bar-key": "value"}}
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
         * Tags defined for this resource. Each key is predefined and scoped to a namespace.
         *
         * <p>Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Tags defined for this resource. Each key is predefined and scoped to a namespace.
         *
         * <p>Example: {@code {"foo-namespace": {"bar-key": "value"}}}
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
         * The system tags associated with this resource, if any. The system tags are set by Oracle
         * Cloud Infrastructure services. Each key is predefined and scoped to namespaces. For more
         * information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {orcl-cloud: {free-tier-retain: true}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * The system tags associated with this resource, if any. The system tags are set by Oracle
         * Cloud Infrastructure services. Each key is predefined and scoped to namespaces. For more
         * information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {orcl-cloud: {free-tier-retain: true}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }
        /** Parameter to allow users to create backup without trails */
        @com.fasterxml.jackson.annotation.JsonProperty("isMetadataOnly")
        private Boolean isMetadataOnly;

        /**
         * Parameter to allow users to create backup without trails
         *
         * @param isMetadataOnly the value to set
         * @return this builder
         */
        public Builder isMetadataOnly(Boolean isMetadataOnly) {
            this.isMetadataOnly = isMetadataOnly;
            this.__explicitlySet__.add("isMetadataOnly");
            return this;
        }
        /** Locks associated with this resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("locks")
        private java.util.List<ResourceLock> locks;

        /**
         * Locks associated with this resource.
         *
         * @param locks the value to set
         * @return this builder
         */
        public Builder locks(java.util.List<ResourceLock> locks) {
            this.locks = locks;
            this.__explicitlySet__.add("locks");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DeploymentBackup build() {
            DeploymentBackup model =
                    new DeploymentBackup(
                            this.id,
                            this.deploymentId,
                            this.deploymentType,
                            this.compartmentId,
                            this.displayName,
                            this.isAutomatic,
                            this.backupSourceType,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.timeOfBackup,
                            this.timeBackupFinished,
                            this.sizeInBytes,
                            this.backupType,
                            this.oggVersion,
                            this.namespaceName,
                            this.bucketName,
                            this.objectName,
                            this.timeCreated,
                            this.timeUpdated,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.isMetadataOnly,
                            this.locks);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DeploymentBackup model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("deploymentId")) {
                this.deploymentId(model.getDeploymentId());
            }
            if (model.wasPropertyExplicitlySet("deploymentType")) {
                this.deploymentType(model.getDeploymentType());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("isAutomatic")) {
                this.isAutomatic(model.getIsAutomatic());
            }
            if (model.wasPropertyExplicitlySet("backupSourceType")) {
                this.backupSourceType(model.getBackupSourceType());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("timeOfBackup")) {
                this.timeOfBackup(model.getTimeOfBackup());
            }
            if (model.wasPropertyExplicitlySet("timeBackupFinished")) {
                this.timeBackupFinished(model.getTimeBackupFinished());
            }
            if (model.wasPropertyExplicitlySet("sizeInBytes")) {
                this.sizeInBytes(model.getSizeInBytes());
            }
            if (model.wasPropertyExplicitlySet("backupType")) {
                this.backupType(model.getBackupType());
            }
            if (model.wasPropertyExplicitlySet("oggVersion")) {
                this.oggVersion(model.getOggVersion());
            }
            if (model.wasPropertyExplicitlySet("namespaceName")) {
                this.namespaceName(model.getNamespaceName());
            }
            if (model.wasPropertyExplicitlySet("bucketName")) {
                this.bucketName(model.getBucketName());
            }
            if (model.wasPropertyExplicitlySet("objectName")) {
                this.objectName(model.getObjectName());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
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
            if (model.wasPropertyExplicitlySet("isMetadataOnly")) {
                this.isMetadataOnly(model.getIsMetadataOnly());
            }
            if (model.wasPropertyExplicitlySet("locks")) {
                this.locks(model.getLocks());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * backup being referenced.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * backup being referenced.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * deployment being referenced.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("deploymentId")
    private final String deploymentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * deployment being referenced.
     *
     * @return the value
     */
    public String getDeploymentId() {
        return deploymentId;
    }

    /**
     * The type of deployment, which can be any one of the Allowed values. NOTE: Use of the value
     * 'OGG' is maintained for backward compatibility purposes. Its use is discouraged in favor of
     * 'DATABASE_ORACLE'.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("deploymentType")
    private final DeploymentType deploymentType;

    /**
     * The type of deployment, which can be any one of the Allowed values. NOTE: Use of the value
     * 'OGG' is maintained for backward compatibility purposes. Its use is discouraged in favor of
     * 'DATABASE_ORACLE'.
     *
     * @return the value
     */
    public DeploymentType getDeploymentType() {
        return deploymentType;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment being referenced.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment being referenced.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** An object's Display Name. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * An object's Display Name.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** True if this object is automatically created */
    @com.fasterxml.jackson.annotation.JsonProperty("isAutomatic")
    private final Boolean isAutomatic;

    /**
     * True if this object is automatically created
     *
     * @return the value
     */
    public Boolean getIsAutomatic() {
        return isAutomatic;
    }

    /** Possible deployment backup source types. */
    public enum BackupSourceType implements com.oracle.bmc.http.internal.BmcEnum {
        Manual("MANUAL"),
        Automatic("AUTOMATIC"),
        Scheduled("SCHEDULED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(BackupSourceType.class);

        private final String value;
        private static java.util.Map<String, BackupSourceType> map;

        static {
            map = new java.util.HashMap<>();
            for (BackupSourceType v : BackupSourceType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        BackupSourceType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static BackupSourceType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'BackupSourceType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Possible deployment backup source types. */
    @com.fasterxml.jackson.annotation.JsonProperty("backupSourceType")
    private final BackupSourceType backupSourceType;

    /**
     * Possible deployment backup source types.
     *
     * @return the value
     */
    public BackupSourceType getBackupSourceType() {
        return backupSourceType;
    }

    /** Possible lifecycle states. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * Possible lifecycle states.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Describes the object's current state in detail. For example, it can be used to provide
     * actionable information for a resource in a Failed state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Describes the object's current state in detail. For example, it can be used to provide
     * actionable information for a resource in a Failed state.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * The time of the resource backup. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfBackup")
    private final java.util.Date timeOfBackup;

    /**
     * The time of the resource backup. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     *
     * @return the value
     */
    public java.util.Date getTimeOfBackup() {
        return timeOfBackup;
    }

    /**
     * The time of the resource backup finish. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeBackupFinished")
    private final java.util.Date timeBackupFinished;

    /**
     * The time of the resource backup finish. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     *
     * @return the value
     */
    public java.util.Date getTimeBackupFinished() {
        return timeBackupFinished;
    }

    /** The size of the backup stored in object storage (in bytes) */
    @com.fasterxml.jackson.annotation.JsonProperty("sizeInBytes")
    private final Long sizeInBytes;

    /**
     * The size of the backup stored in object storage (in bytes)
     *
     * @return the value
     */
    public Long getSizeInBytes() {
        return sizeInBytes;
    }

    /** Possible Deployment backup types. */
    @com.fasterxml.jackson.annotation.JsonProperty("backupType")
    private final DeploymentBackupType backupType;

    /**
     * Possible Deployment backup types.
     *
     * @return the value
     */
    public DeploymentBackupType getBackupType() {
        return backupType;
    }

    /** Version of OGG */
    @com.fasterxml.jackson.annotation.JsonProperty("oggVersion")
    private final String oggVersion;

    /**
     * Version of OGG
     *
     * @return the value
     */
    public String getOggVersion() {
        return oggVersion;
    }

    /** Name of namespace that serves as a container for all of your buckets */
    @com.fasterxml.jackson.annotation.JsonProperty("namespaceName")
    private final String namespaceName;

    /**
     * Name of namespace that serves as a container for all of your buckets
     *
     * @return the value
     */
    public String getNamespaceName() {
        return namespaceName;
    }

    /** Name of the bucket where the object is to be uploaded in the object storage */
    @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
    private final String bucketName;

    /**
     * Name of the bucket where the object is to be uploaded in the object storage
     *
     * @return the value
     */
    public String getBucketName() {
        return bucketName;
    }

    /** Name of the object to be uploaded to object storage */
    @com.fasterxml.jackson.annotation.JsonProperty("objectName")
    private final String objectName;

    /**
     * Name of the object to be uploaded to object storage
     *
     * @return the value
     */
    public String getObjectName() {
        return objectName;
    }

    /**
     * The time the resource was created. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the resource was created. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time the resource was last updated. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the resource was last updated. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * A simple key-value pair that is applied without any predefined name, type, or scope. Exists
     * for cross-compatibility only.
     *
     * <p>Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * A simple key-value pair that is applied without any predefined name, type, or scope. Exists
     * for cross-compatibility only.
     *
     * <p>Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Tags defined for this resource. Each key is predefined and scoped to a namespace.
     *
     * <p>Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Tags defined for this resource. Each key is predefined and scoped to a namespace.
     *
     * <p>Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * The system tags associated with this resource, if any. The system tags are set by Oracle
     * Cloud Infrastructure services. Each key is predefined and scoped to namespaces. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {orcl-cloud: {free-tier-retain: true}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * The system tags associated with this resource, if any. The system tags are set by Oracle
     * Cloud Infrastructure services. Each key is predefined and scoped to namespaces. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {orcl-cloud: {free-tier-retain: true}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    /** Parameter to allow users to create backup without trails */
    @com.fasterxml.jackson.annotation.JsonProperty("isMetadataOnly")
    private final Boolean isMetadataOnly;

    /**
     * Parameter to allow users to create backup without trails
     *
     * @return the value
     */
    public Boolean getIsMetadataOnly() {
        return isMetadataOnly;
    }

    /** Locks associated with this resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("locks")
    private final java.util.List<ResourceLock> locks;

    /**
     * Locks associated with this resource.
     *
     * @return the value
     */
    public java.util.List<ResourceLock> getLocks() {
        return locks;
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
        sb.append("DeploymentBackup(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", deploymentId=").append(String.valueOf(this.deploymentId));
        sb.append(", deploymentType=").append(String.valueOf(this.deploymentType));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", isAutomatic=").append(String.valueOf(this.isAutomatic));
        sb.append(", backupSourceType=").append(String.valueOf(this.backupSourceType));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", timeOfBackup=").append(String.valueOf(this.timeOfBackup));
        sb.append(", timeBackupFinished=").append(String.valueOf(this.timeBackupFinished));
        sb.append(", sizeInBytes=").append(String.valueOf(this.sizeInBytes));
        sb.append(", backupType=").append(String.valueOf(this.backupType));
        sb.append(", oggVersion=").append(String.valueOf(this.oggVersion));
        sb.append(", namespaceName=").append(String.valueOf(this.namespaceName));
        sb.append(", bucketName=").append(String.valueOf(this.bucketName));
        sb.append(", objectName=").append(String.valueOf(this.objectName));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", isMetadataOnly=").append(String.valueOf(this.isMetadataOnly));
        sb.append(", locks=").append(String.valueOf(this.locks));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeploymentBackup)) {
            return false;
        }

        DeploymentBackup other = (DeploymentBackup) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.deploymentId, other.deploymentId)
                && java.util.Objects.equals(this.deploymentType, other.deploymentType)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.isAutomatic, other.isAutomatic)
                && java.util.Objects.equals(this.backupSourceType, other.backupSourceType)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.timeOfBackup, other.timeOfBackup)
                && java.util.Objects.equals(this.timeBackupFinished, other.timeBackupFinished)
                && java.util.Objects.equals(this.sizeInBytes, other.sizeInBytes)
                && java.util.Objects.equals(this.backupType, other.backupType)
                && java.util.Objects.equals(this.oggVersion, other.oggVersion)
                && java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(this.bucketName, other.bucketName)
                && java.util.Objects.equals(this.objectName, other.objectName)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.isMetadataOnly, other.isMetadataOnly)
                && java.util.Objects.equals(this.locks, other.locks)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.deploymentId == null ? 43 : this.deploymentId.hashCode());
        result =
                (result * PRIME)
                        + (this.deploymentType == null ? 43 : this.deploymentType.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.isAutomatic == null ? 43 : this.isAutomatic.hashCode());
        result =
                (result * PRIME)
                        + (this.backupSourceType == null ? 43 : this.backupSourceType.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.timeOfBackup == null ? 43 : this.timeOfBackup.hashCode());
        result =
                (result * PRIME)
                        + (this.timeBackupFinished == null
                                ? 43
                                : this.timeBackupFinished.hashCode());
        result = (result * PRIME) + (this.sizeInBytes == null ? 43 : this.sizeInBytes.hashCode());
        result = (result * PRIME) + (this.backupType == null ? 43 : this.backupType.hashCode());
        result = (result * PRIME) + (this.oggVersion == null ? 43 : this.oggVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.namespaceName == null ? 43 : this.namespaceName.hashCode());
        result = (result * PRIME) + (this.bucketName == null ? 43 : this.bucketName.hashCode());
        result = (result * PRIME) + (this.objectName == null ? 43 : this.objectName.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result =
                (result * PRIME)
                        + (this.isMetadataOnly == null ? 43 : this.isMetadataOnly.hashCode());
        result = (result * PRIME) + (this.locks == null ? 43 : this.locks.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
