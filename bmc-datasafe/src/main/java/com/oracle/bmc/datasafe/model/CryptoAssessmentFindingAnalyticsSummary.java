/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Aggregated finding details with number of affected targets.
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
    builder = CryptoAssessmentFindingAnalyticsSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CryptoAssessmentFindingAnalyticsSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "findingKey",
        "title",
        "category",
        "targetCount",
        "priority",
        "severity",
        "shortSummary",
        "shortRemediation"
    })
    public CryptoAssessmentFindingAnalyticsSummary(
            String findingKey,
            String title,
            Category category,
            Integer targetCount,
            Integer priority,
            Severity severity,
            String shortSummary,
            String shortRemediation) {
        super();
        this.findingKey = findingKey;
        this.title = title;
        this.category = category;
        this.targetCount = targetCount;
        this.priority = priority;
        this.severity = severity;
        this.shortSummary = shortSummary;
        this.shortRemediation = shortRemediation;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique key of the finding.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("findingKey")
        private String findingKey;

        /**
         * Unique key of the finding.
         * @param findingKey the value to set
         * @return this builder
         **/
        public Builder findingKey(String findingKey) {
            this.findingKey = findingKey;
            this.__explicitlySet__.add("findingKey");
            return this;
        }
        /**
         * Display title of the finding.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("title")
        private String title;

        /**
         * Display title of the finding.
         * @param title the value to set
         * @return this builder
         **/
        public Builder title(String title) {
            this.title = title;
            this.__explicitlySet__.add("title");
            return this;
        }
        /**
         * Category key to which the finding belongs.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("category")
        private Category category;

        /**
         * Category key to which the finding belongs.
         * @param category the value to set
         * @return this builder
         **/
        public Builder category(Category category) {
            this.category = category;
            this.__explicitlySet__.add("category");
            return this;
        }
        /**
         * Number of targets impacted by this finding in the queried scope.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetCount")
        private Integer targetCount;

        /**
         * Number of targets impacted by this finding in the queried scope.
         * @param targetCount the value to set
         * @return this builder
         **/
        public Builder targetCount(Integer targetCount) {
            this.targetCount = targetCount;
            this.__explicitlySet__.add("targetCount");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CryptoAssessmentFindingAnalyticsSummary build() {
            CryptoAssessmentFindingAnalyticsSummary model =
                    new CryptoAssessmentFindingAnalyticsSummary(
                            this.findingKey,
                            this.title,
                            this.category,
                            this.targetCount,
                            this.priority,
                            this.severity,
                            this.shortSummary,
                            this.shortRemediation);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CryptoAssessmentFindingAnalyticsSummary model) {
            if (model.wasPropertyExplicitlySet("findingKey")) {
                this.findingKey(model.getFindingKey());
            }
            if (model.wasPropertyExplicitlySet("title")) {
                this.title(model.getTitle());
            }
            if (model.wasPropertyExplicitlySet("category")) {
                this.category(model.getCategory());
            }
            if (model.wasPropertyExplicitlySet("targetCount")) {
                this.targetCount(model.getTargetCount());
            }
            if (model.wasPropertyExplicitlySet("priority")) {
                this.priority(model.getPriority());
            }
            if (model.wasPropertyExplicitlySet("severity")) {
                this.severity(model.getSeverity());
            }
            if (model.wasPropertyExplicitlySet("shortSummary")) {
                this.shortSummary(model.getShortSummary());
            }
            if (model.wasPropertyExplicitlySet("shortRemediation")) {
                this.shortRemediation(model.getShortRemediation());
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
     * Unique key of the finding.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("findingKey")
    private final String findingKey;

    /**
     * Unique key of the finding.
     * @return the value
     **/
    public String getFindingKey() {
        return findingKey;
    }

    /**
     * Display title of the finding.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("title")
    private final String title;

    /**
     * Display title of the finding.
     * @return the value
     **/
    public String getTitle() {
        return title;
    }

    /**
     * Category key to which the finding belongs.
     **/
    public enum Category {
        NetworkEncryption("NETWORK_ENCRYPTION"),
        DataEncryption("DATA_ENCRYPTION"),
        CertificatesAndKeyManagement("CERTIFICATES_AND_KEY_MANAGEMENT"),
        BackupAndExportEncryption("BACKUP_AND_EXPORT_ENCRYPTION"),
        PostQuantumReadiness("POST_QUANTUM_READINESS"),
        NotSupported("NOT_SUPPORTED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Category.class);

        private final String value;
        private static java.util.Map<String, Category> map;

        static {
            map = new java.util.HashMap<>();
            for (Category v : Category.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Category(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Category create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Category', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Category key to which the finding belongs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    private final Category category;

    /**
     * Category key to which the finding belongs.
     * @return the value
     **/
    public Category getCategory() {
        return category;
    }

    /**
     * Number of targets impacted by this finding in the queried scope.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetCount")
    private final Integer targetCount;

    /**
     * Number of targets impacted by this finding in the queried scope.
     * @return the value
     **/
    public Integer getTargetCount() {
        return targetCount;
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
        sb.append("CryptoAssessmentFindingAnalyticsSummary(");
        sb.append("super=").append(super.toString());
        sb.append("findingKey=").append(String.valueOf(this.findingKey));
        sb.append(", title=").append(String.valueOf(this.title));
        sb.append(", category=").append(String.valueOf(this.category));
        sb.append(", targetCount=").append(String.valueOf(this.targetCount));
        sb.append(", priority=").append(String.valueOf(this.priority));
        sb.append(", severity=").append(String.valueOf(this.severity));
        sb.append(", shortSummary=").append(String.valueOf(this.shortSummary));
        sb.append(", shortRemediation=").append(String.valueOf(this.shortRemediation));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CryptoAssessmentFindingAnalyticsSummary)) {
            return false;
        }

        CryptoAssessmentFindingAnalyticsSummary other = (CryptoAssessmentFindingAnalyticsSummary) o;
        return java.util.Objects.equals(this.findingKey, other.findingKey)
                && java.util.Objects.equals(this.title, other.title)
                && java.util.Objects.equals(this.category, other.category)
                && java.util.Objects.equals(this.targetCount, other.targetCount)
                && java.util.Objects.equals(this.priority, other.priority)
                && java.util.Objects.equals(this.severity, other.severity)
                && java.util.Objects.equals(this.shortSummary, other.shortSummary)
                && java.util.Objects.equals(this.shortRemediation, other.shortRemediation)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.findingKey == null ? 43 : this.findingKey.hashCode());
        result = (result * PRIME) + (this.title == null ? 43 : this.title.hashCode());
        result = (result * PRIME) + (this.category == null ? 43 : this.category.hashCode());
        result = (result * PRIME) + (this.targetCount == null ? 43 : this.targetCount.hashCode());
        result = (result * PRIME) + (this.priority == null ? 43 : this.priority.hashCode());
        result = (result * PRIME) + (this.severity == null ? 43 : this.severity.hashCode());
        result = (result * PRIME) + (this.shortSummary == null ? 43 : this.shortSummary.hashCode());
        result =
                (result * PRIME)
                        + (this.shortRemediation == null ? 43 : this.shortRemediation.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
