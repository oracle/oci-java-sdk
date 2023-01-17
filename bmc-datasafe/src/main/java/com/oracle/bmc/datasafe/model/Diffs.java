/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Results of the comparison of an item between two security assessments. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Diffs.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class Diffs extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "current",
        "baseline",
        "removedItems",
        "addedItems",
        "modifiedItems",
        "severity"
    })
    public Diffs(
            Finding current,
            Finding baseline,
            java.util.List<String> removedItems,
            java.util.List<String> addedItems,
            java.util.List<String> modifiedItems,
            Severity severity) {
        super();
        this.current = current;
        this.baseline = baseline;
        this.removedItems = removedItems;
        this.addedItems = addedItems;
        this.modifiedItems = modifiedItems;
        this.severity = severity;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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
        /**
         * This array identifies the items that are present in the baseline, but are missing from
         * the current assessment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("removedItems")
        private java.util.List<String> removedItems;

        /**
         * This array identifies the items that are present in the baseline, but are missing from
         * the current assessment.
         *
         * @param removedItems the value to set
         * @return this builder
         */
        public Builder removedItems(java.util.List<String> removedItems) {
            this.removedItems = removedItems;
            this.__explicitlySet__.add("removedItems");
            return this;
        }
        /**
         * This array identifies the items that are present in the current assessment, but are
         * missing from the baseline.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("addedItems")
        private java.util.List<String> addedItems;

        /**
         * This array identifies the items that are present in the current assessment, but are
         * missing from the baseline.
         *
         * @param addedItems the value to set
         * @return this builder
         */
        public Builder addedItems(java.util.List<String> addedItems) {
            this.addedItems = addedItems;
            this.__explicitlySet__.add("addedItems");
            return this;
        }
        /**
         * This array contains the items that are present in both the current assessment and the
         * baseline, but are different in the two assessments.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("modifiedItems")
        private java.util.List<String> modifiedItems;

        /**
         * This array contains the items that are present in both the current assessment and the
         * baseline, but are different in the two assessments.
         *
         * @param modifiedItems the value to set
         * @return this builder
         */
        public Builder modifiedItems(java.util.List<String> modifiedItems) {
            this.modifiedItems = modifiedItems;
            this.__explicitlySet__.add("modifiedItems");
            return this;
        }
        /** The severity of this diff. */
        @com.fasterxml.jackson.annotation.JsonProperty("severity")
        private Severity severity;

        /**
         * The severity of this diff.
         *
         * @param severity the value to set
         * @return this builder
         */
        public Builder severity(Severity severity) {
            this.severity = severity;
            this.__explicitlySet__.add("severity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Diffs build() {
            Diffs model =
                    new Diffs(
                            this.current,
                            this.baseline,
                            this.removedItems,
                            this.addedItems,
                            this.modifiedItems,
                            this.severity);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Diffs model) {
            if (model.wasPropertyExplicitlySet("current")) {
                this.current(model.getCurrent());
            }
            if (model.wasPropertyExplicitlySet("baseline")) {
                this.baseline(model.getBaseline());
            }
            if (model.wasPropertyExplicitlySet("removedItems")) {
                this.removedItems(model.getRemovedItems());
            }
            if (model.wasPropertyExplicitlySet("addedItems")) {
                this.addedItems(model.getAddedItems());
            }
            if (model.wasPropertyExplicitlySet("modifiedItems")) {
                this.modifiedItems(model.getModifiedItems());
            }
            if (model.wasPropertyExplicitlySet("severity")) {
                this.severity(model.getSeverity());
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

    @com.fasterxml.jackson.annotation.JsonProperty("current")
    private final Finding current;

    public Finding getCurrent() {
        return current;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("baseline")
    private final Finding baseline;

    public Finding getBaseline() {
        return baseline;
    }

    /**
     * This array identifies the items that are present in the baseline, but are missing from the
     * current assessment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("removedItems")
    private final java.util.List<String> removedItems;

    /**
     * This array identifies the items that are present in the baseline, but are missing from the
     * current assessment.
     *
     * @return the value
     */
    public java.util.List<String> getRemovedItems() {
        return removedItems;
    }

    /**
     * This array identifies the items that are present in the current assessment, but are missing
     * from the baseline.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("addedItems")
    private final java.util.List<String> addedItems;

    /**
     * This array identifies the items that are present in the current assessment, but are missing
     * from the baseline.
     *
     * @return the value
     */
    public java.util.List<String> getAddedItems() {
        return addedItems;
    }

    /**
     * This array contains the items that are present in both the current assessment and the
     * baseline, but are different in the two assessments.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("modifiedItems")
    private final java.util.List<String> modifiedItems;

    /**
     * This array contains the items that are present in both the current assessment and the
     * baseline, but are different in the two assessments.
     *
     * @return the value
     */
    public java.util.List<String> getModifiedItems() {
        return modifiedItems;
    }

    /** The severity of this diff. */
    public enum Severity implements com.oracle.bmc.http.internal.BmcEnum {
        High("HIGH"),
        Medium("MEDIUM"),
        Low("LOW"),
        Evaluate("EVALUATE"),
        Advisory("ADVISORY"),
        Pass("PASS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Severity.class);

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
    /** The severity of this diff. */
    @com.fasterxml.jackson.annotation.JsonProperty("severity")
    private final Severity severity;

    /**
     * The severity of this diff.
     *
     * @return the value
     */
    public Severity getSeverity() {
        return severity;
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
        sb.append("Diffs(");
        sb.append("super=").append(super.toString());
        sb.append("current=").append(String.valueOf(this.current));
        sb.append(", baseline=").append(String.valueOf(this.baseline));
        sb.append(", removedItems=").append(String.valueOf(this.removedItems));
        sb.append(", addedItems=").append(String.valueOf(this.addedItems));
        sb.append(", modifiedItems=").append(String.valueOf(this.modifiedItems));
        sb.append(", severity=").append(String.valueOf(this.severity));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Diffs)) {
            return false;
        }

        Diffs other = (Diffs) o;
        return java.util.Objects.equals(this.current, other.current)
                && java.util.Objects.equals(this.baseline, other.baseline)
                && java.util.Objects.equals(this.removedItems, other.removedItems)
                && java.util.Objects.equals(this.addedItems, other.addedItems)
                && java.util.Objects.equals(this.modifiedItems, other.modifiedItems)
                && java.util.Objects.equals(this.severity, other.severity)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.current == null ? 43 : this.current.hashCode());
        result = (result * PRIME) + (this.baseline == null ? 43 : this.baseline.hashCode());
        result = (result * PRIME) + (this.removedItems == null ? 43 : this.removedItems.hashCode());
        result = (result * PRIME) + (this.addedItems == null ? 43 : this.addedItems.hashCode());
        result =
                (result * PRIME)
                        + (this.modifiedItems == null ? 43 : this.modifiedItems.hashCode());
        result = (result * PRIME) + (this.severity == null ? 43 : this.severity.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
