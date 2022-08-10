/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.model;

/**
 * The endpoint details for a private endpoint.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DpEndpointFromPrivateDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DpEndpointFromPrivateDetails extends DpEndpointDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
        private String modelVersion;

        public Builder modelVersion(String modelVersion) {
            this.modelVersion = modelVersion;
            this.__explicitlySet__.add("modelVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentRef")
        private ParentReference parentRef;

        public Builder parentRef(ParentReference parentRef) {
            this.parentRef = parentRef;
            this.__explicitlySet__.add("parentRef");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectVersion")
        private Integer objectVersion;

        public Builder objectVersion(Integer objectVersion) {
            this.objectVersion = objectVersion;
            this.__explicitlySet__.add("objectVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
        private Integer objectStatus;

        public Builder objectStatus(Integer objectStatus) {
            this.objectStatus = objectStatus;
            this.__explicitlySet__.add("objectStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("identifier")
        private String identifier;

        public Builder identifier(String identifier) {
            this.identifier = identifier;
            this.__explicitlySet__.add("identifier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataAssets")
        private java.util.List<DataAsset> dataAssets;

        public Builder dataAssets(java.util.List<DataAsset> dataAssets) {
            this.dataAssets = dataAssets;
            this.__explicitlySet__.add("dataAssets");
            return this;
        }
        /**
         * The endpoint ID provided by control plane.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dcmsEndpointId")
        private String dcmsEndpointId;

        /**
         * The endpoint ID provided by control plane.
         * @param dcmsEndpointId the value to set
         * @return this builder
         **/
        public Builder dcmsEndpointId(String dcmsEndpointId) {
            this.dcmsEndpointId = dcmsEndpointId;
            this.__explicitlySet__.add("dcmsEndpointId");
            return this;
        }
        /**
         * The ocid of private endpoint resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("peId")
        private String peId;

        /**
         * The ocid of private endpoint resource.
         * @param peId the value to set
         * @return this builder
         **/
        public Builder peId(String peId) {
            this.peId = peId;
            this.__explicitlySet__.add("peId");
            return this;
        }
        /**
         * The compartmentId of private endpoint resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The compartmentId of private endpoint resource.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The IP address of dns proxy.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dnsProxyIp")
        private String dnsProxyIp;

        /**
         * The IP address of dns proxy.
         * @param dnsProxyIp the value to set
         * @return this builder
         **/
        public Builder dnsProxyIp(String dnsProxyIp) {
            this.dnsProxyIp = dnsProxyIp;
            this.__explicitlySet__.add("dnsProxyIp");
            return this;
        }
        /**
         * The ocid of private endpoint resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointIp")
        private String privateEndpointIp;

        /**
         * The ocid of private endpoint resource.
         * @param privateEndpointIp the value to set
         * @return this builder
         **/
        public Builder privateEndpointIp(String privateEndpointIp) {
            this.privateEndpointIp = privateEndpointIp;
            this.__explicitlySet__.add("privateEndpointIp");
            return this;
        }
        /**
         * Array of dns zones to be use during private endpoint resolution.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dnsZones")
        private java.util.List<String> dnsZones;

        /**
         * Array of dns zones to be use during private endpoint resolution.
         * @param dnsZones the value to set
         * @return this builder
         **/
        public Builder dnsZones(java.util.List<String> dnsZones) {
            this.dnsZones = dnsZones;
            this.__explicitlySet__.add("dnsZones");
            return this;
        }
        /**
         * Specifies the private endpoint state.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("state")
        private State state;

        /**
         * Specifies the private endpoint state.
         * @param state the value to set
         * @return this builder
         **/
        public Builder state(State state) {
            this.state = state;
            this.__explicitlySet__.add("state");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DpEndpointFromPrivateDetails build() {
            DpEndpointFromPrivateDetails model =
                    new DpEndpointFromPrivateDetails(
                            this.key,
                            this.modelVersion,
                            this.parentRef,
                            this.name,
                            this.description,
                            this.objectVersion,
                            this.objectStatus,
                            this.identifier,
                            this.dataAssets,
                            this.dcmsEndpointId,
                            this.peId,
                            this.compartmentId,
                            this.dnsProxyIp,
                            this.privateEndpointIp,
                            this.dnsZones,
                            this.state);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DpEndpointFromPrivateDetails model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("modelVersion")) {
                this.modelVersion(model.getModelVersion());
            }
            if (model.wasPropertyExplicitlySet("parentRef")) {
                this.parentRef(model.getParentRef());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("objectVersion")) {
                this.objectVersion(model.getObjectVersion());
            }
            if (model.wasPropertyExplicitlySet("objectStatus")) {
                this.objectStatus(model.getObjectStatus());
            }
            if (model.wasPropertyExplicitlySet("identifier")) {
                this.identifier(model.getIdentifier());
            }
            if (model.wasPropertyExplicitlySet("dataAssets")) {
                this.dataAssets(model.getDataAssets());
            }
            if (model.wasPropertyExplicitlySet("dcmsEndpointId")) {
                this.dcmsEndpointId(model.getDcmsEndpointId());
            }
            if (model.wasPropertyExplicitlySet("peId")) {
                this.peId(model.getPeId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("dnsProxyIp")) {
                this.dnsProxyIp(model.getDnsProxyIp());
            }
            if (model.wasPropertyExplicitlySet("privateEndpointIp")) {
                this.privateEndpointIp(model.getPrivateEndpointIp());
            }
            if (model.wasPropertyExplicitlySet("dnsZones")) {
                this.dnsZones(model.getDnsZones());
            }
            if (model.wasPropertyExplicitlySet("state")) {
                this.state(model.getState());
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

    @Deprecated
    public DpEndpointFromPrivateDetails(
            String key,
            String modelVersion,
            ParentReference parentRef,
            String name,
            String description,
            Integer objectVersion,
            Integer objectStatus,
            String identifier,
            java.util.List<DataAsset> dataAssets,
            String dcmsEndpointId,
            String peId,
            String compartmentId,
            String dnsProxyIp,
            String privateEndpointIp,
            java.util.List<String> dnsZones,
            State state) {
        super(
                key,
                modelVersion,
                parentRef,
                name,
                description,
                objectVersion,
                objectStatus,
                identifier,
                dataAssets);
        this.dcmsEndpointId = dcmsEndpointId;
        this.peId = peId;
        this.compartmentId = compartmentId;
        this.dnsProxyIp = dnsProxyIp;
        this.privateEndpointIp = privateEndpointIp;
        this.dnsZones = dnsZones;
        this.state = state;
    }

    /**
     * The endpoint ID provided by control plane.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dcmsEndpointId")
    private final String dcmsEndpointId;

    /**
     * The endpoint ID provided by control plane.
     * @return the value
     **/
    public String getDcmsEndpointId() {
        return dcmsEndpointId;
    }

    /**
     * The ocid of private endpoint resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("peId")
    private final String peId;

    /**
     * The ocid of private endpoint resource.
     * @return the value
     **/
    public String getPeId() {
        return peId;
    }

    /**
     * The compartmentId of private endpoint resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The compartmentId of private endpoint resource.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The IP address of dns proxy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dnsProxyIp")
    private final String dnsProxyIp;

    /**
     * The IP address of dns proxy.
     * @return the value
     **/
    public String getDnsProxyIp() {
        return dnsProxyIp;
    }

    /**
     * The ocid of private endpoint resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointIp")
    private final String privateEndpointIp;

    /**
     * The ocid of private endpoint resource.
     * @return the value
     **/
    public String getPrivateEndpointIp() {
        return privateEndpointIp;
    }

    /**
     * Array of dns zones to be use during private endpoint resolution.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dnsZones")
    private final java.util.List<String> dnsZones;

    /**
     * Array of dns zones to be use during private endpoint resolution.
     * @return the value
     **/
    public java.util.List<String> getDnsZones() {
        return dnsZones;
    }

    /**
     * Specifies the private endpoint state.
     **/
    public enum State {
        Active("ACTIVE"),
        Inactive("INACTIVE"),
        ;

        private final String value;
        private static java.util.Map<String, State> map;

        static {
            map = new java.util.HashMap<>();
            for (State v : State.values()) {
                map.put(v.getValue(), v);
            }
        }

        State(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static State create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid State: " + key);
        }
    };
    /**
     * Specifies the private endpoint state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("state")
    private final State state;

    /**
     * Specifies the private endpoint state.
     * @return the value
     **/
    public State getState() {
        return state;
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
        sb.append("DpEndpointFromPrivateDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", dcmsEndpointId=").append(String.valueOf(this.dcmsEndpointId));
        sb.append(", peId=").append(String.valueOf(this.peId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", dnsProxyIp=").append(String.valueOf(this.dnsProxyIp));
        sb.append(", privateEndpointIp=").append(String.valueOf(this.privateEndpointIp));
        sb.append(", dnsZones=").append(String.valueOf(this.dnsZones));
        sb.append(", state=").append(String.valueOf(this.state));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DpEndpointFromPrivateDetails)) {
            return false;
        }

        DpEndpointFromPrivateDetails other = (DpEndpointFromPrivateDetails) o;
        return java.util.Objects.equals(this.dcmsEndpointId, other.dcmsEndpointId)
                && java.util.Objects.equals(this.peId, other.peId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.dnsProxyIp, other.dnsProxyIp)
                && java.util.Objects.equals(this.privateEndpointIp, other.privateEndpointIp)
                && java.util.Objects.equals(this.dnsZones, other.dnsZones)
                && java.util.Objects.equals(this.state, other.state)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.dcmsEndpointId == null ? 43 : this.dcmsEndpointId.hashCode());
        result = (result * PRIME) + (this.peId == null ? 43 : this.peId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.dnsProxyIp == null ? 43 : this.dnsProxyIp.hashCode());
        result =
                (result * PRIME)
                        + (this.privateEndpointIp == null ? 43 : this.privateEndpointIp.hashCode());
        result = (result * PRIME) + (this.dnsZones == null ? 43 : this.dnsZones.hashCode());
        result = (result * PRIME) + (this.state == null ? 43 : this.state.hashCode());
        return result;
    }
}
