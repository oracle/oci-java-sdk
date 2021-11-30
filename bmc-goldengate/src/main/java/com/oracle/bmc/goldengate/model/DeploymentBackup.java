/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * A backup of the current state of the GoldenGate deployment. Can be used to restore a deployment, or create a new deployment with that state as the starting deployment state.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DeploymentBackup.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class DeploymentBackup {
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

        @com.fasterxml.jackson.annotation.JsonProperty("deploymentId")
        private String deploymentId;

        public Builder deploymentId(String deploymentId) {
            this.deploymentId = deploymentId;
            this.__explicitlySet__.add("deploymentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isAutomatic")
        private Boolean isAutomatic;

        public Builder isAutomatic(Boolean isAutomatic) {
            this.isAutomatic = isAutomatic;
            this.__explicitlySet__.add("isAutomatic");
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

        @com.fasterxml.jackson.annotation.JsonProperty("timeOfBackup")
        private java.util.Date timeOfBackup;

        public Builder timeOfBackup(java.util.Date timeOfBackup) {
            this.timeOfBackup = timeOfBackup;
            this.__explicitlySet__.add("timeOfBackup");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeBackupFinished")
        private java.util.Date timeBackupFinished;

        public Builder timeBackupFinished(java.util.Date timeBackupFinished) {
            this.timeBackupFinished = timeBackupFinished;
            this.__explicitlySet__.add("timeBackupFinished");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sizeInBytes")
        private java.math.BigDecimal sizeInBytes;

        public Builder sizeInBytes(java.math.BigDecimal sizeInBytes) {
            this.sizeInBytes = sizeInBytes;
            this.__explicitlySet__.add("sizeInBytes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("backupType")
        private DeploymentBackupType backupType;

        public Builder backupType(DeploymentBackupType backupType) {
            this.backupType = backupType;
            this.__explicitlySet__.add("backupType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("oggVersion")
        private String oggVersion;

        public Builder oggVersion(String oggVersion) {
            this.oggVersion = oggVersion;
            this.__explicitlySet__.add("oggVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("namespaceName")
        private String namespaceName;

        public Builder namespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            this.__explicitlySet__.add("namespaceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
        private String bucketName;

        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
            this.__explicitlySet__.add("bucketName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectName")
        private String objectName;

        public Builder objectName(String objectName) {
            this.objectName = objectName;
            this.__explicitlySet__.add("objectName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
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

        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DeploymentBackup build() {
            DeploymentBackup __instance__ =
                    new DeploymentBackup(
                            id,
                            deploymentId,
                            compartmentId,
                            displayName,
                            isAutomatic,
                            lifecycleState,
                            lifecycleDetails,
                            timeOfBackup,
                            timeBackupFinished,
                            sizeInBytes,
                            backupType,
                            oggVersion,
                            namespaceName,
                            bucketName,
                            objectName,
                            timeCreated,
                            timeUpdated,
                            freeformTags,
                            definedTags,
                            systemTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DeploymentBackup o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .deploymentId(o.getDeploymentId())
                            .compartmentId(o.getCompartmentId())
                            .displayName(o.getDisplayName())
                            .isAutomatic(o.getIsAutomatic())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleDetails(o.getLifecycleDetails())
                            .timeOfBackup(o.getTimeOfBackup())
                            .timeBackupFinished(o.getTimeBackupFinished())
                            .sizeInBytes(o.getSizeInBytes())
                            .backupType(o.getBackupType())
                            .oggVersion(o.getOggVersion())
                            .namespaceName(o.getNamespaceName())
                            .bucketName(o.getBucketName())
                            .objectName(o.getObjectName())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .systemTags(o.getSystemTags());

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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the backup being referenced.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the deployment being referenced.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deploymentId")
    String deploymentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment being referenced.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * An object's Display Name.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * True if this object is automatically created
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAutomatic")
    Boolean isAutomatic;

    /**
     * Possible lifecycle states.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * Describes the object's current state in detail. For example, it can be used to provide actionable information for a resource in a Failed state.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    String lifecycleDetails;

    /**
     * The time of the resource backup. The format is defined by [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfBackup")
    java.util.Date timeOfBackup;

    /**
     * The time of the resource backup finish. The format is defined by [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeBackupFinished")
    java.util.Date timeBackupFinished;

    /**
     * The size of the backup stored in object storage (in bytes)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sizeInBytes")
    java.math.BigDecimal sizeInBytes;

    /**
     * Possible Deployment backup types.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("backupType")
    DeploymentBackupType backupType;

    /**
     * Version of OGG
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("oggVersion")
    String oggVersion;

    /**
     * Name of namespace that serves as a container for all of your buckets
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("namespaceName")
    String namespaceName;

    /**
     * Name of the bucket where the object is to be uploaded in the object storage
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
    String bucketName;

    /**
     * Name of the object to be uploaded to object storage
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectName")
    String objectName;

    /**
     * The time the resource was created. The format is defined by [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The time the resource was last updated. The format is defined by [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    /**
     * A simple key-value pair that is applied without any predefined name, type, or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Tags defined for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * The system tags associated with this resource, if any. The system tags are set by Oracle Cloud Infrastructure services. Each key is predefined and scoped to namespaces.  For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {orcl-cloud: {free-tier-retain: true}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    java.util.Map<String, java.util.Map<String, Object>> systemTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
