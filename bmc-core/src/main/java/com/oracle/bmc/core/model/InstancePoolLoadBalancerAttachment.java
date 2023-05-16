/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Represents a load balancer that is attached to an instance pool. <br>
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
        builder = InstancePoolLoadBalancerAttachment.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class InstancePoolLoadBalancerAttachment
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "instancePoolId",
        "loadBalancerId",
        "backendSetName",
        "port",
        "vnicSelection",
        "lifecycleState"
    })
    public InstancePoolLoadBalancerAttachment(
            String id,
            String instancePoolId,
            String loadBalancerId,
            String backendSetName,
            Integer port,
            String vnicSelection,
            LifecycleState lifecycleState) {
        super();
        this.id = id;
        this.instancePoolId = instancePoolId;
        this.loadBalancerId = loadBalancerId;
        this.backendSetName = backendSetName;
        this.port = port;
        this.vnicSelection = vnicSelection;
        this.lifecycleState = lifecycleState;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the load balancer attachment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the load balancer attachment.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the instance pool of the load balancer attachment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("instancePoolId")
        private String instancePoolId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the instance pool of the load balancer attachment.
         *
         * @param instancePoolId the value to set
         * @return this builder
         */
        public Builder instancePoolId(String instancePoolId) {
            this.instancePoolId = instancePoolId;
            this.__explicitlySet__.add("instancePoolId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the load balancer attached to the instance pool.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("loadBalancerId")
        private String loadBalancerId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the load balancer attached to the instance pool.
         *
         * @param loadBalancerId the value to set
         * @return this builder
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            this.__explicitlySet__.add("loadBalancerId");
            return this;
        }
        /** The name of the backend set on the load balancer. */
        @com.fasterxml.jackson.annotation.JsonProperty("backendSetName")
        private String backendSetName;

        /**
         * The name of the backend set on the load balancer.
         *
         * @param backendSetName the value to set
         * @return this builder
         */
        public Builder backendSetName(String backendSetName) {
            this.backendSetName = backendSetName;
            this.__explicitlySet__.add("backendSetName");
            return this;
        }
        /** The port value used for the backends. */
        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        /**
         * The port value used for the backends.
         *
         * @param port the value to set
         * @return this builder
         */
        public Builder port(Integer port) {
            this.port = port;
            this.__explicitlySet__.add("port");
            return this;
        }
        /**
         * Indicates which VNIC on each instance in the instance pool should be used to associate
         * with the load balancer. Possible values are "PrimaryVnic" or the displayName of one of
         * the secondary VNICs on the instance configuration that is associated with the instance
         * pool.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vnicSelection")
        private String vnicSelection;

        /**
         * Indicates which VNIC on each instance in the instance pool should be used to associate
         * with the load balancer. Possible values are "PrimaryVnic" or the displayName of one of
         * the secondary VNICs on the instance configuration that is associated with the instance
         * pool.
         *
         * @param vnicSelection the value to set
         * @return this builder
         */
        public Builder vnicSelection(String vnicSelection) {
            this.vnicSelection = vnicSelection;
            this.__explicitlySet__.add("vnicSelection");
            return this;
        }
        /** The status of the interaction between the instance pool and the load balancer. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The status of the interaction between the instance pool and the load balancer.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InstancePoolLoadBalancerAttachment build() {
            InstancePoolLoadBalancerAttachment model =
                    new InstancePoolLoadBalancerAttachment(
                            this.id,
                            this.instancePoolId,
                            this.loadBalancerId,
                            this.backendSetName,
                            this.port,
                            this.vnicSelection,
                            this.lifecycleState);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstancePoolLoadBalancerAttachment model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("instancePoolId")) {
                this.instancePoolId(model.getInstancePoolId());
            }
            if (model.wasPropertyExplicitlySet("loadBalancerId")) {
                this.loadBalancerId(model.getLoadBalancerId());
            }
            if (model.wasPropertyExplicitlySet("backendSetName")) {
                this.backendSetName(model.getBackendSetName());
            }
            if (model.wasPropertyExplicitlySet("port")) {
                this.port(model.getPort());
            }
            if (model.wasPropertyExplicitlySet("vnicSelection")) {
                this.vnicSelection(model.getVnicSelection());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the load balancer attachment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the load balancer attachment.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the instance pool of the load balancer attachment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("instancePoolId")
    private final String instancePoolId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the instance pool of the load balancer attachment.
     *
     * @return the value
     */
    public String getInstancePoolId() {
        return instancePoolId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the load balancer attached to the instance pool.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("loadBalancerId")
    private final String loadBalancerId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the load balancer attached to the instance pool.
     *
     * @return the value
     */
    public String getLoadBalancerId() {
        return loadBalancerId;
    }

    /** The name of the backend set on the load balancer. */
    @com.fasterxml.jackson.annotation.JsonProperty("backendSetName")
    private final String backendSetName;

    /**
     * The name of the backend set on the load balancer.
     *
     * @return the value
     */
    public String getBackendSetName() {
        return backendSetName;
    }

    /** The port value used for the backends. */
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    private final Integer port;

    /**
     * The port value used for the backends.
     *
     * @return the value
     */
    public Integer getPort() {
        return port;
    }

    /**
     * Indicates which VNIC on each instance in the instance pool should be used to associate with
     * the load balancer. Possible values are "PrimaryVnic" or the displayName of one of the
     * secondary VNICs on the instance configuration that is associated with the instance pool.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vnicSelection")
    private final String vnicSelection;

    /**
     * Indicates which VNIC on each instance in the instance pool should be used to associate with
     * the load balancer. Possible values are "PrimaryVnic" or the displayName of one of the
     * secondary VNICs on the instance configuration that is associated with the instance pool.
     *
     * @return the value
     */
    public String getVnicSelection() {
        return vnicSelection;
    }

    /** The status of the interaction between the instance pool and the load balancer. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Attaching("ATTACHING"),
        Attached("ATTACHED"),
        Detaching("DETACHING"),
        Detached("DETACHED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

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
    /** The status of the interaction between the instance pool and the load balancer. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The status of the interaction between the instance pool and the load balancer.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
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
        sb.append("InstancePoolLoadBalancerAttachment(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", instancePoolId=").append(String.valueOf(this.instancePoolId));
        sb.append(", loadBalancerId=").append(String.valueOf(this.loadBalancerId));
        sb.append(", backendSetName=").append(String.valueOf(this.backendSetName));
        sb.append(", port=").append(String.valueOf(this.port));
        sb.append(", vnicSelection=").append(String.valueOf(this.vnicSelection));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InstancePoolLoadBalancerAttachment)) {
            return false;
        }

        InstancePoolLoadBalancerAttachment other = (InstancePoolLoadBalancerAttachment) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.instancePoolId, other.instancePoolId)
                && java.util.Objects.equals(this.loadBalancerId, other.loadBalancerId)
                && java.util.Objects.equals(this.backendSetName, other.backendSetName)
                && java.util.Objects.equals(this.port, other.port)
                && java.util.Objects.equals(this.vnicSelection, other.vnicSelection)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.instancePoolId == null ? 43 : this.instancePoolId.hashCode());
        result =
                (result * PRIME)
                        + (this.loadBalancerId == null ? 43 : this.loadBalancerId.hashCode());
        result =
                (result * PRIME)
                        + (this.backendSetName == null ? 43 : this.backendSetName.hashCode());
        result = (result * PRIME) + (this.port == null ? 43 : this.port.hashCode());
        result =
                (result * PRIME)
                        + (this.vnicSelection == null ? 43 : this.vnicSelection.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
