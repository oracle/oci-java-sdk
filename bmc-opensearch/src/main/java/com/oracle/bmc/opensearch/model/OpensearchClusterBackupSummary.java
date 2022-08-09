/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opensearch.model;

/**
 * The summary of information about an OpenSearch cluster backup.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180828")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = OpensearchClusterBackupSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OpensearchClusterBackupSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "compartmentId",
        "backupType",
        "sourceClusterId",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "lifecycleDetails",
        "timeExpired",
        "backupSize",
        "sourceClusterDisplayName",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public OpensearchClusterBackupSummary(
            String id,
            String displayName,
            String compartmentId,
            OpensearchClusterBackup.BackupType backupType,
            String sourceClusterId,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            OpensearchClusterBackup.LifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Date timeExpired,
            Double backupSize,
            String sourceClusterDisplayName,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.backupType = backupType;
        this.sourceClusterId = sourceClusterId;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.timeExpired = timeExpired;
        this.backupSize = backupSize;
        this.sourceClusterDisplayName = sourceClusterDisplayName;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the cluster backup.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the cluster backup.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The name of the cluster backup. Avoid entering confidential information.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The name of the cluster backup. Avoid entering confidential information.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The OCID of the compartment where the cluster backup is located.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment where the cluster backup is located.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Specifies whether the cluster backup was created manually, or automatically as a scheduled backup.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("backupType")
        private OpensearchClusterBackup.BackupType backupType;

        /**
         * Specifies whether the cluster backup was created manually, or automatically as a scheduled backup.
         * @param backupType the value to set
         * @return this builder
         **/
        public Builder backupType(OpensearchClusterBackup.BackupType backupType) {
            this.backupType = backupType;
            this.__explicitlySet__.add("backupType");
            return this;
        }
        /**
         * The OCID of the source OpenSearch cluster for the cluster backup.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sourceClusterId")
        private String sourceClusterId;

        /**
         * The OCID of the source OpenSearch cluster for the cluster backup.
         * @param sourceClusterId the value to set
         * @return this builder
         **/
        public Builder sourceClusterId(String sourceClusterId) {
            this.sourceClusterId = sourceClusterId;
            this.__explicitlySet__.add("sourceClusterId");
            return this;
        }
        /**
         * The date and time the cluster backup was created. Format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the cluster backup was created. Format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The date and time the cluster backup was updated. Format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the cluster backup was updated. Format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * The current state of the cluster backup.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private OpensearchClusterBackup.LifecycleState lifecycleState;

        /**
         * The current state of the cluster backup.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(OpensearchClusterBackup.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Additional information about the current lifecycle state of the cluster backup.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Additional information about the current lifecycle state of the cluster backup.
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * The date and time the cluster backup expires. Format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeExpired")
        private java.util.Date timeExpired;

        /**
         * The date and time the cluster backup expires. Format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * @param timeExpired the value to set
         * @return this builder
         **/
        public Builder timeExpired(java.util.Date timeExpired) {
            this.timeExpired = timeExpired;
            this.__explicitlySet__.add("timeExpired");
            return this;
        }
        /**
         * The size in GB of the cluster backup.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("backupSize")
        private Double backupSize;

        /**
         * The size in GB of the cluster backup.
         * @param backupSize the value to set
         * @return this builder
         **/
        public Builder backupSize(Double backupSize) {
            this.backupSize = backupSize;
            this.__explicitlySet__.add("backupSize");
            return this;
        }
        /**
         * The name of the source OpenSearch cluster for the cluster backup.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sourceClusterDisplayName")
        private String sourceClusterDisplayName;

        /**
         * The name of the source OpenSearch cluster for the cluster backup.
         * @param sourceClusterDisplayName the value to set
         * @return this builder
         **/
        public Builder sourceClusterDisplayName(String sourceClusterDisplayName) {
            this.sourceClusterDisplayName = sourceClusterDisplayName;
            this.__explicitlySet__.add("sourceClusterDisplayName");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
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
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
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
         * Usage of system tag keys. These predefined keys are scoped to namespaces.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         **/
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OpensearchClusterBackupSummary build() {
            OpensearchClusterBackupSummary model =
                    new OpensearchClusterBackupSummary(
                            this.id,
                            this.displayName,
                            this.compartmentId,
                            this.backupType,
                            this.sourceClusterId,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.timeExpired,
                            this.backupSize,
                            this.sourceClusterDisplayName,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OpensearchClusterBackupSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("backupType")) {
                this.backupType(model.getBackupType());
            }
            if (model.wasPropertyExplicitlySet("sourceClusterId")) {
                this.sourceClusterId(model.getSourceClusterId());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("timeExpired")) {
                this.timeExpired(model.getTimeExpired());
            }
            if (model.wasPropertyExplicitlySet("backupSize")) {
                this.backupSize(model.getBackupSize());
            }
            if (model.wasPropertyExplicitlySet("sourceClusterDisplayName")) {
                this.sourceClusterDisplayName(model.getSourceClusterDisplayName());
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
     * The OCID of the cluster backup.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the cluster backup.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The name of the cluster backup. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The name of the cluster backup. Avoid entering confidential information.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The OCID of the compartment where the cluster backup is located.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment where the cluster backup is located.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Specifies whether the cluster backup was created manually, or automatically as a scheduled backup.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("backupType")
    private final OpensearchClusterBackup.BackupType backupType;

    /**
     * Specifies whether the cluster backup was created manually, or automatically as a scheduled backup.
     * @return the value
     **/
    public OpensearchClusterBackup.BackupType getBackupType() {
        return backupType;
    }

    /**
     * The OCID of the source OpenSearch cluster for the cluster backup.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceClusterId")
    private final String sourceClusterId;

    /**
     * The OCID of the source OpenSearch cluster for the cluster backup.
     * @return the value
     **/
    public String getSourceClusterId() {
        return sourceClusterId;
    }

    /**
     * The date and time the cluster backup was created. Format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the cluster backup was created. Format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the cluster backup was updated. Format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the cluster backup was updated. Format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The current state of the cluster backup.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final OpensearchClusterBackup.LifecycleState lifecycleState;

    /**
     * The current state of the cluster backup.
     * @return the value
     **/
    public OpensearchClusterBackup.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Additional information about the current lifecycle state of the cluster backup.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Additional information about the current lifecycle state of the cluster backup.
     * @return the value
     **/
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * The date and time the cluster backup expires. Format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeExpired")
    private final java.util.Date timeExpired;

    /**
     * The date and time the cluster backup expires. Format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * @return the value
     **/
    public java.util.Date getTimeExpired() {
        return timeExpired;
    }

    /**
     * The size in GB of the cluster backup.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("backupSize")
    private final Double backupSize;

    /**
     * The size in GB of the cluster backup.
     * @return the value
     **/
    public Double getBackupSize() {
        return backupSize;
    }

    /**
     * The name of the source OpenSearch cluster for the cluster backup.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceClusterDisplayName")
    private final String sourceClusterDisplayName;

    /**
     * The name of the source OpenSearch cluster for the cluster backup.
     * @return the value
     **/
    public String getSourceClusterDisplayName() {
        return sourceClusterDisplayName;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("OpensearchClusterBackupSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", backupType=").append(String.valueOf(this.backupType));
        sb.append(", sourceClusterId=").append(String.valueOf(this.sourceClusterId));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", timeExpired=").append(String.valueOf(this.timeExpired));
        sb.append(", backupSize=").append(String.valueOf(this.backupSize));
        sb.append(", sourceClusterDisplayName=")
                .append(String.valueOf(this.sourceClusterDisplayName));
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
        if (!(o instanceof OpensearchClusterBackupSummary)) {
            return false;
        }

        OpensearchClusterBackupSummary other = (OpensearchClusterBackupSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.backupType, other.backupType)
                && java.util.Objects.equals(this.sourceClusterId, other.sourceClusterId)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.timeExpired, other.timeExpired)
                && java.util.Objects.equals(this.backupSize, other.backupSize)
                && java.util.Objects.equals(
                        this.sourceClusterDisplayName, other.sourceClusterDisplayName)
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
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.backupType == null ? 43 : this.backupType.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceClusterId == null ? 43 : this.sourceClusterId.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.timeExpired == null ? 43 : this.timeExpired.hashCode());
        result = (result * PRIME) + (this.backupSize == null ? 43 : this.backupSize.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceClusterDisplayName == null
                                ? 43
                                : this.sourceClusterDisplayName.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
