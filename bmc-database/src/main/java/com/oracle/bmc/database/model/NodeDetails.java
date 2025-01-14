/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Node details associated with a network. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = NodeDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class NodeDetails extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "hostname",
        "ip",
        "vipHostname",
        "vip",
        "lifecycleState",
        "dbServerId"
    })
    public NodeDetails(
            String hostname,
            String ip,
            String vipHostname,
            String vip,
            LifecycleState lifecycleState,
            String dbServerId) {
        super();
        this.hostname = hostname;
        this.ip = ip;
        this.vipHostname = vipHostname;
        this.vip = vip;
        this.lifecycleState = lifecycleState;
        this.dbServerId = dbServerId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The node host name. */
        @com.fasterxml.jackson.annotation.JsonProperty("hostname")
        private String hostname;

        /**
         * The node host name.
         *
         * @param hostname the value to set
         * @return this builder
         */
        public Builder hostname(String hostname) {
            this.hostname = hostname;
            this.__explicitlySet__.add("hostname");
            return this;
        }
        /** The node IP address. */
        @com.fasterxml.jackson.annotation.JsonProperty("ip")
        private String ip;

        /**
         * The node IP address.
         *
         * @param ip the value to set
         * @return this builder
         */
        public Builder ip(String ip) {
            this.ip = ip;
            this.__explicitlySet__.add("ip");
            return this;
        }
        /** The node virtual IP (VIP) host name. */
        @com.fasterxml.jackson.annotation.JsonProperty("vipHostname")
        private String vipHostname;

        /**
         * The node virtual IP (VIP) host name.
         *
         * @param vipHostname the value to set
         * @return this builder
         */
        public Builder vipHostname(String vipHostname) {
            this.vipHostname = vipHostname;
            this.__explicitlySet__.add("vipHostname");
            return this;
        }
        /** The node virtual IP (VIP) address. */
        @com.fasterxml.jackson.annotation.JsonProperty("vip")
        private String vip;

        /**
         * The node virtual IP (VIP) address.
         *
         * @param vip the value to set
         * @return this builder
         */
        public Builder vip(String vip) {
            this.vip = vip;
            this.__explicitlySet__.add("vip");
            return this;
        }
        /**
         * The current state of the VM cluster network nodes. CREATING - The resource is being
         * created REQUIRES_VALIDATION - The resource is created and may not be usable until it is
         * validated. VALIDATING - The resource is being validated and not available to use.
         * VALIDATED - The resource is validated and is available for consumption by VM cluster.
         * VALIDATION_FAILED - The resource validation has failed and might require user input to be
         * corrected. UPDATING - The resource is being updated and not available to use. ALLOCATED -
         * The resource is currently being used by VM cluster. TERMINATING - The resource is being
         * deleted and not available to use. TERMINATED - The resource is deleted and unavailable.
         * FAILED - The resource is in a failed state due to validation or other errors.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the VM cluster network nodes. CREATING - The resource is being
         * created REQUIRES_VALIDATION - The resource is created and may not be usable until it is
         * validated. VALIDATING - The resource is being validated and not available to use.
         * VALIDATED - The resource is validated and is available for consumption by VM cluster.
         * VALIDATION_FAILED - The resource validation has failed and might require user input to be
         * corrected. UPDATING - The resource is being updated and not available to use. ALLOCATED -
         * The resource is currently being used by VM cluster. TERMINATING - The resource is being
         * deleted and not available to use. TERMINATED - The resource is deleted and unavailable.
         * FAILED - The resource is in a failed state due to validation or other errors.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** The Db server associated with the node. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbServerId")
        private String dbServerId;

        /**
         * The Db server associated with the node.
         *
         * @param dbServerId the value to set
         * @return this builder
         */
        public Builder dbServerId(String dbServerId) {
            this.dbServerId = dbServerId;
            this.__explicitlySet__.add("dbServerId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NodeDetails build() {
            NodeDetails model =
                    new NodeDetails(
                            this.hostname,
                            this.ip,
                            this.vipHostname,
                            this.vip,
                            this.lifecycleState,
                            this.dbServerId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NodeDetails model) {
            if (model.wasPropertyExplicitlySet("hostname")) {
                this.hostname(model.getHostname());
            }
            if (model.wasPropertyExplicitlySet("ip")) {
                this.ip(model.getIp());
            }
            if (model.wasPropertyExplicitlySet("vipHostname")) {
                this.vipHostname(model.getVipHostname());
            }
            if (model.wasPropertyExplicitlySet("vip")) {
                this.vip(model.getVip());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("dbServerId")) {
                this.dbServerId(model.getDbServerId());
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

    /** The node host name. */
    @com.fasterxml.jackson.annotation.JsonProperty("hostname")
    private final String hostname;

    /**
     * The node host name.
     *
     * @return the value
     */
    public String getHostname() {
        return hostname;
    }

    /** The node IP address. */
    @com.fasterxml.jackson.annotation.JsonProperty("ip")
    private final String ip;

    /**
     * The node IP address.
     *
     * @return the value
     */
    public String getIp() {
        return ip;
    }

    /** The node virtual IP (VIP) host name. */
    @com.fasterxml.jackson.annotation.JsonProperty("vipHostname")
    private final String vipHostname;

    /**
     * The node virtual IP (VIP) host name.
     *
     * @return the value
     */
    public String getVipHostname() {
        return vipHostname;
    }

    /** The node virtual IP (VIP) address. */
    @com.fasterxml.jackson.annotation.JsonProperty("vip")
    private final String vip;

    /**
     * The node virtual IP (VIP) address.
     *
     * @return the value
     */
    public String getVip() {
        return vip;
    }

    /**
     * The current state of the VM cluster network nodes. CREATING - The resource is being created
     * REQUIRES_VALIDATION - The resource is created and may not be usable until it is validated.
     * VALIDATING - The resource is being validated and not available to use. VALIDATED - The
     * resource is validated and is available for consumption by VM cluster. VALIDATION_FAILED - The
     * resource validation has failed and might require user input to be corrected. UPDATING - The
     * resource is being updated and not available to use. ALLOCATED - The resource is currently
     * being used by VM cluster. TERMINATING - The resource is being deleted and not available to
     * use. TERMINATED - The resource is deleted and unavailable. FAILED - The resource is in a
     * failed state due to validation or other errors.
     */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        RequiresValidation("REQUIRES_VALIDATION"),
        Validating("VALIDATING"),
        Validated("VALIDATED"),
        ValidationFailed("VALIDATION_FAILED"),
        Updating("UPDATING"),
        Allocated("ALLOCATED"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),
        Failed("FAILED"),

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
    /**
     * The current state of the VM cluster network nodes. CREATING - The resource is being created
     * REQUIRES_VALIDATION - The resource is created and may not be usable until it is validated.
     * VALIDATING - The resource is being validated and not available to use. VALIDATED - The
     * resource is validated and is available for consumption by VM cluster. VALIDATION_FAILED - The
     * resource validation has failed and might require user input to be corrected. UPDATING - The
     * resource is being updated and not available to use. ALLOCATED - The resource is currently
     * being used by VM cluster. TERMINATING - The resource is being deleted and not available to
     * use. TERMINATED - The resource is deleted and unavailable. FAILED - The resource is in a
     * failed state due to validation or other errors.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the VM cluster network nodes. CREATING - The resource is being created
     * REQUIRES_VALIDATION - The resource is created and may not be usable until it is validated.
     * VALIDATING - The resource is being validated and not available to use. VALIDATED - The
     * resource is validated and is available for consumption by VM cluster. VALIDATION_FAILED - The
     * resource validation has failed and might require user input to be corrected. UPDATING - The
     * resource is being updated and not available to use. ALLOCATED - The resource is currently
     * being used by VM cluster. TERMINATING - The resource is being deleted and not available to
     * use. TERMINATED - The resource is deleted and unavailable. FAILED - The resource is in a
     * failed state due to validation or other errors.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** The Db server associated with the node. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbServerId")
    private final String dbServerId;

    /**
     * The Db server associated with the node.
     *
     * @return the value
     */
    public String getDbServerId() {
        return dbServerId;
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
        sb.append("NodeDetails(");
        sb.append("super=").append(super.toString());
        sb.append("hostname=").append(String.valueOf(this.hostname));
        sb.append(", ip=").append(String.valueOf(this.ip));
        sb.append(", vipHostname=").append(String.valueOf(this.vipHostname));
        sb.append(", vip=").append(String.valueOf(this.vip));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", dbServerId=").append(String.valueOf(this.dbServerId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NodeDetails)) {
            return false;
        }

        NodeDetails other = (NodeDetails) o;
        return java.util.Objects.equals(this.hostname, other.hostname)
                && java.util.Objects.equals(this.ip, other.ip)
                && java.util.Objects.equals(this.vipHostname, other.vipHostname)
                && java.util.Objects.equals(this.vip, other.vip)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.dbServerId, other.dbServerId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.hostname == null ? 43 : this.hostname.hashCode());
        result = (result * PRIME) + (this.ip == null ? 43 : this.ip.hashCode());
        result = (result * PRIME) + (this.vipHostname == null ? 43 : this.vipHostname.hashCode());
        result = (result * PRIME) + (this.vip == null ? 43 : this.vip.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.dbServerId == null ? 43 : this.dbServerId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
