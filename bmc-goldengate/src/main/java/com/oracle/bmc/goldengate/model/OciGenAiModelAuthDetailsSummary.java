/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * Summary of OCI Generative AI authentication details for an AI Model connection. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = OciGenAiModelAuthDetailsSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "authType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OciGenAiModelAuthDetailsSummary extends AiModelAuthDetailsSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** API key secret OCID for the AI model connection. */
        @com.fasterxml.jackson.annotation.JsonProperty("apiKeySecretId")
        private String apiKeySecretId;

        /**
         * API key secret OCID for the AI model connection.
         *
         * @param apiKeySecretId the value to set
         * @return this builder
         */
        public Builder apiKeySecretId(String apiKeySecretId) {
            this.apiKeySecretId = apiKeySecretId;
            this.__explicitlySet__.add("apiKeySecretId");
            return this;
        }
        /** OCI Generative AI key fingerprint. */
        @com.fasterxml.jackson.annotation.JsonProperty("keyFingerprint")
        private String keyFingerprint;

        /**
         * OCI Generative AI key fingerprint.
         *
         * @param keyFingerprint the value to set
         * @return this builder
         */
        public Builder keyFingerprint(String keyFingerprint) {
            this.keyFingerprint = keyFingerprint;
            this.__explicitlySet__.add("keyFingerprint");
            return this;
        }
        /**
         * The name of the region. e.g.: us-ashburn-1 If the region is not provided, backend will
         * default to the default region.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        /**
         * The name of the region. e.g.: us-ashburn-1 If the region is not provided, backend will
         * default to the default region.
         *
         * @param region the value to set
         * @return this builder
         */
        public Builder region(String region) {
            this.region = region;
            this.__explicitlySet__.add("region");
            return this;
        }
        /**
         * OCI Generative AI tenancy OCID. If this value is not provided, or is updated to an empty
         * value, it defaults to the tenancy OCID of the user who is executing the operation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("tenancyId")
        private String tenancyId;

        /**
         * OCI Generative AI tenancy OCID. If this value is not provided, or is updated to an empty
         * value, it defaults to the tenancy OCID of the user who is executing the operation.
         *
         * @param tenancyId the value to set
         * @return this builder
         */
        public Builder tenancyId(String tenancyId) {
            this.tenancyId = tenancyId;
            this.__explicitlySet__.add("tenancyId");
            return this;
        }
        /**
         * OCI Generative AI user OCID. If this value is not provided, or is updated to an empty
         * value, it defaults to the OCID of the user who is executing the operation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("userId")
        private String userId;

        /**
         * OCI Generative AI user OCID. If this value is not provided, or is updated to an empty
         * value, it defaults to the OCID of the user who is executing the operation.
         *
         * @param userId the value to set
         * @return this builder
         */
        public Builder userId(String userId) {
            this.userId = userId;
            this.__explicitlySet__.add("userId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OciGenAiModelAuthDetailsSummary build() {
            OciGenAiModelAuthDetailsSummary model =
                    new OciGenAiModelAuthDetailsSummary(
                            this.apiKeySecretId,
                            this.keyFingerprint,
                            this.region,
                            this.tenancyId,
                            this.userId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OciGenAiModelAuthDetailsSummary model) {
            if (model.wasPropertyExplicitlySet("apiKeySecretId")) {
                this.apiKeySecretId(model.getApiKeySecretId());
            }
            if (model.wasPropertyExplicitlySet("keyFingerprint")) {
                this.keyFingerprint(model.getKeyFingerprint());
            }
            if (model.wasPropertyExplicitlySet("region")) {
                this.region(model.getRegion());
            }
            if (model.wasPropertyExplicitlySet("tenancyId")) {
                this.tenancyId(model.getTenancyId());
            }
            if (model.wasPropertyExplicitlySet("userId")) {
                this.userId(model.getUserId());
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
    public OciGenAiModelAuthDetailsSummary(
            String apiKeySecretId,
            String keyFingerprint,
            String region,
            String tenancyId,
            String userId) {
        super();
        this.apiKeySecretId = apiKeySecretId;
        this.keyFingerprint = keyFingerprint;
        this.region = region;
        this.tenancyId = tenancyId;
        this.userId = userId;
    }

    /** API key secret OCID for the AI model connection. */
    @com.fasterxml.jackson.annotation.JsonProperty("apiKeySecretId")
    private final String apiKeySecretId;

    /**
     * API key secret OCID for the AI model connection.
     *
     * @return the value
     */
    public String getApiKeySecretId() {
        return apiKeySecretId;
    }

    /** OCI Generative AI key fingerprint. */
    @com.fasterxml.jackson.annotation.JsonProperty("keyFingerprint")
    private final String keyFingerprint;

    /**
     * OCI Generative AI key fingerprint.
     *
     * @return the value
     */
    public String getKeyFingerprint() {
        return keyFingerprint;
    }

    /**
     * The name of the region. e.g.: us-ashburn-1 If the region is not provided, backend will
     * default to the default region.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

    /**
     * The name of the region. e.g.: us-ashburn-1 If the region is not provided, backend will
     * default to the default region.
     *
     * @return the value
     */
    public String getRegion() {
        return region;
    }

    /**
     * OCI Generative AI tenancy OCID. If this value is not provided, or is updated to an empty
     * value, it defaults to the tenancy OCID of the user who is executing the operation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tenancyId")
    private final String tenancyId;

    /**
     * OCI Generative AI tenancy OCID. If this value is not provided, or is updated to an empty
     * value, it defaults to the tenancy OCID of the user who is executing the operation.
     *
     * @return the value
     */
    public String getTenancyId() {
        return tenancyId;
    }

    /**
     * OCI Generative AI user OCID. If this value is not provided, or is updated to an empty value,
     * it defaults to the OCID of the user who is executing the operation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("userId")
    private final String userId;

    /**
     * OCI Generative AI user OCID. If this value is not provided, or is updated to an empty value,
     * it defaults to the OCID of the user who is executing the operation.
     *
     * @return the value
     */
    public String getUserId() {
        return userId;
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
        sb.append("OciGenAiModelAuthDetailsSummary(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", apiKeySecretId=").append(String.valueOf(this.apiKeySecretId));
        sb.append(", keyFingerprint=").append(String.valueOf(this.keyFingerprint));
        sb.append(", region=").append(String.valueOf(this.region));
        sb.append(", tenancyId=").append(String.valueOf(this.tenancyId));
        sb.append(", userId=").append(String.valueOf(this.userId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OciGenAiModelAuthDetailsSummary)) {
            return false;
        }

        OciGenAiModelAuthDetailsSummary other = (OciGenAiModelAuthDetailsSummary) o;
        return java.util.Objects.equals(this.apiKeySecretId, other.apiKeySecretId)
                && java.util.Objects.equals(this.keyFingerprint, other.keyFingerprint)
                && java.util.Objects.equals(this.region, other.region)
                && java.util.Objects.equals(this.tenancyId, other.tenancyId)
                && java.util.Objects.equals(this.userId, other.userId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.apiKeySecretId == null ? 43 : this.apiKeySecretId.hashCode());
        result =
                (result * PRIME)
                        + (this.keyFingerprint == null ? 43 : this.keyFingerprint.hashCode());
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result = (result * PRIME) + (this.tenancyId == null ? 43 : this.tenancyId.hashCode());
        result = (result * PRIME) + (this.userId == null ? 43 : this.userId.hashCode());
        return result;
    }
}
