/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.model;

/**
 * The properties that define extra options for a cluster. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ClusterCreateOptions.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ClusterCreateOptions
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "serviceLbSubnetIds",
        "kubernetesNetworkConfig",
        "addOns",
        "admissionControllerOptions",
        "persistentVolumeConfig",
        "serviceLbConfig"
    })
    public ClusterCreateOptions(
            java.util.List<String> serviceLbSubnetIds,
            KubernetesNetworkConfig kubernetesNetworkConfig,
            AddOnOptions addOns,
            AdmissionControllerOptions admissionControllerOptions,
            PersistentVolumeConfigDetails persistentVolumeConfig,
            ServiceLbConfigDetails serviceLbConfig) {
        super();
        this.serviceLbSubnetIds = serviceLbSubnetIds;
        this.kubernetesNetworkConfig = kubernetesNetworkConfig;
        this.addOns = addOns;
        this.admissionControllerOptions = admissionControllerOptions;
        this.persistentVolumeConfig = persistentVolumeConfig;
        this.serviceLbConfig = serviceLbConfig;
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ClusterCreateOptions build() {
            ClusterCreateOptions model =
                    new ClusterCreateOptions(
                            this.serviceLbSubnetIds,
                            this.kubernetesNetworkConfig,
                            this.addOns,
                            this.admissionControllerOptions,
                            this.persistentVolumeConfig,
                            this.serviceLbConfig);
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
        sb.append(", kubernetesNetworkConfig=")
                .append(String.valueOf(this.kubernetesNetworkConfig));
        sb.append(", addOns=").append(String.valueOf(this.addOns));
        sb.append(", admissionControllerOptions=")
                .append(String.valueOf(this.admissionControllerOptions));
        sb.append(", persistentVolumeConfig=").append(String.valueOf(this.persistentVolumeConfig));
        sb.append(", serviceLbConfig=").append(String.valueOf(this.serviceLbConfig));
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
                && java.util.Objects.equals(
                        this.kubernetesNetworkConfig, other.kubernetesNetworkConfig)
                && java.util.Objects.equals(this.addOns, other.addOns)
                && java.util.Objects.equals(
                        this.admissionControllerOptions, other.admissionControllerOptions)
                && java.util.Objects.equals(
                        this.persistentVolumeConfig, other.persistentVolumeConfig)
                && java.util.Objects.equals(this.serviceLbConfig, other.serviceLbConfig)
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
