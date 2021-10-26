/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Configuration summary of a EM Managed External database.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = EmManagedExternalDatabaseConfigurationSummary.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "entitySource"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class EmManagedExternalDatabaseConfigurationSummary extends DatabaseConfigurationSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("databaseInsightId")
        private String databaseInsightId;

        public Builder databaseInsightId(String databaseInsightId) {
            this.databaseInsightId = databaseInsightId;
            this.__explicitlySet__.add("databaseInsightId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseName")
        private String databaseName;

        public Builder databaseName(String databaseName) {
            this.databaseName = databaseName;
            this.__explicitlySet__.add("databaseName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseDisplayName")
        private String databaseDisplayName;

        public Builder databaseDisplayName(String databaseDisplayName) {
            this.databaseDisplayName = databaseDisplayName;
            this.__explicitlySet__.add("databaseDisplayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseType")
        private String databaseType;

        public Builder databaseType(String databaseType) {
            this.databaseType = databaseType;
            this.__explicitlySet__.add("databaseType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseVersion")
        private String databaseVersion;

        public Builder databaseVersion(String databaseVersion) {
            this.databaseVersion = databaseVersion;
            this.__explicitlySet__.add("databaseVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cdbName")
        private String cdbName;

        public Builder cdbName(String cdbName) {
            this.cdbName = cdbName;
            this.__explicitlySet__.add("cdbName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("processorCount")
        private Integer processorCount;

        public Builder processorCount(Integer processorCount) {
            this.processorCount = processorCount;
            this.__explicitlySet__.add("processorCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerIdentifier")
        private String enterpriseManagerIdentifier;

        public Builder enterpriseManagerIdentifier(String enterpriseManagerIdentifier) {
            this.enterpriseManagerIdentifier = enterpriseManagerIdentifier;
            this.__explicitlySet__.add("enterpriseManagerIdentifier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerBridgeId")
        private String enterpriseManagerBridgeId;

        public Builder enterpriseManagerBridgeId(String enterpriseManagerBridgeId) {
            this.enterpriseManagerBridgeId = enterpriseManagerBridgeId;
            this.__explicitlySet__.add("enterpriseManagerBridgeId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("instances")
        private java.util.List<HostInstanceMap> instances;

        public Builder instances(java.util.List<HostInstanceMap> instances) {
            this.instances = instances;
            this.__explicitlySet__.add("instances");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("exadataDetails")
        private ExadataDetails exadataDetails;

        public Builder exadataDetails(ExadataDetails exadataDetails) {
            this.exadataDetails = exadataDetails;
            this.__explicitlySet__.add("exadataDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EmManagedExternalDatabaseConfigurationSummary build() {
            EmManagedExternalDatabaseConfigurationSummary __instance__ =
                    new EmManagedExternalDatabaseConfigurationSummary(
                            databaseInsightId,
                            compartmentId,
                            databaseName,
                            databaseDisplayName,
                            databaseType,
                            databaseVersion,
                            cdbName,
                            definedTags,
                            freeformTags,
                            processorCount,
                            enterpriseManagerIdentifier,
                            enterpriseManagerBridgeId,
                            instances,
                            exadataDetails);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EmManagedExternalDatabaseConfigurationSummary o) {
            Builder copiedBuilder =
                    databaseInsightId(o.getDatabaseInsightId())
                            .compartmentId(o.getCompartmentId())
                            .databaseName(o.getDatabaseName())
                            .databaseDisplayName(o.getDatabaseDisplayName())
                            .databaseType(o.getDatabaseType())
                            .databaseVersion(o.getDatabaseVersion())
                            .cdbName(o.getCdbName())
                            .definedTags(o.getDefinedTags())
                            .freeformTags(o.getFreeformTags())
                            .processorCount(o.getProcessorCount())
                            .enterpriseManagerIdentifier(o.getEnterpriseManagerIdentifier())
                            .enterpriseManagerBridgeId(o.getEnterpriseManagerBridgeId())
                            .instances(o.getInstances())
                            .exadataDetails(o.getExadataDetails());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    @Deprecated
    public EmManagedExternalDatabaseConfigurationSummary(
            String databaseInsightId,
            String compartmentId,
            String databaseName,
            String databaseDisplayName,
            String databaseType,
            String databaseVersion,
            String cdbName,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, String> freeformTags,
            Integer processorCount,
            String enterpriseManagerIdentifier,
            String enterpriseManagerBridgeId,
            java.util.List<HostInstanceMap> instances,
            ExadataDetails exadataDetails) {
        super(
                databaseInsightId,
                compartmentId,
                databaseName,
                databaseDisplayName,
                databaseType,
                databaseVersion,
                cdbName,
                definedTags,
                freeformTags,
                processorCount);
        this.enterpriseManagerIdentifier = enterpriseManagerIdentifier;
        this.enterpriseManagerBridgeId = enterpriseManagerBridgeId;
        this.instances = instances;
        this.exadataDetails = exadataDetails;
    }

    /**
     * Enterprise Manager Unique Identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerIdentifier")
    String enterpriseManagerIdentifier;

    /**
     * OPSI Enterprise Manager Bridge OCID
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerBridgeId")
    String enterpriseManagerBridgeId;

    /**
     * Array of hostname and instance name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instances")
    java.util.List<HostInstanceMap> instances;

    @com.fasterxml.jackson.annotation.JsonProperty("exadataDetails")
    ExadataDetails exadataDetails;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
