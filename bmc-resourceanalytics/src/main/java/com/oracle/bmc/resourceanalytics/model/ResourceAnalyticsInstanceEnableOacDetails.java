/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourceanalytics.model;

/**
 * The configuration details for the enable OAC operation.
 *
 * <p>Example: {@code {"attachmentType":"MANAGED","attachmentDetails":{...}}} <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241031")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ResourceAnalyticsInstanceEnableOacDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ResourceAnalyticsInstanceEnableOacDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"attachmentType", "attachmentDetails"})
    public ResourceAnalyticsInstanceEnableOacDetails(
            AttachmentType attachmentType,
            ResourceAnalyticsInstanceOacAttachmentDetails attachmentDetails) {
        super();
        this.attachmentType = attachmentType;
        this.attachmentDetails = attachmentDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The type of attachment the OAC instance is using. */
        @com.fasterxml.jackson.annotation.JsonProperty("attachmentType")
        private AttachmentType attachmentType;

        /**
         * The type of attachment the OAC instance is using.
         *
         * @param attachmentType the value to set
         * @return this builder
         */
        public Builder attachmentType(AttachmentType attachmentType) {
            this.attachmentType = attachmentType;
            this.__explicitlySet__.add("attachmentType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("attachmentDetails")
        private ResourceAnalyticsInstanceOacAttachmentDetails attachmentDetails;

        public Builder attachmentDetails(
                ResourceAnalyticsInstanceOacAttachmentDetails attachmentDetails) {
            this.attachmentDetails = attachmentDetails;
            this.__explicitlySet__.add("attachmentDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResourceAnalyticsInstanceEnableOacDetails build() {
            ResourceAnalyticsInstanceEnableOacDetails model =
                    new ResourceAnalyticsInstanceEnableOacDetails(
                            this.attachmentType, this.attachmentDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResourceAnalyticsInstanceEnableOacDetails model) {
            if (model.wasPropertyExplicitlySet("attachmentType")) {
                this.attachmentType(model.getAttachmentType());
            }
            if (model.wasPropertyExplicitlySet("attachmentDetails")) {
                this.attachmentDetails(model.getAttachmentDetails());
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

    /** The type of attachment the OAC instance is using. */
    public enum AttachmentType implements com.oracle.bmc.http.internal.BmcEnum {
        Managed("MANAGED"),
        ;

        private final String value;
        private static java.util.Map<String, AttachmentType> map;

        static {
            map = new java.util.HashMap<>();
            for (AttachmentType v : AttachmentType.values()) {
                map.put(v.getValue(), v);
            }
        }

        AttachmentType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AttachmentType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid AttachmentType: " + key);
        }
    };
    /** The type of attachment the OAC instance is using. */
    @com.fasterxml.jackson.annotation.JsonProperty("attachmentType")
    private final AttachmentType attachmentType;

    /**
     * The type of attachment the OAC instance is using.
     *
     * @return the value
     */
    public AttachmentType getAttachmentType() {
        return attachmentType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("attachmentDetails")
    private final ResourceAnalyticsInstanceOacAttachmentDetails attachmentDetails;

    public ResourceAnalyticsInstanceOacAttachmentDetails getAttachmentDetails() {
        return attachmentDetails;
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
        sb.append("ResourceAnalyticsInstanceEnableOacDetails(");
        sb.append("super=").append(super.toString());
        sb.append("attachmentType=").append(String.valueOf(this.attachmentType));
        sb.append(", attachmentDetails=").append(String.valueOf(this.attachmentDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResourceAnalyticsInstanceEnableOacDetails)) {
            return false;
        }

        ResourceAnalyticsInstanceEnableOacDetails other =
                (ResourceAnalyticsInstanceEnableOacDetails) o;
        return java.util.Objects.equals(this.attachmentType, other.attachmentType)
                && java.util.Objects.equals(this.attachmentDetails, other.attachmentDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.attachmentType == null ? 43 : this.attachmentType.hashCode());
        result =
                (result * PRIME)
                        + (this.attachmentDetails == null ? 43 : this.attachmentDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
