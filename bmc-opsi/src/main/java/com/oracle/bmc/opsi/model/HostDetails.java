/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Partial information about a host which includes id, name, type. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = HostDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class HostDetails extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "hostName",
        "hostDisplayName",
        "platformType",
        "agentIdentifier"
    })
    public HostDetails(
            String id,
            String compartmentId,
            String hostName,
            String hostDisplayName,
            PlatformType platformType,
            String agentIdentifier) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.hostName = hostName;
        this.hostDisplayName = hostDisplayName;
        this.platformType = platformType;
        this.agentIdentifier = agentIdentifier;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the host.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the host.
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
         * of the compartment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The host name. The host name is unique amongst the hosts managed by the same management
         * agent.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("hostName")
        private String hostName;

        /**
         * The host name. The host name is unique amongst the hosts managed by the same management
         * agent.
         *
         * @param hostName the value to set
         * @return this builder
         */
        public Builder hostName(String hostName) {
            this.hostName = hostName;
            this.__explicitlySet__.add("hostName");
            return this;
        }
        /** The user-friendly name for the host. The name does not have to be unique. */
        @com.fasterxml.jackson.annotation.JsonProperty("hostDisplayName")
        private String hostDisplayName;

        /**
         * The user-friendly name for the host. The name does not have to be unique.
         *
         * @param hostDisplayName the value to set
         * @return this builder
         */
        public Builder hostDisplayName(String hostDisplayName) {
            this.hostDisplayName = hostDisplayName;
            this.__explicitlySet__.add("hostDisplayName");
            return this;
        }
        /**
         * Platform type. Supported platformType(s) for MACS-managed external host insight: [LINUX].
         * Supported platformType(s) for MACS-managed cloud host insight: [LINUX]. Supported
         * platformType(s) for EM-managed external host insight: [LINUX, SOLARIS, SUNOS, ZLINUX].
         */
        @com.fasterxml.jackson.annotation.JsonProperty("platformType")
        private PlatformType platformType;

        /**
         * Platform type. Supported platformType(s) for MACS-managed external host insight: [LINUX].
         * Supported platformType(s) for MACS-managed cloud host insight: [LINUX]. Supported
         * platformType(s) for EM-managed external host insight: [LINUX, SOLARIS, SUNOS, ZLINUX].
         *
         * @param platformType the value to set
         * @return this builder
         */
        public Builder platformType(PlatformType platformType) {
            this.platformType = platformType;
            this.__explicitlySet__.add("platformType");
            return this;
        }
        /** The identifier of the agent. */
        @com.fasterxml.jackson.annotation.JsonProperty("agentIdentifier")
        private String agentIdentifier;

        /**
         * The identifier of the agent.
         *
         * @param agentIdentifier the value to set
         * @return this builder
         */
        public Builder agentIdentifier(String agentIdentifier) {
            this.agentIdentifier = agentIdentifier;
            this.__explicitlySet__.add("agentIdentifier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HostDetails build() {
            HostDetails model =
                    new HostDetails(
                            this.id,
                            this.compartmentId,
                            this.hostName,
                            this.hostDisplayName,
                            this.platformType,
                            this.agentIdentifier);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HostDetails model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("hostName")) {
                this.hostName(model.getHostName());
            }
            if (model.wasPropertyExplicitlySet("hostDisplayName")) {
                this.hostDisplayName(model.getHostDisplayName());
            }
            if (model.wasPropertyExplicitlySet("platformType")) {
                this.platformType(model.getPlatformType());
            }
            if (model.wasPropertyExplicitlySet("agentIdentifier")) {
                this.agentIdentifier(model.getAgentIdentifier());
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
     * the host.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the host.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The host name. The host name is unique amongst the hosts managed by the same management
     * agent.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hostName")
    private final String hostName;

    /**
     * The host name. The host name is unique amongst the hosts managed by the same management
     * agent.
     *
     * @return the value
     */
    public String getHostName() {
        return hostName;
    }

    /** The user-friendly name for the host. The name does not have to be unique. */
    @com.fasterxml.jackson.annotation.JsonProperty("hostDisplayName")
    private final String hostDisplayName;

    /**
     * The user-friendly name for the host. The name does not have to be unique.
     *
     * @return the value
     */
    public String getHostDisplayName() {
        return hostDisplayName;
    }

    /**
     * Platform type. Supported platformType(s) for MACS-managed external host insight: [LINUX].
     * Supported platformType(s) for MACS-managed cloud host insight: [LINUX]. Supported
     * platformType(s) for EM-managed external host insight: [LINUX, SOLARIS, SUNOS, ZLINUX].
     */
    public enum PlatformType implements com.oracle.bmc.http.internal.BmcEnum {
        Linux("LINUX"),
        Solaris("SOLARIS"),
        Sunos("SUNOS"),
        Zlinux("ZLINUX"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PlatformType.class);

        private final String value;
        private static java.util.Map<String, PlatformType> map;

        static {
            map = new java.util.HashMap<>();
            for (PlatformType v : PlatformType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PlatformType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PlatformType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PlatformType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Platform type. Supported platformType(s) for MACS-managed external host insight: [LINUX].
     * Supported platformType(s) for MACS-managed cloud host insight: [LINUX]. Supported
     * platformType(s) for EM-managed external host insight: [LINUX, SOLARIS, SUNOS, ZLINUX].
     */
    @com.fasterxml.jackson.annotation.JsonProperty("platformType")
    private final PlatformType platformType;

    /**
     * Platform type. Supported platformType(s) for MACS-managed external host insight: [LINUX].
     * Supported platformType(s) for MACS-managed cloud host insight: [LINUX]. Supported
     * platformType(s) for EM-managed external host insight: [LINUX, SOLARIS, SUNOS, ZLINUX].
     *
     * @return the value
     */
    public PlatformType getPlatformType() {
        return platformType;
    }

    /** The identifier of the agent. */
    @com.fasterxml.jackson.annotation.JsonProperty("agentIdentifier")
    private final String agentIdentifier;

    /**
     * The identifier of the agent.
     *
     * @return the value
     */
    public String getAgentIdentifier() {
        return agentIdentifier;
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
        sb.append("HostDetails(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", hostName=").append(String.valueOf(this.hostName));
        sb.append(", hostDisplayName=").append(String.valueOf(this.hostDisplayName));
        sb.append(", platformType=").append(String.valueOf(this.platformType));
        sb.append(", agentIdentifier=").append(String.valueOf(this.agentIdentifier));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HostDetails)) {
            return false;
        }

        HostDetails other = (HostDetails) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.hostName, other.hostName)
                && java.util.Objects.equals(this.hostDisplayName, other.hostDisplayName)
                && java.util.Objects.equals(this.platformType, other.platformType)
                && java.util.Objects.equals(this.agentIdentifier, other.agentIdentifier)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.hostName == null ? 43 : this.hostName.hashCode());
        result =
                (result * PRIME)
                        + (this.hostDisplayName == null ? 43 : this.hostDisplayName.hashCode());
        result = (result * PRIME) + (this.platformType == null ? 43 : this.platformType.hashCode());
        result =
                (result * PRIME)
                        + (this.agentIdentifier == null ? 43 : this.agentIdentifier.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
