/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.model;

/**
 * The properties that define extra options updating a cluster.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateClusterOptionsDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateClusterOptionsDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "admissionControllerOptions",
        "persistentVolumeConfig",
        "serviceLbConfig",
        "openIdConnectTokenAuthenticationConfig",
        "openIdConnectDiscovery"
    })
    public UpdateClusterOptionsDetails(
            AdmissionControllerOptions admissionControllerOptions,
            PersistentVolumeConfigDetails persistentVolumeConfig,
            ServiceLbConfigDetails serviceLbConfig,
            OpenIdConnectTokenAuthenticationConfig openIdConnectTokenAuthenticationConfig,
            OpenIdConnectDiscovery openIdConnectDiscovery) {
        super();
        this.admissionControllerOptions = admissionControllerOptions;
        this.persistentVolumeConfig = persistentVolumeConfig;
        this.serviceLbConfig = serviceLbConfig;
        this.openIdConnectTokenAuthenticationConfig = openIdConnectTokenAuthenticationConfig;
        this.openIdConnectDiscovery = openIdConnectDiscovery;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Configurable cluster admission controllers
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("admissionControllerOptions")
        private AdmissionControllerOptions admissionControllerOptions;

        /**
         * Configurable cluster admission controllers
         * @param admissionControllerOptions the value to set
         * @return this builder
         **/
        public Builder admissionControllerOptions(
                AdmissionControllerOptions admissionControllerOptions) {
            this.admissionControllerOptions = admissionControllerOptions;
            this.__explicitlySet__.add("admissionControllerOptions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("persistentVolumeConfig")
        private PersistentVolumeConfigDetails persistentVolumeConfig;

        public Builder persistentVolumeConfig(
                PersistentVolumeConfigDetails persistentVolumeConfig) {
            this.persistentVolumeConfig = persistentVolumeConfig;
            this.__explicitlySet__.add("persistentVolumeConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("serviceLbConfig")
        private ServiceLbConfigDetails serviceLbConfig;

        public Builder serviceLbConfig(ServiceLbConfigDetails serviceLbConfig) {
            this.serviceLbConfig = serviceLbConfig;
            this.__explicitlySet__.add("serviceLbConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("openIdConnectTokenAuthenticationConfig")
        private OpenIdConnectTokenAuthenticationConfig openIdConnectTokenAuthenticationConfig;

        public Builder openIdConnectTokenAuthenticationConfig(
                OpenIdConnectTokenAuthenticationConfig openIdConnectTokenAuthenticationConfig) {
            this.openIdConnectTokenAuthenticationConfig = openIdConnectTokenAuthenticationConfig;
            this.__explicitlySet__.add("openIdConnectTokenAuthenticationConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("openIdConnectDiscovery")
        private OpenIdConnectDiscovery openIdConnectDiscovery;

        public Builder openIdConnectDiscovery(OpenIdConnectDiscovery openIdConnectDiscovery) {
            this.openIdConnectDiscovery = openIdConnectDiscovery;
            this.__explicitlySet__.add("openIdConnectDiscovery");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateClusterOptionsDetails build() {
            UpdateClusterOptionsDetails model =
                    new UpdateClusterOptionsDetails(
                            this.admissionControllerOptions,
                            this.persistentVolumeConfig,
                            this.serviceLbConfig,
                            this.openIdConnectTokenAuthenticationConfig,
                            this.openIdConnectDiscovery);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateClusterOptionsDetails model) {
            if (model.wasPropertyExplicitlySet("admissionControllerOptions")) {
                this.admissionControllerOptions(model.getAdmissionControllerOptions());
            }
            if (model.wasPropertyExplicitlySet("persistentVolumeConfig")) {
                this.persistentVolumeConfig(model.getPersistentVolumeConfig());
            }
            if (model.wasPropertyExplicitlySet("serviceLbConfig")) {
                this.serviceLbConfig(model.getServiceLbConfig());
            }
            if (model.wasPropertyExplicitlySet("openIdConnectTokenAuthenticationConfig")) {
                this.openIdConnectTokenAuthenticationConfig(
                        model.getOpenIdConnectTokenAuthenticationConfig());
            }
            if (model.wasPropertyExplicitlySet("openIdConnectDiscovery")) {
                this.openIdConnectDiscovery(model.getOpenIdConnectDiscovery());
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
     * Configurable cluster admission controllers
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("admissionControllerOptions")
    private final AdmissionControllerOptions admissionControllerOptions;

    /**
     * Configurable cluster admission controllers
     * @return the value
     **/
    public AdmissionControllerOptions getAdmissionControllerOptions() {
        return admissionControllerOptions;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("persistentVolumeConfig")
    private final PersistentVolumeConfigDetails persistentVolumeConfig;

    public PersistentVolumeConfigDetails getPersistentVolumeConfig() {
        return persistentVolumeConfig;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("serviceLbConfig")
    private final ServiceLbConfigDetails serviceLbConfig;

    public ServiceLbConfigDetails getServiceLbConfig() {
        return serviceLbConfig;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("openIdConnectTokenAuthenticationConfig")
    private final OpenIdConnectTokenAuthenticationConfig openIdConnectTokenAuthenticationConfig;

    public OpenIdConnectTokenAuthenticationConfig getOpenIdConnectTokenAuthenticationConfig() {
        return openIdConnectTokenAuthenticationConfig;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("openIdConnectDiscovery")
    private final OpenIdConnectDiscovery openIdConnectDiscovery;

    public OpenIdConnectDiscovery getOpenIdConnectDiscovery() {
        return openIdConnectDiscovery;
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
        sb.append("UpdateClusterOptionsDetails(");
        sb.append("super=").append(super.toString());
        sb.append("admissionControllerOptions=")
                .append(String.valueOf(this.admissionControllerOptions));
        sb.append(", persistentVolumeConfig=").append(String.valueOf(this.persistentVolumeConfig));
        sb.append(", serviceLbConfig=").append(String.valueOf(this.serviceLbConfig));
        sb.append(", openIdConnectTokenAuthenticationConfig=")
                .append(String.valueOf(this.openIdConnectTokenAuthenticationConfig));
        sb.append(", openIdConnectDiscovery=").append(String.valueOf(this.openIdConnectDiscovery));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateClusterOptionsDetails)) {
            return false;
        }

        UpdateClusterOptionsDetails other = (UpdateClusterOptionsDetails) o;
        return java.util.Objects.equals(
                        this.admissionControllerOptions, other.admissionControllerOptions)
                && java.util.Objects.equals(
                        this.persistentVolumeConfig, other.persistentVolumeConfig)
                && java.util.Objects.equals(this.serviceLbConfig, other.serviceLbConfig)
                && java.util.Objects.equals(
                        this.openIdConnectTokenAuthenticationConfig,
                        other.openIdConnectTokenAuthenticationConfig)
                && java.util.Objects.equals(
                        this.openIdConnectDiscovery, other.openIdConnectDiscovery)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.admissionControllerOptions == null
                                ? 43
                                : this.admissionControllerOptions.hashCode());
        result =
                (result * PRIME)
                        + (this.persistentVolumeConfig == null
                                ? 43
                                : this.persistentVolumeConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.serviceLbConfig == null ? 43 : this.serviceLbConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.openIdConnectTokenAuthenticationConfig == null
                                ? 43
                                : this.openIdConnectTokenAuthenticationConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.openIdConnectDiscovery == null
                                ? 43
                                : this.openIdConnectDiscovery.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
