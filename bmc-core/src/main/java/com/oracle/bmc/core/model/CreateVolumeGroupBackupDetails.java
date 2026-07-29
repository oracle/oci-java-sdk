/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
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
    builder = CreateVolumeGroupBackupDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateVolumeGroupBackupDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "definedTags",
        "displayName",
        "freeformTags",
        "type",
        "volumeGroupId",
        "retentionPeriod",
        "isPreventDeletionEnabled",
        "isRetentionLockEnabled",
        "isIndefiniteRetentionEnabled"
    })
    public CreateVolumeGroupBackupDetails(
            String compartmentId,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            java.util.Map<String, String> freeformTags,
            Type type,
            String volumeGroupId,
            RetentionDuration retentionPeriod,
            Boolean isPreventDeletionEnabled,
            Boolean isRetentionLockEnabled,
            Boolean isIndefiniteRetentionEnabled) {
        super();
        this.compartmentId = compartmentId;
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.type = type;
        this.volumeGroupId = volumeGroupId;
        this.retentionPeriod = retentionPeriod;
        this.isPreventDeletionEnabled = isPreventDeletionEnabled;
        this.isRetentionLockEnabled = isRetentionLockEnabled;
        this.isIndefiniteRetentionEnabled = isIndefiniteRetentionEnabled;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the compartment that will contain the volume group
         * backup. This parameter is optional, by default backup will be created in
         * the same compartment and source volume group.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that will contain the volume group
         * backup. This parameter is optional, by default backup will be created in
         * the same compartment and source volume group.
         *
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a
         * namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a
         * namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
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
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no
         * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no
         * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
         * The type of backup to create. If omitted, defaults to incremental.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * The type of backup to create. If omitted, defaults to incremental.
         * @param type the value to set
         * @return this builder
         **/
        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * The OCID of the volume group that needs to be backed up.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("volumeGroupId")
        private String volumeGroupId;

        /**
         * The OCID of the volume group that needs to be backed up.
         * @param volumeGroupId the value to set
         * @return this builder
         **/
        public Builder volumeGroupId(String volumeGroupId) {
            this.volumeGroupId = volumeGroupId;
            this.__explicitlySet__.add("volumeGroupId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("retentionPeriod")
        private RetentionDuration retentionPeriod;

        public Builder retentionPeriod(RetentionDuration retentionPeriod) {
            this.retentionPeriod = retentionPeriod;
            this.__explicitlySet__.add("retentionPeriod");
            return this;
        }
        /**
         * Prevent backups from being deleted during the configured retention period. This is an optional field. If it is not specified, it is set to null, prevent deletion will not be applied to the backups.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isPreventDeletionEnabled")
        private Boolean isPreventDeletionEnabled;

        /**
         * Prevent backups from being deleted during the configured retention period. This is an optional field. If it is not specified, it is set to null, prevent deletion will not be applied to the backups.
         * @param isPreventDeletionEnabled the value to set
         * @return this builder
         **/
        public Builder isPreventDeletionEnabled(Boolean isPreventDeletionEnabled) {
            this.isPreventDeletionEnabled = isPreventDeletionEnabled;
            this.__explicitlySet__.add("isPreventDeletionEnabled");
            return this;
        }
        /**
         * feature that prevents deletion or alteration of backup data for a specified period to ensure data protection and regulatory compliance. This is an optional field. If it is not specified, it is set to null, no retention lock will be applied to the backups. This feature should be used in conjunction with the retention-period field.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isRetentionLockEnabled")
        private Boolean isRetentionLockEnabled;

        /**
         * feature that prevents deletion or alteration of backup data for a specified period to ensure data protection and regulatory compliance. This is an optional field. If it is not specified, it is set to null, no retention lock will be applied to the backups. This feature should be used in conjunction with the retention-period field.
         * @param isRetentionLockEnabled the value to set
         * @return this builder
         **/
        public Builder isRetentionLockEnabled(Boolean isRetentionLockEnabled) {
            this.isRetentionLockEnabled = isRetentionLockEnabled;
            this.__explicitlySet__.add("isRetentionLockEnabled");
            return this;
        }
        /**
         * feature that preserves backup data from modification or deletion to ensure it remains available for legal or regulatory investigations or litigation, regardless of standard retention policies. This is an optional field. If it is not specified, it is set to null, no legal hold will be applied to the backups.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isIndefiniteRetentionEnabled")
        private Boolean isIndefiniteRetentionEnabled;

        /**
         * feature that preserves backup data from modification or deletion to ensure it remains available for legal or regulatory investigations or litigation, regardless of standard retention policies. This is an optional field. If it is not specified, it is set to null, no legal hold will be applied to the backups.
         * @param isIndefiniteRetentionEnabled the value to set
         * @return this builder
         **/
        public Builder isIndefiniteRetentionEnabled(Boolean isIndefiniteRetentionEnabled) {
            this.isIndefiniteRetentionEnabled = isIndefiniteRetentionEnabled;
            this.__explicitlySet__.add("isIndefiniteRetentionEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateVolumeGroupBackupDetails build() {
            CreateVolumeGroupBackupDetails model =
                    new CreateVolumeGroupBackupDetails(
                            this.compartmentId,
                            this.definedTags,
                            this.displayName,
                            this.freeformTags,
                            this.type,
                            this.volumeGroupId,
                            this.retentionPeriod,
                            this.isPreventDeletionEnabled,
                            this.isRetentionLockEnabled,
                            this.isIndefiniteRetentionEnabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateVolumeGroupBackupDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("volumeGroupId")) {
                this.volumeGroupId(model.getVolumeGroupId());
            }
            if (model.wasPropertyExplicitlySet("retentionPeriod")) {
                this.retentionPeriod(model.getRetentionPeriod());
            }
            if (model.wasPropertyExplicitlySet("isPreventDeletionEnabled")) {
                this.isPreventDeletionEnabled(model.getIsPreventDeletionEnabled());
            }
            if (model.wasPropertyExplicitlySet("isRetentionLockEnabled")) {
                this.isRetentionLockEnabled(model.getIsRetentionLockEnabled());
            }
            if (model.wasPropertyExplicitlySet("isIndefiniteRetentionEnabled")) {
                this.isIndefiniteRetentionEnabled(model.getIsIndefiniteRetentionEnabled());
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
     * The OCID of the compartment that will contain the volume group
     * backup. This parameter is optional, by default backup will be created in
     * the same compartment and source volume group.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that will contain the volume group
     * backup. This parameter is optional, by default backup will be created in
     * the same compartment and source volume group.
     *
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * The type of backup to create. If omitted, defaults to incremental.
     **/
    public enum Type {
        Full("FULL"),
        Incremental("INCREMENTAL"),
        ;

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                map.put(v.getValue(), v);
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Type: " + key);
        }
    };
    /**
     * The type of backup to create. If omitted, defaults to incremental.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * The type of backup to create. If omitted, defaults to incremental.
     * @return the value
     **/
    public Type getType() {
        return type;
    }

    /**
     * The OCID of the volume group that needs to be backed up.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("volumeGroupId")
    private final String volumeGroupId;

    /**
     * The OCID of the volume group that needs to be backed up.
     * @return the value
     **/
    public String getVolumeGroupId() {
        return volumeGroupId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("retentionPeriod")
    private final RetentionDuration retentionPeriod;

    public RetentionDuration getRetentionPeriod() {
        return retentionPeriod;
    }

    /**
     * Prevent backups from being deleted during the configured retention period. This is an optional field. If it is not specified, it is set to null, prevent deletion will not be applied to the backups.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPreventDeletionEnabled")
    private final Boolean isPreventDeletionEnabled;

    /**
     * Prevent backups from being deleted during the configured retention period. This is an optional field. If it is not specified, it is set to null, prevent deletion will not be applied to the backups.
     * @return the value
     **/
    public Boolean getIsPreventDeletionEnabled() {
        return isPreventDeletionEnabled;
    }

    /**
     * feature that prevents deletion or alteration of backup data for a specified period to ensure data protection and regulatory compliance. This is an optional field. If it is not specified, it is set to null, no retention lock will be applied to the backups. This feature should be used in conjunction with the retention-period field.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isRetentionLockEnabled")
    private final Boolean isRetentionLockEnabled;

    /**
     * feature that prevents deletion or alteration of backup data for a specified period to ensure data protection and regulatory compliance. This is an optional field. If it is not specified, it is set to null, no retention lock will be applied to the backups. This feature should be used in conjunction with the retention-period field.
     * @return the value
     **/
    public Boolean getIsRetentionLockEnabled() {
        return isRetentionLockEnabled;
    }

    /**
     * feature that preserves backup data from modification or deletion to ensure it remains available for legal or regulatory investigations or litigation, regardless of standard retention policies. This is an optional field. If it is not specified, it is set to null, no legal hold will be applied to the backups.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isIndefiniteRetentionEnabled")
    private final Boolean isIndefiniteRetentionEnabled;

    /**
     * feature that preserves backup data from modification or deletion to ensure it remains available for legal or regulatory investigations or litigation, regardless of standard retention policies. This is an optional field. If it is not specified, it is set to null, no legal hold will be applied to the backups.
     * @return the value
     **/
    public Boolean getIsIndefiniteRetentionEnabled() {
        return isIndefiniteRetentionEnabled;
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
        sb.append("CreateVolumeGroupBackupDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", volumeGroupId=").append(String.valueOf(this.volumeGroupId));
        sb.append(", retentionPeriod=").append(String.valueOf(this.retentionPeriod));
        sb.append(", isPreventDeletionEnabled=")
                .append(String.valueOf(this.isPreventDeletionEnabled));
        sb.append(", isRetentionLockEnabled=").append(String.valueOf(this.isRetentionLockEnabled));
        sb.append(", isIndefiniteRetentionEnabled=")
                .append(String.valueOf(this.isIndefiniteRetentionEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateVolumeGroupBackupDetails)) {
            return false;
        }

        CreateVolumeGroupBackupDetails other = (CreateVolumeGroupBackupDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.volumeGroupId, other.volumeGroupId)
                && java.util.Objects.equals(this.retentionPeriod, other.retentionPeriod)
                && java.util.Objects.equals(
                        this.isPreventDeletionEnabled, other.isPreventDeletionEnabled)
                && java.util.Objects.equals(
                        this.isRetentionLockEnabled, other.isRetentionLockEnabled)
                && java.util.Objects.equals(
                        this.isIndefiniteRetentionEnabled, other.isIndefiniteRetentionEnabled)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result =
                (result * PRIME)
                        + (this.volumeGroupId == null ? 43 : this.volumeGroupId.hashCode());
        result =
                (result * PRIME)
                        + (this.retentionPeriod == null ? 43 : this.retentionPeriod.hashCode());
        result =
                (result * PRIME)
                        + (this.isPreventDeletionEnabled == null
                                ? 43
                                : this.isPreventDeletionEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isRetentionLockEnabled == null
                                ? 43
                                : this.isRetentionLockEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isIndefiniteRetentionEnabled == null
                                ? 43
                                : this.isIndefiniteRetentionEnabled.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
