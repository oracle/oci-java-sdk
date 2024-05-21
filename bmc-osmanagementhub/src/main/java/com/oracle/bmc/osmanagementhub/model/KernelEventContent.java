/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Provides information collected for the kernel event.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = KernelEventContent.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class KernelEventContent extends EventContent {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Crash content availability status:
         *     * 'NOT_AVAILABLE' indicates the content is not available on the instance nor in the service
         *     * 'AVAILABLE_ON_INSTANCE' indicates the content is only available on the instance.
         *     * 'AVAILABLE_ON_SERVICE' indicates the content is only available on the service.
         *     * 'AVAILABLE_ON_INSTANCE_AND_SERVICE' indicates the content is available both on the instance and the service
         *     * 'AVAILABLE_ON_INSTANCE_UPLOAD_IN_PROGRESS' indicates the content is available on the instance and its upload to the service is in progress.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("contentAvailability")
        private ContentAvailability contentAvailability;

        /**
         * Crash content availability status:
         *     * 'NOT_AVAILABLE' indicates the content is not available on the instance nor in the service
         *     * 'AVAILABLE_ON_INSTANCE' indicates the content is only available on the instance.
         *     * 'AVAILABLE_ON_SERVICE' indicates the content is only available on the service.
         *     * 'AVAILABLE_ON_INSTANCE_AND_SERVICE' indicates the content is available both on the instance and the service
         *     * 'AVAILABLE_ON_INSTANCE_UPLOAD_IN_PROGRESS' indicates the content is available on the instance and its upload to the service is in progress.
         *
         * @param contentAvailability the value to set
         * @return this builder
         **/
        public Builder contentAvailability(ContentAvailability contentAvailability) {
            this.contentAvailability = contentAvailability;
            this.__explicitlySet__.add("contentAvailability");
            return this;
        }
        /**
         * Location of the Kernel event content.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("contentLocation")
        private String contentLocation;

        /**
         * Location of the Kernel event content.
         * @param contentLocation the value to set
         * @return this builder
         **/
        public Builder contentLocation(String contentLocation) {
            this.contentLocation = contentLocation;
            this.__explicitlySet__.add("contentLocation");
            return this;
        }
        /**
         * Size of the event content.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("size")
        private Integer size;

        /**
         * Size of the event content.
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

        public KernelEventContent build() {
            KernelEventContent model =
                    new KernelEventContent(
                            this.contentAvailability, this.contentLocation, this.size);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(KernelEventContent model) {
            if (model.wasPropertyExplicitlySet("contentAvailability")) {
                this.contentAvailability(model.getContentAvailability());
            }
            if (model.wasPropertyExplicitlySet("contentLocation")) {
                this.contentLocation(model.getContentLocation());
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

    @Deprecated
    public KernelEventContent(
            ContentAvailability contentAvailability, String contentLocation, Integer size) {
        super();
        this.contentAvailability = contentAvailability;
        this.contentLocation = contentLocation;
        this.size = size;
    }

    /**
     * Crash content availability status:
     *     * 'NOT_AVAILABLE' indicates the content is not available on the instance nor in the service
     *     * 'AVAILABLE_ON_INSTANCE' indicates the content is only available on the instance.
     *     * 'AVAILABLE_ON_SERVICE' indicates the content is only available on the service.
     *     * 'AVAILABLE_ON_INSTANCE_AND_SERVICE' indicates the content is available both on the instance and the service
     *     * 'AVAILABLE_ON_INSTANCE_UPLOAD_IN_PROGRESS' indicates the content is available on the instance and its upload to the service is in progress.
     *
     **/
    public enum ContentAvailability {
        NotAvailable("NOT_AVAILABLE"),
        AvailableOnInstance("AVAILABLE_ON_INSTANCE"),
        AvailableOnService("AVAILABLE_ON_SERVICE"),
        AvailableOnInstanceAndService("AVAILABLE_ON_INSTANCE_AND_SERVICE"),
        AvailableOnInstanceUploadInProgress("AVAILABLE_ON_INSTANCE_UPLOAD_IN_PROGRESS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ContentAvailability.class);

        private final String value;
        private static java.util.Map<String, ContentAvailability> map;

        static {
            map = new java.util.HashMap<>();
            for (ContentAvailability v : ContentAvailability.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ContentAvailability(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ContentAvailability create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ContentAvailability', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Crash content availability status:
     *     * 'NOT_AVAILABLE' indicates the content is not available on the instance nor in the service
     *     * 'AVAILABLE_ON_INSTANCE' indicates the content is only available on the instance.
     *     * 'AVAILABLE_ON_SERVICE' indicates the content is only available on the service.
     *     * 'AVAILABLE_ON_INSTANCE_AND_SERVICE' indicates the content is available both on the instance and the service
     *     * 'AVAILABLE_ON_INSTANCE_UPLOAD_IN_PROGRESS' indicates the content is available on the instance and its upload to the service is in progress.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("contentAvailability")
    private final ContentAvailability contentAvailability;

    /**
     * Crash content availability status:
     *     * 'NOT_AVAILABLE' indicates the content is not available on the instance nor in the service
     *     * 'AVAILABLE_ON_INSTANCE' indicates the content is only available on the instance.
     *     * 'AVAILABLE_ON_SERVICE' indicates the content is only available on the service.
     *     * 'AVAILABLE_ON_INSTANCE_AND_SERVICE' indicates the content is available both on the instance and the service
     *     * 'AVAILABLE_ON_INSTANCE_UPLOAD_IN_PROGRESS' indicates the content is available on the instance and its upload to the service is in progress.
     *
     * @return the value
     **/
    public ContentAvailability getContentAvailability() {
        return contentAvailability;
    }

    /**
     * Location of the Kernel event content.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("contentLocation")
    private final String contentLocation;

    /**
     * Location of the Kernel event content.
     * @return the value
     **/
    public String getContentLocation() {
        return contentLocation;
    }

    /**
     * Size of the event content.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("size")
    private final Integer size;

    /**
     * Size of the event content.
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
        sb.append("KernelEventContent(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", contentAvailability=").append(String.valueOf(this.contentAvailability));
        sb.append(", contentLocation=").append(String.valueOf(this.contentLocation));
        sb.append(", size=").append(String.valueOf(this.size));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof KernelEventContent)) {
            return false;
        }

        KernelEventContent other = (KernelEventContent) o;
        return java.util.Objects.equals(this.contentAvailability, other.contentAvailability)
                && java.util.Objects.equals(this.contentLocation, other.contentLocation)
                && java.util.Objects.equals(this.size, other.size)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.contentAvailability == null
                                ? 43
                                : this.contentAvailability.hashCode());
        result =
                (result * PRIME)
                        + (this.contentLocation == null ? 43 : this.contentLocation.hashCode());
        result = (result * PRIME) + (this.size == null ? 43 : this.size.hashCode());
        return result;
    }
}
