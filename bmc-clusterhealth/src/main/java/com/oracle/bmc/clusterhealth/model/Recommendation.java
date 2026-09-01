/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.clusterhealth.model;

/**
 * recommendation <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260331")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Recommendation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Recommendation
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "type",
        "testName",
        "faultCode",
        "issue",
        "suggestion",
        "action"
    })
    public Recommendation(
            Type type,
            String testName,
            String faultCode,
            String issue,
            String suggestion,
            String action) {
        super();
        this.type = type;
        this.testName = testName;
        this.faultCode = faultCode;
        this.issue = issue;
        this.suggestion = suggestion;
        this.action = action;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Severity of the recommendation. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * Severity of the recommendation.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /** name of the test */
        @com.fasterxml.jackson.annotation.JsonProperty("testName")
        private String testName;

        /**
         * name of the test
         *
         * @param testName the value to set
         * @return this builder
         */
        public Builder testName(String testName) {
            this.testName = testName;
            this.__explicitlySet__.add("testName");
            return this;
        }
        /** Optional fault code identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("faultCode")
        private String faultCode;

        /**
         * Optional fault code identifier.
         *
         * @param faultCode the value to set
         * @return this builder
         */
        public Builder faultCode(String faultCode) {
            this.faultCode = faultCode;
            this.__explicitlySet__.add("faultCode");
            return this;
        }
        /** description of the issue */
        @com.fasterxml.jackson.annotation.JsonProperty("issue")
        private String issue;

        /**
         * description of the issue
         *
         * @param issue the value to set
         * @return this builder
         */
        public Builder issue(String issue) {
            this.issue = issue;
            this.__explicitlySet__.add("issue");
            return this;
        }
        /** suggested actions */
        @com.fasterxml.jackson.annotation.JsonProperty("suggestion")
        private String suggestion;

        /**
         * suggested actions
         *
         * @param suggestion the value to set
         * @return this builder
         */
        public Builder suggestion(String suggestion) {
            this.suggestion = suggestion;
            this.__explicitlySet__.add("suggestion");
            return this;
        }
        /** Optional action to take (empty string when no action is required). */
        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private String action;

        /**
         * Optional action to take (empty string when no action is required).
         *
         * @param action the value to set
         * @return this builder
         */
        public Builder action(String action) {
            this.action = action;
            this.__explicitlySet__.add("action");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Recommendation build() {
            Recommendation model =
                    new Recommendation(
                            this.type,
                            this.testName,
                            this.faultCode,
                            this.issue,
                            this.suggestion,
                            this.action);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Recommendation model) {
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("testName")) {
                this.testName(model.getTestName());
            }
            if (model.wasPropertyExplicitlySet("faultCode")) {
                this.faultCode(model.getFaultCode());
            }
            if (model.wasPropertyExplicitlySet("issue")) {
                this.issue(model.getIssue());
            }
            if (model.wasPropertyExplicitlySet("suggestion")) {
                this.suggestion(model.getSuggestion());
            }
            if (model.wasPropertyExplicitlySet("action")) {
                this.action(model.getAction());
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

    /** Severity of the recommendation. */
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        Critical("CRITICAL"),
        Warning("WARNING"),
        Info("INFO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Type.class);

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Type', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /** Severity of the recommendation. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * Severity of the recommendation.
     *
     * @return the value
     */
    public Type getType() {
        return type;
    }

    /** name of the test */
    @com.fasterxml.jackson.annotation.JsonProperty("testName")
    private final String testName;

    /**
     * name of the test
     *
     * @return the value
     */
    public String getTestName() {
        return testName;
    }

    /** Optional fault code identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("faultCode")
    private final String faultCode;

    /**
     * Optional fault code identifier.
     *
     * @return the value
     */
    public String getFaultCode() {
        return faultCode;
    }

    /** description of the issue */
    @com.fasterxml.jackson.annotation.JsonProperty("issue")
    private final String issue;

    /**
     * description of the issue
     *
     * @return the value
     */
    public String getIssue() {
        return issue;
    }

    /** suggested actions */
    @com.fasterxml.jackson.annotation.JsonProperty("suggestion")
    private final String suggestion;

    /**
     * suggested actions
     *
     * @return the value
     */
    public String getSuggestion() {
        return suggestion;
    }

    /** Optional action to take (empty string when no action is required). */
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final String action;

    /**
     * Optional action to take (empty string when no action is required).
     *
     * @return the value
     */
    public String getAction() {
        return action;
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
        sb.append("Recommendation(");
        sb.append("super=").append(super.toString());
        sb.append("type=").append(String.valueOf(this.type));
        sb.append(", testName=").append(String.valueOf(this.testName));
        sb.append(", faultCode=").append(String.valueOf(this.faultCode));
        sb.append(", issue=").append(String.valueOf(this.issue));
        sb.append(", suggestion=").append(String.valueOf(this.suggestion));
        sb.append(", action=").append(String.valueOf(this.action));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Recommendation)) {
            return false;
        }

        Recommendation other = (Recommendation) o;
        return java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.testName, other.testName)
                && java.util.Objects.equals(this.faultCode, other.faultCode)
                && java.util.Objects.equals(this.issue, other.issue)
                && java.util.Objects.equals(this.suggestion, other.suggestion)
                && java.util.Objects.equals(this.action, other.action)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.testName == null ? 43 : this.testName.hashCode());
        result = (result * PRIME) + (this.faultCode == null ? 43 : this.faultCode.hashCode());
        result = (result * PRIME) + (this.issue == null ? 43 : this.issue.hashCode());
        result = (result * PRIME) + (this.suggestion == null ? 43 : this.suggestion.hashCode());
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
