/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Target-level occurrence details for a crypto finding. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CryptoAssessmentFindingTargetSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CryptoAssessmentFindingTargetSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "targetId",
        "findingKey",
        "priority",
        "severity",
        "observedValue",
        "databaseVersion",
        "isQuantumReadinessCheck",
        "assessmentId"
    })
    public CryptoAssessmentFindingTargetSummary(
            String targetId,
            String findingKey,
            Integer priority,
            Severity severity,
            String observedValue,
            String databaseVersion,
            Boolean isQuantumReadinessCheck,
            String assessmentId) {
        super();
        this.targetId = targetId;
        this.findingKey = findingKey;
        this.priority = priority;
        this.severity = severity;
        this.observedValue = observedValue;
        this.databaseVersion = databaseVersion;
        this.isQuantumReadinessCheck = isQuantumReadinessCheck;
        this.assessmentId = assessmentId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the affected target. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        /**
         * The OCID of the affected target.
         *
         * @param targetId the value to set
         * @return this builder
         */
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }
        /** Unique key of the finding affecting this target. */
        @com.fasterxml.jackson.annotation.JsonProperty("findingKey")
        private String findingKey;

        /**
         * Unique key of the finding affecting this target.
         *
         * @param findingKey the value to set
         * @return this builder
         */
        public Builder findingKey(String findingKey) {
            this.findingKey = findingKey;
            this.__explicitlySet__.add("findingKey");
            return this;
        }
        /** Numeric priority of the finding. 1 is CRITICAL, 2 is HIGH, 3 is MEDIUM, and 4 is LOW. */
        @com.fasterxml.jackson.annotation.JsonProperty("priority")
        private Integer priority;

        /**
         * Numeric priority of the finding. 1 is CRITICAL, 2 is HIGH, 3 is MEDIUM, and 4 is LOW.
         *
         * @param priority the value to set
         * @return this builder
         */
        public Builder priority(Integer priority) {
            this.priority = priority;
            this.__explicitlySet__.add("priority");
            return this;
        }
        /**
         * Text severity derived from priority using the static mapping 1=CRITICAL, 2=HIGH,
         * 3=MEDIUM, 4=LOW.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("severity")
        private Severity severity;

        /**
         * Text severity derived from priority using the static mapping 1=CRITICAL, 2=HIGH,
         * 3=MEDIUM, 4=LOW.
         *
         * @param severity the value to set
         * @return this builder
         */
        public Builder severity(Severity severity) {
            this.severity = severity;
            this.__explicitlySet__.add("severity");
            return this;
        }
        /** The observed value for the selected finding on this target. */
        @com.fasterxml.jackson.annotation.JsonProperty("observedValue")
        private String observedValue;

        /**
         * The observed value for the selected finding on this target.
         *
         * @param observedValue the value to set
         * @return this builder
         */
        public Builder observedValue(String observedValue) {
            this.observedValue = observedValue;
            this.__explicitlySet__.add("observedValue");
            return this;
        }
        /** Database version of the affected target. */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseVersion")
        private String databaseVersion;

        /**
         * Database version of the affected target.
         *
         * @param databaseVersion the value to set
         * @return this builder
         */
        public Builder databaseVersion(String databaseVersion) {
            this.databaseVersion = databaseVersion;
            this.__explicitlySet__.add("databaseVersion");
            return this;
        }
        /** Indicates whether this finding is part of quantum-readiness checks. */
        @com.fasterxml.jackson.annotation.JsonProperty("isQuantumReadinessCheck")
        private Boolean isQuantumReadinessCheck;

        /**
         * Indicates whether this finding is part of quantum-readiness checks.
         *
         * @param isQuantumReadinessCheck the value to set
         * @return this builder
         */
        public Builder isQuantumReadinessCheck(Boolean isQuantumReadinessCheck) {
            this.isQuantumReadinessCheck = isQuantumReadinessCheck;
            this.__explicitlySet__.add("isQuantumReadinessCheck");
            return this;
        }
        /** The crypto assessment OCID associated with this finding occurrence. */
        @com.fasterxml.jackson.annotation.JsonProperty("assessmentId")
        private String assessmentId;

        /**
         * The crypto assessment OCID associated with this finding occurrence.
         *
         * @param assessmentId the value to set
         * @return this builder
         */
        public Builder assessmentId(String assessmentId) {
            this.assessmentId = assessmentId;
            this.__explicitlySet__.add("assessmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CryptoAssessmentFindingTargetSummary build() {
            CryptoAssessmentFindingTargetSummary model =
                    new CryptoAssessmentFindingTargetSummary(
                            this.targetId,
                            this.findingKey,
                            this.priority,
                            this.severity,
                            this.observedValue,
                            this.databaseVersion,
                            this.isQuantumReadinessCheck,
                            this.assessmentId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CryptoAssessmentFindingTargetSummary model) {
            if (model.wasPropertyExplicitlySet("targetId")) {
                this.targetId(model.getTargetId());
            }
            if (model.wasPropertyExplicitlySet("findingKey")) {
                this.findingKey(model.getFindingKey());
            }
            if (model.wasPropertyExplicitlySet("priority")) {
                this.priority(model.getPriority());
            }
            if (model.wasPropertyExplicitlySet("severity")) {
                this.severity(model.getSeverity());
            }
            if (model.wasPropertyExplicitlySet("observedValue")) {
                this.observedValue(model.getObservedValue());
            }
            if (model.wasPropertyExplicitlySet("databaseVersion")) {
                this.databaseVersion(model.getDatabaseVersion());
            }
            if (model.wasPropertyExplicitlySet("isQuantumReadinessCheck")) {
                this.isQuantumReadinessCheck(model.getIsQuantumReadinessCheck());
            }
            if (model.wasPropertyExplicitlySet("assessmentId")) {
                this.assessmentId(model.getAssessmentId());
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

    /** The OCID of the affected target. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

    /**
     * The OCID of the affected target.
     *
     * @return the value
     */
    public String getTargetId() {
        return targetId;
    }

    /** Unique key of the finding affecting this target. */
    @com.fasterxml.jackson.annotation.JsonProperty("findingKey")
    private final String findingKey;

    /**
     * Unique key of the finding affecting this target.
     *
     * @return the value
     */
    public String getFindingKey() {
        return findingKey;
    }

    /** Numeric priority of the finding. 1 is CRITICAL, 2 is HIGH, 3 is MEDIUM, and 4 is LOW. */
    @com.fasterxml.jackson.annotation.JsonProperty("priority")
    private final Integer priority;

    /**
     * Numeric priority of the finding. 1 is CRITICAL, 2 is HIGH, 3 is MEDIUM, and 4 is LOW.
     *
     * @return the value
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * Text severity derived from priority using the static mapping 1=CRITICAL, 2=HIGH, 3=MEDIUM,
     * 4=LOW.
     */
    public enum Severity implements com.oracle.bmc.http.internal.BmcEnum {
        Critical("CRITICAL"),
        High("HIGH"),
        Medium("MEDIUM"),
        Low("LOW"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Severity.class);

        private final String value;
        private static java.util.Map<String, Severity> map;

        static {
            map = new java.util.HashMap<>();
            for (Severity v : Severity.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Severity(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Severity create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Severity', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Text severity derived from priority using the static mapping 1=CRITICAL, 2=HIGH, 3=MEDIUM,
     * 4=LOW.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("severity")
    private final Severity severity;

    /**
     * Text severity derived from priority using the static mapping 1=CRITICAL, 2=HIGH, 3=MEDIUM,
     * 4=LOW.
     *
     * @return the value
     */
    public Severity getSeverity() {
        return severity;
    }

    /** The observed value for the selected finding on this target. */
    @com.fasterxml.jackson.annotation.JsonProperty("observedValue")
    private final String observedValue;

    /**
     * The observed value for the selected finding on this target.
     *
     * @return the value
     */
    public String getObservedValue() {
        return observedValue;
    }

    /** Database version of the affected target. */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseVersion")
    private final String databaseVersion;

    /**
     * Database version of the affected target.
     *
     * @return the value
     */
    public String getDatabaseVersion() {
        return databaseVersion;
    }

    /** Indicates whether this finding is part of quantum-readiness checks. */
    @com.fasterxml.jackson.annotation.JsonProperty("isQuantumReadinessCheck")
    private final Boolean isQuantumReadinessCheck;

    /**
     * Indicates whether this finding is part of quantum-readiness checks.
     *
     * @return the value
     */
    public Boolean getIsQuantumReadinessCheck() {
        return isQuantumReadinessCheck;
    }

    /** The crypto assessment OCID associated with this finding occurrence. */
    @com.fasterxml.jackson.annotation.JsonProperty("assessmentId")
    private final String assessmentId;

    /**
     * The crypto assessment OCID associated with this finding occurrence.
     *
     * @return the value
     */
    public String getAssessmentId() {
        return assessmentId;
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
        sb.append("CryptoAssessmentFindingTargetSummary(");
        sb.append("super=").append(super.toString());
        sb.append("targetId=").append(String.valueOf(this.targetId));
        sb.append(", findingKey=").append(String.valueOf(this.findingKey));
        sb.append(", priority=").append(String.valueOf(this.priority));
        sb.append(", severity=").append(String.valueOf(this.severity));
        sb.append(", observedValue=").append(String.valueOf(this.observedValue));
        sb.append(", databaseVersion=").append(String.valueOf(this.databaseVersion));
        sb.append(", isQuantumReadinessCheck=")
                .append(String.valueOf(this.isQuantumReadinessCheck));
        sb.append(", assessmentId=").append(String.valueOf(this.assessmentId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CryptoAssessmentFindingTargetSummary)) {
            return false;
        }

        CryptoAssessmentFindingTargetSummary other = (CryptoAssessmentFindingTargetSummary) o;
        return java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.findingKey, other.findingKey)
                && java.util.Objects.equals(this.priority, other.priority)
                && java.util.Objects.equals(this.severity, other.severity)
                && java.util.Objects.equals(this.observedValue, other.observedValue)
                && java.util.Objects.equals(this.databaseVersion, other.databaseVersion)
                && java.util.Objects.equals(
                        this.isQuantumReadinessCheck, other.isQuantumReadinessCheck)
                && java.util.Objects.equals(this.assessmentId, other.assessmentId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result = (result * PRIME) + (this.findingKey == null ? 43 : this.findingKey.hashCode());
        result = (result * PRIME) + (this.priority == null ? 43 : this.priority.hashCode());
        result = (result * PRIME) + (this.severity == null ? 43 : this.severity.hashCode());
        result =
                (result * PRIME)
                        + (this.observedValue == null ? 43 : this.observedValue.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseVersion == null ? 43 : this.databaseVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.isQuantumReadinessCheck == null
                                ? 43
                                : this.isQuantumReadinessCheck.hashCode());
        result = (result * PRIME) + (this.assessmentId == null ? 43 : this.assessmentId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
