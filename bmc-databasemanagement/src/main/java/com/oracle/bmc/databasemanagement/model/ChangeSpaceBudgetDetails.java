/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details required to change the disk space limit for the SQL Management Base. It takes either
 * credentials or databaseCredential. It's recommended to provide databaseCredential <br>
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
        builder = ChangeSpaceBudgetDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ChangeSpaceBudgetDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"spaceBudgetPercent", "credentials", "databaseCredential"})
    public ChangeSpaceBudgetDetails(
            Double spaceBudgetPercent,
            ManagedDatabaseCredential credentials,
            DatabaseCredentialDetails databaseCredential) {
        super();
        this.spaceBudgetPercent = spaceBudgetPercent;
        this.credentials = credentials;
        this.databaseCredential = databaseCredential;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The maximum percent of {@code SYSAUX} space that the SQL Management Base can use. */
        @com.fasterxml.jackson.annotation.JsonProperty("spaceBudgetPercent")
        private Double spaceBudgetPercent;

        /**
         * The maximum percent of {@code SYSAUX} space that the SQL Management Base can use.
         *
         * @param spaceBudgetPercent the value to set
         * @return this builder
         */
        public Builder spaceBudgetPercent(Double spaceBudgetPercent) {
            this.spaceBudgetPercent = spaceBudgetPercent;
            this.__explicitlySet__.add("spaceBudgetPercent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("credentials")
        private ManagedDatabaseCredential credentials;

        public Builder credentials(ManagedDatabaseCredential credentials) {
            this.credentials = credentials;
            this.__explicitlySet__.add("credentials");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseCredential")
        private DatabaseCredentialDetails databaseCredential;

        public Builder databaseCredential(DatabaseCredentialDetails databaseCredential) {
            this.databaseCredential = databaseCredential;
            this.__explicitlySet__.add("databaseCredential");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ChangeSpaceBudgetDetails build() {
            ChangeSpaceBudgetDetails model =
                    new ChangeSpaceBudgetDetails(
                            this.spaceBudgetPercent, this.credentials, this.databaseCredential);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ChangeSpaceBudgetDetails model) {
            if (model.wasPropertyExplicitlySet("spaceBudgetPercent")) {
                this.spaceBudgetPercent(model.getSpaceBudgetPercent());
            }
            if (model.wasPropertyExplicitlySet("credentials")) {
                this.credentials(model.getCredentials());
            }
            if (model.wasPropertyExplicitlySet("databaseCredential")) {
                this.databaseCredential(model.getDatabaseCredential());
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

    /** The maximum percent of {@code SYSAUX} space that the SQL Management Base can use. */
    @com.fasterxml.jackson.annotation.JsonProperty("spaceBudgetPercent")
    private final Double spaceBudgetPercent;

    /**
     * The maximum percent of {@code SYSAUX} space that the SQL Management Base can use.
     *
     * @return the value
     */
    public Double getSpaceBudgetPercent() {
        return spaceBudgetPercent;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("credentials")
    private final ManagedDatabaseCredential credentials;

    public ManagedDatabaseCredential getCredentials() {
        return credentials;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("databaseCredential")
    private final DatabaseCredentialDetails databaseCredential;

    public DatabaseCredentialDetails getDatabaseCredential() {
        return databaseCredential;
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
        sb.append("ChangeSpaceBudgetDetails(");
        sb.append("super=").append(super.toString());
        sb.append("spaceBudgetPercent=").append(String.valueOf(this.spaceBudgetPercent));
        sb.append(", credentials=").append(String.valueOf(this.credentials));
        sb.append(", databaseCredential=").append(String.valueOf(this.databaseCredential));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChangeSpaceBudgetDetails)) {
            return false;
        }

        ChangeSpaceBudgetDetails other = (ChangeSpaceBudgetDetails) o;
        return java.util.Objects.equals(this.spaceBudgetPercent, other.spaceBudgetPercent)
                && java.util.Objects.equals(this.credentials, other.credentials)
                && java.util.Objects.equals(this.databaseCredential, other.databaseCredential)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.spaceBudgetPercent == null
                                ? 43
                                : this.spaceBudgetPercent.hashCode());
        result = (result * PRIME) + (this.credentials == null ? 43 : this.credentials.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseCredential == null
                                ? 43
                                : this.databaseCredential.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
