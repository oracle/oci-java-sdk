/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.logging.model;

/**
 * Advanced options for logging configuration <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UnifiedAgentTailSourceAdvancedOptions.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UnifiedAgentTailSourceAdvancedOptions
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"isReadFromHead"})
    public UnifiedAgentTailSourceAdvancedOptions(Boolean isReadFromHead) {
        super();
        this.isReadFromHead = isReadFromHead;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Starts to read the logs from the head of the file or the last read position recorded in
         * pos_file, not tail.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isReadFromHead")
        private Boolean isReadFromHead;

        /**
         * Starts to read the logs from the head of the file or the last read position recorded in
         * pos_file, not tail.
         *
         * @param isReadFromHead the value to set
         * @return this builder
         */
        public Builder isReadFromHead(Boolean isReadFromHead) {
            this.isReadFromHead = isReadFromHead;
            this.__explicitlySet__.add("isReadFromHead");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UnifiedAgentTailSourceAdvancedOptions build() {
            UnifiedAgentTailSourceAdvancedOptions model =
                    new UnifiedAgentTailSourceAdvancedOptions(this.isReadFromHead);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UnifiedAgentTailSourceAdvancedOptions model) {
            if (model.wasPropertyExplicitlySet("isReadFromHead")) {
                this.isReadFromHead(model.getIsReadFromHead());
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
     * Starts to read the logs from the head of the file or the last read position recorded in
     * pos_file, not tail.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isReadFromHead")
    private final Boolean isReadFromHead;

    /**
     * Starts to read the logs from the head of the file or the last read position recorded in
     * pos_file, not tail.
     *
     * @return the value
     */
    public Boolean getIsReadFromHead() {
        return isReadFromHead;
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
        sb.append("UnifiedAgentTailSourceAdvancedOptions(");
        sb.append("super=").append(super.toString());
        sb.append("isReadFromHead=").append(String.valueOf(this.isReadFromHead));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UnifiedAgentTailSourceAdvancedOptions)) {
            return false;
        }

        UnifiedAgentTailSourceAdvancedOptions other = (UnifiedAgentTailSourceAdvancedOptions) o;
        return java.util.Objects.equals(this.isReadFromHead, other.isReadFromHead)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isReadFromHead == null ? 43 : this.isReadFromHead.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
