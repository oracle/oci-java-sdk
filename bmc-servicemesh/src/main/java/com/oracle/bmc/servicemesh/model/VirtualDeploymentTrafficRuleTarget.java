/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicemesh.model;

/**
 * Traffic router target for a virtual service version.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210930")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = VirtualDeploymentTrafficRuleTarget.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class VirtualDeploymentTrafficRuleTarget extends TrafficRuleTarget {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("virtualDeploymentId")
        private String virtualDeploymentId;

        public Builder virtualDeploymentId(String virtualDeploymentId) {
            this.virtualDeploymentId = virtualDeploymentId;
            this.__explicitlySet__.add("virtualDeploymentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        public Builder port(Integer port) {
            this.port = port;
            this.__explicitlySet__.add("port");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("weight")
        private Integer weight;

        public Builder weight(Integer weight) {
            this.weight = weight;
            this.__explicitlySet__.add("weight");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VirtualDeploymentTrafficRuleTarget build() {
            VirtualDeploymentTrafficRuleTarget __instance__ =
                    new VirtualDeploymentTrafficRuleTarget(virtualDeploymentId, port, weight);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VirtualDeploymentTrafficRuleTarget o) {
            Builder copiedBuilder =
                    virtualDeploymentId(o.getVirtualDeploymentId())
                            .port(o.getPort())
                            .weight(o.getWeight());

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

    @Deprecated
    public VirtualDeploymentTrafficRuleTarget(
            String virtualDeploymentId, Integer port, Integer weight) {
        super();
        this.virtualDeploymentId = virtualDeploymentId;
        this.port = port;
        this.weight = weight;
    }

    /**
     * The OCID of the virtual deployment where the request will be routed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("virtualDeploymentId")
    String virtualDeploymentId;

    /**
     * Port on virtual deployment to target.
     * If port is missing, the rule will target all ports on the virtual deployment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    Integer port;

    /**
     * Weight of traffic target.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("weight")
    Integer weight;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
