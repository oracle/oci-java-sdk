/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher.model;

/**
 * Description of Attachment.
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
    builder = AttachmentSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AttachmentSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "offerId",
        "mimeType",
        "displayName",
        "type",
        "lifecycleState",
        "freeformTags",
        "definedTags"
    })
    public AttachmentSummary(
            String id,
            String offerId,
            String mimeType,
            String displayName,
            Attachment.Type type,
            Attachment.LifecycleState lifecycleState,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.id = id;
        this.offerId = offerId;
        this.mimeType = mimeType;
        this.displayName = displayName;
        this.type = type;
        this.lifecycleState = lifecycleState;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique identifier that is immutable on creation
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique identifier that is immutable on creation
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Unique identifier of the associated offer that is immutable on creation
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("offerId")
        private String offerId;

        /**
         * Unique identifier of the associated offer that is immutable on creation
         * @param offerId the value to set
         * @return this builder
         **/
        public Builder offerId(String offerId) {
            this.offerId = offerId;
            this.__explicitlySet__.add("offerId");
            return this;
        }
        /**
         * The MIME type of the uploaded data.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("mimeType")
        private String mimeType;

        /**
         * The MIME type of the uploaded data.
         * @param mimeType the value to set
         * @return this builder
         **/
        public Builder mimeType(String mimeType) {
            this.mimeType = mimeType;
            this.__explicitlySet__.add("mimeType");
            return this;
        }
        /**
         * The name used to refer to the uploaded data.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The name used to refer to the uploaded data.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The type of offer attachment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Attachment.Type type;

        /**
         * The type of offer attachment.
         * @param type the value to set
         * @return this builder
         **/
        public Builder type(Attachment.Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * The current state of the Attachment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private Attachment.LifecycleState lifecycleState;

        /**
         * The current state of the Attachment.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(Attachment.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AttachmentSummary build() {
            AttachmentSummary model =
                    new AttachmentSummary(
                            this.id,
                            this.offerId,
                            this.mimeType,
                            this.displayName,
                            this.type,
                            this.lifecycleState,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AttachmentSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("offerId")) {
                this.offerId(model.getOfferId());
            }
            if (model.wasPropertyExplicitlySet("mimeType")) {
                this.mimeType(model.getMimeType());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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
     * Unique identifier that is immutable on creation
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique identifier that is immutable on creation
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * Unique identifier of the associated offer that is immutable on creation
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("offerId")
    private final String offerId;

    /**
     * Unique identifier of the associated offer that is immutable on creation
     * @return the value
     **/
    public String getOfferId() {
        return offerId;
    }

    /**
     * The MIME type of the uploaded data.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mimeType")
    private final String mimeType;

    /**
     * The MIME type of the uploaded data.
     * @return the value
     **/
    public String getMimeType() {
        return mimeType;
    }

    /**
     * The name used to refer to the uploaded data.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The name used to refer to the uploaded data.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The type of offer attachment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Attachment.Type type;

    /**
     * The type of offer attachment.
     * @return the value
     **/
    public Attachment.Type getType() {
        return type;
    }

    /**
     * The current state of the Attachment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final Attachment.LifecycleState lifecycleState;

    /**
     * The current state of the Attachment.
     * @return the value
     **/
    public Attachment.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("AttachmentSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", offerId=").append(String.valueOf(this.offerId));
        sb.append(", mimeType=").append(String.valueOf(this.mimeType));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AttachmentSummary)) {
            return false;
        }

        AttachmentSummary other = (AttachmentSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.offerId, other.offerId)
                && java.util.Objects.equals(this.mimeType, other.mimeType)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.offerId == null ? 43 : this.offerId.hashCode());
        result = (result * PRIME) + (this.mimeType == null ? 43 : this.mimeType.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
