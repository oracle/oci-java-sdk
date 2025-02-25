/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics.model;

/**
 * Details for database wallet.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DatabaseWalletDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DatabaseWalletDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"databaseWallet", "serviceName"})
    public DatabaseWalletDetails(String databaseWallet, String serviceName) {
        super();
        this.databaseWallet = databaseWallet;
        this.serviceName = serviceName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The database wallet configuration zip file.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("databaseWallet")
        private String databaseWallet;

        /**
         * The database wallet configuration zip file.
         * @param databaseWallet the value to set
         * @return this builder
         **/
        public Builder databaseWallet(String databaseWallet) {
            this.databaseWallet = databaseWallet;
            this.__explicitlySet__.add("databaseWallet");
            return this;
        }
        /**
         * Service name of the database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
        private String serviceName;

        /**
         * Service name of the database.
         * @param serviceName the value to set
         * @return this builder
         **/
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            this.__explicitlySet__.add("serviceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DatabaseWalletDetails build() {
            DatabaseWalletDetails model =
                    new DatabaseWalletDetails(this.databaseWallet, this.serviceName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatabaseWalletDetails model) {
            if (model.wasPropertyExplicitlySet("databaseWallet")) {
                this.databaseWallet(model.getDatabaseWallet());
            }
            if (model.wasPropertyExplicitlySet("serviceName")) {
                this.serviceName(model.getServiceName());
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
     * The database wallet configuration zip file.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseWallet")
    private final String databaseWallet;

    /**
     * The database wallet configuration zip file.
     * @return the value
     **/
    public String getDatabaseWallet() {
        return databaseWallet;
    }

    /**
     * Service name of the database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
    private final String serviceName;

    /**
     * Service name of the database.
     * @return the value
     **/
    public String getServiceName() {
        return serviceName;
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
        sb.append("DatabaseWalletDetails(");
        sb.append("super=").append(super.toString());
        sb.append("databaseWallet=").append(String.valueOf(this.databaseWallet));
        sb.append(", serviceName=").append(String.valueOf(this.serviceName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatabaseWalletDetails)) {
            return false;
        }

        DatabaseWalletDetails other = (DatabaseWalletDetails) o;
        return java.util.Objects.equals(this.databaseWallet, other.databaseWallet)
                && java.util.Objects.equals(this.serviceName, other.serviceName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.databaseWallet == null ? 43 : this.databaseWallet.hashCode());
        result = (result * PRIME) + (this.serviceName == null ? 43 : this.serviceName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
