/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.model;

/**
 * Properties required to create an ODA instance attachment.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateOdaInstanceAttachmentDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateOdaInstanceAttachmentDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "attachToId",
        "attachmentType",
        "attachmentMetadata",
        "restrictedOperations",
        "owner",
        "freeformTags",
        "definedTags"
    })
    public CreateOdaInstanceAttachmentDetails(
            String attachToId,
            AttachmentType attachmentType,
            String attachmentMetadata,
            java.util.List<String> restrictedOperations,
            OdaInstanceAttachmentOwner owner,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.attachToId = attachToId;
        this.attachmentType = attachmentType;
        this.attachmentMetadata = attachmentMetadata;
        this.restrictedOperations = restrictedOperations;
        this.owner = owner;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the target instance (which could be any other OCI PaaS/SaaS resource), to which this ODA instance is being attached.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("attachToId")
        private String attachToId;

        /**
         * The OCID of the target instance (which could be any other OCI PaaS/SaaS resource), to which this ODA instance is being attached.
         * @param attachToId the value to set
         * @return this builder
         **/
        public Builder attachToId(String attachToId) {
            this.attachToId = attachToId;
            this.__explicitlySet__.add("attachToId");
            return this;
        }
        /**
         * The type of target instance which this ODA instance is being attached.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("attachmentType")
        private AttachmentType attachmentType;

        /**
         * The type of target instance which this ODA instance is being attached.
         * @param attachmentType the value to set
         * @return this builder
         **/
        public Builder attachmentType(AttachmentType attachmentType) {
            this.attachmentType = attachmentType;
            this.__explicitlySet__.add("attachmentType");
            return this;
        }
        /**
         * Attachment specific metadata. Defined by the target service.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("attachmentMetadata")
        private String attachmentMetadata;

        /**
         * Attachment specific metadata. Defined by the target service.
         * @param attachmentMetadata the value to set
         * @return this builder
         **/
        public Builder attachmentMetadata(String attachmentMetadata) {
            this.attachmentMetadata = attachmentMetadata;
            this.__explicitlySet__.add("attachmentMetadata");
            return this;
        }
        /**
         * List of operations that are restricted while this instance is attached.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("restrictedOperations")
        private java.util.List<String> restrictedOperations;

        /**
         * List of operations that are restricted while this instance is attached.
         * @param restrictedOperations the value to set
         * @return this builder
         **/
        public Builder restrictedOperations(java.util.List<String> restrictedOperations) {
            this.restrictedOperations = restrictedOperations;
            this.__explicitlySet__.add("restrictedOperations");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("owner")
        private OdaInstanceAttachmentOwner owner;

        public Builder owner(OdaInstanceAttachmentOwner owner) {
            this.owner = owner;
            this.__explicitlySet__.add("owner");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type, or scope.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type, or scope.
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
         * Usage of predefined tag keys. These predefined keys are scoped to namespaces.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Usage of predefined tag keys. These predefined keys are scoped to namespaces.
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

        public CreateOdaInstanceAttachmentDetails build() {
            CreateOdaInstanceAttachmentDetails model =
                    new CreateOdaInstanceAttachmentDetails(
                            this.attachToId,
                            this.attachmentType,
                            this.attachmentMetadata,
                            this.restrictedOperations,
                            this.owner,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateOdaInstanceAttachmentDetails model) {
            if (model.wasPropertyExplicitlySet("attachToId")) {
                this.attachToId(model.getAttachToId());
            }
            if (model.wasPropertyExplicitlySet("attachmentType")) {
                this.attachmentType(model.getAttachmentType());
            }
            if (model.wasPropertyExplicitlySet("attachmentMetadata")) {
                this.attachmentMetadata(model.getAttachmentMetadata());
            }
            if (model.wasPropertyExplicitlySet("restrictedOperations")) {
                this.restrictedOperations(model.getRestrictedOperations());
            }
            if (model.wasPropertyExplicitlySet("owner")) {
                this.owner(model.getOwner());
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
     * The OCID of the target instance (which could be any other OCI PaaS/SaaS resource), to which this ODA instance is being attached.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("attachToId")
    private final String attachToId;

    /**
     * The OCID of the target instance (which could be any other OCI PaaS/SaaS resource), to which this ODA instance is being attached.
     * @return the value
     **/
    public String getAttachToId() {
        return attachToId;
    }

    /**
     * The type of target instance which this ODA instance is being attached.
     **/
    public enum AttachmentType {
        Fusion("FUSION"),
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
    /**
     * The type of target instance which this ODA instance is being attached.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("attachmentType")
    private final AttachmentType attachmentType;

    /**
     * The type of target instance which this ODA instance is being attached.
     * @return the value
     **/
    public AttachmentType getAttachmentType() {
        return attachmentType;
    }

    /**
     * Attachment specific metadata. Defined by the target service.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("attachmentMetadata")
    private final String attachmentMetadata;

    /**
     * Attachment specific metadata. Defined by the target service.
     * @return the value
     **/
    public String getAttachmentMetadata() {
        return attachmentMetadata;
    }

    /**
     * List of operations that are restricted while this instance is attached.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("restrictedOperations")
    private final java.util.List<String> restrictedOperations;

    /**
     * List of operations that are restricted while this instance is attached.
     * @return the value
     **/
    public java.util.List<String> getRestrictedOperations() {
        return restrictedOperations;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("owner")
    private final OdaInstanceAttachmentOwner owner;

    public OdaInstanceAttachmentOwner getOwner() {
        return owner;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type, or scope.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type, or scope.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Usage of predefined tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Usage of predefined tag keys. These predefined keys are scoped to namespaces.
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
        sb.append("CreateOdaInstanceAttachmentDetails(");
        sb.append("super=").append(super.toString());
        sb.append("attachToId=").append(String.valueOf(this.attachToId));
        sb.append(", attachmentType=").append(String.valueOf(this.attachmentType));
        sb.append(", attachmentMetadata=").append(String.valueOf(this.attachmentMetadata));
        sb.append(", restrictedOperations=").append(String.valueOf(this.restrictedOperations));
        sb.append(", owner=").append(String.valueOf(this.owner));
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
        if (!(o instanceof CreateOdaInstanceAttachmentDetails)) {
            return false;
        }

        CreateOdaInstanceAttachmentDetails other = (CreateOdaInstanceAttachmentDetails) o;
        return java.util.Objects.equals(this.attachToId, other.attachToId)
                && java.util.Objects.equals(this.attachmentType, other.attachmentType)
                && java.util.Objects.equals(this.attachmentMetadata, other.attachmentMetadata)
                && java.util.Objects.equals(this.restrictedOperations, other.restrictedOperations)
                && java.util.Objects.equals(this.owner, other.owner)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.attachToId == null ? 43 : this.attachToId.hashCode());
        result =
                (result * PRIME)
                        + (this.attachmentType == null ? 43 : this.attachmentType.hashCode());
        result =
                (result * PRIME)
                        + (this.attachmentMetadata == null
                                ? 43
                                : this.attachmentMetadata.hashCode());
        result =
                (result * PRIME)
                        + (this.restrictedOperations == null
                                ? 43
                                : this.restrictedOperations.hashCode());
        result = (result * PRIME) + (this.owner == null ? 43 : this.owner.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
