/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Provides a list of the differences in a comparison of the security assessment with the baseline value.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SecurityAssessmentComparison.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SecurityAssessmentComparison
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "baselineId",
        "lifecycleState",
        "timeCreated",
        "targets"
    })
    public SecurityAssessmentComparison(
            String id,
            String baselineId,
            LifecycleState lifecycleState,
            java.util.Date timeCreated,
            java.util.List<SecurityAssessmentComparisonPerTarget> targets) {
        super();
        this.id = id;
        this.baselineId = baselineId;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
        this.targets = targets;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the security assessment that is being compared with a baseline security assessment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the security assessment that is being compared with a baseline security assessment.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The OCID of the security assessment that is set as a baseline.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("baselineId")
        private String baselineId;

        /**
         * The OCID of the security assessment that is set as a baseline.
         * @param baselineId the value to set
         * @return this builder
         **/
        public Builder baselineId(String baselineId) {
            this.baselineId = baselineId;
            this.__explicitlySet__.add("baselineId");
            return this;
        }
        /**
         * The current state of the security assessment comparison.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the security assessment comparison.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The date and time when the security assessment comparison was created. Conforms to the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time when the security assessment comparison was created. Conforms to the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * A target-based comparison between two security assessments.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targets")
        private java.util.List<SecurityAssessmentComparisonPerTarget> targets;

        /**
         * A target-based comparison between two security assessments.
         * @param targets the value to set
         * @return this builder
         **/
        public Builder targets(java.util.List<SecurityAssessmentComparisonPerTarget> targets) {
            this.targets = targets;
            this.__explicitlySet__.add("targets");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SecurityAssessmentComparison build() {
            SecurityAssessmentComparison model =
                    new SecurityAssessmentComparison(
                            this.id,
                            this.baselineId,
                            this.lifecycleState,
                            this.timeCreated,
                            this.targets);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SecurityAssessmentComparison model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("baselineId")) {
                this.baselineId(model.getBaselineId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("targets")) {
                this.targets(model.getTargets());
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
     * The OCID of the security assessment that is being compared with a baseline security assessment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the security assessment that is being compared with a baseline security assessment.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The OCID of the security assessment that is set as a baseline.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("baselineId")
    private final String baselineId;

    /**
     * The OCID of the security assessment that is set as a baseline.
     * @return the value
     **/
    public String getBaselineId() {
        return baselineId;
    }

    /**
     * The current state of the security assessment comparison.
     **/
    public enum LifecycleState {
        Creating("CREATING"),
        Succeeded("SUCCEEDED"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The current state of the security assessment comparison.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the security assessment comparison.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The date and time when the security assessment comparison was created. Conforms to the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time when the security assessment comparison was created. Conforms to the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * A target-based comparison between two security assessments.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targets")
    private final java.util.List<SecurityAssessmentComparisonPerTarget> targets;

    /**
     * A target-based comparison between two security assessments.
     * @return the value
     **/
    public java.util.List<SecurityAssessmentComparisonPerTarget> getTargets() {
        return targets;
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
        sb.append("SecurityAssessmentComparison(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", baselineId=").append(String.valueOf(this.baselineId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", targets=").append(String.valueOf(this.targets));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SecurityAssessmentComparison)) {
            return false;
        }

        SecurityAssessmentComparison other = (SecurityAssessmentComparison) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.baselineId, other.baselineId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.targets, other.targets)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.baselineId == null ? 43 : this.baselineId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.targets == null ? 43 : this.targets.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
