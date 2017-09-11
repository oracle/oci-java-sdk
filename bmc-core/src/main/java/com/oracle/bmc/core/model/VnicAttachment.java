/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

/**
 * Represents an attachment between a VNIC and an instance. For more information, see
 * [Virtual Network Interface Cards (VNICs)](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Tasks/managingVNICs.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = VnicAttachment.Builder.class)
public class VnicAttachment {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
        private String instanceId;

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        @com.fasterxml.jackson.annotation.JsonProperty("vlanTag")
        private Integer vlanTag;

        @com.fasterxml.jackson.annotation.JsonProperty("vnicId")
        private String vnicId;

        public VnicAttachment build() {
            return new VnicAttachment(
                    availabilityDomain,
                    compartmentId,
                    displayName,
                    id,
                    instanceId,
                    lifecycleState,
                    subnetId,
                    timeCreated,
                    vlanTag,
                    vnicId);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VnicAttachment o) {
            return availabilityDomain(o.getAvailabilityDomain())
                    .compartmentId(o.getCompartmentId())
                    .displayName(o.getDisplayName())
                    .id(o.getId())
                    .instanceId(o.getInstanceId())
                    .lifecycleState(o.getLifecycleState())
                    .subnetId(o.getSubnetId())
                    .timeCreated(o.getTimeCreated())
                    .vlanTag(o.getVlanTag())
                    .vnicId(o.getVnicId());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The Availability Domain of the instance.
     * <p>
     * Example: `Uocm:PHX-AD-1`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 255)
    String availabilityDomain;

    /**
     * The OCID of the compartment the VNIC attachment is in, which is the same
     * compartment the instance is in.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 255)
    String compartmentId;

    /**
     * A user-friendly name. Does not have to be unique.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    @javax.validation.constraints.Size(min = 1, max = 255)
    String displayName;

    /**
     * The OCID of the VNIC attachment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 255)
    String id;

    /**
     * The OCID of the instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 255)
    String instanceId;
    /**
     * The current state of the VNIC attachment.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
        Attaching("ATTACHING"),
        Attached("ATTACHED"),
        Detaching("DETACHING"),
        Detached("DETACHED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The current state of the VNIC attachment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    LifecycleState lifecycleState;

    /**
     * The OCID of the VNIC's subnet.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 255)
    String subnetId;

    /**
     * The date and time the VNIC attachment was created, in the format defined by RFC3339.
     * <p>
     * Example: `2016-08-25T21:10:29.600Z`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    java.util.Date timeCreated;

    /**
     * The Oracle-assigned VLAN tag of the attached VNIC. Available after the
     * attachment process is complete.
     * <p>
     * Example: `0`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vlanTag")
    Integer vlanTag;

    /**
     * The OCID of the VNIC. Available after the attachment process is complete.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vnicId")
    @javax.validation.constraints.Size(min = 1, max = 255)
    String vnicId;
}
