/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * EM-managed Exadata insight resource. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = EmManagedExternalExadataInsight.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "entitySource")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class EmManagedExternalExadataInsight extends ExadataInsight {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("exadataName")
        private String exadataName;

        public Builder exadataName(String exadataName) {
            this.exadataName = exadataName;
            this.__explicitlySet__.add("exadataName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("exadataDisplayName")
        private String exadataDisplayName;

        public Builder exadataDisplayName(String exadataDisplayName) {
            this.exadataDisplayName = exadataDisplayName;
            this.__explicitlySet__.add("exadataDisplayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("exadataType")
        private ExadataType exadataType;

        public Builder exadataType(ExadataType exadataType) {
            this.exadataType = exadataType;
            this.__explicitlySet__.add("exadataType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("exadataRackType")
        private ExadataRackType exadataRackType;

        public Builder exadataRackType(ExadataRackType exadataRackType) {
            this.exadataRackType = exadataRackType;
            this.__explicitlySet__.add("exadataRackType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isVirtualizedExadata")
        private Boolean isVirtualizedExadata;

        public Builder isVirtualizedExadata(Boolean isVirtualizedExadata) {
            this.isVirtualizedExadata = isVirtualizedExadata;
            this.__explicitlySet__.add("isVirtualizedExadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private ResourceStatus status;

        public Builder status(ResourceStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
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

        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private ExadataInsightLifecycleState lifecycleState;

        public Builder lifecycleState(ExadataInsightLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
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
        /** Enterprise Manager Entity Name */
        @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerEntityName")
        private String enterpriseManagerEntityName;

        /**
         * Enterprise Manager Entity Name
         *
         * @param enterpriseManagerEntityName the value to set
         * @return this builder
         */
        public Builder enterpriseManagerEntityName(String enterpriseManagerEntityName) {
            this.enterpriseManagerEntityName = enterpriseManagerEntityName;
            this.__explicitlySet__.add("enterpriseManagerEntityName");
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
        /** Enterprise Manager Entity Display Name */
        @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerEntityDisplayName")
        private String enterpriseManagerEntityDisplayName;

        /**
         * Enterprise Manager Entity Display Name
         *
         * @param enterpriseManagerEntityDisplayName the value to set
         * @return this builder
         */
        public Builder enterpriseManagerEntityDisplayName(
                String enterpriseManagerEntityDisplayName) {
            this.enterpriseManagerEntityDisplayName = enterpriseManagerEntityDisplayName;
            this.__explicitlySet__.add("enterpriseManagerEntityDisplayName");
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
        /**
         * Set to true to enable automatic enablement and disablement of related targets from
         * Enterprise Manager. New resources (e.g. Database Insights) will be placed in the same
         * compartment as the related Exadata Insight.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isAutoSyncEnabled")
        private Boolean isAutoSyncEnabled;

        /**
         * Set to true to enable automatic enablement and disablement of related targets from
         * Enterprise Manager. New resources (e.g. Database Insights) will be placed in the same
         * compartment as the related Exadata Insight.
         *
         * @param isAutoSyncEnabled the value to set
         * @return this builder
         */
        public Builder isAutoSyncEnabled(Boolean isAutoSyncEnabled) {
            this.isAutoSyncEnabled = isAutoSyncEnabled;
            this.__explicitlySet__.add("isAutoSyncEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EmManagedExternalExadataInsight build() {
            EmManagedExternalExadataInsight model =
                    new EmManagedExternalExadataInsight(
                            this.id,
                            this.compartmentId,
                            this.exadataName,
                            this.exadataDisplayName,
                            this.exadataType,
                            this.exadataRackType,
                            this.isVirtualizedExadata,
                            this.status,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.enterpriseManagerIdentifier,
                            this.enterpriseManagerEntityName,
                            this.enterpriseManagerEntityType,
                            this.enterpriseManagerEntityIdentifier,
                            this.enterpriseManagerEntityDisplayName,
                            this.enterpriseManagerBridgeId,
                            this.isAutoSyncEnabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EmManagedExternalExadataInsight model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("exadataName")) {
                this.exadataName(model.getExadataName());
            }
            if (model.wasPropertyExplicitlySet("exadataDisplayName")) {
                this.exadataDisplayName(model.getExadataDisplayName());
            }
            if (model.wasPropertyExplicitlySet("exadataType")) {
                this.exadataType(model.getExadataType());
            }
            if (model.wasPropertyExplicitlySet("exadataRackType")) {
                this.exadataRackType(model.getExadataRackType());
            }
            if (model.wasPropertyExplicitlySet("isVirtualizedExadata")) {
                this.isVirtualizedExadata(model.getIsVirtualizedExadata());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
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
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("enterpriseManagerIdentifier")) {
                this.enterpriseManagerIdentifier(model.getEnterpriseManagerIdentifier());
            }
            if (model.wasPropertyExplicitlySet("enterpriseManagerEntityName")) {
                this.enterpriseManagerEntityName(model.getEnterpriseManagerEntityName());
            }
            if (model.wasPropertyExplicitlySet("enterpriseManagerEntityType")) {
                this.enterpriseManagerEntityType(model.getEnterpriseManagerEntityType());
            }
            if (model.wasPropertyExplicitlySet("enterpriseManagerEntityIdentifier")) {
                this.enterpriseManagerEntityIdentifier(
                        model.getEnterpriseManagerEntityIdentifier());
            }
            if (model.wasPropertyExplicitlySet("enterpriseManagerEntityDisplayName")) {
                this.enterpriseManagerEntityDisplayName(
                        model.getEnterpriseManagerEntityDisplayName());
            }
            if (model.wasPropertyExplicitlySet("enterpriseManagerBridgeId")) {
                this.enterpriseManagerBridgeId(model.getEnterpriseManagerBridgeId());
            }
            if (model.wasPropertyExplicitlySet("isAutoSyncEnabled")) {
                this.isAutoSyncEnabled(model.getIsAutoSyncEnabled());
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
    public EmManagedExternalExadataInsight(
            String id,
            String compartmentId,
            String exadataName,
            String exadataDisplayName,
            ExadataType exadataType,
            ExadataRackType exadataRackType,
            Boolean isVirtualizedExadata,
            ResourceStatus status,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            ExadataInsightLifecycleState lifecycleState,
            String lifecycleDetails,
            String enterpriseManagerIdentifier,
            String enterpriseManagerEntityName,
            String enterpriseManagerEntityType,
            String enterpriseManagerEntityIdentifier,
            String enterpriseManagerEntityDisplayName,
            String enterpriseManagerBridgeId,
            Boolean isAutoSyncEnabled) {
        super(
                id,
                compartmentId,
                exadataName,
                exadataDisplayName,
                exadataType,
                exadataRackType,
                isVirtualizedExadata,
                status,
                freeformTags,
                definedTags,
                systemTags,
                timeCreated,
                timeUpdated,
                lifecycleState,
                lifecycleDetails);
        this.enterpriseManagerIdentifier = enterpriseManagerIdentifier;
        this.enterpriseManagerEntityName = enterpriseManagerEntityName;
        this.enterpriseManagerEntityType = enterpriseManagerEntityType;
        this.enterpriseManagerEntityIdentifier = enterpriseManagerEntityIdentifier;
        this.enterpriseManagerEntityDisplayName = enterpriseManagerEntityDisplayName;
        this.enterpriseManagerBridgeId = enterpriseManagerBridgeId;
        this.isAutoSyncEnabled = isAutoSyncEnabled;
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

    /** Enterprise Manager Entity Name */
    @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerEntityName")
    private final String enterpriseManagerEntityName;

    /**
     * Enterprise Manager Entity Name
     *
     * @return the value
     */
    public String getEnterpriseManagerEntityName() {
        return enterpriseManagerEntityName;
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

    /** Enterprise Manager Entity Display Name */
    @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerEntityDisplayName")
    private final String enterpriseManagerEntityDisplayName;

    /**
     * Enterprise Manager Entity Display Name
     *
     * @return the value
     */
    public String getEnterpriseManagerEntityDisplayName() {
        return enterpriseManagerEntityDisplayName;
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

    /**
     * Set to true to enable automatic enablement and disablement of related targets from Enterprise
     * Manager. New resources (e.g. Database Insights) will be placed in the same compartment as the
     * related Exadata Insight.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoSyncEnabled")
    private final Boolean isAutoSyncEnabled;

    /**
     * Set to true to enable automatic enablement and disablement of related targets from Enterprise
     * Manager. New resources (e.g. Database Insights) will be placed in the same compartment as the
     * related Exadata Insight.
     *
     * @return the value
     */
    public Boolean getIsAutoSyncEnabled() {
        return isAutoSyncEnabled;
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
        sb.append("EmManagedExternalExadataInsight(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", enterpriseManagerIdentifier=")
                .append(String.valueOf(this.enterpriseManagerIdentifier));
        sb.append(", enterpriseManagerEntityName=")
                .append(String.valueOf(this.enterpriseManagerEntityName));
        sb.append(", enterpriseManagerEntityType=")
                .append(String.valueOf(this.enterpriseManagerEntityType));
        sb.append(", enterpriseManagerEntityIdentifier=")
                .append(String.valueOf(this.enterpriseManagerEntityIdentifier));
        sb.append(", enterpriseManagerEntityDisplayName=")
                .append(String.valueOf(this.enterpriseManagerEntityDisplayName));
        sb.append(", enterpriseManagerBridgeId=")
                .append(String.valueOf(this.enterpriseManagerBridgeId));
        sb.append(", isAutoSyncEnabled=").append(String.valueOf(this.isAutoSyncEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EmManagedExternalExadataInsight)) {
            return false;
        }

        EmManagedExternalExadataInsight other = (EmManagedExternalExadataInsight) o;
        return java.util.Objects.equals(
                        this.enterpriseManagerIdentifier, other.enterpriseManagerIdentifier)
                && java.util.Objects.equals(
                        this.enterpriseManagerEntityName, other.enterpriseManagerEntityName)
                && java.util.Objects.equals(
                        this.enterpriseManagerEntityType, other.enterpriseManagerEntityType)
                && java.util.Objects.equals(
                        this.enterpriseManagerEntityIdentifier,
                        other.enterpriseManagerEntityIdentifier)
                && java.util.Objects.equals(
                        this.enterpriseManagerEntityDisplayName,
                        other.enterpriseManagerEntityDisplayName)
                && java.util.Objects.equals(
                        this.enterpriseManagerBridgeId, other.enterpriseManagerBridgeId)
                && java.util.Objects.equals(this.isAutoSyncEnabled, other.isAutoSyncEnabled)
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
                        + (this.enterpriseManagerEntityName == null
                                ? 43
                                : this.enterpriseManagerEntityName.hashCode());
        result =
                (result * PRIME)
                        + (this.enterpriseManagerEntityType == null
                                ? 43
                                : this.enterpriseManagerEntityType.hashCode());
        result =
                (result * PRIME)
                        + (this.enterpriseManagerEntityIdentifier == null
                                ? 43
                                : this.enterpriseManagerEntityIdentifier.hashCode());
        result =
                (result * PRIME)
                        + (this.enterpriseManagerEntityDisplayName == null
                                ? 43
                                : this.enterpriseManagerEntityDisplayName.hashCode());
        result =
                (result * PRIME)
                        + (this.enterpriseManagerBridgeId == null
                                ? 43
                                : this.enterpriseManagerBridgeId.hashCode());
        result =
                (result * PRIME)
                        + (this.isAutoSyncEnabled == null ? 43 : this.isAutoSyncEnabled.hashCode());
        return result;
    }
}
