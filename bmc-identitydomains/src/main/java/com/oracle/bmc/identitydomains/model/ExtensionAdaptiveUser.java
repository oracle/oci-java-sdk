/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * This extension defines attributes to manage user's risk score. <br>
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
        builder = ExtensionAdaptiveUser.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExtensionAdaptiveUser
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"riskLevel", "riskScores"})
    public ExtensionAdaptiveUser(
            RiskLevel riskLevel, java.util.List<UserExtRiskScores> riskScores) {
        super();
        this.riskLevel = riskLevel;
        this.riskScores = riskScores;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Risk Level
         *
         * <p>*Added In:** 18.1.6
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readWrite - required: false - returned: request - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("riskLevel")
        private RiskLevel riskLevel;

        /**
         * Risk Level
         *
         * <p>*Added In:** 18.1.6
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readWrite - required: false - returned: request - type: string - uniqueness: none
         *
         * @param riskLevel the value to set
         * @return this builder
         */
        public Builder riskLevel(RiskLevel riskLevel) {
            this.riskLevel = riskLevel;
            this.__explicitlySet__.add("riskLevel");
            return this;
        }
        /**
         * The risk score pertaining to the user.
         *
         * <p>*Added In:** 18.1.6
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsCompositeKey: [value] - multiValued:
         * true - mutability: readWrite - required: false - returned: request - type: complex -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("riskScores")
        private java.util.List<UserExtRiskScores> riskScores;

        /**
         * The risk score pertaining to the user.
         *
         * <p>*Added In:** 18.1.6
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsCompositeKey: [value] - multiValued:
         * true - mutability: readWrite - required: false - returned: request - type: complex -
         * uniqueness: none
         *
         * @param riskScores the value to set
         * @return this builder
         */
        public Builder riskScores(java.util.List<UserExtRiskScores> riskScores) {
            this.riskScores = riskScores;
            this.__explicitlySet__.add("riskScores");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExtensionAdaptiveUser build() {
            ExtensionAdaptiveUser model =
                    new ExtensionAdaptiveUser(this.riskLevel, this.riskScores);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExtensionAdaptiveUser model) {
            if (model.wasPropertyExplicitlySet("riskLevel")) {
                this.riskLevel(model.getRiskLevel());
            }
            if (model.wasPropertyExplicitlySet("riskScores")) {
                this.riskScores(model.getRiskScores());
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
     * Risk Level
     *
     * <p>*Added In:** 18.1.6
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readWrite
     * - required: false - returned: request - type: string - uniqueness: none
     */
    public enum RiskLevel implements com.oracle.bmc.http.internal.BmcEnum {
        Low("LOW"),
        Medium("MEDIUM"),
        High("HIGH"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(RiskLevel.class);

        private final String value;
        private static java.util.Map<String, RiskLevel> map;

        static {
            map = new java.util.HashMap<>();
            for (RiskLevel v : RiskLevel.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        RiskLevel(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RiskLevel create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'RiskLevel', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Risk Level
     *
     * <p>*Added In:** 18.1.6
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readWrite
     * - required: false - returned: request - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("riskLevel")
    private final RiskLevel riskLevel;

    /**
     * Risk Level
     *
     * <p>*Added In:** 18.1.6
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readWrite
     * - required: false - returned: request - type: string - uniqueness: none
     *
     * @return the value
     */
    public RiskLevel getRiskLevel() {
        return riskLevel;
    }

    /**
     * The risk score pertaining to the user.
     *
     * <p>*Added In:** 18.1.6
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsCompositeKey: [value] - multiValued: true -
     * mutability: readWrite - required: false - returned: request - type: complex - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("riskScores")
    private final java.util.List<UserExtRiskScores> riskScores;

    /**
     * The risk score pertaining to the user.
     *
     * <p>*Added In:** 18.1.6
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsCompositeKey: [value] - multiValued: true -
     * mutability: readWrite - required: false - returned: request - type: complex - uniqueness:
     * none
     *
     * @return the value
     */
    public java.util.List<UserExtRiskScores> getRiskScores() {
        return riskScores;
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
        sb.append("ExtensionAdaptiveUser(");
        sb.append("super=").append(super.toString());
        sb.append("riskLevel=").append(String.valueOf(this.riskLevel));
        sb.append(", riskScores=").append(String.valueOf(this.riskScores));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExtensionAdaptiveUser)) {
            return false;
        }

        ExtensionAdaptiveUser other = (ExtensionAdaptiveUser) o;
        return java.util.Objects.equals(this.riskLevel, other.riskLevel)
                && java.util.Objects.equals(this.riskScores, other.riskScores)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.riskLevel == null ? 43 : this.riskLevel.hashCode());
        result = (result * PRIME) + (this.riskScores == null ? 43 : this.riskScores.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
