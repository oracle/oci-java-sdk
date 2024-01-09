/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.adm.model;

/**
 * Details to update an existing remediation recipe. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220421")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateRemediationRecipeDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateRemediationRecipeDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "scmConfiguration",
        "verifyConfiguration",
        "detectConfiguration",
        "networkConfiguration",
        "knowledgeBaseId",
        "isRunTriggeredOnKbChange",
        "freeformTags",
        "definedTags"
    })
    public UpdateRemediationRecipeDetails(
            String displayName,
            ScmConfiguration scmConfiguration,
            VerifyConfiguration verifyConfiguration,
            DetectConfiguration detectConfiguration,
            NetworkConfiguration networkConfiguration,
            String knowledgeBaseId,
            Boolean isRunTriggeredOnKbChange,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.scmConfiguration = scmConfiguration;
        this.verifyConfiguration = verifyConfiguration;
        this.detectConfiguration = detectConfiguration;
        this.networkConfiguration = networkConfiguration;
        this.knowledgeBaseId = knowledgeBaseId;
        this.isRunTriggeredOnKbChange = isRunTriggeredOnKbChange;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the remediation recipe. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The name of the remediation recipe.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("scmConfiguration")
        private ScmConfiguration scmConfiguration;

        public Builder scmConfiguration(ScmConfiguration scmConfiguration) {
            this.scmConfiguration = scmConfiguration;
            this.__explicitlySet__.add("scmConfiguration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("verifyConfiguration")
        private VerifyConfiguration verifyConfiguration;

        public Builder verifyConfiguration(VerifyConfiguration verifyConfiguration) {
            this.verifyConfiguration = verifyConfiguration;
            this.__explicitlySet__.add("verifyConfiguration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("detectConfiguration")
        private DetectConfiguration detectConfiguration;

        public Builder detectConfiguration(DetectConfiguration detectConfiguration) {
            this.detectConfiguration = detectConfiguration;
            this.__explicitlySet__.add("detectConfiguration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("networkConfiguration")
        private NetworkConfiguration networkConfiguration;

        public Builder networkConfiguration(NetworkConfiguration networkConfiguration) {
            this.networkConfiguration = networkConfiguration;
            this.__explicitlySet__.add("networkConfiguration");
            return this;
        }
        /**
         * The Oracle Cloud Identifier
         * ([OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)) of the
         * knowledge base.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("knowledgeBaseId")
        private String knowledgeBaseId;

        /**
         * The Oracle Cloud Identifier
         * ([OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)) of the
         * knowledge base.
         *
         * @param knowledgeBaseId the value to set
         * @return this builder
         */
        public Builder knowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = knowledgeBaseId;
            this.__explicitlySet__.add("knowledgeBaseId");
            return this;
        }
        /**
         * Boolean indicating if a run should be automatically triggered once the knowledge base is
         * updated.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isRunTriggeredOnKbChange")
        private Boolean isRunTriggeredOnKbChange;

        /**
         * Boolean indicating if a run should be automatically triggered once the knowledge base is
         * updated.
         *
         * @param isRunTriggeredOnKbChange the value to set
         * @return this builder
         */
        public Builder isRunTriggeredOnKbChange(Boolean isRunTriggeredOnKbChange) {
            this.isRunTriggeredOnKbChange = isRunTriggeredOnKbChange;
            this.__explicitlySet__.add("isRunTriggeredOnKbChange");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateRemediationRecipeDetails build() {
            UpdateRemediationRecipeDetails model =
                    new UpdateRemediationRecipeDetails(
                            this.displayName,
                            this.scmConfiguration,
                            this.verifyConfiguration,
                            this.detectConfiguration,
                            this.networkConfiguration,
                            this.knowledgeBaseId,
                            this.isRunTriggeredOnKbChange,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateRemediationRecipeDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("scmConfiguration")) {
                this.scmConfiguration(model.getScmConfiguration());
            }
            if (model.wasPropertyExplicitlySet("verifyConfiguration")) {
                this.verifyConfiguration(model.getVerifyConfiguration());
            }
            if (model.wasPropertyExplicitlySet("detectConfiguration")) {
                this.detectConfiguration(model.getDetectConfiguration());
            }
            if (model.wasPropertyExplicitlySet("networkConfiguration")) {
                this.networkConfiguration(model.getNetworkConfiguration());
            }
            if (model.wasPropertyExplicitlySet("knowledgeBaseId")) {
                this.knowledgeBaseId(model.getKnowledgeBaseId());
            }
            if (model.wasPropertyExplicitlySet("isRunTriggeredOnKbChange")) {
                this.isRunTriggeredOnKbChange(model.getIsRunTriggeredOnKbChange());
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

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** The name of the remediation recipe. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The name of the remediation recipe.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("scmConfiguration")
    private final ScmConfiguration scmConfiguration;

    public ScmConfiguration getScmConfiguration() {
        return scmConfiguration;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("verifyConfiguration")
    private final VerifyConfiguration verifyConfiguration;

    public VerifyConfiguration getVerifyConfiguration() {
        return verifyConfiguration;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("detectConfiguration")
    private final DetectConfiguration detectConfiguration;

    public DetectConfiguration getDetectConfiguration() {
        return detectConfiguration;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("networkConfiguration")
    private final NetworkConfiguration networkConfiguration;

    public NetworkConfiguration getNetworkConfiguration() {
        return networkConfiguration;
    }

    /**
     * The Oracle Cloud Identifier
     * ([OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)) of the
     * knowledge base.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("knowledgeBaseId")
    private final String knowledgeBaseId;

    /**
     * The Oracle Cloud Identifier
     * ([OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)) of the
     * knowledge base.
     *
     * @return the value
     */
    public String getKnowledgeBaseId() {
        return knowledgeBaseId;
    }

    /**
     * Boolean indicating if a run should be automatically triggered once the knowledge base is
     * updated.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isRunTriggeredOnKbChange")
    private final Boolean isRunTriggeredOnKbChange;

    /**
     * Boolean indicating if a run should be automatically triggered once the knowledge base is
     * updated.
     *
     * @return the value
     */
    public Boolean getIsRunTriggeredOnKbChange() {
        return isRunTriggeredOnKbChange;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("UpdateRemediationRecipeDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", scmConfiguration=").append(String.valueOf(this.scmConfiguration));
        sb.append(", verifyConfiguration=").append(String.valueOf(this.verifyConfiguration));
        sb.append(", detectConfiguration=").append(String.valueOf(this.detectConfiguration));
        sb.append(", networkConfiguration=").append(String.valueOf(this.networkConfiguration));
        sb.append(", knowledgeBaseId=").append(String.valueOf(this.knowledgeBaseId));
        sb.append(", isRunTriggeredOnKbChange=")
                .append(String.valueOf(this.isRunTriggeredOnKbChange));
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
        if (!(o instanceof UpdateRemediationRecipeDetails)) {
            return false;
        }

        UpdateRemediationRecipeDetails other = (UpdateRemediationRecipeDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.scmConfiguration, other.scmConfiguration)
                && java.util.Objects.equals(this.verifyConfiguration, other.verifyConfiguration)
                && java.util.Objects.equals(this.detectConfiguration, other.detectConfiguration)
                && java.util.Objects.equals(this.networkConfiguration, other.networkConfiguration)
                && java.util.Objects.equals(this.knowledgeBaseId, other.knowledgeBaseId)
                && java.util.Objects.equals(
                        this.isRunTriggeredOnKbChange, other.isRunTriggeredOnKbChange)
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
                        + (this.scmConfiguration == null ? 43 : this.scmConfiguration.hashCode());
        result =
                (result * PRIME)
                        + (this.verifyConfiguration == null
                                ? 43
                                : this.verifyConfiguration.hashCode());
        result =
                (result * PRIME)
                        + (this.detectConfiguration == null
                                ? 43
                                : this.detectConfiguration.hashCode());
        result =
                (result * PRIME)
                        + (this.networkConfiguration == null
                                ? 43
                                : this.networkConfiguration.hashCode());
        result =
                (result * PRIME)
                        + (this.knowledgeBaseId == null ? 43 : this.knowledgeBaseId.hashCode());
        result =
                (result * PRIME)
                        + (this.isRunTriggeredOnKbChange == null
                                ? 43
                                : this.isRunTriggeredOnKbChange.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
