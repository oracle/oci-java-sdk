/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * The risk score pertaining to the user.
 *
 * <p>*Added In:** 18.1.6
 *
 * <p>*SCIM++ Properties:** - caseExact: false - idcsCompositeKey: [value] - multiValued: true -
 * mutability: readWrite - required: false - returned: request - type: complex - uniqueness: none
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
        builder = UserExtRiskScores.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UserExtRiskScores
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "value",
        "ref",
        "source",
        "status",
        "score",
        "riskLevel",
        "lastUpdateTimestamp"
    })
    public UserExtRiskScores(
            String value,
            String ref,
            String source,
            String status,
            Integer score,
            RiskLevel riskLevel,
            String lastUpdateTimestamp) {
        super();
        this.value = value;
        this.ref = ref;
        this.source = source;
        this.status = status;
        this.score = score;
        this.riskLevel = riskLevel;
        this.lastUpdateTimestamp = lastUpdateTimestamp;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Risk Provider Profile: Identifier for the provider service from which the risk score was
         * received.
         *
         * <p>*Added In:** 18.1.6
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: true - returned: always - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * Risk Provider Profile: Identifier for the provider service from which the risk score was
         * received.
         *
         * <p>*Added In:** 18.1.6
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: true - returned: always - type: string - uniqueness:
         * none
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
         * Risk Provider Profile URI: URI that corresponds to risk source identifier.
         *
         * <p>*Added In:** 18.1.6
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
         * mutability: readOnly - required: false - returned: always - type: reference - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("$ref")
        private String ref;

        /**
         * Risk Provider Profile URI: URI that corresponds to risk source identifier.
         *
         * <p>*Added In:** 18.1.6
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
         * mutability: readOnly - required: false - returned: always - type: reference - uniqueness:
         * none
         *
         * @param ref the value to set
         * @return this builder
         */
        public Builder ref(String ref) {
            this.ref = ref;
            this.__explicitlySet__.add("ref");
            return this;
        }
        /**
         * Risk Provider Profile Source
         *
         * <p>*Added In:** 18.1.6
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: false - returned: always - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("source")
        private String source;

        /**
         * Risk Provider Profile Source
         *
         * <p>*Added In:** 18.1.6
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: false - returned: always - type: string - uniqueness:
         * none
         *
         * @param source the value to set
         * @return this builder
         */
        public Builder source(String source) {
            this.source = source;
            this.__explicitlySet__.add("source");
            return this;
        }
        /**
         * Risk Provider Profile status
         *
         * <p>*Added In:** 18.1.6
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: false - returned: always - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private String status;

        /**
         * Risk Provider Profile status
         *
         * <p>*Added In:** 18.1.6
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: false - returned: always - type: string - uniqueness:
         * none
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(String status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * Risk Score value
         *
         * <p>*Added In:** 18.1.6
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: true - returned: always - type: integer - uniqueness:
         * none - idcsMaxValue: 100 - idcsMinValue: 0
         */
        @com.fasterxml.jackson.annotation.JsonProperty("score")
        private Integer score;

        /**
         * Risk Score value
         *
         * <p>*Added In:** 18.1.6
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: true - returned: always - type: integer - uniqueness:
         * none - idcsMaxValue: 100 - idcsMinValue: 0
         *
         * @param score the value to set
         * @return this builder
         */
        public Builder score(Integer score) {
            this.score = score;
            this.__explicitlySet__.add("score");
            return this;
        }
        /**
         * Risk Level
         *
         * <p>*Added In:** 18.1.6
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readWrite - required: true - returned: always - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("riskLevel")
        private RiskLevel riskLevel;

        /**
         * Risk Level
         *
         * <p>*Added In:** 18.1.6
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readWrite - required: true - returned: always - type: string - uniqueness: none
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
         * Last update timestamp for the risk score
         *
         * <p>*Added In:** 18.1.6
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: true - returned: always - type: dateTime -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lastUpdateTimestamp")
        private String lastUpdateTimestamp;

        /**
         * Last update timestamp for the risk score
         *
         * <p>*Added In:** 18.1.6
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: true - returned: always - type: dateTime -
         * uniqueness: none
         *
         * @param lastUpdateTimestamp the value to set
         * @return this builder
         */
        public Builder lastUpdateTimestamp(String lastUpdateTimestamp) {
            this.lastUpdateTimestamp = lastUpdateTimestamp;
            this.__explicitlySet__.add("lastUpdateTimestamp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UserExtRiskScores build() {
            UserExtRiskScores model =
                    new UserExtRiskScores(
                            this.value,
                            this.ref,
                            this.source,
                            this.status,
                            this.score,
                            this.riskLevel,
                            this.lastUpdateTimestamp);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UserExtRiskScores model) {
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("ref")) {
                this.ref(model.getRef());
            }
            if (model.wasPropertyExplicitlySet("source")) {
                this.source(model.getSource());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("score")) {
                this.score(model.getScore());
            }
            if (model.wasPropertyExplicitlySet("riskLevel")) {
                this.riskLevel(model.getRiskLevel());
            }
            if (model.wasPropertyExplicitlySet("lastUpdateTimestamp")) {
                this.lastUpdateTimestamp(model.getLastUpdateTimestamp());
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
     * Risk Provider Profile: Identifier for the provider service from which the risk score was
     * received.
     *
     * <p>*Added In:** 18.1.6
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: true - returned: always - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * Risk Provider Profile: Identifier for the provider service from which the risk score was
     * received.
     *
     * <p>*Added In:** 18.1.6
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: true - returned: always - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * Risk Provider Profile URI: URI that corresponds to risk source identifier.
     *
     * <p>*Added In:** 18.1.6
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: always - type: reference - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("$ref")
    private final String ref;

    /**
     * Risk Provider Profile URI: URI that corresponds to risk source identifier.
     *
     * <p>*Added In:** 18.1.6
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: always - type: reference - uniqueness:
     * none
     *
     * @return the value
     */
    public String getRef() {
        return ref;
    }

    /**
     * Risk Provider Profile Source
     *
     * <p>*Added In:** 18.1.6
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: always - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("source")
    private final String source;

    /**
     * Risk Provider Profile Source
     *
     * <p>*Added In:** 18.1.6
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: always - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getSource() {
        return source;
    }

    /**
     * Risk Provider Profile status
     *
     * <p>*Added In:** 18.1.6
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: always - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final String status;

    /**
     * Risk Provider Profile status
     *
     * <p>*Added In:** 18.1.6
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: always - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getStatus() {
        return status;
    }

    /**
     * Risk Score value
     *
     * <p>*Added In:** 18.1.6
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: true - returned: always - type: integer - uniqueness: none
     * - idcsMaxValue: 100 - idcsMinValue: 0
     */
    @com.fasterxml.jackson.annotation.JsonProperty("score")
    private final Integer score;

    /**
     * Risk Score value
     *
     * <p>*Added In:** 18.1.6
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: true - returned: always - type: integer - uniqueness: none
     * - idcsMaxValue: 100 - idcsMinValue: 0
     *
     * @return the value
     */
    public Integer getScore() {
        return score;
    }

    /**
     * Risk Level
     *
     * <p>*Added In:** 18.1.6
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readWrite
     * - required: true - returned: always - type: string - uniqueness: none
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
     * - required: true - returned: always - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("riskLevel")
    private final RiskLevel riskLevel;

    /**
     * Risk Level
     *
     * <p>*Added In:** 18.1.6
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readWrite
     * - required: true - returned: always - type: string - uniqueness: none
     *
     * @return the value
     */
    public RiskLevel getRiskLevel() {
        return riskLevel;
    }

    /**
     * Last update timestamp for the risk score
     *
     * <p>*Added In:** 18.1.6
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: true - returned: always - type: dateTime - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lastUpdateTimestamp")
    private final String lastUpdateTimestamp;

    /**
     * Last update timestamp for the risk score
     *
     * <p>*Added In:** 18.1.6
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: true - returned: always - type: dateTime - uniqueness: none
     *
     * @return the value
     */
    public String getLastUpdateTimestamp() {
        return lastUpdateTimestamp;
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
        sb.append("UserExtRiskScores(");
        sb.append("super=").append(super.toString());
        sb.append("value=").append(String.valueOf(this.value));
        sb.append(", ref=").append(String.valueOf(this.ref));
        sb.append(", source=").append(String.valueOf(this.source));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", score=").append(String.valueOf(this.score));
        sb.append(", riskLevel=").append(String.valueOf(this.riskLevel));
        sb.append(", lastUpdateTimestamp=").append(String.valueOf(this.lastUpdateTimestamp));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UserExtRiskScores)) {
            return false;
        }

        UserExtRiskScores other = (UserExtRiskScores) o;
        return java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.ref, other.ref)
                && java.util.Objects.equals(this.source, other.source)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.score, other.score)
                && java.util.Objects.equals(this.riskLevel, other.riskLevel)
                && java.util.Objects.equals(this.lastUpdateTimestamp, other.lastUpdateTimestamp)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.ref == null ? 43 : this.ref.hashCode());
        result = (result * PRIME) + (this.source == null ? 43 : this.source.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.score == null ? 43 : this.score.hashCode());
        result = (result * PRIME) + (this.riskLevel == null ? 43 : this.riskLevel.hashCode());
        result =
                (result * PRIME)
                        + (this.lastUpdateTimestamp == null
                                ? 43
                                : this.lastUpdateTimestamp.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
