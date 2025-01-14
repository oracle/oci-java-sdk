/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waf.model;

/**
 * Module that allows to enable OCI-managed protection capabilities for incoming HTTP requests. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210930")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RequestProtection.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RequestProtection
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "rules",
        "bodyInspectionSizeLimitInBytes",
        "bodyInspectionSizeLimitExceededActionName"
    })
    public RequestProtection(
            java.util.List<ProtectionRule> rules,
            Integer bodyInspectionSizeLimitInBytes,
            String bodyInspectionSizeLimitExceededActionName) {
        super();
        this.rules = rules;
        this.bodyInspectionSizeLimitInBytes = bodyInspectionSizeLimitInBytes;
        this.bodyInspectionSizeLimitExceededActionName = bodyInspectionSizeLimitExceededActionName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Ordered list of ProtectionRules. Rules are executed in order of appearance in this array.
         * ProtectionRules in this array can only use protection Capabilities of
         * REQUEST_PROTECTION_CAPABILITY type.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("rules")
        private java.util.List<ProtectionRule> rules;

        /**
         * Ordered list of ProtectionRules. Rules are executed in order of appearance in this array.
         * ProtectionRules in this array can only use protection Capabilities of
         * REQUEST_PROTECTION_CAPABILITY type.
         *
         * @param rules the value to set
         * @return this builder
         */
        public Builder rules(java.util.List<ProtectionRule> rules) {
            this.rules = rules;
            this.__explicitlySet__.add("rules");
            return this;
        }
        /**
         * Maximum size of inspected HTTP message body in bytes. Actions to take if this limit is
         * exceeded are defined in {@code bodyInspectionSizeLimitExceededActionName}.
         *
         * <p>Body inspection maximum size allowed is defined with per-tenancy limit: 8192 bytes.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("bodyInspectionSizeLimitInBytes")
        private Integer bodyInspectionSizeLimitInBytes;

        /**
         * Maximum size of inspected HTTP message body in bytes. Actions to take if this limit is
         * exceeded are defined in {@code bodyInspectionSizeLimitExceededActionName}.
         *
         * <p>Body inspection maximum size allowed is defined with per-tenancy limit: 8192 bytes.
         *
         * @param bodyInspectionSizeLimitInBytes the value to set
         * @return this builder
         */
        public Builder bodyInspectionSizeLimitInBytes(Integer bodyInspectionSizeLimitInBytes) {
            this.bodyInspectionSizeLimitInBytes = bodyInspectionSizeLimitInBytes;
            this.__explicitlySet__.add("bodyInspectionSizeLimitInBytes");
            return this;
        }
        /**
         * References action by name from actions defined in WebAppFirewallPolicy. Executed if HTTP
         * message body size exceeds limit set in field {@code bodyInspectionSizeLimitInBytes}.
         *
         * <p>If this field is {@code null} HTTP message body will inspected up to {@code
         * bodyInspectionSizeLimitInBytes} and the rest will not be inspected by Protection
         * Capabilities.
         *
         * <p>Allowed action types: * **RETURN_HTTP_RESPONSE** terminates further execution of
         * modules and rules and returns defined HTTP response.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("bodyInspectionSizeLimitExceededActionName")
        private String bodyInspectionSizeLimitExceededActionName;

        /**
         * References action by name from actions defined in WebAppFirewallPolicy. Executed if HTTP
         * message body size exceeds limit set in field {@code bodyInspectionSizeLimitInBytes}.
         *
         * <p>If this field is {@code null} HTTP message body will inspected up to {@code
         * bodyInspectionSizeLimitInBytes} and the rest will not be inspected by Protection
         * Capabilities.
         *
         * <p>Allowed action types: * **RETURN_HTTP_RESPONSE** terminates further execution of
         * modules and rules and returns defined HTTP response.
         *
         * @param bodyInspectionSizeLimitExceededActionName the value to set
         * @return this builder
         */
        public Builder bodyInspectionSizeLimitExceededActionName(
                String bodyInspectionSizeLimitExceededActionName) {
            this.bodyInspectionSizeLimitExceededActionName =
                    bodyInspectionSizeLimitExceededActionName;
            this.__explicitlySet__.add("bodyInspectionSizeLimitExceededActionName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RequestProtection build() {
            RequestProtection model =
                    new RequestProtection(
                            this.rules,
                            this.bodyInspectionSizeLimitInBytes,
                            this.bodyInspectionSizeLimitExceededActionName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RequestProtection model) {
            if (model.wasPropertyExplicitlySet("rules")) {
                this.rules(model.getRules());
            }
            if (model.wasPropertyExplicitlySet("bodyInspectionSizeLimitInBytes")) {
                this.bodyInspectionSizeLimitInBytes(model.getBodyInspectionSizeLimitInBytes());
            }
            if (model.wasPropertyExplicitlySet("bodyInspectionSizeLimitExceededActionName")) {
                this.bodyInspectionSizeLimitExceededActionName(
                        model.getBodyInspectionSizeLimitExceededActionName());
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
     * Ordered list of ProtectionRules. Rules are executed in order of appearance in this array.
     * ProtectionRules in this array can only use protection Capabilities of
     * REQUEST_PROTECTION_CAPABILITY type.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rules")
    private final java.util.List<ProtectionRule> rules;

    /**
     * Ordered list of ProtectionRules. Rules are executed in order of appearance in this array.
     * ProtectionRules in this array can only use protection Capabilities of
     * REQUEST_PROTECTION_CAPABILITY type.
     *
     * @return the value
     */
    public java.util.List<ProtectionRule> getRules() {
        return rules;
    }

    /**
     * Maximum size of inspected HTTP message body in bytes. Actions to take if this limit is
     * exceeded are defined in {@code bodyInspectionSizeLimitExceededActionName}.
     *
     * <p>Body inspection maximum size allowed is defined with per-tenancy limit: 8192 bytes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bodyInspectionSizeLimitInBytes")
    private final Integer bodyInspectionSizeLimitInBytes;

    /**
     * Maximum size of inspected HTTP message body in bytes. Actions to take if this limit is
     * exceeded are defined in {@code bodyInspectionSizeLimitExceededActionName}.
     *
     * <p>Body inspection maximum size allowed is defined with per-tenancy limit: 8192 bytes.
     *
     * @return the value
     */
    public Integer getBodyInspectionSizeLimitInBytes() {
        return bodyInspectionSizeLimitInBytes;
    }

    /**
     * References action by name from actions defined in WebAppFirewallPolicy. Executed if HTTP
     * message body size exceeds limit set in field {@code bodyInspectionSizeLimitInBytes}.
     *
     * <p>If this field is {@code null} HTTP message body will inspected up to {@code
     * bodyInspectionSizeLimitInBytes} and the rest will not be inspected by Protection
     * Capabilities.
     *
     * <p>Allowed action types: * **RETURN_HTTP_RESPONSE** terminates further execution of modules
     * and rules and returns defined HTTP response.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bodyInspectionSizeLimitExceededActionName")
    private final String bodyInspectionSizeLimitExceededActionName;

    /**
     * References action by name from actions defined in WebAppFirewallPolicy. Executed if HTTP
     * message body size exceeds limit set in field {@code bodyInspectionSizeLimitInBytes}.
     *
     * <p>If this field is {@code null} HTTP message body will inspected up to {@code
     * bodyInspectionSizeLimitInBytes} and the rest will not be inspected by Protection
     * Capabilities.
     *
     * <p>Allowed action types: * **RETURN_HTTP_RESPONSE** terminates further execution of modules
     * and rules and returns defined HTTP response.
     *
     * @return the value
     */
    public String getBodyInspectionSizeLimitExceededActionName() {
        return bodyInspectionSizeLimitExceededActionName;
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
        sb.append("RequestProtection(");
        sb.append("super=").append(super.toString());
        sb.append("rules=").append(String.valueOf(this.rules));
        sb.append(", bodyInspectionSizeLimitInBytes=")
                .append(String.valueOf(this.bodyInspectionSizeLimitInBytes));
        sb.append(", bodyInspectionSizeLimitExceededActionName=")
                .append(String.valueOf(this.bodyInspectionSizeLimitExceededActionName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RequestProtection)) {
            return false;
        }

        RequestProtection other = (RequestProtection) o;
        return java.util.Objects.equals(this.rules, other.rules)
                && java.util.Objects.equals(
                        this.bodyInspectionSizeLimitInBytes, other.bodyInspectionSizeLimitInBytes)
                && java.util.Objects.equals(
                        this.bodyInspectionSizeLimitExceededActionName,
                        other.bodyInspectionSizeLimitExceededActionName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.rules == null ? 43 : this.rules.hashCode());
        result =
                (result * PRIME)
                        + (this.bodyInspectionSizeLimitInBytes == null
                                ? 43
                                : this.bodyInspectionSizeLimitInBytes.hashCode());
        result =
                (result * PRIME)
                        + (this.bodyInspectionSizeLimitExceededActionName == null
                                ? 43
                                : this.bodyInspectionSizeLimitExceededActionName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
