/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details of an Oracle listener discovered in an external DB system discovery run. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DiscoveredExternalListener.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "componentType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class DiscoveredExternalListener extends DiscoveredExternalDbSystemComponent {
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
        /** The name of the DB node. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbNodeName")
        private String dbNodeName;

        /**
         * The name of the DB node.
         *
         * @param dbNodeName the value to set
         * @return this builder
         */
        public Builder dbNodeName(String dbNodeName) {
            this.dbNodeName = dbNodeName;
            this.__explicitlySet__.add("dbNodeName");
            return this;
        }
        /** The Oracle home location of the listener. */
        @com.fasterxml.jackson.annotation.JsonProperty("oracleHome")
        private String oracleHome;

        /**
         * The Oracle home location of the listener.
         *
         * @param oracleHome the value to set
         * @return this builder
         */
        public Builder oracleHome(String oracleHome) {
            this.oracleHome = oracleHome;
            this.__explicitlySet__.add("oracleHome");
            return this;
        }
        /** The listener alias. */
        @com.fasterxml.jackson.annotation.JsonProperty("listenerAlias")
        private String listenerAlias;

        /**
         * The listener alias.
         *
         * @param listenerAlias the value to set
         * @return this builder
         */
        public Builder listenerAlias(String listenerAlias) {
            this.listenerAlias = listenerAlias;
            this.__explicitlySet__.add("listenerAlias");
            return this;
        }
        /**
         * The directory that stores tracing and logging incidents when Automatic Diagnostic
         * Repository (ADR) is enabled.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("adrHomeDirectory")
        private String adrHomeDirectory;

        /**
         * The directory that stores tracing and logging incidents when Automatic Diagnostic
         * Repository (ADR) is enabled.
         *
         * @param adrHomeDirectory the value to set
         * @return this builder
         */
        public Builder adrHomeDirectory(String adrHomeDirectory) {
            this.adrHomeDirectory = adrHomeDirectory;
            this.__explicitlySet__.add("adrHomeDirectory");
            return this;
        }
        /** The destination directory of the listener log file. */
        @com.fasterxml.jackson.annotation.JsonProperty("logDirectory")
        private String logDirectory;

        /**
         * The destination directory of the listener log file.
         *
         * @param logDirectory the value to set
         * @return this builder
         */
        public Builder logDirectory(String logDirectory) {
            this.logDirectory = logDirectory;
            this.__explicitlySet__.add("logDirectory");
            return this;
        }
        /** The destination directory of the listener trace file. */
        @com.fasterxml.jackson.annotation.JsonProperty("traceDirectory")
        private String traceDirectory;

        /**
         * The destination directory of the listener trace file.
         *
         * @param traceDirectory the value to set
         * @return this builder
         */
        public Builder traceDirectory(String traceDirectory) {
            this.traceDirectory = traceDirectory;
            this.__explicitlySet__.add("traceDirectory");
            return this;
        }
        /** The listener version. */
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * The listener version.
         *
         * @param version the value to set
         * @return this builder
         */
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /** The type of listener. */
        @com.fasterxml.jackson.annotation.JsonProperty("listenerType")
        private ListenerType listenerType;

        /**
         * The type of listener.
         *
         * @param listenerType the value to set
         * @return this builder
         */
        public Builder listenerType(ListenerType listenerType) {
            this.listenerType = listenerType;
            this.__explicitlySet__.add("listenerType");
            return this;
        }
        /** The name of the host on which the external listener is running. */
        @com.fasterxml.jackson.annotation.JsonProperty("hostName")
        private String hostName;

        /**
         * The name of the host on which the external listener is running.
         *
         * @param hostName the value to set
         * @return this builder
         */
        public Builder hostName(String hostName) {
            this.hostName = hostName;
            this.__explicitlySet__.add("hostName");
            return this;
        }
        /** The list of protocol addresses the listener is configured to listen on. */
        @com.fasterxml.jackson.annotation.JsonProperty("endpoints")
        private java.util.List<ExternalListenerEndpoint> endpoints;

        /**
         * The list of protocol addresses the listener is configured to listen on.
         *
         * @param endpoints the value to set
         * @return this builder
         */
        public Builder endpoints(java.util.List<ExternalListenerEndpoint> endpoints) {
            this.endpoints = endpoints;
            this.__explicitlySet__.add("endpoints");
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

        public DiscoveredExternalListener build() {
            DiscoveredExternalListener model =
                    new DiscoveredExternalListener(
                            this.componentId,
                            this.displayName,
                            this.componentName,
                            this.resourceId,
                            this.isSelectedForMonitoring,
                            this.status,
                            this.associatedComponents,
                            this.dbNodeName,
                            this.oracleHome,
                            this.listenerAlias,
                            this.adrHomeDirectory,
                            this.logDirectory,
                            this.traceDirectory,
                            this.version,
                            this.listenerType,
                            this.hostName,
                            this.endpoints,
                            this.connector);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DiscoveredExternalListener model) {
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
            if (model.wasPropertyExplicitlySet("dbNodeName")) {
                this.dbNodeName(model.getDbNodeName());
            }
            if (model.wasPropertyExplicitlySet("oracleHome")) {
                this.oracleHome(model.getOracleHome());
            }
            if (model.wasPropertyExplicitlySet("listenerAlias")) {
                this.listenerAlias(model.getListenerAlias());
            }
            if (model.wasPropertyExplicitlySet("adrHomeDirectory")) {
                this.adrHomeDirectory(model.getAdrHomeDirectory());
            }
            if (model.wasPropertyExplicitlySet("logDirectory")) {
                this.logDirectory(model.getLogDirectory());
            }
            if (model.wasPropertyExplicitlySet("traceDirectory")) {
                this.traceDirectory(model.getTraceDirectory());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("listenerType")) {
                this.listenerType(model.getListenerType());
            }
            if (model.wasPropertyExplicitlySet("hostName")) {
                this.hostName(model.getHostName());
            }
            if (model.wasPropertyExplicitlySet("endpoints")) {
                this.endpoints(model.getEndpoints());
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
    public DiscoveredExternalListener(
            String componentId,
            String displayName,
            String componentName,
            String resourceId,
            Boolean isSelectedForMonitoring,
            Status status,
            java.util.List<AssociatedComponent> associatedComponents,
            String dbNodeName,
            String oracleHome,
            String listenerAlias,
            String adrHomeDirectory,
            String logDirectory,
            String traceDirectory,
            String version,
            ListenerType listenerType,
            String hostName,
            java.util.List<ExternalListenerEndpoint> endpoints,
            ExternalDbSystemDiscoveryConnector connector) {
        super(
                componentId,
                displayName,
                componentName,
                resourceId,
                isSelectedForMonitoring,
                status,
                associatedComponents);
        this.dbNodeName = dbNodeName;
        this.oracleHome = oracleHome;
        this.listenerAlias = listenerAlias;
        this.adrHomeDirectory = adrHomeDirectory;
        this.logDirectory = logDirectory;
        this.traceDirectory = traceDirectory;
        this.version = version;
        this.listenerType = listenerType;
        this.hostName = hostName;
        this.endpoints = endpoints;
        this.connector = connector;
    }

    /** The name of the DB node. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbNodeName")
    private final String dbNodeName;

    /**
     * The name of the DB node.
     *
     * @return the value
     */
    public String getDbNodeName() {
        return dbNodeName;
    }

    /** The Oracle home location of the listener. */
    @com.fasterxml.jackson.annotation.JsonProperty("oracleHome")
    private final String oracleHome;

    /**
     * The Oracle home location of the listener.
     *
     * @return the value
     */
    public String getOracleHome() {
        return oracleHome;
    }

    /** The listener alias. */
    @com.fasterxml.jackson.annotation.JsonProperty("listenerAlias")
    private final String listenerAlias;

    /**
     * The listener alias.
     *
     * @return the value
     */
    public String getListenerAlias() {
        return listenerAlias;
    }

    /**
     * The directory that stores tracing and logging incidents when Automatic Diagnostic Repository
     * (ADR) is enabled.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("adrHomeDirectory")
    private final String adrHomeDirectory;

    /**
     * The directory that stores tracing and logging incidents when Automatic Diagnostic Repository
     * (ADR) is enabled.
     *
     * @return the value
     */
    public String getAdrHomeDirectory() {
        return adrHomeDirectory;
    }

    /** The destination directory of the listener log file. */
    @com.fasterxml.jackson.annotation.JsonProperty("logDirectory")
    private final String logDirectory;

    /**
     * The destination directory of the listener log file.
     *
     * @return the value
     */
    public String getLogDirectory() {
        return logDirectory;
    }

    /** The destination directory of the listener trace file. */
    @com.fasterxml.jackson.annotation.JsonProperty("traceDirectory")
    private final String traceDirectory;

    /**
     * The destination directory of the listener trace file.
     *
     * @return the value
     */
    public String getTraceDirectory() {
        return traceDirectory;
    }

    /** The listener version. */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * The listener version.
     *
     * @return the value
     */
    public String getVersion() {
        return version;
    }

    /** The type of listener. */
    public enum ListenerType implements com.oracle.bmc.http.internal.BmcEnum {
        Asm("ASM"),
        Local("LOCAL"),
        Scan("SCAN"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ListenerType.class);

        private final String value;
        private static java.util.Map<String, ListenerType> map;

        static {
            map = new java.util.HashMap<>();
            for (ListenerType v : ListenerType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ListenerType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ListenerType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ListenerType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The type of listener. */
    @com.fasterxml.jackson.annotation.JsonProperty("listenerType")
    private final ListenerType listenerType;

    /**
     * The type of listener.
     *
     * @return the value
     */
    public ListenerType getListenerType() {
        return listenerType;
    }

    /** The name of the host on which the external listener is running. */
    @com.fasterxml.jackson.annotation.JsonProperty("hostName")
    private final String hostName;

    /**
     * The name of the host on which the external listener is running.
     *
     * @return the value
     */
    public String getHostName() {
        return hostName;
    }

    /** The list of protocol addresses the listener is configured to listen on. */
    @com.fasterxml.jackson.annotation.JsonProperty("endpoints")
    private final java.util.List<ExternalListenerEndpoint> endpoints;

    /**
     * The list of protocol addresses the listener is configured to listen on.
     *
     * @return the value
     */
    public java.util.List<ExternalListenerEndpoint> getEndpoints() {
        return endpoints;
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
        sb.append("DiscoveredExternalListener(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", dbNodeName=").append(String.valueOf(this.dbNodeName));
        sb.append(", oracleHome=").append(String.valueOf(this.oracleHome));
        sb.append(", listenerAlias=").append(String.valueOf(this.listenerAlias));
        sb.append(", adrHomeDirectory=").append(String.valueOf(this.adrHomeDirectory));
        sb.append(", logDirectory=").append(String.valueOf(this.logDirectory));
        sb.append(", traceDirectory=").append(String.valueOf(this.traceDirectory));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", listenerType=").append(String.valueOf(this.listenerType));
        sb.append(", hostName=").append(String.valueOf(this.hostName));
        sb.append(", endpoints=").append(String.valueOf(this.endpoints));
        sb.append(", connector=").append(String.valueOf(this.connector));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DiscoveredExternalListener)) {
            return false;
        }

        DiscoveredExternalListener other = (DiscoveredExternalListener) o;
        return java.util.Objects.equals(this.dbNodeName, other.dbNodeName)
                && java.util.Objects.equals(this.oracleHome, other.oracleHome)
                && java.util.Objects.equals(this.listenerAlias, other.listenerAlias)
                && java.util.Objects.equals(this.adrHomeDirectory, other.adrHomeDirectory)
                && java.util.Objects.equals(this.logDirectory, other.logDirectory)
                && java.util.Objects.equals(this.traceDirectory, other.traceDirectory)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.listenerType, other.listenerType)
                && java.util.Objects.equals(this.hostName, other.hostName)
                && java.util.Objects.equals(this.endpoints, other.endpoints)
                && java.util.Objects.equals(this.connector, other.connector)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.dbNodeName == null ? 43 : this.dbNodeName.hashCode());
        result = (result * PRIME) + (this.oracleHome == null ? 43 : this.oracleHome.hashCode());
        result =
                (result * PRIME)
                        + (this.listenerAlias == null ? 43 : this.listenerAlias.hashCode());
        result =
                (result * PRIME)
                        + (this.adrHomeDirectory == null ? 43 : this.adrHomeDirectory.hashCode());
        result = (result * PRIME) + (this.logDirectory == null ? 43 : this.logDirectory.hashCode());
        result =
                (result * PRIME)
                        + (this.traceDirectory == null ? 43 : this.traceDirectory.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.listenerType == null ? 43 : this.listenerType.hashCode());
        result = (result * PRIME) + (this.hostName == null ? 43 : this.hostName.hashCode());
        result = (result * PRIME) + (this.endpoints == null ? 43 : this.endpoints.hashCode());
        result = (result * PRIME) + (this.connector == null ? 43 : this.connector.hashCode());
        return result;
    }
}
