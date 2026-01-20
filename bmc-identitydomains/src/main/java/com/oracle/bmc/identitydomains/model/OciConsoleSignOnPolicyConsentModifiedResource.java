/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * The modified Policy, Rule, ConditionGroup or Condition during consent signing.
 *
 * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: immutable -
 * required: true - returned: default - type: complex - uniqueness: none <br>
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
        builder = OciConsoleSignOnPolicyConsentModifiedResource.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OciConsoleSignOnPolicyConsentModifiedResource
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"value", "ocid", "type"})
    public OciConsoleSignOnPolicyConsentModifiedResource(String value, String ocid, Type type) {
        super();
        this.value = value;
        this.ocid = ocid;
        this.type = type;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Modified Policy, Rule, ConditionGroup or Condition Id.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
         * mutability: immutable - required: true - returned: default - type: string
         */
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * Modified Policy, Rule, ConditionGroup or Condition Id.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
         * mutability: immutable - required: true - returned: default - type: string
         *
         * @param value the value to set
         * @return this builder
         */
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /**
         * The modified Policy, Rule, ConditionGroup, or Condition OCID.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
         * mutability: immutable - required: true - returned: default - type: string
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ocid")
        private String ocid;

        /**
         * The modified Policy, Rule, ConditionGroup, or Condition OCID.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
         * mutability: immutable - required: true - returned: default - type: string
         *
         * @param ocid the value to set
         * @return this builder
         */
        public Builder ocid(String ocid) {
            this.ocid = ocid;
            this.__explicitlySet__.add("ocid");
            return this;
        }
        /**
         * The Modified Resource type - Policy, Rule, ConditionGroup, or Condition. A label that
         * indicates the resource type.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * immutable - idcsDefaultValue: Policy - required: true - returned: default - type: string
         * - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * The Modified Resource type - Policy, Rule, ConditionGroup, or Condition. A label that
         * indicates the resource type.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * immutable - idcsDefaultValue: Policy - required: true - returned: default - type: string
         * - uniqueness: none
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OciConsoleSignOnPolicyConsentModifiedResource build() {
            OciConsoleSignOnPolicyConsentModifiedResource model =
                    new OciConsoleSignOnPolicyConsentModifiedResource(
                            this.value, this.ocid, this.type);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OciConsoleSignOnPolicyConsentModifiedResource model) {
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("ocid")) {
                this.ocid(model.getOcid());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
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
     * Modified Policy, Rule, ConditionGroup or Condition Id.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: immutable - required: true - returned: default - type: string
     */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * Modified Policy, Rule, ConditionGroup or Condition Id.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: immutable - required: true - returned: default - type: string
     *
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * The modified Policy, Rule, ConditionGroup, or Condition OCID.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: immutable - required: true - returned: default - type: string
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ocid")
    private final String ocid;

    /**
     * The modified Policy, Rule, ConditionGroup, or Condition OCID.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: immutable - required: true - returned: default - type: string
     *
     * @return the value
     */
    public String getOcid() {
        return ocid;
    }

    /**
     * The Modified Resource type - Policy, Rule, ConditionGroup, or Condition. A label that
     * indicates the resource type.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: immutable
     * - idcsDefaultValue: Policy - required: true - returned: default - type: string - uniqueness:
     * none
     */
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        Policy("Policy"),
        Rule("Rule"),
        ConditionGroup("ConditionGroup"),
        Condition("Condition"),

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
    /**
     * The Modified Resource type - Policy, Rule, ConditionGroup, or Condition. A label that
     * indicates the resource type.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: immutable
     * - idcsDefaultValue: Policy - required: true - returned: default - type: string - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * The Modified Resource type - Policy, Rule, ConditionGroup, or Condition. A label that
     * indicates the resource type.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: immutable
     * - idcsDefaultValue: Policy - required: true - returned: default - type: string - uniqueness:
     * none
     *
     * @return the value
     */
    public Type getType() {
        return type;
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
        sb.append("OciConsoleSignOnPolicyConsentModifiedResource(");
        sb.append("super=").append(super.toString());
        sb.append("value=").append(String.valueOf(this.value));
        sb.append(", ocid=").append(String.valueOf(this.ocid));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OciConsoleSignOnPolicyConsentModifiedResource)) {
            return false;
        }

        OciConsoleSignOnPolicyConsentModifiedResource other =
                (OciConsoleSignOnPolicyConsentModifiedResource) o;
        return java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.ocid, other.ocid)
                && java.util.Objects.equals(this.type, other.type)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.ocid == null ? 43 : this.ocid.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
