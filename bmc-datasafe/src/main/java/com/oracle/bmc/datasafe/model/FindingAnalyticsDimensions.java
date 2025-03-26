/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The scope of analytics data.
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
    builder = FindingAnalyticsDimensions.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class FindingAnalyticsDimensions
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "topFindingCategory",
        "title",
        "topFindingStatus",
        "severity",
        "targetId"
    })
    public FindingAnalyticsDimensions(
            String key,
            String topFindingCategory,
            String title,
            TopFindingStatus topFindingStatus,
            Severity severity,
            String targetId) {
        super();
        this.key = key;
        this.topFindingCategory = topFindingCategory;
        this.title = title;
        this.topFindingStatus = topFindingStatus;
        this.severity = severity;
        this.targetId = targetId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Each finding in security assessment has an associated key (think of key as a finding's name).
         * For a given finding, the key will be the same across targets. The user can use these keys to filter the findings.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * Each finding in security assessment has an associated key (think of key as a finding's name).
         * For a given finding, the key will be the same across targets. The user can use these keys to filter the findings.
         *
         * @param key the value to set
         * @return this builder
         **/
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * The category of the top finding.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("topFindingCategory")
        private String topFindingCategory;

        /**
         * The category of the top finding.
         * @param topFindingCategory the value to set
         * @return this builder
         **/
        public Builder topFindingCategory(String topFindingCategory) {
            this.topFindingCategory = topFindingCategory;
            this.__explicitlySet__.add("topFindingCategory");
            return this;
        }
        /**
         * The short title of the finding.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("title")
        private String title;

        /**
         * The short title of the finding.
         * @param title the value to set
         * @return this builder
         **/
        public Builder title(String title) {
            this.title = title;
            this.__explicitlySet__.add("title");
            return this;
        }
        /**
         * The status of the top finding.
         * All findings will have "severity" to indicate the risk level, but only top findings will have "status".
         * Possible status: Pass / Risk (Low, Medium, High)/ Evaluate / Advisory / Deferred
         * Instead of having "Low, Medium, High" in severity, "Risk" will include these three situations in status.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("topFindingStatus")
        private TopFindingStatus topFindingStatus;

        /**
         * The status of the top finding.
         * All findings will have "severity" to indicate the risk level, but only top findings will have "status".
         * Possible status: Pass / Risk (Low, Medium, High)/ Evaluate / Advisory / Deferred
         * Instead of having "Low, Medium, High" in severity, "Risk" will include these three situations in status.
         *
         * @param topFindingStatus the value to set
         * @return this builder
         **/
        public Builder topFindingStatus(TopFindingStatus topFindingStatus) {
            this.topFindingStatus = topFindingStatus;
            this.__explicitlySet__.add("topFindingStatus");
            return this;
        }
        /**
         * The severity (risk level) of the finding.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("severity")
        private Severity severity;

        /**
         * The severity (risk level) of the finding.
         * @param severity the value to set
         * @return this builder
         **/
        public Builder severity(Severity severity) {
            this.severity = severity;
            this.__explicitlySet__.add("severity");
            return this;
        }
        /**
         * The OCID of the target database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        /**
         * The OCID of the target database.
         * @param targetId the value to set
         * @return this builder
         **/
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FindingAnalyticsDimensions build() {
            FindingAnalyticsDimensions model =
                    new FindingAnalyticsDimensions(
                            this.key,
                            this.topFindingCategory,
                            this.title,
                            this.topFindingStatus,
                            this.severity,
                            this.targetId);
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
            if (model.wasPropertyExplicitlySet("title")) {
                this.title(model.getTitle());
            }
            if (model.wasPropertyExplicitlySet("topFindingStatus")) {
                this.topFindingStatus(model.getTopFindingStatus());
            }
            if (model.wasPropertyExplicitlySet("severity")) {
                this.severity(model.getSeverity());
            }
            if (model.wasPropertyExplicitlySet("targetId")) {
                this.targetId(model.getTargetId());
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
     * Each finding in security assessment has an associated key (think of key as a finding's name).
     * For a given finding, the key will be the same across targets. The user can use these keys to filter the findings.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * Each finding in security assessment has an associated key (think of key as a finding's name).
     * For a given finding, the key will be the same across targets. The user can use these keys to filter the findings.
     *
     * @return the value
     **/
    public String getKey() {
        return key;
    }

    /**
     * The category of the top finding.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("topFindingCategory")
    private final String topFindingCategory;

    /**
     * The category of the top finding.
     * @return the value
     **/
    public String getTopFindingCategory() {
        return topFindingCategory;
    }

    /**
     * The short title of the finding.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("title")
    private final String title;

    /**
     * The short title of the finding.
     * @return the value
     **/
    public String getTitle() {
        return title;
    }

    /**
     * The status of the top finding.
     * All findings will have "severity" to indicate the risk level, but only top findings will have "status".
     * Possible status: Pass / Risk (Low, Medium, High)/ Evaluate / Advisory / Deferred
     * Instead of having "Low, Medium, High" in severity, "Risk" will include these three situations in status.
     *
     **/
    public enum TopFindingStatus {
        Risk("RISK"),
        Evaluate("EVALUATE"),
        Advisory("ADVISORY"),
        Pass("PASS"),
        Deferred("DEFERRED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
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
     * The status of the top finding.
     * All findings will have "severity" to indicate the risk level, but only top findings will have "status".
     * Possible status: Pass / Risk (Low, Medium, High)/ Evaluate / Advisory / Deferred
     * Instead of having "Low, Medium, High" in severity, "Risk" will include these three situations in status.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("topFindingStatus")
    private final TopFindingStatus topFindingStatus;

    /**
     * The status of the top finding.
     * All findings will have "severity" to indicate the risk level, but only top findings will have "status".
     * Possible status: Pass / Risk (Low, Medium, High)/ Evaluate / Advisory / Deferred
     * Instead of having "Low, Medium, High" in severity, "Risk" will include these three situations in status.
     *
     * @return the value
     **/
    public TopFindingStatus getTopFindingStatus() {
        return topFindingStatus;
    }

    /**
     * The severity (risk level) of the finding.
     **/
    public enum Severity {
        High("HIGH"),
        Medium("MEDIUM"),
        Low("LOW"),
        Evaluate("EVALUATE"),
        Advisory("ADVISORY"),
        Pass("PASS"),
        Deferred("DEFERRED"),

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
     * The severity (risk level) of the finding.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("severity")
    private final Severity severity;

    /**
     * The severity (risk level) of the finding.
     * @return the value
     **/
    public Severity getSeverity() {
        return severity;
    }

    /**
     * The OCID of the target database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

    /**
     * The OCID of the target database.
     * @return the value
     **/
    public String getTargetId() {
        return targetId;
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
        sb.append("FindingAnalyticsDimensions(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", topFindingCategory=").append(String.valueOf(this.topFindingCategory));
        sb.append(", title=").append(String.valueOf(this.title));
        sb.append(", topFindingStatus=").append(String.valueOf(this.topFindingStatus));
        sb.append(", severity=").append(String.valueOf(this.severity));
        sb.append(", targetId=").append(String.valueOf(this.targetId));
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
                && java.util.Objects.equals(this.title, other.title)
                && java.util.Objects.equals(this.topFindingStatus, other.topFindingStatus)
                && java.util.Objects.equals(this.severity, other.severity)
                && java.util.Objects.equals(this.targetId, other.targetId)
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
        result = (result * PRIME) + (this.title == null ? 43 : this.title.hashCode());
        result =
                (result * PRIME)
                        + (this.topFindingStatus == null ? 43 : this.topFindingStatus.hashCode());
        result = (result * PRIME) + (this.severity == null ? 43 : this.severity.hashCode());
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
