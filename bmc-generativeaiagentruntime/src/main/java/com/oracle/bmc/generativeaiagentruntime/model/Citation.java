/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagentruntime.model;

/**
 * The citation displays the location of source text that is the agent uses to create the responses.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Citation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Citation extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"sourceText", "sourceLocation"})
    public Citation(String sourceText, SourceLocation sourceLocation) {
        super();
        this.sourceText = sourceText;
        this.sourceLocation = sourceLocation;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The text that's the source for the agent's response.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sourceText")
        private String sourceText;

        /**
         * The text that's the source for the agent's response.
         * @param sourceText the value to set
         * @return this builder
         **/
        public Builder sourceText(String sourceText) {
            this.sourceText = sourceText;
            this.__explicitlySet__.add("sourceText");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceLocation")
        private SourceLocation sourceLocation;

        public Builder sourceLocation(SourceLocation sourceLocation) {
            this.sourceLocation = sourceLocation;
            this.__explicitlySet__.add("sourceLocation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Citation build() {
            Citation model = new Citation(this.sourceText, this.sourceLocation);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Citation model) {
            if (model.wasPropertyExplicitlySet("sourceText")) {
                this.sourceText(model.getSourceText());
            }
            if (model.wasPropertyExplicitlySet("sourceLocation")) {
                this.sourceLocation(model.getSourceLocation());
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
     * The text that's the source for the agent's response.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceText")
    private final String sourceText;

    /**
     * The text that's the source for the agent's response.
     * @return the value
     **/
    public String getSourceText() {
        return sourceText;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("sourceLocation")
    private final SourceLocation sourceLocation;

    public SourceLocation getSourceLocation() {
        return sourceLocation;
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
        sb.append("Citation(");
        sb.append("super=").append(super.toString());
        sb.append("sourceText=").append(String.valueOf(this.sourceText));
        sb.append(", sourceLocation=").append(String.valueOf(this.sourceLocation));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Citation)) {
            return false;
        }

        Citation other = (Citation) o;
        return java.util.Objects.equals(this.sourceText, other.sourceText)
                && java.util.Objects.equals(this.sourceLocation, other.sourceLocation)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.sourceText == null ? 43 : this.sourceText.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceLocation == null ? 43 : this.sourceLocation.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
