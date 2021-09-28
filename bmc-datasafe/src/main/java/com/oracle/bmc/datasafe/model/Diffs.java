/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Results of the comparison of an item between two security assessments.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Diffs.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Diffs {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("current")
        private Finding current;

        public Builder current(Finding current) {
            this.current = current;
            this.__explicitlySet__.add("current");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("baseline")
        private Finding baseline;

        public Builder baseline(Finding baseline) {
            this.baseline = baseline;
            this.__explicitlySet__.add("baseline");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("removedItems")
        private java.util.List<String> removedItems;

        public Builder removedItems(java.util.List<String> removedItems) {
            this.removedItems = removedItems;
            this.__explicitlySet__.add("removedItems");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("addedItems")
        private java.util.List<String> addedItems;

        public Builder addedItems(java.util.List<String> addedItems) {
            this.addedItems = addedItems;
            this.__explicitlySet__.add("addedItems");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("modifiedItems")
        private java.util.List<String> modifiedItems;

        public Builder modifiedItems(java.util.List<String> modifiedItems) {
            this.modifiedItems = modifiedItems;
            this.__explicitlySet__.add("modifiedItems");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("severity")
        private Severity severity;

        public Builder severity(Severity severity) {
            this.severity = severity;
            this.__explicitlySet__.add("severity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Diffs build() {
            Diffs __instance__ =
                    new Diffs(current, baseline, removedItems, addedItems, modifiedItems, severity);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Diffs o) {
            Builder copiedBuilder =
                    current(o.getCurrent())
                            .baseline(o.getBaseline())
                            .removedItems(o.getRemovedItems())
                            .addedItems(o.getAddedItems())
                            .modifiedItems(o.getModifiedItems())
                            .severity(o.getSeverity());

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

    @com.fasterxml.jackson.annotation.JsonProperty("current")
    Finding current;

    @com.fasterxml.jackson.annotation.JsonProperty("baseline")
    Finding baseline;

    /**
     * This array identifies the items that are present in the baseline, but are missing from the current assessment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("removedItems")
    java.util.List<String> removedItems;

    /**
     * This array identifies the items that are present in the current assessment, but are missing from the baseline.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("addedItems")
    java.util.List<String> addedItems;

    /**
     * This array contains the items that are present in both the current assessment and the baseline, but are different in the two assessments.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modifiedItems")
    java.util.List<String> modifiedItems;
    /**
     * The severity of this diff.
     **/
    @lombok.extern.slf4j.Slf4j
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
     * The severity of this diff.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("severity")
    Severity severity;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
