/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The security rule to be evaluated by security assessment to create finding. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Check.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Check extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "title",
        "remarks",
        "references",
        "category",
        "oneline",
        "suggestedSeverity"
    })
    public Check(
            String key,
            String title,
            String remarks,
            References references,
            String category,
            String oneline,
            SuggestedSeverity suggestedSeverity) {
        super();
        this.key = key;
        this.title = title;
        this.remarks = remarks;
        this.references = references;
        this.category = category;
        this.oneline = oneline;
        this.suggestedSeverity = suggestedSeverity;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** A unique identifier for the check. */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * A unique identifier for the check.
         *
         * @param key the value to set
         * @return this builder
         */
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /** The short title for the check. */
        @com.fasterxml.jackson.annotation.JsonProperty("title")
        private String title;

        /**
         * The short title for the check.
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
         * The explanation of the issue in this check. It explains the reason for the rule and, if a
         * risk is reported, it may also explain the recommended actions for remediation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("remarks")
        private String remarks;

        /**
         * The explanation of the issue in this check. It explains the reason for the rule and, if a
         * risk is reported, it may also explain the recommended actions for remediation.
         *
         * @param remarks the value to set
         * @return this builder
         */
        public Builder remarks(String remarks) {
            this.remarks = remarks;
            this.__explicitlySet__.add("remarks");
            return this;
        }
        /**
         * Provides information on whether the check is related to a CIS Oracle Database Benchmark
         * recommendation, STIG rule, GDPR Article/Recital or related to the Oracle Recommended
         * Practice.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("references")
        private References references;

        /**
         * Provides information on whether the check is related to a CIS Oracle Database Benchmark
         * recommendation, STIG rule, GDPR Article/Recital or related to the Oracle Recommended
         * Practice.
         *
         * @param references the value to set
         * @return this builder
         */
        public Builder references(References references) {
            this.references = references;
            this.__explicitlySet__.add("references");
            return this;
        }
        /** The category to which the check belongs to. */
        @com.fasterxml.jackson.annotation.JsonProperty("category")
        private String category;

        /**
         * The category to which the check belongs to.
         *
         * @param category the value to set
         * @return this builder
         */
        public Builder category(String category) {
            this.category = category;
            this.__explicitlySet__.add("category");
            return this;
        }
        /** Provides a recommended approach to take to remediate the check reported. */
        @com.fasterxml.jackson.annotation.JsonProperty("oneline")
        private String oneline;

        /**
         * Provides a recommended approach to take to remediate the check reported.
         *
         * @param oneline the value to set
         * @return this builder
         */
        public Builder oneline(String oneline) {
            this.oneline = oneline;
            this.__explicitlySet__.add("oneline");
            return this;
        }
        /**
         * The severity of the check as suggested by Data Safe security assessment. This will be the
         * default severity in the template baseline security assessment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("suggestedSeverity")
        private SuggestedSeverity suggestedSeverity;

        /**
         * The severity of the check as suggested by Data Safe security assessment. This will be the
         * default severity in the template baseline security assessment.
         *
         * @param suggestedSeverity the value to set
         * @return this builder
         */
        public Builder suggestedSeverity(SuggestedSeverity suggestedSeverity) {
            this.suggestedSeverity = suggestedSeverity;
            this.__explicitlySet__.add("suggestedSeverity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Check build() {
            Check model =
                    new Check(
                            this.key,
                            this.title,
                            this.remarks,
                            this.references,
                            this.category,
                            this.oneline,
                            this.suggestedSeverity);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Check model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("title")) {
                this.title(model.getTitle());
            }
            if (model.wasPropertyExplicitlySet("remarks")) {
                this.remarks(model.getRemarks());
            }
            if (model.wasPropertyExplicitlySet("references")) {
                this.references(model.getReferences());
            }
            if (model.wasPropertyExplicitlySet("category")) {
                this.category(model.getCategory());
            }
            if (model.wasPropertyExplicitlySet("oneline")) {
                this.oneline(model.getOneline());
            }
            if (model.wasPropertyExplicitlySet("suggestedSeverity")) {
                this.suggestedSeverity(model.getSuggestedSeverity());
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

    /** A unique identifier for the check. */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * A unique identifier for the check.
     *
     * @return the value
     */
    public String getKey() {
        return key;
    }

    /** The short title for the check. */
    @com.fasterxml.jackson.annotation.JsonProperty("title")
    private final String title;

    /**
     * The short title for the check.
     *
     * @return the value
     */
    public String getTitle() {
        return title;
    }

    /**
     * The explanation of the issue in this check. It explains the reason for the rule and, if a
     * risk is reported, it may also explain the recommended actions for remediation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("remarks")
    private final String remarks;

    /**
     * The explanation of the issue in this check. It explains the reason for the rule and, if a
     * risk is reported, it may also explain the recommended actions for remediation.
     *
     * @return the value
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Provides information on whether the check is related to a CIS Oracle Database Benchmark
     * recommendation, STIG rule, GDPR Article/Recital or related to the Oracle Recommended
     * Practice.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("references")
    private final References references;

    /**
     * Provides information on whether the check is related to a CIS Oracle Database Benchmark
     * recommendation, STIG rule, GDPR Article/Recital or related to the Oracle Recommended
     * Practice.
     *
     * @return the value
     */
    public References getReferences() {
        return references;
    }

    /** The category to which the check belongs to. */
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    private final String category;

    /**
     * The category to which the check belongs to.
     *
     * @return the value
     */
    public String getCategory() {
        return category;
    }

    /** Provides a recommended approach to take to remediate the check reported. */
    @com.fasterxml.jackson.annotation.JsonProperty("oneline")
    private final String oneline;

    /**
     * Provides a recommended approach to take to remediate the check reported.
     *
     * @return the value
     */
    public String getOneline() {
        return oneline;
    }

    /**
     * The severity of the check as suggested by Data Safe security assessment. This will be the
     * default severity in the template baseline security assessment.
     */
    public enum SuggestedSeverity implements com.oracle.bmc.http.internal.BmcEnum {
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
                org.slf4j.LoggerFactory.getLogger(SuggestedSeverity.class);

        private final String value;
        private static java.util.Map<String, SuggestedSeverity> map;

        static {
            map = new java.util.HashMap<>();
            for (SuggestedSeverity v : SuggestedSeverity.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        SuggestedSeverity(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SuggestedSeverity create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'SuggestedSeverity', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The severity of the check as suggested by Data Safe security assessment. This will be the
     * default severity in the template baseline security assessment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("suggestedSeverity")
    private final SuggestedSeverity suggestedSeverity;

    /**
     * The severity of the check as suggested by Data Safe security assessment. This will be the
     * default severity in the template baseline security assessment.
     *
     * @return the value
     */
    public SuggestedSeverity getSuggestedSeverity() {
        return suggestedSeverity;
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
        sb.append("Check(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", title=").append(String.valueOf(this.title));
        sb.append(", remarks=").append(String.valueOf(this.remarks));
        sb.append(", references=").append(String.valueOf(this.references));
        sb.append(", category=").append(String.valueOf(this.category));
        sb.append(", oneline=").append(String.valueOf(this.oneline));
        sb.append(", suggestedSeverity=").append(String.valueOf(this.suggestedSeverity));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Check)) {
            return false;
        }

        Check other = (Check) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.title, other.title)
                && java.util.Objects.equals(this.remarks, other.remarks)
                && java.util.Objects.equals(this.references, other.references)
                && java.util.Objects.equals(this.category, other.category)
                && java.util.Objects.equals(this.oneline, other.oneline)
                && java.util.Objects.equals(this.suggestedSeverity, other.suggestedSeverity)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.title == null ? 43 : this.title.hashCode());
        result = (result * PRIME) + (this.remarks == null ? 43 : this.remarks.hashCode());
        result = (result * PRIME) + (this.references == null ? 43 : this.references.hashCode());
        result = (result * PRIME) + (this.category == null ? 43 : this.category.hashCode());
        result = (result * PRIME) + (this.oneline == null ? 43 : this.oneline.hashCode());
        result =
                (result * PRIME)
                        + (this.suggestedSeverity == null ? 43 : this.suggestedSeverity.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
