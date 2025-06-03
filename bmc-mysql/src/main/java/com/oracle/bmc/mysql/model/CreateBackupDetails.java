/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * Complete information for a Backup. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateBackupDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateBackupDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "description",
        "softDelete",
        "backupType",
        "dbSystemId",
        "retentionInDays",
        "freeformTags",
        "definedTags"
    })
    public CreateBackupDetails(
            String displayName,
            String description,
            SoftDelete softDelete,
            BackupType backupType,
            String dbSystemId,
            Integer retentionInDays,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.softDelete = softDelete;
        this.backupType = backupType;
        this.dbSystemId = dbSystemId;
        this.retentionInDays = retentionInDays;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** A user-supplied display name for the backup. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-supplied display name for the backup.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** A user-supplied description for the backup. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A user-supplied description for the backup.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Retains the backup to be deleted due to the retention policy in DELETE SCHEDULED state
         * for 7 days before permanently deleting it.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("softDelete")
        private SoftDelete softDelete;

        /**
         * Retains the backup to be deleted due to the retention policy in DELETE SCHEDULED state
         * for 7 days before permanently deleting it.
         *
         * @param softDelete the value to set
         * @return this builder
         */
        public Builder softDelete(SoftDelete softDelete) {
            this.softDelete = softDelete;
            this.__explicitlySet__.add("softDelete");
            return this;
        }
        /** The type of backup. */
        @com.fasterxml.jackson.annotation.JsonProperty("backupType")
        private BackupType backupType;

        /**
         * The type of backup.
         *
         * @param backupType the value to set
         * @return this builder
         */
        public Builder backupType(BackupType backupType) {
            this.backupType = backupType;
            this.__explicitlySet__.add("backupType");
            return this;
        }
        /** The OCID of the DB System the Backup is associated with. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbSystemId")
        private String dbSystemId;

        /**
         * The OCID of the DB System the Backup is associated with.
         *
         * @param dbSystemId the value to set
         * @return this builder
         */
        public Builder dbSystemId(String dbSystemId) {
            this.dbSystemId = dbSystemId;
            this.__explicitlySet__.add("dbSystemId");
            return this;
        }
        /** Number of days to retain this backup. */
        @com.fasterxml.jackson.annotation.JsonProperty("retentionInDays")
        private Integer retentionInDays;

        /**
         * Number of days to retain this backup.
         *
         * @param retentionInDays the value to set
         * @return this builder
         */
        public Builder retentionInDays(Integer retentionInDays) {
            this.retentionInDays = retentionInDays;
            this.__explicitlySet__.add("retentionInDays");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateBackupDetails build() {
            CreateBackupDetails model =
                    new CreateBackupDetails(
                            this.displayName,
                            this.description,
                            this.softDelete,
                            this.backupType,
                            this.dbSystemId,
                            this.retentionInDays,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateBackupDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("softDelete")) {
                this.softDelete(model.getSoftDelete());
            }
            if (model.wasPropertyExplicitlySet("backupType")) {
                this.backupType(model.getBackupType());
            }
            if (model.wasPropertyExplicitlySet("dbSystemId")) {
                this.dbSystemId(model.getDbSystemId());
            }
            if (model.wasPropertyExplicitlySet("retentionInDays")) {
                this.retentionInDays(model.getRetentionInDays());
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

    /** A user-supplied display name for the backup. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-supplied display name for the backup.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** A user-supplied description for the backup. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A user-supplied description for the backup.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * Retains the backup to be deleted due to the retention policy in DELETE SCHEDULED state for 7
     * days before permanently deleting it.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("softDelete")
    private final SoftDelete softDelete;

    /**
     * Retains the backup to be deleted due to the retention policy in DELETE SCHEDULED state for 7
     * days before permanently deleting it.
     *
     * @return the value
     */
    public SoftDelete getSoftDelete() {
        return softDelete;
    }

    /** The type of backup. */
    public enum BackupType implements com.oracle.bmc.http.internal.BmcEnum {
        Full("FULL"),
        Incremental("INCREMENTAL"),
        ;

        private final String value;
        private static java.util.Map<String, BackupType> map;

        static {
            map = new java.util.HashMap<>();
            for (BackupType v : BackupType.values()) {
                map.put(v.getValue(), v);
            }
        }

        BackupType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static BackupType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid BackupType: " + key);
        }
    };
    /** The type of backup. */
    @com.fasterxml.jackson.annotation.JsonProperty("backupType")
    private final BackupType backupType;

    /**
     * The type of backup.
     *
     * @return the value
     */
    public BackupType getBackupType() {
        return backupType;
    }

    /** The OCID of the DB System the Backup is associated with. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbSystemId")
    private final String dbSystemId;

    /**
     * The OCID of the DB System the Backup is associated with.
     *
     * @return the value
     */
    public String getDbSystemId() {
        return dbSystemId;
    }

    /** Number of days to retain this backup. */
    @com.fasterxml.jackson.annotation.JsonProperty("retentionInDays")
    private final Integer retentionInDays;

    /**
     * Number of days to retain this backup.
     *
     * @return the value
     */
    public Integer getRetentionInDays() {
        return retentionInDays;
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
        sb.append("CreateBackupDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", softDelete=").append(String.valueOf(this.softDelete));
        sb.append(", backupType=").append(String.valueOf(this.backupType));
        sb.append(", dbSystemId=").append(String.valueOf(this.dbSystemId));
        sb.append(", retentionInDays=").append(String.valueOf(this.retentionInDays));
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
        if (!(o instanceof CreateBackupDetails)) {
            return false;
        }

        CreateBackupDetails other = (CreateBackupDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.softDelete, other.softDelete)
                && java.util.Objects.equals(this.backupType, other.backupType)
                && java.util.Objects.equals(this.dbSystemId, other.dbSystemId)
                && java.util.Objects.equals(this.retentionInDays, other.retentionInDays)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.softDelete == null ? 43 : this.softDelete.hashCode());
        result = (result * PRIME) + (this.backupType == null ? 43 : this.backupType.hashCode());
        result = (result * PRIME) + (this.dbSystemId == null ? 43 : this.dbSystemId.hashCode());
        result =
                (result * PRIME)
                        + (this.retentionInDays == null ? 43 : this.retentionInDays.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
