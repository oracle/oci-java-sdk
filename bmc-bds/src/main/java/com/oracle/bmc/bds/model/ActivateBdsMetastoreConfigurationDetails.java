/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * The reqeust body when activating a BDS metastore configuration <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ActivateBdsMetastoreConfigurationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ActivateBdsMetastoreConfigurationDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"bdsApiKeyPassphrase", "clusterAdminPassword"})
    public ActivateBdsMetastoreConfigurationDetails(
            String bdsApiKeyPassphrase, String clusterAdminPassword) {
        super();
        this.bdsApiKeyPassphrase = bdsApiKeyPassphrase;
        this.clusterAdminPassword = clusterAdminPassword;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Base-64 encoded passphrase of the BDS Api Key. Set only if metastore's type is EXTERNAL.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("bdsApiKeyPassphrase")
        private String bdsApiKeyPassphrase;

        /**
         * Base-64 encoded passphrase of the BDS Api Key. Set only if metastore's type is EXTERNAL.
         *
         * @param bdsApiKeyPassphrase the value to set
         * @return this builder
         */
        public Builder bdsApiKeyPassphrase(String bdsApiKeyPassphrase) {
            this.bdsApiKeyPassphrase = bdsApiKeyPassphrase;
            this.__explicitlySet__.add("bdsApiKeyPassphrase");
            return this;
        }
        /** Base-64 encoded password for the cluster admin user. */
        @com.fasterxml.jackson.annotation.JsonProperty("clusterAdminPassword")
        private String clusterAdminPassword;

        /**
         * Base-64 encoded password for the cluster admin user.
         *
         * @param clusterAdminPassword the value to set
         * @return this builder
         */
        public Builder clusterAdminPassword(String clusterAdminPassword) {
            this.clusterAdminPassword = clusterAdminPassword;
            this.__explicitlySet__.add("clusterAdminPassword");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ActivateBdsMetastoreConfigurationDetails build() {
            ActivateBdsMetastoreConfigurationDetails model =
                    new ActivateBdsMetastoreConfigurationDetails(
                            this.bdsApiKeyPassphrase, this.clusterAdminPassword);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ActivateBdsMetastoreConfigurationDetails model) {
            if (model.wasPropertyExplicitlySet("bdsApiKeyPassphrase")) {
                this.bdsApiKeyPassphrase(model.getBdsApiKeyPassphrase());
            }
            if (model.wasPropertyExplicitlySet("clusterAdminPassword")) {
                this.clusterAdminPassword(model.getClusterAdminPassword());
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

    /** Base-64 encoded passphrase of the BDS Api Key. Set only if metastore's type is EXTERNAL. */
    @com.fasterxml.jackson.annotation.JsonProperty("bdsApiKeyPassphrase")
    private final String bdsApiKeyPassphrase;

    /**
     * Base-64 encoded passphrase of the BDS Api Key. Set only if metastore's type is EXTERNAL.
     *
     * @return the value
     */
    public String getBdsApiKeyPassphrase() {
        return bdsApiKeyPassphrase;
    }

    /** Base-64 encoded password for the cluster admin user. */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterAdminPassword")
    private final String clusterAdminPassword;

    /**
     * Base-64 encoded password for the cluster admin user.
     *
     * @return the value
     */
    public String getClusterAdminPassword() {
        return clusterAdminPassword;
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
        sb.append("ActivateBdsMetastoreConfigurationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("bdsApiKeyPassphrase=").append("<redacted>");
        sb.append(", clusterAdminPassword=").append("<redacted>");
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ActivateBdsMetastoreConfigurationDetails)) {
            return false;
        }

        ActivateBdsMetastoreConfigurationDetails other =
                (ActivateBdsMetastoreConfigurationDetails) o;
        return java.util.Objects.equals(this.bdsApiKeyPassphrase, other.bdsApiKeyPassphrase)
                && java.util.Objects.equals(this.clusterAdminPassword, other.clusterAdminPassword)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.bdsApiKeyPassphrase == null
                                ? 43
                                : this.bdsApiKeyPassphrase.hashCode());
        result =
                (result * PRIME)
                        + (this.clusterAdminPassword == null
                                ? 43
                                : this.clusterAdminPassword.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
