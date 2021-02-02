/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * For use with Oracle Cloud Infrastructure FastConnect. A cross-connect represents a
 * physical connection between an existing network and Oracle. Customers who are colocated
 * with Oracle in a FastConnect location create and use cross-connects. For more
 * information, see [FastConnect Overview](https://docs.cloud.oracle.com/Content/Network/Concepts/fastconnect.htm).
 * <p>
 * Oracle recommends you create each cross-connect in a
 * {@link CrossConnectGroup} so you can use link aggregation
 * with the connection.
 * <p>
 **Note:** If you're a provider who is setting up a physical connection to Oracle so customers
 * can use FastConnect over the connection, be aware that your connection is modeled the
 * same way as a colocated customer's (with `CrossConnect` and `CrossConnectGroup` objects, and so on).
 * <p>
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized,
 * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
 * [Getting Started with Policies](https://docs.cloud.oracle.com/Content/Identity/Concepts/policygetstarted.htm).
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CrossConnect.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CrossConnect {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("crossConnectGroupId")
        private String crossConnectGroupId;

        public Builder crossConnectGroupId(String crossConnectGroupId) {
            this.crossConnectGroupId = crossConnectGroupId;
            this.__explicitlySet__.add("crossConnectGroupId");
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

        @com.fasterxml.jackson.annotation.JsonProperty("locationName")
        private String locationName;

        public Builder locationName(String locationName) {
            this.locationName = locationName;
            this.__explicitlySet__.add("locationName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("portName")
        private String portName;

        public Builder portName(String portName) {
            this.portName = portName;
            this.__explicitlySet__.add("portName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("portSpeedShapeName")
        private String portSpeedShapeName;

        public Builder portSpeedShapeName(String portSpeedShapeName) {
            this.portSpeedShapeName = portSpeedShapeName;
            this.__explicitlySet__.add("portSpeedShapeName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("customerReferenceName")
        private String customerReferenceName;

        public Builder customerReferenceName(String customerReferenceName) {
            this.customerReferenceName = customerReferenceName;
            this.__explicitlySet__.add("customerReferenceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CrossConnect build() {
            CrossConnect __instance__ =
                    new CrossConnect(
                            compartmentId,
                            crossConnectGroupId,
                            definedTags,
                            displayName,
                            freeformTags,
                            id,
                            lifecycleState,
                            locationName,
                            portName,
                            portSpeedShapeName,
                            customerReferenceName,
                            timeCreated);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CrossConnect o) {
            Builder copiedBuilder =
                    compartmentId(o.getCompartmentId())
                            .crossConnectGroupId(o.getCrossConnectGroupId())
                            .definedTags(o.getDefinedTags())
                            .displayName(o.getDisplayName())
                            .freeformTags(o.getFreeformTags())
                            .id(o.getId())
                            .lifecycleState(o.getLifecycleState())
                            .locationName(o.getLocationName())
                            .portName(o.getPortName())
                            .portSpeedShapeName(o.getPortSpeedShapeName())
                            .customerReferenceName(o.getCustomerReferenceName())
                            .timeCreated(o.getTimeCreated());

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
     * The OCID of the compartment containing the cross-connect group.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The OCID of the cross-connect group this cross-connect belongs to (if any).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("crossConnectGroupId")
    String crossConnectGroupId;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: `{\"Operations\": {\"CostCenter\": \"42\"}}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: `{\"Department\": \"Finance\"}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * The cross-connect's Oracle ID (OCID).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;
    /**
     * The cross-connect's current state.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
        PendingCustomer("PENDING_CUSTOMER"),
        Provisioning("PROVISIONING"),
        Provisioned("PROVISIONED"),
        Inactive("INACTIVE"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),

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
     * The cross-connect's current state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * The name of the FastConnect location where this cross-connect is installed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("locationName")
    String locationName;

    /**
     * A string identifying the meet-me room port for this cross-connect.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("portName")
    String portName;

    /**
     * The port speed for this cross-connect.
     * <p>
     * Example: `10 Gbps`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("portSpeedShapeName")
    String portSpeedShapeName;

    /**
     * A reference name or identifier for the physical fiber connection that this cross-connect
     * uses.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customerReferenceName")
    String customerReferenceName;

    /**
     * The date and time the cross-connect was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     * Example: `2016-08-25T21:10:29.600Z`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
