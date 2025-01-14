/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * The information about the Exadata system to be analyzed. If memberEntityDetails is not specified,
 * the the Enterprise Manager entity (e.g. databases and hosts) associated with an Exadata system
 * will be placed in the same compartment as the Exadata system. <br>
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
        builder = CreateEmManagedExternalExadataInsightDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "entitySource")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateEmManagedExternalExadataInsightDetails
        extends CreateExadataInsightDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
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

        @com.fasterxml.jackson.annotation.JsonProperty("memberEntityDetails")
        private java.util.List<CreateEmManagedExternalExadataMemberEntityDetails>
                memberEntityDetails;

        public Builder memberEntityDetails(
                java.util.List<CreateEmManagedExternalExadataMemberEntityDetails>
                        memberEntityDetails) {
            this.memberEntityDetails = memberEntityDetails;
            this.__explicitlySet__.add("memberEntityDetails");
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

        public CreateEmManagedExternalExadataInsightDetails build() {
            CreateEmManagedExternalExadataInsightDetails model =
                    new CreateEmManagedExternalExadataInsightDetails(
                            this.compartmentId,
                            this.freeformTags,
                            this.definedTags,
                            this.enterpriseManagerIdentifier,
                            this.enterpriseManagerBridgeId,
                            this.enterpriseManagerEntityIdentifier,
                            this.memberEntityDetails,
                            this.isAutoSyncEnabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateEmManagedExternalExadataInsightDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("enterpriseManagerIdentifier")) {
                this.enterpriseManagerIdentifier(model.getEnterpriseManagerIdentifier());
            }
            if (model.wasPropertyExplicitlySet("enterpriseManagerBridgeId")) {
                this.enterpriseManagerBridgeId(model.getEnterpriseManagerBridgeId());
            }
            if (model.wasPropertyExplicitlySet("enterpriseManagerEntityIdentifier")) {
                this.enterpriseManagerEntityIdentifier(
                        model.getEnterpriseManagerEntityIdentifier());
            }
            if (model.wasPropertyExplicitlySet("memberEntityDetails")) {
                this.memberEntityDetails(model.getMemberEntityDetails());
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
    public CreateEmManagedExternalExadataInsightDetails(
            String compartmentId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String enterpriseManagerIdentifier,
            String enterpriseManagerBridgeId,
            String enterpriseManagerEntityIdentifier,
            java.util.List<CreateEmManagedExternalExadataMemberEntityDetails> memberEntityDetails,
            Boolean isAutoSyncEnabled) {
        super(compartmentId, freeformTags, definedTags);
        this.enterpriseManagerIdentifier = enterpriseManagerIdentifier;
        this.enterpriseManagerBridgeId = enterpriseManagerBridgeId;
        this.enterpriseManagerEntityIdentifier = enterpriseManagerEntityIdentifier;
        this.memberEntityDetails = memberEntityDetails;
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

    @com.fasterxml.jackson.annotation.JsonProperty("memberEntityDetails")
    private final java.util.List<CreateEmManagedExternalExadataMemberEntityDetails>
            memberEntityDetails;

    public java.util.List<CreateEmManagedExternalExadataMemberEntityDetails>
            getMemberEntityDetails() {
        return memberEntityDetails;
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
        sb.append("CreateEmManagedExternalExadataInsightDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", enterpriseManagerIdentifier=")
                .append(String.valueOf(this.enterpriseManagerIdentifier));
        sb.append(", enterpriseManagerBridgeId=")
                .append(String.valueOf(this.enterpriseManagerBridgeId));
        sb.append(", enterpriseManagerEntityIdentifier=")
                .append(String.valueOf(this.enterpriseManagerEntityIdentifier));
        sb.append(", memberEntityDetails=").append(String.valueOf(this.memberEntityDetails));
        sb.append(", isAutoSyncEnabled=").append(String.valueOf(this.isAutoSyncEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateEmManagedExternalExadataInsightDetails)) {
            return false;
        }

        CreateEmManagedExternalExadataInsightDetails other =
                (CreateEmManagedExternalExadataInsightDetails) o;
        return java.util.Objects.equals(
                        this.enterpriseManagerIdentifier, other.enterpriseManagerIdentifier)
                && java.util.Objects.equals(
                        this.enterpriseManagerBridgeId, other.enterpriseManagerBridgeId)
                && java.util.Objects.equals(
                        this.enterpriseManagerEntityIdentifier,
                        other.enterpriseManagerEntityIdentifier)
                && java.util.Objects.equals(this.memberEntityDetails, other.memberEntityDetails)
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
                        + (this.enterpriseManagerBridgeId == null
                                ? 43
                                : this.enterpriseManagerBridgeId.hashCode());
        result =
                (result * PRIME)
                        + (this.enterpriseManagerEntityIdentifier == null
                                ? 43
                                : this.enterpriseManagerEntityIdentifier.hashCode());
        result =
                (result * PRIME)
                        + (this.memberEntityDetails == null
                                ? 43
                                : this.memberEntityDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.isAutoSyncEnabled == null ? 43 : this.isAutoSyncEnabled.hashCode());
        return result;
    }
}
