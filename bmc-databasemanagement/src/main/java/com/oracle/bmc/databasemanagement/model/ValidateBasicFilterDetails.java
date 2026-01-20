/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * Validate the basic filter criteria provided by the user. It takes either credentialDetails or
 * databaseCredential. It's recommended to provide databaseCredential <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ValidateBasicFilterDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ValidateBasicFilterDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "credentialDetails",
        "databaseCredential",
        "owner",
        "name",
        "basicFilter"
    })
    public ValidateBasicFilterDetails(
            SqlTuningSetAdminCredentialDetails credentialDetails,
            DatabaseCredentialDetails databaseCredential,
            String owner,
            String name,
            String basicFilter) {
        super();
        this.credentialDetails = credentialDetails;
        this.databaseCredential = databaseCredential;
        this.owner = owner;
        this.name = name;
        this.basicFilter = basicFilter;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("credentialDetails")
        private SqlTuningSetAdminCredentialDetails credentialDetails;

        public Builder credentialDetails(SqlTuningSetAdminCredentialDetails credentialDetails) {
            this.credentialDetails = credentialDetails;
            this.__explicitlySet__.add("credentialDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseCredential")
        private DatabaseCredentialDetails databaseCredential;

        public Builder databaseCredential(DatabaseCredentialDetails databaseCredential) {
            this.databaseCredential = databaseCredential;
            this.__explicitlySet__.add("databaseCredential");
            return this;
        }
        /** The owner of the Sql tuning set. */
        @com.fasterxml.jackson.annotation.JsonProperty("owner")
        private String owner;

        /**
         * The owner of the Sql tuning set.
         *
         * @param owner the value to set
         * @return this builder
         */
        public Builder owner(String owner) {
            this.owner = owner;
            this.__explicitlySet__.add("owner");
            return this;
        }
        /** The name of the Sql tuning set. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the Sql tuning set.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Specifies the Sql predicate to filter the Sql from the Sql tuning set defined on
         * attributes of the SQLSET_ROW. User could use any combination of the following columns
         * with appropriate values as Sql predicate Refer to the documentation
         * https://docs.oracle.com/en/database/oracle/oracle-database/18/arpls/DBMS_SQLTUNE.html#GUID-1F4AFB03-7B29-46FC-B3F2-CB01EC36326C
         */
        @com.fasterxml.jackson.annotation.JsonProperty("basicFilter")
        private String basicFilter;

        /**
         * Specifies the Sql predicate to filter the Sql from the Sql tuning set defined on
         * attributes of the SQLSET_ROW. User could use any combination of the following columns
         * with appropriate values as Sql predicate Refer to the documentation
         * https://docs.oracle.com/en/database/oracle/oracle-database/18/arpls/DBMS_SQLTUNE.html#GUID-1F4AFB03-7B29-46FC-B3F2-CB01EC36326C
         *
         * @param basicFilter the value to set
         * @return this builder
         */
        public Builder basicFilter(String basicFilter) {
            this.basicFilter = basicFilter;
            this.__explicitlySet__.add("basicFilter");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ValidateBasicFilterDetails build() {
            ValidateBasicFilterDetails model =
                    new ValidateBasicFilterDetails(
                            this.credentialDetails,
                            this.databaseCredential,
                            this.owner,
                            this.name,
                            this.basicFilter);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ValidateBasicFilterDetails model) {
            if (model.wasPropertyExplicitlySet("credentialDetails")) {
                this.credentialDetails(model.getCredentialDetails());
            }
            if (model.wasPropertyExplicitlySet("databaseCredential")) {
                this.databaseCredential(model.getDatabaseCredential());
            }
            if (model.wasPropertyExplicitlySet("owner")) {
                this.owner(model.getOwner());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("basicFilter")) {
                this.basicFilter(model.getBasicFilter());
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

    @com.fasterxml.jackson.annotation.JsonProperty("credentialDetails")
    private final SqlTuningSetAdminCredentialDetails credentialDetails;

    public SqlTuningSetAdminCredentialDetails getCredentialDetails() {
        return credentialDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("databaseCredential")
    private final DatabaseCredentialDetails databaseCredential;

    public DatabaseCredentialDetails getDatabaseCredential() {
        return databaseCredential;
    }

    /** The owner of the Sql tuning set. */
    @com.fasterxml.jackson.annotation.JsonProperty("owner")
    private final String owner;

    /**
     * The owner of the Sql tuning set.
     *
     * @return the value
     */
    public String getOwner() {
        return owner;
    }

    /** The name of the Sql tuning set. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the Sql tuning set.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * Specifies the Sql predicate to filter the Sql from the Sql tuning set defined on attributes
     * of the SQLSET_ROW. User could use any combination of the following columns with appropriate
     * values as Sql predicate Refer to the documentation
     * https://docs.oracle.com/en/database/oracle/oracle-database/18/arpls/DBMS_SQLTUNE.html#GUID-1F4AFB03-7B29-46FC-B3F2-CB01EC36326C
     */
    @com.fasterxml.jackson.annotation.JsonProperty("basicFilter")
    private final String basicFilter;

    /**
     * Specifies the Sql predicate to filter the Sql from the Sql tuning set defined on attributes
     * of the SQLSET_ROW. User could use any combination of the following columns with appropriate
     * values as Sql predicate Refer to the documentation
     * https://docs.oracle.com/en/database/oracle/oracle-database/18/arpls/DBMS_SQLTUNE.html#GUID-1F4AFB03-7B29-46FC-B3F2-CB01EC36326C
     *
     * @return the value
     */
    public String getBasicFilter() {
        return basicFilter;
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
        sb.append("ValidateBasicFilterDetails(");
        sb.append("super=").append(super.toString());
        sb.append("credentialDetails=").append(String.valueOf(this.credentialDetails));
        sb.append(", databaseCredential=").append(String.valueOf(this.databaseCredential));
        sb.append(", owner=").append(String.valueOf(this.owner));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", basicFilter=").append(String.valueOf(this.basicFilter));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ValidateBasicFilterDetails)) {
            return false;
        }

        ValidateBasicFilterDetails other = (ValidateBasicFilterDetails) o;
        return java.util.Objects.equals(this.credentialDetails, other.credentialDetails)
                && java.util.Objects.equals(this.databaseCredential, other.databaseCredential)
                && java.util.Objects.equals(this.owner, other.owner)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.basicFilter, other.basicFilter)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.credentialDetails == null ? 43 : this.credentialDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseCredential == null
                                ? 43
                                : this.databaseCredential.hashCode());
        result = (result * PRIME) + (this.owner == null ? 43 : this.owner.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.basicFilter == null ? 43 : this.basicFilter.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
