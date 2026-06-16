/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.psql.model;

/**
 * Enable or Update Existing Kerberos Authentication for the database system. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220915")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = EnabledKerberosAuthDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "kind")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class EnabledKerberosAuthDetails extends KerberosAuthDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * List of Kerberos Credentials to be configured for the dbsystem. Currently supports only
         * one entry.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("credentials")
        private java.util.List<KerberosCredential> credentials;

        /**
         * List of Kerberos Credentials to be configured for the dbsystem. Currently supports only
         * one entry.
         *
         * @param credentials the value to set
         * @return this builder
         */
        public Builder credentials(java.util.List<KerberosCredential> credentials) {
            this.credentials = credentials;
            this.__explicitlySet__.add("credentials");
            return this;
        }
        /**
         * Optional. List of Kerberos Credentials previously configured for the dbsystem. Currently
         * supports only one entry.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("backupCredentials")
        private java.util.List<KerberosCredential> backupCredentials;

        /**
         * Optional. List of Kerberos Credentials previously configured for the dbsystem. Currently
         * supports only one entry.
         *
         * @param backupCredentials the value to set
         * @return this builder
         */
        public Builder backupCredentials(java.util.List<KerberosCredential> backupCredentials) {
            this.backupCredentials = backupCredentials;
            this.__explicitlySet__.add("backupCredentials");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EnabledKerberosAuthDetails build() {
            EnabledKerberosAuthDetails model =
                    new EnabledKerberosAuthDetails(this.credentials, this.backupCredentials);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EnabledKerberosAuthDetails model) {
            if (model.wasPropertyExplicitlySet("credentials")) {
                this.credentials(model.getCredentials());
            }
            if (model.wasPropertyExplicitlySet("backupCredentials")) {
                this.backupCredentials(model.getBackupCredentials());
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
    public EnabledKerberosAuthDetails(
            java.util.List<KerberosCredential> credentials,
            java.util.List<KerberosCredential> backupCredentials) {
        super();
        this.credentials = credentials;
        this.backupCredentials = backupCredentials;
    }

    /**
     * List of Kerberos Credentials to be configured for the dbsystem. Currently supports only one
     * entry.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("credentials")
    private final java.util.List<KerberosCredential> credentials;

    /**
     * List of Kerberos Credentials to be configured for the dbsystem. Currently supports only one
     * entry.
     *
     * @return the value
     */
    public java.util.List<KerberosCredential> getCredentials() {
        return credentials;
    }

    /**
     * Optional. List of Kerberos Credentials previously configured for the dbsystem. Currently
     * supports only one entry.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("backupCredentials")
    private final java.util.List<KerberosCredential> backupCredentials;

    /**
     * Optional. List of Kerberos Credentials previously configured for the dbsystem. Currently
     * supports only one entry.
     *
     * @return the value
     */
    public java.util.List<KerberosCredential> getBackupCredentials() {
        return backupCredentials;
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
        sb.append("EnabledKerberosAuthDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", credentials=").append(String.valueOf(this.credentials));
        sb.append(", backupCredentials=").append(String.valueOf(this.backupCredentials));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EnabledKerberosAuthDetails)) {
            return false;
        }

        EnabledKerberosAuthDetails other = (EnabledKerberosAuthDetails) o;
        return java.util.Objects.equals(this.credentials, other.credentials)
                && java.util.Objects.equals(this.backupCredentials, other.backupCredentials)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.credentials == null ? 43 : this.credentials.hashCode());
        result =
                (result * PRIME)
                        + (this.backupCredentials == null ? 43 : this.backupCredentials.hashCode());
        return result;
    }
}
