/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details of a capture filter used to include or exclude SQL statements in the initial
 * automatic plan capture. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AutomaticCaptureFilterDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AutomaticCaptureFilterDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "valuesToInclude", "valuesToExclude"})
    public AutomaticCaptureFilterDetails(
            Name name,
            java.util.List<String> valuesToInclude,
            java.util.List<String> valuesToExclude) {
        super();
        this.name = name;
        this.valuesToInclude = valuesToInclude;
        this.valuesToExclude = valuesToExclude;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the automatic capture filter.
         *
         * <p>- AUTO_CAPTURE_SQL_TEXT: Search pattern to apply to SQL text. -
         * AUTO_CAPTURE_PARSING_SCHEMA_NAME: Parsing schema to include or exclude for SQL plan
         * management auto capture. - AUTO_CAPTURE_MODULE: Module to include or exclude for SQL plan
         * management auto capture. - AUTO_CAPTURE_ACTION: Action to include or exclude for SQL plan
         * management automatic capture.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private Name name;

        /**
         * The name of the automatic capture filter.
         *
         * <p>- AUTO_CAPTURE_SQL_TEXT: Search pattern to apply to SQL text. -
         * AUTO_CAPTURE_PARSING_SCHEMA_NAME: Parsing schema to include or exclude for SQL plan
         * management auto capture. - AUTO_CAPTURE_MODULE: Module to include or exclude for SQL plan
         * management auto capture. - AUTO_CAPTURE_ACTION: Action to include or exclude for SQL plan
         * management automatic capture.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(Name name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** A list of filter values to include. */
        @com.fasterxml.jackson.annotation.JsonProperty("valuesToInclude")
        private java.util.List<String> valuesToInclude;

        /**
         * A list of filter values to include.
         *
         * @param valuesToInclude the value to set
         * @return this builder
         */
        public Builder valuesToInclude(java.util.List<String> valuesToInclude) {
            this.valuesToInclude = valuesToInclude;
            this.__explicitlySet__.add("valuesToInclude");
            return this;
        }
        /** A list of filter values to exclude. */
        @com.fasterxml.jackson.annotation.JsonProperty("valuesToExclude")
        private java.util.List<String> valuesToExclude;

        /**
         * A list of filter values to exclude.
         *
         * @param valuesToExclude the value to set
         * @return this builder
         */
        public Builder valuesToExclude(java.util.List<String> valuesToExclude) {
            this.valuesToExclude = valuesToExclude;
            this.__explicitlySet__.add("valuesToExclude");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AutomaticCaptureFilterDetails build() {
            AutomaticCaptureFilterDetails model =
                    new AutomaticCaptureFilterDetails(
                            this.name, this.valuesToInclude, this.valuesToExclude);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AutomaticCaptureFilterDetails model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("valuesToInclude")) {
                this.valuesToInclude(model.getValuesToInclude());
            }
            if (model.wasPropertyExplicitlySet("valuesToExclude")) {
                this.valuesToExclude(model.getValuesToExclude());
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

    /**
     * The name of the automatic capture filter.
     *
     * <p>- AUTO_CAPTURE_SQL_TEXT: Search pattern to apply to SQL text. -
     * AUTO_CAPTURE_PARSING_SCHEMA_NAME: Parsing schema to include or exclude for SQL plan
     * management auto capture. - AUTO_CAPTURE_MODULE: Module to include or exclude for SQL plan
     * management auto capture. - AUTO_CAPTURE_ACTION: Action to include or exclude for SQL plan
     * management automatic capture.
     */
    public enum Name implements com.oracle.bmc.http.internal.BmcEnum {
        AutoCaptureSqlText("AUTO_CAPTURE_SQL_TEXT"),
        AutoCaptureParsingSchemaName("AUTO_CAPTURE_PARSING_SCHEMA_NAME"),
        AutoCaptureModule("AUTO_CAPTURE_MODULE"),
        AutoCaptureAction("AUTO_CAPTURE_ACTION"),
        ;

        private final String value;
        private static java.util.Map<String, Name> map;

        static {
            map = new java.util.HashMap<>();
            for (Name v : Name.values()) {
                map.put(v.getValue(), v);
            }
        }

        Name(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Name create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Name: " + key);
        }
    };
    /**
     * The name of the automatic capture filter.
     *
     * <p>- AUTO_CAPTURE_SQL_TEXT: Search pattern to apply to SQL text. -
     * AUTO_CAPTURE_PARSING_SCHEMA_NAME: Parsing schema to include or exclude for SQL plan
     * management auto capture. - AUTO_CAPTURE_MODULE: Module to include or exclude for SQL plan
     * management auto capture. - AUTO_CAPTURE_ACTION: Action to include or exclude for SQL plan
     * management automatic capture.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final Name name;

    /**
     * The name of the automatic capture filter.
     *
     * <p>- AUTO_CAPTURE_SQL_TEXT: Search pattern to apply to SQL text. -
     * AUTO_CAPTURE_PARSING_SCHEMA_NAME: Parsing schema to include or exclude for SQL plan
     * management auto capture. - AUTO_CAPTURE_MODULE: Module to include or exclude for SQL plan
     * management auto capture. - AUTO_CAPTURE_ACTION: Action to include or exclude for SQL plan
     * management automatic capture.
     *
     * @return the value
     */
    public Name getName() {
        return name;
    }

    /** A list of filter values to include. */
    @com.fasterxml.jackson.annotation.JsonProperty("valuesToInclude")
    private final java.util.List<String> valuesToInclude;

    /**
     * A list of filter values to include.
     *
     * @return the value
     */
    public java.util.List<String> getValuesToInclude() {
        return valuesToInclude;
    }

    /** A list of filter values to exclude. */
    @com.fasterxml.jackson.annotation.JsonProperty("valuesToExclude")
    private final java.util.List<String> valuesToExclude;

    /**
     * A list of filter values to exclude.
     *
     * @return the value
     */
    public java.util.List<String> getValuesToExclude() {
        return valuesToExclude;
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
        sb.append("AutomaticCaptureFilterDetails(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", valuesToInclude=").append(String.valueOf(this.valuesToInclude));
        sb.append(", valuesToExclude=").append(String.valueOf(this.valuesToExclude));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AutomaticCaptureFilterDetails)) {
            return false;
        }

        AutomaticCaptureFilterDetails other = (AutomaticCaptureFilterDetails) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.valuesToInclude, other.valuesToInclude)
                && java.util.Objects.equals(this.valuesToExclude, other.valuesToExclude)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.valuesToInclude == null ? 43 : this.valuesToInclude.hashCode());
        result =
                (result * PRIME)
                        + (this.valuesToExclude == null ? 43 : this.valuesToExclude.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
