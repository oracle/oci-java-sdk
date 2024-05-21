/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details required to drop a Sql tuning set.
 * It takes either credentialDetails or databaseCredential. It's recommended to provide databaseCredential
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DropSqlTuningSetDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DropSqlTuningSetDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "credentialDetails",
        "databaseCredential",
        "name",
        "owner",
        "showSqlOnly"
    })
    public DropSqlTuningSetDetails(
            SqlTuningSetAdminCredentialDetails credentialDetails,
            DatabaseCredentialDetails databaseCredential,
            String name,
            String owner,
            Integer showSqlOnly) {
        super();
        this.credentialDetails = credentialDetails;
        this.databaseCredential = databaseCredential;
        this.name = name;
        this.owner = owner;
        this.showSqlOnly = showSqlOnly;
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
        /**
         * A unique Sql tuning set name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * A unique Sql tuning set name.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Owner of the Sql tuning set.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("owner")
        private String owner;

        /**
         * Owner of the Sql tuning set.
         * @param owner the value to set
         * @return this builder
         **/
        public Builder owner(String owner) {
            this.owner = owner;
            this.__explicitlySet__.add("owner");
            return this;
        }
        /**
         * Flag to indicate whether to drop  the Sql tuning set or just display the plsql used to drop Sql tuning set.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("showSqlOnly")
        private Integer showSqlOnly;

        /**
         * Flag to indicate whether to drop  the Sql tuning set or just display the plsql used to drop Sql tuning set.
         *
         * @param showSqlOnly the value to set
         * @return this builder
         **/
        public Builder showSqlOnly(Integer showSqlOnly) {
            this.showSqlOnly = showSqlOnly;
            this.__explicitlySet__.add("showSqlOnly");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DropSqlTuningSetDetails build() {
            DropSqlTuningSetDetails model =
                    new DropSqlTuningSetDetails(
                            this.credentialDetails,
                            this.databaseCredential,
                            this.name,
                            this.owner,
                            this.showSqlOnly);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DropSqlTuningSetDetails model) {
            if (model.wasPropertyExplicitlySet("credentialDetails")) {
                this.credentialDetails(model.getCredentialDetails());
            }
            if (model.wasPropertyExplicitlySet("databaseCredential")) {
                this.databaseCredential(model.getDatabaseCredential());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("owner")) {
                this.owner(model.getOwner());
            }
            if (model.wasPropertyExplicitlySet("showSqlOnly")) {
                this.showSqlOnly(model.getShowSqlOnly());
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

    /**
     * A unique Sql tuning set name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * A unique Sql tuning set name.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Owner of the Sql tuning set.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("owner")
    private final String owner;

    /**
     * Owner of the Sql tuning set.
     * @return the value
     **/
    public String getOwner() {
        return owner;
    }

    /**
     * Flag to indicate whether to drop  the Sql tuning set or just display the plsql used to drop Sql tuning set.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("showSqlOnly")
    private final Integer showSqlOnly;

    /**
     * Flag to indicate whether to drop  the Sql tuning set or just display the plsql used to drop Sql tuning set.
     *
     * @return the value
     **/
    public Integer getShowSqlOnly() {
        return showSqlOnly;
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
        sb.append("DropSqlTuningSetDetails(");
        sb.append("super=").append(super.toString());
        sb.append("credentialDetails=").append(String.valueOf(this.credentialDetails));
        sb.append(", databaseCredential=").append(String.valueOf(this.databaseCredential));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", owner=").append(String.valueOf(this.owner));
        sb.append(", showSqlOnly=").append(String.valueOf(this.showSqlOnly));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DropSqlTuningSetDetails)) {
            return false;
        }

        DropSqlTuningSetDetails other = (DropSqlTuningSetDetails) o;
        return java.util.Objects.equals(this.credentialDetails, other.credentialDetails)
                && java.util.Objects.equals(this.databaseCredential, other.databaseCredential)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.owner, other.owner)
                && java.util.Objects.equals(this.showSqlOnly, other.showSqlOnly)
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
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.owner == null ? 43 : this.owner.hashCode());
        result = (result * PRIME) + (this.showSqlOnly == null ? 43 : this.showSqlOnly.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
