/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * The filter for Bitbucket Server events. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = BitbucketServerFilter.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "triggerSource")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class BitbucketServerFilter extends Filter {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The events, for example, PUSH, PULL_REQUEST_MERGE. */
        @com.fasterxml.jackson.annotation.JsonProperty("events")
        private java.util.List<Events> events;

        /**
         * The events, for example, PUSH, PULL_REQUEST_MERGE.
         *
         * @param events the value to set
         * @return this builder
         */
        public Builder events(java.util.List<Events> events) {
            this.events = events;
            this.__explicitlySet__.add("events");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("include")
        private BitbucketServerFilterAttributes include;

        public Builder include(BitbucketServerFilterAttributes include) {
            this.include = include;
            this.__explicitlySet__.add("include");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BitbucketServerFilter build() {
            BitbucketServerFilter model = new BitbucketServerFilter(this.events, this.include);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BitbucketServerFilter model) {
            if (model.wasPropertyExplicitlySet("events")) {
                this.events(model.getEvents());
            }
            if (model.wasPropertyExplicitlySet("include")) {
                this.include(model.getInclude());
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

    @Deprecated
    public BitbucketServerFilter(
            java.util.List<Events> events, BitbucketServerFilterAttributes include) {
        super();
        this.events = events;
        this.include = include;
    }

    /** */
    public enum Events implements com.oracle.bmc.http.internal.BmcEnum {
        Push("PUSH"),
        PullRequestOpened("PULL_REQUEST_OPENED"),
        PullRequestModified("PULL_REQUEST_MODIFIED"),
        PullRequestMerged("PULL_REQUEST_MERGED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Events.class);

        private final String value;
        private static java.util.Map<String, Events> map;

        static {
            map = new java.util.HashMap<>();
            for (Events v : Events.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Events(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Events create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Events', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The events, for example, PUSH, PULL_REQUEST_MERGE. */
    @com.fasterxml.jackson.annotation.JsonProperty("events")
    private final java.util.List<Events> events;

    /**
     * The events, for example, PUSH, PULL_REQUEST_MERGE.
     *
     * @return the value
     */
    public java.util.List<Events> getEvents() {
        return events;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("include")
    private final BitbucketServerFilterAttributes include;

    public BitbucketServerFilterAttributes getInclude() {
        return include;
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
        sb.append("BitbucketServerFilter(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", events=").append(String.valueOf(this.events));
        sb.append(", include=").append(String.valueOf(this.include));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BitbucketServerFilter)) {
            return false;
        }

        BitbucketServerFilter other = (BitbucketServerFilter) o;
        return java.util.Objects.equals(this.events, other.events)
                && java.util.Objects.equals(this.include, other.include)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.events == null ? 43 : this.events.hashCode());
        result = (result * PRIME) + (this.include == null ? 43 : this.include.hashCode());
        return result;
    }
}
