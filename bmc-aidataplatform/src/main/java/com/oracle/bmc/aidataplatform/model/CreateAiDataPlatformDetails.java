/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aidataplatform.model;

/**
 * The data to create a AiDataPlatform. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240831")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateAiDataPlatformDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateAiDataPlatformDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    public CreateAiDataPlatformDetails(
            String displayName,
            String aiDataPlatformType,
            Boolean isEnableAiFeature,
            String vectorDbId,
            String vectorDbAdminCred,
            String vectorDbAdminSecretId,
            String compartmentId,
            String defaultWorkspaceName,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.displayName = displayName;
        this.aiDataPlatformType = aiDataPlatformType;
        this.isEnableAiFeature = isEnableAiFeature;
        this.vectorDbId = vectorDbId;
        this.vectorDbAdminCred = vectorDbAdminCred != null ? vectorDbAdminCred.toCharArray() : null;
        this.vectorDbAdminSecretId = vectorDbAdminSecretId;
        this.compartmentId = compartmentId;
        this.defaultWorkspaceName = defaultWorkspaceName;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "aiDataPlatformType",
        "isEnableAiFeature",
        "vectorDbId",
        "vectorDbAdminCred",
        "vectorDbAdminSecretId",
        "compartmentId",
        "defaultWorkspaceName",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public CreateAiDataPlatformDetails(
            String displayName,
            String aiDataPlatformType,
            Boolean isEnableAiFeature,
            String vectorDbId,
            char[] vectorDbAdminCred,
            String vectorDbAdminSecretId,
            String compartmentId,
            String defaultWorkspaceName,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.displayName = displayName;
        this.aiDataPlatformType = aiDataPlatformType;
        this.isEnableAiFeature = isEnableAiFeature;
        this.vectorDbId = vectorDbId;
        this.vectorDbAdminCred = vectorDbAdminCred;
        this.vectorDbAdminSecretId = vectorDbAdminSecretId;
        this.compartmentId = compartmentId;
        this.defaultWorkspaceName = defaultWorkspaceName;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The AiDataPlatform type. */
        @com.fasterxml.jackson.annotation.JsonProperty("aiDataPlatformType")
        private String aiDataPlatformType;

        /**
         * The AiDataPlatform type.
         *
         * @param aiDataPlatformType the value to set
         * @return this builder
         */
        public Builder aiDataPlatformType(String aiDataPlatformType) {
            this.aiDataPlatformType = aiDataPlatformType;
            this.__explicitlySet__.add("aiDataPlatformType");
            return this;
        }
        /** The flag to enable/disable AiFeatures for the instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("isEnableAiFeature")
        private Boolean isEnableAiFeature;

        /**
         * The flag to enable/disable AiFeatures for the instance.
         *
         * @param isEnableAiFeature the value to set
         * @return this builder
         */
        public Builder isEnableAiFeature(Boolean isEnableAiFeature) {
            this.isEnableAiFeature = isEnableAiFeature;
            this.__explicitlySet__.add("isEnableAiFeature");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * vector db Lakehouse 26ai.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vectorDbId")
        private String vectorDbId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * vector db Lakehouse 26ai.
         *
         * @param vectorDbId the value to set
         * @return this builder
         */
        public Builder vectorDbId(String vectorDbId) {
            this.vectorDbId = vectorDbId;
            this.__explicitlySet__.add("vectorDbId");
            return this;
        }
        /** The Vector DB Lakehouse 26ai ADMIN user password. */
        @com.fasterxml.jackson.annotation.JsonProperty("vectorDbAdminCred")
        private char[] vectorDbAdminCred;

        /**
         * The Vector DB Lakehouse 26ai ADMIN user password.
         *
         * @param vectorDbAdminCred the value to set
         * @return this builder
         */
        public Builder vectorDbAdminCred(char[] vectorDbAdminCred) {
            this.vectorDbAdminCred = vectorDbAdminCred;
            this.__explicitlySet__.add("vectorDbAdminCred");
            return this;
        }

        public Builder vectorDbAdminCred(String vectorDbAdminCred) {
            this.vectorDbAdminCred =
                    vectorDbAdminCred != null ? vectorDbAdminCred.toCharArray() : null;
            this.__explicitlySet__.add("vectorDbAdminCred");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * OCI Vault secret holding the vector db Lakehouse 26ai Admin user password.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vectorDbAdminSecretId")
        private String vectorDbAdminSecretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * OCI Vault secret holding the vector db Lakehouse 26ai Admin user password.
         *
         * @param vectorDbAdminSecretId the value to set
         * @return this builder
         */
        public Builder vectorDbAdminSecretId(String vectorDbAdminSecretId) {
            this.vectorDbAdminSecretId = vectorDbAdminSecretId;
            this.__explicitlySet__.add("vectorDbAdminSecretId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment to create the AiDataPlatform in.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment to create the AiDataPlatform in.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The name for the default workspace for the AiDataPlatform */
        @com.fasterxml.jackson.annotation.JsonProperty("defaultWorkspaceName")
        private String defaultWorkspaceName;

        /**
         * The name for the default workspace for the AiDataPlatform
         *
         * @param defaultWorkspaceName the value to set
         * @return this builder
         */
        public Builder defaultWorkspaceName(String defaultWorkspaceName) {
            this.defaultWorkspaceName = defaultWorkspaceName;
            this.__explicitlySet__.add("defaultWorkspaceName");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
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
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
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
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         *
         * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
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

        public CreateAiDataPlatformDetails build() {
            CreateAiDataPlatformDetails model =
                    new CreateAiDataPlatformDetails(
                            this.displayName,
                            this.aiDataPlatformType,
                            this.isEnableAiFeature,
                            this.vectorDbId,
                            this.vectorDbAdminCred,
                            this.vectorDbAdminSecretId,
                            this.compartmentId,
                            this.defaultWorkspaceName,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateAiDataPlatformDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("aiDataPlatformType")) {
                this.aiDataPlatformType(model.getAiDataPlatformType());
            }
            if (model.wasPropertyExplicitlySet("isEnableAiFeature")) {
                this.isEnableAiFeature(model.getIsEnableAiFeature());
            }
            if (model.wasPropertyExplicitlySet("vectorDbId")) {
                this.vectorDbId(model.getVectorDbId());
            }
            if (model.wasPropertyExplicitlySet("vectorDbAdminCred")) {
                this.vectorDbAdminCred(model.getVectorDbAdminCred());
            }
            if (model.wasPropertyExplicitlySet("vectorDbAdminSecretId")) {
                this.vectorDbAdminSecretId(model.getVectorDbAdminSecretId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("defaultWorkspaceName")) {
                this.defaultWorkspaceName(model.getDefaultWorkspaceName());
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
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The AiDataPlatform type. */
    @com.fasterxml.jackson.annotation.JsonProperty("aiDataPlatformType")
    private final String aiDataPlatformType;

    /**
     * The AiDataPlatform type.
     *
     * @return the value
     */
    public String getAiDataPlatformType() {
        return aiDataPlatformType;
    }

    /** The flag to enable/disable AiFeatures for the instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("isEnableAiFeature")
    private final Boolean isEnableAiFeature;

    /**
     * The flag to enable/disable AiFeatures for the instance.
     *
     * @return the value
     */
    public Boolean getIsEnableAiFeature() {
        return isEnableAiFeature;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * vector db Lakehouse 26ai.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vectorDbId")
    private final String vectorDbId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * vector db Lakehouse 26ai.
     *
     * @return the value
     */
    public String getVectorDbId() {
        return vectorDbId;
    }

    /** The Vector DB Lakehouse 26ai ADMIN user password. */
    @com.fasterxml.jackson.annotation.JsonProperty("vectorDbAdminCred")
    private final char[] vectorDbAdminCred;

    /**
     * The Vector DB Lakehouse 26ai ADMIN user password.
     *
     * @return the value
     * @deprecated Use getVectorDbAdminCred__AsCharArray() instead.
     */
    @Deprecated
    @com.fasterxml.jackson.annotation.JsonIgnore
    public String getVectorDbAdminCred() {
        return vectorDbAdminCred != null ? new String(vectorDbAdminCred) : null;
    }

    /**
     * The Vector DB Lakehouse 26ai ADMIN user password.
     *
     * @return the value
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vectorDbAdminCred")
    public char[] getVectorDbAdminCred__AsCharArray() {
        return vectorDbAdminCred;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the OCI
     * Vault secret holding the vector db Lakehouse 26ai Admin user password.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vectorDbAdminSecretId")
    private final String vectorDbAdminSecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the OCI
     * Vault secret holding the vector db Lakehouse 26ai Admin user password.
     *
     * @return the value
     */
    public String getVectorDbAdminSecretId() {
        return vectorDbAdminSecretId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment to create the AiDataPlatform in.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment to create the AiDataPlatform in.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The name for the default workspace for the AiDataPlatform */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultWorkspaceName")
    private final String defaultWorkspaceName;

    /**
     * The name for the default workspace for the AiDataPlatform
     *
     * @return the value
     */
    public String getDefaultWorkspaceName() {
        return defaultWorkspaceName;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     *
     * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
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
        sb.append("CreateAiDataPlatformDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", aiDataPlatformType=").append(String.valueOf(this.aiDataPlatformType));
        sb.append(", isEnableAiFeature=").append(String.valueOf(this.isEnableAiFeature));
        sb.append(", vectorDbId=").append(String.valueOf(this.vectorDbId));
        sb.append(", vectorDbAdminCred=").append("<redacted>");
        sb.append(", vectorDbAdminSecretId=").append(String.valueOf(this.vectorDbAdminSecretId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", defaultWorkspaceName=").append(String.valueOf(this.defaultWorkspaceName));
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
        if (!(o instanceof CreateAiDataPlatformDetails)) {
            return false;
        }

        CreateAiDataPlatformDetails other = (CreateAiDataPlatformDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.aiDataPlatformType, other.aiDataPlatformType)
                && java.util.Objects.equals(this.isEnableAiFeature, other.isEnableAiFeature)
                && java.util.Objects.equals(this.vectorDbId, other.vectorDbId)
                && java.util.Objects.equals(this.vectorDbAdminCred, other.vectorDbAdminCred)
                && java.util.Objects.equals(this.vectorDbAdminSecretId, other.vectorDbAdminSecretId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.defaultWorkspaceName, other.defaultWorkspaceName)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.aiDataPlatformType == null
                                ? 43
                                : this.aiDataPlatformType.hashCode());
        result =
                (result * PRIME)
                        + (this.isEnableAiFeature == null ? 43 : this.isEnableAiFeature.hashCode());
        result = (result * PRIME) + (this.vectorDbId == null ? 43 : this.vectorDbId.hashCode());
        result =
                (result * PRIME)
                        + (this.vectorDbAdminCred == null ? 43 : this.vectorDbAdminCred.hashCode());
        result =
                (result * PRIME)
                        + (this.vectorDbAdminSecretId == null
                                ? 43
                                : this.vectorDbAdminSecretId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultWorkspaceName == null
                                ? 43
                                : this.defaultWorkspaceName.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
