/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details of a cloud listener. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CloudListener.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CloudListener extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "dbaasId",
        "displayName",
        "componentName",
        "compartmentId",
        "cloudDbSystemId",
        "cloudConnectorId",
        "cloudDbNodeId",
        "cloudDbHomeId",
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
        "timeUpdated",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public CloudListener(
            String id,
            String dbaasId,
            String displayName,
            String componentName,
            String compartmentId,
            String cloudDbSystemId,
            String cloudConnectorId,
            String cloudDbNodeId,
            String cloudDbHomeId,
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
            java.util.List<CloudListenerEndpoint> endpoints,
            java.util.List<CloudListenerServicedDatabase> servicedDatabases,
            java.util.List<CloudServicedAsm> servicedAsms,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.dbaasId = dbaasId;
        this.displayName = displayName;
        this.componentName = componentName;
        this.compartmentId = compartmentId;
        this.cloudDbSystemId = cloudDbSystemId;
        this.cloudConnectorId = cloudConnectorId;
        this.cloudDbNodeId = cloudDbNodeId;
        this.cloudDbHomeId = cloudDbHomeId;
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
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * cloud listener.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * cloud listener.
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) in
         * DBaas service.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dbaasId")
        private String dbaasId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) in
         * DBaas service.
         *
         * @param dbaasId the value to set
         * @return this builder
         */
        public Builder dbaasId(String dbaasId) {
            this.dbaasId = dbaasId;
            this.__explicitlySet__.add("dbaasId");
            return this;
        }
        /** The user-friendly name for the cloud listener. The name does not have to be unique. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly name for the cloud listener. The name does not have to be unique.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The name of the cloud listener. */
        @com.fasterxml.jackson.annotation.JsonProperty("componentName")
        private String componentName;

        /**
         * The name of the cloud listener.
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * cloud DB system that the listener is a part of.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("cloudDbSystemId")
        private String cloudDbSystemId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * cloud DB system that the listener is a part of.
         *
         * @param cloudDbSystemId the value to set
         * @return this builder
         */
        public Builder cloudDbSystemId(String cloudDbSystemId) {
            this.cloudDbSystemId = cloudDbSystemId;
            this.__explicitlySet__.add("cloudDbSystemId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * cloud connector.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("cloudConnectorId")
        private String cloudConnectorId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * cloud connector.
         *
         * @param cloudConnectorId the value to set
         * @return this builder
         */
        public Builder cloudConnectorId(String cloudConnectorId) {
            this.cloudConnectorId = cloudConnectorId;
            this.__explicitlySet__.add("cloudConnectorId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * cloud DB node.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("cloudDbNodeId")
        private String cloudDbNodeId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * cloud DB node.
         *
         * @param cloudDbNodeId the value to set
         * @return this builder
         */
        public Builder cloudDbNodeId(String cloudDbNodeId) {
            this.cloudDbNodeId = cloudDbNodeId;
            this.__explicitlySet__.add("cloudDbNodeId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * cloud DB home.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("cloudDbHomeId")
        private String cloudDbHomeId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * cloud DB home.
         *
         * @param cloudDbHomeId the value to set
         * @return this builder
         */
        public Builder cloudDbHomeId(String cloudDbHomeId) {
            this.cloudDbHomeId = cloudDbHomeId;
            this.__explicitlySet__.add("cloudDbHomeId");
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
         * The additional details of the cloud listener defined in {@code {"key": "value"}} format.
         * Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("additionalDetails")
        private java.util.Map<String, String> additionalDetails;

        /**
         * The additional details of the cloud listener defined in {@code {"key": "value"}} format.
         * Example: {@code {"bar-key": "value"}}
         *
         * @param additionalDetails the value to set
         * @return this builder
         */
        public Builder additionalDetails(java.util.Map<String, String> additionalDetails) {
            this.additionalDetails = additionalDetails;
            this.__explicitlySet__.add("additionalDetails");
            return this;
        }
        /** The current lifecycle state of the cloud listener. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current lifecycle state of the cloud listener.
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
        /** The name of the host on which the cloud listener is running. */
        @com.fasterxml.jackson.annotation.JsonProperty("hostName")
        private String hostName;

        /**
         * The name of the host on which the cloud listener is running.
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
        private java.util.List<CloudListenerEndpoint> endpoints;

        /**
         * The list of protocol addresses the listener is configured to listen on.
         *
         * @param endpoints the value to set
         * @return this builder
         */
        public Builder endpoints(java.util.List<CloudListenerEndpoint> endpoints) {
            this.endpoints = endpoints;
            this.__explicitlySet__.add("endpoints");
            return this;
        }
        /** The list of databases that are serviced by the listener. */
        @com.fasterxml.jackson.annotation.JsonProperty("servicedDatabases")
        private java.util.List<CloudListenerServicedDatabase> servicedDatabases;

        /**
         * The list of databases that are serviced by the listener.
         *
         * @param servicedDatabases the value to set
         * @return this builder
         */
        public Builder servicedDatabases(
                java.util.List<CloudListenerServicedDatabase> servicedDatabases) {
            this.servicedDatabases = servicedDatabases;
            this.__explicitlySet__.add("servicedDatabases");
            return this;
        }
        /** The list of ASMs that are serviced by the listener. */
        @com.fasterxml.jackson.annotation.JsonProperty("servicedAsms")
        private java.util.List<CloudServicedAsm> servicedAsms;

        /**
         * The list of ASMs that are serviced by the listener.
         *
         * @param servicedAsms the value to set
         * @return this builder
         */
        public Builder servicedAsms(java.util.List<CloudServicedAsm> servicedAsms) {
            this.servicedAsms = servicedAsms;
            this.__explicitlySet__.add("servicedAsms");
            return this;
        }
        /** The date and time the cloud listener was created. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the cloud listener was created.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The date and time the cloud listener was last updated. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the cloud listener was last updated.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
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
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. For more
         * information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). System
         * tags can be viewed by users, but can only be created by the system.
         *
         * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. For more
         * information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). System
         * tags can be viewed by users, but can only be created by the system.
         *
         * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CloudListener build() {
            CloudListener model =
                    new CloudListener(
                            this.id,
                            this.dbaasId,
                            this.displayName,
                            this.componentName,
                            this.compartmentId,
                            this.cloudDbSystemId,
                            this.cloudConnectorId,
                            this.cloudDbNodeId,
                            this.cloudDbHomeId,
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
                            this.timeUpdated,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CloudListener model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("dbaasId")) {
                this.dbaasId(model.getDbaasId());
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
            if (model.wasPropertyExplicitlySet("cloudDbSystemId")) {
                this.cloudDbSystemId(model.getCloudDbSystemId());
            }
            if (model.wasPropertyExplicitlySet("cloudConnectorId")) {
                this.cloudConnectorId(model.getCloudConnectorId());
            }
            if (model.wasPropertyExplicitlySet("cloudDbNodeId")) {
                this.cloudDbNodeId(model.getCloudDbNodeId());
            }
            if (model.wasPropertyExplicitlySet("cloudDbHomeId")) {
                this.cloudDbHomeId(model.getCloudDbHomeId());
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
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * cloud listener.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * cloud listener.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) in DBaas
     * service.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dbaasId")
    private final String dbaasId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) in DBaas
     * service.
     *
     * @return the value
     */
    public String getDbaasId() {
        return dbaasId;
    }

    /** The user-friendly name for the cloud listener. The name does not have to be unique. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly name for the cloud listener. The name does not have to be unique.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The name of the cloud listener. */
    @com.fasterxml.jackson.annotation.JsonProperty("componentName")
    private final String componentName;

    /**
     * The name of the cloud listener.
     *
     * @return the value
     */
    public String getComponentName() {
        return componentName;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * cloud DB system that the listener is a part of.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cloudDbSystemId")
    private final String cloudDbSystemId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * cloud DB system that the listener is a part of.
     *
     * @return the value
     */
    public String getCloudDbSystemId() {
        return cloudDbSystemId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * cloud connector.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cloudConnectorId")
    private final String cloudConnectorId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * cloud connector.
     *
     * @return the value
     */
    public String getCloudConnectorId() {
        return cloudConnectorId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * cloud DB node.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cloudDbNodeId")
    private final String cloudDbNodeId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * cloud DB node.
     *
     * @return the value
     */
    public String getCloudDbNodeId() {
        return cloudDbNodeId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * cloud DB home.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cloudDbHomeId")
    private final String cloudDbHomeId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * cloud DB home.
     *
     * @return the value
     */
    public String getCloudDbHomeId() {
        return cloudDbHomeId;
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
     * The additional details of the cloud listener defined in {@code {"key": "value"}} format.
     * Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("additionalDetails")
    private final java.util.Map<String, String> additionalDetails;

    /**
     * The additional details of the cloud listener defined in {@code {"key": "value"}} format.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getAdditionalDetails() {
        return additionalDetails;
    }

    /** The current lifecycle state of the cloud listener. */
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
    /** The current lifecycle state of the cloud listener. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current lifecycle state of the cloud listener.
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

    /** The name of the host on which the cloud listener is running. */
    @com.fasterxml.jackson.annotation.JsonProperty("hostName")
    private final String hostName;

    /**
     * The name of the host on which the cloud listener is running.
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
    private final java.util.List<CloudListenerEndpoint> endpoints;

    /**
     * The list of protocol addresses the listener is configured to listen on.
     *
     * @return the value
     */
    public java.util.List<CloudListenerEndpoint> getEndpoints() {
        return endpoints;
    }

    /** The list of databases that are serviced by the listener. */
    @com.fasterxml.jackson.annotation.JsonProperty("servicedDatabases")
    private final java.util.List<CloudListenerServicedDatabase> servicedDatabases;

    /**
     * The list of databases that are serviced by the listener.
     *
     * @return the value
     */
    public java.util.List<CloudListenerServicedDatabase> getServicedDatabases() {
        return servicedDatabases;
    }

    /** The list of ASMs that are serviced by the listener. */
    @com.fasterxml.jackson.annotation.JsonProperty("servicedAsms")
    private final java.util.List<CloudServicedAsm> servicedAsms;

    /**
     * The list of ASMs that are serviced by the listener.
     *
     * @return the value
     */
    public java.util.List<CloudServicedAsm> getServicedAsms() {
        return servicedAsms;
    }

    /** The date and time the cloud listener was created. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the cloud listener was created.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The date and time the cloud listener was last updated. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the cloud listener was last updated.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). System tags
     * can be viewed by users, but can only be created by the system.
     *
     * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). System tags
     * can be viewed by users, but can only be created by the system.
     *
     * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("CloudListener(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", dbaasId=").append(String.valueOf(this.dbaasId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", componentName=").append(String.valueOf(this.componentName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", cloudDbSystemId=").append(String.valueOf(this.cloudDbSystemId));
        sb.append(", cloudConnectorId=").append(String.valueOf(this.cloudConnectorId));
        sb.append(", cloudDbNodeId=").append(String.valueOf(this.cloudDbNodeId));
        sb.append(", cloudDbHomeId=").append(String.valueOf(this.cloudDbHomeId));
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
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CloudListener)) {
            return false;
        }

        CloudListener other = (CloudListener) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.dbaasId, other.dbaasId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.componentName, other.componentName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.cloudDbSystemId, other.cloudDbSystemId)
                && java.util.Objects.equals(this.cloudConnectorId, other.cloudConnectorId)
                && java.util.Objects.equals(this.cloudDbNodeId, other.cloudDbNodeId)
                && java.util.Objects.equals(this.cloudDbHomeId, other.cloudDbHomeId)
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
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.dbaasId == null ? 43 : this.dbaasId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.componentName == null ? 43 : this.componentName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.cloudDbSystemId == null ? 43 : this.cloudDbSystemId.hashCode());
        result =
                (result * PRIME)
                        + (this.cloudConnectorId == null ? 43 : this.cloudConnectorId.hashCode());
        result =
                (result * PRIME)
                        + (this.cloudDbNodeId == null ? 43 : this.cloudDbNodeId.hashCode());
        result =
                (result * PRIME)
                        + (this.cloudDbHomeId == null ? 43 : this.cloudDbHomeId.hashCode());
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
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
