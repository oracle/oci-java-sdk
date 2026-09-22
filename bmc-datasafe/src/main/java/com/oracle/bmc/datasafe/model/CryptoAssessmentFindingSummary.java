/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * One crypto deviation finding for a specific assessment run.
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
    builder = CryptoAssessmentFindingSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CryptoAssessmentFindingSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "findingKey",
        "title",
        "category",
        "priority",
        "severity",
        "expectedValue",
        "observedValue",
        "recommendedValue",
        "status",
        "isQuantumReadinessCheck",
        "summary",
        "shortSummary",
        "url",
        "remediation",
        "shortRemediation",
        "compliance"
    })
    public CryptoAssessmentFindingSummary(
            String findingKey,
            String title,
            String category,
            Integer priority,
            Severity severity,
            String expectedValue,
            java.util.List<String> observedValue,
            String recommendedValue,
            CryptoFindingStatus status,
            Boolean isQuantumReadinessCheck,
            String summary,
            String shortSummary,
            String url,
            String remediation,
            String shortRemediation,
            String compliance) {
        super();
        this.findingKey = findingKey;
        this.title = title;
        this.category = category;
        this.priority = priority;
        this.severity = severity;
        this.expectedValue = expectedValue;
        this.observedValue = observedValue;
        this.recommendedValue = recommendedValue;
        this.status = status;
        this.isQuantumReadinessCheck = isQuantumReadinessCheck;
        this.summary = summary;
        this.shortSummary = shortSummary;
        this.url = url;
        this.remediation = remediation;
        this.shortRemediation = shortRemediation;
        this.compliance = compliance;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique key identifier for the finding.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("findingKey")
        private String findingKey;

        /**
         * Unique key identifier for the finding.
         * @param findingKey the value to set
         * @return this builder
         **/
        public Builder findingKey(String findingKey) {
            this.findingKey = findingKey;
            this.__explicitlySet__.add("findingKey");
            return this;
        }
        /**
         * Human-readable title for the finding.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("title")
        private String title;

        /**
         * Human-readable title for the finding.
         * @param title the value to set
         * @return this builder
         **/
        public Builder title(String title) {
            this.title = title;
            this.__explicitlySet__.add("title");
            return this;
        }
        /**
         * Category value recorded for the finding.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("category")
        private String category;

        /**
         * Category value recorded for the finding.
         * @param category the value to set
         * @return this builder
         **/
        public Builder category(String category) {
            this.category = category;
            this.__explicitlySet__.add("category");
            return this;
        }
        /**
         * Numeric priority of the finding. 1 is CRITICAL, 2 is HIGH, 3 is MEDIUM, and 4 is LOW.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("priority")
        private Integer priority;

        /**
         * Numeric priority of the finding. 1 is CRITICAL, 2 is HIGH, 3 is MEDIUM, and 4 is LOW.
         * @param priority the value to set
         * @return this builder
         **/
        public Builder priority(Integer priority) {
            this.priority = priority;
            this.__explicitlySet__.add("priority");
            return this;
        }
        /**
         * Text severity derived from priority using the static mapping 1=CRITICAL, 2=HIGH, 3=MEDIUM, 4=LOW.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("severity")
        private Severity severity;

        /**
         * Text severity derived from priority using the static mapping 1=CRITICAL, 2=HIGH, 3=MEDIUM, 4=LOW.
         * @param severity the value to set
         * @return this builder
         **/
        public Builder severity(Severity severity) {
            this.severity = severity;
            this.__explicitlySet__.add("severity");
            return this;
        }
        /**
         * Expected value recorded for the finding.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("expectedValue")
        private String expectedValue;

        /**
         * Expected value recorded for the finding.
         * @param expectedValue the value to set
         * @return this builder
         **/
        public Builder expectedValue(String expectedValue) {
            this.expectedValue = expectedValue;
            this.__explicitlySet__.add("expectedValue");
            return this;
        }
        /**
         * Observed values recorded for the finding.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("observedValue")
        private java.util.List<String> observedValue;

        /**
         * Observed values recorded for the finding.
         * @param observedValue the value to set
         * @return this builder
         **/
        public Builder observedValue(java.util.List<String> observedValue) {
            this.observedValue = observedValue;
            this.__explicitlySet__.add("observedValue");
            return this;
        }
        /**
         * Recommended value recorded for the finding.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("recommendedValue")
        private String recommendedValue;

        /**
         * Recommended value recorded for the finding.
         * @param recommendedValue the value to set
         * @return this builder
         **/
        public Builder recommendedValue(String recommendedValue) {
            this.recommendedValue = recommendedValue;
            this.__explicitlySet__.add("recommendedValue");
            return this;
        }
        /**
         * Status recorded for the finding.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private CryptoFindingStatus status;

        /**
         * Status recorded for the finding.
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(CryptoFindingStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * Indicates whether this finding is part of quantum-readiness checks.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isQuantumReadinessCheck")
        private Boolean isQuantumReadinessCheck;

        /**
         * Indicates whether this finding is part of quantum-readiness checks.
         * @param isQuantumReadinessCheck the value to set
         * @return this builder
         **/
        public Builder isQuantumReadinessCheck(Boolean isQuantumReadinessCheck) {
            this.isQuantumReadinessCheck = isQuantumReadinessCheck;
            this.__explicitlySet__.add("isQuantumReadinessCheck");
            return this;
        }
        /**
         * Summary recorded for the finding.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("summary")
        private String summary;

        /**
         * Summary recorded for the finding.
         * @param summary the value to set
         * @return this builder
         **/
        public Builder summary(String summary) {
            this.summary = summary;
            this.__explicitlySet__.add("summary");
            return this;
        }
        /**
         * Short summary of the finding.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("shortSummary")
        private String shortSummary;

        /**
         * Short summary of the finding.
         * @param shortSummary the value to set
         * @return this builder
         **/
        public Builder shortSummary(String shortSummary) {
            this.shortSummary = shortSummary;
            this.__explicitlySet__.add("shortSummary");
            return this;
        }
        /**
         * URL recorded for the finding.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("url")
        private String url;

        /**
         * URL recorded for the finding.
         * @param url the value to set
         * @return this builder
         **/
        public Builder url(String url) {
            this.url = url;
            this.__explicitlySet__.add("url");
            return this;
        }
        /**
         * Remediation text recorded for the finding.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("remediation")
        private String remediation;

        /**
         * Remediation text recorded for the finding.
         * @param remediation the value to set
         * @return this builder
         **/
        public Builder remediation(String remediation) {
            this.remediation = remediation;
            this.__explicitlySet__.add("remediation");
            return this;
        }
        /**
         * Short remediation for the finding.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("shortRemediation")
        private String shortRemediation;

        /**
         * Short remediation for the finding.
         * @param shortRemediation the value to set
         * @return this builder
         **/
        public Builder shortRemediation(String shortRemediation) {
            this.shortRemediation = shortRemediation;
            this.__explicitlySet__.add("shortRemediation");
            return this;
        }
        /**
         * Compliance mapping recorded for the finding.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compliance")
        private String compliance;

        /**
         * Compliance mapping recorded for the finding.
         * @param compliance the value to set
         * @return this builder
         **/
        public Builder compliance(String compliance) {
            this.compliance = compliance;
            this.__explicitlySet__.add("compliance");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CryptoAssessmentFindingSummary build() {
            CryptoAssessmentFindingSummary model =
                    new CryptoAssessmentFindingSummary(
                            this.findingKey,
                            this.title,
                            this.category,
                            this.priority,
                            this.severity,
                            this.expectedValue,
                            this.observedValue,
                            this.recommendedValue,
                            this.status,
                            this.isQuantumReadinessCheck,
                            this.summary,
                            this.shortSummary,
                            this.url,
                            this.remediation,
                            this.shortRemediation,
                            this.compliance);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CryptoAssessmentFindingSummary model) {
            if (model.wasPropertyExplicitlySet("findingKey")) {
                this.findingKey(model.getFindingKey());
            }
            if (model.wasPropertyExplicitlySet("title")) {
                this.title(model.getTitle());
            }
            if (model.wasPropertyExplicitlySet("category")) {
                this.category(model.getCategory());
            }
            if (model.wasPropertyExplicitlySet("priority")) {
                this.priority(model.getPriority());
            }
            if (model.wasPropertyExplicitlySet("severity")) {
                this.severity(model.getSeverity());
            }
            if (model.wasPropertyExplicitlySet("expectedValue")) {
                this.expectedValue(model.getExpectedValue());
            }
            if (model.wasPropertyExplicitlySet("observedValue")) {
                this.observedValue(model.getObservedValue());
            }
            if (model.wasPropertyExplicitlySet("recommendedValue")) {
                this.recommendedValue(model.getRecommendedValue());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("isQuantumReadinessCheck")) {
                this.isQuantumReadinessCheck(model.getIsQuantumReadinessCheck());
            }
            if (model.wasPropertyExplicitlySet("summary")) {
                this.summary(model.getSummary());
            }
            if (model.wasPropertyExplicitlySet("shortSummary")) {
                this.shortSummary(model.getShortSummary());
            }
            if (model.wasPropertyExplicitlySet("url")) {
                this.url(model.getUrl());
            }
            if (model.wasPropertyExplicitlySet("remediation")) {
                this.remediation(model.getRemediation());
            }
            if (model.wasPropertyExplicitlySet("shortRemediation")) {
                this.shortRemediation(model.getShortRemediation());
            }
            if (model.wasPropertyExplicitlySet("compliance")) {
                this.compliance(model.getCompliance());
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
     * Unique key identifier for the finding.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("findingKey")
    private final String findingKey;

    /**
     * Unique key identifier for the finding.
     * @return the value
     **/
    public String getFindingKey() {
        return findingKey;
    }

    /**
     * Human-readable title for the finding.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("title")
    private final String title;

    /**
     * Human-readable title for the finding.
     * @return the value
     **/
    public String getTitle() {
        return title;
    }

    /**
     * Category value recorded for the finding.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    private final String category;

    /**
     * Category value recorded for the finding.
     * @return the value
     **/
    public String getCategory() {
        return category;
    }

    /**
     * Numeric priority of the finding. 1 is CRITICAL, 2 is HIGH, 3 is MEDIUM, and 4 is LOW.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("priority")
    private final Integer priority;

    /**
     * Numeric priority of the finding. 1 is CRITICAL, 2 is HIGH, 3 is MEDIUM, and 4 is LOW.
     * @return the value
     **/
    public Integer getPriority() {
        return priority;
    }

    /**
     * Text severity derived from priority using the static mapping 1=CRITICAL, 2=HIGH, 3=MEDIUM, 4=LOW.
     **/
    public enum Severity {
        Critical("CRITICAL"),
        High("HIGH"),
        Medium("MEDIUM"),
        Low("LOW"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
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
     * Text severity derived from priority using the static mapping 1=CRITICAL, 2=HIGH, 3=MEDIUM, 4=LOW.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("severity")
    private final Severity severity;

    /**
     * Text severity derived from priority using the static mapping 1=CRITICAL, 2=HIGH, 3=MEDIUM, 4=LOW.
     * @return the value
     **/
    public Severity getSeverity() {
        return severity;
    }

    /**
     * Expected value recorded for the finding.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("expectedValue")
    private final String expectedValue;

    /**
     * Expected value recorded for the finding.
     * @return the value
     **/
    public String getExpectedValue() {
        return expectedValue;
    }

    /**
     * Observed values recorded for the finding.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("observedValue")
    private final java.util.List<String> observedValue;

    /**
     * Observed values recorded for the finding.
     * @return the value
     **/
    public java.util.List<String> getObservedValue() {
        return observedValue;
    }

    /**
     * Recommended value recorded for the finding.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recommendedValue")
    private final String recommendedValue;

    /**
     * Recommended value recorded for the finding.
     * @return the value
     **/
    public String getRecommendedValue() {
        return recommendedValue;
    }

    /**
     * Status recorded for the finding.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final CryptoFindingStatus status;

    /**
     * Status recorded for the finding.
     * @return the value
     **/
    public CryptoFindingStatus getStatus() {
        return status;
    }

    /**
     * Indicates whether this finding is part of quantum-readiness checks.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isQuantumReadinessCheck")
    private final Boolean isQuantumReadinessCheck;

    /**
     * Indicates whether this finding is part of quantum-readiness checks.
     * @return the value
     **/
    public Boolean getIsQuantumReadinessCheck() {
        return isQuantumReadinessCheck;
    }

    /**
     * Summary recorded for the finding.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("summary")
    private final String summary;

    /**
     * Summary recorded for the finding.
     * @return the value
     **/
    public String getSummary() {
        return summary;
    }

    /**
     * Short summary of the finding.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shortSummary")
    private final String shortSummary;

    /**
     * Short summary of the finding.
     * @return the value
     **/
    public String getShortSummary() {
        return shortSummary;
    }

    /**
     * URL recorded for the finding.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    private final String url;

    /**
     * URL recorded for the finding.
     * @return the value
     **/
    public String getUrl() {
        return url;
    }

    /**
     * Remediation text recorded for the finding.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("remediation")
    private final String remediation;

    /**
     * Remediation text recorded for the finding.
     * @return the value
     **/
    public String getRemediation() {
        return remediation;
    }

    /**
     * Short remediation for the finding.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shortRemediation")
    private final String shortRemediation;

    /**
     * Short remediation for the finding.
     * @return the value
     **/
    public String getShortRemediation() {
        return shortRemediation;
    }

    /**
     * Compliance mapping recorded for the finding.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compliance")
    private final String compliance;

    /**
     * Compliance mapping recorded for the finding.
     * @return the value
     **/
    public String getCompliance() {
        return compliance;
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
        sb.append("CryptoAssessmentFindingSummary(");
        sb.append("super=").append(super.toString());
        sb.append("findingKey=").append(String.valueOf(this.findingKey));
        sb.append(", title=").append(String.valueOf(this.title));
        sb.append(", category=").append(String.valueOf(this.category));
        sb.append(", priority=").append(String.valueOf(this.priority));
        sb.append(", severity=").append(String.valueOf(this.severity));
        sb.append(", expectedValue=").append(String.valueOf(this.expectedValue));
        sb.append(", observedValue=").append(String.valueOf(this.observedValue));
        sb.append(", recommendedValue=").append(String.valueOf(this.recommendedValue));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", isQuantumReadinessCheck=")
                .append(String.valueOf(this.isQuantumReadinessCheck));
        sb.append(", summary=").append(String.valueOf(this.summary));
        sb.append(", shortSummary=").append(String.valueOf(this.shortSummary));
        sb.append(", url=").append(String.valueOf(this.url));
        sb.append(", remediation=").append(String.valueOf(this.remediation));
        sb.append(", shortRemediation=").append(String.valueOf(this.shortRemediation));
        sb.append(", compliance=").append(String.valueOf(this.compliance));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CryptoAssessmentFindingSummary)) {
            return false;
        }

        CryptoAssessmentFindingSummary other = (CryptoAssessmentFindingSummary) o;
        return java.util.Objects.equals(this.findingKey, other.findingKey)
                && java.util.Objects.equals(this.title, other.title)
                && java.util.Objects.equals(this.category, other.category)
                && java.util.Objects.equals(this.priority, other.priority)
                && java.util.Objects.equals(this.severity, other.severity)
                && java.util.Objects.equals(this.expectedValue, other.expectedValue)
                && java.util.Objects.equals(this.observedValue, other.observedValue)
                && java.util.Objects.equals(this.recommendedValue, other.recommendedValue)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(
                        this.isQuantumReadinessCheck, other.isQuantumReadinessCheck)
                && java.util.Objects.equals(this.summary, other.summary)
                && java.util.Objects.equals(this.shortSummary, other.shortSummary)
                && java.util.Objects.equals(this.url, other.url)
                && java.util.Objects.equals(this.remediation, other.remediation)
                && java.util.Objects.equals(this.shortRemediation, other.shortRemediation)
                && java.util.Objects.equals(this.compliance, other.compliance)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.findingKey == null ? 43 : this.findingKey.hashCode());
        result = (result * PRIME) + (this.title == null ? 43 : this.title.hashCode());
        result = (result * PRIME) + (this.category == null ? 43 : this.category.hashCode());
        result = (result * PRIME) + (this.priority == null ? 43 : this.priority.hashCode());
        result = (result * PRIME) + (this.severity == null ? 43 : this.severity.hashCode());
        result =
                (result * PRIME)
                        + (this.expectedValue == null ? 43 : this.expectedValue.hashCode());
        result =
                (result * PRIME)
                        + (this.observedValue == null ? 43 : this.observedValue.hashCode());
        result =
                (result * PRIME)
                        + (this.recommendedValue == null ? 43 : this.recommendedValue.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.isQuantumReadinessCheck == null
                                ? 43
                                : this.isQuantumReadinessCheck.hashCode());
        result = (result * PRIME) + (this.summary == null ? 43 : this.summary.hashCode());
        result = (result * PRIME) + (this.shortSummary == null ? 43 : this.shortSummary.hashCode());
        result = (result * PRIME) + (this.url == null ? 43 : this.url.hashCode());
        result = (result * PRIME) + (this.remediation == null ? 43 : this.remediation.hashCode());
        result =
                (result * PRIME)
                        + (this.shortRemediation == null ? 43 : this.shortRemediation.hashCode());
        result = (result * PRIME) + (this.compliance == null ? 43 : this.compliance.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
