/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateInstanceDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateInstanceDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "capacityReservationId",
        "definedTags",
        "securityAttributes",
        "displayName",
        "freeformTags",
        "agentConfig",
        "metadata",
        "extendedMetadata",
        "shape",
        "shapeConfig",
        "sourceDetails",
        "updateOperationConstraint",
        "instanceOptions",
        "faultDomain",
        "launchOptions",
        "availabilityConfig",
        "timeMaintenanceRebootDue",
        "dedicatedVmHostId",
        "platformConfig",
        "licensingConfigs"
    })
    public UpdateInstanceDetails(
            String capacityReservationId,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> securityAttributes,
            String displayName,
            java.util.Map<String, String> freeformTags,
            UpdateInstanceAgentConfigDetails agentConfig,
            java.util.Map<String, String> metadata,
            java.util.Map<String, Object> extendedMetadata,
            String shape,
            UpdateInstanceShapeConfigDetails shapeConfig,
            UpdateInstanceSourceDetails sourceDetails,
            UpdateOperationConstraint updateOperationConstraint,
            InstanceOptions instanceOptions,
            String faultDomain,
            UpdateLaunchOptions launchOptions,
            UpdateInstanceAvailabilityConfigDetails availabilityConfig,
            java.util.Date timeMaintenanceRebootDue,
            String dedicatedVmHostId,
            UpdateInstancePlatformConfig platformConfig,
            java.util.List<UpdateInstanceLicensingConfig> licensingConfigs) {
        super();
        this.capacityReservationId = capacityReservationId;
        this.definedTags = definedTags;
        this.securityAttributes = securityAttributes;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.agentConfig = agentConfig;
        this.metadata = metadata;
        this.extendedMetadata = extendedMetadata;
        this.shape = shape;
        this.shapeConfig = shapeConfig;
        this.sourceDetails = sourceDetails;
        this.updateOperationConstraint = updateOperationConstraint;
        this.instanceOptions = instanceOptions;
        this.faultDomain = faultDomain;
        this.launchOptions = launchOptions;
        this.availabilityConfig = availabilityConfig;
        this.timeMaintenanceRebootDue = timeMaintenanceRebootDue;
        this.dedicatedVmHostId = dedicatedVmHostId;
        this.platformConfig = platformConfig;
        this.licensingConfigs = licensingConfigs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the compute capacity reservation this instance is launched under. You can
         * remove the instance from a reservation by specifying an empty string as input for this
         * field. For more information, see [Capacity
         * Reservations](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/reserve-capacity.htm#default).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("capacityReservationId")
        private String capacityReservationId;

        /**
         * The OCID of the compute capacity reservation this instance is launched under. You can
         * remove the instance from a reservation by specifying an empty string as input for this
         * field. For more information, see [Capacity
         * Reservations](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/reserve-capacity.htm#default).
         *
         * @param capacityReservationId the value to set
         * @return this builder
         */
        public Builder capacityReservationId(String capacityReservationId) {
            this.capacityReservationId = capacityReservationId;
            this.__explicitlySet__.add("capacityReservationId");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * [Security
         * attributes](https://docs.cloud.oracle.com/iaas/Content/zero-trust-packet-routing/zpr-artifacts.htm#security-attributes)
         * are labels for a resource that can be referenced in a [Zero Trust Packet
         * Routing](https://docs.cloud.oracle.com/iaas/Content/zero-trust-packet-routing/overview.htm)
         * (ZPR) policy to control access to ZPR-supported resources.
         *
         * <p>Example: {@code {"Oracle-DataSecurity-ZPR": {"MaxEgressCount":
         * {"value":"42","mode":"audit"}}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("securityAttributes")
        private java.util.Map<String, java.util.Map<String, Object>> securityAttributes;

        /**
         * [Security
         * attributes](https://docs.cloud.oracle.com/iaas/Content/zero-trust-packet-routing/zpr-artifacts.htm#security-attributes)
         * are labels for a resource that can be referenced in a [Zero Trust Packet
         * Routing](https://docs.cloud.oracle.com/iaas/Content/zero-trust-packet-routing/overview.htm)
         * (ZPR) policy to control access to ZPR-supported resources.
         *
         * <p>Example: {@code {"Oracle-DataSecurity-ZPR": {"MaxEgressCount":
         * {"value":"42","mode":"audit"}}}}
         *
         * @param securityAttributes the value to set
         * @return this builder
         */
        public Builder securityAttributes(
                java.util.Map<String, java.util.Map<String, Object>> securityAttributes) {
            this.securityAttributes = securityAttributes;
            this.__explicitlySet__.add("securityAttributes");
            return this;
        }
        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("agentConfig")
        private UpdateInstanceAgentConfigDetails agentConfig;

        public Builder agentConfig(UpdateInstanceAgentConfigDetails agentConfig) {
            this.agentConfig = agentConfig;
            this.__explicitlySet__.add("agentConfig");
            return this;
        }
        /**
         * Custom metadata key/value string pairs that you provide. Any set of key/value pairs
         * provided here will completely replace the current set of key/value pairs in the {@code
         * metadata} field on the instance.
         *
         * <p>The "user_data" field and the "ssh_authorized_keys" field cannot be changed after an
         * instance has launched. Any request that updates, removes, or adds either of these fields
         * will be rejected. You must provide the same values for "user_data" and
         * "ssh_authorized_keys" that already exist on the instance.
         *
         * <p>The combined size of the {@code metadata} and {@code extendedMetadata} objects can be
         * a maximum of 32,000 bytes.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private java.util.Map<String, String> metadata;

        /**
         * Custom metadata key/value string pairs that you provide. Any set of key/value pairs
         * provided here will completely replace the current set of key/value pairs in the {@code
         * metadata} field on the instance.
         *
         * <p>The "user_data" field and the "ssh_authorized_keys" field cannot be changed after an
         * instance has launched. Any request that updates, removes, or adds either of these fields
         * will be rejected. You must provide the same values for "user_data" and
         * "ssh_authorized_keys" that already exist on the instance.
         *
         * <p>The combined size of the {@code metadata} and {@code extendedMetadata} objects can be
         * a maximum of 32,000 bytes.
         *
         * @param metadata the value to set
         * @return this builder
         */
        public Builder metadata(java.util.Map<String, String> metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }
        /**
         * Additional metadata key/value pairs that you provide. They serve the same purpose and
         * functionality as fields in the {@code metadata} object.
         *
         * <p>They are distinguished from {@code metadata} fields in that these can be nested JSON
         * objects (whereas {@code metadata} fields are string/string maps only).
         *
         * <p>The "user_data" field and the "ssh_authorized_keys" field cannot be changed after an
         * instance has launched. Any request that updates, removes, or adds either of these fields
         * will be rejected. You must provide the same values for "user_data" and
         * "ssh_authorized_keys" that already exist on the instance.
         *
         * <p>The combined size of the {@code metadata} and {@code extendedMetadata} objects can be
         * a maximum of 32,000 bytes.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("extendedMetadata")
        private java.util.Map<String, Object> extendedMetadata;

        /**
         * Additional metadata key/value pairs that you provide. They serve the same purpose and
         * functionality as fields in the {@code metadata} object.
         *
         * <p>They are distinguished from {@code metadata} fields in that these can be nested JSON
         * objects (whereas {@code metadata} fields are string/string maps only).
         *
         * <p>The "user_data" field and the "ssh_authorized_keys" field cannot be changed after an
         * instance has launched. Any request that updates, removes, or adds either of these fields
         * will be rejected. You must provide the same values for "user_data" and
         * "ssh_authorized_keys" that already exist on the instance.
         *
         * <p>The combined size of the {@code metadata} and {@code extendedMetadata} objects can be
         * a maximum of 32,000 bytes.
         *
         * @param extendedMetadata the value to set
         * @return this builder
         */
        public Builder extendedMetadata(java.util.Map<String, Object> extendedMetadata) {
            this.extendedMetadata = extendedMetadata;
            this.__explicitlySet__.add("extendedMetadata");
            return this;
        }
        /**
         * The shape of the instance. The shape determines the number of CPUs and the amount of
         * memory allocated to the instance. For more information about how to change shapes, and a
         * list of shapes that are supported, see [Editing an
         * Instance](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/resizinginstances.htm).
         *
         * <p>For details about the CPUs, memory, and other properties of each shape, see [Compute
         * Shapes](https://docs.cloud.oracle.com/iaas/Content/Compute/References/computeshapes.htm).
         *
         * <p>The new shape must be compatible with the image that was used to launch the instance.
         * You can enumerate all available shapes and determine image compatibility by calling
         * {@link #listShapes(ListShapesRequest) listShapes}.
         *
         * <p>To determine whether capacity is available for a specific shape before you change the
         * shape of an instance, use the {@link
         * #createComputeCapacityReport(CreateComputeCapacityReportRequest)
         * createComputeCapacityReport} operation.
         *
         * <p>If the instance is running when you change the shape, the instance is rebooted.
         *
         * <p>Example: {@code VM.Standard2.1}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        /**
         * The shape of the instance. The shape determines the number of CPUs and the amount of
         * memory allocated to the instance. For more information about how to change shapes, and a
         * list of shapes that are supported, see [Editing an
         * Instance](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/resizinginstances.htm).
         *
         * <p>For details about the CPUs, memory, and other properties of each shape, see [Compute
         * Shapes](https://docs.cloud.oracle.com/iaas/Content/Compute/References/computeshapes.htm).
         *
         * <p>The new shape must be compatible with the image that was used to launch the instance.
         * You can enumerate all available shapes and determine image compatibility by calling
         * {@link #listShapes(ListShapesRequest) listShapes}.
         *
         * <p>To determine whether capacity is available for a specific shape before you change the
         * shape of an instance, use the {@link
         * #createComputeCapacityReport(CreateComputeCapacityReportRequest)
         * createComputeCapacityReport} operation.
         *
         * <p>If the instance is running when you change the shape, the instance is rebooted.
         *
         * <p>Example: {@code VM.Standard2.1}
         *
         * @param shape the value to set
         * @return this builder
         */
        public Builder shape(String shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shapeConfig")
        private UpdateInstanceShapeConfigDetails shapeConfig;

        public Builder shapeConfig(UpdateInstanceShapeConfigDetails shapeConfig) {
            this.shapeConfig = shapeConfig;
            this.__explicitlySet__.add("shapeConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceDetails")
        private UpdateInstanceSourceDetails sourceDetails;

        public Builder sourceDetails(UpdateInstanceSourceDetails sourceDetails) {
            this.sourceDetails = sourceDetails;
            this.__explicitlySet__.add("sourceDetails");
            return this;
        }
        /**
         * The parameter acts as a fail-safe to prevent unwanted downtime when updating a running
         * instance. The default is ALLOW_DOWNTIME. * {@code ALLOW_DOWNTIME} - Compute might reboot
         * the instance while updating the instance if a reboot is required. * {@code
         * AVOID_DOWNTIME} - If the instance is in running state, Compute tries to update the
         * instance without rebooting it. If the instance requires a reboot to be updated, an error
         * is returned and the instance is not updated. If the instance is stopped, it is updated
         * and remains in the stopped state.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("updateOperationConstraint")
        private UpdateOperationConstraint updateOperationConstraint;

        /**
         * The parameter acts as a fail-safe to prevent unwanted downtime when updating a running
         * instance. The default is ALLOW_DOWNTIME. * {@code ALLOW_DOWNTIME} - Compute might reboot
         * the instance while updating the instance if a reboot is required. * {@code
         * AVOID_DOWNTIME} - If the instance is in running state, Compute tries to update the
         * instance without rebooting it. If the instance requires a reboot to be updated, an error
         * is returned and the instance is not updated. If the instance is stopped, it is updated
         * and remains in the stopped state.
         *
         * @param updateOperationConstraint the value to set
         * @return this builder
         */
        public Builder updateOperationConstraint(
                UpdateOperationConstraint updateOperationConstraint) {
            this.updateOperationConstraint = updateOperationConstraint;
            this.__explicitlySet__.add("updateOperationConstraint");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("instanceOptions")
        private InstanceOptions instanceOptions;

        public Builder instanceOptions(InstanceOptions instanceOptions) {
            this.instanceOptions = instanceOptions;
            this.__explicitlySet__.add("instanceOptions");
            return this;
        }
        /**
         * A fault domain is a grouping of hardware and infrastructure within an availability
         * domain. Each availability domain contains three fault domains. Fault domains let you
         * distribute your instances so that they are not on the same physical hardware within a
         * single availability domain. A hardware failure or Compute hardware maintenance that
         * affects one fault domain does not affect instances in other fault domains.
         *
         * <p>To get a list of fault domains, use the {@link
         * #listFaultDomains(ListFaultDomainsRequest) listFaultDomains} operation in the Identity
         * and Access Management Service API.
         *
         * <p>Example: {@code FAULT-DOMAIN-1}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("faultDomain")
        private String faultDomain;

        /**
         * A fault domain is a grouping of hardware and infrastructure within an availability
         * domain. Each availability domain contains three fault domains. Fault domains let you
         * distribute your instances so that they are not on the same physical hardware within a
         * single availability domain. A hardware failure or Compute hardware maintenance that
         * affects one fault domain does not affect instances in other fault domains.
         *
         * <p>To get a list of fault domains, use the {@link
         * #listFaultDomains(ListFaultDomainsRequest) listFaultDomains} operation in the Identity
         * and Access Management Service API.
         *
         * <p>Example: {@code FAULT-DOMAIN-1}
         *
         * @param faultDomain the value to set
         * @return this builder
         */
        public Builder faultDomain(String faultDomain) {
            this.faultDomain = faultDomain;
            this.__explicitlySet__.add("faultDomain");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("launchOptions")
        private UpdateLaunchOptions launchOptions;

        public Builder launchOptions(UpdateLaunchOptions launchOptions) {
            this.launchOptions = launchOptions;
            this.__explicitlySet__.add("launchOptions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("availabilityConfig")
        private UpdateInstanceAvailabilityConfigDetails availabilityConfig;

        public Builder availabilityConfig(
                UpdateInstanceAvailabilityConfigDetails availabilityConfig) {
            this.availabilityConfig = availabilityConfig;
            this.__explicitlySet__.add("availabilityConfig");
            return this;
        }
        /**
         * For a VM instance, resets the scheduled time that the instance will be reboot migrated
         * for infrastructure maintenance, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339). If the instance hasn't been rebooted
         * after this date, Oracle reboots the instance within 24 hours of the time and date that
         * maintenance is due.
         *
         * <p>To get the maximum possible date that a maintenance reboot can be extended, use {@link
         * #getInstanceMaintenanceReboot(GetInstanceMaintenanceRebootRequest)
         * getInstanceMaintenanceReboot}.
         *
         * <p>Regardless of how the instance is stopped, this flag is reset to empty as soon as the
         * instance reaches the Stopped state.
         *
         * <p>To reboot migrate a bare metal instance, use the {@link
         * #instanceAction(InstanceActionRequest) instanceAction} operation.
         *
         * <p>For more information, see [Infrastructure
         * Maintenance](https://docs.cloud.oracle.com/iaas/Content/Compute/References/infrastructure-maintenance.htm).
         *
         * <p>Example: {@code 2018-05-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeMaintenanceRebootDue")
        private java.util.Date timeMaintenanceRebootDue;

        /**
         * For a VM instance, resets the scheduled time that the instance will be reboot migrated
         * for infrastructure maintenance, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339). If the instance hasn't been rebooted
         * after this date, Oracle reboots the instance within 24 hours of the time and date that
         * maintenance is due.
         *
         * <p>To get the maximum possible date that a maintenance reboot can be extended, use {@link
         * #getInstanceMaintenanceReboot(GetInstanceMaintenanceRebootRequest)
         * getInstanceMaintenanceReboot}.
         *
         * <p>Regardless of how the instance is stopped, this flag is reset to empty as soon as the
         * instance reaches the Stopped state.
         *
         * <p>To reboot migrate a bare metal instance, use the {@link
         * #instanceAction(InstanceActionRequest) instanceAction} operation.
         *
         * <p>For more information, see [Infrastructure
         * Maintenance](https://docs.cloud.oracle.com/iaas/Content/Compute/References/infrastructure-maintenance.htm).
         *
         * <p>Example: {@code 2018-05-25T21:10:29.600Z}
         *
         * @param timeMaintenanceRebootDue the value to set
         * @return this builder
         */
        public Builder timeMaintenanceRebootDue(java.util.Date timeMaintenanceRebootDue) {
            this.timeMaintenanceRebootDue = timeMaintenanceRebootDue;
            this.__explicitlySet__.add("timeMaintenanceRebootDue");
            return this;
        }
        /**
         * The OCID of the dedicated virtual machine host to place the instance on. Supported only
         * if this VM instance was already placed on a dedicated virtual machine host - that is, you
         * can't move an instance from on-demand capacity to dedicated capacity, nor can you move an
         * instance from dedicated capacity to on-demand capacity.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dedicatedVmHostId")
        private String dedicatedVmHostId;

        /**
         * The OCID of the dedicated virtual machine host to place the instance on. Supported only
         * if this VM instance was already placed on a dedicated virtual machine host - that is, you
         * can't move an instance from on-demand capacity to dedicated capacity, nor can you move an
         * instance from dedicated capacity to on-demand capacity.
         *
         * @param dedicatedVmHostId the value to set
         * @return this builder
         */
        public Builder dedicatedVmHostId(String dedicatedVmHostId) {
            this.dedicatedVmHostId = dedicatedVmHostId;
            this.__explicitlySet__.add("dedicatedVmHostId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("platformConfig")
        private UpdateInstancePlatformConfig platformConfig;

        public Builder platformConfig(UpdateInstancePlatformConfig platformConfig) {
            this.platformConfig = platformConfig;
            this.__explicitlySet__.add("platformConfig");
            return this;
        }
        /** The list of liscensing configurations with target update values. */
        @com.fasterxml.jackson.annotation.JsonProperty("licensingConfigs")
        private java.util.List<UpdateInstanceLicensingConfig> licensingConfigs;

        /**
         * The list of liscensing configurations with target update values.
         *
         * @param licensingConfigs the value to set
         * @return this builder
         */
        public Builder licensingConfigs(
                java.util.List<UpdateInstanceLicensingConfig> licensingConfigs) {
            this.licensingConfigs = licensingConfigs;
            this.__explicitlySet__.add("licensingConfigs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateInstanceDetails build() {
            UpdateInstanceDetails model =
                    new UpdateInstanceDetails(
                            this.capacityReservationId,
                            this.definedTags,
                            this.securityAttributes,
                            this.displayName,
                            this.freeformTags,
                            this.agentConfig,
                            this.metadata,
                            this.extendedMetadata,
                            this.shape,
                            this.shapeConfig,
                            this.sourceDetails,
                            this.updateOperationConstraint,
                            this.instanceOptions,
                            this.faultDomain,
                            this.launchOptions,
                            this.availabilityConfig,
                            this.timeMaintenanceRebootDue,
                            this.dedicatedVmHostId,
                            this.platformConfig,
                            this.licensingConfigs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateInstanceDetails model) {
            if (model.wasPropertyExplicitlySet("capacityReservationId")) {
                this.capacityReservationId(model.getCapacityReservationId());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("securityAttributes")) {
                this.securityAttributes(model.getSecurityAttributes());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("agentConfig")) {
                this.agentConfig(model.getAgentConfig());
            }
            if (model.wasPropertyExplicitlySet("metadata")) {
                this.metadata(model.getMetadata());
            }
            if (model.wasPropertyExplicitlySet("extendedMetadata")) {
                this.extendedMetadata(model.getExtendedMetadata());
            }
            if (model.wasPropertyExplicitlySet("shape")) {
                this.shape(model.getShape());
            }
            if (model.wasPropertyExplicitlySet("shapeConfig")) {
                this.shapeConfig(model.getShapeConfig());
            }
            if (model.wasPropertyExplicitlySet("sourceDetails")) {
                this.sourceDetails(model.getSourceDetails());
            }
            if (model.wasPropertyExplicitlySet("updateOperationConstraint")) {
                this.updateOperationConstraint(model.getUpdateOperationConstraint());
            }
            if (model.wasPropertyExplicitlySet("instanceOptions")) {
                this.instanceOptions(model.getInstanceOptions());
            }
            if (model.wasPropertyExplicitlySet("faultDomain")) {
                this.faultDomain(model.getFaultDomain());
            }
            if (model.wasPropertyExplicitlySet("launchOptions")) {
                this.launchOptions(model.getLaunchOptions());
            }
            if (model.wasPropertyExplicitlySet("availabilityConfig")) {
                this.availabilityConfig(model.getAvailabilityConfig());
            }
            if (model.wasPropertyExplicitlySet("timeMaintenanceRebootDue")) {
                this.timeMaintenanceRebootDue(model.getTimeMaintenanceRebootDue());
            }
            if (model.wasPropertyExplicitlySet("dedicatedVmHostId")) {
                this.dedicatedVmHostId(model.getDedicatedVmHostId());
            }
            if (model.wasPropertyExplicitlySet("platformConfig")) {
                this.platformConfig(model.getPlatformConfig());
            }
            if (model.wasPropertyExplicitlySet("licensingConfigs")) {
                this.licensingConfigs(model.getLicensingConfigs());
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

    /**
     * The OCID of the compute capacity reservation this instance is launched under. You can remove
     * the instance from a reservation by specifying an empty string as input for this field. For
     * more information, see [Capacity
     * Reservations](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/reserve-capacity.htm#default).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("capacityReservationId")
    private final String capacityReservationId;

    /**
     * The OCID of the compute capacity reservation this instance is launched under. You can remove
     * the instance from a reservation by specifying an empty string as input for this field. For
     * more information, see [Capacity
     * Reservations](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/reserve-capacity.htm#default).
     *
     * @return the value
     */
    public String getCapacityReservationId() {
        return capacityReservationId;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * [Security
     * attributes](https://docs.cloud.oracle.com/iaas/Content/zero-trust-packet-routing/zpr-artifacts.htm#security-attributes)
     * are labels for a resource that can be referenced in a [Zero Trust Packet
     * Routing](https://docs.cloud.oracle.com/iaas/Content/zero-trust-packet-routing/overview.htm)
     * (ZPR) policy to control access to ZPR-supported resources.
     *
     * <p>Example: {@code {"Oracle-DataSecurity-ZPR": {"MaxEgressCount":
     * {"value":"42","mode":"audit"}}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("securityAttributes")
    private final java.util.Map<String, java.util.Map<String, Object>> securityAttributes;

    /**
     * [Security
     * attributes](https://docs.cloud.oracle.com/iaas/Content/zero-trust-packet-routing/zpr-artifacts.htm#security-attributes)
     * are labels for a resource that can be referenced in a [Zero Trust Packet
     * Routing](https://docs.cloud.oracle.com/iaas/Content/zero-trust-packet-routing/overview.htm)
     * (ZPR) policy to control access to ZPR-supported resources.
     *
     * <p>Example: {@code {"Oracle-DataSecurity-ZPR": {"MaxEgressCount":
     * {"value":"42","mode":"audit"}}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSecurityAttributes() {
        return securityAttributes;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("agentConfig")
    private final UpdateInstanceAgentConfigDetails agentConfig;

    public UpdateInstanceAgentConfigDetails getAgentConfig() {
        return agentConfig;
    }

    /**
     * Custom metadata key/value string pairs that you provide. Any set of key/value pairs provided
     * here will completely replace the current set of key/value pairs in the {@code metadata} field
     * on the instance.
     *
     * <p>The "user_data" field and the "ssh_authorized_keys" field cannot be changed after an
     * instance has launched. Any request that updates, removes, or adds either of these fields will
     * be rejected. You must provide the same values for "user_data" and "ssh_authorized_keys" that
     * already exist on the instance.
     *
     * <p>The combined size of the {@code metadata} and {@code extendedMetadata} objects can be a
     * maximum of 32,000 bytes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final java.util.Map<String, String> metadata;

    /**
     * Custom metadata key/value string pairs that you provide. Any set of key/value pairs provided
     * here will completely replace the current set of key/value pairs in the {@code metadata} field
     * on the instance.
     *
     * <p>The "user_data" field and the "ssh_authorized_keys" field cannot be changed after an
     * instance has launched. Any request that updates, removes, or adds either of these fields will
     * be rejected. You must provide the same values for "user_data" and "ssh_authorized_keys" that
     * already exist on the instance.
     *
     * <p>The combined size of the {@code metadata} and {@code extendedMetadata} objects can be a
     * maximum of 32,000 bytes.
     *
     * @return the value
     */
    public java.util.Map<String, String> getMetadata() {
        return metadata;
    }

    /**
     * Additional metadata key/value pairs that you provide. They serve the same purpose and
     * functionality as fields in the {@code metadata} object.
     *
     * <p>They are distinguished from {@code metadata} fields in that these can be nested JSON
     * objects (whereas {@code metadata} fields are string/string maps only).
     *
     * <p>The "user_data" field and the "ssh_authorized_keys" field cannot be changed after an
     * instance has launched. Any request that updates, removes, or adds either of these fields will
     * be rejected. You must provide the same values for "user_data" and "ssh_authorized_keys" that
     * already exist on the instance.
     *
     * <p>The combined size of the {@code metadata} and {@code extendedMetadata} objects can be a
     * maximum of 32,000 bytes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("extendedMetadata")
    private final java.util.Map<String, Object> extendedMetadata;

    /**
     * Additional metadata key/value pairs that you provide. They serve the same purpose and
     * functionality as fields in the {@code metadata} object.
     *
     * <p>They are distinguished from {@code metadata} fields in that these can be nested JSON
     * objects (whereas {@code metadata} fields are string/string maps only).
     *
     * <p>The "user_data" field and the "ssh_authorized_keys" field cannot be changed after an
     * instance has launched. Any request that updates, removes, or adds either of these fields will
     * be rejected. You must provide the same values for "user_data" and "ssh_authorized_keys" that
     * already exist on the instance.
     *
     * <p>The combined size of the {@code metadata} and {@code extendedMetadata} objects can be a
     * maximum of 32,000 bytes.
     *
     * @return the value
     */
    public java.util.Map<String, Object> getExtendedMetadata() {
        return extendedMetadata;
    }

    /**
     * The shape of the instance. The shape determines the number of CPUs and the amount of memory
     * allocated to the instance. For more information about how to change shapes, and a list of
     * shapes that are supported, see [Editing an
     * Instance](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/resizinginstances.htm).
     *
     * <p>For details about the CPUs, memory, and other properties of each shape, see [Compute
     * Shapes](https://docs.cloud.oracle.com/iaas/Content/Compute/References/computeshapes.htm).
     *
     * <p>The new shape must be compatible with the image that was used to launch the instance. You
     * can enumerate all available shapes and determine image compatibility by calling {@link
     * #listShapes(ListShapesRequest) listShapes}.
     *
     * <p>To determine whether capacity is available for a specific shape before you change the
     * shape of an instance, use the {@link
     * #createComputeCapacityReport(CreateComputeCapacityReportRequest) createComputeCapacityReport}
     * operation.
     *
     * <p>If the instance is running when you change the shape, the instance is rebooted.
     *
     * <p>Example: {@code VM.Standard2.1}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final String shape;

    /**
     * The shape of the instance. The shape determines the number of CPUs and the amount of memory
     * allocated to the instance. For more information about how to change shapes, and a list of
     * shapes that are supported, see [Editing an
     * Instance](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/resizinginstances.htm).
     *
     * <p>For details about the CPUs, memory, and other properties of each shape, see [Compute
     * Shapes](https://docs.cloud.oracle.com/iaas/Content/Compute/References/computeshapes.htm).
     *
     * <p>The new shape must be compatible with the image that was used to launch the instance. You
     * can enumerate all available shapes and determine image compatibility by calling {@link
     * #listShapes(ListShapesRequest) listShapes}.
     *
     * <p>To determine whether capacity is available for a specific shape before you change the
     * shape of an instance, use the {@link
     * #createComputeCapacityReport(CreateComputeCapacityReportRequest) createComputeCapacityReport}
     * operation.
     *
     * <p>If the instance is running when you change the shape, the instance is rebooted.
     *
     * <p>Example: {@code VM.Standard2.1}
     *
     * @return the value
     */
    public String getShape() {
        return shape;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("shapeConfig")
    private final UpdateInstanceShapeConfigDetails shapeConfig;

    public UpdateInstanceShapeConfigDetails getShapeConfig() {
        return shapeConfig;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("sourceDetails")
    private final UpdateInstanceSourceDetails sourceDetails;

    public UpdateInstanceSourceDetails getSourceDetails() {
        return sourceDetails;
    }

    /**
     * The parameter acts as a fail-safe to prevent unwanted downtime when updating a running
     * instance. The default is ALLOW_DOWNTIME. * {@code ALLOW_DOWNTIME} - Compute might reboot the
     * instance while updating the instance if a reboot is required. * {@code AVOID_DOWNTIME} - If
     * the instance is in running state, Compute tries to update the instance without rebooting it.
     * If the instance requires a reboot to be updated, an error is returned and the instance is not
     * updated. If the instance is stopped, it is updated and remains in the stopped state.
     */
    public enum UpdateOperationConstraint implements com.oracle.bmc.http.internal.BmcEnum {
        AllowDowntime("ALLOW_DOWNTIME"),
        AvoidDowntime("AVOID_DOWNTIME"),
        ;

        private final String value;
        private static java.util.Map<String, UpdateOperationConstraint> map;

        static {
            map = new java.util.HashMap<>();
            for (UpdateOperationConstraint v : UpdateOperationConstraint.values()) {
                map.put(v.getValue(), v);
            }
        }

        UpdateOperationConstraint(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static UpdateOperationConstraint create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid UpdateOperationConstraint: " + key);
        }
    };
    /**
     * The parameter acts as a fail-safe to prevent unwanted downtime when updating a running
     * instance. The default is ALLOW_DOWNTIME. * {@code ALLOW_DOWNTIME} - Compute might reboot the
     * instance while updating the instance if a reboot is required. * {@code AVOID_DOWNTIME} - If
     * the instance is in running state, Compute tries to update the instance without rebooting it.
     * If the instance requires a reboot to be updated, an error is returned and the instance is not
     * updated. If the instance is stopped, it is updated and remains in the stopped state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("updateOperationConstraint")
    private final UpdateOperationConstraint updateOperationConstraint;

    /**
     * The parameter acts as a fail-safe to prevent unwanted downtime when updating a running
     * instance. The default is ALLOW_DOWNTIME. * {@code ALLOW_DOWNTIME} - Compute might reboot the
     * instance while updating the instance if a reboot is required. * {@code AVOID_DOWNTIME} - If
     * the instance is in running state, Compute tries to update the instance without rebooting it.
     * If the instance requires a reboot to be updated, an error is returned and the instance is not
     * updated. If the instance is stopped, it is updated and remains in the stopped state.
     *
     * @return the value
     */
    public UpdateOperationConstraint getUpdateOperationConstraint() {
        return updateOperationConstraint;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("instanceOptions")
    private final InstanceOptions instanceOptions;

    public InstanceOptions getInstanceOptions() {
        return instanceOptions;
    }

    /**
     * A fault domain is a grouping of hardware and infrastructure within an availability domain.
     * Each availability domain contains three fault domains. Fault domains let you distribute your
     * instances so that they are not on the same physical hardware within a single availability
     * domain. A hardware failure or Compute hardware maintenance that affects one fault domain does
     * not affect instances in other fault domains.
     *
     * <p>To get a list of fault domains, use the {@link #listFaultDomains(ListFaultDomainsRequest)
     * listFaultDomains} operation in the Identity and Access Management Service API.
     *
     * <p>Example: {@code FAULT-DOMAIN-1}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("faultDomain")
    private final String faultDomain;

    /**
     * A fault domain is a grouping of hardware and infrastructure within an availability domain.
     * Each availability domain contains three fault domains. Fault domains let you distribute your
     * instances so that they are not on the same physical hardware within a single availability
     * domain. A hardware failure or Compute hardware maintenance that affects one fault domain does
     * not affect instances in other fault domains.
     *
     * <p>To get a list of fault domains, use the {@link #listFaultDomains(ListFaultDomainsRequest)
     * listFaultDomains} operation in the Identity and Access Management Service API.
     *
     * <p>Example: {@code FAULT-DOMAIN-1}
     *
     * @return the value
     */
    public String getFaultDomain() {
        return faultDomain;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("launchOptions")
    private final UpdateLaunchOptions launchOptions;

    public UpdateLaunchOptions getLaunchOptions() {
        return launchOptions;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("availabilityConfig")
    private final UpdateInstanceAvailabilityConfigDetails availabilityConfig;

    public UpdateInstanceAvailabilityConfigDetails getAvailabilityConfig() {
        return availabilityConfig;
    }

    /**
     * For a VM instance, resets the scheduled time that the instance will be reboot migrated for
     * infrastructure maintenance, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339). If the instance hasn't been rebooted after
     * this date, Oracle reboots the instance within 24 hours of the time and date that maintenance
     * is due.
     *
     * <p>To get the maximum possible date that a maintenance reboot can be extended, use {@link
     * #getInstanceMaintenanceReboot(GetInstanceMaintenanceRebootRequest)
     * getInstanceMaintenanceReboot}.
     *
     * <p>Regardless of how the instance is stopped, this flag is reset to empty as soon as the
     * instance reaches the Stopped state.
     *
     * <p>To reboot migrate a bare metal instance, use the {@link
     * #instanceAction(InstanceActionRequest) instanceAction} operation.
     *
     * <p>For more information, see [Infrastructure
     * Maintenance](https://docs.cloud.oracle.com/iaas/Content/Compute/References/infrastructure-maintenance.htm).
     *
     * <p>Example: {@code 2018-05-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeMaintenanceRebootDue")
    private final java.util.Date timeMaintenanceRebootDue;

    /**
     * For a VM instance, resets the scheduled time that the instance will be reboot migrated for
     * infrastructure maintenance, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339). If the instance hasn't been rebooted after
     * this date, Oracle reboots the instance within 24 hours of the time and date that maintenance
     * is due.
     *
     * <p>To get the maximum possible date that a maintenance reboot can be extended, use {@link
     * #getInstanceMaintenanceReboot(GetInstanceMaintenanceRebootRequest)
     * getInstanceMaintenanceReboot}.
     *
     * <p>Regardless of how the instance is stopped, this flag is reset to empty as soon as the
     * instance reaches the Stopped state.
     *
     * <p>To reboot migrate a bare metal instance, use the {@link
     * #instanceAction(InstanceActionRequest) instanceAction} operation.
     *
     * <p>For more information, see [Infrastructure
     * Maintenance](https://docs.cloud.oracle.com/iaas/Content/Compute/References/infrastructure-maintenance.htm).
     *
     * <p>Example: {@code 2018-05-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeMaintenanceRebootDue() {
        return timeMaintenanceRebootDue;
    }

    /**
     * The OCID of the dedicated virtual machine host to place the instance on. Supported only if
     * this VM instance was already placed on a dedicated virtual machine host - that is, you can't
     * move an instance from on-demand capacity to dedicated capacity, nor can you move an instance
     * from dedicated capacity to on-demand capacity.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dedicatedVmHostId")
    private final String dedicatedVmHostId;

    /**
     * The OCID of the dedicated virtual machine host to place the instance on. Supported only if
     * this VM instance was already placed on a dedicated virtual machine host - that is, you can't
     * move an instance from on-demand capacity to dedicated capacity, nor can you move an instance
     * from dedicated capacity to on-demand capacity.
     *
     * @return the value
     */
    public String getDedicatedVmHostId() {
        return dedicatedVmHostId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("platformConfig")
    private final UpdateInstancePlatformConfig platformConfig;

    public UpdateInstancePlatformConfig getPlatformConfig() {
        return platformConfig;
    }

    /** The list of liscensing configurations with target update values. */
    @com.fasterxml.jackson.annotation.JsonProperty("licensingConfigs")
    private final java.util.List<UpdateInstanceLicensingConfig> licensingConfigs;

    /**
     * The list of liscensing configurations with target update values.
     *
     * @return the value
     */
    public java.util.List<UpdateInstanceLicensingConfig> getLicensingConfigs() {
        return licensingConfigs;
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
        sb.append("UpdateInstanceDetails(");
        sb.append("super=").append(super.toString());
        sb.append("capacityReservationId=").append(String.valueOf(this.capacityReservationId));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", securityAttributes=").append(String.valueOf(this.securityAttributes));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", agentConfig=").append(String.valueOf(this.agentConfig));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(", extendedMetadata=").append(String.valueOf(this.extendedMetadata));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(", shapeConfig=").append(String.valueOf(this.shapeConfig));
        sb.append(", sourceDetails=").append(String.valueOf(this.sourceDetails));
        sb.append(", updateOperationConstraint=")
                .append(String.valueOf(this.updateOperationConstraint));
        sb.append(", instanceOptions=").append(String.valueOf(this.instanceOptions));
        sb.append(", faultDomain=").append(String.valueOf(this.faultDomain));
        sb.append(", launchOptions=").append(String.valueOf(this.launchOptions));
        sb.append(", availabilityConfig=").append(String.valueOf(this.availabilityConfig));
        sb.append(", timeMaintenanceRebootDue=")
                .append(String.valueOf(this.timeMaintenanceRebootDue));
        sb.append(", dedicatedVmHostId=").append(String.valueOf(this.dedicatedVmHostId));
        sb.append(", platformConfig=").append(String.valueOf(this.platformConfig));
        sb.append(", licensingConfigs=").append(String.valueOf(this.licensingConfigs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateInstanceDetails)) {
            return false;
        }

        UpdateInstanceDetails other = (UpdateInstanceDetails) o;
        return java.util.Objects.equals(this.capacityReservationId, other.capacityReservationId)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.securityAttributes, other.securityAttributes)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.agentConfig, other.agentConfig)
                && java.util.Objects.equals(this.metadata, other.metadata)
                && java.util.Objects.equals(this.extendedMetadata, other.extendedMetadata)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.shapeConfig, other.shapeConfig)
                && java.util.Objects.equals(this.sourceDetails, other.sourceDetails)
                && java.util.Objects.equals(
                        this.updateOperationConstraint, other.updateOperationConstraint)
                && java.util.Objects.equals(this.instanceOptions, other.instanceOptions)
                && java.util.Objects.equals(this.faultDomain, other.faultDomain)
                && java.util.Objects.equals(this.launchOptions, other.launchOptions)
                && java.util.Objects.equals(this.availabilityConfig, other.availabilityConfig)
                && java.util.Objects.equals(
                        this.timeMaintenanceRebootDue, other.timeMaintenanceRebootDue)
                && java.util.Objects.equals(this.dedicatedVmHostId, other.dedicatedVmHostId)
                && java.util.Objects.equals(this.platformConfig, other.platformConfig)
                && java.util.Objects.equals(this.licensingConfigs, other.licensingConfigs)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.capacityReservationId == null
                                ? 43
                                : this.capacityReservationId.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.securityAttributes == null
                                ? 43
                                : this.securityAttributes.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.agentConfig == null ? 43 : this.agentConfig.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result =
                (result * PRIME)
                        + (this.extendedMetadata == null ? 43 : this.extendedMetadata.hashCode());
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result = (result * PRIME) + (this.shapeConfig == null ? 43 : this.shapeConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceDetails == null ? 43 : this.sourceDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.updateOperationConstraint == null
                                ? 43
                                : this.updateOperationConstraint.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceOptions == null ? 43 : this.instanceOptions.hashCode());
        result = (result * PRIME) + (this.faultDomain == null ? 43 : this.faultDomain.hashCode());
        result =
                (result * PRIME)
                        + (this.launchOptions == null ? 43 : this.launchOptions.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityConfig == null
                                ? 43
                                : this.availabilityConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.timeMaintenanceRebootDue == null
                                ? 43
                                : this.timeMaintenanceRebootDue.hashCode());
        result =
                (result * PRIME)
                        + (this.dedicatedVmHostId == null ? 43 : this.dedicatedVmHostId.hashCode());
        result =
                (result * PRIME)
                        + (this.platformConfig == null ? 43 : this.platformConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.licensingConfigs == null ? 43 : this.licensingConfigs.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
