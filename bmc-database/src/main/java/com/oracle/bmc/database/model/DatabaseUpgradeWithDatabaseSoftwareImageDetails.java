/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details of the database software image to be used to upgrade a database. <br>
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
        builder = DatabaseUpgradeWithDatabaseSoftwareImageDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "source")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DatabaseUpgradeWithDatabaseSoftwareImageDetails
        extends DatabaseUpgradeSourceBase {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("options")
        private String options;

        public Builder options(String options) {
            this.options = options;
            this.__explicitlySet__.add("options");
            return this;
        }
        /**
         * The database software image
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * image to be used to upgrade a database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseSoftwareImageId")
        private String databaseSoftwareImageId;

        /**
         * The database software image
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * image to be used to upgrade a database.
         *
         * @param databaseSoftwareImageId the value to set
         * @return this builder
         */
        public Builder databaseSoftwareImageId(String databaseSoftwareImageId) {
            this.databaseSoftwareImageId = databaseSoftwareImageId;
            this.__explicitlySet__.add("databaseSoftwareImageId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DatabaseUpgradeWithDatabaseSoftwareImageDetails build() {
            DatabaseUpgradeWithDatabaseSoftwareImageDetails model =
                    new DatabaseUpgradeWithDatabaseSoftwareImageDetails(
                            this.options, this.databaseSoftwareImageId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatabaseUpgradeWithDatabaseSoftwareImageDetails model) {
            if (model.wasPropertyExplicitlySet("options")) {
                this.options(model.getOptions());
            }
            if (model.wasPropertyExplicitlySet("databaseSoftwareImageId")) {
                this.databaseSoftwareImageId(model.getDatabaseSoftwareImageId());
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
    public DatabaseUpgradeWithDatabaseSoftwareImageDetails(
            String options, String databaseSoftwareImageId) {
        super(options);
        this.databaseSoftwareImageId = databaseSoftwareImageId;
    }

    /**
     * The database software image
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the image
     * to be used to upgrade a database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseSoftwareImageId")
    private final String databaseSoftwareImageId;

    /**
     * The database software image
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the image
     * to be used to upgrade a database.
     *
     * @return the value
     */
    public String getDatabaseSoftwareImageId() {
        return databaseSoftwareImageId;
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
        sb.append("DatabaseUpgradeWithDatabaseSoftwareImageDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", databaseSoftwareImageId=")
                .append(String.valueOf(this.databaseSoftwareImageId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatabaseUpgradeWithDatabaseSoftwareImageDetails)) {
            return false;
        }

        DatabaseUpgradeWithDatabaseSoftwareImageDetails other =
                (DatabaseUpgradeWithDatabaseSoftwareImageDetails) o;
        return java.util.Objects.equals(this.databaseSoftwareImageId, other.databaseSoftwareImageId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.databaseSoftwareImageId == null
                                ? 43
                                : this.databaseSoftwareImageId.hashCode());
        return result;
    }
}
