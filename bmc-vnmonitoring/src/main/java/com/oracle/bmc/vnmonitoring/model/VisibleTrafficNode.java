/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * Defines the configuration of a traffic node that is visible to the user. <br>
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
        builder = VisibleTrafficNode.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
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

        @com.fasterxml.jackson.annotation.JsonProperty("zprEgressSecurityAction")
        private SecurityAction zprEgressSecurityAction;

        public Builder zprEgressSecurityAction(SecurityAction zprEgressSecurityAction) {
            this.zprEgressSecurityAction = zprEgressSecurityAction;
            this.__explicitlySet__.add("zprEgressSecurityAction");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("zprIngressSecurityAction")
        private SecurityAction zprIngressSecurityAction;

        public Builder zprIngressSecurityAction(SecurityAction zprIngressSecurityAction) {
            this.zprIngressSecurityAction = zprIngressSecurityAction;
            this.__explicitlySet__.add("zprIngressSecurityAction");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * OCI entity that represents the traffic node (Instance, GW, LB, etc.).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("entityId")
        private String entityId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * OCI entity that represents the traffic node (Instance, GW, LB, etc.).
         *
         * @param entityId the value to set
         * @return this builder
         */
        public Builder entityId(String entityId) {
            this.entityId = entityId;
            this.__explicitlySet__.add("entityId");
            return this;
        }
        /**
         * Describes how the traffic was transformed. For example, if an address is translated by a
         * NAT GW, the string will describe the translation: 'SNAT: 10.0.0.1->204.0.0.1'
         */
        @com.fasterxml.jackson.annotation.JsonProperty("transformationDescription")
        private String transformationDescription;

        /**
         * Describes how the traffic was transformed. For example, if an address is translated by a
         * NAT GW, the string will describe the translation: 'SNAT: 10.0.0.1->204.0.0.1'
         *
         * @param transformationDescription the value to set
         * @return this builder
         */
        public Builder transformationDescription(String transformationDescription) {
            this.transformationDescription = transformationDescription;
            this.__explicitlySet__.add("transformationDescription");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VisibleTrafficNode build() {
            VisibleTrafficNode model =
                    new VisibleTrafficNode(
                            this.egressTraffic,
                            this.nextHopRoutingAction,
                            this.egressSecurityAction,
                            this.ingressSecurityAction,
                            this.zprEgressSecurityAction,
                            this.zprIngressSecurityAction,
                            this.entityId,
                            this.transformationDescription);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VisibleTrafficNode model) {
            if (model.wasPropertyExplicitlySet("egressTraffic")) {
                this.egressTraffic(model.getEgressTraffic());
            }
            if (model.wasPropertyExplicitlySet("nextHopRoutingAction")) {
                this.nextHopRoutingAction(model.getNextHopRoutingAction());
            }
            if (model.wasPropertyExplicitlySet("egressSecurityAction")) {
                this.egressSecurityAction(model.getEgressSecurityAction());
            }
            if (model.wasPropertyExplicitlySet("ingressSecurityAction")) {
                this.ingressSecurityAction(model.getIngressSecurityAction());
            }
            if (model.wasPropertyExplicitlySet("zprEgressSecurityAction")) {
                this.zprEgressSecurityAction(model.getZprEgressSecurityAction());
            }
            if (model.wasPropertyExplicitlySet("zprIngressSecurityAction")) {
                this.zprIngressSecurityAction(model.getZprIngressSecurityAction());
            }
            if (model.wasPropertyExplicitlySet("entityId")) {
                this.entityId(model.getEntityId());
            }
            if (model.wasPropertyExplicitlySet("transformationDescription")) {
                this.transformationDescription(model.getTransformationDescription());
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

    @Deprecated
    public VisibleTrafficNode(
            EgressTrafficSpec egressTraffic,
            RoutingAction nextHopRoutingAction,
            SecurityAction egressSecurityAction,
            SecurityAction ingressSecurityAction,
            SecurityAction zprEgressSecurityAction,
            SecurityAction zprIngressSecurityAction,
            String entityId,
            String transformationDescription) {
        super(
                egressTraffic,
                nextHopRoutingAction,
                egressSecurityAction,
                ingressSecurityAction,
                zprEgressSecurityAction,
                zprIngressSecurityAction);
        this.entityId = entityId;
        this.transformationDescription = transformationDescription;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the OCI
     * entity that represents the traffic node (Instance, GW, LB, etc.).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("entityId")
    private final String entityId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the OCI
     * entity that represents the traffic node (Instance, GW, LB, etc.).
     *
     * @return the value
     */
    public String getEntityId() {
        return entityId;
    }

    /**
     * Describes how the traffic was transformed. For example, if an address is translated by a NAT
     * GW, the string will describe the translation: 'SNAT: 10.0.0.1->204.0.0.1'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("transformationDescription")
    private final String transformationDescription;

    /**
     * Describes how the traffic was transformed. For example, if an address is translated by a NAT
     * GW, the string will describe the translation: 'SNAT: 10.0.0.1->204.0.0.1'
     *
     * @return the value
     */
    public String getTransformationDescription() {
        return transformationDescription;
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
        sb.append("VisibleTrafficNode(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", entityId=").append(String.valueOf(this.entityId));
        sb.append(", transformationDescription=")
                .append(String.valueOf(this.transformationDescription));
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
                && super.equals(other);
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
        return result;
    }
}
