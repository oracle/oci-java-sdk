/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * A dedicated virtual machine host lets you host multiple VM instances
 * on a dedicated server that is not shared with other tenancies.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DedicatedVmHost.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class DedicatedVmHost {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dedicatedVmHostShape")
        private String dedicatedVmHostShape;

        public Builder dedicatedVmHostShape(String dedicatedVmHostShape) {
            this.dedicatedVmHostShape = dedicatedVmHostShape;
            this.__explicitlySet__.add("dedicatedVmHostShape");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("faultDomain")
        private String faultDomain;

        public Builder faultDomain(String faultDomain) {
            this.faultDomain = faultDomain;
            this.__explicitlySet__.add("faultDomain");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalOcpus")
        private Float totalOcpus;

        public Builder totalOcpus(Float totalOcpus) {
            this.totalOcpus = totalOcpus;
            this.__explicitlySet__.add("totalOcpus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("remainingOcpus")
        private Float remainingOcpus;

        public Builder remainingOcpus(Float remainingOcpus) {
            this.remainingOcpus = remainingOcpus;
            this.__explicitlySet__.add("remainingOcpus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalMemoryInGBs")
        private Float totalMemoryInGBs;

        public Builder totalMemoryInGBs(Float totalMemoryInGBs) {
            this.totalMemoryInGBs = totalMemoryInGBs;
            this.__explicitlySet__.add("totalMemoryInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("remainingMemoryInGBs")
        private Float remainingMemoryInGBs;

        public Builder remainingMemoryInGBs(Float remainingMemoryInGBs) {
            this.remainingMemoryInGBs = remainingMemoryInGBs;
            this.__explicitlySet__.add("remainingMemoryInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DedicatedVmHost build() {
            DedicatedVmHost __instance__ =
                    new DedicatedVmHost(
                            availabilityDomain,
                            compartmentId,
                            dedicatedVmHostShape,
                            definedTags,
                            displayName,
                            faultDomain,
                            freeformTags,
                            id,
                            lifecycleState,
                            timeCreated,
                            totalOcpus,
                            remainingOcpus,
                            totalMemoryInGBs,
                            remainingMemoryInGBs);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DedicatedVmHost o) {
            Builder copiedBuilder =
                    availabilityDomain(o.getAvailabilityDomain())
                            .compartmentId(o.getCompartmentId())
                            .dedicatedVmHostShape(o.getDedicatedVmHostShape())
                            .definedTags(o.getDefinedTags())
                            .displayName(o.getDisplayName())
                            .faultDomain(o.getFaultDomain())
                            .freeformTags(o.getFreeformTags())
                            .id(o.getId())
                            .lifecycleState(o.getLifecycleState())
                            .timeCreated(o.getTimeCreated())
                            .totalOcpus(o.getTotalOcpus())
                            .remainingOcpus(o.getRemainingOcpus())
                            .totalMemoryInGBs(o.getTotalMemoryInGBs())
                            .remainingMemoryInGBs(o.getRemainingMemoryInGBs());

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
     * The availability domain the dedicated virtual machine host is running in.
     * <p>
     * Example: {@code Uocm:PHX-AD-1}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    String availabilityDomain;

    /**
     * The OCID of the compartment that contains the dedicated virtual machine host.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The dedicated virtual machine host shape. The shape determines the number of CPUs and
     * other resources available for VMs.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dedicatedVmHostShape")
    String dedicatedVmHostShape;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     * <p>
     * Example: {@code My Dedicated Vm Host}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The fault domain for the dedicated virtual machine host's assigned instances.
     * For more information, see [Fault Domains](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/regions.htm#fault).
     * <p>
     * If you do not specify the fault domain, the system selects one for you. To change the fault domain for a dedicated virtual machine host,
     * delete it, and then create a new dedicated virtual machine host in the preferred fault domain.
     * <p>
     * To get a list of fault domains, use the {@code ListFaultDomains} operation in the [Identity and Access Management Service API](https://docs.cloud.oracle.com/iaas/api/#/en/identity/20160918/).
     * <p>
     * Example: {@code FAULT-DOMAIN-1}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("faultDomain")
    String faultDomain;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the dedicated VM host.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;
    /**
     * The current state of the dedicated VM host.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
        Creating("CREATING"),
        Active("ACTIVE"),
        Updating("UPDATING"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Failed("FAILED"),

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
     * The current state of the dedicated VM host.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * The date and time the dedicated VM host was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The total OCPUs of the dedicated VM host.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalOcpus")
    Float totalOcpus;

    /**
     * The available OCPUs of the dedicated VM host.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("remainingOcpus")
    Float remainingOcpus;

    /**
     * The total memory of the dedicated VM host, in GBs.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalMemoryInGBs")
    Float totalMemoryInGBs;

    /**
     * The remaining memory of the dedicated VM host, in GBs.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("remainingMemoryInGBs")
    Float remainingMemoryInGBs;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
