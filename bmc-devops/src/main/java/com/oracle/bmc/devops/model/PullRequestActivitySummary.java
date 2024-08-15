/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Summary of an activity record in a pull request
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "activityType",
    defaultImpl = PullRequestActivitySummary.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CommitActivitySummary.class,
        name = "COMMIT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CommentActivitySummary.class,
        name = "COMMENT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ApprovalActivitySummary.class,
        name = "APPROVAL"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ReviewerActivitySummary.class,
        name = "REVIEWER"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = PullRequestLifecycleActivitySummary.class,
        name = "LIFECYCLE"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class PullRequestActivitySummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "principal", "pullRequestId", "timeOccurred"})
    protected PullRequestActivitySummary(
            String id,
            PrincipalDetails principal,
            String pullRequestId,
            java.util.Date timeOccurred) {
        super();
        this.id = id;
        this.principal = principal;
        this.pullRequestId = pullRequestId;
        this.timeOccurred = timeOccurred;
    }

    /**
     * activity identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * activity identifier
     * @return the value
     **/
    public String getId() {
        return id;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("principal")
    private final PrincipalDetails principal;

    public PrincipalDetails getPrincipal() {
        return principal;
    }

    /**
     * pullRequest OCID
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pullRequestId")
    private final String pullRequestId;

    /**
     * pullRequest OCID
     * @return the value
     **/
    public String getPullRequestId() {
        return pullRequestId;
    }

    /**
     * The time the action was performed. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOccurred")
    private final java.util.Date timeOccurred;

    /**
     * The time the action was performed. An RFC3339 formatted datetime string
     * @return the value
     **/
    public java.util.Date getTimeOccurred() {
        return timeOccurred;
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
        sb.append("PullRequestActivitySummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", principal=").append(String.valueOf(this.principal));
        sb.append(", pullRequestId=").append(String.valueOf(this.pullRequestId));
        sb.append(", timeOccurred=").append(String.valueOf(this.timeOccurred));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PullRequestActivitySummary)) {
            return false;
        }

        PullRequestActivitySummary other = (PullRequestActivitySummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.principal, other.principal)
                && java.util.Objects.equals(this.pullRequestId, other.pullRequestId)
                && java.util.Objects.equals(this.timeOccurred, other.timeOccurred)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.principal == null ? 43 : this.principal.hashCode());
        result =
                (result * PRIME)
                        + (this.pullRequestId == null ? 43 : this.pullRequestId.hashCode());
        result = (result * PRIME) + (this.timeOccurred == null ? 43 : this.timeOccurred.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /**
     * The type of activity performed
     **/
    public enum ActivityType {
        Lifecycle("LIFECYCLE"),
        Approval("APPROVAL"),
        Commit("COMMIT"),
        Reviewer("REVIEWER"),
        Comment("COMMENT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ActivityType.class);

        private final String value;
        private static java.util.Map<String, ActivityType> map;

        static {
            map = new java.util.HashMap<>();
            for (ActivityType v : ActivityType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ActivityType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ActivityType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ActivityType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}
