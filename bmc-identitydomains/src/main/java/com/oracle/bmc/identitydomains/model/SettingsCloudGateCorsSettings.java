/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * A complex attribute that specifies the Cloud Gate cross origin resource sharing settings.
 *
 * <p>*Added In:** 2011192329
 *
 * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
 * mutability: readWrite - required: false - returned: default - type: complex - uniqueness: none
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SettingsCloudGateCorsSettings.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SettingsCloudGateCorsSettings
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "cloudGateCorsAllowNullOrigin",
        "cloudGateCorsEnabled",
        "cloudGateCorsAllowedOrigins",
        "cloudGateCorsMaxAge",
        "cloudGateCorsExposedHeaders"
    })
    public SettingsCloudGateCorsSettings(
            Boolean cloudGateCorsAllowNullOrigin,
            Boolean cloudGateCorsEnabled,
            java.util.List<String> cloudGateCorsAllowedOrigins,
            Integer cloudGateCorsMaxAge,
            java.util.List<String> cloudGateCorsExposedHeaders) {
        super();
        this.cloudGateCorsAllowNullOrigin = cloudGateCorsAllowNullOrigin;
        this.cloudGateCorsEnabled = cloudGateCorsEnabled;
        this.cloudGateCorsAllowedOrigins = cloudGateCorsAllowedOrigins;
        this.cloudGateCorsMaxAge = cloudGateCorsMaxAge;
        this.cloudGateCorsExposedHeaders = cloudGateCorsExposedHeaders;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Allow Null Origin (CORS) for this tenant.
         *
         * <p>*Added In:** 2011192329
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("cloudGateCorsAllowNullOrigin")
        private Boolean cloudGateCorsAllowNullOrigin;

        /**
         * Allow Null Origin (CORS) for this tenant.
         *
         * <p>*Added In:** 2011192329
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param cloudGateCorsAllowNullOrigin the value to set
         * @return this builder
         */
        public Builder cloudGateCorsAllowNullOrigin(Boolean cloudGateCorsAllowNullOrigin) {
            this.cloudGateCorsAllowNullOrigin = cloudGateCorsAllowNullOrigin;
            this.__explicitlySet__.add("cloudGateCorsAllowNullOrigin");
            return this;
        }
        /**
         * Enable Cloud Gate Cross-Origin Resource Sharing (CORS) for this tenant.
         *
         * <p>*Added In:** 2011192329
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("cloudGateCorsEnabled")
        private Boolean cloudGateCorsEnabled;

        /**
         * Enable Cloud Gate Cross-Origin Resource Sharing (CORS) for this tenant.
         *
         * <p>*Added In:** 2011192329
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param cloudGateCorsEnabled the value to set
         * @return this builder
         */
        public Builder cloudGateCorsEnabled(Boolean cloudGateCorsEnabled) {
            this.cloudGateCorsEnabled = cloudGateCorsEnabled;
            this.__explicitlySet__.add("cloudGateCorsEnabled");
            return this;
        }
        /**
         * Cloud Gate Allowed Cross-Origin Resource Sharing (CORS) Origins for this tenant.
         *
         * <p>*Added In:** 2011192329
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: true - mutability:
         * readWrite - required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("cloudGateCorsAllowedOrigins")
        private java.util.List<String> cloudGateCorsAllowedOrigins;

        /**
         * Cloud Gate Allowed Cross-Origin Resource Sharing (CORS) Origins for this tenant.
         *
         * <p>*Added In:** 2011192329
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: true - mutability:
         * readWrite - required: false - returned: default - type: string - uniqueness: none
         *
         * @param cloudGateCorsAllowedOrigins the value to set
         * @return this builder
         */
        public Builder cloudGateCorsAllowedOrigins(
                java.util.List<String> cloudGateCorsAllowedOrigins) {
            this.cloudGateCorsAllowedOrigins = cloudGateCorsAllowedOrigins;
            this.__explicitlySet__.add("cloudGateCorsAllowedOrigins");
            return this;
        }
        /**
         * Maximum number of seconds a CORS Pre-flight Response may be cached by client.
         *
         * <p>*Added In:** 2205182039
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: integer - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("cloudGateCorsMaxAge")
        private Integer cloudGateCorsMaxAge;

        /**
         * Maximum number of seconds a CORS Pre-flight Response may be cached by client.
         *
         * <p>*Added In:** 2205182039
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: integer - uniqueness: none
         *
         * @param cloudGateCorsMaxAge the value to set
         * @return this builder
         */
        public Builder cloudGateCorsMaxAge(Integer cloudGateCorsMaxAge) {
            this.cloudGateCorsMaxAge = cloudGateCorsMaxAge;
            this.__explicitlySet__.add("cloudGateCorsMaxAge");
            return this;
        }
        /**
         * List of Response Headers Cloud Gate is allowed to expose in the CORS Response Header:
         * Access-Control-Expose-Headers.
         *
         * <p>*Added In:** 2205182039
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: true - mutability:
         * readWrite - required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("cloudGateCorsExposedHeaders")
        private java.util.List<String> cloudGateCorsExposedHeaders;

        /**
         * List of Response Headers Cloud Gate is allowed to expose in the CORS Response Header:
         * Access-Control-Expose-Headers.
         *
         * <p>*Added In:** 2205182039
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: true - mutability:
         * readWrite - required: false - returned: default - type: string - uniqueness: none
         *
         * @param cloudGateCorsExposedHeaders the value to set
         * @return this builder
         */
        public Builder cloudGateCorsExposedHeaders(
                java.util.List<String> cloudGateCorsExposedHeaders) {
            this.cloudGateCorsExposedHeaders = cloudGateCorsExposedHeaders;
            this.__explicitlySet__.add("cloudGateCorsExposedHeaders");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SettingsCloudGateCorsSettings build() {
            SettingsCloudGateCorsSettings model =
                    new SettingsCloudGateCorsSettings(
                            this.cloudGateCorsAllowNullOrigin,
                            this.cloudGateCorsEnabled,
                            this.cloudGateCorsAllowedOrigins,
                            this.cloudGateCorsMaxAge,
                            this.cloudGateCorsExposedHeaders);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SettingsCloudGateCorsSettings model) {
            if (model.wasPropertyExplicitlySet("cloudGateCorsAllowNullOrigin")) {
                this.cloudGateCorsAllowNullOrigin(model.getCloudGateCorsAllowNullOrigin());
            }
            if (model.wasPropertyExplicitlySet("cloudGateCorsEnabled")) {
                this.cloudGateCorsEnabled(model.getCloudGateCorsEnabled());
            }
            if (model.wasPropertyExplicitlySet("cloudGateCorsAllowedOrigins")) {
                this.cloudGateCorsAllowedOrigins(model.getCloudGateCorsAllowedOrigins());
            }
            if (model.wasPropertyExplicitlySet("cloudGateCorsMaxAge")) {
                this.cloudGateCorsMaxAge(model.getCloudGateCorsMaxAge());
            }
            if (model.wasPropertyExplicitlySet("cloudGateCorsExposedHeaders")) {
                this.cloudGateCorsExposedHeaders(model.getCloudGateCorsExposedHeaders());
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
     * Allow Null Origin (CORS) for this tenant.
     *
     * <p>*Added In:** 2011192329
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cloudGateCorsAllowNullOrigin")
    private final Boolean cloudGateCorsAllowNullOrigin;

    /**
     * Allow Null Origin (CORS) for this tenant.
     *
     * <p>*Added In:** 2011192329
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getCloudGateCorsAllowNullOrigin() {
        return cloudGateCorsAllowNullOrigin;
    }

    /**
     * Enable Cloud Gate Cross-Origin Resource Sharing (CORS) for this tenant.
     *
     * <p>*Added In:** 2011192329
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cloudGateCorsEnabled")
    private final Boolean cloudGateCorsEnabled;

    /**
     * Enable Cloud Gate Cross-Origin Resource Sharing (CORS) for this tenant.
     *
     * <p>*Added In:** 2011192329
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getCloudGateCorsEnabled() {
        return cloudGateCorsEnabled;
    }

    /**
     * Cloud Gate Allowed Cross-Origin Resource Sharing (CORS) Origins for this tenant.
     *
     * <p>*Added In:** 2011192329
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: true - mutability: readWrite
     * - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cloudGateCorsAllowedOrigins")
    private final java.util.List<String> cloudGateCorsAllowedOrigins;

    /**
     * Cloud Gate Allowed Cross-Origin Resource Sharing (CORS) Origins for this tenant.
     *
     * <p>*Added In:** 2011192329
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: true - mutability: readWrite
     * - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<String> getCloudGateCorsAllowedOrigins() {
        return cloudGateCorsAllowedOrigins;
    }

    /**
     * Maximum number of seconds a CORS Pre-flight Response may be cached by client.
     *
     * <p>*Added In:** 2205182039
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: integer - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cloudGateCorsMaxAge")
    private final Integer cloudGateCorsMaxAge;

    /**
     * Maximum number of seconds a CORS Pre-flight Response may be cached by client.
     *
     * <p>*Added In:** 2205182039
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: integer - uniqueness: none
     *
     * @return the value
     */
    public Integer getCloudGateCorsMaxAge() {
        return cloudGateCorsMaxAge;
    }

    /**
     * List of Response Headers Cloud Gate is allowed to expose in the CORS Response Header:
     * Access-Control-Expose-Headers.
     *
     * <p>*Added In:** 2205182039
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: true - mutability: readWrite
     * - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cloudGateCorsExposedHeaders")
    private final java.util.List<String> cloudGateCorsExposedHeaders;

    /**
     * List of Response Headers Cloud Gate is allowed to expose in the CORS Response Header:
     * Access-Control-Expose-Headers.
     *
     * <p>*Added In:** 2205182039
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: true - mutability: readWrite
     * - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<String> getCloudGateCorsExposedHeaders() {
        return cloudGateCorsExposedHeaders;
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
        sb.append("SettingsCloudGateCorsSettings(");
        sb.append("super=").append(super.toString());
        sb.append("cloudGateCorsAllowNullOrigin=")
                .append(String.valueOf(this.cloudGateCorsAllowNullOrigin));
        sb.append(", cloudGateCorsEnabled=").append(String.valueOf(this.cloudGateCorsEnabled));
        sb.append(", cloudGateCorsAllowedOrigins=")
                .append(String.valueOf(this.cloudGateCorsAllowedOrigins));
        sb.append(", cloudGateCorsMaxAge=").append(String.valueOf(this.cloudGateCorsMaxAge));
        sb.append(", cloudGateCorsExposedHeaders=")
                .append(String.valueOf(this.cloudGateCorsExposedHeaders));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SettingsCloudGateCorsSettings)) {
            return false;
        }

        SettingsCloudGateCorsSettings other = (SettingsCloudGateCorsSettings) o;
        return java.util.Objects.equals(
                        this.cloudGateCorsAllowNullOrigin, other.cloudGateCorsAllowNullOrigin)
                && java.util.Objects.equals(this.cloudGateCorsEnabled, other.cloudGateCorsEnabled)
                && java.util.Objects.equals(
                        this.cloudGateCorsAllowedOrigins, other.cloudGateCorsAllowedOrigins)
                && java.util.Objects.equals(this.cloudGateCorsMaxAge, other.cloudGateCorsMaxAge)
                && java.util.Objects.equals(
                        this.cloudGateCorsExposedHeaders, other.cloudGateCorsExposedHeaders)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.cloudGateCorsAllowNullOrigin == null
                                ? 43
                                : this.cloudGateCorsAllowNullOrigin.hashCode());
        result =
                (result * PRIME)
                        + (this.cloudGateCorsEnabled == null
                                ? 43
                                : this.cloudGateCorsEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.cloudGateCorsAllowedOrigins == null
                                ? 43
                                : this.cloudGateCorsAllowedOrigins.hashCode());
        result =
                (result * PRIME)
                        + (this.cloudGateCorsMaxAge == null
                                ? 43
                                : this.cloudGateCorsMaxAge.hashCode());
        result =
                (result * PRIME)
                        + (this.cloudGateCorsExposedHeaders == null
                                ? 43
                                : this.cloudGateCorsExposedHeaders.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
