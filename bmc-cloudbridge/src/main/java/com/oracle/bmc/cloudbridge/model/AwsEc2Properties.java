/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge.model;

/**
 * AWS virtual machine related properties.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220509")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AwsEc2Properties.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AwsEc2Properties extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "architecture",
        "bootMode",
        "capacityReservationKey",
        "areElasticInferenceAcceleratorsPresent",
        "isEnclaveOptions",
        "isHibernationOptions",
        "imageKey",
        "instanceKey",
        "instanceLifecycle",
        "instanceType",
        "ipAddress",
        "ipv6Address",
        "kernelKey",
        "timeLaunch",
        "licenses",
        "maintenanceOptions",
        "monitoring",
        "networkInterfaces",
        "placement",
        "privateDnsName",
        "privateIpAddress",
        "rootDeviceName",
        "rootDeviceType",
        "securityGroups",
        "isSourceDestCheck",
        "isSpotInstance",
        "sriovNetSupport",
        "state",
        "subnetKey",
        "tags",
        "tpmSupport",
        "virtualizationType",
        "vpcKey"
    })
    public AwsEc2Properties(
            String architecture,
            String bootMode,
            String capacityReservationKey,
            Boolean areElasticInferenceAcceleratorsPresent,
            Boolean isEnclaveOptions,
            Boolean isHibernationOptions,
            String imageKey,
            String instanceKey,
            String instanceLifecycle,
            String instanceType,
            String ipAddress,
            String ipv6Address,
            String kernelKey,
            java.util.Date timeLaunch,
            java.util.List<String> licenses,
            String maintenanceOptions,
            String monitoring,
            java.util.List<InstanceNetworkInterface> networkInterfaces,
            Placement placement,
            String privateDnsName,
            String privateIpAddress,
            String rootDeviceName,
            String rootDeviceType,
            java.util.List<GroupIdentifier> securityGroups,
            Boolean isSourceDestCheck,
            Boolean isSpotInstance,
            String sriovNetSupport,
            InstanceState state,
            String subnetKey,
            java.util.List<Tag> tags,
            String tpmSupport,
            String virtualizationType,
            String vpcKey) {
        super();
        this.architecture = architecture;
        this.bootMode = bootMode;
        this.capacityReservationKey = capacityReservationKey;
        this.areElasticInferenceAcceleratorsPresent = areElasticInferenceAcceleratorsPresent;
        this.isEnclaveOptions = isEnclaveOptions;
        this.isHibernationOptions = isHibernationOptions;
        this.imageKey = imageKey;
        this.instanceKey = instanceKey;
        this.instanceLifecycle = instanceLifecycle;
        this.instanceType = instanceType;
        this.ipAddress = ipAddress;
        this.ipv6Address = ipv6Address;
        this.kernelKey = kernelKey;
        this.timeLaunch = timeLaunch;
        this.licenses = licenses;
        this.maintenanceOptions = maintenanceOptions;
        this.monitoring = monitoring;
        this.networkInterfaces = networkInterfaces;
        this.placement = placement;
        this.privateDnsName = privateDnsName;
        this.privateIpAddress = privateIpAddress;
        this.rootDeviceName = rootDeviceName;
        this.rootDeviceType = rootDeviceType;
        this.securityGroups = securityGroups;
        this.isSourceDestCheck = isSourceDestCheck;
        this.isSpotInstance = isSpotInstance;
        this.sriovNetSupport = sriovNetSupport;
        this.state = state;
        this.subnetKey = subnetKey;
        this.tags = tags;
        this.tpmSupport = tpmSupport;
        this.virtualizationType = virtualizationType;
        this.vpcKey = vpcKey;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The architecture of the image.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("architecture")
        private String architecture;

        /**
         * The architecture of the image.
         * @param architecture the value to set
         * @return this builder
         **/
        public Builder architecture(String architecture) {
            this.architecture = architecture;
            this.__explicitlySet__.add("architecture");
            return this;
        }
        /**
         * The boot mode of the instance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("bootMode")
        private String bootMode;

        /**
         * The boot mode of the instance.
         * @param bootMode the value to set
         * @return this builder
         **/
        public Builder bootMode(String bootMode) {
            this.bootMode = bootMode;
            this.__explicitlySet__.add("bootMode");
            return this;
        }
        /**
         * The ID of the Capacity Reservation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("capacityReservationKey")
        private String capacityReservationKey;

        /**
         * The ID of the Capacity Reservation.
         * @param capacityReservationKey the value to set
         * @return this builder
         **/
        public Builder capacityReservationKey(String capacityReservationKey) {
            this.capacityReservationKey = capacityReservationKey;
            this.__explicitlySet__.add("capacityReservationKey");
            return this;
        }
        /**
         * Indicates if the elastic inference accelerators attached to an instance
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("areElasticInferenceAcceleratorsPresent")
        private Boolean areElasticInferenceAcceleratorsPresent;

        /**
         * Indicates if the elastic inference accelerators attached to an instance
         * @param areElasticInferenceAcceleratorsPresent the value to set
         * @return this builder
         **/
        public Builder areElasticInferenceAcceleratorsPresent(
                Boolean areElasticInferenceAcceleratorsPresent) {
            this.areElasticInferenceAcceleratorsPresent = areElasticInferenceAcceleratorsPresent;
            this.__explicitlySet__.add("areElasticInferenceAcceleratorsPresent");
            return this;
        }
        /**
         * Indicates whether the instance is enabled for AWS Nitro Enclaves.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isEnclaveOptions")
        private Boolean isEnclaveOptions;

        /**
         * Indicates whether the instance is enabled for AWS Nitro Enclaves.
         * @param isEnclaveOptions the value to set
         * @return this builder
         **/
        public Builder isEnclaveOptions(Boolean isEnclaveOptions) {
            this.isEnclaveOptions = isEnclaveOptions;
            this.__explicitlySet__.add("isEnclaveOptions");
            return this;
        }
        /**
         * Indicates whether the instance is enabled for hibernation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isHibernationOptions")
        private Boolean isHibernationOptions;

        /**
         * Indicates whether the instance is enabled for hibernation.
         * @param isHibernationOptions the value to set
         * @return this builder
         **/
        public Builder isHibernationOptions(Boolean isHibernationOptions) {
            this.isHibernationOptions = isHibernationOptions;
            this.__explicitlySet__.add("isHibernationOptions");
            return this;
        }
        /**
         * The ID of the AMI used to launch the instance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("imageKey")
        private String imageKey;

        /**
         * The ID of the AMI used to launch the instance.
         * @param imageKey the value to set
         * @return this builder
         **/
        public Builder imageKey(String imageKey) {
            this.imageKey = imageKey;
            this.__explicitlySet__.add("imageKey");
            return this;
        }
        /**
         * The ID of the instance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("instanceKey")
        private String instanceKey;

        /**
         * The ID of the instance.
         * @param instanceKey the value to set
         * @return this builder
         **/
        public Builder instanceKey(String instanceKey) {
            this.instanceKey = instanceKey;
            this.__explicitlySet__.add("instanceKey");
            return this;
        }
        /**
         * Indicates whether this is a Spot Instance or a Scheduled Instance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("instanceLifecycle")
        private String instanceLifecycle;

        /**
         * Indicates whether this is a Spot Instance or a Scheduled Instance.
         * @param instanceLifecycle the value to set
         * @return this builder
         **/
        public Builder instanceLifecycle(String instanceLifecycle) {
            this.instanceLifecycle = instanceLifecycle;
            this.__explicitlySet__.add("instanceLifecycle");
            return this;
        }
        /**
         * The instance type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("instanceType")
        private String instanceType;

        /**
         * The instance type.
         * @param instanceType the value to set
         * @return this builder
         **/
        public Builder instanceType(String instanceType) {
            this.instanceType = instanceType;
            this.__explicitlySet__.add("instanceType");
            return this;
        }
        /**
         * The public IPv4 address, or the Carrier IP address assigned to the instance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
        private String ipAddress;

        /**
         * The public IPv4 address, or the Carrier IP address assigned to the instance.
         * @param ipAddress the value to set
         * @return this builder
         **/
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            this.__explicitlySet__.add("ipAddress");
            return this;
        }
        /**
         * The IPv6 address assigned to the instance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ipv6Address")
        private String ipv6Address;

        /**
         * The IPv6 address assigned to the instance.
         * @param ipv6Address the value to set
         * @return this builder
         **/
        public Builder ipv6Address(String ipv6Address) {
            this.ipv6Address = ipv6Address;
            this.__explicitlySet__.add("ipv6Address");
            return this;
        }
        /**
         * The kernel associated with this instance, if applicable.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("kernelKey")
        private String kernelKey;

        /**
         * The kernel associated with this instance, if applicable.
         * @param kernelKey the value to set
         * @return this builder
         **/
        public Builder kernelKey(String kernelKey) {
            this.kernelKey = kernelKey;
            this.__explicitlySet__.add("kernelKey");
            return this;
        }
        /**
         * The time the instance was launched.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeLaunch")
        private java.util.Date timeLaunch;

        /**
         * The time the instance was launched.
         * @param timeLaunch the value to set
         * @return this builder
         **/
        public Builder timeLaunch(java.util.Date timeLaunch) {
            this.timeLaunch = timeLaunch;
            this.__explicitlySet__.add("timeLaunch");
            return this;
        }
        /**
         * The license configurations for the instance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("licenses")
        private java.util.List<String> licenses;

        /**
         * The license configurations for the instance.
         * @param licenses the value to set
         * @return this builder
         **/
        public Builder licenses(java.util.List<String> licenses) {
            this.licenses = licenses;
            this.__explicitlySet__.add("licenses");
            return this;
        }
        /**
         * Provides information on the recovery and maintenance options of your instance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maintenanceOptions")
        private String maintenanceOptions;

        /**
         * Provides information on the recovery and maintenance options of your instance.
         * @param maintenanceOptions the value to set
         * @return this builder
         **/
        public Builder maintenanceOptions(String maintenanceOptions) {
            this.maintenanceOptions = maintenanceOptions;
            this.__explicitlySet__.add("maintenanceOptions");
            return this;
        }
        /**
         * The monitoring for the instance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("monitoring")
        private String monitoring;

        /**
         * The monitoring for the instance.
         * @param monitoring the value to set
         * @return this builder
         **/
        public Builder monitoring(String monitoring) {
            this.monitoring = monitoring;
            this.__explicitlySet__.add("monitoring");
            return this;
        }
        /**
         * The network interfaces for the instance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("networkInterfaces")
        private java.util.List<InstanceNetworkInterface> networkInterfaces;

        /**
         * The network interfaces for the instance.
         * @param networkInterfaces the value to set
         * @return this builder
         **/
        public Builder networkInterfaces(
                java.util.List<InstanceNetworkInterface> networkInterfaces) {
            this.networkInterfaces = networkInterfaces;
            this.__explicitlySet__.add("networkInterfaces");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("placement")
        private Placement placement;

        public Builder placement(Placement placement) {
            this.placement = placement;
            this.__explicitlySet__.add("placement");
            return this;
        }
        /**
         * (IPv4 only) The private DNS hostname name assigned to the instance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("privateDnsName")
        private String privateDnsName;

        /**
         * (IPv4 only) The private DNS hostname name assigned to the instance.
         * @param privateDnsName the value to set
         * @return this builder
         **/
        public Builder privateDnsName(String privateDnsName) {
            this.privateDnsName = privateDnsName;
            this.__explicitlySet__.add("privateDnsName");
            return this;
        }
        /**
         * The private IPv4 address assigned to the instance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("privateIpAddress")
        private String privateIpAddress;

        /**
         * The private IPv4 address assigned to the instance.
         * @param privateIpAddress the value to set
         * @return this builder
         **/
        public Builder privateIpAddress(String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            this.__explicitlySet__.add("privateIpAddress");
            return this;
        }
        /**
         * The device name of the root device volume.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("rootDeviceName")
        private String rootDeviceName;

        /**
         * The device name of the root device volume.
         * @param rootDeviceName the value to set
         * @return this builder
         **/
        public Builder rootDeviceName(String rootDeviceName) {
            this.rootDeviceName = rootDeviceName;
            this.__explicitlySet__.add("rootDeviceName");
            return this;
        }
        /**
         * The root device type used by the AMI. The AMI can use an EBS volume or an instance store volume.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("rootDeviceType")
        private String rootDeviceType;

        /**
         * The root device type used by the AMI. The AMI can use an EBS volume or an instance store volume.
         * @param rootDeviceType the value to set
         * @return this builder
         **/
        public Builder rootDeviceType(String rootDeviceType) {
            this.rootDeviceType = rootDeviceType;
            this.__explicitlySet__.add("rootDeviceType");
            return this;
        }
        /**
         * The security groups for the instance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("securityGroups")
        private java.util.List<GroupIdentifier> securityGroups;

        /**
         * The security groups for the instance.
         * @param securityGroups the value to set
         * @return this builder
         **/
        public Builder securityGroups(java.util.List<GroupIdentifier> securityGroups) {
            this.securityGroups = securityGroups;
            this.__explicitlySet__.add("securityGroups");
            return this;
        }
        /**
         * Indicates whether source/destination checking is enabled.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isSourceDestCheck")
        private Boolean isSourceDestCheck;

        /**
         * Indicates whether source/destination checking is enabled.
         * @param isSourceDestCheck the value to set
         * @return this builder
         **/
        public Builder isSourceDestCheck(Boolean isSourceDestCheck) {
            this.isSourceDestCheck = isSourceDestCheck;
            this.__explicitlySet__.add("isSourceDestCheck");
            return this;
        }
        /**
         * If the request is a Spot Instance request, this value will be true.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isSpotInstance")
        private Boolean isSpotInstance;

        /**
         * If the request is a Spot Instance request, this value will be true.
         * @param isSpotInstance the value to set
         * @return this builder
         **/
        public Builder isSpotInstance(Boolean isSpotInstance) {
            this.isSpotInstance = isSpotInstance;
            this.__explicitlySet__.add("isSpotInstance");
            return this;
        }
        /**
         * Specifies whether enhanced networking with the Intel 82599 Virtual Function interface is enabled.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sriovNetSupport")
        private String sriovNetSupport;

        /**
         * Specifies whether enhanced networking with the Intel 82599 Virtual Function interface is enabled.
         * @param sriovNetSupport the value to set
         * @return this builder
         **/
        public Builder sriovNetSupport(String sriovNetSupport) {
            this.sriovNetSupport = sriovNetSupport;
            this.__explicitlySet__.add("sriovNetSupport");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("state")
        private InstanceState state;

        public Builder state(InstanceState state) {
            this.state = state;
            this.__explicitlySet__.add("state");
            return this;
        }
        /**
         * EC2-VPC The ID of the subnet in which the instance is running.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subnetKey")
        private String subnetKey;

        /**
         * EC2-VPC The ID of the subnet in which the instance is running.
         * @param subnetKey the value to set
         * @return this builder
         **/
        public Builder subnetKey(String subnetKey) {
            this.subnetKey = subnetKey;
            this.__explicitlySet__.add("subnetKey");
            return this;
        }
        /**
         * Any tags assigned to the instance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tags")
        private java.util.List<Tag> tags;

        /**
         * Any tags assigned to the instance.
         * @param tags the value to set
         * @return this builder
         **/
        public Builder tags(java.util.List<Tag> tags) {
            this.tags = tags;
            this.__explicitlySet__.add("tags");
            return this;
        }
        /**
         * If the instance is configured for NitroTPM support, the value is v2.0.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tpmSupport")
        private String tpmSupport;

        /**
         * If the instance is configured for NitroTPM support, the value is v2.0.
         * @param tpmSupport the value to set
         * @return this builder
         **/
        public Builder tpmSupport(String tpmSupport) {
            this.tpmSupport = tpmSupport;
            this.__explicitlySet__.add("tpmSupport");
            return this;
        }
        /**
         * The virtualization type of the instance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("virtualizationType")
        private String virtualizationType;

        /**
         * The virtualization type of the instance.
         * @param virtualizationType the value to set
         * @return this builder
         **/
        public Builder virtualizationType(String virtualizationType) {
            this.virtualizationType = virtualizationType;
            this.__explicitlySet__.add("virtualizationType");
            return this;
        }
        /**
         * EC2-VPC The ID of the VPC in which the instance is running.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vpcKey")
        private String vpcKey;

        /**
         * EC2-VPC The ID of the VPC in which the instance is running.
         * @param vpcKey the value to set
         * @return this builder
         **/
        public Builder vpcKey(String vpcKey) {
            this.vpcKey = vpcKey;
            this.__explicitlySet__.add("vpcKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AwsEc2Properties build() {
            AwsEc2Properties model =
                    new AwsEc2Properties(
                            this.architecture,
                            this.bootMode,
                            this.capacityReservationKey,
                            this.areElasticInferenceAcceleratorsPresent,
                            this.isEnclaveOptions,
                            this.isHibernationOptions,
                            this.imageKey,
                            this.instanceKey,
                            this.instanceLifecycle,
                            this.instanceType,
                            this.ipAddress,
                            this.ipv6Address,
                            this.kernelKey,
                            this.timeLaunch,
                            this.licenses,
                            this.maintenanceOptions,
                            this.monitoring,
                            this.networkInterfaces,
                            this.placement,
                            this.privateDnsName,
                            this.privateIpAddress,
                            this.rootDeviceName,
                            this.rootDeviceType,
                            this.securityGroups,
                            this.isSourceDestCheck,
                            this.isSpotInstance,
                            this.sriovNetSupport,
                            this.state,
                            this.subnetKey,
                            this.tags,
                            this.tpmSupport,
                            this.virtualizationType,
                            this.vpcKey);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AwsEc2Properties model) {
            if (model.wasPropertyExplicitlySet("architecture")) {
                this.architecture(model.getArchitecture());
            }
            if (model.wasPropertyExplicitlySet("bootMode")) {
                this.bootMode(model.getBootMode());
            }
            if (model.wasPropertyExplicitlySet("capacityReservationKey")) {
                this.capacityReservationKey(model.getCapacityReservationKey());
            }
            if (model.wasPropertyExplicitlySet("areElasticInferenceAcceleratorsPresent")) {
                this.areElasticInferenceAcceleratorsPresent(
                        model.getAreElasticInferenceAcceleratorsPresent());
            }
            if (model.wasPropertyExplicitlySet("isEnclaveOptions")) {
                this.isEnclaveOptions(model.getIsEnclaveOptions());
            }
            if (model.wasPropertyExplicitlySet("isHibernationOptions")) {
                this.isHibernationOptions(model.getIsHibernationOptions());
            }
            if (model.wasPropertyExplicitlySet("imageKey")) {
                this.imageKey(model.getImageKey());
            }
            if (model.wasPropertyExplicitlySet("instanceKey")) {
                this.instanceKey(model.getInstanceKey());
            }
            if (model.wasPropertyExplicitlySet("instanceLifecycle")) {
                this.instanceLifecycle(model.getInstanceLifecycle());
            }
            if (model.wasPropertyExplicitlySet("instanceType")) {
                this.instanceType(model.getInstanceType());
            }
            if (model.wasPropertyExplicitlySet("ipAddress")) {
                this.ipAddress(model.getIpAddress());
            }
            if (model.wasPropertyExplicitlySet("ipv6Address")) {
                this.ipv6Address(model.getIpv6Address());
            }
            if (model.wasPropertyExplicitlySet("kernelKey")) {
                this.kernelKey(model.getKernelKey());
            }
            if (model.wasPropertyExplicitlySet("timeLaunch")) {
                this.timeLaunch(model.getTimeLaunch());
            }
            if (model.wasPropertyExplicitlySet("licenses")) {
                this.licenses(model.getLicenses());
            }
            if (model.wasPropertyExplicitlySet("maintenanceOptions")) {
                this.maintenanceOptions(model.getMaintenanceOptions());
            }
            if (model.wasPropertyExplicitlySet("monitoring")) {
                this.monitoring(model.getMonitoring());
            }
            if (model.wasPropertyExplicitlySet("networkInterfaces")) {
                this.networkInterfaces(model.getNetworkInterfaces());
            }
            if (model.wasPropertyExplicitlySet("placement")) {
                this.placement(model.getPlacement());
            }
            if (model.wasPropertyExplicitlySet("privateDnsName")) {
                this.privateDnsName(model.getPrivateDnsName());
            }
            if (model.wasPropertyExplicitlySet("privateIpAddress")) {
                this.privateIpAddress(model.getPrivateIpAddress());
            }
            if (model.wasPropertyExplicitlySet("rootDeviceName")) {
                this.rootDeviceName(model.getRootDeviceName());
            }
            if (model.wasPropertyExplicitlySet("rootDeviceType")) {
                this.rootDeviceType(model.getRootDeviceType());
            }
            if (model.wasPropertyExplicitlySet("securityGroups")) {
                this.securityGroups(model.getSecurityGroups());
            }
            if (model.wasPropertyExplicitlySet("isSourceDestCheck")) {
                this.isSourceDestCheck(model.getIsSourceDestCheck());
            }
            if (model.wasPropertyExplicitlySet("isSpotInstance")) {
                this.isSpotInstance(model.getIsSpotInstance());
            }
            if (model.wasPropertyExplicitlySet("sriovNetSupport")) {
                this.sriovNetSupport(model.getSriovNetSupport());
            }
            if (model.wasPropertyExplicitlySet("state")) {
                this.state(model.getState());
            }
            if (model.wasPropertyExplicitlySet("subnetKey")) {
                this.subnetKey(model.getSubnetKey());
            }
            if (model.wasPropertyExplicitlySet("tags")) {
                this.tags(model.getTags());
            }
            if (model.wasPropertyExplicitlySet("tpmSupport")) {
                this.tpmSupport(model.getTpmSupport());
            }
            if (model.wasPropertyExplicitlySet("virtualizationType")) {
                this.virtualizationType(model.getVirtualizationType());
            }
            if (model.wasPropertyExplicitlySet("vpcKey")) {
                this.vpcKey(model.getVpcKey());
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
     * The architecture of the image.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("architecture")
    private final String architecture;

    /**
     * The architecture of the image.
     * @return the value
     **/
    public String getArchitecture() {
        return architecture;
    }

    /**
     * The boot mode of the instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bootMode")
    private final String bootMode;

    /**
     * The boot mode of the instance.
     * @return the value
     **/
    public String getBootMode() {
        return bootMode;
    }

    /**
     * The ID of the Capacity Reservation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("capacityReservationKey")
    private final String capacityReservationKey;

    /**
     * The ID of the Capacity Reservation.
     * @return the value
     **/
    public String getCapacityReservationKey() {
        return capacityReservationKey;
    }

    /**
     * Indicates if the elastic inference accelerators attached to an instance
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("areElasticInferenceAcceleratorsPresent")
    private final Boolean areElasticInferenceAcceleratorsPresent;

    /**
     * Indicates if the elastic inference accelerators attached to an instance
     * @return the value
     **/
    public Boolean getAreElasticInferenceAcceleratorsPresent() {
        return areElasticInferenceAcceleratorsPresent;
    }

    /**
     * Indicates whether the instance is enabled for AWS Nitro Enclaves.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnclaveOptions")
    private final Boolean isEnclaveOptions;

    /**
     * Indicates whether the instance is enabled for AWS Nitro Enclaves.
     * @return the value
     **/
    public Boolean getIsEnclaveOptions() {
        return isEnclaveOptions;
    }

    /**
     * Indicates whether the instance is enabled for hibernation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHibernationOptions")
    private final Boolean isHibernationOptions;

    /**
     * Indicates whether the instance is enabled for hibernation.
     * @return the value
     **/
    public Boolean getIsHibernationOptions() {
        return isHibernationOptions;
    }

    /**
     * The ID of the AMI used to launch the instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("imageKey")
    private final String imageKey;

    /**
     * The ID of the AMI used to launch the instance.
     * @return the value
     **/
    public String getImageKey() {
        return imageKey;
    }

    /**
     * The ID of the instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceKey")
    private final String instanceKey;

    /**
     * The ID of the instance.
     * @return the value
     **/
    public String getInstanceKey() {
        return instanceKey;
    }

    /**
     * Indicates whether this is a Spot Instance or a Scheduled Instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceLifecycle")
    private final String instanceLifecycle;

    /**
     * Indicates whether this is a Spot Instance or a Scheduled Instance.
     * @return the value
     **/
    public String getInstanceLifecycle() {
        return instanceLifecycle;
    }

    /**
     * The instance type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceType")
    private final String instanceType;

    /**
     * The instance type.
     * @return the value
     **/
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * The public IPv4 address, or the Carrier IP address assigned to the instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
    private final String ipAddress;

    /**
     * The public IPv4 address, or the Carrier IP address assigned to the instance.
     * @return the value
     **/
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * The IPv6 address assigned to the instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipv6Address")
    private final String ipv6Address;

    /**
     * The IPv6 address assigned to the instance.
     * @return the value
     **/
    public String getIpv6Address() {
        return ipv6Address;
    }

    /**
     * The kernel associated with this instance, if applicable.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kernelKey")
    private final String kernelKey;

    /**
     * The kernel associated with this instance, if applicable.
     * @return the value
     **/
    public String getKernelKey() {
        return kernelKey;
    }

    /**
     * The time the instance was launched.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLaunch")
    private final java.util.Date timeLaunch;

    /**
     * The time the instance was launched.
     * @return the value
     **/
    public java.util.Date getTimeLaunch() {
        return timeLaunch;
    }

    /**
     * The license configurations for the instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("licenses")
    private final java.util.List<String> licenses;

    /**
     * The license configurations for the instance.
     * @return the value
     **/
    public java.util.List<String> getLicenses() {
        return licenses;
    }

    /**
     * Provides information on the recovery and maintenance options of your instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maintenanceOptions")
    private final String maintenanceOptions;

    /**
     * Provides information on the recovery and maintenance options of your instance.
     * @return the value
     **/
    public String getMaintenanceOptions() {
        return maintenanceOptions;
    }

    /**
     * The monitoring for the instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("monitoring")
    private final String monitoring;

    /**
     * The monitoring for the instance.
     * @return the value
     **/
    public String getMonitoring() {
        return monitoring;
    }

    /**
     * The network interfaces for the instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("networkInterfaces")
    private final java.util.List<InstanceNetworkInterface> networkInterfaces;

    /**
     * The network interfaces for the instance.
     * @return the value
     **/
    public java.util.List<InstanceNetworkInterface> getNetworkInterfaces() {
        return networkInterfaces;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("placement")
    private final Placement placement;

    public Placement getPlacement() {
        return placement;
    }

    /**
     * (IPv4 only) The private DNS hostname name assigned to the instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privateDnsName")
    private final String privateDnsName;

    /**
     * (IPv4 only) The private DNS hostname name assigned to the instance.
     * @return the value
     **/
    public String getPrivateDnsName() {
        return privateDnsName;
    }

    /**
     * The private IPv4 address assigned to the instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privateIpAddress")
    private final String privateIpAddress;

    /**
     * The private IPv4 address assigned to the instance.
     * @return the value
     **/
    public String getPrivateIpAddress() {
        return privateIpAddress;
    }

    /**
     * The device name of the root device volume.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rootDeviceName")
    private final String rootDeviceName;

    /**
     * The device name of the root device volume.
     * @return the value
     **/
    public String getRootDeviceName() {
        return rootDeviceName;
    }

    /**
     * The root device type used by the AMI. The AMI can use an EBS volume or an instance store volume.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rootDeviceType")
    private final String rootDeviceType;

    /**
     * The root device type used by the AMI. The AMI can use an EBS volume or an instance store volume.
     * @return the value
     **/
    public String getRootDeviceType() {
        return rootDeviceType;
    }

    /**
     * The security groups for the instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("securityGroups")
    private final java.util.List<GroupIdentifier> securityGroups;

    /**
     * The security groups for the instance.
     * @return the value
     **/
    public java.util.List<GroupIdentifier> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * Indicates whether source/destination checking is enabled.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSourceDestCheck")
    private final Boolean isSourceDestCheck;

    /**
     * Indicates whether source/destination checking is enabled.
     * @return the value
     **/
    public Boolean getIsSourceDestCheck() {
        return isSourceDestCheck;
    }

    /**
     * If the request is a Spot Instance request, this value will be true.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSpotInstance")
    private final Boolean isSpotInstance;

    /**
     * If the request is a Spot Instance request, this value will be true.
     * @return the value
     **/
    public Boolean getIsSpotInstance() {
        return isSpotInstance;
    }

    /**
     * Specifies whether enhanced networking with the Intel 82599 Virtual Function interface is enabled.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sriovNetSupport")
    private final String sriovNetSupport;

    /**
     * Specifies whether enhanced networking with the Intel 82599 Virtual Function interface is enabled.
     * @return the value
     **/
    public String getSriovNetSupport() {
        return sriovNetSupport;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("state")
    private final InstanceState state;

    public InstanceState getState() {
        return state;
    }

    /**
     * EC2-VPC The ID of the subnet in which the instance is running.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetKey")
    private final String subnetKey;

    /**
     * EC2-VPC The ID of the subnet in which the instance is running.
     * @return the value
     **/
    public String getSubnetKey() {
        return subnetKey;
    }

    /**
     * Any tags assigned to the instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tags")
    private final java.util.List<Tag> tags;

    /**
     * Any tags assigned to the instance.
     * @return the value
     **/
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * If the instance is configured for NitroTPM support, the value is v2.0.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tpmSupport")
    private final String tpmSupport;

    /**
     * If the instance is configured for NitroTPM support, the value is v2.0.
     * @return the value
     **/
    public String getTpmSupport() {
        return tpmSupport;
    }

    /**
     * The virtualization type of the instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("virtualizationType")
    private final String virtualizationType;

    /**
     * The virtualization type of the instance.
     * @return the value
     **/
    public String getVirtualizationType() {
        return virtualizationType;
    }

    /**
     * EC2-VPC The ID of the VPC in which the instance is running.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vpcKey")
    private final String vpcKey;

    /**
     * EC2-VPC The ID of the VPC in which the instance is running.
     * @return the value
     **/
    public String getVpcKey() {
        return vpcKey;
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
        sb.append("AwsEc2Properties(");
        sb.append("super=").append(super.toString());
        sb.append("architecture=").append(String.valueOf(this.architecture));
        sb.append(", bootMode=").append(String.valueOf(this.bootMode));
        sb.append(", capacityReservationKey=").append(String.valueOf(this.capacityReservationKey));
        sb.append(", areElasticInferenceAcceleratorsPresent=")
                .append(String.valueOf(this.areElasticInferenceAcceleratorsPresent));
        sb.append(", isEnclaveOptions=").append(String.valueOf(this.isEnclaveOptions));
        sb.append(", isHibernationOptions=").append(String.valueOf(this.isHibernationOptions));
        sb.append(", imageKey=").append(String.valueOf(this.imageKey));
        sb.append(", instanceKey=").append(String.valueOf(this.instanceKey));
        sb.append(", instanceLifecycle=").append(String.valueOf(this.instanceLifecycle));
        sb.append(", instanceType=").append(String.valueOf(this.instanceType));
        sb.append(", ipAddress=").append(String.valueOf(this.ipAddress));
        sb.append(", ipv6Address=").append(String.valueOf(this.ipv6Address));
        sb.append(", kernelKey=").append(String.valueOf(this.kernelKey));
        sb.append(", timeLaunch=").append(String.valueOf(this.timeLaunch));
        sb.append(", licenses=").append(String.valueOf(this.licenses));
        sb.append(", maintenanceOptions=").append(String.valueOf(this.maintenanceOptions));
        sb.append(", monitoring=").append(String.valueOf(this.monitoring));
        sb.append(", networkInterfaces=").append(String.valueOf(this.networkInterfaces));
        sb.append(", placement=").append(String.valueOf(this.placement));
        sb.append(", privateDnsName=").append(String.valueOf(this.privateDnsName));
        sb.append(", privateIpAddress=").append(String.valueOf(this.privateIpAddress));
        sb.append(", rootDeviceName=").append(String.valueOf(this.rootDeviceName));
        sb.append(", rootDeviceType=").append(String.valueOf(this.rootDeviceType));
        sb.append(", securityGroups=").append(String.valueOf(this.securityGroups));
        sb.append(", isSourceDestCheck=").append(String.valueOf(this.isSourceDestCheck));
        sb.append(", isSpotInstance=").append(String.valueOf(this.isSpotInstance));
        sb.append(", sriovNetSupport=").append(String.valueOf(this.sriovNetSupport));
        sb.append(", state=").append(String.valueOf(this.state));
        sb.append(", subnetKey=").append(String.valueOf(this.subnetKey));
        sb.append(", tags=").append(String.valueOf(this.tags));
        sb.append(", tpmSupport=").append(String.valueOf(this.tpmSupport));
        sb.append(", virtualizationType=").append(String.valueOf(this.virtualizationType));
        sb.append(", vpcKey=").append(String.valueOf(this.vpcKey));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AwsEc2Properties)) {
            return false;
        }

        AwsEc2Properties other = (AwsEc2Properties) o;
        return java.util.Objects.equals(this.architecture, other.architecture)
                && java.util.Objects.equals(this.bootMode, other.bootMode)
                && java.util.Objects.equals(
                        this.capacityReservationKey, other.capacityReservationKey)
                && java.util.Objects.equals(
                        this.areElasticInferenceAcceleratorsPresent,
                        other.areElasticInferenceAcceleratorsPresent)
                && java.util.Objects.equals(this.isEnclaveOptions, other.isEnclaveOptions)
                && java.util.Objects.equals(this.isHibernationOptions, other.isHibernationOptions)
                && java.util.Objects.equals(this.imageKey, other.imageKey)
                && java.util.Objects.equals(this.instanceKey, other.instanceKey)
                && java.util.Objects.equals(this.instanceLifecycle, other.instanceLifecycle)
                && java.util.Objects.equals(this.instanceType, other.instanceType)
                && java.util.Objects.equals(this.ipAddress, other.ipAddress)
                && java.util.Objects.equals(this.ipv6Address, other.ipv6Address)
                && java.util.Objects.equals(this.kernelKey, other.kernelKey)
                && java.util.Objects.equals(this.timeLaunch, other.timeLaunch)
                && java.util.Objects.equals(this.licenses, other.licenses)
                && java.util.Objects.equals(this.maintenanceOptions, other.maintenanceOptions)
                && java.util.Objects.equals(this.monitoring, other.monitoring)
                && java.util.Objects.equals(this.networkInterfaces, other.networkInterfaces)
                && java.util.Objects.equals(this.placement, other.placement)
                && java.util.Objects.equals(this.privateDnsName, other.privateDnsName)
                && java.util.Objects.equals(this.privateIpAddress, other.privateIpAddress)
                && java.util.Objects.equals(this.rootDeviceName, other.rootDeviceName)
                && java.util.Objects.equals(this.rootDeviceType, other.rootDeviceType)
                && java.util.Objects.equals(this.securityGroups, other.securityGroups)
                && java.util.Objects.equals(this.isSourceDestCheck, other.isSourceDestCheck)
                && java.util.Objects.equals(this.isSpotInstance, other.isSpotInstance)
                && java.util.Objects.equals(this.sriovNetSupport, other.sriovNetSupport)
                && java.util.Objects.equals(this.state, other.state)
                && java.util.Objects.equals(this.subnetKey, other.subnetKey)
                && java.util.Objects.equals(this.tags, other.tags)
                && java.util.Objects.equals(this.tpmSupport, other.tpmSupport)
                && java.util.Objects.equals(this.virtualizationType, other.virtualizationType)
                && java.util.Objects.equals(this.vpcKey, other.vpcKey)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.architecture == null ? 43 : this.architecture.hashCode());
        result = (result * PRIME) + (this.bootMode == null ? 43 : this.bootMode.hashCode());
        result =
                (result * PRIME)
                        + (this.capacityReservationKey == null
                                ? 43
                                : this.capacityReservationKey.hashCode());
        result =
                (result * PRIME)
                        + (this.areElasticInferenceAcceleratorsPresent == null
                                ? 43
                                : this.areElasticInferenceAcceleratorsPresent.hashCode());
        result =
                (result * PRIME)
                        + (this.isEnclaveOptions == null ? 43 : this.isEnclaveOptions.hashCode());
        result =
                (result * PRIME)
                        + (this.isHibernationOptions == null
                                ? 43
                                : this.isHibernationOptions.hashCode());
        result = (result * PRIME) + (this.imageKey == null ? 43 : this.imageKey.hashCode());
        result = (result * PRIME) + (this.instanceKey == null ? 43 : this.instanceKey.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceLifecycle == null ? 43 : this.instanceLifecycle.hashCode());
        result = (result * PRIME) + (this.instanceType == null ? 43 : this.instanceType.hashCode());
        result = (result * PRIME) + (this.ipAddress == null ? 43 : this.ipAddress.hashCode());
        result = (result * PRIME) + (this.ipv6Address == null ? 43 : this.ipv6Address.hashCode());
        result = (result * PRIME) + (this.kernelKey == null ? 43 : this.kernelKey.hashCode());
        result = (result * PRIME) + (this.timeLaunch == null ? 43 : this.timeLaunch.hashCode());
        result = (result * PRIME) + (this.licenses == null ? 43 : this.licenses.hashCode());
        result =
                (result * PRIME)
                        + (this.maintenanceOptions == null
                                ? 43
                                : this.maintenanceOptions.hashCode());
        result = (result * PRIME) + (this.monitoring == null ? 43 : this.monitoring.hashCode());
        result =
                (result * PRIME)
                        + (this.networkInterfaces == null ? 43 : this.networkInterfaces.hashCode());
        result = (result * PRIME) + (this.placement == null ? 43 : this.placement.hashCode());
        result =
                (result * PRIME)
                        + (this.privateDnsName == null ? 43 : this.privateDnsName.hashCode());
        result =
                (result * PRIME)
                        + (this.privateIpAddress == null ? 43 : this.privateIpAddress.hashCode());
        result =
                (result * PRIME)
                        + (this.rootDeviceName == null ? 43 : this.rootDeviceName.hashCode());
        result =
                (result * PRIME)
                        + (this.rootDeviceType == null ? 43 : this.rootDeviceType.hashCode());
        result =
                (result * PRIME)
                        + (this.securityGroups == null ? 43 : this.securityGroups.hashCode());
        result =
                (result * PRIME)
                        + (this.isSourceDestCheck == null ? 43 : this.isSourceDestCheck.hashCode());
        result =
                (result * PRIME)
                        + (this.isSpotInstance == null ? 43 : this.isSpotInstance.hashCode());
        result =
                (result * PRIME)
                        + (this.sriovNetSupport == null ? 43 : this.sriovNetSupport.hashCode());
        result = (result * PRIME) + (this.state == null ? 43 : this.state.hashCode());
        result = (result * PRIME) + (this.subnetKey == null ? 43 : this.subnetKey.hashCode());
        result = (result * PRIME) + (this.tags == null ? 43 : this.tags.hashCode());
        result = (result * PRIME) + (this.tpmSupport == null ? 43 : this.tpmSupport.hashCode());
        result =
                (result * PRIME)
                        + (this.virtualizationType == null
                                ? 43
                                : this.virtualizationType.hashCode());
        result = (result * PRIME) + (this.vpcKey == null ? 43 : this.vpcKey.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
