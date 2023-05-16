/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Note that a valid {@code vmClusterId} value must be supplied for the {@code
 * CreateDbHomeWithVmClusterIdFromBackup} API operation to successfully complete. <br>
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
        builder = CreateDbHomeWithVmClusterIdFromBackupDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "source")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateDbHomeWithVmClusterIdFromBackupDetails extends CreateDbHomeBase {
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
         * VM cluster.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vmClusterId")
        private String vmClusterId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * VM cluster.
         *
         * @param vmClusterId the value to set
         * @return this builder
         */
        public Builder vmClusterId(String vmClusterId) {
            this.vmClusterId = vmClusterId;
            this.__explicitlySet__.add("vmClusterId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("database")
        private CreateDatabaseFromBackupDetails database;

        public Builder database(CreateDatabaseFromBackupDetails database) {
            this.database = database;
            this.__explicitlySet__.add("database");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateDbHomeWithVmClusterIdFromBackupDetails build() {
            CreateDbHomeWithVmClusterIdFromBackupDetails model =
                    new CreateDbHomeWithVmClusterIdFromBackupDetails(
                            this.displayName,
                            this.kmsKeyId,
                            this.kmsKeyVersionId,
                            this.databaseSoftwareImageId,
                            this.freeformTags,
                            this.definedTags,
                            this.isDesupportedVersion,
                            this.vmClusterId,
                            this.database);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDbHomeWithVmClusterIdFromBackupDetails model) {
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
            if (model.wasPropertyExplicitlySet("vmClusterId")) {
                this.vmClusterId(model.getVmClusterId());
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
    public CreateDbHomeWithVmClusterIdFromBackupDetails(
            String displayName,
            String kmsKeyId,
            String kmsKeyVersionId,
            String databaseSoftwareImageId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            Boolean isDesupportedVersion,
            String vmClusterId,
            CreateDatabaseFromBackupDetails database) {
        super(
                displayName,
                kmsKeyId,
                kmsKeyVersionId,
                databaseSoftwareImageId,
                freeformTags,
                definedTags,
                isDesupportedVersion);
        this.vmClusterId = vmClusterId;
        this.database = database;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VM
     * cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vmClusterId")
    private final String vmClusterId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VM
     * cluster.
     *
     * @return the value
     */
    public String getVmClusterId() {
        return vmClusterId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("database")
    private final CreateDatabaseFromBackupDetails database;

    public CreateDatabaseFromBackupDetails getDatabase() {
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
        sb.append("CreateDbHomeWithVmClusterIdFromBackupDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", vmClusterId=").append(String.valueOf(this.vmClusterId));
        sb.append(", database=").append(String.valueOf(this.database));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDbHomeWithVmClusterIdFromBackupDetails)) {
            return false;
        }

        CreateDbHomeWithVmClusterIdFromBackupDetails other =
                (CreateDbHomeWithVmClusterIdFromBackupDetails) o;
        return java.util.Objects.equals(this.vmClusterId, other.vmClusterId)
                && java.util.Objects.equals(this.database, other.database)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.vmClusterId == null ? 43 : this.vmClusterId.hashCode());
        result = (result * PRIME) + (this.database == null ? 43 : this.database.hashCode());
        return result;
    }
}
