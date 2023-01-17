/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement.model;

/**
 * Information about the data collected as a ZIP file when the event occurred.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = EventContent.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class EventContent extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"contentAvailability", "instancePath", "size"})
    public EventContent(
            ContentAvailability contentAvailability, String instancePath, Integer size) {
        super();
        this.contentAvailability = contentAvailability;
        this.instancePath = instancePath;
        this.size = size;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Status of the event content
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("contentAvailability")
        private ContentAvailability contentAvailability;

        /**
         * Status of the event content
         * @param contentAvailability the value to set
         * @return this builder
         **/
        public Builder contentAvailability(ContentAvailability contentAvailability) {
            this.contentAvailability = contentAvailability;
            this.__explicitlySet__.add("contentAvailability");
            return this;
        }
        /**
         * Path to the event content on the instance
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("instancePath")
        private String instancePath;

        /**
         * Path to the event content on the instance
         * @param instancePath the value to set
         * @return this builder
         **/
        public Builder instancePath(String instancePath) {
            this.instancePath = instancePath;
            this.__explicitlySet__.add("instancePath");
            return this;
        }
        /**
         * size in bytes of the event content (size of the zip file uploaded)
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("size")
        private Integer size;

        /**
         * size in bytes of the event content (size of the zip file uploaded)
         * @param size the value to set
         * @return this builder
         **/
        public Builder size(Integer size) {
            this.size = size;
            this.__explicitlySet__.add("size");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EventContent build() {
            EventContent model =
                    new EventContent(this.contentAvailability, this.instancePath, this.size);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EventContent model) {
            if (model.wasPropertyExplicitlySet("contentAvailability")) {
                this.contentAvailability(model.getContentAvailability());
            }
            if (model.wasPropertyExplicitlySet("instancePath")) {
                this.instancePath(model.getInstancePath());
            }
            if (model.wasPropertyExplicitlySet("size")) {
                this.size(model.getSize());
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
     * Status of the event content
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("contentAvailability")
    private final ContentAvailability contentAvailability;

    /**
     * Status of the event content
     * @return the value
     **/
    public ContentAvailability getContentAvailability() {
        return contentAvailability;
    }

    /**
     * Path to the event content on the instance
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instancePath")
    private final String instancePath;

    /**
     * Path to the event content on the instance
     * @return the value
     **/
    public String getInstancePath() {
        return instancePath;
    }

    /**
     * size in bytes of the event content (size of the zip file uploaded)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("size")
    private final Integer size;

    /**
     * size in bytes of the event content (size of the zip file uploaded)
     * @return the value
     **/
    public Integer getSize() {
        return size;
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
        sb.append("EventContent(");
        sb.append("super=").append(super.toString());
        sb.append("contentAvailability=").append(String.valueOf(this.contentAvailability));
        sb.append(", instancePath=").append(String.valueOf(this.instancePath));
        sb.append(", size=").append(String.valueOf(this.size));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EventContent)) {
            return false;
        }

        EventContent other = (EventContent) o;
        return java.util.Objects.equals(this.contentAvailability, other.contentAvailability)
                && java.util.Objects.equals(this.instancePath, other.instancePath)
                && java.util.Objects.equals(this.size, other.size)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.contentAvailability == null
                                ? 43
                                : this.contentAvailability.hashCode());
        result = (result * PRIME) + (this.instancePath == null ? 43 : this.instancePath.hashCode());
        result = (result * PRIME) + (this.size == null ? 43 : this.size.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
