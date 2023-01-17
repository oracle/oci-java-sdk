/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * An object that represents the action of returning a specified response code and a redirect URI. Each RedirectRule
 * object is configured for a particular listener and a designated path.
 * <p>
 * The default response code is {@code 302 Found}.
 * <p>
 **NOTES:**
 * *  This rule applies only to HTTP listeners.
 * *  You can specify this rule only with the {@link #ruleCondition(RuleConditionRequest) ruleCondition}
 *    type {@code PATH}.
 * *  A listener can have only one RedirectRule object for a given original path. The
 *   {@link #pathMatchCondition(PathMatchConditionRequest) pathMatchCondition} {@code attributeValue} specifies the
 *   original path.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RedirectRule.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "action"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RedirectRule extends Rule {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The HTTP status code to return when the incoming request is redirected.
         * <p>
         * The status line returned with the code is mapped from the standard HTTP specification. Valid response
         * codes for redirection are:
         * <p>
         *  301
         * *  302
         * *  303
         * *  307
         * *  308
         * <p>
         * The default value is {@code 302} (Found).
         * <p>
         * Example: {@code 301}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("responseCode")
        private Integer responseCode;

        /**
         * The HTTP status code to return when the incoming request is redirected.
         * <p>
         * The status line returned with the code is mapped from the standard HTTP specification. Valid response
         * codes for redirection are:
         * <p>
         *  301
         * *  302
         * *  303
         * *  307
         * *  308
         * <p>
         * The default value is {@code 302} (Found).
         * <p>
         * Example: {@code 301}
         *
         * @param responseCode the value to set
         * @return this builder
         **/
        public Builder responseCode(Integer responseCode) {
            this.responseCode = responseCode;
            this.__explicitlySet__.add("responseCode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("conditions")
        private java.util.List<RuleCondition> conditions;

        public Builder conditions(java.util.List<RuleCondition> conditions) {
            this.conditions = conditions;
            this.__explicitlySet__.add("conditions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("redirectUri")
        private RedirectUri redirectUri;

        public Builder redirectUri(RedirectUri redirectUri) {
            this.redirectUri = redirectUri;
            this.__explicitlySet__.add("redirectUri");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RedirectRule build() {
            RedirectRule model =
                    new RedirectRule(this.responseCode, this.conditions, this.redirectUri);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RedirectRule model) {
            if (model.wasPropertyExplicitlySet("responseCode")) {
                this.responseCode(model.getResponseCode());
            }
            if (model.wasPropertyExplicitlySet("conditions")) {
                this.conditions(model.getConditions());
            }
            if (model.wasPropertyExplicitlySet("redirectUri")) {
                this.redirectUri(model.getRedirectUri());
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

    @Deprecated
    public RedirectRule(
            Integer responseCode,
            java.util.List<RuleCondition> conditions,
            RedirectUri redirectUri) {
        super();
        this.responseCode = responseCode;
        this.conditions = conditions;
        this.redirectUri = redirectUri;
    }

    /**
     * The HTTP status code to return when the incoming request is redirected.
     * <p>
     * The status line returned with the code is mapped from the standard HTTP specification. Valid response
     * codes for redirection are:
     * <p>
     *  301
     * *  302
     * *  303
     * *  307
     * *  308
     * <p>
     * The default value is {@code 302} (Found).
     * <p>
     * Example: {@code 301}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("responseCode")
    private final Integer responseCode;

    /**
     * The HTTP status code to return when the incoming request is redirected.
     * <p>
     * The status line returned with the code is mapped from the standard HTTP specification. Valid response
     * codes for redirection are:
     * <p>
     *  301
     * *  302
     * *  303
     * *  307
     * *  308
     * <p>
     * The default value is {@code 302} (Found).
     * <p>
     * Example: {@code 301}
     *
     * @return the value
     **/
    public Integer getResponseCode() {
        return responseCode;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("conditions")
    private final java.util.List<RuleCondition> conditions;

    public java.util.List<RuleCondition> getConditions() {
        return conditions;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("redirectUri")
    private final RedirectUri redirectUri;

    public RedirectUri getRedirectUri() {
        return redirectUri;
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
        sb.append("RedirectRule(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", responseCode=").append(String.valueOf(this.responseCode));
        sb.append(", conditions=").append(String.valueOf(this.conditions));
        sb.append(", redirectUri=").append(String.valueOf(this.redirectUri));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RedirectRule)) {
            return false;
        }

        RedirectRule other = (RedirectRule) o;
        return java.util.Objects.equals(this.responseCode, other.responseCode)
                && java.util.Objects.equals(this.conditions, other.conditions)
                && java.util.Objects.equals(this.redirectUri, other.redirectUri)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.responseCode == null ? 43 : this.responseCode.hashCode());
        result = (result * PRIME) + (this.conditions == null ? 43 : this.conditions.hashCode());
        result = (result * PRIME) + (this.redirectUri == null ? 43 : this.redirectUri.hashCode());
        return result;
    }
}
