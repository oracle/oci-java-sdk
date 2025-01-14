/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Parameters for converting Refreshable Clone Pluggable Database into Regular Pluggable Database.
 * <br>
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
        builder = ConvertToRegularPluggableDatabaseDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ConvertToRegularPluggableDatabaseDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "shouldCreatePdbBackup",
        "containerDatabaseAdminPassword",
        "tdeWalletPassword"
    })
    public ConvertToRegularPluggableDatabaseDetails(
            Boolean shouldCreatePdbBackup,
            String containerDatabaseAdminPassword,
            String tdeWalletPassword) {
        super();
        this.shouldCreatePdbBackup = shouldCreatePdbBackup;
        this.containerDatabaseAdminPassword = containerDatabaseAdminPassword;
        this.tdeWalletPassword = tdeWalletPassword;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Indicates whether to take Pluggable Database Backup after the operation. */
        @com.fasterxml.jackson.annotation.JsonProperty("shouldCreatePdbBackup")
        private Boolean shouldCreatePdbBackup;

        /**
         * Indicates whether to take Pluggable Database Backup after the operation.
         *
         * @param shouldCreatePdbBackup the value to set
         * @return this builder
         */
        public Builder shouldCreatePdbBackup(Boolean shouldCreatePdbBackup) {
            this.shouldCreatePdbBackup = shouldCreatePdbBackup;
            this.__explicitlySet__.add("shouldCreatePdbBackup");
            return this;
        }
        /** The DB system administrator password of the Container Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("containerDatabaseAdminPassword")
        private String containerDatabaseAdminPassword;

        /**
         * The DB system administrator password of the Container Database.
         *
         * @param containerDatabaseAdminPassword the value to set
         * @return this builder
         */
        public Builder containerDatabaseAdminPassword(String containerDatabaseAdminPassword) {
            this.containerDatabaseAdminPassword = containerDatabaseAdminPassword;
            this.__explicitlySet__.add("containerDatabaseAdminPassword");
            return this;
        }
        /** The existing TDE wallet password of the Container Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("tdeWalletPassword")
        private String tdeWalletPassword;

        /**
         * The existing TDE wallet password of the Container Database.
         *
         * @param tdeWalletPassword the value to set
         * @return this builder
         */
        public Builder tdeWalletPassword(String tdeWalletPassword) {
            this.tdeWalletPassword = tdeWalletPassword;
            this.__explicitlySet__.add("tdeWalletPassword");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ConvertToRegularPluggableDatabaseDetails build() {
            ConvertToRegularPluggableDatabaseDetails model =
                    new ConvertToRegularPluggableDatabaseDetails(
                            this.shouldCreatePdbBackup,
                            this.containerDatabaseAdminPassword,
                            this.tdeWalletPassword);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ConvertToRegularPluggableDatabaseDetails model) {
            if (model.wasPropertyExplicitlySet("shouldCreatePdbBackup")) {
                this.shouldCreatePdbBackup(model.getShouldCreatePdbBackup());
            }
            if (model.wasPropertyExplicitlySet("containerDatabaseAdminPassword")) {
                this.containerDatabaseAdminPassword(model.getContainerDatabaseAdminPassword());
            }
            if (model.wasPropertyExplicitlySet("tdeWalletPassword")) {
                this.tdeWalletPassword(model.getTdeWalletPassword());
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

    /** Indicates whether to take Pluggable Database Backup after the operation. */
    @com.fasterxml.jackson.annotation.JsonProperty("shouldCreatePdbBackup")
    private final Boolean shouldCreatePdbBackup;

    /**
     * Indicates whether to take Pluggable Database Backup after the operation.
     *
     * @return the value
     */
    public Boolean getShouldCreatePdbBackup() {
        return shouldCreatePdbBackup;
    }

    /** The DB system administrator password of the Container Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("containerDatabaseAdminPassword")
    private final String containerDatabaseAdminPassword;

    /**
     * The DB system administrator password of the Container Database.
     *
     * @return the value
     */
    public String getContainerDatabaseAdminPassword() {
        return containerDatabaseAdminPassword;
    }

    /** The existing TDE wallet password of the Container Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("tdeWalletPassword")
    private final String tdeWalletPassword;

    /**
     * The existing TDE wallet password of the Container Database.
     *
     * @return the value
     */
    public String getTdeWalletPassword() {
        return tdeWalletPassword;
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
        sb.append("ConvertToRegularPluggableDatabaseDetails(");
        sb.append("super=").append(super.toString());
        sb.append("shouldCreatePdbBackup=").append(String.valueOf(this.shouldCreatePdbBackup));
        sb.append(", containerDatabaseAdminPassword=").append("<redacted>");
        sb.append(", tdeWalletPassword=").append("<redacted>");
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ConvertToRegularPluggableDatabaseDetails)) {
            return false;
        }

        ConvertToRegularPluggableDatabaseDetails other =
                (ConvertToRegularPluggableDatabaseDetails) o;
        return java.util.Objects.equals(this.shouldCreatePdbBackup, other.shouldCreatePdbBackup)
                && java.util.Objects.equals(
                        this.containerDatabaseAdminPassword, other.containerDatabaseAdminPassword)
                && java.util.Objects.equals(this.tdeWalletPassword, other.tdeWalletPassword)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.shouldCreatePdbBackup == null
                                ? 43
                                : this.shouldCreatePdbBackup.hashCode());
        result =
                (result * PRIME)
                        + (this.containerDatabaseAdminPassword == null
                                ? 43
                                : this.containerDatabaseAdminPassword.hashCode());
        result =
                (result * PRIME)
                        + (this.tdeWalletPassword == null ? 43 : this.tdeWalletPassword.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
