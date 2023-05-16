/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * A masking format defines the logic to mask data in a database column. The condition attribute
 * defines the condition that must be true for applying the masking format. It enables you to do <a
 * href="https://docs.oracle.com/en/cloud/paas/data-safe/udscs/conditional-masking.html">conditional
 * masking</a> so that you can mask the column data values differently using different masking
 * formats and the associated conditions. A masking format can have one or more format entries. A
 * format entry can be a basic masking format such as Random Number, or it can be a library masking
 * format.The combined output of all the format entries is used for masking. It provides the
 * flexibility to define a masking format that can generate different parts of a data value
 * separately and then combine them to get the final data value for masking. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MaskingFormat.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MaskingFormat extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"condition", "description", "formatEntries"})
    public MaskingFormat(
            String condition, String description, java.util.List<FormatEntry> formatEntries) {
        super();
        this.condition = condition;
        this.description = description;
        this.formatEntries = formatEntries;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A condition that must be true for applying the masking format. It can be any valid SQL
         * construct that can be used in a SQL predicate. It enables you to do <a
         * href="https://docs.oracle.com/en/cloud/paas/data-safe/udscs/conditional-masking.html">conditional
         * masking</a> so that you can mask the column data values differently using different
         * masking formats and the associated conditions.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("condition")
        private String condition;

        /**
         * A condition that must be true for applying the masking format. It can be any valid SQL
         * construct that can be used in a SQL predicate. It enables you to do <a
         * href="https://docs.oracle.com/en/cloud/paas/data-safe/udscs/conditional-masking.html">conditional
         * masking</a> so that you can mask the column data values differently using different
         * masking formats and the associated conditions.
         *
         * @param condition the value to set
         * @return this builder
         */
        public Builder condition(String condition) {
            this.condition = condition;
            this.__explicitlySet__.add("condition");
            return this;
        }
        /** The description of the masking format. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description of the masking format.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * An array of format entries. The combined output of all the format entries is used for
         * masking the column data values.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("formatEntries")
        private java.util.List<FormatEntry> formatEntries;

        /**
         * An array of format entries. The combined output of all the format entries is used for
         * masking the column data values.
         *
         * @param formatEntries the value to set
         * @return this builder
         */
        public Builder formatEntries(java.util.List<FormatEntry> formatEntries) {
            this.formatEntries = formatEntries;
            this.__explicitlySet__.add("formatEntries");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MaskingFormat build() {
            MaskingFormat model =
                    new MaskingFormat(this.condition, this.description, this.formatEntries);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MaskingFormat model) {
            if (model.wasPropertyExplicitlySet("condition")) {
                this.condition(model.getCondition());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("formatEntries")) {
                this.formatEntries(model.getFormatEntries());
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
     * A condition that must be true for applying the masking format. It can be any valid SQL
     * construct that can be used in a SQL predicate. It enables you to do <a
     * href="https://docs.oracle.com/en/cloud/paas/data-safe/udscs/conditional-masking.html">conditional
     * masking</a> so that you can mask the column data values differently using different masking
     * formats and the associated conditions.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("condition")
    private final String condition;

    /**
     * A condition that must be true for applying the masking format. It can be any valid SQL
     * construct that can be used in a SQL predicate. It enables you to do <a
     * href="https://docs.oracle.com/en/cloud/paas/data-safe/udscs/conditional-masking.html">conditional
     * masking</a> so that you can mask the column data values differently using different masking
     * formats and the associated conditions.
     *
     * @return the value
     */
    public String getCondition() {
        return condition;
    }

    /** The description of the masking format. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of the masking format.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * An array of format entries. The combined output of all the format entries is used for masking
     * the column data values.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("formatEntries")
    private final java.util.List<FormatEntry> formatEntries;

    /**
     * An array of format entries. The combined output of all the format entries is used for masking
     * the column data values.
     *
     * @return the value
     */
    public java.util.List<FormatEntry> getFormatEntries() {
        return formatEntries;
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
        sb.append("MaskingFormat(");
        sb.append("super=").append(super.toString());
        sb.append("condition=").append(String.valueOf(this.condition));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", formatEntries=").append(String.valueOf(this.formatEntries));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MaskingFormat)) {
            return false;
        }

        MaskingFormat other = (MaskingFormat) o;
        return java.util.Objects.equals(this.condition, other.condition)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.formatEntries, other.formatEntries)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.condition == null ? 43 : this.condition.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.formatEntries == null ? 43 : this.formatEntries.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
