/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.model;

/**
 * The properties that define extra options for a cluster. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ClusterCreateOptions.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ClusterCreateOptions
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "serviceLbSubnetIds",
        "ipFamilies",
        "kubernetesNetworkConfig",
        "addOns",
        "admissionControllerOptions",
        "persistentVolumeConfig",
        "serviceLbConfig",
        "openIdConnectTokenAuthenticationConfig",
        "openIdConnectDiscovery"
    })
    public ClusterCreateOptions(
            java.util.List<String> serviceLbSubnetIds,
            java.util.List<IpFamilies> ipFamilies,
            KubernetesNetworkConfig kubernetesNetworkConfig,
            AddOnOptions addOns,
            AdmissionControllerOptions admissionControllerOptions,
            PersistentVolumeConfigDetails persistentVolumeConfig,
            ServiceLbConfigDetails serviceLbConfig,
            OpenIdConnectTokenAuthenticationConfig openIdConnectTokenAuthenticationConfig,
            OpenIdConnectDiscovery openIdConnectDiscovery) {
        super();
        this.serviceLbSubnetIds = serviceLbSubnetIds;
        this.ipFamilies = ipFamilies;
        this.kubernetesNetworkConfig = kubernetesNetworkConfig;
        this.addOns = addOns;
        this.admissionControllerOptions = admissionControllerOptions;
        this.persistentVolumeConfig = persistentVolumeConfig;
        this.serviceLbConfig = serviceLbConfig;
        this.openIdConnectTokenAuthenticationConfig = openIdConnectTokenAuthenticationConfig;
        this.openIdConnectDiscovery = openIdConnectDiscovery;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCIDs of the subnets used for Kubernetes services load balancers. */
        @com.fasterxml.jackson.annotation.JsonProperty("serviceLbSubnetIds")
        private java.util.List<String> serviceLbSubnetIds;

        /**
         * The OCIDs of the subnets used for Kubernetes services load balancers.
         *
         * @param serviceLbSubnetIds the value to set
         * @return this builder
         */
        public Builder serviceLbSubnetIds(java.util.List<String> serviceLbSubnetIds) {
            this.serviceLbSubnetIds = serviceLbSubnetIds;
            this.__explicitlySet__.add("serviceLbSubnetIds");
            return this;
        }
        /** IP family to use for single stack or define the order of IP families for dual-stack */
        @com.fasterxml.jackson.annotation.JsonProperty("ipFamilies")
        private java.util.List<IpFamilies> ipFamilies;

        /**
         * IP family to use for single stack or define the order of IP families for dual-stack
         *
         * @param ipFamilies the value to set
         * @return this builder
         */
        public Builder ipFamilies(java.util.List<IpFamilies> ipFamilies) {
            this.ipFamilies = ipFamilies;
            this.__explicitlySet__.add("ipFamilies");
            return this;
        }
        /** Network configuration for Kubernetes. */
        @com.fasterxml.jackson.annotation.JsonProperty("kubernetesNetworkConfig")
        private KubernetesNetworkConfig kubernetesNetworkConfig;

        /**
         * Network configuration for Kubernetes.
         *
         * @param kubernetesNetworkConfig the value to set
         * @return this builder
         */
        public Builder kubernetesNetworkConfig(KubernetesNetworkConfig kubernetesNetworkConfig) {
            this.kubernetesNetworkConfig = kubernetesNetworkConfig;
            this.__explicitlySet__.add("kubernetesNetworkConfig");
            return this;
        }
        /** Configurable cluster add-ons */
        @com.fasterxml.jackson.annotation.JsonProperty("addOns")
        private AddOnOptions addOns;

        /**
         * Configurable cluster add-ons
         *
         * @param addOns the value to set
         * @return this builder
         */
        public Builder addOns(AddOnOptions addOns) {
            this.addOns = addOns;
            this.__explicitlySet__.add("addOns");
            return this;
        }
        /** Configurable cluster admission controllers */
        @com.fasterxml.jackson.annotation.JsonProperty("admissionControllerOptions")
        private AdmissionControllerOptions admissionControllerOptions;

        /**
         * Configurable cluster admission controllers
         *
         * @param admissionControllerOptions the value to set
         * @return this builder
         */
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

        public ClusterCreateOptions build() {
            ClusterCreateOptions model =
                    new ClusterCreateOptions(
                            this.serviceLbSubnetIds,
                            this.ipFamilies,
                            this.kubernetesNetworkConfig,
                            this.addOns,
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
        public Builder copy(ClusterCreateOptions model) {
            if (model.wasPropertyExplicitlySet("serviceLbSubnetIds")) {
                this.serviceLbSubnetIds(model.getServiceLbSubnetIds());
            }
            if (model.wasPropertyExplicitlySet("ipFamilies")) {
                this.ipFamilies(model.getIpFamilies());
            }
            if (model.wasPropertyExplicitlySet("kubernetesNetworkConfig")) {
                this.kubernetesNetworkConfig(model.getKubernetesNetworkConfig());
            }
            if (model.wasPropertyExplicitlySet("addOns")) {
                this.addOns(model.getAddOns());
            }
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

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** The OCIDs of the subnets used for Kubernetes services load balancers. */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceLbSubnetIds")
    private final java.util.List<String> serviceLbSubnetIds;

    /**
     * The OCIDs of the subnets used for Kubernetes services load balancers.
     *
     * @return the value
     */
    public java.util.List<String> getServiceLbSubnetIds() {
        return serviceLbSubnetIds;
    }

    /** */
    public enum IpFamilies implements com.oracle.bmc.http.internal.BmcEnum {
        IPv4("IPv4"),
        IPv6("IPv6"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(IpFamilies.class);

        private final String value;
        private static java.util.Map<String, IpFamilies> map;

        static {
            map = new java.util.HashMap<>();
            for (IpFamilies v : IpFamilies.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        IpFamilies(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static IpFamilies create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'IpFamilies', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** IP family to use for single stack or define the order of IP families for dual-stack */
    @com.fasterxml.jackson.annotation.JsonProperty("ipFamilies")
    private final java.util.List<IpFamilies> ipFamilies;

    /**
     * IP family to use for single stack or define the order of IP families for dual-stack
     *
     * @return the value
     */
    public java.util.List<IpFamilies> getIpFamilies() {
        return ipFamilies;
    }

    /** Network configuration for Kubernetes. */
    @com.fasterxml.jackson.annotation.JsonProperty("kubernetesNetworkConfig")
    private final KubernetesNetworkConfig kubernetesNetworkConfig;

    /**
     * Network configuration for Kubernetes.
     *
     * @return the value
     */
    public KubernetesNetworkConfig getKubernetesNetworkConfig() {
        return kubernetesNetworkConfig;
    }

    /** Configurable cluster add-ons */
    @com.fasterxml.jackson.annotation.JsonProperty("addOns")
    private final AddOnOptions addOns;

    /**
     * Configurable cluster add-ons
     *
     * @return the value
     */
    public AddOnOptions getAddOns() {
        return addOns;
    }

    /** Configurable cluster admission controllers */
    @com.fasterxml.jackson.annotation.JsonProperty("admissionControllerOptions")
    private final AdmissionControllerOptions admissionControllerOptions;

    /**
     * Configurable cluster admission controllers
     *
     * @return the value
     */
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
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ClusterCreateOptions(");
        sb.append("super=").append(super.toString());
        sb.append("serviceLbSubnetIds=").append(String.valueOf(this.serviceLbSubnetIds));
        sb.append(", ipFamilies=").append(String.valueOf(this.ipFamilies));
        sb.append(", kubernetesNetworkConfig=")
                .append(String.valueOf(this.kubernetesNetworkConfig));
        sb.append(", addOns=").append(String.valueOf(this.addOns));
        sb.append(", admissionControllerOptions=")
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
        if (!(o instanceof ClusterCreateOptions)) {
            return false;
        }

        ClusterCreateOptions other = (ClusterCreateOptions) o;
        return java.util.Objects.equals(this.serviceLbSubnetIds, other.serviceLbSubnetIds)
                && java.util.Objects.equals(this.ipFamilies, other.ipFamilies)
                && java.util.Objects.equals(
                        this.kubernetesNetworkConfig, other.kubernetesNetworkConfig)
                && java.util.Objects.equals(this.addOns, other.addOns)
                && java.util.Objects.equals(
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
                        + (this.serviceLbSubnetIds == null
                                ? 43
                                : this.serviceLbSubnetIds.hashCode());
        result = (result * PRIME) + (this.ipFamilies == null ? 43 : this.ipFamilies.hashCode());
        result =
                (result * PRIME)
                        + (this.kubernetesNetworkConfig == null
                                ? 43
                                : this.kubernetesNetworkConfig.hashCode());
        result = (result * PRIME) + (this.addOns == null ? 43 : this.addOns.hashCode());
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
