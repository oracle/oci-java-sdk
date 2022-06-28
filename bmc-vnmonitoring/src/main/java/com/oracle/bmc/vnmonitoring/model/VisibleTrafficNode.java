/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * Defines the configuration of a traffic node that is visible to the user.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = VisibleTrafficNode.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class VisibleTrafficNode extends TrafficNode {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("egressTraffic")
        private EgressTrafficSpec egressTraffic;

        public Builder egressTraffic(EgressTrafficSpec egressTraffic) {
            this.egressTraffic = egressTraffic;
            this.__explicitlySet__.add("egressTraffic");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nextHopRoutingAction")
        private RoutingAction nextHopRoutingAction;

        public Builder nextHopRoutingAction(RoutingAction nextHopRoutingAction) {
            this.nextHopRoutingAction = nextHopRoutingAction;
            this.__explicitlySet__.add("nextHopRoutingAction");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("egressSecurityAction")
        private SecurityAction egressSecurityAction;

        public Builder egressSecurityAction(SecurityAction egressSecurityAction) {
            this.egressSecurityAction = egressSecurityAction;
            this.__explicitlySet__.add("egressSecurityAction");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ingressSecurityAction")
        private SecurityAction ingressSecurityAction;

        public Builder ingressSecurityAction(SecurityAction ingressSecurityAction) {
            this.ingressSecurityAction = ingressSecurityAction;
            this.__explicitlySet__.add("ingressSecurityAction");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the OCI entity that
         * represents the traffic node (Instance, GW, LB, etc.).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("entityId")
        private String entityId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the OCI entity that
         * represents the traffic node (Instance, GW, LB, etc.).
         *
         * @param entityId the value to set
         * @return this builder
         **/
        public Builder entityId(String entityId) {
            this.entityId = entityId;
            this.__explicitlySet__.add("entityId");
            return this;
        }
        /**
         * Describes how the traffic was transformed. For example, if an address is translated by a NAT GW,
         * the string will describe the translation: 'SNAT: 10.0.0.1->204.0.0.1'
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("transformationDescription")
        private String transformationDescription;

        /**
         * Describes how the traffic was transformed. For example, if an address is translated by a NAT GW,
         * the string will describe the translation: 'SNAT: 10.0.0.1->204.0.0.1'
         *
         * @param transformationDescription the value to set
         * @return this builder
         **/
        public Builder transformationDescription(String transformationDescription) {
            this.transformationDescription = transformationDescription;
            this.__explicitlySet__.add("transformationDescription");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VisibleTrafficNode build() {
            VisibleTrafficNode __instance__ =
                    new VisibleTrafficNode(
                            egressTraffic,
                            nextHopRoutingAction,
                            egressSecurityAction,
                            ingressSecurityAction,
                            entityId,
                            transformationDescription);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VisibleTrafficNode o) {
            Builder copiedBuilder =
                    egressTraffic(o.getEgressTraffic())
                            .nextHopRoutingAction(o.getNextHopRoutingAction())
                            .egressSecurityAction(o.getEgressSecurityAction())
                            .ingressSecurityAction(o.getIngressSecurityAction())
                            .entityId(o.getEntityId())
                            .transformationDescription(o.getTransformationDescription());

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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @Deprecated
    public VisibleTrafficNode(
            EgressTrafficSpec egressTraffic,
            RoutingAction nextHopRoutingAction,
            SecurityAction egressSecurityAction,
            SecurityAction ingressSecurityAction,
            String entityId,
            String transformationDescription) {
        super(egressTraffic, nextHopRoutingAction, egressSecurityAction, ingressSecurityAction);
        this.entityId = entityId;
        this.transformationDescription = transformationDescription;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the OCI entity that
     * represents the traffic node (Instance, GW, LB, etc.).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityId")
    private final String entityId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the OCI entity that
     * represents the traffic node (Instance, GW, LB, etc.).
     *
     * @return the value
     **/
    public String getEntityId() {
        return entityId;
    }

    /**
     * Describes how the traffic was transformed. For example, if an address is translated by a NAT GW,
     * the string will describe the translation: 'SNAT: 10.0.0.1->204.0.0.1'
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("transformationDescription")
    private final String transformationDescription;

    /**
     * Describes how the traffic was transformed. For example, if an address is translated by a NAT GW,
     * the string will describe the translation: 'SNAT: 10.0.0.1->204.0.0.1'
     *
     * @return the value
     **/
    public String getTransformationDescription() {
        return transformationDescription;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("VisibleTrafficNode(");
        sb.append("super=").append(super.toString());
        sb.append(", entityId=").append(String.valueOf(this.entityId));
        sb.append(", transformationDescription=")
                .append(String.valueOf(this.transformationDescription));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VisibleTrafficNode)) {
            return false;
        }

        VisibleTrafficNode other = (VisibleTrafficNode) o;
        return java.util.Objects.equals(this.entityId, other.entityId)
                && java.util.Objects.equals(
                        this.transformationDescription, other.transformationDescription)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.entityId == null ? 43 : this.entityId.hashCode());
        result =
                (result * PRIME)
                        + (this.transformationDescription == null
                                ? 43
                                : this.transformationDescription.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
