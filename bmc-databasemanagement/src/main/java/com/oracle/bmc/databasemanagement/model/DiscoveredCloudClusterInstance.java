/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details of a cloud cluster instance discovered in a cloud DB system discovery run. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DiscoveredCloudClusterInstance.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "componentType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DiscoveredCloudClusterInstance extends DiscoveredCloudDbSystemComponent {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("componentId")
        private String componentId;

        public Builder componentId(String componentId) {
            this.componentId = componentId;
            this.__explicitlySet__.add("componentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("componentName")
        private String componentName;

        public Builder componentName(String componentName) {
            this.componentName = componentName;
            this.__explicitlySet__.add("componentName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbaasId")
        private String dbaasId;

        public Builder dbaasId(String dbaasId) {
            this.dbaasId = dbaasId;
            this.__explicitlySet__.add("dbaasId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isSelectedForMonitoring")
        private Boolean isSelectedForMonitoring;

        public Builder isSelectedForMonitoring(Boolean isSelectedForMonitoring) {
            this.isSelectedForMonitoring = isSelectedForMonitoring;
            this.__explicitlySet__.add("isSelectedForMonitoring");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("associatedComponents")
        private java.util.List<AssociatedCloudComponent> associatedComponents;

        public Builder associatedComponents(
                java.util.List<AssociatedCloudComponent> associatedComponents) {
            this.associatedComponents = associatedComponents;
            this.__explicitlySet__.add("associatedComponents");
            return this;
        }
        /** The name of the host on which the cluster instance is running. */
        @com.fasterxml.jackson.annotation.JsonProperty("hostName")
        private String hostName;

        /**
         * The name of the host on which the cluster instance is running.
         *
         * @param hostName the value to set
         * @return this builder
         */
        public Builder hostName(String hostName) {
            this.hostName = hostName;
            this.__explicitlySet__.add("hostName");
            return this;
        }
        /** The unique identifier of the Oracle cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("clusterId")
        private String clusterId;

        /**
         * The unique identifier of the Oracle cluster.
         *
         * @param clusterId the value to set
         * @return this builder
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            this.__explicitlySet__.add("clusterId");
            return this;
        }
        /** The role of the cluster node. */
        @com.fasterxml.jackson.annotation.JsonProperty("nodeRole")
        private NodeRole nodeRole;

        /**
         * The role of the cluster node.
         *
         * @param nodeRole the value to set
         * @return this builder
         */
        public Builder nodeRole(NodeRole nodeRole) {
            this.nodeRole = nodeRole;
            this.__explicitlySet__.add("nodeRole");
            return this;
        }
        /** The Oracle base location of Cluster Ready Services (CRS). */
        @com.fasterxml.jackson.annotation.JsonProperty("crsBaseDirectory")
        private String crsBaseDirectory;

        /**
         * The Oracle base location of Cluster Ready Services (CRS).
         *
         * @param crsBaseDirectory the value to set
         * @return this builder
         */
        public Builder crsBaseDirectory(String crsBaseDirectory) {
            this.crsBaseDirectory = crsBaseDirectory;
            this.__explicitlySet__.add("crsBaseDirectory");
            return this;
        }
        /** The Automatic Diagnostic Repository (ADR) home directory for the cluster instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("adrHomeDirectory")
        private String adrHomeDirectory;

        /**
         * The Automatic Diagnostic Repository (ADR) home directory for the cluster instance.
         *
         * @param adrHomeDirectory the value to set
         * @return this builder
         */
        public Builder adrHomeDirectory(String adrHomeDirectory) {
            this.adrHomeDirectory = adrHomeDirectory;
            this.__explicitlySet__.add("adrHomeDirectory");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connector")
        private CloudDbSystemDiscoveryConnector connector;

        public Builder connector(CloudDbSystemDiscoveryConnector connector) {
            this.connector = connector;
            this.__explicitlySet__.add("connector");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DiscoveredCloudClusterInstance build() {
            DiscoveredCloudClusterInstance model =
                    new DiscoveredCloudClusterInstance(
                            this.componentId,
                            this.displayName,
                            this.componentName,
                            this.resourceId,
                            this.dbaasId,
                            this.isSelectedForMonitoring,
                            this.status,
                            this.associatedComponents,
                            this.hostName,
                            this.clusterId,
                            this.nodeRole,
                            this.crsBaseDirectory,
                            this.adrHomeDirectory,
                            this.connector);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DiscoveredCloudClusterInstance model) {
            if (model.wasPropertyExplicitlySet("componentId")) {
                this.componentId(model.getComponentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("componentName")) {
                this.componentName(model.getComponentName());
            }
            if (model.wasPropertyExplicitlySet("resourceId")) {
                this.resourceId(model.getResourceId());
            }
            if (model.wasPropertyExplicitlySet("dbaasId")) {
                this.dbaasId(model.getDbaasId());
            }
            if (model.wasPropertyExplicitlySet("isSelectedForMonitoring")) {
                this.isSelectedForMonitoring(model.getIsSelectedForMonitoring());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("associatedComponents")) {
                this.associatedComponents(model.getAssociatedComponents());
            }
            if (model.wasPropertyExplicitlySet("hostName")) {
                this.hostName(model.getHostName());
            }
            if (model.wasPropertyExplicitlySet("clusterId")) {
                this.clusterId(model.getClusterId());
            }
            if (model.wasPropertyExplicitlySet("nodeRole")) {
                this.nodeRole(model.getNodeRole());
            }
            if (model.wasPropertyExplicitlySet("crsBaseDirectory")) {
                this.crsBaseDirectory(model.getCrsBaseDirectory());
            }
            if (model.wasPropertyExplicitlySet("adrHomeDirectory")) {
                this.adrHomeDirectory(model.getAdrHomeDirectory());
            }
            if (model.wasPropertyExplicitlySet("connector")) {
                this.connector(model.getConnector());
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
    public DiscoveredCloudClusterInstance(
            String componentId,
            String displayName,
            String componentName,
            String resourceId,
            String dbaasId,
            Boolean isSelectedForMonitoring,
            Status status,
            java.util.List<AssociatedCloudComponent> associatedComponents,
            String hostName,
            String clusterId,
            NodeRole nodeRole,
            String crsBaseDirectory,
            String adrHomeDirectory,
            CloudDbSystemDiscoveryConnector connector) {
        super(
                componentId,
                displayName,
                componentName,
                resourceId,
                dbaasId,
                isSelectedForMonitoring,
                status,
                associatedComponents);
        this.hostName = hostName;
        this.clusterId = clusterId;
        this.nodeRole = nodeRole;
        this.crsBaseDirectory = crsBaseDirectory;
        this.adrHomeDirectory = adrHomeDirectory;
        this.connector = connector;
    }

    /** The name of the host on which the cluster instance is running. */
    @com.fasterxml.jackson.annotation.JsonProperty("hostName")
    private final String hostName;

    /**
     * The name of the host on which the cluster instance is running.
     *
     * @return the value
     */
    public String getHostName() {
        return hostName;
    }

    /** The unique identifier of the Oracle cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterId")
    private final String clusterId;

    /**
     * The unique identifier of the Oracle cluster.
     *
     * @return the value
     */
    public String getClusterId() {
        return clusterId;
    }

    /** The role of the cluster node. */
    public enum NodeRole implements com.oracle.bmc.http.internal.BmcEnum {
        Hub("HUB"),
        Leaf("LEAF"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(NodeRole.class);

        private final String value;
        private static java.util.Map<String, NodeRole> map;

        static {
            map = new java.util.HashMap<>();
            for (NodeRole v : NodeRole.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        NodeRole(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static NodeRole create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'NodeRole', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The role of the cluster node. */
    @com.fasterxml.jackson.annotation.JsonProperty("nodeRole")
    private final NodeRole nodeRole;

    /**
     * The role of the cluster node.
     *
     * @return the value
     */
    public NodeRole getNodeRole() {
        return nodeRole;
    }

    /** The Oracle base location of Cluster Ready Services (CRS). */
    @com.fasterxml.jackson.annotation.JsonProperty("crsBaseDirectory")
    private final String crsBaseDirectory;

    /**
     * The Oracle base location of Cluster Ready Services (CRS).
     *
     * @return the value
     */
    public String getCrsBaseDirectory() {
        return crsBaseDirectory;
    }

    /** The Automatic Diagnostic Repository (ADR) home directory for the cluster instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("adrHomeDirectory")
    private final String adrHomeDirectory;

    /**
     * The Automatic Diagnostic Repository (ADR) home directory for the cluster instance.
     *
     * @return the value
     */
    public String getAdrHomeDirectory() {
        return adrHomeDirectory;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("connector")
    private final CloudDbSystemDiscoveryConnector connector;

    public CloudDbSystemDiscoveryConnector getConnector() {
        return connector;
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
        sb.append("DiscoveredCloudClusterInstance(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", hostName=").append(String.valueOf(this.hostName));
        sb.append(", clusterId=").append(String.valueOf(this.clusterId));
        sb.append(", nodeRole=").append(String.valueOf(this.nodeRole));
        sb.append(", crsBaseDirectory=").append(String.valueOf(this.crsBaseDirectory));
        sb.append(", adrHomeDirectory=").append(String.valueOf(this.adrHomeDirectory));
        sb.append(", connector=").append(String.valueOf(this.connector));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DiscoveredCloudClusterInstance)) {
            return false;
        }

        DiscoveredCloudClusterInstance other = (DiscoveredCloudClusterInstance) o;
        return java.util.Objects.equals(this.hostName, other.hostName)
                && java.util.Objects.equals(this.clusterId, other.clusterId)
                && java.util.Objects.equals(this.nodeRole, other.nodeRole)
                && java.util.Objects.equals(this.crsBaseDirectory, other.crsBaseDirectory)
                && java.util.Objects.equals(this.adrHomeDirectory, other.adrHomeDirectory)
                && java.util.Objects.equals(this.connector, other.connector)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.hostName == null ? 43 : this.hostName.hashCode());
        result = (result * PRIME) + (this.clusterId == null ? 43 : this.clusterId.hashCode());
        result = (result * PRIME) + (this.nodeRole == null ? 43 : this.nodeRole.hashCode());
        result =
                (result * PRIME)
                        + (this.crsBaseDirectory == null ? 43 : this.crsBaseDirectory.hashCode());
        result =
                (result * PRIME)
                        + (this.adrHomeDirectory == null ? 43 : this.adrHomeDirectory.hashCode());
        result = (result * PRIME) + (this.connector == null ? 43 : this.connector.hashCode());
        return result;
    }
}
