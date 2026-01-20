/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The scope of analytics data. <br>
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
        builder = FindingAnalyticsDimensions.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class FindingAnalyticsDimensions
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "topFindingCategory",
        "category",
        "title",
        "topFindingStatus",
        "severity",
        "remarks",
        "targetId",
        "references"
    })
    public FindingAnalyticsDimensions(
            String key,
            String topFindingCategory,
            String category,
            String title,
            TopFindingStatus topFindingStatus,
            Severity severity,
            String remarks,
            String targetId,
            References references) {
        super();
        this.key = key;
        this.topFindingCategory = topFindingCategory;
        this.category = category;
        this.title = title;
        this.topFindingStatus = topFindingStatus;
        this.severity = severity;
        this.remarks = remarks;
        this.targetId = targetId;
        this.references = references;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Each finding in security assessment has an associated key (think of key as a finding's
         * name). For a given finding, the key will be the same across targets. The user can use
         * these keys to filter the findings.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * Each finding in security assessment has an associated key (think of key as a finding's
         * name). For a given finding, the key will be the same across targets. The user can use
         * these keys to filter the findings.
         *
         * @param key the value to set
         * @return this builder
         */
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /** The category of the top finding. */
        @com.fasterxml.jackson.annotation.JsonProperty("topFindingCategory")
        private String topFindingCategory;

        /**
         * The category of the top finding.
         *
         * @param topFindingCategory the value to set
         * @return this builder
         */
        public Builder topFindingCategory(String topFindingCategory) {
            this.topFindingCategory = topFindingCategory;
            this.__explicitlySet__.add("topFindingCategory");
            return this;
        }
        /** The category of the top finding. */
        @com.fasterxml.jackson.annotation.JsonProperty("category")
        private String category;

        /**
         * The category of the top finding.
         *
         * @param category the value to set
         * @return this builder
         */
        public Builder category(String category) {
            this.category = category;
            this.__explicitlySet__.add("category");
            return this;
        }
        /** The short title of the finding. */
        @com.fasterxml.jackson.annotation.JsonProperty("title")
        private String title;

        /**
         * The short title of the finding.
         *
         * @param title the value to set
         * @return this builder
         */
        public Builder title(String title) {
            this.title = title;
            this.__explicitlySet__.add("title");
            return this;
        }
        /**
         * The status of the top finding. All findings will have "severity" to indicate the risk
         * level, but only top findings will have "status". Possible status: Pass / Risk (Low,
         * Medium, High)/ Evaluate / Advisory / Deferred Instead of having "Low, Medium, High" in
         * severity, "Risk" will include these three situations in status.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("topFindingStatus")
        private TopFindingStatus topFindingStatus;

        /**
         * The status of the top finding. All findings will have "severity" to indicate the risk
         * level, but only top findings will have "status". Possible status: Pass / Risk (Low,
         * Medium, High)/ Evaluate / Advisory / Deferred Instead of having "Low, Medium, High" in
         * severity, "Risk" will include these three situations in status.
         *
         * @param topFindingStatus the value to set
         * @return this builder
         */
        public Builder topFindingStatus(TopFindingStatus topFindingStatus) {
            this.topFindingStatus = topFindingStatus;
            this.__explicitlySet__.add("topFindingStatus");
            return this;
        }
        /** The severity (risk level) of the finding. */
        @com.fasterxml.jackson.annotation.JsonProperty("severity")
        private Severity severity;

        /**
         * The severity (risk level) of the finding.
         *
         * @param severity the value to set
         * @return this builder
         */
        public Builder severity(Severity severity) {
            this.severity = severity;
            this.__explicitlySet__.add("severity");
            return this;
        }
        /**
         * The explanation of the issue in this finding. It explains the reason for the rule and, if
         * a risk is reported, it may also explain the recommended actions for remediation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("remarks")
        private String remarks;

        /**
         * The explanation of the issue in this finding. It explains the reason for the rule and, if
         * a risk is reported, it may also explain the recommended actions for remediation.
         *
         * @param remarks the value to set
         * @return this builder
         */
        public Builder remarks(String remarks) {
            this.remarks = remarks;
            this.__explicitlySet__.add("remarks");
            return this;
        }
        /** The OCID of the target database. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        /**
         * The OCID of the target database.
         *
         * @param targetId the value to set
         * @return this builder
         */
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }
        /**
         * Provides information on whether the finding is related to a CIS Oracle Database Benchmark
         * recommendation, STIG rule, or related to a GDPR Article/Recital.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("references")
        private References references;

        /**
         * Provides information on whether the finding is related to a CIS Oracle Database Benchmark
         * recommendation, STIG rule, or related to a GDPR Article/Recital.
         *
         * @param references the value to set
         * @return this builder
         */
        public Builder references(References references) {
            this.references = references;
            this.__explicitlySet__.add("references");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FindingAnalyticsDimensions build() {
            FindingAnalyticsDimensions model =
                    new FindingAnalyticsDimensions(
                            this.key,
                            this.topFindingCategory,
                            this.category,
                            this.title,
                            this.topFindingStatus,
                            this.severity,
                            this.remarks,
                            this.targetId,
                            this.references);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FindingAnalyticsDimensions model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("topFindingCategory")) {
                this.topFindingCategory(model.getTopFindingCategory());
            }
            if (model.wasPropertyExplicitlySet("category")) {
                this.category(model.getCategory());
            }
            if (model.wasPropertyExplicitlySet("title")) {
                this.title(model.getTitle());
            }
            if (model.wasPropertyExplicitlySet("topFindingStatus")) {
                this.topFindingStatus(model.getTopFindingStatus());
            }
            if (model.wasPropertyExplicitlySet("severity")) {
                this.severity(model.getSeverity());
            }
            if (model.wasPropertyExplicitlySet("remarks")) {
                this.remarks(model.getRemarks());
            }
            if (model.wasPropertyExplicitlySet("targetId")) {
                this.targetId(model.getTargetId());
            }
            if (model.wasPropertyExplicitlySet("references")) {
                this.references(model.getReferences());
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
     * Each finding in security assessment has an associated key (think of key as a finding's name).
     * For a given finding, the key will be the same across targets. The user can use these keys to
     * filter the findings.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * Each finding in security assessment has an associated key (think of key as a finding's name).
     * For a given finding, the key will be the same across targets. The user can use these keys to
     * filter the findings.
     *
     * @return the value
     */
    public String getKey() {
        return key;
    }

    /** The category of the top finding. */
    @com.fasterxml.jackson.annotation.JsonProperty("topFindingCategory")
    private final String topFindingCategory;

    /**
     * The category of the top finding.
     *
     * @return the value
     */
    public String getTopFindingCategory() {
        return topFindingCategory;
    }

    /** The category of the top finding. */
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    private final String category;

    /**
     * The category of the top finding.
     *
     * @return the value
     */
    public String getCategory() {
        return category;
    }

    /** The short title of the finding. */
    @com.fasterxml.jackson.annotation.JsonProperty("title")
    private final String title;

    /**
     * The short title of the finding.
     *
     * @return the value
     */
    public String getTitle() {
        return title;
    }

    /**
     * The status of the top finding. All findings will have "severity" to indicate the risk level,
     * but only top findings will have "status". Possible status: Pass / Risk (Low, Medium, High)/
     * Evaluate / Advisory / Deferred Instead of having "Low, Medium, High" in severity, "Risk" will
     * include these three situations in status.
     */
    public enum TopFindingStatus implements com.oracle.bmc.http.internal.BmcEnum {
        Risk("RISK"),
        Evaluate("EVALUATE"),
        Advisory("ADVISORY"),
        Pass("PASS"),
        Deferred("DEFERRED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(TopFindingStatus.class);

        private final String value;
        private static java.util.Map<String, TopFindingStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (TopFindingStatus v : TopFindingStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        TopFindingStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TopFindingStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'TopFindingStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The status of the top finding. All findings will have "severity" to indicate the risk level,
     * but only top findings will have "status". Possible status: Pass / Risk (Low, Medium, High)/
     * Evaluate / Advisory / Deferred Instead of having "Low, Medium, High" in severity, "Risk" will
     * include these three situations in status.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("topFindingStatus")
    private final TopFindingStatus topFindingStatus;

    /**
     * The status of the top finding. All findings will have "severity" to indicate the risk level,
     * but only top findings will have "status". Possible status: Pass / Risk (Low, Medium, High)/
     * Evaluate / Advisory / Deferred Instead of having "Low, Medium, High" in severity, "Risk" will
     * include these three situations in status.
     *
     * @return the value
     */
    public TopFindingStatus getTopFindingStatus() {
        return topFindingStatus;
    }

    /** The severity (risk level) of the finding. */
    public enum Severity implements com.oracle.bmc.http.internal.BmcEnum {
        High("HIGH"),
        Medium("MEDIUM"),
        Low("LOW"),
        Evaluate("EVALUATE"),
        Advisory("ADVISORY"),
        Pass("PASS"),
        Deferred("DEFERRED"),

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
    /** The severity (risk level) of the finding. */
    @com.fasterxml.jackson.annotation.JsonProperty("severity")
    private final Severity severity;

    /**
     * The severity (risk level) of the finding.
     *
     * @return the value
     */
    public Severity getSeverity() {
        return severity;
    }

    /**
     * The explanation of the issue in this finding. It explains the reason for the rule and, if a
     * risk is reported, it may also explain the recommended actions for remediation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("remarks")
    private final String remarks;

    /**
     * The explanation of the issue in this finding. It explains the reason for the rule and, if a
     * risk is reported, it may also explain the recommended actions for remediation.
     *
     * @return the value
     */
    public String getRemarks() {
        return remarks;
    }

    /** The OCID of the target database. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

    /**
     * The OCID of the target database.
     *
     * @return the value
     */
    public String getTargetId() {
        return targetId;
    }

    /**
     * Provides information on whether the finding is related to a CIS Oracle Database Benchmark
     * recommendation, STIG rule, or related to a GDPR Article/Recital.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("references")
    private final References references;

    /**
     * Provides information on whether the finding is related to a CIS Oracle Database Benchmark
     * recommendation, STIG rule, or related to a GDPR Article/Recital.
     *
     * @return the value
     */
    public References getReferences() {
        return references;
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
        sb.append("FindingAnalyticsDimensions(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", topFindingCategory=").append(String.valueOf(this.topFindingCategory));
        sb.append(", category=").append(String.valueOf(this.category));
        sb.append(", title=").append(String.valueOf(this.title));
        sb.append(", topFindingStatus=").append(String.valueOf(this.topFindingStatus));
        sb.append(", severity=").append(String.valueOf(this.severity));
        sb.append(", remarks=").append(String.valueOf(this.remarks));
        sb.append(", targetId=").append(String.valueOf(this.targetId));
        sb.append(", references=").append(String.valueOf(this.references));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FindingAnalyticsDimensions)) {
            return false;
        }

        FindingAnalyticsDimensions other = (FindingAnalyticsDimensions) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.topFindingCategory, other.topFindingCategory)
                && java.util.Objects.equals(this.category, other.category)
                && java.util.Objects.equals(this.title, other.title)
                && java.util.Objects.equals(this.topFindingStatus, other.topFindingStatus)
                && java.util.Objects.equals(this.severity, other.severity)
                && java.util.Objects.equals(this.remarks, other.remarks)
                && java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.references, other.references)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result =
                (result * PRIME)
                        + (this.topFindingCategory == null
                                ? 43
                                : this.topFindingCategory.hashCode());
        result = (result * PRIME) + (this.category == null ? 43 : this.category.hashCode());
        result = (result * PRIME) + (this.title == null ? 43 : this.title.hashCode());
        result =
                (result * PRIME)
                        + (this.topFindingStatus == null ? 43 : this.topFindingStatus.hashCode());
        result = (result * PRIME) + (this.severity == null ? 43 : this.severity.hashCode());
        result = (result * PRIME) + (this.remarks == null ? 43 : this.remarks.hashCode());
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result = (result * PRIME) + (this.references == null ? 43 : this.references.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
