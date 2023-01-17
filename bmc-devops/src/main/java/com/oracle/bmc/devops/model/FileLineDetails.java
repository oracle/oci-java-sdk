/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Object containing the details of a line in a file.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = FileLineDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class FileLineDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"lineNumber", "lineContent"})
    public FileLineDetails(Integer lineNumber, String lineContent) {
        super();
        this.lineNumber = lineNumber;
        this.lineContent = lineContent;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The line number.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lineNumber")
        private Integer lineNumber;

        /**
         * The line number.
         * @param lineNumber the value to set
         * @return this builder
         **/
        public Builder lineNumber(Integer lineNumber) {
            this.lineNumber = lineNumber;
            this.__explicitlySet__.add("lineNumber");
            return this;
        }
        /**
         * The content of the line.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lineContent")
        private String lineContent;

        /**
         * The content of the line.
         * @param lineContent the value to set
         * @return this builder
         **/
        public Builder lineContent(String lineContent) {
            this.lineContent = lineContent;
            this.__explicitlySet__.add("lineContent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FileLineDetails build() {
            FileLineDetails model = new FileLineDetails(this.lineNumber, this.lineContent);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FileLineDetails model) {
            if (model.wasPropertyExplicitlySet("lineNumber")) {
                this.lineNumber(model.getLineNumber());
            }
            if (model.wasPropertyExplicitlySet("lineContent")) {
                this.lineContent(model.getLineContent());
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
     * The line number.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lineNumber")
    private final Integer lineNumber;

    /**
     * The line number.
     * @return the value
     **/
    public Integer getLineNumber() {
        return lineNumber;
    }

    /**
     * The content of the line.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lineContent")
    private final String lineContent;

    /**
     * The content of the line.
     * @return the value
     **/
    public String getLineContent() {
        return lineContent;
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
        sb.append("FileLineDetails(");
        sb.append("super=").append(super.toString());
        sb.append("lineNumber=").append(String.valueOf(this.lineNumber));
        sb.append(", lineContent=").append(String.valueOf(this.lineContent));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FileLineDetails)) {
            return false;
        }

        FileLineDetails other = (FileLineDetails) o;
        return java.util.Objects.equals(this.lineNumber, other.lineNumber)
                && java.util.Objects.equals(this.lineContent, other.lineContent)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.lineNumber == null ? 43 : this.lineNumber.hashCode());
        result = (result * PRIME) + (this.lineContent == null ? 43 : this.lineContent.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
