/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details required to change the plan retention period.
 * It takes either credentials or databaseCredential. It's recommended to provide databaseCredential
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
    builder = ChangePlanRetentionDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ChangePlanRetentionDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"retentionWeeks", "credentials", "databaseCredential"})
    public ChangePlanRetentionDetails(
            Integer retentionWeeks,
            ManagedDatabaseCredential credentials,
            DatabaseCredentialDetails databaseCredential) {
        super();
        this.retentionWeeks = retentionWeeks;
        this.credentials = credentials;
        this.databaseCredential = databaseCredential;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The retention period in weeks. It can range between 5 and 523 weeks.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("retentionWeeks")
        private Integer retentionWeeks;

        /**
         * The retention period in weeks. It can range between 5 and 523 weeks.
         *
         * @param retentionWeeks the value to set
         * @return this builder
         **/
        public Builder retentionWeeks(Integer retentionWeeks) {
            this.retentionWeeks = retentionWeeks;
            this.__explicitlySet__.add("retentionWeeks");
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

        public ChangePlanRetentionDetails build() {
            ChangePlanRetentionDetails model =
                    new ChangePlanRetentionDetails(
                            this.retentionWeeks, this.credentials, this.databaseCredential);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ChangePlanRetentionDetails model) {
            if (model.wasPropertyExplicitlySet("retentionWeeks")) {
                this.retentionWeeks(model.getRetentionWeeks());
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
     * The retention period in weeks. It can range between 5 and 523 weeks.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("retentionWeeks")
    private final Integer retentionWeeks;

    /**
     * The retention period in weeks. It can range between 5 and 523 weeks.
     *
     * @return the value
     **/
    public Integer getRetentionWeeks() {
        return retentionWeeks;
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
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ChangePlanRetentionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("retentionWeeks=").append(String.valueOf(this.retentionWeeks));
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
        if (!(o instanceof ChangePlanRetentionDetails)) {
            return false;
        }

        ChangePlanRetentionDetails other = (ChangePlanRetentionDetails) o;
        return java.util.Objects.equals(this.retentionWeeks, other.retentionWeeks)
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
                        + (this.retentionWeeks == null ? 43 : this.retentionWeeks.hashCode());
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
