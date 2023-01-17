/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * The {@code InstanceConsoleConnection} API provides you with console access to Compute instances,
 * enabling you to troubleshoot malfunctioning instances remotely.
 *
 * <p>For more information about instance console connections, see [Troubleshooting Instances Using
 * Instance Console
 * Connections](https://docs.cloud.oracle.com/iaas/Content/Compute/References/serialconsole.htm).
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = InstanceConsoleConnection.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class InstanceConsoleConnection
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "connectionString",
        "definedTags",
        "fingerprint",
        "freeformTags",
        "id",
        "instanceId",
        "lifecycleState",
        "serviceHostKeyFingerprint",
        "vncConnectionString"
    })
    public InstanceConsoleConnection(
            String compartmentId,
            String connectionString,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String fingerprint,
            java.util.Map<String, String> freeformTags,
            String id,
            String instanceId,
            LifecycleState lifecycleState,
            String serviceHostKeyFingerprint,
            String vncConnectionString) {
        super();
        this.compartmentId = compartmentId;
        this.connectionString = connectionString;
        this.definedTags = definedTags;
        this.fingerprint = fingerprint;
        this.freeformTags = freeformTags;
        this.id = id;
        this.instanceId = instanceId;
        this.lifecycleState = lifecycleState;
        this.serviceHostKeyFingerprint = serviceHostKeyFingerprint;
        this.vncConnectionString = vncConnectionString;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the compartment to contain the console connection. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment to contain the console connection.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The SSH connection string for the console connection. */
        @com.fasterxml.jackson.annotation.JsonProperty("connectionString")
        private String connectionString;

        /**
         * The SSH connection string for the console connection.
         *
         * @param connectionString the value to set
         * @return this builder
         */
        public Builder connectionString(String connectionString) {
            this.connectionString = connectionString;
            this.__explicitlySet__.add("connectionString");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /** The SSH public key's fingerprint for client authentication to the console connection. */
        @com.fasterxml.jackson.annotation.JsonProperty("fingerprint")
        private String fingerprint;

        /**
         * The SSH public key's fingerprint for client authentication to the console connection.
         *
         * @param fingerprint the value to set
         * @return this builder
         */
        public Builder fingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
            this.__explicitlySet__.add("fingerprint");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /** The OCID of the console connection. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the console connection.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The OCID of the instance the console connection connects to. */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
        private String instanceId;

        /**
         * The OCID of the instance the console connection connects to.
         *
         * @param instanceId the value to set
         * @return this builder
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            this.__explicitlySet__.add("instanceId");
            return this;
        }
        /** The current state of the console connection. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the console connection.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** The SSH public key's fingerprint for the console connection service host. */
        @com.fasterxml.jackson.annotation.JsonProperty("serviceHostKeyFingerprint")
        private String serviceHostKeyFingerprint;

        /**
         * The SSH public key's fingerprint for the console connection service host.
         *
         * @param serviceHostKeyFingerprint the value to set
         * @return this builder
         */
        public Builder serviceHostKeyFingerprint(String serviceHostKeyFingerprint) {
            this.serviceHostKeyFingerprint = serviceHostKeyFingerprint;
            this.__explicitlySet__.add("serviceHostKeyFingerprint");
            return this;
        }
        /**
         * The SSH connection string for the SSH tunnel used to connect to the console connection
         * over VNC.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vncConnectionString")
        private String vncConnectionString;

        /**
         * The SSH connection string for the SSH tunnel used to connect to the console connection
         * over VNC.
         *
         * @param vncConnectionString the value to set
         * @return this builder
         */
        public Builder vncConnectionString(String vncConnectionString) {
            this.vncConnectionString = vncConnectionString;
            this.__explicitlySet__.add("vncConnectionString");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InstanceConsoleConnection build() {
            InstanceConsoleConnection model =
                    new InstanceConsoleConnection(
                            this.compartmentId,
                            this.connectionString,
                            this.definedTags,
                            this.fingerprint,
                            this.freeformTags,
                            this.id,
                            this.instanceId,
                            this.lifecycleState,
                            this.serviceHostKeyFingerprint,
                            this.vncConnectionString);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstanceConsoleConnection model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("connectionString")) {
                this.connectionString(model.getConnectionString());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("fingerprint")) {
                this.fingerprint(model.getFingerprint());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("instanceId")) {
                this.instanceId(model.getInstanceId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("serviceHostKeyFingerprint")) {
                this.serviceHostKeyFingerprint(model.getServiceHostKeyFingerprint());
            }
            if (model.wasPropertyExplicitlySet("vncConnectionString")) {
                this.vncConnectionString(model.getVncConnectionString());
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

    /** The OCID of the compartment to contain the console connection. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment to contain the console connection.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The SSH connection string for the console connection. */
    @com.fasterxml.jackson.annotation.JsonProperty("connectionString")
    private final String connectionString;

    /**
     * The SSH connection string for the console connection.
     *
     * @return the value
     */
    public String getConnectionString() {
        return connectionString;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /** The SSH public key's fingerprint for client authentication to the console connection. */
    @com.fasterxml.jackson.annotation.JsonProperty("fingerprint")
    private final String fingerprint;

    /**
     * The SSH public key's fingerprint for client authentication to the console connection.
     *
     * @return the value
     */
    public String getFingerprint() {
        return fingerprint;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /** The OCID of the console connection. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the console connection.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The OCID of the instance the console connection connects to. */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
    private final String instanceId;

    /**
     * The OCID of the instance the console connection connects to.
     *
     * @return the value
     */
    public String getInstanceId() {
        return instanceId;
    }

    /** The current state of the console connection. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Active("ACTIVE"),
        Creating("CREATING"),
        Deleted("DELETED"),
        Deleting("DELETING"),
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
    /** The current state of the console connection. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the console connection.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** The SSH public key's fingerprint for the console connection service host. */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceHostKeyFingerprint")
    private final String serviceHostKeyFingerprint;

    /**
     * The SSH public key's fingerprint for the console connection service host.
     *
     * @return the value
     */
    public String getServiceHostKeyFingerprint() {
        return serviceHostKeyFingerprint;
    }

    /**
     * The SSH connection string for the SSH tunnel used to connect to the console connection over
     * VNC.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vncConnectionString")
    private final String vncConnectionString;

    /**
     * The SSH connection string for the SSH tunnel used to connect to the console connection over
     * VNC.
     *
     * @return the value
     */
    public String getVncConnectionString() {
        return vncConnectionString;
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
        sb.append("InstanceConsoleConnection(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", connectionString=").append(String.valueOf(this.connectionString));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", fingerprint=").append(String.valueOf(this.fingerprint));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", instanceId=").append(String.valueOf(this.instanceId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", serviceHostKeyFingerprint=")
                .append(String.valueOf(this.serviceHostKeyFingerprint));
        sb.append(", vncConnectionString=").append(String.valueOf(this.vncConnectionString));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InstanceConsoleConnection)) {
            return false;
        }

        InstanceConsoleConnection other = (InstanceConsoleConnection) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.connectionString, other.connectionString)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.fingerprint, other.fingerprint)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.instanceId, other.instanceId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(
                        this.serviceHostKeyFingerprint, other.serviceHostKeyFingerprint)
                && java.util.Objects.equals(this.vncConnectionString, other.vncConnectionString)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionString == null ? 43 : this.connectionString.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.fingerprint == null ? 43 : this.fingerprint.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.instanceId == null ? 43 : this.instanceId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.serviceHostKeyFingerprint == null
                                ? 43
                                : this.serviceHostKeyFingerprint.hashCode());
        result =
                (result * PRIME)
                        + (this.vncConnectionString == null
                                ? 43
                                : this.vncConnectionString.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
