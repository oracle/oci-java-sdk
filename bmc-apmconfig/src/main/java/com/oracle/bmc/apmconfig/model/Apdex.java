/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmconfig.model;

/**
 * An Apdex configuration rule. The Apdex score is computed based on how the response time of a span
 * compares to two predefined threshold values. The first threshold defines the maximum response
 * time that is considered satisfactory for the end user. The second one defines the maximum
 * response time that is considered tolerable. All times larger than that will be considered
 * frustrating for the end user. An Apdex configuration rule works by selecting a subset of spans
 * based on a filter expression and applying the two threshold comparisons to compute a score for
 * each of the selected spans. The rule has an "isApplyToErrorSpans" property that controls whether
 * or not to compute the Apdex for spans that have been marked as errors. If this property is set to
 * "true", then the Apdex score for error spans is computed in the same way as for non-error ones.
 * If set to "false", then computation for error spans is skipped, and the score is set to
 * "frustrating" regardless of the configured thresholds. The default is "false". The "isEnabled"
 * property controls whether or not an Apdex score is computed and can be used to disable Apdex
 * score for certain spans. The default is "true". The "priority" property specifies the importance
 * of the rule within a rule set. Lower values indicate a higher priority. Rules with higher
 * priorities are evaluated first in the rule set. The priority of the rules must be unique within a
 * rule set. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Apdex.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class Apdex extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "filterText",
        "priority",
        "isEnabled",
        "satisfiedResponseTime",
        "toleratingResponseTime",
        "isApplyToErrorSpans",
        "displayName"
    })
    public Apdex(
            String filterText,
            Integer priority,
            Boolean isEnabled,
            Integer satisfiedResponseTime,
            Integer toleratingResponseTime,
            Boolean isApplyToErrorSpans,
            String displayName) {
        super();
        this.filterText = filterText;
        this.priority = priority;
        this.isEnabled = isEnabled;
        this.satisfiedResponseTime = satisfiedResponseTime;
        this.toleratingResponseTime = toleratingResponseTime;
        this.isApplyToErrorSpans = isApplyToErrorSpans;
        this.displayName = displayName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The string that defines the Span Filter expression. */
        @com.fasterxml.jackson.annotation.JsonProperty("filterText")
        private String filterText;

        /**
         * The string that defines the Span Filter expression.
         *
         * @param filterText the value to set
         * @return this builder
         */
        public Builder filterText(String filterText) {
            this.filterText = filterText;
            this.__explicitlySet__.add("filterText");
            return this;
        }
        /**
         * The priority controls the order in which multiple rules in a rule set are applied. Lower
         * values indicate higher priorities. Rules with higher priority are applied first, and once
         * a match is found, the rest of the rules are ignored. Rules within the same rule set
         * cannot have the same priority.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("priority")
        private Integer priority;

        /**
         * The priority controls the order in which multiple rules in a rule set are applied. Lower
         * values indicate higher priorities. Rules with higher priority are applied first, and once
         * a match is found, the rest of the rules are ignored. Rules within the same rule set
         * cannot have the same priority.
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
         * Specifies whether the Apdex score should be computed for spans matching the rule. This
         * can be used to disable Apdex score for spans that do not need or require it. The default
         * is "true".
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * Specifies whether the Apdex score should be computed for spans matching the rule. This
         * can be used to disable Apdex score for spans that do not need or require it. The default
         * is "true".
         *
         * @param isEnabled the value to set
         * @return this builder
         */
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }
        /**
         * The maximum response time in milliseconds that is considered "satisfactory" for the end
         * user.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("satisfiedResponseTime")
        private Integer satisfiedResponseTime;

        /**
         * The maximum response time in milliseconds that is considered "satisfactory" for the end
         * user.
         *
         * @param satisfiedResponseTime the value to set
         * @return this builder
         */
        public Builder satisfiedResponseTime(Integer satisfiedResponseTime) {
            this.satisfiedResponseTime = satisfiedResponseTime;
            this.__explicitlySet__.add("satisfiedResponseTime");
            return this;
        }
        /**
         * The maximum response time in milliseconds that is considered "tolerable" for the end
         * user. A response time beyond this threshold is considered "frustrating". This value
         * cannot be lower than "satisfiedResponseTime".
         */
        @com.fasterxml.jackson.annotation.JsonProperty("toleratingResponseTime")
        private Integer toleratingResponseTime;

        /**
         * The maximum response time in milliseconds that is considered "tolerable" for the end
         * user. A response time beyond this threshold is considered "frustrating". This value
         * cannot be lower than "satisfiedResponseTime".
         *
         * @param toleratingResponseTime the value to set
         * @return this builder
         */
        public Builder toleratingResponseTime(Integer toleratingResponseTime) {
            this.toleratingResponseTime = toleratingResponseTime;
            this.__explicitlySet__.add("toleratingResponseTime");
            return this;
        }
        /**
         * Specifies whether an Apdex score should be computed for error spans. Setting it to "true"
         * means that the Apdex score is computed in the usual way. Setting it to "false" skips the
         * Apdex computation and sets the Apdex score to "frustrating" regardless of the configured
         * thresholds. The default is "false".
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isApplyToErrorSpans")
        private Boolean isApplyToErrorSpans;

        /**
         * Specifies whether an Apdex score should be computed for error spans. Setting it to "true"
         * means that the Apdex score is computed in the usual way. Setting it to "false" skips the
         * Apdex computation and sets the Apdex score to "frustrating" regardless of the configured
         * thresholds. The default is "false".
         *
         * @param isApplyToErrorSpans the value to set
         * @return this builder
         */
        public Builder isApplyToErrorSpans(Boolean isApplyToErrorSpans) {
            this.isApplyToErrorSpans = isApplyToErrorSpans;
            this.__explicitlySet__.add("isApplyToErrorSpans");
            return this;
        }
        /** The name by which a configuration entity is displayed to the end user. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The name by which a configuration entity is displayed to the end user.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Apdex build() {
            Apdex model =
                    new Apdex(
                            this.filterText,
                            this.priority,
                            this.isEnabled,
                            this.satisfiedResponseTime,
                            this.toleratingResponseTime,
                            this.isApplyToErrorSpans,
                            this.displayName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Apdex model) {
            if (model.wasPropertyExplicitlySet("filterText")) {
                this.filterText(model.getFilterText());
            }
            if (model.wasPropertyExplicitlySet("priority")) {
                this.priority(model.getPriority());
            }
            if (model.wasPropertyExplicitlySet("isEnabled")) {
                this.isEnabled(model.getIsEnabled());
            }
            if (model.wasPropertyExplicitlySet("satisfiedResponseTime")) {
                this.satisfiedResponseTime(model.getSatisfiedResponseTime());
            }
            if (model.wasPropertyExplicitlySet("toleratingResponseTime")) {
                this.toleratingResponseTime(model.getToleratingResponseTime());
            }
            if (model.wasPropertyExplicitlySet("isApplyToErrorSpans")) {
                this.isApplyToErrorSpans(model.getIsApplyToErrorSpans());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
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

    /** The string that defines the Span Filter expression. */
    @com.fasterxml.jackson.annotation.JsonProperty("filterText")
    private final String filterText;

    /**
     * The string that defines the Span Filter expression.
     *
     * @return the value
     */
    public String getFilterText() {
        return filterText;
    }

    /**
     * The priority controls the order in which multiple rules in a rule set are applied. Lower
     * values indicate higher priorities. Rules with higher priority are applied first, and once a
     * match is found, the rest of the rules are ignored. Rules within the same rule set cannot have
     * the same priority.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("priority")
    private final Integer priority;

    /**
     * The priority controls the order in which multiple rules in a rule set are applied. Lower
     * values indicate higher priorities. Rules with higher priority are applied first, and once a
     * match is found, the rest of the rules are ignored. Rules within the same rule set cannot have
     * the same priority.
     *
     * @return the value
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * Specifies whether the Apdex score should be computed for spans matching the rule. This can be
     * used to disable Apdex score for spans that do not need or require it. The default is "true".
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * Specifies whether the Apdex score should be computed for spans matching the rule. This can be
     * used to disable Apdex score for spans that do not need or require it. The default is "true".
     *
     * @return the value
     */
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /**
     * The maximum response time in milliseconds that is considered "satisfactory" for the end user.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("satisfiedResponseTime")
    private final Integer satisfiedResponseTime;

    /**
     * The maximum response time in milliseconds that is considered "satisfactory" for the end user.
     *
     * @return the value
     */
    public Integer getSatisfiedResponseTime() {
        return satisfiedResponseTime;
    }

    /**
     * The maximum response time in milliseconds that is considered "tolerable" for the end user. A
     * response time beyond this threshold is considered "frustrating". This value cannot be lower
     * than "satisfiedResponseTime".
     */
    @com.fasterxml.jackson.annotation.JsonProperty("toleratingResponseTime")
    private final Integer toleratingResponseTime;

    /**
     * The maximum response time in milliseconds that is considered "tolerable" for the end user. A
     * response time beyond this threshold is considered "frustrating". This value cannot be lower
     * than "satisfiedResponseTime".
     *
     * @return the value
     */
    public Integer getToleratingResponseTime() {
        return toleratingResponseTime;
    }

    /**
     * Specifies whether an Apdex score should be computed for error spans. Setting it to "true"
     * means that the Apdex score is computed in the usual way. Setting it to "false" skips the
     * Apdex computation and sets the Apdex score to "frustrating" regardless of the configured
     * thresholds. The default is "false".
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isApplyToErrorSpans")
    private final Boolean isApplyToErrorSpans;

    /**
     * Specifies whether an Apdex score should be computed for error spans. Setting it to "true"
     * means that the Apdex score is computed in the usual way. Setting it to "false" skips the
     * Apdex computation and sets the Apdex score to "frustrating" regardless of the configured
     * thresholds. The default is "false".
     *
     * @return the value
     */
    public Boolean getIsApplyToErrorSpans() {
        return isApplyToErrorSpans;
    }

    /** The name by which a configuration entity is displayed to the end user. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The name by which a configuration entity is displayed to the end user.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
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
        sb.append("Apdex(");
        sb.append("super=").append(super.toString());
        sb.append("filterText=").append(String.valueOf(this.filterText));
        sb.append(", priority=").append(String.valueOf(this.priority));
        sb.append(", isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", satisfiedResponseTime=").append(String.valueOf(this.satisfiedResponseTime));
        sb.append(", toleratingResponseTime=").append(String.valueOf(this.toleratingResponseTime));
        sb.append(", isApplyToErrorSpans=").append(String.valueOf(this.isApplyToErrorSpans));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Apdex)) {
            return false;
        }

        Apdex other = (Apdex) o;
        return java.util.Objects.equals(this.filterText, other.filterText)
                && java.util.Objects.equals(this.priority, other.priority)
                && java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.satisfiedResponseTime, other.satisfiedResponseTime)
                && java.util.Objects.equals(
                        this.toleratingResponseTime, other.toleratingResponseTime)
                && java.util.Objects.equals(this.isApplyToErrorSpans, other.isApplyToErrorSpans)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.filterText == null ? 43 : this.filterText.hashCode());
        result = (result * PRIME) + (this.priority == null ? 43 : this.priority.hashCode());
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.satisfiedResponseTime == null
                                ? 43
                                : this.satisfiedResponseTime.hashCode());
        result =
                (result * PRIME)
                        + (this.toleratingResponseTime == null
                                ? 43
                                : this.toleratingResponseTime.hashCode());
        result =
                (result * PRIME)
                        + (this.isApplyToErrorSpans == null
                                ? 43
                                : this.isApplyToErrorSpans.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
