/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * Deployment Data for creating an OggDeployment
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateOggDeploymentDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CreateOggDeploymentDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("deploymentName")
        private String deploymentName;

        public Builder deploymentName(String deploymentName) {
            this.deploymentName = deploymentName;
            this.__explicitlySet__.add("deploymentName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("adminUsername")
        private String adminUsername;

        public Builder adminUsername(String adminUsername) {
            this.adminUsername = adminUsername;
            this.__explicitlySet__.add("adminUsername");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("adminPassword")
        private String adminPassword;

        public Builder adminPassword(String adminPassword) {
            this.adminPassword = adminPassword;
            this.__explicitlySet__.add("adminPassword");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("certificate")
        private String certificate;

        public Builder certificate(String certificate) {
            this.certificate = certificate;
            this.__explicitlySet__.add("certificate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateOggDeploymentDetails build() {
            CreateOggDeploymentDetails __instance__ =
                    new CreateOggDeploymentDetails(
                            deploymentName, adminUsername, adminPassword, certificate, key);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateOggDeploymentDetails o) {
            Builder copiedBuilder =
                    deploymentName(o.getDeploymentName())
                            .adminUsername(o.getAdminUsername())
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

    /**
     * The name given to the GoldenGate service deployment. The name must be 1 to 32 characters long, must contain only alphanumeric characters and must start with a letter.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deploymentName")
    String deploymentName;

    /**
     * The GoldenGate deployment console username.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("adminUsername")
    String adminUsername;

    /**
     * The password associated with the GoldenGate deployment console username. The password must be 8 to 30 characters long and must contain at least 1 uppercase, 1 lowercase, 1 numeric, and 1 special character. Special characters such as \u2018$\u2019, \u2018^\u2019, or \u2018?\u2019 are not allowed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("adminPassword")
    String adminPassword;

    /**
     * A PEM-encoded SSL certificate.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("certificate")
    String certificate;

    /**
     * A PEM-encoded private key.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    String key;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
