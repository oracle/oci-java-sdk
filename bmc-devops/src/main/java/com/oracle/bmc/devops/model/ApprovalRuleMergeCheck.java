/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * The status of the approval rules.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ApprovalRuleMergeCheck.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ApprovalRuleMergeCheck extends MergeCheck {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the rule.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ruleName")
        private String ruleName;

        /**
         * The name of the rule.
         * @param ruleName the value to set
         * @return this builder
         **/
        public Builder ruleName(String ruleName) {
            this.ruleName = ruleName;
            this.__explicitlySet__.add("ruleName");
            return this;
        }
        /**
         * The status of the approval rule.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * The status of the approval rule.
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * The number of total approvals needed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalApprovalCount")
        private Integer totalApprovalCount;

        /**
         * The number of total approvals needed.
         * @param totalApprovalCount the value to set
         * @return this builder
         **/
        public Builder totalApprovalCount(Integer totalApprovalCount) {
            this.totalApprovalCount = totalApprovalCount;
            this.__explicitlySet__.add("totalApprovalCount");
            return this;
        }
        /**
         * The current number of approvals.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("currentApprovalCount")
        private Integer currentApprovalCount;

        /**
         * The current number of approvals.
         * @param currentApprovalCount the value to set
         * @return this builder
         **/
        public Builder currentApprovalCount(Integer currentApprovalCount) {
            this.currentApprovalCount = currentApprovalCount;
            this.__explicitlySet__.add("currentApprovalCount");
            return this;
        }
        /**
         * The list of default reviewers.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("reviewers")
        private java.util.List<PrincipalDetails> reviewers;

        /**
         * The list of default reviewers.
         * @param reviewers the value to set
         * @return this builder
         **/
        public Builder reviewers(java.util.List<PrincipalDetails> reviewers) {
            this.reviewers = reviewers;
            this.__explicitlySet__.add("reviewers");
            return this;
        }
        /**
         * The level of rule.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("level")
        private Level level;

        /**
         * The level of rule.
         * @param level the value to set
         * @return this builder
         **/
        public Builder level(Level level) {
            this.level = level;
            this.__explicitlySet__.add("level");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ApprovalRuleMergeCheck build() {
            ApprovalRuleMergeCheck model =
                    new ApprovalRuleMergeCheck(
                            this.ruleName,
                            this.status,
                            this.totalApprovalCount,
                            this.currentApprovalCount,
                            this.reviewers,
                            this.level);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ApprovalRuleMergeCheck model) {
            if (model.wasPropertyExplicitlySet("ruleName")) {
                this.ruleName(model.getRuleName());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("totalApprovalCount")) {
                this.totalApprovalCount(model.getTotalApprovalCount());
            }
            if (model.wasPropertyExplicitlySet("currentApprovalCount")) {
                this.currentApprovalCount(model.getCurrentApprovalCount());
            }
            if (model.wasPropertyExplicitlySet("reviewers")) {
                this.reviewers(model.getReviewers());
            }
            if (model.wasPropertyExplicitlySet("level")) {
                this.level(model.getLevel());
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

    @Deprecated
    public ApprovalRuleMergeCheck(
            String ruleName,
            Status status,
            Integer totalApprovalCount,
            Integer currentApprovalCount,
            java.util.List<PrincipalDetails> reviewers,
            Level level) {
        super();
        this.ruleName = ruleName;
        this.status = status;
        this.totalApprovalCount = totalApprovalCount;
        this.currentApprovalCount = currentApprovalCount;
        this.reviewers = reviewers;
        this.level = level;
    }

    /**
     * The name of the rule.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ruleName")
    private final String ruleName;

    /**
     * The name of the rule.
     * @return the value
     **/
    public String getRuleName() {
        return ruleName;
    }

    /**
     * The status of the approval rule.
     **/
    public enum Status {
        NeedsApproval("NEEDS_APPROVAL"),
        Succeeded("SUCCEEDED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Status.class);

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Status', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The status of the approval rule.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * The status of the approval rule.
     * @return the value
     **/
    public Status getStatus() {
        return status;
    }

    /**
     * The number of total approvals needed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalApprovalCount")
    private final Integer totalApprovalCount;

    /**
     * The number of total approvals needed.
     * @return the value
     **/
    public Integer getTotalApprovalCount() {
        return totalApprovalCount;
    }

    /**
     * The current number of approvals.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("currentApprovalCount")
    private final Integer currentApprovalCount;

    /**
     * The current number of approvals.
     * @return the value
     **/
    public Integer getCurrentApprovalCount() {
        return currentApprovalCount;
    }

    /**
     * The list of default reviewers.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("reviewers")
    private final java.util.List<PrincipalDetails> reviewers;

    /**
     * The list of default reviewers.
     * @return the value
     **/
    public java.util.List<PrincipalDetails> getReviewers() {
        return reviewers;
    }

    /**
     * The level of rule.
     **/
    public enum Level {
        Project("PROJECT"),
        Repository("REPOSITORY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Level.class);

        private final String value;
        private static java.util.Map<String, Level> map;

        static {
            map = new java.util.HashMap<>();
            for (Level v : Level.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Level(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Level create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Level', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The level of rule.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("level")
    private final Level level;

    /**
     * The level of rule.
     * @return the value
     **/
    public Level getLevel() {
        return level;
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
        sb.append("ApprovalRuleMergeCheck(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", ruleName=").append(String.valueOf(this.ruleName));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", totalApprovalCount=").append(String.valueOf(this.totalApprovalCount));
        sb.append(", currentApprovalCount=").append(String.valueOf(this.currentApprovalCount));
        sb.append(", reviewers=").append(String.valueOf(this.reviewers));
        sb.append(", level=").append(String.valueOf(this.level));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ApprovalRuleMergeCheck)) {
            return false;
        }

        ApprovalRuleMergeCheck other = (ApprovalRuleMergeCheck) o;
        return java.util.Objects.equals(this.ruleName, other.ruleName)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.totalApprovalCount, other.totalApprovalCount)
                && java.util.Objects.equals(this.currentApprovalCount, other.currentApprovalCount)
                && java.util.Objects.equals(this.reviewers, other.reviewers)
                && java.util.Objects.equals(this.level, other.level)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.ruleName == null ? 43 : this.ruleName.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.totalApprovalCount == null
                                ? 43
                                : this.totalApprovalCount.hashCode());
        result =
                (result * PRIME)
                        + (this.currentApprovalCount == null
                                ? 43
                                : this.currentApprovalCount.hashCode());
        result = (result * PRIME) + (this.reviewers == null ? 43 : this.reviewers.hashCode());
        result = (result * PRIME) + (this.level == null ? 43 : this.level.hashCode());
        return result;
    }
}
