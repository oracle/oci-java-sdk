/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * Details for activating UPST config on the cluster <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ActivateUpstConfigurationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ActivateUpstConfigurationDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"clusterAdminPassword", "vaultId", "masterEncryptionKeyId"})
    public ActivateUpstConfigurationDetails(
            String clusterAdminPassword, String vaultId, String masterEncryptionKeyId) {
        super();
        this.clusterAdminPassword = clusterAdminPassword;
        this.vaultId = vaultId;
        this.masterEncryptionKeyId = masterEncryptionKeyId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
        /**
         * OCID of the vault to store token exchange service principal keyta, required for creating
         * UPST configb
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
        private String vaultId;

        /**
         * OCID of the vault to store token exchange service principal keyta, required for creating
         * UPST configb
         *
         * @param vaultId the value to set
         * @return this builder
         */
        public Builder vaultId(String vaultId) {
            this.vaultId = vaultId;
            this.__explicitlySet__.add("vaultId");
            return this;
        }
        /**
         * OCID of the master encryption key in vault for encrypting token exchange service
         * principal keytab, required for creating UPST config
         */
        @com.fasterxml.jackson.annotation.JsonProperty("masterEncryptionKeyId")
        private String masterEncryptionKeyId;

        /**
         * OCID of the master encryption key in vault for encrypting token exchange service
         * principal keytab, required for creating UPST config
         *
         * @param masterEncryptionKeyId the value to set
         * @return this builder
         */
        public Builder masterEncryptionKeyId(String masterEncryptionKeyId) {
            this.masterEncryptionKeyId = masterEncryptionKeyId;
            this.__explicitlySet__.add("masterEncryptionKeyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ActivateUpstConfigurationDetails build() {
            ActivateUpstConfigurationDetails model =
                    new ActivateUpstConfigurationDetails(
                            this.clusterAdminPassword, this.vaultId, this.masterEncryptionKeyId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ActivateUpstConfigurationDetails model) {
            if (model.wasPropertyExplicitlySet("clusterAdminPassword")) {
                this.clusterAdminPassword(model.getClusterAdminPassword());
            }
            if (model.wasPropertyExplicitlySet("vaultId")) {
                this.vaultId(model.getVaultId());
            }
            if (model.wasPropertyExplicitlySet("masterEncryptionKeyId")) {
                this.masterEncryptionKeyId(model.getMasterEncryptionKeyId());
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

    /**
     * OCID of the vault to store token exchange service principal keyta, required for creating UPST
     * configb
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
    private final String vaultId;

    /**
     * OCID of the vault to store token exchange service principal keyta, required for creating UPST
     * configb
     *
     * @return the value
     */
    public String getVaultId() {
        return vaultId;
    }

    /**
     * OCID of the master encryption key in vault for encrypting token exchange service principal
     * keytab, required for creating UPST config
     */
    @com.fasterxml.jackson.annotation.JsonProperty("masterEncryptionKeyId")
    private final String masterEncryptionKeyId;

    /**
     * OCID of the master encryption key in vault for encrypting token exchange service principal
     * keytab, required for creating UPST config
     *
     * @return the value
     */
    public String getMasterEncryptionKeyId() {
        return masterEncryptionKeyId;
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
        sb.append("ActivateUpstConfigurationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("clusterAdminPassword=").append("<redacted>");
        sb.append(", vaultId=").append(String.valueOf(this.vaultId));
        sb.append(", masterEncryptionKeyId=").append(String.valueOf(this.masterEncryptionKeyId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ActivateUpstConfigurationDetails)) {
            return false;
        }

        ActivateUpstConfigurationDetails other = (ActivateUpstConfigurationDetails) o;
        return java.util.Objects.equals(this.clusterAdminPassword, other.clusterAdminPassword)
                && java.util.Objects.equals(this.vaultId, other.vaultId)
                && java.util.Objects.equals(this.masterEncryptionKeyId, other.masterEncryptionKeyId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.clusterAdminPassword == null
                                ? 43
                                : this.clusterAdminPassword.hashCode());
        result = (result * PRIME) + (this.vaultId == null ? 43 : this.vaultId.hashCode());
        result =
                (result * PRIME)
                        + (this.masterEncryptionKeyId == null
                                ? 43
                                : this.masterEncryptionKeyId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
