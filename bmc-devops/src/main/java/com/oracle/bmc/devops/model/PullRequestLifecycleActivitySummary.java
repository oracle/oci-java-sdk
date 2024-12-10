/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * activity describing a pull request state change
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
    builder = PullRequestLifecycleActivitySummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "activityType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PullRequestLifecycleActivitySummary extends PullRequestActivitySummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("principal")
        private PrincipalDetails principal;

        public Builder principal(PrincipalDetails principal) {
            this.principal = principal;
            this.__explicitlySet__.add("principal");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("pullRequestId")
        private String pullRequestId;

        public Builder pullRequestId(String pullRequestId) {
            this.pullRequestId = pullRequestId;
            this.__explicitlySet__.add("pullRequestId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeOccurred")
        private java.util.Date timeOccurred;

        public Builder timeOccurred(java.util.Date timeOccurred) {
            this.timeOccurred = timeOccurred;
            this.__explicitlySet__.add("timeOccurred");
            return this;
        }
        /**
         * The state of a pull request after an action.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("state")
        private State state;

        /**
         * The state of a pull request after an action.
         * @param state the value to set
         * @return this builder
         **/
        public Builder state(State state) {
            this.state = state;
            this.__explicitlySet__.add("state");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PullRequestLifecycleActivitySummary build() {
            PullRequestLifecycleActivitySummary model =
                    new PullRequestLifecycleActivitySummary(
                            this.id,
                            this.principal,
                            this.pullRequestId,
                            this.timeOccurred,
                            this.state);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PullRequestLifecycleActivitySummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("principal")) {
                this.principal(model.getPrincipal());
            }
            if (model.wasPropertyExplicitlySet("pullRequestId")) {
                this.pullRequestId(model.getPullRequestId());
            }
            if (model.wasPropertyExplicitlySet("timeOccurred")) {
                this.timeOccurred(model.getTimeOccurred());
            }
            if (model.wasPropertyExplicitlySet("state")) {
                this.state(model.getState());
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
    public PullRequestLifecycleActivitySummary(
            String id,
            PrincipalDetails principal,
            String pullRequestId,
            java.util.Date timeOccurred,
            State state) {
        super(id, principal, pullRequestId, timeOccurred);
        this.state = state;
    }

    /**
     * The state of a pull request after an action.
     **/
    public enum State {
        Opened("OPENED"),
        Closed("CLOSED"),
        Merged("MERGED"),
        Reopened("REOPENED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(State.class);

        private final String value;
        private static java.util.Map<String, State> map;

        static {
            map = new java.util.HashMap<>();
            for (State v : State.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        State(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static State create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'State', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The state of a pull request after an action.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("state")
    private final State state;

    /**
     * The state of a pull request after an action.
     * @return the value
     **/
    public State getState() {
        return state;
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
        sb.append("PullRequestLifecycleActivitySummary(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", state=").append(String.valueOf(this.state));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PullRequestLifecycleActivitySummary)) {
            return false;
        }

        PullRequestLifecycleActivitySummary other = (PullRequestLifecycleActivitySummary) o;
        return java.util.Objects.equals(this.state, other.state) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.state == null ? 43 : this.state.hashCode());
        return result;
    }
}
