/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.queue.model;

/**
 * An updated message with the new visibility. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = UpdatedMessage.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdatedMessage
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "visibleAfter"})
    public UpdatedMessage(Long id, java.util.Date visibleAfter) {
        super();
        this.id = id;
        this.visibleAfter = visibleAfter;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The id of the message that's been updated. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private Long id;

        /**
         * The id of the message that's been updated.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(Long id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The time after which the message will be visible to other consumers. An RFC3339 formatted
         * datetime string
         */
        @com.fasterxml.jackson.annotation.JsonProperty("visibleAfter")
        private java.util.Date visibleAfter;

        /**
         * The time after which the message will be visible to other consumers. An RFC3339 formatted
         * datetime string
         *
         * @param visibleAfter the value to set
         * @return this builder
         */
        public Builder visibleAfter(java.util.Date visibleAfter) {
            this.visibleAfter = visibleAfter;
            this.__explicitlySet__.add("visibleAfter");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdatedMessage build() {
            UpdatedMessage model = new UpdatedMessage(this.id, this.visibleAfter);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdatedMessage model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("visibleAfter")) {
                this.visibleAfter(model.getVisibleAfter());
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

    /** The id of the message that's been updated. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final Long id;

    /**
     * The id of the message that's been updated.
     *
     * @return the value
     */
    public Long getId() {
        return id;
    }

    /**
     * The time after which the message will be visible to other consumers. An RFC3339 formatted
     * datetime string
     */
    @com.fasterxml.jackson.annotation.JsonProperty("visibleAfter")
    private final java.util.Date visibleAfter;

    /**
     * The time after which the message will be visible to other consumers. An RFC3339 formatted
     * datetime string
     *
     * @return the value
     */
    public java.util.Date getVisibleAfter() {
        return visibleAfter;
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
        sb.append("UpdatedMessage(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", visibleAfter=").append(String.valueOf(this.visibleAfter));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdatedMessage)) {
            return false;
        }

        UpdatedMessage other = (UpdatedMessage) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.visibleAfter, other.visibleAfter)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.visibleAfter == null ? 43 : this.visibleAfter.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
