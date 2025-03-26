/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * The metric type:
 * COMMITS - Represents the number of commits.
 * LINES_ADDED - Represents the number of lines of code added.
 * LINES_DELETED - Represents the number of lines of code deleted.
 * PULL_REQUEST_CREATED - Represents the number of pull requests which is in created/ open state.
 * PULL_REQUEST_MERGED - Represents the number of pull requests which is in merging/ merged state.
 * PULL_REQUEST_DECLINED - Represents the number of pull requests which is in declined state.
 * PULL_REQUEST_REVIEW_START_DURATION_IN_DAYS - Represents the time from when a pull request is created to the first comment on the pull request.
 * PULL_REQUEST_REVIEW_DURATION_IN_DAYS - Represents the time from the first comment on the pull request to when the pull request is merged or closed.
 * PULL_REQUEST_APPROVED - Represents the number of pull requests which is approved by the user when the pull request is merged.
 * PULL_REQUEST_REVIEWED - Represents the number of pull requests which has been commented on.
 * PULL_REQUEST_COMMENTS - Represents the total number of comments given across different pull requests.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
public enum MetricName {
    Commits("COMMITS"),
    LinesAdded("LINES_ADDED"),
    LinesDeleted("LINES_DELETED"),
    PullRequestCreated("PULL_REQUEST_CREATED"),
    PullRequestMerged("PULL_REQUEST_MERGED"),
    PullRequestDeclined("PULL_REQUEST_DECLINED"),
    PullRequestReviewStartDurationInDays("PULL_REQUEST_REVIEW_START_DURATION_IN_DAYS"),
    PullRequestReviewDurationInDays("PULL_REQUEST_REVIEW_DURATION_IN_DAYS"),
    PullRequestApproved("PULL_REQUEST_APPROVED"),
    PullRequestReviewed("PULL_REQUEST_REVIEWED"),
    PullRequestComments("PULL_REQUEST_COMMENTS"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(MetricName.class);

    private final String value;
    private static java.util.Map<String, MetricName> map;

    static {
        map = new java.util.HashMap<>();
        for (MetricName v : MetricName.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    MetricName(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static MetricName create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'MetricName', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
