/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details of an ASM discovered in an external DB system discovery run. <br>
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
        builder = DiscoveredExternalAsm.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "componentType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DiscoveredExternalAsm extends DiscoveredExternalDbSystemComponent {
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
        private java.util.List<AssociatedComponent> associatedComponents;

        public Builder associatedComponents(
                java.util.List<AssociatedComponent> associatedComponents) {
            this.associatedComponents = associatedComponents;
            this.__explicitlySet__.add("associatedComponents");
            return this;
        }
        /**
         * The directory in which ASM is installed. This is the same directory in which Oracle Grid
         * Infrastructure is installed.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("gridHome")
        private String gridHome;

        /**
         * The directory in which ASM is installed. This is the same directory in which Oracle Grid
         * Infrastructure is installed.
         *
         * @param gridHome the value to set
         * @return this builder
         */
        public Builder gridHome(String gridHome) {
            this.gridHome = gridHome;
            this.__explicitlySet__.add("gridHome");
            return this;
        }
        /** Indicates whether Oracle Flex ASM is enabled or not. */
        @com.fasterxml.jackson.annotation.JsonProperty("isFlexEnabled")
        private Boolean isFlexEnabled;

        /**
         * Indicates whether Oracle Flex ASM is enabled or not.
         *
         * @param isFlexEnabled the value to set
         * @return this builder
         */
        public Builder isFlexEnabled(Boolean isFlexEnabled) {
            this.isFlexEnabled = isFlexEnabled;
            this.__explicitlySet__.add("isFlexEnabled");
            return this;
        }
        /** The ASM version. */
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * The ASM version.
         *
         * @param version the value to set
         * @return this builder
         */
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("asmInstances")
        private java.util.List<DiscoveredExternalAsmInstance> asmInstances;

        public Builder asmInstances(java.util.List<DiscoveredExternalAsmInstance> asmInstances) {
            this.asmInstances = asmInstances;
            this.__explicitlySet__.add("asmInstances");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connector")
        private ExternalDbSystemDiscoveryConnector connector;

        public Builder connector(ExternalDbSystemDiscoveryConnector connector) {
            this.connector = connector;
            this.__explicitlySet__.add("connector");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DiscoveredExternalAsm build() {
            DiscoveredExternalAsm model =
                    new DiscoveredExternalAsm(
                            this.componentId,
                            this.displayName,
                            this.componentName,
                            this.resourceId,
                            this.isSelectedForMonitoring,
                            this.status,
                            this.associatedComponents,
                            this.gridHome,
                            this.isFlexEnabled,
                            this.version,
                            this.asmInstances,
                            this.connector);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DiscoveredExternalAsm model) {
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
            if (model.wasPropertyExplicitlySet("isSelectedForMonitoring")) {
                this.isSelectedForMonitoring(model.getIsSelectedForMonitoring());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("associatedComponents")) {
                this.associatedComponents(model.getAssociatedComponents());
            }
            if (model.wasPropertyExplicitlySet("gridHome")) {
                this.gridHome(model.getGridHome());
            }
            if (model.wasPropertyExplicitlySet("isFlexEnabled")) {
                this.isFlexEnabled(model.getIsFlexEnabled());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("asmInstances")) {
                this.asmInstances(model.getAsmInstances());
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
    public DiscoveredExternalAsm(
            String componentId,
            String displayName,
            String componentName,
            String resourceId,
            Boolean isSelectedForMonitoring,
            Status status,
            java.util.List<AssociatedComponent> associatedComponents,
            String gridHome,
            Boolean isFlexEnabled,
            String version,
            java.util.List<DiscoveredExternalAsmInstance> asmInstances,
            ExternalDbSystemDiscoveryConnector connector) {
        super(
                componentId,
                displayName,
                componentName,
                resourceId,
                isSelectedForMonitoring,
                status,
                associatedComponents);
        this.gridHome = gridHome;
        this.isFlexEnabled = isFlexEnabled;
        this.version = version;
        this.asmInstances = asmInstances;
        this.connector = connector;
    }

    /**
     * The directory in which ASM is installed. This is the same directory in which Oracle Grid
     * Infrastructure is installed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("gridHome")
    private final String gridHome;

    /**
     * The directory in which ASM is installed. This is the same directory in which Oracle Grid
     * Infrastructure is installed.
     *
     * @return the value
     */
    public String getGridHome() {
        return gridHome;
    }

    /** Indicates whether Oracle Flex ASM is enabled or not. */
    @com.fasterxml.jackson.annotation.JsonProperty("isFlexEnabled")
    private final Boolean isFlexEnabled;

    /**
     * Indicates whether Oracle Flex ASM is enabled or not.
     *
     * @return the value
     */
    public Boolean getIsFlexEnabled() {
        return isFlexEnabled;
    }

    /** The ASM version. */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * The ASM version.
     *
     * @return the value
     */
    public String getVersion() {
        return version;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("asmInstances")
    private final java.util.List<DiscoveredExternalAsmInstance> asmInstances;

    public java.util.List<DiscoveredExternalAsmInstance> getAsmInstances() {
        return asmInstances;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("connector")
    private final ExternalDbSystemDiscoveryConnector connector;

    public ExternalDbSystemDiscoveryConnector getConnector() {
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
        sb.append("DiscoveredExternalAsm(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", gridHome=").append(String.valueOf(this.gridHome));
        sb.append(", isFlexEnabled=").append(String.valueOf(this.isFlexEnabled));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", asmInstances=").append(String.valueOf(this.asmInstances));
        sb.append(", connector=").append(String.valueOf(this.connector));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DiscoveredExternalAsm)) {
            return false;
        }

        DiscoveredExternalAsm other = (DiscoveredExternalAsm) o;
        return java.util.Objects.equals(this.gridHome, other.gridHome)
                && java.util.Objects.equals(this.isFlexEnabled, other.isFlexEnabled)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.asmInstances, other.asmInstances)
                && java.util.Objects.equals(this.connector, other.connector)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.gridHome == null ? 43 : this.gridHome.hashCode());
        result =
                (result * PRIME)
                        + (this.isFlexEnabled == null ? 43 : this.isFlexEnabled.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.asmInstances == null ? 43 : this.asmInstances.hashCode());
        result = (result * PRIME) + (this.connector == null ? 43 : this.connector.hashCode());
        return result;
    }
}
