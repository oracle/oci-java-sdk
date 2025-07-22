/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details of an Oracle DB instance discovered in a cloud DB system discovery run. <br>
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
        builder = DiscoveredCloudDbInstance.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "componentType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DiscoveredCloudDbInstance extends DiscoveredCloudDbSystemComponent {
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
        /** The name of the DB instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceName")
        private String instanceName;

        /**
         * The name of the DB instance.
         *
         * @param instanceName the value to set
         * @return this builder
         */
        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            this.__explicitlySet__.add("instanceName");
            return this;
        }
        /** The name of the host on which the DB instance is running. */
        @com.fasterxml.jackson.annotation.JsonProperty("hostName")
        private String hostName;

        /**
         * The name of the host on which the DB instance is running.
         *
         * @param hostName the value to set
         * @return this builder
         */
        public Builder hostName(String hostName) {
            this.hostName = hostName;
            this.__explicitlySet__.add("hostName");
            return this;
        }
        /** The name of the DB instance node. */
        @com.fasterxml.jackson.annotation.JsonProperty("nodeName")
        private String nodeName;

        /**
         * The name of the DB instance node.
         *
         * @param nodeName the value to set
         * @return this builder
         */
        public Builder nodeName(String nodeName) {
            this.nodeName = nodeName;
            this.__explicitlySet__.add("nodeName");
            return this;
        }
        /** The Oracle home location of the DB instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("oracleHome")
        private String oracleHome;

        /**
         * The Oracle home location of the DB instance.
         *
         * @param oracleHome the value to set
         * @return this builder
         */
        public Builder oracleHome(String oracleHome) {
            this.oracleHome = oracleHome;
            this.__explicitlySet__.add("oracleHome");
            return this;
        }
        /** The Automatic Diagnostic Repository (ADR) home directory for the DB instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("adrHomeDirectory")
        private String adrHomeDirectory;

        /**
         * The Automatic Diagnostic Repository (ADR) home directory for the DB instance.
         *
         * @param adrHomeDirectory the value to set
         * @return this builder
         */
        public Builder adrHomeDirectory(String adrHomeDirectory) {
            this.adrHomeDirectory = adrHomeDirectory;
            this.__explicitlySet__.add("adrHomeDirectory");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DiscoveredCloudDbInstance build() {
            DiscoveredCloudDbInstance model =
                    new DiscoveredCloudDbInstance(
                            this.componentId,
                            this.displayName,
                            this.componentName,
                            this.resourceId,
                            this.dbaasId,
                            this.isSelectedForMonitoring,
                            this.status,
                            this.associatedComponents,
                            this.instanceName,
                            this.hostName,
                            this.nodeName,
                            this.oracleHome,
                            this.adrHomeDirectory);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DiscoveredCloudDbInstance model) {
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
            if (model.wasPropertyExplicitlySet("instanceName")) {
                this.instanceName(model.getInstanceName());
            }
            if (model.wasPropertyExplicitlySet("hostName")) {
                this.hostName(model.getHostName());
            }
            if (model.wasPropertyExplicitlySet("nodeName")) {
                this.nodeName(model.getNodeName());
            }
            if (model.wasPropertyExplicitlySet("oracleHome")) {
                this.oracleHome(model.getOracleHome());
            }
            if (model.wasPropertyExplicitlySet("adrHomeDirectory")) {
                this.adrHomeDirectory(model.getAdrHomeDirectory());
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
    public DiscoveredCloudDbInstance(
            String componentId,
            String displayName,
            String componentName,
            String resourceId,
            String dbaasId,
            Boolean isSelectedForMonitoring,
            Status status,
            java.util.List<AssociatedCloudComponent> associatedComponents,
            String instanceName,
            String hostName,
            String nodeName,
            String oracleHome,
            String adrHomeDirectory) {
        super(
                componentId,
                displayName,
                componentName,
                resourceId,
                dbaasId,
                isSelectedForMonitoring,
                status,
                associatedComponents);
        this.instanceName = instanceName;
        this.hostName = hostName;
        this.nodeName = nodeName;
        this.oracleHome = oracleHome;
        this.adrHomeDirectory = adrHomeDirectory;
    }

    /** The name of the DB instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceName")
    private final String instanceName;

    /**
     * The name of the DB instance.
     *
     * @return the value
     */
    public String getInstanceName() {
        return instanceName;
    }

    /** The name of the host on which the DB instance is running. */
    @com.fasterxml.jackson.annotation.JsonProperty("hostName")
    private final String hostName;

    /**
     * The name of the host on which the DB instance is running.
     *
     * @return the value
     */
    public String getHostName() {
        return hostName;
    }

    /** The name of the DB instance node. */
    @com.fasterxml.jackson.annotation.JsonProperty("nodeName")
    private final String nodeName;

    /**
     * The name of the DB instance node.
     *
     * @return the value
     */
    public String getNodeName() {
        return nodeName;
    }

    /** The Oracle home location of the DB instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("oracleHome")
    private final String oracleHome;

    /**
     * The Oracle home location of the DB instance.
     *
     * @return the value
     */
    public String getOracleHome() {
        return oracleHome;
    }

    /** The Automatic Diagnostic Repository (ADR) home directory for the DB instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("adrHomeDirectory")
    private final String adrHomeDirectory;

    /**
     * The Automatic Diagnostic Repository (ADR) home directory for the DB instance.
     *
     * @return the value
     */
    public String getAdrHomeDirectory() {
        return adrHomeDirectory;
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
        sb.append("DiscoveredCloudDbInstance(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", instanceName=").append(String.valueOf(this.instanceName));
        sb.append(", hostName=").append(String.valueOf(this.hostName));
        sb.append(", nodeName=").append(String.valueOf(this.nodeName));
        sb.append(", oracleHome=").append(String.valueOf(this.oracleHome));
        sb.append(", adrHomeDirectory=").append(String.valueOf(this.adrHomeDirectory));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DiscoveredCloudDbInstance)) {
            return false;
        }

        DiscoveredCloudDbInstance other = (DiscoveredCloudDbInstance) o;
        return java.util.Objects.equals(this.instanceName, other.instanceName)
                && java.util.Objects.equals(this.hostName, other.hostName)
                && java.util.Objects.equals(this.nodeName, other.nodeName)
                && java.util.Objects.equals(this.oracleHome, other.oracleHome)
                && java.util.Objects.equals(this.adrHomeDirectory, other.adrHomeDirectory)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.instanceName == null ? 43 : this.instanceName.hashCode());
        result = (result * PRIME) + (this.hostName == null ? 43 : this.hostName.hashCode());
        result = (result * PRIME) + (this.nodeName == null ? 43 : this.nodeName.hashCode());
        result = (result * PRIME) + (this.oracleHome == null ? 43 : this.oracleHome.hashCode());
        result =
                (result * PRIME)
                        + (this.adrHomeDirectory == null ? 43 : this.adrHomeDirectory.hashCode());
        return result;
    }
}
