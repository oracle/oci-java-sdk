/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge.model;

/**
 * VMware virtual machine related properties. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220509")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = VmwareVmProperties.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class VmwareVmProperties
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "cluster",
        "customerFields",
        "customerTags",
        "instanceUuid",
        "path",
        "vmwareToolsStatus",
        "isDisksUuidEnabled",
        "isDisksCbtEnabled",
        "faultToleranceState",
        "faultToleranceBandwidth",
        "faultToleranceSecondaryLatency"
    })
    public VmwareVmProperties(
            String cluster,
            java.util.List<String> customerFields,
            java.util.List<CustomerTag> customerTags,
            String instanceUuid,
            String path,
            String vmwareToolsStatus,
            Boolean isDisksUuidEnabled,
            Boolean isDisksCbtEnabled,
            String faultToleranceState,
            Integer faultToleranceBandwidth,
            Integer faultToleranceSecondaryLatency) {
        super();
        this.cluster = cluster;
        this.customerFields = customerFields;
        this.customerTags = customerTags;
        this.instanceUuid = instanceUuid;
        this.path = path;
        this.vmwareToolsStatus = vmwareToolsStatus;
        this.isDisksUuidEnabled = isDisksUuidEnabled;
        this.isDisksCbtEnabled = isDisksCbtEnabled;
        this.faultToleranceState = faultToleranceState;
        this.faultToleranceBandwidth = faultToleranceBandwidth;
        this.faultToleranceSecondaryLatency = faultToleranceSecondaryLatency;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Cluster name. */
        @com.fasterxml.jackson.annotation.JsonProperty("cluster")
        private String cluster;

        /**
         * Cluster name.
         *
         * @param cluster the value to set
         * @return this builder
         */
        public Builder cluster(String cluster) {
            this.cluster = cluster;
            this.__explicitlySet__.add("cluster");
            return this;
        }
        /** Customer fields. */
        @com.fasterxml.jackson.annotation.JsonProperty("customerFields")
        private java.util.List<String> customerFields;

        /**
         * Customer fields.
         *
         * @param customerFields the value to set
         * @return this builder
         */
        public Builder customerFields(java.util.List<String> customerFields) {
            this.customerFields = customerFields;
            this.__explicitlySet__.add("customerFields");
            return this;
        }
        /** Customer defined tags. */
        @com.fasterxml.jackson.annotation.JsonProperty("customerTags")
        private java.util.List<CustomerTag> customerTags;

        /**
         * Customer defined tags.
         *
         * @param customerTags the value to set
         * @return this builder
         */
        public Builder customerTags(java.util.List<CustomerTag> customerTags) {
            this.customerTags = customerTags;
            this.__explicitlySet__.add("customerTags");
            return this;
        }
        /** vCenter-specific identifier of the virtual machine. */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceUuid")
        private String instanceUuid;

        /**
         * vCenter-specific identifier of the virtual machine.
         *
         * @param instanceUuid the value to set
         * @return this builder
         */
        public Builder instanceUuid(String instanceUuid) {
            this.instanceUuid = instanceUuid;
            this.__explicitlySet__.add("instanceUuid");
            return this;
        }
        /** Path directory of the asset. */
        @com.fasterxml.jackson.annotation.JsonProperty("path")
        private String path;

        /**
         * Path directory of the asset.
         *
         * @param path the value to set
         * @return this builder
         */
        public Builder path(String path) {
            this.path = path;
            this.__explicitlySet__.add("path");
            return this;
        }
        /** VMware tools status. */
        @com.fasterxml.jackson.annotation.JsonProperty("vmwareToolsStatus")
        private String vmwareToolsStatus;

        /**
         * VMware tools status.
         *
         * @param vmwareToolsStatus the value to set
         * @return this builder
         */
        public Builder vmwareToolsStatus(String vmwareToolsStatus) {
            this.vmwareToolsStatus = vmwareToolsStatus;
            this.__explicitlySet__.add("vmwareToolsStatus");
            return this;
        }
        /** Whether changed block tracking for this VM's disk is active. */
        @com.fasterxml.jackson.annotation.JsonProperty("isDisksUuidEnabled")
        private Boolean isDisksUuidEnabled;

        /**
         * Whether changed block tracking for this VM's disk is active.
         *
         * @param isDisksUuidEnabled the value to set
         * @return this builder
         */
        public Builder isDisksUuidEnabled(Boolean isDisksUuidEnabled) {
            this.isDisksUuidEnabled = isDisksUuidEnabled;
            this.__explicitlySet__.add("isDisksUuidEnabled");
            return this;
        }
        /**
         * Indicates that change tracking is supported for virtual disks of this virtual machine.
         * However, even if change tracking is supported, it might not be available for all disks of
         * the virtual machine.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isDisksCbtEnabled")
        private Boolean isDisksCbtEnabled;

        /**
         * Indicates that change tracking is supported for virtual disks of this virtual machine.
         * However, even if change tracking is supported, it might not be available for all disks of
         * the virtual machine.
         *
         * @param isDisksCbtEnabled the value to set
         * @return this builder
         */
        public Builder isDisksCbtEnabled(Boolean isDisksCbtEnabled) {
            this.isDisksCbtEnabled = isDisksCbtEnabled;
            this.__explicitlySet__.add("isDisksCbtEnabled");
            return this;
        }
        /** Fault tolerance state. */
        @com.fasterxml.jackson.annotation.JsonProperty("faultToleranceState")
        private String faultToleranceState;

        /**
         * Fault tolerance state.
         *
         * @param faultToleranceState the value to set
         * @return this builder
         */
        public Builder faultToleranceState(String faultToleranceState) {
            this.faultToleranceState = faultToleranceState;
            this.__explicitlySet__.add("faultToleranceState");
            return this;
        }
        /** Fault tolerance bandwidth. */
        @com.fasterxml.jackson.annotation.JsonProperty("faultToleranceBandwidth")
        private Integer faultToleranceBandwidth;

        /**
         * Fault tolerance bandwidth.
         *
         * @param faultToleranceBandwidth the value to set
         * @return this builder
         */
        public Builder faultToleranceBandwidth(Integer faultToleranceBandwidth) {
            this.faultToleranceBandwidth = faultToleranceBandwidth;
            this.__explicitlySet__.add("faultToleranceBandwidth");
            return this;
        }
        /** Fault tolerance to secondary latency. */
        @com.fasterxml.jackson.annotation.JsonProperty("faultToleranceSecondaryLatency")
        private Integer faultToleranceSecondaryLatency;

        /**
         * Fault tolerance to secondary latency.
         *
         * @param faultToleranceSecondaryLatency the value to set
         * @return this builder
         */
        public Builder faultToleranceSecondaryLatency(Integer faultToleranceSecondaryLatency) {
            this.faultToleranceSecondaryLatency = faultToleranceSecondaryLatency;
            this.__explicitlySet__.add("faultToleranceSecondaryLatency");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VmwareVmProperties build() {
            VmwareVmProperties model =
                    new VmwareVmProperties(
                            this.cluster,
                            this.customerFields,
                            this.customerTags,
                            this.instanceUuid,
                            this.path,
                            this.vmwareToolsStatus,
                            this.isDisksUuidEnabled,
                            this.isDisksCbtEnabled,
                            this.faultToleranceState,
                            this.faultToleranceBandwidth,
                            this.faultToleranceSecondaryLatency);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VmwareVmProperties model) {
            if (model.wasPropertyExplicitlySet("cluster")) {
                this.cluster(model.getCluster());
            }
            if (model.wasPropertyExplicitlySet("customerFields")) {
                this.customerFields(model.getCustomerFields());
            }
            if (model.wasPropertyExplicitlySet("customerTags")) {
                this.customerTags(model.getCustomerTags());
            }
            if (model.wasPropertyExplicitlySet("instanceUuid")) {
                this.instanceUuid(model.getInstanceUuid());
            }
            if (model.wasPropertyExplicitlySet("path")) {
                this.path(model.getPath());
            }
            if (model.wasPropertyExplicitlySet("vmwareToolsStatus")) {
                this.vmwareToolsStatus(model.getVmwareToolsStatus());
            }
            if (model.wasPropertyExplicitlySet("isDisksUuidEnabled")) {
                this.isDisksUuidEnabled(model.getIsDisksUuidEnabled());
            }
            if (model.wasPropertyExplicitlySet("isDisksCbtEnabled")) {
                this.isDisksCbtEnabled(model.getIsDisksCbtEnabled());
            }
            if (model.wasPropertyExplicitlySet("faultToleranceState")) {
                this.faultToleranceState(model.getFaultToleranceState());
            }
            if (model.wasPropertyExplicitlySet("faultToleranceBandwidth")) {
                this.faultToleranceBandwidth(model.getFaultToleranceBandwidth());
            }
            if (model.wasPropertyExplicitlySet("faultToleranceSecondaryLatency")) {
                this.faultToleranceSecondaryLatency(model.getFaultToleranceSecondaryLatency());
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

    /** Cluster name. */
    @com.fasterxml.jackson.annotation.JsonProperty("cluster")
    private final String cluster;

    /**
     * Cluster name.
     *
     * @return the value
     */
    public String getCluster() {
        return cluster;
    }

    /** Customer fields. */
    @com.fasterxml.jackson.annotation.JsonProperty("customerFields")
    private final java.util.List<String> customerFields;

    /**
     * Customer fields.
     *
     * @return the value
     */
    public java.util.List<String> getCustomerFields() {
        return customerFields;
    }

    /** Customer defined tags. */
    @com.fasterxml.jackson.annotation.JsonProperty("customerTags")
    private final java.util.List<CustomerTag> customerTags;

    /**
     * Customer defined tags.
     *
     * @return the value
     */
    public java.util.List<CustomerTag> getCustomerTags() {
        return customerTags;
    }

    /** vCenter-specific identifier of the virtual machine. */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceUuid")
    private final String instanceUuid;

    /**
     * vCenter-specific identifier of the virtual machine.
     *
     * @return the value
     */
    public String getInstanceUuid() {
        return instanceUuid;
    }

    /** Path directory of the asset. */
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

    /**
     * Path directory of the asset.
     *
     * @return the value
     */
    public String getPath() {
        return path;
    }

    /** VMware tools status. */
    @com.fasterxml.jackson.annotation.JsonProperty("vmwareToolsStatus")
    private final String vmwareToolsStatus;

    /**
     * VMware tools status.
     *
     * @return the value
     */
    public String getVmwareToolsStatus() {
        return vmwareToolsStatus;
    }

    /** Whether changed block tracking for this VM's disk is active. */
    @com.fasterxml.jackson.annotation.JsonProperty("isDisksUuidEnabled")
    private final Boolean isDisksUuidEnabled;

    /**
     * Whether changed block tracking for this VM's disk is active.
     *
     * @return the value
     */
    public Boolean getIsDisksUuidEnabled() {
        return isDisksUuidEnabled;
    }

    /**
     * Indicates that change tracking is supported for virtual disks of this virtual machine.
     * However, even if change tracking is supported, it might not be available for all disks of the
     * virtual machine.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isDisksCbtEnabled")
    private final Boolean isDisksCbtEnabled;

    /**
     * Indicates that change tracking is supported for virtual disks of this virtual machine.
     * However, even if change tracking is supported, it might not be available for all disks of the
     * virtual machine.
     *
     * @return the value
     */
    public Boolean getIsDisksCbtEnabled() {
        return isDisksCbtEnabled;
    }

    /** Fault tolerance state. */
    @com.fasterxml.jackson.annotation.JsonProperty("faultToleranceState")
    private final String faultToleranceState;

    /**
     * Fault tolerance state.
     *
     * @return the value
     */
    public String getFaultToleranceState() {
        return faultToleranceState;
    }

    /** Fault tolerance bandwidth. */
    @com.fasterxml.jackson.annotation.JsonProperty("faultToleranceBandwidth")
    private final Integer faultToleranceBandwidth;

    /**
     * Fault tolerance bandwidth.
     *
     * @return the value
     */
    public Integer getFaultToleranceBandwidth() {
        return faultToleranceBandwidth;
    }

    /** Fault tolerance to secondary latency. */
    @com.fasterxml.jackson.annotation.JsonProperty("faultToleranceSecondaryLatency")
    private final Integer faultToleranceSecondaryLatency;

    /**
     * Fault tolerance to secondary latency.
     *
     * @return the value
     */
    public Integer getFaultToleranceSecondaryLatency() {
        return faultToleranceSecondaryLatency;
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
        sb.append("VmwareVmProperties(");
        sb.append("super=").append(super.toString());
        sb.append("cluster=").append(String.valueOf(this.cluster));
        sb.append(", customerFields=").append(String.valueOf(this.customerFields));
        sb.append(", customerTags=").append(String.valueOf(this.customerTags));
        sb.append(", instanceUuid=").append(String.valueOf(this.instanceUuid));
        sb.append(", path=").append(String.valueOf(this.path));
        sb.append(", vmwareToolsStatus=").append(String.valueOf(this.vmwareToolsStatus));
        sb.append(", isDisksUuidEnabled=").append(String.valueOf(this.isDisksUuidEnabled));
        sb.append(", isDisksCbtEnabled=").append(String.valueOf(this.isDisksCbtEnabled));
        sb.append(", faultToleranceState=").append(String.valueOf(this.faultToleranceState));
        sb.append(", faultToleranceBandwidth=")
                .append(String.valueOf(this.faultToleranceBandwidth));
        sb.append(", faultToleranceSecondaryLatency=")
                .append(String.valueOf(this.faultToleranceSecondaryLatency));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VmwareVmProperties)) {
            return false;
        }

        VmwareVmProperties other = (VmwareVmProperties) o;
        return java.util.Objects.equals(this.cluster, other.cluster)
                && java.util.Objects.equals(this.customerFields, other.customerFields)
                && java.util.Objects.equals(this.customerTags, other.customerTags)
                && java.util.Objects.equals(this.instanceUuid, other.instanceUuid)
                && java.util.Objects.equals(this.path, other.path)
                && java.util.Objects.equals(this.vmwareToolsStatus, other.vmwareToolsStatus)
                && java.util.Objects.equals(this.isDisksUuidEnabled, other.isDisksUuidEnabled)
                && java.util.Objects.equals(this.isDisksCbtEnabled, other.isDisksCbtEnabled)
                && java.util.Objects.equals(this.faultToleranceState, other.faultToleranceState)
                && java.util.Objects.equals(
                        this.faultToleranceBandwidth, other.faultToleranceBandwidth)
                && java.util.Objects.equals(
                        this.faultToleranceSecondaryLatency, other.faultToleranceSecondaryLatency)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.cluster == null ? 43 : this.cluster.hashCode());
        result =
                (result * PRIME)
                        + (this.customerFields == null ? 43 : this.customerFields.hashCode());
        result = (result * PRIME) + (this.customerTags == null ? 43 : this.customerTags.hashCode());
        result = (result * PRIME) + (this.instanceUuid == null ? 43 : this.instanceUuid.hashCode());
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result =
                (result * PRIME)
                        + (this.vmwareToolsStatus == null ? 43 : this.vmwareToolsStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.isDisksUuidEnabled == null
                                ? 43
                                : this.isDisksUuidEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isDisksCbtEnabled == null ? 43 : this.isDisksCbtEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.faultToleranceState == null
                                ? 43
                                : this.faultToleranceState.hashCode());
        result =
                (result * PRIME)
                        + (this.faultToleranceBandwidth == null
                                ? 43
                                : this.faultToleranceBandwidth.hashCode());
        result =
                (result * PRIME)
                        + (this.faultToleranceSecondaryLatency == null
                                ? 43
                                : this.faultToleranceSecondaryLatency.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
