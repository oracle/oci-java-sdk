/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * Global behavior applied to all requests received by the API. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ApiSpecificationRequestPolicies.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ApiSpecificationRequestPolicies
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "authentication",
        "rateLimiting",
        "cors",
        "mutualTls",
        "usagePlans",
        "dynamicAuthentication"
    })
    public ApiSpecificationRequestPolicies(
            AuthenticationPolicy authentication,
            RateLimitingPolicy rateLimiting,
            CorsPolicy cors,
            MutualTlsDetails mutualTls,
            UsagePlansPolicy usagePlans,
            DynamicAuthenticationPolicy dynamicAuthentication) {
        super();
        this.authentication = authentication;
        this.rateLimiting = rateLimiting;
        this.cors = cors;
        this.mutualTls = mutualTls;
        this.usagePlans = usagePlans;
        this.dynamicAuthentication = dynamicAuthentication;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("authentication")
        private AuthenticationPolicy authentication;

        public Builder authentication(AuthenticationPolicy authentication) {
            this.authentication = authentication;
            this.__explicitlySet__.add("authentication");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rateLimiting")
        private RateLimitingPolicy rateLimiting;

        public Builder rateLimiting(RateLimitingPolicy rateLimiting) {
            this.rateLimiting = rateLimiting;
            this.__explicitlySet__.add("rateLimiting");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cors")
        private CorsPolicy cors;

        public Builder cors(CorsPolicy cors) {
            this.cors = cors;
            this.__explicitlySet__.add("cors");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("mutualTls")
        private MutualTlsDetails mutualTls;

        public Builder mutualTls(MutualTlsDetails mutualTls) {
            this.mutualTls = mutualTls;
            this.__explicitlySet__.add("mutualTls");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("usagePlans")
        private UsagePlansPolicy usagePlans;

        public Builder usagePlans(UsagePlansPolicy usagePlans) {
            this.usagePlans = usagePlans;
            this.__explicitlySet__.add("usagePlans");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dynamicAuthentication")
        private DynamicAuthenticationPolicy dynamicAuthentication;

        public Builder dynamicAuthentication(DynamicAuthenticationPolicy dynamicAuthentication) {
            this.dynamicAuthentication = dynamicAuthentication;
            this.__explicitlySet__.add("dynamicAuthentication");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ApiSpecificationRequestPolicies build() {
            ApiSpecificationRequestPolicies model =
                    new ApiSpecificationRequestPolicies(
                            this.authentication,
                            this.rateLimiting,
                            this.cors,
                            this.mutualTls,
                            this.usagePlans,
                            this.dynamicAuthentication);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ApiSpecificationRequestPolicies model) {
            if (model.wasPropertyExplicitlySet("authentication")) {
                this.authentication(model.getAuthentication());
            }
            if (model.wasPropertyExplicitlySet("rateLimiting")) {
                this.rateLimiting(model.getRateLimiting());
            }
            if (model.wasPropertyExplicitlySet("cors")) {
                this.cors(model.getCors());
            }
            if (model.wasPropertyExplicitlySet("mutualTls")) {
                this.mutualTls(model.getMutualTls());
            }
            if (model.wasPropertyExplicitlySet("usagePlans")) {
                this.usagePlans(model.getUsagePlans());
            }
            if (model.wasPropertyExplicitlySet("dynamicAuthentication")) {
                this.dynamicAuthentication(model.getDynamicAuthentication());
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

    @com.fasterxml.jackson.annotation.JsonProperty("authentication")
    private final AuthenticationPolicy authentication;

    public AuthenticationPolicy getAuthentication() {
        return authentication;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("rateLimiting")
    private final RateLimitingPolicy rateLimiting;

    public RateLimitingPolicy getRateLimiting() {
        return rateLimiting;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("cors")
    private final CorsPolicy cors;

    public CorsPolicy getCors() {
        return cors;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("mutualTls")
    private final MutualTlsDetails mutualTls;

    public MutualTlsDetails getMutualTls() {
        return mutualTls;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("usagePlans")
    private final UsagePlansPolicy usagePlans;

    public UsagePlansPolicy getUsagePlans() {
        return usagePlans;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dynamicAuthentication")
    private final DynamicAuthenticationPolicy dynamicAuthentication;

    public DynamicAuthenticationPolicy getDynamicAuthentication() {
        return dynamicAuthentication;
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
        sb.append("ApiSpecificationRequestPolicies(");
        sb.append("super=").append(super.toString());
        sb.append("authentication=").append(String.valueOf(this.authentication));
        sb.append(", rateLimiting=").append(String.valueOf(this.rateLimiting));
        sb.append(", cors=").append(String.valueOf(this.cors));
        sb.append(", mutualTls=").append(String.valueOf(this.mutualTls));
        sb.append(", usagePlans=").append(String.valueOf(this.usagePlans));
        sb.append(", dynamicAuthentication=").append(String.valueOf(this.dynamicAuthentication));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ApiSpecificationRequestPolicies)) {
            return false;
        }

        ApiSpecificationRequestPolicies other = (ApiSpecificationRequestPolicies) o;
        return java.util.Objects.equals(this.authentication, other.authentication)
                && java.util.Objects.equals(this.rateLimiting, other.rateLimiting)
                && java.util.Objects.equals(this.cors, other.cors)
                && java.util.Objects.equals(this.mutualTls, other.mutualTls)
                && java.util.Objects.equals(this.usagePlans, other.usagePlans)
                && java.util.Objects.equals(this.dynamicAuthentication, other.dynamicAuthentication)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.authentication == null ? 43 : this.authentication.hashCode());
        result = (result * PRIME) + (this.rateLimiting == null ? 43 : this.rateLimiting.hashCode());
        result = (result * PRIME) + (this.cors == null ? 43 : this.cors.hashCode());
        result = (result * PRIME) + (this.mutualTls == null ? 43 : this.mutualTls.hashCode());
        result = (result * PRIME) + (this.usagePlans == null ? 43 : this.usagePlans.hashCode());
        result =
                (result * PRIME)
                        + (this.dynamicAuthentication == null
                                ? 43
                                : this.dynamicAuthentication.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
