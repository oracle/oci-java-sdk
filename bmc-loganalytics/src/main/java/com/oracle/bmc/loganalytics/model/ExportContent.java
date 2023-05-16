/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * The content to export. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ExportContent.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExportContent extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"fieldNames", "parserNames", "sourceNames"})
    public ExportContent(
            java.util.List<String> fieldNames,
            java.util.List<String> parserNames,
            java.util.List<String> sourceNames) {
        super();
        this.fieldNames = fieldNames;
        this.parserNames = parserNames;
        this.sourceNames = sourceNames;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The field names. */
        @com.fasterxml.jackson.annotation.JsonProperty("fieldNames")
        private java.util.List<String> fieldNames;

        /**
         * The field names.
         *
         * @param fieldNames the value to set
         * @return this builder
         */
        public Builder fieldNames(java.util.List<String> fieldNames) {
            this.fieldNames = fieldNames;
            this.__explicitlySet__.add("fieldNames");
            return this;
        }
        /** The parser names. */
        @com.fasterxml.jackson.annotation.JsonProperty("parserNames")
        private java.util.List<String> parserNames;

        /**
         * The parser names.
         *
         * @param parserNames the value to set
         * @return this builder
         */
        public Builder parserNames(java.util.List<String> parserNames) {
            this.parserNames = parserNames;
            this.__explicitlySet__.add("parserNames");
            return this;
        }
        /** The source names. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceNames")
        private java.util.List<String> sourceNames;

        /**
         * The source names.
         *
         * @param sourceNames the value to set
         * @return this builder
         */
        public Builder sourceNames(java.util.List<String> sourceNames) {
            this.sourceNames = sourceNames;
            this.__explicitlySet__.add("sourceNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExportContent build() {
            ExportContent model =
                    new ExportContent(this.fieldNames, this.parserNames, this.sourceNames);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExportContent model) {
            if (model.wasPropertyExplicitlySet("fieldNames")) {
                this.fieldNames(model.getFieldNames());
            }
            if (model.wasPropertyExplicitlySet("parserNames")) {
                this.parserNames(model.getParserNames());
            }
            if (model.wasPropertyExplicitlySet("sourceNames")) {
                this.sourceNames(model.getSourceNames());
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

    /** The field names. */
    @com.fasterxml.jackson.annotation.JsonProperty("fieldNames")
    private final java.util.List<String> fieldNames;

    /**
     * The field names.
     *
     * @return the value
     */
    public java.util.List<String> getFieldNames() {
        return fieldNames;
    }

    /** The parser names. */
    @com.fasterxml.jackson.annotation.JsonProperty("parserNames")
    private final java.util.List<String> parserNames;

    /**
     * The parser names.
     *
     * @return the value
     */
    public java.util.List<String> getParserNames() {
        return parserNames;
    }

    /** The source names. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceNames")
    private final java.util.List<String> sourceNames;

    /**
     * The source names.
     *
     * @return the value
     */
    public java.util.List<String> getSourceNames() {
        return sourceNames;
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
        sb.append("ExportContent(");
        sb.append("super=").append(super.toString());
        sb.append("fieldNames=").append(String.valueOf(this.fieldNames));
        sb.append(", parserNames=").append(String.valueOf(this.parserNames));
        sb.append(", sourceNames=").append(String.valueOf(this.sourceNames));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExportContent)) {
            return false;
        }

        ExportContent other = (ExportContent) o;
        return java.util.Objects.equals(this.fieldNames, other.fieldNames)
                && java.util.Objects.equals(this.parserNames, other.parserNames)
                && java.util.Objects.equals(this.sourceNames, other.sourceNames)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.fieldNames == null ? 43 : this.fieldNames.hashCode());
        result = (result * PRIME) + (this.parserNames == null ? 43 : this.parserNames.hashCode());
        result = (result * PRIME) + (this.sourceNames == null ? 43 : this.sourceNames.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
