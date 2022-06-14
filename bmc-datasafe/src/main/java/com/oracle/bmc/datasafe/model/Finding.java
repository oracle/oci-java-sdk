/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The particular finding reported by the security assessment.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Finding.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Finding {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "severity",
        "title",
        "remarks",
        "details",
        "summary",
        "references"
    })
    public Finding(
            String key,
            Severity severity,
            String title,
            String remarks,
            Object details,
            String summary,
            References references) {
        super();
        this.key = key;
        this.severity = severity;
        this.title = title;
        this.remarks = remarks;
        this.details = details;
        this.summary = summary;
        this.references = references;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A unique identifier for the finding. This is common for the finding across targets.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * A unique identifier for the finding. This is common for the finding across targets.
         * @param key the value to set
         * @return this builder
         **/
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * The severity of the finding.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("severity")
        private Severity severity;

        /**
         * The severity of the finding.
         * @param severity the value to set
         * @return this builder
         **/
        public Builder severity(Severity severity) {
            this.severity = severity;
            this.__explicitlySet__.add("severity");
            return this;
        }
        /**
         * The short title for the finding.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("title")
        private String title;

        /**
         * The short title for the finding.
         * @param title the value to set
         * @return this builder
         **/
        public Builder title(String title) {
            this.title = title;
            this.__explicitlySet__.add("title");
            return this;
        }
        /**
         * The explanation of the issue in this finding. It explains the reason for the rule and, if a risk is reported, it may also explain the recommended actions for remediation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("remarks")
        private String remarks;

        /**
         * The explanation of the issue in this finding. It explains the reason for the rule and, if a risk is reported, it may also explain the recommended actions for remediation.
         * @param remarks the value to set
         * @return this builder
         **/
        public Builder remarks(String remarks) {
            this.remarks = remarks;
            this.__explicitlySet__.add("remarks");
            return this;
        }
        /**
         * The details of the finding. Provides detailed information to explain the finding summary, typically results from the assessed database, followed by any recommendations for changes.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("details")
        private Object details;

        /**
         * The details of the finding. Provides detailed information to explain the finding summary, typically results from the assessed database, followed by any recommendations for changes.
         * @param details the value to set
         * @return this builder
         **/
        public Builder details(Object details) {
            this.details = details;
            this.__explicitlySet__.add("details");
            return this;
        }
        /**
         * The brief summary of the finding. When the finding is informational, the summary typically reports only the number of data elements that were examined.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("summary")
        private String summary;

        /**
         * The brief summary of the finding. When the finding is informational, the summary typically reports only the number of data elements that were examined.
         * @param summary the value to set
         * @return this builder
         **/
        public Builder summary(String summary) {
            this.summary = summary;
            this.__explicitlySet__.add("summary");
            return this;
        }
        /**
         * Provides information on whether the finding is related to a CIS Oracle Database Benchmark recommendation, STIG rule, or related to a GDPR Article/Recital.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("references")
        private References references;

        /**
         * Provides information on whether the finding is related to a CIS Oracle Database Benchmark recommendation, STIG rule, or related to a GDPR Article/Recital.
         * @param references the value to set
         * @return this builder
         **/
        public Builder references(References references) {
            this.references = references;
            this.__explicitlySet__.add("references");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Finding build() {
            Finding __instance__ =
                    new Finding(key, severity, title, remarks, details, summary, references);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Finding o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .severity(o.getSeverity())
                            .title(o.getTitle())
                            .remarks(o.getRemarks())
                            .details(o.getDetails())
                            .summary(o.getSummary())
                            .references(o.getReferences());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * A unique identifier for the finding. This is common for the finding across targets.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * A unique identifier for the finding. This is common for the finding across targets.
     * @return the value
     **/
    public String getKey() {
        return key;
    }

    /**
     * The severity of the finding.
     **/
    public enum Severity {
        High("HIGH"),
        Medium("MEDIUM"),
        Low("LOW"),
        Evaluate("EVALUATE"),
        Advisory("ADVISORY"),
        Pass("PASS"),

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
     * The severity of the finding.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("severity")
    private final Severity severity;

    /**
     * The severity of the finding.
     * @return the value
     **/
    public Severity getSeverity() {
        return severity;
    }

    /**
     * The short title for the finding.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("title")
    private final String title;

    /**
     * The short title for the finding.
     * @return the value
     **/
    public String getTitle() {
        return title;
    }

    /**
     * The explanation of the issue in this finding. It explains the reason for the rule and, if a risk is reported, it may also explain the recommended actions for remediation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("remarks")
    private final String remarks;

    /**
     * The explanation of the issue in this finding. It explains the reason for the rule and, if a risk is reported, it may also explain the recommended actions for remediation.
     * @return the value
     **/
    public String getRemarks() {
        return remarks;
    }

    /**
     * The details of the finding. Provides detailed information to explain the finding summary, typically results from the assessed database, followed by any recommendations for changes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("details")
    private final Object details;

    /**
     * The details of the finding. Provides detailed information to explain the finding summary, typically results from the assessed database, followed by any recommendations for changes.
     * @return the value
     **/
    public Object getDetails() {
        return details;
    }

    /**
     * The brief summary of the finding. When the finding is informational, the summary typically reports only the number of data elements that were examined.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("summary")
    private final String summary;

    /**
     * The brief summary of the finding. When the finding is informational, the summary typically reports only the number of data elements that were examined.
     * @return the value
     **/
    public String getSummary() {
        return summary;
    }

    /**
     * Provides information on whether the finding is related to a CIS Oracle Database Benchmark recommendation, STIG rule, or related to a GDPR Article/Recital.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("references")
    private final References references;

    /**
     * Provides information on whether the finding is related to a CIS Oracle Database Benchmark recommendation, STIG rule, or related to a GDPR Article/Recital.
     * @return the value
     **/
    public References getReferences() {
        return references;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Finding(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", severity=").append(String.valueOf(this.severity));
        sb.append(", title=").append(String.valueOf(this.title));
        sb.append(", remarks=").append(String.valueOf(this.remarks));
        sb.append(", details=").append(String.valueOf(this.details));
        sb.append(", summary=").append(String.valueOf(this.summary));
        sb.append(", references=").append(String.valueOf(this.references));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Finding)) {
            return false;
        }

        Finding other = (Finding) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.severity, other.severity)
                && java.util.Objects.equals(this.title, other.title)
                && java.util.Objects.equals(this.remarks, other.remarks)
                && java.util.Objects.equals(this.details, other.details)
                && java.util.Objects.equals(this.summary, other.summary)
                && java.util.Objects.equals(this.references, other.references)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.severity == null ? 43 : this.severity.hashCode());
        result = (result * PRIME) + (this.title == null ? 43 : this.title.hashCode());
        result = (result * PRIME) + (this.remarks == null ? 43 : this.remarks.hashCode());
        result = (result * PRIME) + (this.details == null ? 43 : this.details.hashCode());
        result = (result * PRIME) + (this.summary == null ? 43 : this.summary.hashCode());
        result = (result * PRIME) + (this.references == null ? 43 : this.references.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
