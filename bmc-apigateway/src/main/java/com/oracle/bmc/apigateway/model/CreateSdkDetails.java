/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * Information about the new SDK.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CreateSdkDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateSdkDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "targetLanguage",
        "apiId",
        "freeformTags",
        "definedTags",
        "parameters"
    })
    public CreateSdkDetails(
            String displayName,
            String targetLanguage,
            String apiId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, String> parameters) {
        super();
        this.displayName = displayName;
        this.targetLanguage = targetLanguage;
        this.apiId = apiId;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.parameters = parameters;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         * <p>
         * Example: {@code My new resource}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         * <p>
         * Example: {@code My new resource}
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The string representing the target programming language for generating the SDK.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetLanguage")
        private String targetLanguage;

        /**
         * The string representing the target programming language for generating the SDK.
         *
         * @param targetLanguage the value to set
         * @return this builder
         **/
        public Builder targetLanguage(String targetLanguage) {
            this.targetLanguage = targetLanguage;
            this.__explicitlySet__.add("targetLanguage");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of API resource
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("apiId")
        private String apiId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of API resource
         *
         * @param apiId the value to set
         * @return this builder
         **/
        public Builder apiId(String apiId) {
            this.apiId = apiId;
            this.__explicitlySet__.add("apiId");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair
         * with no predefined name, type, or namespace. For more information, see
         * [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair
         * with no predefined name, type, or namespace. For more information, see
         * [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
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
         * Defined tags for this resource. Each key is predefined and scoped to a
         * namespace. For more information, see
         * [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a
         * namespace. For more information, see
         * [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
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
        /**
         * Additional optional configurations that can be passed to generate SDK Api.
         * The applicable parameters are listed under "parameters" when "/sdkLanguageTypes" is called.
         * <p>
         * Example: {@code {"configName": "configValue"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parameters")
        private java.util.Map<String, String> parameters;

        /**
         * Additional optional configurations that can be passed to generate SDK Api.
         * The applicable parameters are listed under "parameters" when "/sdkLanguageTypes" is called.
         * <p>
         * Example: {@code {"configName": "configValue"}}
         *
         * @param parameters the value to set
         * @return this builder
         **/
        public Builder parameters(java.util.Map<String, String> parameters) {
            this.parameters = parameters;
            this.__explicitlySet__.add("parameters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateSdkDetails build() {
            CreateSdkDetails model =
                    new CreateSdkDetails(
                            this.displayName,
                            this.targetLanguage,
                            this.apiId,
                            this.freeformTags,
                            this.definedTags,
                            this.parameters);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateSdkDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("targetLanguage")) {
                this.targetLanguage(model.getTargetLanguage());
            }
            if (model.wasPropertyExplicitlySet("apiId")) {
                this.apiId(model.getApiId());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("parameters")) {
                this.parameters(model.getParameters());
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
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     * <p>
     * Example: {@code My new resource}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     * <p>
     * Example: {@code My new resource}
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The string representing the target programming language for generating the SDK.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetLanguage")
    private final String targetLanguage;

    /**
     * The string representing the target programming language for generating the SDK.
     *
     * @return the value
     **/
    public String getTargetLanguage() {
        return targetLanguage;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of API resource
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("apiId")
    private final String apiId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of API resource
     *
     * @return the value
     **/
    public String getApiId() {
        return apiId;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair
     * with no predefined name, type, or namespace. For more information, see
     * [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair
     * with no predefined name, type, or namespace. For more information, see
     * [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see
     * [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see
     * [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Additional optional configurations that can be passed to generate SDK Api.
     * The applicable parameters are listed under "parameters" when "/sdkLanguageTypes" is called.
     * <p>
     * Example: {@code {"configName": "configValue"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parameters")
    private final java.util.Map<String, String> parameters;

    /**
     * Additional optional configurations that can be passed to generate SDK Api.
     * The applicable parameters are listed under "parameters" when "/sdkLanguageTypes" is called.
     * <p>
     * Example: {@code {"configName": "configValue"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getParameters() {
        return parameters;
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
        sb.append("CreateSdkDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", targetLanguage=").append(String.valueOf(this.targetLanguage));
        sb.append(", apiId=").append(String.valueOf(this.apiId));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", parameters=").append(String.valueOf(this.parameters));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateSdkDetails)) {
            return false;
        }

        CreateSdkDetails other = (CreateSdkDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.targetLanguage, other.targetLanguage)
                && java.util.Objects.equals(this.apiId, other.apiId)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.parameters, other.parameters)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.targetLanguage == null ? 43 : this.targetLanguage.hashCode());
        result = (result * PRIME) + (this.apiId == null ? 43 : this.apiId.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.parameters == null ? 43 : this.parameters.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
