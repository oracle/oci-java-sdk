/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * The Monitoring Template Alarm Condition.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Condition.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Condition extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "severity",
        "query",
        "body",
        "shouldAppendNote",
        "shouldAppendUrl",
        "triggerDelay"
    })
    public Condition(
            AlarmConditionSeverity severity,
            String query,
            String body,
            Boolean shouldAppendNote,
            Boolean shouldAppendUrl,
            String triggerDelay) {
        super();
        this.severity = severity;
        this.query = query;
        this.body = body;
        this.shouldAppendNote = shouldAppendNote;
        this.shouldAppendUrl = shouldAppendUrl;
        this.triggerDelay = triggerDelay;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Severity - Critical/Warning
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("severity")
        private AlarmConditionSeverity severity;

        /**
         * Severity - Critical/Warning
         * @param severity the value to set
         * @return this builder
         **/
        public Builder severity(AlarmConditionSeverity severity) {
            this.severity = severity;
            this.__explicitlySet__.add("severity");
            return this;
        }
        /**
         * The Monitoring Query Language (MQL) expression to evaluate for the alarm.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("query")
        private String query;

        /**
         * The Monitoring Query Language (MQL) expression to evaluate for the alarm.
         * @param query the value to set
         * @return this builder
         **/
        public Builder query(String query) {
            this.query = query;
            this.__explicitlySet__.add("query");
            return this;
        }
        /**
         * The human-readable content of the delivered alarm notification. Oracle recommends providing guidance to operators for resolving the alarm condition. Consider adding links to standard runbook practices. Avoid entering confidential information.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("body")
        private String body;

        /**
         * The human-readable content of the delivered alarm notification. Oracle recommends providing guidance to operators for resolving the alarm condition. Consider adding links to standard runbook practices. Avoid entering confidential information.
         * @param body the value to set
         * @return this builder
         **/
        public Builder body(String body) {
            this.body = body;
            this.__explicitlySet__.add("body");
            return this;
        }
        /**
         * Whether the note need to add into bottom of the body for mapping the alarms information with template or not.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("shouldAppendNote")
        private Boolean shouldAppendNote;

        /**
         * Whether the note need to add into bottom of the body for mapping the alarms information with template or not.
         * @param shouldAppendNote the value to set
         * @return this builder
         **/
        public Builder shouldAppendNote(Boolean shouldAppendNote) {
            this.shouldAppendNote = shouldAppendNote;
            this.__explicitlySet__.add("shouldAppendNote");
            return this;
        }
        /**
         * Whether the URL need to add into bottom of the body for mapping the alarms information with template or not.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("shouldAppendUrl")
        private Boolean shouldAppendUrl;

        /**
         * Whether the URL need to add into bottom of the body for mapping the alarms information with template or not.
         * @param shouldAppendUrl the value to set
         * @return this builder
         **/
        public Builder shouldAppendUrl(Boolean shouldAppendUrl) {
            this.shouldAppendUrl = shouldAppendUrl;
            this.__explicitlySet__.add("shouldAppendUrl");
            return this;
        }
        /**
         * The period of time that the condition defined in the alarm must persist before the alarm state changes from "OK" to "FIRING".
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("triggerDelay")
        private String triggerDelay;

        /**
         * The period of time that the condition defined in the alarm must persist before the alarm state changes from "OK" to "FIRING".
         * @param triggerDelay the value to set
         * @return this builder
         **/
        public Builder triggerDelay(String triggerDelay) {
            this.triggerDelay = triggerDelay;
            this.__explicitlySet__.add("triggerDelay");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Condition build() {
            Condition model =
                    new Condition(
                            this.severity,
                            this.query,
                            this.body,
                            this.shouldAppendNote,
                            this.shouldAppendUrl,
                            this.triggerDelay);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Condition model) {
            if (model.wasPropertyExplicitlySet("severity")) {
                this.severity(model.getSeverity());
            }
            if (model.wasPropertyExplicitlySet("query")) {
                this.query(model.getQuery());
            }
            if (model.wasPropertyExplicitlySet("body")) {
                this.body(model.getBody());
            }
            if (model.wasPropertyExplicitlySet("shouldAppendNote")) {
                this.shouldAppendNote(model.getShouldAppendNote());
            }
            if (model.wasPropertyExplicitlySet("shouldAppendUrl")) {
                this.shouldAppendUrl(model.getShouldAppendUrl());
            }
            if (model.wasPropertyExplicitlySet("triggerDelay")) {
                this.triggerDelay(model.getTriggerDelay());
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
     * Severity - Critical/Warning
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("severity")
    private final AlarmConditionSeverity severity;

    /**
     * Severity - Critical/Warning
     * @return the value
     **/
    public AlarmConditionSeverity getSeverity() {
        return severity;
    }

    /**
     * The Monitoring Query Language (MQL) expression to evaluate for the alarm.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("query")
    private final String query;

    /**
     * The Monitoring Query Language (MQL) expression to evaluate for the alarm.
     * @return the value
     **/
    public String getQuery() {
        return query;
    }

    /**
     * The human-readable content of the delivered alarm notification. Oracle recommends providing guidance to operators for resolving the alarm condition. Consider adding links to standard runbook practices. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("body")
    private final String body;

    /**
     * The human-readable content of the delivered alarm notification. Oracle recommends providing guidance to operators for resolving the alarm condition. Consider adding links to standard runbook practices. Avoid entering confidential information.
     * @return the value
     **/
    public String getBody() {
        return body;
    }

    /**
     * Whether the note need to add into bottom of the body for mapping the alarms information with template or not.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shouldAppendNote")
    private final Boolean shouldAppendNote;

    /**
     * Whether the note need to add into bottom of the body for mapping the alarms information with template or not.
     * @return the value
     **/
    public Boolean getShouldAppendNote() {
        return shouldAppendNote;
    }

    /**
     * Whether the URL need to add into bottom of the body for mapping the alarms information with template or not.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shouldAppendUrl")
    private final Boolean shouldAppendUrl;

    /**
     * Whether the URL need to add into bottom of the body for mapping the alarms information with template or not.
     * @return the value
     **/
    public Boolean getShouldAppendUrl() {
        return shouldAppendUrl;
    }

    /**
     * The period of time that the condition defined in the alarm must persist before the alarm state changes from "OK" to "FIRING".
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("triggerDelay")
    private final String triggerDelay;

    /**
     * The period of time that the condition defined in the alarm must persist before the alarm state changes from "OK" to "FIRING".
     * @return the value
     **/
    public String getTriggerDelay() {
        return triggerDelay;
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
        sb.append("Condition(");
        sb.append("super=").append(super.toString());
        sb.append("severity=").append(String.valueOf(this.severity));
        sb.append(", query=").append(String.valueOf(this.query));
        sb.append(", body=").append(String.valueOf(this.body));
        sb.append(", shouldAppendNote=").append(String.valueOf(this.shouldAppendNote));
        sb.append(", shouldAppendUrl=").append(String.valueOf(this.shouldAppendUrl));
        sb.append(", triggerDelay=").append(String.valueOf(this.triggerDelay));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Condition)) {
            return false;
        }

        Condition other = (Condition) o;
        return java.util.Objects.equals(this.severity, other.severity)
                && java.util.Objects.equals(this.query, other.query)
                && java.util.Objects.equals(this.body, other.body)
                && java.util.Objects.equals(this.shouldAppendNote, other.shouldAppendNote)
                && java.util.Objects.equals(this.shouldAppendUrl, other.shouldAppendUrl)
                && java.util.Objects.equals(this.triggerDelay, other.triggerDelay)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.severity == null ? 43 : this.severity.hashCode());
        result = (result * PRIME) + (this.query == null ? 43 : this.query.hashCode());
        result = (result * PRIME) + (this.body == null ? 43 : this.body.hashCode());
        result =
                (result * PRIME)
                        + (this.shouldAppendNote == null ? 43 : this.shouldAppendNote.hashCode());
        result =
                (result * PRIME)
                        + (this.shouldAppendUrl == null ? 43 : this.shouldAppendUrl.hashCode());
        result = (result * PRIME) + (this.triggerDelay == null ? 43 : this.triggerDelay.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
