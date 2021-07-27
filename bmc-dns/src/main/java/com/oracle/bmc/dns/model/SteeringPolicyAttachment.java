/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.model;

/**
 * An attachment between a steering policy and a domain. An attachment constructs
 * DNS responses using its steering policy instead of the records at its defined domain.
 * Only records of the policy's covered rtype are blocked at the domain.
 * A domain can have a maximum of one attachment covering any given rtype.
 * <p>
 **Warning:** Oracle recommends that you avoid using any confidential information when you supply string values using the API.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SteeringPolicyAttachment.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class SteeringPolicyAttachment {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("steeringPolicyId")
        private String steeringPolicyId;

        public Builder steeringPolicyId(String steeringPolicyId) {
            this.steeringPolicyId = steeringPolicyId;
            this.__explicitlySet__.add("steeringPolicyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("zoneId")
        private String zoneId;

        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            this.__explicitlySet__.add("zoneId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("domainName")
        private String domainName;

        public Builder domainName(String domainName) {
            this.domainName = domainName;
            this.__explicitlySet__.add("domainName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rtypes")
        private java.util.List<String> rtypes;

        public Builder rtypes(java.util.List<String> rtypes) {
            this.rtypes = rtypes;
            this.__explicitlySet__.add("rtypes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("self")
        private String self;

        public Builder self(String self) {
            this.self = self;
            this.__explicitlySet__.add("self");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SteeringPolicyAttachment build() {
            SteeringPolicyAttachment __instance__ =
                    new SteeringPolicyAttachment(
                            steeringPolicyId,
                            zoneId,
                            domainName,
                            displayName,
                            rtypes,
                            compartmentId,
                            self,
                            id,
                            timeCreated,
                            lifecycleState);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SteeringPolicyAttachment o) {
            Builder copiedBuilder =
                    steeringPolicyId(o.getSteeringPolicyId())
                            .zoneId(o.getZoneId())
                            .domainName(o.getDomainName())
                            .displayName(o.getDisplayName())
                            .rtypes(o.getRtypes())
                            .compartmentId(o.getCompartmentId())
                            .self(o.getSelf())
                            .id(o.getId())
                            .timeCreated(o.getTimeCreated())
                            .lifecycleState(o.getLifecycleState());

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
     * The OCID of the attached steering policy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("steeringPolicyId")
    String steeringPolicyId;

    /**
     * The OCID of the attached zone.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("zoneId")
    String zoneId;

    /**
     * The attached domain within the attached zone.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("domainName")
    String domainName;

    /**
     * A user-friendly name for the steering policy attachment.
     * Does not have to be unique and can be changed.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The record types covered by the attachment at the domain. The set of record types is
     * determined by aggregating the record types from the answers defined in the steering
     * policy.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rtypes")
    java.util.List<String> rtypes;

    /**
     * The OCID of the compartment containing the steering policy attachment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The canonical absolute URL of the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("self")
    String self;

    /**
     * The OCID of the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The date and time the resource was created, expressed in RFC 3339 timestamp format.
     * <p>
     **Example:** {@code 2016-07-22T17:23:59:60Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;
    /**
     * The current state of the resource.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
        Creating("CREATING"),
        Active("ACTIVE"),
        Deleting("DELETING"),

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
     * The current state of the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
