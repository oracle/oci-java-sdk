/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details of an external listener. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ExternalListener.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ExternalListener
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "componentName",
        "compartmentId",
        "externalDbSystemId",
        "externalConnectorId",
        "externalDbNodeId",
        "externalDbHomeId",
        "listenerAlias",
        "listenerType",
        "additionalDetails",
        "lifecycleState",
        "lifecycleDetails",
        "listenerOraLocation",
        "oracleHome",
        "hostName",
        "adrHomeDirectory",
        "logDirectory",
        "traceDirectory",
        "version",
        "endpoints",
        "servicedDatabases",
        "servicedAsms",
        "timeCreated",
        "timeUpdated"
    })
    public ExternalListener(
            String id,
            String displayName,
            String componentName,
            String compartmentId,
            String externalDbSystemId,
            String externalConnectorId,
            String externalDbNodeId,
            String externalDbHomeId,
            String listenerAlias,
            ListenerType listenerType,
            java.util.Map<String, String> additionalDetails,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            String listenerOraLocation,
            String oracleHome,
            String hostName,
            String adrHomeDirectory,
            String logDirectory,
            String traceDirectory,
            String version,
            java.util.List<ExternalListenerEndpoint> endpoints,
            java.util.List<ExternalListenerServicedDatabase> servicedDatabases,
            java.util.List<ExternalServicedAsm> servicedAsms,
            java.util.Date timeCreated,
            java.util.Date timeUpdated) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.componentName = componentName;
        this.compartmentId = compartmentId;
        this.externalDbSystemId = externalDbSystemId;
        this.externalConnectorId = externalConnectorId;
        this.externalDbNodeId = externalDbNodeId;
        this.externalDbHomeId = externalDbHomeId;
        this.listenerAlias = listenerAlias;
        this.listenerType = listenerType;
        this.additionalDetails = additionalDetails;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.listenerOraLocation = listenerOraLocation;
        this.oracleHome = oracleHome;
        this.hostName = hostName;
        this.adrHomeDirectory = adrHomeDirectory;
        this.logDirectory = logDirectory;
        this.traceDirectory = traceDirectory;
        this.version = version;
        this.endpoints = endpoints;
        this.servicedDatabases = servicedDatabases;
        this.servicedAsms = servicedAsms;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * external listener.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * external listener.
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
         * The user-friendly name for the external listener. The name does not have to be unique.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly name for the external listener. The name does not have to be unique.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The name of the external listener. */
        @com.fasterxml.jackson.annotation.JsonProperty("componentName")
        private String componentName;

        /**
         * The name of the external listener.
         *
         * @param componentName the value to set
         * @return this builder
         */
        public Builder componentName(String componentName) {
            this.componentName = componentName;
            this.__explicitlySet__.add("componentName");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * compartment.
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
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * external DB system that the listener is a part of.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("externalDbSystemId")
        private String externalDbSystemId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * external DB system that the listener is a part of.
         *
         * @param externalDbSystemId the value to set
         * @return this builder
         */
        public Builder externalDbSystemId(String externalDbSystemId) {
            this.externalDbSystemId = externalDbSystemId;
            this.__explicitlySet__.add("externalDbSystemId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * external connector.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("externalConnectorId")
        private String externalConnectorId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * external connector.
         *
         * @param externalConnectorId the value to set
         * @return this builder
         */
        public Builder externalConnectorId(String externalConnectorId) {
            this.externalConnectorId = externalConnectorId;
            this.__explicitlySet__.add("externalConnectorId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * external DB node.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("externalDbNodeId")
        private String externalDbNodeId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * external DB node.
         *
         * @param externalDbNodeId the value to set
         * @return this builder
         */
        public Builder externalDbNodeId(String externalDbNodeId) {
            this.externalDbNodeId = externalDbNodeId;
            this.__explicitlySet__.add("externalDbNodeId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * external DB home.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("externalDbHomeId")
        private String externalDbHomeId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * external DB home.
         *
         * @param externalDbHomeId the value to set
         * @return this builder
         */
        public Builder externalDbHomeId(String externalDbHomeId) {
            this.externalDbHomeId = externalDbHomeId;
            this.__explicitlySet__.add("externalDbHomeId");
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
        /**
         * The additional details of the external listener defined in {@code {"key": "value"}}
         * format. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("additionalDetails")
        private java.util.Map<String, String> additionalDetails;

        /**
         * The additional details of the external listener defined in {@code {"key": "value"}}
         * format. Example: {@code {"bar-key": "value"}}
         *
         * @param additionalDetails the value to set
         * @return this builder
         */
        public Builder additionalDetails(java.util.Map<String, String> additionalDetails) {
            this.additionalDetails = additionalDetails;
            this.__explicitlySet__.add("additionalDetails");
            return this;
        }
        /** The current lifecycle state of the external listener. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current lifecycle state of the external listener.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** Additional information about the current lifecycle state. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Additional information about the current lifecycle state.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /** The location of the listener configuration file listener.ora. */
        @com.fasterxml.jackson.annotation.JsonProperty("listenerOraLocation")
        private String listenerOraLocation;

        /**
         * The location of the listener configuration file listener.ora.
         *
         * @param listenerOraLocation the value to set
         * @return this builder
         */
        public Builder listenerOraLocation(String listenerOraLocation) {
            this.listenerOraLocation = listenerOraLocation;
            this.__explicitlySet__.add("listenerOraLocation");
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
        /** The list of databases that are serviced by the listener. */
        @com.fasterxml.jackson.annotation.JsonProperty("servicedDatabases")
        private java.util.List<ExternalListenerServicedDatabase> servicedDatabases;

        /**
         * The list of databases that are serviced by the listener.
         *
         * @param servicedDatabases the value to set
         * @return this builder
         */
        public Builder servicedDatabases(
                java.util.List<ExternalListenerServicedDatabase> servicedDatabases) {
            this.servicedDatabases = servicedDatabases;
            this.__explicitlySet__.add("servicedDatabases");
            return this;
        }
        /** The list of ASMs that are serviced by the listener. */
        @com.fasterxml.jackson.annotation.JsonProperty("servicedAsms")
        private java.util.List<ExternalServicedAsm> servicedAsms;

        /**
         * The list of ASMs that are serviced by the listener.
         *
         * @param servicedAsms the value to set
         * @return this builder
         */
        public Builder servicedAsms(java.util.List<ExternalServicedAsm> servicedAsms) {
            this.servicedAsms = servicedAsms;
            this.__explicitlySet__.add("servicedAsms");
            return this;
        }
        /** The date and time the external listener was created. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the external listener was created.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The date and time the external listener was last updated. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the external listener was last updated.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExternalListener build() {
            ExternalListener model =
                    new ExternalListener(
                            this.id,
                            this.displayName,
                            this.componentName,
                            this.compartmentId,
                            this.externalDbSystemId,
                            this.externalConnectorId,
                            this.externalDbNodeId,
                            this.externalDbHomeId,
                            this.listenerAlias,
                            this.listenerType,
                            this.additionalDetails,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.listenerOraLocation,
                            this.oracleHome,
                            this.hostName,
                            this.adrHomeDirectory,
                            this.logDirectory,
                            this.traceDirectory,
                            this.version,
                            this.endpoints,
                            this.servicedDatabases,
                            this.servicedAsms,
                            this.timeCreated,
                            this.timeUpdated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExternalListener model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("componentName")) {
                this.componentName(model.getComponentName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("externalDbSystemId")) {
                this.externalDbSystemId(model.getExternalDbSystemId());
            }
            if (model.wasPropertyExplicitlySet("externalConnectorId")) {
                this.externalConnectorId(model.getExternalConnectorId());
            }
            if (model.wasPropertyExplicitlySet("externalDbNodeId")) {
                this.externalDbNodeId(model.getExternalDbNodeId());
            }
            if (model.wasPropertyExplicitlySet("externalDbHomeId")) {
                this.externalDbHomeId(model.getExternalDbHomeId());
            }
            if (model.wasPropertyExplicitlySet("listenerAlias")) {
                this.listenerAlias(model.getListenerAlias());
            }
            if (model.wasPropertyExplicitlySet("listenerType")) {
                this.listenerType(model.getListenerType());
            }
            if (model.wasPropertyExplicitlySet("additionalDetails")) {
                this.additionalDetails(model.getAdditionalDetails());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("listenerOraLocation")) {
                this.listenerOraLocation(model.getListenerOraLocation());
            }
            if (model.wasPropertyExplicitlySet("oracleHome")) {
                this.oracleHome(model.getOracleHome());
            }
            if (model.wasPropertyExplicitlySet("hostName")) {
                this.hostName(model.getHostName());
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
            if (model.wasPropertyExplicitlySet("endpoints")) {
                this.endpoints(model.getEndpoints());
            }
            if (model.wasPropertyExplicitlySet("servicedDatabases")) {
                this.servicedDatabases(model.getServicedDatabases());
            }
            if (model.wasPropertyExplicitlySet("servicedAsms")) {
                this.servicedAsms(model.getServicedAsms());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * external listener.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * external listener.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The user-friendly name for the external listener. The name does not have to be unique. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly name for the external listener. The name does not have to be unique.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The name of the external listener. */
    @com.fasterxml.jackson.annotation.JsonProperty("componentName")
    private final String componentName;

    /**
     * The name of the external listener.
     *
     * @return the value
     */
    public String getComponentName() {
        return componentName;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * external DB system that the listener is a part of.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("externalDbSystemId")
    private final String externalDbSystemId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * external DB system that the listener is a part of.
     *
     * @return the value
     */
    public String getExternalDbSystemId() {
        return externalDbSystemId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * external connector.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("externalConnectorId")
    private final String externalConnectorId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * external connector.
     *
     * @return the value
     */
    public String getExternalConnectorId() {
        return externalConnectorId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * external DB node.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("externalDbNodeId")
    private final String externalDbNodeId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * external DB node.
     *
     * @return the value
     */
    public String getExternalDbNodeId() {
        return externalDbNodeId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * external DB home.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("externalDbHomeId")
    private final String externalDbHomeId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * external DB home.
     *
     * @return the value
     */
    public String getExternalDbHomeId() {
        return externalDbHomeId;
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

    /**
     * The additional details of the external listener defined in {@code {"key": "value"}} format.
     * Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("additionalDetails")
    private final java.util.Map<String, String> additionalDetails;

    /**
     * The additional details of the external listener defined in {@code {"key": "value"}} format.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getAdditionalDetails() {
        return additionalDetails;
    }

    /** The current lifecycle state of the external listener. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        NotConnected("NOT_CONNECTED"),
        Active("ACTIVE"),
        Inactive("INACTIVE"),
        Updating("UPDATING"),
        Deleting("DELETING"),
        Deleted("DELETED"),
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
    /** The current lifecycle state of the external listener. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current lifecycle state of the external listener.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** Additional information about the current lifecycle state. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Additional information about the current lifecycle state.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /** The location of the listener configuration file listener.ora. */
    @com.fasterxml.jackson.annotation.JsonProperty("listenerOraLocation")
    private final String listenerOraLocation;

    /**
     * The location of the listener configuration file listener.ora.
     *
     * @return the value
     */
    public String getListenerOraLocation() {
        return listenerOraLocation;
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

    /** The list of databases that are serviced by the listener. */
    @com.fasterxml.jackson.annotation.JsonProperty("servicedDatabases")
    private final java.util.List<ExternalListenerServicedDatabase> servicedDatabases;

    /**
     * The list of databases that are serviced by the listener.
     *
     * @return the value
     */
    public java.util.List<ExternalListenerServicedDatabase> getServicedDatabases() {
        return servicedDatabases;
    }

    /** The list of ASMs that are serviced by the listener. */
    @com.fasterxml.jackson.annotation.JsonProperty("servicedAsms")
    private final java.util.List<ExternalServicedAsm> servicedAsms;

    /**
     * The list of ASMs that are serviced by the listener.
     *
     * @return the value
     */
    public java.util.List<ExternalServicedAsm> getServicedAsms() {
        return servicedAsms;
    }

    /** The date and time the external listener was created. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the external listener was created.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The date and time the external listener was last updated. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the external listener was last updated.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
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
        sb.append("ExternalListener(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", componentName=").append(String.valueOf(this.componentName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", externalDbSystemId=").append(String.valueOf(this.externalDbSystemId));
        sb.append(", externalConnectorId=").append(String.valueOf(this.externalConnectorId));
        sb.append(", externalDbNodeId=").append(String.valueOf(this.externalDbNodeId));
        sb.append(", externalDbHomeId=").append(String.valueOf(this.externalDbHomeId));
        sb.append(", listenerAlias=").append(String.valueOf(this.listenerAlias));
        sb.append(", listenerType=").append(String.valueOf(this.listenerType));
        sb.append(", additionalDetails=").append(String.valueOf(this.additionalDetails));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", listenerOraLocation=").append(String.valueOf(this.listenerOraLocation));
        sb.append(", oracleHome=").append(String.valueOf(this.oracleHome));
        sb.append(", hostName=").append(String.valueOf(this.hostName));
        sb.append(", adrHomeDirectory=").append(String.valueOf(this.adrHomeDirectory));
        sb.append(", logDirectory=").append(String.valueOf(this.logDirectory));
        sb.append(", traceDirectory=").append(String.valueOf(this.traceDirectory));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", endpoints=").append(String.valueOf(this.endpoints));
        sb.append(", servicedDatabases=").append(String.valueOf(this.servicedDatabases));
        sb.append(", servicedAsms=").append(String.valueOf(this.servicedAsms));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExternalListener)) {
            return false;
        }

        ExternalListener other = (ExternalListener) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.componentName, other.componentName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.externalDbSystemId, other.externalDbSystemId)
                && java.util.Objects.equals(this.externalConnectorId, other.externalConnectorId)
                && java.util.Objects.equals(this.externalDbNodeId, other.externalDbNodeId)
                && java.util.Objects.equals(this.externalDbHomeId, other.externalDbHomeId)
                && java.util.Objects.equals(this.listenerAlias, other.listenerAlias)
                && java.util.Objects.equals(this.listenerType, other.listenerType)
                && java.util.Objects.equals(this.additionalDetails, other.additionalDetails)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.listenerOraLocation, other.listenerOraLocation)
                && java.util.Objects.equals(this.oracleHome, other.oracleHome)
                && java.util.Objects.equals(this.hostName, other.hostName)
                && java.util.Objects.equals(this.adrHomeDirectory, other.adrHomeDirectory)
                && java.util.Objects.equals(this.logDirectory, other.logDirectory)
                && java.util.Objects.equals(this.traceDirectory, other.traceDirectory)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.endpoints, other.endpoints)
                && java.util.Objects.equals(this.servicedDatabases, other.servicedDatabases)
                && java.util.Objects.equals(this.servicedAsms, other.servicedAsms)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.componentName == null ? 43 : this.componentName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.externalDbSystemId == null
                                ? 43
                                : this.externalDbSystemId.hashCode());
        result =
                (result * PRIME)
                        + (this.externalConnectorId == null
                                ? 43
                                : this.externalConnectorId.hashCode());
        result =
                (result * PRIME)
                        + (this.externalDbNodeId == null ? 43 : this.externalDbNodeId.hashCode());
        result =
                (result * PRIME)
                        + (this.externalDbHomeId == null ? 43 : this.externalDbHomeId.hashCode());
        result =
                (result * PRIME)
                        + (this.listenerAlias == null ? 43 : this.listenerAlias.hashCode());
        result = (result * PRIME) + (this.listenerType == null ? 43 : this.listenerType.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalDetails == null ? 43 : this.additionalDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.listenerOraLocation == null
                                ? 43
                                : this.listenerOraLocation.hashCode());
        result = (result * PRIME) + (this.oracleHome == null ? 43 : this.oracleHome.hashCode());
        result = (result * PRIME) + (this.hostName == null ? 43 : this.hostName.hashCode());
        result =
                (result * PRIME)
                        + (this.adrHomeDirectory == null ? 43 : this.adrHomeDirectory.hashCode());
        result = (result * PRIME) + (this.logDirectory == null ? 43 : this.logDirectory.hashCode());
        result =
                (result * PRIME)
                        + (this.traceDirectory == null ? 43 : this.traceDirectory.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.endpoints == null ? 43 : this.endpoints.hashCode());
        result =
                (result * PRIME)
                        + (this.servicedDatabases == null ? 43 : this.servicedDatabases.hashCode());
        result = (result * PRIME) + (this.servicedAsms == null ? 43 : this.servicedAsms.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
