/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Adhoc query result resource from running on a resource.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AdhocQueryResultSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AdhocQueryResultSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "hostId",
        "state",
        "region",
        "timeSubmitted",
        "errorMessage",
        "resultCount",
        "result",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public AdhocQueryResultSummary(
            String hostId,
            AdhocQueryResultState state,
            String region,
            java.util.Date timeSubmitted,
            String errorMessage,
            Long resultCount,
            java.util.List<java.util.Map<String, String>> result,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.hostId = hostId;
        this.state = state;
        this.region = region;
        this.timeSubmitted = timeSubmitted;
        this.errorMessage = errorMessage;
        this.resultCount = resultCount;
        this.result = result;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Resource this result belongs to
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("hostId")
        private String hostId;

        /**
         * Resource this result belongs to
         * @param hostId the value to set
         * @return this builder
         **/
        public Builder hostId(String hostId) {
            this.hostId = hostId;
            this.__explicitlySet__.add("hostId");
            return this;
        }
        /**
         * Status of the query
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("state")
        private AdhocQueryResultState state;

        /**
         * Status of the query
         * @param state the value to set
         * @return this builder
         **/
        public Builder state(AdhocQueryResultState state) {
            this.state = state;
            this.__explicitlySet__.add("state");
            return this;
        }
        /**
         * The region this adhoc work request is running in, needed for tracking when work request is synced to reporting region
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        /**
         * The region this adhoc work request is running in, needed for tracking when work request is synced to reporting region
         * @param region the value to set
         * @return this builder
         **/
        public Builder region(String region) {
            this.region = region;
            this.__explicitlySet__.add("region");
            return this;
        }
        /**
         * The time the adhoc result was submitted. An RFC3339 formatted datetime string
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeSubmitted")
        private java.util.Date timeSubmitted;

        /**
         * The time the adhoc result was submitted. An RFC3339 formatted datetime string
         * @param timeSubmitted the value to set
         * @return this builder
         **/
        public Builder timeSubmitted(java.util.Date timeSubmitted) {
            this.timeSubmitted = timeSubmitted;
            this.__explicitlySet__.add("timeSubmitted");
            return this;
        }
        /**
         * Optional error message
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
        private String errorMessage;

        /**
         * Optional error message
         * @param errorMessage the value to set
         * @return this builder
         **/
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            this.__explicitlySet__.add("errorMessage");
            return this;
        }
        /**
         * Number of records returned for the query results on this host
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resultCount")
        private Long resultCount;

        /**
         * Number of records returned for the query results on this host
         * @param resultCount the value to set
         * @return this builder
         **/
        public Builder resultCount(Long resultCount) {
            this.resultCount = resultCount;
            this.__explicitlySet__.add("resultCount");
            return this;
        }
        /**
         * Result of the adhoc query this result resource is associated with
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("result")
        private java.util.List<java.util.Map<String, String>> result;

        /**
         * Result of the adhoc query this result resource is associated with
         * @param result the value to set
         * @return this builder
         **/
        public Builder result(java.util.List<java.util.Map<String, String>> result) {
            this.result = result;
            this.__explicitlySet__.add("result");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         * <p>
         * Avoid entering confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         * <p>
         * Avoid entering confidential information.
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * System tags can be viewed by users, but can only be created by the system.
         * <p>
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * System tags can be viewed by users, but can only be created by the system.
         * <p>
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         **/
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AdhocQueryResultSummary build() {
            AdhocQueryResultSummary model =
                    new AdhocQueryResultSummary(
                            this.hostId,
                            this.state,
                            this.region,
                            this.timeSubmitted,
                            this.errorMessage,
                            this.resultCount,
                            this.result,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AdhocQueryResultSummary model) {
            if (model.wasPropertyExplicitlySet("hostId")) {
                this.hostId(model.getHostId());
            }
            if (model.wasPropertyExplicitlySet("state")) {
                this.state(model.getState());
            }
            if (model.wasPropertyExplicitlySet("region")) {
                this.region(model.getRegion());
            }
            if (model.wasPropertyExplicitlySet("timeSubmitted")) {
                this.timeSubmitted(model.getTimeSubmitted());
            }
            if (model.wasPropertyExplicitlySet("errorMessage")) {
                this.errorMessage(model.getErrorMessage());
            }
            if (model.wasPropertyExplicitlySet("resultCount")) {
                this.resultCount(model.getResultCount());
            }
            if (model.wasPropertyExplicitlySet("result")) {
                this.result(model.getResult());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
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
     * Resource this result belongs to
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostId")
    private final String hostId;

    /**
     * Resource this result belongs to
     * @return the value
     **/
    public String getHostId() {
        return hostId;
    }

    /**
     * Status of the query
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("state")
    private final AdhocQueryResultState state;

    /**
     * Status of the query
     * @return the value
     **/
    public AdhocQueryResultState getState() {
        return state;
    }

    /**
     * The region this adhoc work request is running in, needed for tracking when work request is synced to reporting region
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

    /**
     * The region this adhoc work request is running in, needed for tracking when work request is synced to reporting region
     * @return the value
     **/
    public String getRegion() {
        return region;
    }

    /**
     * The time the adhoc result was submitted. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeSubmitted")
    private final java.util.Date timeSubmitted;

    /**
     * The time the adhoc result was submitted. An RFC3339 formatted datetime string
     * @return the value
     **/
    public java.util.Date getTimeSubmitted() {
        return timeSubmitted;
    }

    /**
     * Optional error message
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
    private final String errorMessage;

    /**
     * Optional error message
     * @return the value
     **/
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Number of records returned for the query results on this host
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resultCount")
    private final Long resultCount;

    /**
     * Number of records returned for the query results on this host
     * @return the value
     **/
    public Long getResultCount() {
        return resultCount;
    }

    /**
     * Result of the adhoc query this result resource is associated with
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("result")
    private final java.util.List<java.util.Map<String, String>> result;

    /**
     * Result of the adhoc query this result resource is associated with
     * @return the value
     **/
    public java.util.List<java.util.Map<String, String>> getResult() {
        return result;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     * <p>
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     * <p>
     * Avoid entering confidential information.
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * System tags can be viewed by users, but can only be created by the system.
     * <p>
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * System tags can be viewed by users, but can only be created by the system.
     * <p>
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("AdhocQueryResultSummary(");
        sb.append("super=").append(super.toString());
        sb.append("hostId=").append(String.valueOf(this.hostId));
        sb.append(", state=").append(String.valueOf(this.state));
        sb.append(", region=").append(String.valueOf(this.region));
        sb.append(", timeSubmitted=").append(String.valueOf(this.timeSubmitted));
        sb.append(", errorMessage=").append(String.valueOf(this.errorMessage));
        sb.append(", resultCount=").append(String.valueOf(this.resultCount));
        sb.append(", result=").append(String.valueOf(this.result));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AdhocQueryResultSummary)) {
            return false;
        }

        AdhocQueryResultSummary other = (AdhocQueryResultSummary) o;
        return java.util.Objects.equals(this.hostId, other.hostId)
                && java.util.Objects.equals(this.state, other.state)
                && java.util.Objects.equals(this.region, other.region)
                && java.util.Objects.equals(this.timeSubmitted, other.timeSubmitted)
                && java.util.Objects.equals(this.errorMessage, other.errorMessage)
                && java.util.Objects.equals(this.resultCount, other.resultCount)
                && java.util.Objects.equals(this.result, other.result)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.hostId == null ? 43 : this.hostId.hashCode());
        result = (result * PRIME) + (this.state == null ? 43 : this.state.hashCode());
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result =
                (result * PRIME)
                        + (this.timeSubmitted == null ? 43 : this.timeSubmitted.hashCode());
        result = (result * PRIME) + (this.errorMessage == null ? 43 : this.errorMessage.hashCode());
        result = (result * PRIME) + (this.resultCount == null ? 43 : this.resultCount.hashCode());
        result = (result * PRIME) + (this.result == null ? 43 : this.result.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
