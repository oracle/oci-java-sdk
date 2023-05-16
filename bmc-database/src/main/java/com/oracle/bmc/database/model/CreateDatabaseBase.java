/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details for creating a database.
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
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "source",
        defaultImpl = CreateDatabaseBase.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreateNewDatabaseDetails.class,
            name = "NONE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreateDatabaseFromBackup.class,
            name = "DB_BACKUP")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class CreateDatabaseBase extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"dbHomeId", "dbVersion", "kmsKeyId", "kmsKeyVersionId"})
    protected CreateDatabaseBase(
            String dbHomeId, String dbVersion, String kmsKeyId, String kmsKeyVersionId) {
        super();
        this.dbHomeId = dbHomeId;
        this.dbVersion = dbVersion;
        this.kmsKeyId = kmsKeyId;
        this.kmsKeyVersionId = kmsKeyVersionId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Database Home.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dbHomeId")
    private final String dbHomeId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Database Home.
     *
     * @return the value
     */
    public String getDbHomeId() {
        return dbHomeId;
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
     * The OCID of the key container that is used as the master encryption key in database
     * transparent data encryption (TDE) operations.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
    private final String kmsKeyId;

    /**
     * The OCID of the key container that is used as the master encryption key in database
     * transparent data encryption (TDE) operations.
     *
     * @return the value
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * The OCID of the key container version that is used in database transparent data encryption
     * (TDE) operations KMS Key can have multiple key versions. If none is specified, the current
     * key version (latest) of the Key Id is used for the operation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyVersionId")
    private final String kmsKeyVersionId;

    /**
     * The OCID of the key container version that is used in database transparent data encryption
     * (TDE) operations KMS Key can have multiple key versions. If none is specified, the current
     * key version (latest) of the Key Id is used for the operation.
     *
     * @return the value
     */
    public String getKmsKeyVersionId() {
        return kmsKeyVersionId;
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
        sb.append("CreateDatabaseBase(");
        sb.append("super=").append(super.toString());
        sb.append("dbHomeId=").append(String.valueOf(this.dbHomeId));
        sb.append(", dbVersion=").append(String.valueOf(this.dbVersion));
        sb.append(", kmsKeyId=").append(String.valueOf(this.kmsKeyId));
        sb.append(", kmsKeyVersionId=").append(String.valueOf(this.kmsKeyVersionId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDatabaseBase)) {
            return false;
        }

        CreateDatabaseBase other = (CreateDatabaseBase) o;
        return java.util.Objects.equals(this.dbHomeId, other.dbHomeId)
                && java.util.Objects.equals(this.dbVersion, other.dbVersion)
                && java.util.Objects.equals(this.kmsKeyId, other.kmsKeyId)
                && java.util.Objects.equals(this.kmsKeyVersionId, other.kmsKeyVersionId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.dbHomeId == null ? 43 : this.dbHomeId.hashCode());
        result = (result * PRIME) + (this.dbVersion == null ? 43 : this.dbVersion.hashCode());
        result = (result * PRIME) + (this.kmsKeyId == null ? 43 : this.kmsKeyId.hashCode());
        result =
                (result * PRIME)
                        + (this.kmsKeyVersionId == null ? 43 : this.kmsKeyVersionId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /**
     * The source of the database: Use {@code NONE} for creating a new database. Use {@code
     * DB_BACKUP} for creating a new database by restoring from a backup. The default is {@code
     * NONE}.
     */
    public enum Source implements com.oracle.bmc.http.internal.BmcEnum {
        None("NONE"),
        DbBackup("DB_BACKUP"),
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
