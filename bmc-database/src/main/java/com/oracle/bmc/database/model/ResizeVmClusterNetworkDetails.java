/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details of Db server network nodes to extend or shrink the VM cluster network. Applies to Exadata Cloud@Customer
 * instances only.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ResizeVmClusterNetworkDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ResizeVmClusterNetworkDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"action", "vmNetworks"})
    public ResizeVmClusterNetworkDetails(
            Action action, java.util.List<VmNetworkDetails> vmNetworks) {
        super();
        this.action = action;
        this.vmNetworks = vmNetworks;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Actions that can be performed on the VM cluster network.
         * ADD_DBSERVER_NETWORK - Provide Db server network details of network nodes to be added to the VM cluster network.
         * REMOVE_DBSERVER_NETWORK - Provide Db server network details of network nodes to be removed from the VM cluster network.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private Action action;

        /**
         * Actions that can be performed on the VM cluster network.
         * ADD_DBSERVER_NETWORK - Provide Db server network details of network nodes to be added to the VM cluster network.
         * REMOVE_DBSERVER_NETWORK - Provide Db server network details of network nodes to be removed from the VM cluster network.
         *
         * @param action the value to set
         * @return this builder
         **/
        public Builder action(Action action) {
            this.action = action;
            this.__explicitlySet__.add("action");
            return this;
        }
        /**
         * Details of the client and backup networks.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vmNetworks")
        private java.util.List<VmNetworkDetails> vmNetworks;

        /**
         * Details of the client and backup networks.
         * @param vmNetworks the value to set
         * @return this builder
         **/
        public Builder vmNetworks(java.util.List<VmNetworkDetails> vmNetworks) {
            this.vmNetworks = vmNetworks;
            this.__explicitlySet__.add("vmNetworks");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResizeVmClusterNetworkDetails build() {
            ResizeVmClusterNetworkDetails model =
                    new ResizeVmClusterNetworkDetails(this.action, this.vmNetworks);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResizeVmClusterNetworkDetails model) {
            if (model.wasPropertyExplicitlySet("action")) {
                this.action(model.getAction());
            }
            if (model.wasPropertyExplicitlySet("vmNetworks")) {
                this.vmNetworks(model.getVmNetworks());
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
     * Actions that can be performed on the VM cluster network.
     * ADD_DBSERVER_NETWORK - Provide Db server network details of network nodes to be added to the VM cluster network.
     * REMOVE_DBSERVER_NETWORK - Provide Db server network details of network nodes to be removed from the VM cluster network.
     *
     **/
    public enum Action {
        AddDbserverNetwork("ADD_DBSERVER_NETWORK"),
        RemoveDbserverNetwork("REMOVE_DBSERVER_NETWORK"),
        ;

        private final String value;
        private static java.util.Map<String, Action> map;

        static {
            map = new java.util.HashMap<>();
            for (Action v : Action.values()) {
                map.put(v.getValue(), v);
            }
        }

        Action(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Action create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Action: " + key);
        }
    };
    /**
     * Actions that can be performed on the VM cluster network.
     * ADD_DBSERVER_NETWORK - Provide Db server network details of network nodes to be added to the VM cluster network.
     * REMOVE_DBSERVER_NETWORK - Provide Db server network details of network nodes to be removed from the VM cluster network.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final Action action;

    /**
     * Actions that can be performed on the VM cluster network.
     * ADD_DBSERVER_NETWORK - Provide Db server network details of network nodes to be added to the VM cluster network.
     * REMOVE_DBSERVER_NETWORK - Provide Db server network details of network nodes to be removed from the VM cluster network.
     *
     * @return the value
     **/
    public Action getAction() {
        return action;
    }

    /**
     * Details of the client and backup networks.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vmNetworks")
    private final java.util.List<VmNetworkDetails> vmNetworks;

    /**
     * Details of the client and backup networks.
     * @return the value
     **/
    public java.util.List<VmNetworkDetails> getVmNetworks() {
        return vmNetworks;
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
        sb.append("ResizeVmClusterNetworkDetails(");
        sb.append("super=").append(super.toString());
        sb.append("action=").append(String.valueOf(this.action));
        sb.append(", vmNetworks=").append(String.valueOf(this.vmNetworks));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResizeVmClusterNetworkDetails)) {
            return false;
        }

        ResizeVmClusterNetworkDetails other = (ResizeVmClusterNetworkDetails) o;
        return java.util.Objects.equals(this.action, other.action)
                && java.util.Objects.equals(this.vmNetworks, other.vmNetworks)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result = (result * PRIME) + (this.vmNetworks == null ? 43 : this.vmNetworks.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
