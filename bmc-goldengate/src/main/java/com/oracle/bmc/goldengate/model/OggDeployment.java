/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * Deployment Data for an OggDeployment
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = OggDeployment.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OggDeployment {
    @Deprecated
    @java.beans.ConstructorProperties({
        "deploymentName",
        "adminUsername",
        "oggVersion",
        "certificate"
    })
    public OggDeployment(
            String deploymentName, String adminUsername, String oggVersion, String certificate) {
        super();
        this.deploymentName = deploymentName;
        this.adminUsername = adminUsername;
        this.oggVersion = oggVersion;
        this.certificate = certificate;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name given to the GoldenGate service deployment. The name must be 1 to 32 characters long, must contain only alphanumeric characters and must start with a letter.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("deploymentName")
        private String deploymentName;

        /**
         * The name given to the GoldenGate service deployment. The name must be 1 to 32 characters long, must contain only alphanumeric characters and must start with a letter.
         *
         * @param deploymentName the value to set
         * @return this builder
         **/
        public Builder deploymentName(String deploymentName) {
            this.deploymentName = deploymentName;
            this.__explicitlySet__.add("deploymentName");
            return this;
        }
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
         * Version of OGG
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("oggVersion")
        private String oggVersion;

        /**
         * Version of OGG
         *
         * @param oggVersion the value to set
         * @return this builder
         **/
        public Builder oggVersion(String oggVersion) {
            this.oggVersion = oggVersion;
            this.__explicitlySet__.add("oggVersion");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OggDeployment build() {
            OggDeployment __instance__ =
                    new OggDeployment(deploymentName, adminUsername, oggVersion, certificate);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OggDeployment o) {
            Builder copiedBuilder =
                    deploymentName(o.getDeploymentName())
                            .adminUsername(o.getAdminUsername())
                            .oggVersion(o.getOggVersion())
                            .certificate(o.getCertificate());

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
     * The name given to the GoldenGate service deployment. The name must be 1 to 32 characters long, must contain only alphanumeric characters and must start with a letter.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deploymentName")
    private final String deploymentName;

    /**
     * The name given to the GoldenGate service deployment. The name must be 1 to 32 characters long, must contain only alphanumeric characters and must start with a letter.
     *
     * @return the value
     **/
    public String getDeploymentName() {
        return deploymentName;
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
     * Version of OGG
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("oggVersion")
    private final String oggVersion;

    /**
     * Version of OGG
     *
     * @return the value
     **/
    public String getOggVersion() {
        return oggVersion;
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

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("OggDeployment(");
        sb.append("deploymentName=").append(String.valueOf(this.deploymentName));
        sb.append(", adminUsername=").append(String.valueOf(this.adminUsername));
        sb.append(", oggVersion=").append(String.valueOf(this.oggVersion));
        sb.append(", certificate=").append(String.valueOf(this.certificate));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OggDeployment)) {
            return false;
        }

        OggDeployment other = (OggDeployment) o;
        return java.util.Objects.equals(this.deploymentName, other.deploymentName)
                && java.util.Objects.equals(this.adminUsername, other.adminUsername)
                && java.util.Objects.equals(this.oggVersion, other.oggVersion)
                && java.util.Objects.equals(this.certificate, other.certificate)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.deploymentName == null ? 43 : this.deploymentName.hashCode());
        result =
                (result * PRIME)
                        + (this.adminUsername == null ? 43 : this.adminUsername.hashCode());
        result = (result * PRIME) + (this.oggVersion == null ? 43 : this.oggVersion.hashCode());
        result = (result * PRIME) + (this.certificate == null ? 43 : this.certificate.hashCode());
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
