/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details for creating a Database Home if you are creating a database by restoring from a database backup.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateDbHomeFromBackupDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateDbHomeFromBackupDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "databaseSoftwareImageId",
        "database",
        "freeformTags",
        "definedTags"
    })
    public CreateDbHomeFromBackupDetails(
            String displayName,
            String databaseSoftwareImageId,
            CreateDatabaseFromBackupDetails database,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.databaseSoftwareImageId = databaseSoftwareImageId;
        this.database = database;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The user-provided name of the Database Home.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-provided name of the Database Home.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The database software image [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the image to be used to restore a database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("databaseSoftwareImageId")
        private String databaseSoftwareImageId;

        /**
         * The database software image [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the image to be used to restore a database.
         * @param databaseSoftwareImageId the value to set
         * @return this builder
         **/
        public Builder databaseSoftwareImageId(String databaseSoftwareImageId) {
            this.databaseSoftwareImageId = databaseSoftwareImageId;
            this.__explicitlySet__.add("databaseSoftwareImageId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("database")
        private CreateDatabaseFromBackupDetails database;

        public Builder database(CreateDatabaseFromBackupDetails database) {
            this.database = database;
            this.__explicitlySet__.add("database");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateDbHomeFromBackupDetails build() {
            CreateDbHomeFromBackupDetails __instance__ =
                    new CreateDbHomeFromBackupDetails(
                            displayName,
                            databaseSoftwareImageId,
                            database,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDbHomeFromBackupDetails o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .databaseSoftwareImageId(o.getDatabaseSoftwareImageId())
                            .database(o.getDatabase())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags());

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

    public Builder toBuilder() {
        return new Builder().copy(this);
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
     * The database software image [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the image to be used to restore a database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseSoftwareImageId")
    private final String databaseSoftwareImageId;

    /**
     * The database software image [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the image to be used to restore a database.
     * @return the value
     **/
    public String getDatabaseSoftwareImageId() {
        return databaseSoftwareImageId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("database")
    private final CreateDatabaseFromBackupDetails database;

    public CreateDatabaseFromBackupDetails getDatabase() {
        return database;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
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
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("CreateDbHomeFromBackupDetails(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", databaseSoftwareImageId=")
                .append(String.valueOf(this.databaseSoftwareImageId));
        sb.append(", database=").append(String.valueOf(this.database));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDbHomeFromBackupDetails)) {
            return false;
        }

        CreateDbHomeFromBackupDetails other = (CreateDbHomeFromBackupDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(
                        this.databaseSoftwareImageId, other.databaseSoftwareImageId)
                && java.util.Objects.equals(this.database, other.database)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseSoftwareImageId == null
                                ? 43
                                : this.databaseSoftwareImageId.hashCode());
        result = (result * PRIME) + (this.database == null ? 43 : this.database.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
