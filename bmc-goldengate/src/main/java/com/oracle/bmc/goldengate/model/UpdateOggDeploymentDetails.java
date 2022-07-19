/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * Deployment Details for updating an OggDeployment
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateOggDeploymentDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateOggDeploymentDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"adminUsername", "adminPassword", "certificate", "key"})
    public UpdateOggDeploymentDetails(
            String adminUsername, String adminPassword, String certificate, String key) {
        super();
        this.adminUsername = adminUsername;
        this.adminPassword = adminPassword;
        this.certificate = certificate;
        this.key = key;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The GoldenGate deployment console username.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("adminUsername")
        private String adminUsername;

        /**
         * The GoldenGate deployment console username.
         *
         * @param adminUsername the value to set
         * @return this builder
         **/
        public Builder adminUsername(String adminUsername) {
            this.adminUsername = adminUsername;
            this.__explicitlySet__.add("adminUsername");
            return this;
        }
        /**
         * The password associated with the GoldenGate deployment console username. The password must be 8 to 30 characters long and must contain at least 1 uppercase, 1 lowercase, 1 numeric, and 1 special character. Special characters such as \u2018$\u2019, \u2018^\u2019, or \u2018?\u2019 are not allowed.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("adminPassword")
        private String adminPassword;

        /**
         * The password associated with the GoldenGate deployment console username. The password must be 8 to 30 characters long and must contain at least 1 uppercase, 1 lowercase, 1 numeric, and 1 special character. Special characters such as \u2018$\u2019, \u2018^\u2019, or \u2018?\u2019 are not allowed.
         *
         * @param adminPassword the value to set
         * @return this builder
         **/
        public Builder adminPassword(String adminPassword) {
            this.adminPassword = adminPassword;
            this.__explicitlySet__.add("adminPassword");
            return this;
        }
        /**
         * A PEM-encoded SSL certificate.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("certificate")
        private String certificate;

        /**
         * A PEM-encoded SSL certificate.
         *
         * @param certificate the value to set
         * @return this builder
         **/
        public Builder certificate(String certificate) {
            this.certificate = certificate;
            this.__explicitlySet__.add("certificate");
            return this;
        }
        /**
         * A PEM-encoded private key.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * A PEM-encoded private key.
         *
         * @param key the value to set
         * @return this builder
         **/
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateOggDeploymentDetails build() {
            UpdateOggDeploymentDetails __instance__ =
                    new UpdateOggDeploymentDetails(adminUsername, adminPassword, certificate, key);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateOggDeploymentDetails o) {
            Builder copiedBuilder =
                    adminUsername(o.getAdminUsername())
                            .adminPassword(o.getAdminPassword())
                            .certificate(o.getCertificate())
                            .key(o.getKey());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * The GoldenGate deployment console username.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("adminUsername")
    private final String adminUsername;

    /**
     * The GoldenGate deployment console username.
     *
     * @return the value
     **/
    public String getAdminUsername() {
        return adminUsername;
    }

    /**
     * The password associated with the GoldenGate deployment console username. The password must be 8 to 30 characters long and must contain at least 1 uppercase, 1 lowercase, 1 numeric, and 1 special character. Special characters such as \u2018$\u2019, \u2018^\u2019, or \u2018?\u2019 are not allowed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("adminPassword")
    private final String adminPassword;

    /**
     * The password associated with the GoldenGate deployment console username. The password must be 8 to 30 characters long and must contain at least 1 uppercase, 1 lowercase, 1 numeric, and 1 special character. Special characters such as \u2018$\u2019, \u2018^\u2019, or \u2018?\u2019 are not allowed.
     *
     * @return the value
     **/
    public String getAdminPassword() {
        return adminPassword;
    }

    /**
     * A PEM-encoded SSL certificate.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("certificate")
    private final String certificate;

    /**
     * A PEM-encoded SSL certificate.
     *
     * @return the value
     **/
    public String getCertificate() {
        return certificate;
    }

    /**
     * A PEM-encoded private key.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * A PEM-encoded private key.
     *
     * @return the value
     **/
    public String getKey() {
        return key;
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
        sb.append("UpdateOggDeploymentDetails(");
        sb.append("adminUsername=").append(String.valueOf(this.adminUsername));
        sb.append(", adminPassword=").append(String.valueOf(this.adminPassword));
        sb.append(", certificate=").append(String.valueOf(this.certificate));
        sb.append(", key=").append(String.valueOf(this.key));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateOggDeploymentDetails)) {
            return false;
        }

        UpdateOggDeploymentDetails other = (UpdateOggDeploymentDetails) o;
        return java.util.Objects.equals(this.adminUsername, other.adminUsername)
                && java.util.Objects.equals(this.adminPassword, other.adminPassword)
                && java.util.Objects.equals(this.certificate, other.certificate)
                && java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.adminUsername == null ? 43 : this.adminUsername.hashCode());
        result =
                (result * PRIME)
                        + (this.adminPassword == null ? 43 : this.adminPassword.hashCode());
        result = (result * PRIME) + (this.certificate == null ? 43 : this.certificate.hashCode());
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
