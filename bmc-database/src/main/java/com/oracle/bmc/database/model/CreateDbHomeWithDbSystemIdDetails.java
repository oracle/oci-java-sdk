/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Note that a valid {@code dbSystemId} value must be supplied for the {@code
 * CreateDbHomeWithDbSystemId} API operation to successfully complete. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateDbHomeWithDbSystemIdDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "source")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class CreateDbHomeWithDbSystemIdDetails extends CreateDbHomeBase {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
        private String kmsKeyId;

        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            this.__explicitlySet__.add("kmsKeyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyVersionId")
        private String kmsKeyVersionId;

        public Builder kmsKeyVersionId(String kmsKeyVersionId) {
            this.kmsKeyVersionId = kmsKeyVersionId;
            this.__explicitlySet__.add("kmsKeyVersionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseSoftwareImageId")
        private String databaseSoftwareImageId;

        public Builder databaseSoftwareImageId(String databaseSoftwareImageId) {
            this.databaseSoftwareImageId = databaseSoftwareImageId;
            this.__explicitlySet__.add("databaseSoftwareImageId");
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

        @com.fasterxml.jackson.annotation.JsonProperty("isDesupportedVersion")
        private Boolean isDesupportedVersion;

        public Builder isDesupportedVersion(Boolean isDesupportedVersion) {
            this.isDesupportedVersion = isDesupportedVersion;
            this.__explicitlySet__.add("isDesupportedVersion");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * DB system.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dbSystemId")
        private String dbSystemId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * DB system.
         *
         * @param dbSystemId the value to set
         * @return this builder
         */
        public Builder dbSystemId(String dbSystemId) {
            this.dbSystemId = dbSystemId;
            this.__explicitlySet__.add("dbSystemId");
            return this;
        }
        /**
         * A valid Oracle Database version. To get a list of supported versions, use the {@link
         * #listDbVersions(ListDbVersionsRequest) listDbVersions} operation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dbVersion")
        private String dbVersion;

        /**
         * A valid Oracle Database version. To get a list of supported versions, use the {@link
         * #listDbVersions(ListDbVersionsRequest) listDbVersions} operation.
         *
         * @param dbVersion the value to set
         * @return this builder
         */
        public Builder dbVersion(String dbVersion) {
            this.dbVersion = dbVersion;
            this.__explicitlySet__.add("dbVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("database")
        private CreateDatabaseDetails database;

        public Builder database(CreateDatabaseDetails database) {
            this.database = database;
            this.__explicitlySet__.add("database");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateDbHomeWithDbSystemIdDetails build() {
            CreateDbHomeWithDbSystemIdDetails model =
                    new CreateDbHomeWithDbSystemIdDetails(
                            this.displayName,
                            this.kmsKeyId,
                            this.kmsKeyVersionId,
                            this.databaseSoftwareImageId,
                            this.freeformTags,
                            this.definedTags,
                            this.isDesupportedVersion,
                            this.dbSystemId,
                            this.dbVersion,
                            this.database);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDbHomeWithDbSystemIdDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("kmsKeyId")) {
                this.kmsKeyId(model.getKmsKeyId());
            }
            if (model.wasPropertyExplicitlySet("kmsKeyVersionId")) {
                this.kmsKeyVersionId(model.getKmsKeyVersionId());
            }
            if (model.wasPropertyExplicitlySet("databaseSoftwareImageId")) {
                this.databaseSoftwareImageId(model.getDatabaseSoftwareImageId());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("isDesupportedVersion")) {
                this.isDesupportedVersion(model.getIsDesupportedVersion());
            }
            if (model.wasPropertyExplicitlySet("dbSystemId")) {
                this.dbSystemId(model.getDbSystemId());
            }
            if (model.wasPropertyExplicitlySet("dbVersion")) {
                this.dbVersion(model.getDbVersion());
            }
            if (model.wasPropertyExplicitlySet("database")) {
                this.database(model.getDatabase());
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

    @Deprecated
    public CreateDbHomeWithDbSystemIdDetails(
            String displayName,
            String kmsKeyId,
            String kmsKeyVersionId,
            String databaseSoftwareImageId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            Boolean isDesupportedVersion,
            String dbSystemId,
            String dbVersion,
            CreateDatabaseDetails database) {
        super(
                displayName,
                kmsKeyId,
                kmsKeyVersionId,
                databaseSoftwareImageId,
                freeformTags,
                definedTags,
                isDesupportedVersion);
        this.dbSystemId = dbSystemId;
        this.dbVersion = dbVersion;
        this.database = database;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the DB
     * system.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dbSystemId")
    private final String dbSystemId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the DB
     * system.
     *
     * @return the value
     */
    public String getDbSystemId() {
        return dbSystemId;
    }

    /**
     * A valid Oracle Database version. To get a list of supported versions, use the {@link
     * #listDbVersions(ListDbVersionsRequest) listDbVersions} operation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dbVersion")
    private final String dbVersion;

    /**
     * A valid Oracle Database version. To get a list of supported versions, use the {@link
     * #listDbVersions(ListDbVersionsRequest) listDbVersions} operation.
     *
     * @return the value
     */
    public String getDbVersion() {
        return dbVersion;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("database")
    private final CreateDatabaseDetails database;

    public CreateDatabaseDetails getDatabase() {
        return database;
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
        sb.append("CreateDbHomeWithDbSystemIdDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", dbSystemId=").append(String.valueOf(this.dbSystemId));
        sb.append(", dbVersion=").append(String.valueOf(this.dbVersion));
        sb.append(", database=").append(String.valueOf(this.database));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDbHomeWithDbSystemIdDetails)) {
            return false;
        }

        CreateDbHomeWithDbSystemIdDetails other = (CreateDbHomeWithDbSystemIdDetails) o;
        return java.util.Objects.equals(this.dbSystemId, other.dbSystemId)
                && java.util.Objects.equals(this.dbVersion, other.dbVersion)
                && java.util.Objects.equals(this.database, other.database)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.dbSystemId == null ? 43 : this.dbSystemId.hashCode());
        result = (result * PRIME) + (this.dbVersion == null ? 43 : this.dbVersion.hashCode());
        result = (result * PRIME) + (this.database == null ? 43 : this.database.hashCode());
        return result;
    }
}
