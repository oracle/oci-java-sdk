/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * Policy to specify OAuth2 flow configuration. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = OAuth2ResponseValidationFailurePolicy.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OAuth2ResponseValidationFailurePolicy extends ValidationFailurePolicy {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("clientDetails")
        private ClientAppDetails clientDetails;

        public Builder clientDetails(ClientAppDetails clientDetails) {
            this.clientDetails = clientDetails;
            this.__explicitlySet__.add("clientDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceUriDetails")
        private SourceUriDetails sourceUriDetails;

        public Builder sourceUriDetails(SourceUriDetails sourceUriDetails) {
            this.sourceUriDetails = sourceUriDetails;
            this.__explicitlySet__.add("sourceUriDetails");
            return this;
        }
        /** List of scopes. */
        @com.fasterxml.jackson.annotation.JsonProperty("scopes")
        private java.util.List<String> scopes;

        /**
         * List of scopes.
         *
         * @param scopes the value to set
         * @return this builder
         */
        public Builder scopes(java.util.List<String> scopes) {
            this.scopes = scopes;
            this.__explicitlySet__.add("scopes");
            return this;
        }
        /**
         * The duration for which the OAuth2 success token should be cached before it is fetched
         * again.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maxExpiryDurationInHours")
        private Integer maxExpiryDurationInHours;

        /**
         * The duration for which the OAuth2 success token should be cached before it is fetched
         * again.
         *
         * @param maxExpiryDurationInHours the value to set
         * @return this builder
         */
        public Builder maxExpiryDurationInHours(Integer maxExpiryDurationInHours) {
            this.maxExpiryDurationInHours = maxExpiryDurationInHours;
            this.__explicitlySet__.add("maxExpiryDurationInHours");
            return this;
        }
        /** Defines whether or not to use cookies for session maintenance. */
        @com.fasterxml.jackson.annotation.JsonProperty("useCookiesForSession")
        private Boolean useCookiesForSession;

        /**
         * Defines whether or not to use cookies for session maintenance.
         *
         * @param useCookiesForSession the value to set
         * @return this builder
         */
        public Builder useCookiesForSession(Boolean useCookiesForSession) {
            this.useCookiesForSession = useCookiesForSession;
            this.__explicitlySet__.add("useCookiesForSession");
            return this;
        }
        /** Defines whether or not to use cookies for OAuth2 intermediate steps. */
        @com.fasterxml.jackson.annotation.JsonProperty("useCookiesForIntermediateSteps")
        private Boolean useCookiesForIntermediateSteps;

        /**
         * Defines whether or not to use cookies for OAuth2 intermediate steps.
         *
         * @param useCookiesForIntermediateSteps the value to set
         * @return this builder
         */
        public Builder useCookiesForIntermediateSteps(Boolean useCookiesForIntermediateSteps) {
            this.useCookiesForIntermediateSteps = useCookiesForIntermediateSteps;
            this.__explicitlySet__.add("useCookiesForIntermediateSteps");
            return this;
        }
        /** Defines whether or not to support PKCE. */
        @com.fasterxml.jackson.annotation.JsonProperty("usePkce")
        private Boolean usePkce;

        /**
         * Defines whether or not to support PKCE.
         *
         * @param usePkce the value to set
         * @return this builder
         */
        public Builder usePkce(Boolean usePkce) {
            this.usePkce = usePkce;
            this.__explicitlySet__.add("usePkce");
            return this;
        }
        /** Response Type. */
        @com.fasterxml.jackson.annotation.JsonProperty("responseType")
        private ResponseType responseType;

        /**
         * Response Type.
         *
         * @param responseType the value to set
         * @return this builder
         */
        public Builder responseType(ResponseType responseType) {
            this.responseType = responseType;
            this.__explicitlySet__.add("responseType");
            return this;
        }
        /** The path to be used as fallback after OAuth2. */
        @com.fasterxml.jackson.annotation.JsonProperty("fallbackRedirectPath")
        private String fallbackRedirectPath;

        /**
         * The path to be used as fallback after OAuth2.
         *
         * @param fallbackRedirectPath the value to set
         * @return this builder
         */
        public Builder fallbackRedirectPath(String fallbackRedirectPath) {
            this.fallbackRedirectPath = fallbackRedirectPath;
            this.__explicitlySet__.add("fallbackRedirectPath");
            return this;
        }
        /** The path to be used as logout. */
        @com.fasterxml.jackson.annotation.JsonProperty("logoutPath")
        private String logoutPath;

        /**
         * The path to be used as logout.
         *
         * @param logoutPath the value to set
         * @return this builder
         */
        public Builder logoutPath(String logoutPath) {
            this.logoutPath = logoutPath;
            this.__explicitlySet__.add("logoutPath");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OAuth2ResponseValidationFailurePolicy build() {
            OAuth2ResponseValidationFailurePolicy model =
                    new OAuth2ResponseValidationFailurePolicy(
                            this.clientDetails,
                            this.sourceUriDetails,
                            this.scopes,
                            this.maxExpiryDurationInHours,
                            this.useCookiesForSession,
                            this.useCookiesForIntermediateSteps,
                            this.usePkce,
                            this.responseType,
                            this.fallbackRedirectPath,
                            this.logoutPath);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OAuth2ResponseValidationFailurePolicy model) {
            if (model.wasPropertyExplicitlySet("clientDetails")) {
                this.clientDetails(model.getClientDetails());
            }
            if (model.wasPropertyExplicitlySet("sourceUriDetails")) {
                this.sourceUriDetails(model.getSourceUriDetails());
            }
            if (model.wasPropertyExplicitlySet("scopes")) {
                this.scopes(model.getScopes());
            }
            if (model.wasPropertyExplicitlySet("maxExpiryDurationInHours")) {
                this.maxExpiryDurationInHours(model.getMaxExpiryDurationInHours());
            }
            if (model.wasPropertyExplicitlySet("useCookiesForSession")) {
                this.useCookiesForSession(model.getUseCookiesForSession());
            }
            if (model.wasPropertyExplicitlySet("useCookiesForIntermediateSteps")) {
                this.useCookiesForIntermediateSteps(model.getUseCookiesForIntermediateSteps());
            }
            if (model.wasPropertyExplicitlySet("usePkce")) {
                this.usePkce(model.getUsePkce());
            }
            if (model.wasPropertyExplicitlySet("responseType")) {
                this.responseType(model.getResponseType());
            }
            if (model.wasPropertyExplicitlySet("fallbackRedirectPath")) {
                this.fallbackRedirectPath(model.getFallbackRedirectPath());
            }
            if (model.wasPropertyExplicitlySet("logoutPath")) {
                this.logoutPath(model.getLogoutPath());
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
    public OAuth2ResponseValidationFailurePolicy(
            ClientAppDetails clientDetails,
            SourceUriDetails sourceUriDetails,
            java.util.List<String> scopes,
            Integer maxExpiryDurationInHours,
            Boolean useCookiesForSession,
            Boolean useCookiesForIntermediateSteps,
            Boolean usePkce,
            ResponseType responseType,
            String fallbackRedirectPath,
            String logoutPath) {
        super();
        this.clientDetails = clientDetails;
        this.sourceUriDetails = sourceUriDetails;
        this.scopes = scopes;
        this.maxExpiryDurationInHours = maxExpiryDurationInHours;
        this.useCookiesForSession = useCookiesForSession;
        this.useCookiesForIntermediateSteps = useCookiesForIntermediateSteps;
        this.usePkce = usePkce;
        this.responseType = responseType;
        this.fallbackRedirectPath = fallbackRedirectPath;
        this.logoutPath = logoutPath;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("clientDetails")
    private final ClientAppDetails clientDetails;

    public ClientAppDetails getClientDetails() {
        return clientDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("sourceUriDetails")
    private final SourceUriDetails sourceUriDetails;

    public SourceUriDetails getSourceUriDetails() {
        return sourceUriDetails;
    }

    /** List of scopes. */
    @com.fasterxml.jackson.annotation.JsonProperty("scopes")
    private final java.util.List<String> scopes;

    /**
     * List of scopes.
     *
     * @return the value
     */
    public java.util.List<String> getScopes() {
        return scopes;
    }

    /**
     * The duration for which the OAuth2 success token should be cached before it is fetched again.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxExpiryDurationInHours")
    private final Integer maxExpiryDurationInHours;

    /**
     * The duration for which the OAuth2 success token should be cached before it is fetched again.
     *
     * @return the value
     */
    public Integer getMaxExpiryDurationInHours() {
        return maxExpiryDurationInHours;
    }

    /** Defines whether or not to use cookies for session maintenance. */
    @com.fasterxml.jackson.annotation.JsonProperty("useCookiesForSession")
    private final Boolean useCookiesForSession;

    /**
     * Defines whether or not to use cookies for session maintenance.
     *
     * @return the value
     */
    public Boolean getUseCookiesForSession() {
        return useCookiesForSession;
    }

    /** Defines whether or not to use cookies for OAuth2 intermediate steps. */
    @com.fasterxml.jackson.annotation.JsonProperty("useCookiesForIntermediateSteps")
    private final Boolean useCookiesForIntermediateSteps;

    /**
     * Defines whether or not to use cookies for OAuth2 intermediate steps.
     *
     * @return the value
     */
    public Boolean getUseCookiesForIntermediateSteps() {
        return useCookiesForIntermediateSteps;
    }

    /** Defines whether or not to support PKCE. */
    @com.fasterxml.jackson.annotation.JsonProperty("usePkce")
    private final Boolean usePkce;

    /**
     * Defines whether or not to support PKCE.
     *
     * @return the value
     */
    public Boolean getUsePkce() {
        return usePkce;
    }

    /** Response Type. */
    public enum ResponseType implements com.oracle.bmc.http.internal.BmcEnum {
        Code("CODE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ResponseType.class);

        private final String value;
        private static java.util.Map<String, ResponseType> map;

        static {
            map = new java.util.HashMap<>();
            for (ResponseType v : ResponseType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ResponseType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ResponseType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ResponseType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Response Type. */
    @com.fasterxml.jackson.annotation.JsonProperty("responseType")
    private final ResponseType responseType;

    /**
     * Response Type.
     *
     * @return the value
     */
    public ResponseType getResponseType() {
        return responseType;
    }

    /** The path to be used as fallback after OAuth2. */
    @com.fasterxml.jackson.annotation.JsonProperty("fallbackRedirectPath")
    private final String fallbackRedirectPath;

    /**
     * The path to be used as fallback after OAuth2.
     *
     * @return the value
     */
    public String getFallbackRedirectPath() {
        return fallbackRedirectPath;
    }

    /** The path to be used as logout. */
    @com.fasterxml.jackson.annotation.JsonProperty("logoutPath")
    private final String logoutPath;

    /**
     * The path to be used as logout.
     *
     * @return the value
     */
    public String getLogoutPath() {
        return logoutPath;
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
        sb.append("OAuth2ResponseValidationFailurePolicy(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", clientDetails=").append(String.valueOf(this.clientDetails));
        sb.append(", sourceUriDetails=").append(String.valueOf(this.sourceUriDetails));
        sb.append(", scopes=").append(String.valueOf(this.scopes));
        sb.append(", maxExpiryDurationInHours=")
                .append(String.valueOf(this.maxExpiryDurationInHours));
        sb.append(", useCookiesForSession=").append(String.valueOf(this.useCookiesForSession));
        sb.append(", useCookiesForIntermediateSteps=")
                .append(String.valueOf(this.useCookiesForIntermediateSteps));
        sb.append(", usePkce=").append(String.valueOf(this.usePkce));
        sb.append(", responseType=").append(String.valueOf(this.responseType));
        sb.append(", fallbackRedirectPath=").append(String.valueOf(this.fallbackRedirectPath));
        sb.append(", logoutPath=").append(String.valueOf(this.logoutPath));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OAuth2ResponseValidationFailurePolicy)) {
            return false;
        }

        OAuth2ResponseValidationFailurePolicy other = (OAuth2ResponseValidationFailurePolicy) o;
        return java.util.Objects.equals(this.clientDetails, other.clientDetails)
                && java.util.Objects.equals(this.sourceUriDetails, other.sourceUriDetails)
                && java.util.Objects.equals(this.scopes, other.scopes)
                && java.util.Objects.equals(
                        this.maxExpiryDurationInHours, other.maxExpiryDurationInHours)
                && java.util.Objects.equals(this.useCookiesForSession, other.useCookiesForSession)
                && java.util.Objects.equals(
                        this.useCookiesForIntermediateSteps, other.useCookiesForIntermediateSteps)
                && java.util.Objects.equals(this.usePkce, other.usePkce)
                && java.util.Objects.equals(this.responseType, other.responseType)
                && java.util.Objects.equals(this.fallbackRedirectPath, other.fallbackRedirectPath)
                && java.util.Objects.equals(this.logoutPath, other.logoutPath)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.clientDetails == null ? 43 : this.clientDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceUriDetails == null ? 43 : this.sourceUriDetails.hashCode());
        result = (result * PRIME) + (this.scopes == null ? 43 : this.scopes.hashCode());
        result =
                (result * PRIME)
                        + (this.maxExpiryDurationInHours == null
                                ? 43
                                : this.maxExpiryDurationInHours.hashCode());
        result =
                (result * PRIME)
                        + (this.useCookiesForSession == null
                                ? 43
                                : this.useCookiesForSession.hashCode());
        result =
                (result * PRIME)
                        + (this.useCookiesForIntermediateSteps == null
                                ? 43
                                : this.useCookiesForIntermediateSteps.hashCode());
        result = (result * PRIME) + (this.usePkce == null ? 43 : this.usePkce.hashCode());
        result = (result * PRIME) + (this.responseType == null ? 43 : this.responseType.hashCode());
        result =
                (result * PRIME)
                        + (this.fallbackRedirectPath == null
                                ? 43
                                : this.fallbackRedirectPath.hashCode());
        result = (result * PRIME) + (this.logoutPath == null ? 43 : this.logoutPath.hashCode());
        return result;
    }
}
