/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps.model;

/**
 * The configuration details of the FusionEnvironment. For more information about these fields, see [Managing Environments](https://docs.cloud.oracle.com/iaas/Content/fusion-applications/manage-environment.htm).
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateFusionEnvironmentDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateFusionEnvironmentDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "maintenancePolicy",
        "compartmentId",
        "fusionEnvironmentFamilyId",
        "fusionEnvironmentType",
        "kmsKeyId",
        "dnsPrefix",
        "additionalLanguagePacks",
        "rules",
        "createFusionEnvironmentAdminUserDetails",
        "freeformTags",
        "definedTags"
    })
    public CreateFusionEnvironmentDetails(
            String displayName,
            MaintenancePolicy maintenancePolicy,
            String compartmentId,
            String fusionEnvironmentFamilyId,
            FusionEnvironment.FusionEnvironmentType fusionEnvironmentType,
            String kmsKeyId,
            String dnsPrefix,
            java.util.List<String> additionalLanguagePacks,
            java.util.List<Rule> rules,
            CreateFusionEnvironmentAdminUserDetails createFusionEnvironmentAdminUserDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.maintenancePolicy = maintenancePolicy;
        this.compartmentId = compartmentId;
        this.fusionEnvironmentFamilyId = fusionEnvironmentFamilyId;
        this.fusionEnvironmentType = fusionEnvironmentType;
        this.kmsKeyId = kmsKeyId;
        this.dnsPrefix = dnsPrefix;
        this.additionalLanguagePacks = additionalLanguagePacks;
        this.rules = rules;
        this.createFusionEnvironmentAdminUserDetails = createFusionEnvironmentAdminUserDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * FusionEnvironment Identifier can be renamed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * FusionEnvironment Identifier can be renamed.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maintenancePolicy")
        private MaintenancePolicy maintenancePolicy;

        public Builder maintenancePolicy(MaintenancePolicy maintenancePolicy) {
            this.maintenancePolicy = maintenancePolicy;
            this.__explicitlySet__.add("maintenancePolicy");
            return this;
        }
        /**
         * The unique identifier (OCID) of the compartment where the Fusion Environment is located.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The unique identifier (OCID) of the compartment where the Fusion Environment is located.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The unique identifier (OCID) of the Fusion Environment Family that the Fusion Environment belongs to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fusionEnvironmentFamilyId")
        private String fusionEnvironmentFamilyId;

        /**
         * The unique identifier (OCID) of the Fusion Environment Family that the Fusion Environment belongs to.
         * @param fusionEnvironmentFamilyId the value to set
         * @return this builder
         **/
        public Builder fusionEnvironmentFamilyId(String fusionEnvironmentFamilyId) {
            this.fusionEnvironmentFamilyId = fusionEnvironmentFamilyId;
            this.__explicitlySet__.add("fusionEnvironmentFamilyId");
            return this;
        }
        /**
         * The type of environment. Valid values are Production, Test, or Development.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fusionEnvironmentType")
        private FusionEnvironment.FusionEnvironmentType fusionEnvironmentType;

        /**
         * The type of environment. Valid values are Production, Test, or Development.
         * @param fusionEnvironmentType the value to set
         * @return this builder
         **/
        public Builder fusionEnvironmentType(
                FusionEnvironment.FusionEnvironmentType fusionEnvironmentType) {
            this.fusionEnvironmentType = fusionEnvironmentType;
            this.__explicitlySet__.add("fusionEnvironmentType");
            return this;
        }
        /**
         * byok kms keyId
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
        private String kmsKeyId;

        /**
         * byok kms keyId
         * @param kmsKeyId the value to set
         * @return this builder
         **/
        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            this.__explicitlySet__.add("kmsKeyId");
            return this;
        }
        /**
         * DNS prefix.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dnsPrefix")
        private String dnsPrefix;

        /**
         * DNS prefix.
         * @param dnsPrefix the value to set
         * @return this builder
         **/
        public Builder dnsPrefix(String dnsPrefix) {
            this.dnsPrefix = dnsPrefix;
            this.__explicitlySet__.add("dnsPrefix");
            return this;
        }
        /**
         * Language packs.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("additionalLanguagePacks")
        private java.util.List<String> additionalLanguagePacks;

        /**
         * Language packs.
         * @param additionalLanguagePacks the value to set
         * @return this builder
         **/
        public Builder additionalLanguagePacks(java.util.List<String> additionalLanguagePacks) {
            this.additionalLanguagePacks = additionalLanguagePacks;
            this.__explicitlySet__.add("additionalLanguagePacks");
            return this;
        }
        /**
         * Rules.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("rules")
        private java.util.List<Rule> rules;

        /**
         * Rules.
         * @param rules the value to set
         * @return this builder
         **/
        public Builder rules(java.util.List<Rule> rules) {
            this.rules = rules;
            this.__explicitlySet__.add("rules");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("createFusionEnvironmentAdminUserDetails")
        private CreateFusionEnvironmentAdminUserDetails createFusionEnvironmentAdminUserDetails;

        public Builder createFusionEnvironmentAdminUserDetails(
                CreateFusionEnvironmentAdminUserDetails createFusionEnvironmentAdminUserDetails) {
            this.createFusionEnvironmentAdminUserDetails = createFusionEnvironmentAdminUserDetails;
            this.__explicitlySet__.add("createFusionEnvironmentAdminUserDetails");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateFusionEnvironmentDetails build() {
            CreateFusionEnvironmentDetails model =
                    new CreateFusionEnvironmentDetails(
                            this.displayName,
                            this.maintenancePolicy,
                            this.compartmentId,
                            this.fusionEnvironmentFamilyId,
                            this.fusionEnvironmentType,
                            this.kmsKeyId,
                            this.dnsPrefix,
                            this.additionalLanguagePacks,
                            this.rules,
                            this.createFusionEnvironmentAdminUserDetails,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateFusionEnvironmentDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("maintenancePolicy")) {
                this.maintenancePolicy(model.getMaintenancePolicy());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("fusionEnvironmentFamilyId")) {
                this.fusionEnvironmentFamilyId(model.getFusionEnvironmentFamilyId());
            }
            if (model.wasPropertyExplicitlySet("fusionEnvironmentType")) {
                this.fusionEnvironmentType(model.getFusionEnvironmentType());
            }
            if (model.wasPropertyExplicitlySet("kmsKeyId")) {
                this.kmsKeyId(model.getKmsKeyId());
            }
            if (model.wasPropertyExplicitlySet("dnsPrefix")) {
                this.dnsPrefix(model.getDnsPrefix());
            }
            if (model.wasPropertyExplicitlySet("additionalLanguagePacks")) {
                this.additionalLanguagePacks(model.getAdditionalLanguagePacks());
            }
            if (model.wasPropertyExplicitlySet("rules")) {
                this.rules(model.getRules());
            }
            if (model.wasPropertyExplicitlySet("createFusionEnvironmentAdminUserDetails")) {
                this.createFusionEnvironmentAdminUserDetails(
                        model.getCreateFusionEnvironmentAdminUserDetails());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * FusionEnvironment Identifier can be renamed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * FusionEnvironment Identifier can be renamed.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("maintenancePolicy")
    private final MaintenancePolicy maintenancePolicy;

    public MaintenancePolicy getMaintenancePolicy() {
        return maintenancePolicy;
    }

    /**
     * The unique identifier (OCID) of the compartment where the Fusion Environment is located.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The unique identifier (OCID) of the compartment where the Fusion Environment is located.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The unique identifier (OCID) of the Fusion Environment Family that the Fusion Environment belongs to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fusionEnvironmentFamilyId")
    private final String fusionEnvironmentFamilyId;

    /**
     * The unique identifier (OCID) of the Fusion Environment Family that the Fusion Environment belongs to.
     * @return the value
     **/
    public String getFusionEnvironmentFamilyId() {
        return fusionEnvironmentFamilyId;
    }

    /**
     * The type of environment. Valid values are Production, Test, or Development.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fusionEnvironmentType")
    private final FusionEnvironment.FusionEnvironmentType fusionEnvironmentType;

    /**
     * The type of environment. Valid values are Production, Test, or Development.
     * @return the value
     **/
    public FusionEnvironment.FusionEnvironmentType getFusionEnvironmentType() {
        return fusionEnvironmentType;
    }

    /**
     * byok kms keyId
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
    private final String kmsKeyId;

    /**
     * byok kms keyId
     * @return the value
     **/
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * DNS prefix.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dnsPrefix")
    private final String dnsPrefix;

    /**
     * DNS prefix.
     * @return the value
     **/
    public String getDnsPrefix() {
        return dnsPrefix;
    }

    /**
     * Language packs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("additionalLanguagePacks")
    private final java.util.List<String> additionalLanguagePacks;

    /**
     * Language packs.
     * @return the value
     **/
    public java.util.List<String> getAdditionalLanguagePacks() {
        return additionalLanguagePacks;
    }

    /**
     * Rules.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rules")
    private final java.util.List<Rule> rules;

    /**
     * Rules.
     * @return the value
     **/
    public java.util.List<Rule> getRules() {
        return rules;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("createFusionEnvironmentAdminUserDetails")
    private final CreateFusionEnvironmentAdminUserDetails createFusionEnvironmentAdminUserDetails;

    public CreateFusionEnvironmentAdminUserDetails getCreateFusionEnvironmentAdminUserDetails() {
        return createFusionEnvironmentAdminUserDetails;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateFusionEnvironmentDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", maintenancePolicy=").append(String.valueOf(this.maintenancePolicy));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", fusionEnvironmentFamilyId=")
                .append(String.valueOf(this.fusionEnvironmentFamilyId));
        sb.append(", fusionEnvironmentType=").append(String.valueOf(this.fusionEnvironmentType));
        sb.append(", kmsKeyId=").append(String.valueOf(this.kmsKeyId));
        sb.append(", dnsPrefix=").append(String.valueOf(this.dnsPrefix));
        sb.append(", additionalLanguagePacks=")
                .append(String.valueOf(this.additionalLanguagePacks));
        sb.append(", rules=").append(String.valueOf(this.rules));
        sb.append(", createFusionEnvironmentAdminUserDetails=")
                .append(String.valueOf(this.createFusionEnvironmentAdminUserDetails));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateFusionEnvironmentDetails)) {
            return false;
        }

        CreateFusionEnvironmentDetails other = (CreateFusionEnvironmentDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.maintenancePolicy, other.maintenancePolicy)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.fusionEnvironmentFamilyId, other.fusionEnvironmentFamilyId)
                && java.util.Objects.equals(this.fusionEnvironmentType, other.fusionEnvironmentType)
                && java.util.Objects.equals(this.kmsKeyId, other.kmsKeyId)
                && java.util.Objects.equals(this.dnsPrefix, other.dnsPrefix)
                && java.util.Objects.equals(
                        this.additionalLanguagePacks, other.additionalLanguagePacks)
                && java.util.Objects.equals(this.rules, other.rules)
                && java.util.Objects.equals(
                        this.createFusionEnvironmentAdminUserDetails,
                        other.createFusionEnvironmentAdminUserDetails)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.maintenancePolicy == null ? 43 : this.maintenancePolicy.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.fusionEnvironmentFamilyId == null
                                ? 43
                                : this.fusionEnvironmentFamilyId.hashCode());
        result =
                (result * PRIME)
                        + (this.fusionEnvironmentType == null
                                ? 43
                                : this.fusionEnvironmentType.hashCode());
        result = (result * PRIME) + (this.kmsKeyId == null ? 43 : this.kmsKeyId.hashCode());
        result = (result * PRIME) + (this.dnsPrefix == null ? 43 : this.dnsPrefix.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalLanguagePacks == null
                                ? 43
                                : this.additionalLanguagePacks.hashCode());
        result = (result * PRIME) + (this.rules == null ? 43 : this.rules.hashCode());
        result =
                (result * PRIME)
                        + (this.createFusionEnvironmentAdminUserDetails == null
                                ? 43
                                : this.createFusionEnvironmentAdminUserDetails.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
