/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details for creating a Database Home.
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
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "source",
    defaultImpl = CreateDbHomeBase.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CreateDbHomeWithDbSystemIdFromDatabaseDetails.class,
        name = "DATABASE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CreateDbHomeWithDbSystemIdFromBackupDetails.class,
        name = "DB_BACKUP"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CreateDbHomeWithVmClusterIdFromBackupDetails.class,
        name = "VM_CLUSTER_BACKUP"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CreateDbHomeWithDbSystemIdDetails.class,
        name = "NONE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CreateDbHomeWithVmClusterIdDetails.class,
        name = "VM_CLUSTER_NEW"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class CreateDbHomeBase extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "kmsKeyId",
        "kmsKeyVersionId",
        "databaseSoftwareImageId",
        "freeformTags",
        "definedTags",
        "isDesupportedVersion",
        "isUnifiedAuditingEnabled"
    })
    protected CreateDbHomeBase(
            String displayName,
            String kmsKeyId,
            String kmsKeyVersionId,
            String databaseSoftwareImageId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            Boolean isDesupportedVersion,
            Boolean isUnifiedAuditingEnabled) {
        super();
        this.displayName = displayName;
        this.kmsKeyId = kmsKeyId;
        this.kmsKeyVersionId = kmsKeyVersionId;
        this.databaseSoftwareImageId = databaseSoftwareImageId;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.isDesupportedVersion = isDesupportedVersion;
        this.isUnifiedAuditingEnabled = isUnifiedAuditingEnabled;
    }

    /**
     * The user-provided name of the Database Home.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-provided name of the Database Home.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The OCID of the key container that is used as the master encryption key in database transparent data encryption (TDE) operations.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
    private final String kmsKeyId;

    /**
     * The OCID of the key container that is used as the master encryption key in database transparent data encryption (TDE) operations.
     * @return the value
     **/
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * The OCID of the key container version that is used in database transparent data encryption (TDE) operations KMS Key can have multiple key versions. If none is specified, the current key version (latest) of the Key Id is used for the operation. Autonomous Database Serverless does not use key versions, hence is not applicable for Autonomous Database Serverless instances.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyVersionId")
    private final String kmsKeyVersionId;

    /**
     * The OCID of the key container version that is used in database transparent data encryption (TDE) operations KMS Key can have multiple key versions. If none is specified, the current key version (latest) of the Key Id is used for the operation. Autonomous Database Serverless does not use key versions, hence is not applicable for Autonomous Database Serverless instances.
     *
     * @return the value
     **/
    public String getKmsKeyVersionId() {
        return kmsKeyVersionId;
    }

    /**
     * The database software image [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseSoftwareImageId")
    private final String databaseSoftwareImageId;

    /**
     * The database software image [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
     * @return the value
     **/
    public String getDatabaseSoftwareImageId() {
        return databaseSoftwareImageId;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * If true, the customer acknowledges that the specified Oracle Database software is an older release that is not currently supported by OCI.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDesupportedVersion")
    private final Boolean isDesupportedVersion;

    /**
     * If true, the customer acknowledges that the specified Oracle Database software is an older release that is not currently supported by OCI.
     * @return the value
     **/
    public Boolean getIsDesupportedVersion() {
        return isDesupportedVersion;
    }

    /**
     * Indicates whether unified autiding is enabled or not. Set to True to enable unified auditing on respective DBHome.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isUnifiedAuditingEnabled")
    private final Boolean isUnifiedAuditingEnabled;

    /**
     * Indicates whether unified autiding is enabled or not. Set to True to enable unified auditing on respective DBHome.
     * @return the value
     **/
    public Boolean getIsUnifiedAuditingEnabled() {
        return isUnifiedAuditingEnabled;
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
        sb.append("CreateDbHomeBase(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", kmsKeyId=").append(String.valueOf(this.kmsKeyId));
        sb.append(", kmsKeyVersionId=").append(String.valueOf(this.kmsKeyVersionId));
        sb.append(", databaseSoftwareImageId=")
                .append(String.valueOf(this.databaseSoftwareImageId));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", isDesupportedVersion=").append(String.valueOf(this.isDesupportedVersion));
        sb.append(", isUnifiedAuditingEnabled=")
                .append(String.valueOf(this.isUnifiedAuditingEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDbHomeBase)) {
            return false;
        }

        CreateDbHomeBase other = (CreateDbHomeBase) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.kmsKeyId, other.kmsKeyId)
                && java.util.Objects.equals(this.kmsKeyVersionId, other.kmsKeyVersionId)
                && java.util.Objects.equals(
                        this.databaseSoftwareImageId, other.databaseSoftwareImageId)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.isDesupportedVersion, other.isDesupportedVersion)
                && java.util.Objects.equals(
                        this.isUnifiedAuditingEnabled, other.isUnifiedAuditingEnabled)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.kmsKeyId == null ? 43 : this.kmsKeyId.hashCode());
        result =
                (result * PRIME)
                        + (this.kmsKeyVersionId == null ? 43 : this.kmsKeyVersionId.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseSoftwareImageId == null
                                ? 43
                                : this.databaseSoftwareImageId.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.isDesupportedVersion == null
                                ? 43
                                : this.isDesupportedVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.isUnifiedAuditingEnabled == null
                                ? 43
                                : this.isUnifiedAuditingEnabled.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /**
     * The source of database: NONE for creating a new database. DB_BACKUP for creating a new database by restoring from a database backup.
     *
     **/
    public enum Source {
        None("NONE"),
        DbBackup("DB_BACKUP"),
        Database("DATABASE"),
        VmClusterBackup("VM_CLUSTER_BACKUP"),
        VmClusterNew("VM_CLUSTER_NEW"),
        ;

        private final String value;
        private static java.util.Map<String, Source> map;

        static {
            map = new java.util.HashMap<>();
            for (Source v : Source.values()) {
                map.put(v.getValue(), v);
            }
        }

        Source(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Source create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Source: " + key);
        }
    };
}
