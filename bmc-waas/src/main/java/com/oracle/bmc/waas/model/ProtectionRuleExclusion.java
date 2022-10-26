/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.model;

/**
 * Allows specified types of requests to bypass the protection rule. If a request matches any of the
 * criteria in the {@code exclusions} field, the protection rule will not be executed. Rules can
 * have more than one exclusion and exclusions are applied to requests disjunctively, meaning the
 * specified exclusion strings are independently matched against the specified targets of a request.
 * The first target to match a specified string will trigger an exclusion. **Example:** If the
 * following exclusions are defined for a protection rule:
 *
 * <p>"action": "BLOCK", "exclusions": [ { "target":"REQUEST_COOKIES", "exclusions":["example.com",
 * "12345", "219ffwef9w0f"] }, { "target":"REQUEST_COOKIE_NAMES", "exclusions":["OAMAuthnCookie",
 * "JSESSIONID", "HCM-PSJSESSIONID"] } ], "key": "1000000",
 *
 * <p>A request with the cookie name {@code sessionid} would trigger an exclusion. A request with
 * the cookie name {@code yourcompany.com} would *not* trigger and exclusion. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ProtectionRuleExclusion.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ProtectionRuleExclusion
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"target", "exclusions"})
    public ProtectionRuleExclusion(Target target, java.util.List<String> exclusions) {
        super();
        this.target = target;
        this.exclusions = exclusions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The target of the exclusion. */
        @com.fasterxml.jackson.annotation.JsonProperty("target")
        private Target target;

        /**
         * The target of the exclusion.
         *
         * @param target the value to set
         * @return this builder
         */
        public Builder target(Target target) {
            this.target = target;
            this.__explicitlySet__.add("target");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("exclusions")
        private java.util.List<String> exclusions;

        public Builder exclusions(java.util.List<String> exclusions) {
            this.exclusions = exclusions;
            this.__explicitlySet__.add("exclusions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ProtectionRuleExclusion build() {
            ProtectionRuleExclusion model =
                    new ProtectionRuleExclusion(this.target, this.exclusions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProtectionRuleExclusion model) {
            if (model.wasPropertyExplicitlySet("target")) {
                this.target(model.getTarget());
            }
            if (model.wasPropertyExplicitlySet("exclusions")) {
                this.exclusions(model.getExclusions());
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

    /** The target of the exclusion. */
    public enum Target implements com.oracle.bmc.http.internal.BmcEnum {
        RequestCookies("REQUEST_COOKIES"),
        RequestCookieNames("REQUEST_COOKIE_NAMES"),
        Args("ARGS"),
        ArgsNames("ARGS_NAMES"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Target.class);

        private final String value;
        private static java.util.Map<String, Target> map;

        static {
            map = new java.util.HashMap<>();
            for (Target v : Target.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Target(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Target create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Target', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The target of the exclusion. */
    @com.fasterxml.jackson.annotation.JsonProperty("target")
    private final Target target;

    /**
     * The target of the exclusion.
     *
     * @return the value
     */
    public Target getTarget() {
        return target;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("exclusions")
    private final java.util.List<String> exclusions;

    public java.util.List<String> getExclusions() {
        return exclusions;
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
        sb.append("ProtectionRuleExclusion(");
        sb.append("super=").append(super.toString());
        sb.append("target=").append(String.valueOf(this.target));
        sb.append(", exclusions=").append(String.valueOf(this.exclusions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ProtectionRuleExclusion)) {
            return false;
        }

        ProtectionRuleExclusion other = (ProtectionRuleExclusion) o;
        return java.util.Objects.equals(this.target, other.target)
                && java.util.Objects.equals(this.exclusions, other.exclusions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.target == null ? 43 : this.target.hashCode());
        result = (result * PRIME) + (this.exclusions == null ? 43 : this.exclusions.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
