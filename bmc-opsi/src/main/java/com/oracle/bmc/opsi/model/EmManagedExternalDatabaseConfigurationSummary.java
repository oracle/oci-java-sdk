/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Configuration summary of a EM Managed External database. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = EmManagedExternalDatabaseConfigurationSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "entitySource")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class EmManagedExternalDatabaseConfigurationSummary
        extends DatabaseConfigurationSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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
        /** Enterprise Manager Unique Identifier */
        @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerIdentifier")
        private String enterpriseManagerIdentifier;

        /**
         * Enterprise Manager Unique Identifier
         *
         * @param enterpriseManagerIdentifier the value to set
         * @return this builder
         */
        public Builder enterpriseManagerIdentifier(String enterpriseManagerIdentifier) {
            this.enterpriseManagerIdentifier = enterpriseManagerIdentifier;
            this.__explicitlySet__.add("enterpriseManagerIdentifier");
            return this;
        }
        /** OPSI Enterprise Manager Bridge OCID */
        @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerBridgeId")
        private String enterpriseManagerBridgeId;

        /**
         * OPSI Enterprise Manager Bridge OCID
         *
         * @param enterpriseManagerBridgeId the value to set
         * @return this builder
         */
        public Builder enterpriseManagerBridgeId(String enterpriseManagerBridgeId) {
            this.enterpriseManagerBridgeId = enterpriseManagerBridgeId;
            this.__explicitlySet__.add("enterpriseManagerBridgeId");
            return this;
        }
        /** Array of hostname and instance name. */
        @com.fasterxml.jackson.annotation.JsonProperty("instances")
        private java.util.List<HostInstanceMap> instances;

        /**
         * Array of hostname and instance name.
         *
         * @param instances the value to set
         * @return this builder
         */
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
        /** Enterprise Manager Entity Unique Identifier */
        @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerEntityIdentifier")
        private String enterpriseManagerEntityIdentifier;

        /**
         * Enterprise Manager Entity Unique Identifier
         *
         * @param enterpriseManagerEntityIdentifier the value to set
         * @return this builder
         */
        public Builder enterpriseManagerEntityIdentifier(String enterpriseManagerEntityIdentifier) {
            this.enterpriseManagerEntityIdentifier = enterpriseManagerEntityIdentifier;
            this.__explicitlySet__.add("enterpriseManagerEntityIdentifier");
            return this;
        }
        /** Enterprise Manager Console Url */
        @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerConsoleUrl")
        private String enterpriseManagerConsoleUrl;

        /**
         * Enterprise Manager Console Url
         *
         * @param enterpriseManagerConsoleUrl the value to set
         * @return this builder
         */
        public Builder enterpriseManagerConsoleUrl(String enterpriseManagerConsoleUrl) {
            this.enterpriseManagerConsoleUrl = enterpriseManagerConsoleUrl;
            this.__explicitlySet__.add("enterpriseManagerConsoleUrl");
            return this;
        }
        /** Enterprise Manager OMS Version */
        @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerOmsVer")
        private String enterpriseManagerOmsVer;

        /**
         * Enterprise Manager OMS Version
         *
         * @param enterpriseManagerOmsVer the value to set
         * @return this builder
         */
        public Builder enterpriseManagerOmsVer(String enterpriseManagerOmsVer) {
            this.enterpriseManagerOmsVer = enterpriseManagerOmsVer;
            this.__explicitlySet__.add("enterpriseManagerOmsVer");
            return this;
        }
        /** Enterprise Manager Entity Type */
        @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerEntityType")
        private String enterpriseManagerEntityType;

        /**
         * Enterprise Manager Entity Type
         *
         * @param enterpriseManagerEntityType the value to set
         * @return this builder
         */
        public Builder enterpriseManagerEntityType(String enterpriseManagerEntityType) {
            this.enterpriseManagerEntityType = enterpriseManagerEntityType;
            this.__explicitlySet__.add("enterpriseManagerEntityType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EmManagedExternalDatabaseConfigurationSummary build() {
            EmManagedExternalDatabaseConfigurationSummary model =
                    new EmManagedExternalDatabaseConfigurationSummary(
                            this.databaseInsightId,
                            this.compartmentId,
                            this.databaseName,
                            this.databaseDisplayName,
                            this.databaseType,
                            this.databaseVersion,
                            this.cdbName,
                            this.definedTags,
                            this.freeformTags,
                            this.processorCount,
                            this.enterpriseManagerIdentifier,
                            this.enterpriseManagerBridgeId,
                            this.instances,
                            this.exadataDetails,
                            this.enterpriseManagerEntityIdentifier,
                            this.enterpriseManagerConsoleUrl,
                            this.enterpriseManagerOmsVer,
                            this.enterpriseManagerEntityType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EmManagedExternalDatabaseConfigurationSummary model) {
            if (model.wasPropertyExplicitlySet("databaseInsightId")) {
                this.databaseInsightId(model.getDatabaseInsightId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("databaseName")) {
                this.databaseName(model.getDatabaseName());
            }
            if (model.wasPropertyExplicitlySet("databaseDisplayName")) {
                this.databaseDisplayName(model.getDatabaseDisplayName());
            }
            if (model.wasPropertyExplicitlySet("databaseType")) {
                this.databaseType(model.getDatabaseType());
            }
            if (model.wasPropertyExplicitlySet("databaseVersion")) {
                this.databaseVersion(model.getDatabaseVersion());
            }
            if (model.wasPropertyExplicitlySet("cdbName")) {
                this.cdbName(model.getCdbName());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("processorCount")) {
                this.processorCount(model.getProcessorCount());
            }
            if (model.wasPropertyExplicitlySet("enterpriseManagerIdentifier")) {
                this.enterpriseManagerIdentifier(model.getEnterpriseManagerIdentifier());
            }
            if (model.wasPropertyExplicitlySet("enterpriseManagerBridgeId")) {
                this.enterpriseManagerBridgeId(model.getEnterpriseManagerBridgeId());
            }
            if (model.wasPropertyExplicitlySet("instances")) {
                this.instances(model.getInstances());
            }
            if (model.wasPropertyExplicitlySet("exadataDetails")) {
                this.exadataDetails(model.getExadataDetails());
            }
            if (model.wasPropertyExplicitlySet("enterpriseManagerEntityIdentifier")) {
                this.enterpriseManagerEntityIdentifier(
                        model.getEnterpriseManagerEntityIdentifier());
            }
            if (model.wasPropertyExplicitlySet("enterpriseManagerConsoleUrl")) {
                this.enterpriseManagerConsoleUrl(model.getEnterpriseManagerConsoleUrl());
            }
            if (model.wasPropertyExplicitlySet("enterpriseManagerOmsVer")) {
                this.enterpriseManagerOmsVer(model.getEnterpriseManagerOmsVer());
            }
            if (model.wasPropertyExplicitlySet("enterpriseManagerEntityType")) {
                this.enterpriseManagerEntityType(model.getEnterpriseManagerEntityType());
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
            ExadataDetails exadataDetails,
            String enterpriseManagerEntityIdentifier,
            String enterpriseManagerConsoleUrl,
            String enterpriseManagerOmsVer,
            String enterpriseManagerEntityType) {
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
        this.enterpriseManagerEntityIdentifier = enterpriseManagerEntityIdentifier;
        this.enterpriseManagerConsoleUrl = enterpriseManagerConsoleUrl;
        this.enterpriseManagerOmsVer = enterpriseManagerOmsVer;
        this.enterpriseManagerEntityType = enterpriseManagerEntityType;
    }

    /** Enterprise Manager Unique Identifier */
    @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerIdentifier")
    private final String enterpriseManagerIdentifier;

    /**
     * Enterprise Manager Unique Identifier
     *
     * @return the value
     */
    public String getEnterpriseManagerIdentifier() {
        return enterpriseManagerIdentifier;
    }

    /** OPSI Enterprise Manager Bridge OCID */
    @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerBridgeId")
    private final String enterpriseManagerBridgeId;

    /**
     * OPSI Enterprise Manager Bridge OCID
     *
     * @return the value
     */
    public String getEnterpriseManagerBridgeId() {
        return enterpriseManagerBridgeId;
    }

    /** Array of hostname and instance name. */
    @com.fasterxml.jackson.annotation.JsonProperty("instances")
    private final java.util.List<HostInstanceMap> instances;

    /**
     * Array of hostname and instance name.
     *
     * @return the value
     */
    public java.util.List<HostInstanceMap> getInstances() {
        return instances;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("exadataDetails")
    private final ExadataDetails exadataDetails;

    public ExadataDetails getExadataDetails() {
        return exadataDetails;
    }

    /** Enterprise Manager Entity Unique Identifier */
    @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerEntityIdentifier")
    private final String enterpriseManagerEntityIdentifier;

    /**
     * Enterprise Manager Entity Unique Identifier
     *
     * @return the value
     */
    public String getEnterpriseManagerEntityIdentifier() {
        return enterpriseManagerEntityIdentifier;
    }

    /** Enterprise Manager Console Url */
    @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerConsoleUrl")
    private final String enterpriseManagerConsoleUrl;

    /**
     * Enterprise Manager Console Url
     *
     * @return the value
     */
    public String getEnterpriseManagerConsoleUrl() {
        return enterpriseManagerConsoleUrl;
    }

    /** Enterprise Manager OMS Version */
    @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerOmsVer")
    private final String enterpriseManagerOmsVer;

    /**
     * Enterprise Manager OMS Version
     *
     * @return the value
     */
    public String getEnterpriseManagerOmsVer() {
        return enterpriseManagerOmsVer;
    }

    /** Enterprise Manager Entity Type */
    @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerEntityType")
    private final String enterpriseManagerEntityType;

    /**
     * Enterprise Manager Entity Type
     *
     * @return the value
     */
    public String getEnterpriseManagerEntityType() {
        return enterpriseManagerEntityType;
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
        sb.append("EmManagedExternalDatabaseConfigurationSummary(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", enterpriseManagerIdentifier=")
                .append(String.valueOf(this.enterpriseManagerIdentifier));
        sb.append(", enterpriseManagerBridgeId=")
                .append(String.valueOf(this.enterpriseManagerBridgeId));
        sb.append(", instances=").append(String.valueOf(this.instances));
        sb.append(", exadataDetails=").append(String.valueOf(this.exadataDetails));
        sb.append(", enterpriseManagerEntityIdentifier=")
                .append(String.valueOf(this.enterpriseManagerEntityIdentifier));
        sb.append(", enterpriseManagerConsoleUrl=")
                .append(String.valueOf(this.enterpriseManagerConsoleUrl));
        sb.append(", enterpriseManagerOmsVer=")
                .append(String.valueOf(this.enterpriseManagerOmsVer));
        sb.append(", enterpriseManagerEntityType=")
                .append(String.valueOf(this.enterpriseManagerEntityType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EmManagedExternalDatabaseConfigurationSummary)) {
            return false;
        }

        EmManagedExternalDatabaseConfigurationSummary other =
                (EmManagedExternalDatabaseConfigurationSummary) o;
        return java.util.Objects.equals(
                        this.enterpriseManagerIdentifier, other.enterpriseManagerIdentifier)
                && java.util.Objects.equals(
                        this.enterpriseManagerBridgeId, other.enterpriseManagerBridgeId)
                && java.util.Objects.equals(this.instances, other.instances)
                && java.util.Objects.equals(this.exadataDetails, other.exadataDetails)
                && java.util.Objects.equals(
                        this.enterpriseManagerEntityIdentifier,
                        other.enterpriseManagerEntityIdentifier)
                && java.util.Objects.equals(
                        this.enterpriseManagerConsoleUrl, other.enterpriseManagerConsoleUrl)
                && java.util.Objects.equals(
                        this.enterpriseManagerOmsVer, other.enterpriseManagerOmsVer)
                && java.util.Objects.equals(
                        this.enterpriseManagerEntityType, other.enterpriseManagerEntityType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.enterpriseManagerIdentifier == null
                                ? 43
                                : this.enterpriseManagerIdentifier.hashCode());
        result =
                (result * PRIME)
                        + (this.enterpriseManagerBridgeId == null
                                ? 43
                                : this.enterpriseManagerBridgeId.hashCode());
        result = (result * PRIME) + (this.instances == null ? 43 : this.instances.hashCode());
        result =
                (result * PRIME)
                        + (this.exadataDetails == null ? 43 : this.exadataDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.enterpriseManagerEntityIdentifier == null
                                ? 43
                                : this.enterpriseManagerEntityIdentifier.hashCode());
        result =
                (result * PRIME)
                        + (this.enterpriseManagerConsoleUrl == null
                                ? 43
                                : this.enterpriseManagerConsoleUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.enterpriseManagerOmsVer == null
                                ? 43
                                : this.enterpriseManagerOmsVer.hashCode());
        result =
                (result * PRIME)
                        + (this.enterpriseManagerEntityType == null
                                ? 43
                                : this.enterpriseManagerEntityType.hashCode());
        return result;
    }
}
