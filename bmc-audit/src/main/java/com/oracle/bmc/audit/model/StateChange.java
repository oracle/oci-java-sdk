/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.audit.model;

/**
 * A container object for state change attributes.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190901")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = StateChange.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class StateChange {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("previous")
        private java.util.Map<String, Object> previous;

        public Builder previous(java.util.Map<String, Object> previous) {
            this.previous = previous;
            this.__explicitlySet__.add("previous");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("current")
        private java.util.Map<String, Object> current;

        public Builder current(java.util.Map<String, Object> current) {
            this.current = current;
            this.__explicitlySet__.add("current");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public StateChange build() {
            StateChange __instance__ = new StateChange(previous, current);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(StateChange o) {
            Builder copiedBuilder = previous(o.getPrevious()).current(o.getCurrent());

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

    /**
     * Provides the previous state of fields that may have changed during an operation. To determine
     * how the current operation changed a resource, compare the information in this attribute to
     * {@code current}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("previous")
    java.util.Map<String, Object> previous;

    /**
     * Provides the current state of fields that may have changed during an operation. To determine
     * how the current operation changed a resource, compare the information in this attribute to
     * {@code previous}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("current")
    java.util.Map<String, Object> current;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
