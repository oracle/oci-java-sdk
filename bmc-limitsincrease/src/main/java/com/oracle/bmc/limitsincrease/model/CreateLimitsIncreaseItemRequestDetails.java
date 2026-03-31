/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.limitsincrease.model;

/**
 * The configuration details for creating a limit increase item within a limit increase request.
 * For more information, see
 * [Creating a Limit Increase Request](https://docs.oracle.com/iaas/Content/General/service-limits/create-requests.htm).
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateLimitsIncreaseItemRequestDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateLimitsIncreaseItemRequestDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "serviceName",
        "limitName",
        "region",
        "scope",
        "value",
        "questionnaireResponse"
    })
    public CreateLimitsIncreaseItemRequestDetails(
            String serviceName,
            String limitName,
            String region,
            String scope,
            Long value,
            java.util.List<LimitsIncreaseItemQuestionRequest> questionnaireResponse) {
        super();
        this.serviceName = serviceName;
        this.limitName = limitName;
        this.region = region;
        this.scope = scope;
        this.value = value;
        this.questionnaireResponse = questionnaireResponse;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the service that owns the limit.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
        private String serviceName;

        /**
         * The name of the service that owns the limit.
         * @param serviceName the value to set
         * @return this builder
         **/
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            this.__explicitlySet__.add("serviceName");
            return this;
        }
        /**
         * The name of the limit to be increased.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("limitName")
        private String limitName;

        /**
         * The name of the limit to be increased.
         * @param limitName the value to set
         * @return this builder
         **/
        public Builder limitName(String limitName) {
            this.limitName = limitName;
            this.__explicitlySet__.add("limitName");
            return this;
        }
        /**
         * The region for the limit increase.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        /**
         * The region for the limit increase.
         * @param region the value to set
         * @return this builder
         **/
        public Builder region(String region) {
            this.region = region;
            this.__explicitlySet__.add("region");
            return this;
        }
        /**
         * The scope of the limit increase item.
         * For OCI, use the logical availability domain (AD) of the request.
         * For Multicloud, use the availability zone (AZ) of the request
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("scope")
        private String scope;

        /**
         * The scope of the limit increase item.
         * For OCI, use the logical availability domain (AD) of the request.
         * For Multicloud, use the availability zone (AZ) of the request
         *
         * @param scope the value to set
         * @return this builder
         **/
        public Builder scope(String scope) {
            this.scope = scope;
            this.__explicitlySet__.add("scope");
            return this;
        }
        /**
         * The requested value of the increase.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private Long value;

        /**
         * The requested value of the increase.
         * @param value the value to set
         * @return this builder
         **/
        public Builder value(Long value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /**
         * List of questionnaire responses.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("questionnaireResponse")
        private java.util.List<LimitsIncreaseItemQuestionRequest> questionnaireResponse;

        /**
         * List of questionnaire responses.
         * @param questionnaireResponse the value to set
         * @return this builder
         **/
        public Builder questionnaireResponse(
                java.util.List<LimitsIncreaseItemQuestionRequest> questionnaireResponse) {
            this.questionnaireResponse = questionnaireResponse;
            this.__explicitlySet__.add("questionnaireResponse");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateLimitsIncreaseItemRequestDetails build() {
            CreateLimitsIncreaseItemRequestDetails model =
                    new CreateLimitsIncreaseItemRequestDetails(
                            this.serviceName,
                            this.limitName,
                            this.region,
                            this.scope,
                            this.value,
                            this.questionnaireResponse);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateLimitsIncreaseItemRequestDetails model) {
            if (model.wasPropertyExplicitlySet("serviceName")) {
                this.serviceName(model.getServiceName());
            }
            if (model.wasPropertyExplicitlySet("limitName")) {
                this.limitName(model.getLimitName());
            }
            if (model.wasPropertyExplicitlySet("region")) {
                this.region(model.getRegion());
            }
            if (model.wasPropertyExplicitlySet("scope")) {
                this.scope(model.getScope());
            }
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("questionnaireResponse")) {
                this.questionnaireResponse(model.getQuestionnaireResponse());
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
     * The name of the service that owns the limit.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
    private final String serviceName;

    /**
     * The name of the service that owns the limit.
     * @return the value
     **/
    public String getServiceName() {
        return serviceName;
    }

    /**
     * The name of the limit to be increased.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("limitName")
    private final String limitName;

    /**
     * The name of the limit to be increased.
     * @return the value
     **/
    public String getLimitName() {
        return limitName;
    }

    /**
     * The region for the limit increase.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

    /**
     * The region for the limit increase.
     * @return the value
     **/
    public String getRegion() {
        return region;
    }

    /**
     * The scope of the limit increase item.
     * For OCI, use the logical availability domain (AD) of the request.
     * For Multicloud, use the availability zone (AZ) of the request
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scope")
    private final String scope;

    /**
     * The scope of the limit increase item.
     * For OCI, use the logical availability domain (AD) of the request.
     * For Multicloud, use the availability zone (AZ) of the request
     *
     * @return the value
     **/
    public String getScope() {
        return scope;
    }

    /**
     * The requested value of the increase.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final Long value;

    /**
     * The requested value of the increase.
     * @return the value
     **/
    public Long getValue() {
        return value;
    }

    /**
     * List of questionnaire responses.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("questionnaireResponse")
    private final java.util.List<LimitsIncreaseItemQuestionRequest> questionnaireResponse;

    /**
     * List of questionnaire responses.
     * @return the value
     **/
    public java.util.List<LimitsIncreaseItemQuestionRequest> getQuestionnaireResponse() {
        return questionnaireResponse;
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
        sb.append("CreateLimitsIncreaseItemRequestDetails(");
        sb.append("super=").append(super.toString());
        sb.append("serviceName=").append(String.valueOf(this.serviceName));
        sb.append(", limitName=").append(String.valueOf(this.limitName));
        sb.append(", region=").append(String.valueOf(this.region));
        sb.append(", scope=").append(String.valueOf(this.scope));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(", questionnaireResponse=").append(String.valueOf(this.questionnaireResponse));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateLimitsIncreaseItemRequestDetails)) {
            return false;
        }

        CreateLimitsIncreaseItemRequestDetails other = (CreateLimitsIncreaseItemRequestDetails) o;
        return java.util.Objects.equals(this.serviceName, other.serviceName)
                && java.util.Objects.equals(this.limitName, other.limitName)
                && java.util.Objects.equals(this.region, other.region)
                && java.util.Objects.equals(this.scope, other.scope)
                && java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.questionnaireResponse, other.questionnaireResponse)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.serviceName == null ? 43 : this.serviceName.hashCode());
        result = (result * PRIME) + (this.limitName == null ? 43 : this.limitName.hashCode());
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result = (result * PRIME) + (this.scope == null ? 43 : this.scope.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result =
                (result * PRIME)
                        + (this.questionnaireResponse == null
                                ? 43
                                : this.questionnaireResponse.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
