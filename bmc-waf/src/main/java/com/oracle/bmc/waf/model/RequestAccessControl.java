/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waf.model;

/**
 * Module that allows inspection of HTTP request properties and to return a defined HTTP response.
 * In this module, rules with the name 'Default Action' are not allowed, since this name is reserved for default action logs.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210930")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = RequestAccessControl.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RequestAccessControl extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"defaultActionName", "rules"})
    public RequestAccessControl(String defaultActionName, java.util.List<AccessControlRule> rules) {
        super();
        this.defaultActionName = defaultActionName;
        this.rules = rules;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * References an default Action to take if no AccessControlRule was matched. Allowed action types:
         * <p>
         * **ALLOW** continues execution of other modules and their rules.
         * <p>
         * **RETURN_HTTP_RESPONSE** terminates further execution of modules and rules and returns defined HTTP response.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("defaultActionName")
        private String defaultActionName;

        /**
         * References an default Action to take if no AccessControlRule was matched. Allowed action types:
         * <p>
         * **ALLOW** continues execution of other modules and their rules.
         * <p>
         * **RETURN_HTTP_RESPONSE** terminates further execution of modules and rules and returns defined HTTP response.
         *
         * @param defaultActionName the value to set
         * @return this builder
         **/
        public Builder defaultActionName(String defaultActionName) {
            this.defaultActionName = defaultActionName;
            this.__explicitlySet__.add("defaultActionName");
            return this;
        }
        /**
         * Ordered list of AccessControlRules. Rules are executed in order of appearance in this array.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("rules")
        private java.util.List<AccessControlRule> rules;

        /**
         * Ordered list of AccessControlRules. Rules are executed in order of appearance in this array.
         * @param rules the value to set
         * @return this builder
         **/
        public Builder rules(java.util.List<AccessControlRule> rules) {
            this.rules = rules;
            this.__explicitlySet__.add("rules");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RequestAccessControl build() {
            RequestAccessControl model =
                    new RequestAccessControl(this.defaultActionName, this.rules);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RequestAccessControl model) {
            if (model.wasPropertyExplicitlySet("defaultActionName")) {
                this.defaultActionName(model.getDefaultActionName());
            }
            if (model.wasPropertyExplicitlySet("rules")) {
                this.rules(model.getRules());
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
     * References an default Action to take if no AccessControlRule was matched. Allowed action types:
     * <p>
     * **ALLOW** continues execution of other modules and their rules.
     * <p>
     * **RETURN_HTTP_RESPONSE** terminates further execution of modules and rules and returns defined HTTP response.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultActionName")
    private final String defaultActionName;

    /**
     * References an default Action to take if no AccessControlRule was matched. Allowed action types:
     * <p>
     * **ALLOW** continues execution of other modules and their rules.
     * <p>
     * **RETURN_HTTP_RESPONSE** terminates further execution of modules and rules and returns defined HTTP response.
     *
     * @return the value
     **/
    public String getDefaultActionName() {
        return defaultActionName;
    }

    /**
     * Ordered list of AccessControlRules. Rules are executed in order of appearance in this array.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rules")
    private final java.util.List<AccessControlRule> rules;

    /**
     * Ordered list of AccessControlRules. Rules are executed in order of appearance in this array.
     * @return the value
     **/
    public java.util.List<AccessControlRule> getRules() {
        return rules;
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
        sb.append("RequestAccessControl(");
        sb.append("super=").append(super.toString());
        sb.append("defaultActionName=").append(String.valueOf(this.defaultActionName));
        sb.append(", rules=").append(String.valueOf(this.rules));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RequestAccessControl)) {
            return false;
        }

        RequestAccessControl other = (RequestAccessControl) o;
        return java.util.Objects.equals(this.defaultActionName, other.defaultActionName)
                && java.util.Objects.equals(this.rules, other.rules)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.defaultActionName == null ? 43 : this.defaultActionName.hashCode());
        result = (result * PRIME) + (this.rules == null ? 43 : this.rules.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
