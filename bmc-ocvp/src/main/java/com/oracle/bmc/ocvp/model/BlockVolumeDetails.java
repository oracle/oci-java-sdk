/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp.model;

/**
 * Block volume that is part of the Datastore. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230701")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = BlockVolumeDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class BlockVolumeDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "iqn", "attachments"})
    public BlockVolumeDetails(
            String id, String iqn, java.util.List<BlockVolumeAttachment> attachments) {
        super();
        this.id = id;
        this.iqn = iqn;
        this.attachments = attachments;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * An [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)s of the
         * Block Storage Volume.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * An [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)s of the
         * Block Storage Volume.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** An IQN of the Block Storage Volume. */
        @com.fasterxml.jackson.annotation.JsonProperty("iqn")
        private String iqn;

        /**
         * An IQN of the Block Storage Volume.
         *
         * @param iqn the value to set
         * @return this builder
         */
        public Builder iqn(String iqn) {
            this.iqn = iqn;
            this.__explicitlySet__.add("iqn");
            return this;
        }
        /** List of BlockVolumeAttachment objects containing information about attachment details */
        @com.fasterxml.jackson.annotation.JsonProperty("attachments")
        private java.util.List<BlockVolumeAttachment> attachments;

        /**
         * List of BlockVolumeAttachment objects containing information about attachment details
         *
         * @param attachments the value to set
         * @return this builder
         */
        public Builder attachments(java.util.List<BlockVolumeAttachment> attachments) {
            this.attachments = attachments;
            this.__explicitlySet__.add("attachments");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BlockVolumeDetails build() {
            BlockVolumeDetails model = new BlockVolumeDetails(this.id, this.iqn, this.attachments);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BlockVolumeDetails model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("iqn")) {
                this.iqn(model.getIqn());
            }
            if (model.wasPropertyExplicitlySet("attachments")) {
                this.attachments(model.getAttachments());
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
     * An [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)s of the
     * Block Storage Volume.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * An [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)s of the
     * Block Storage Volume.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** An IQN of the Block Storage Volume. */
    @com.fasterxml.jackson.annotation.JsonProperty("iqn")
    private final String iqn;

    /**
     * An IQN of the Block Storage Volume.
     *
     * @return the value
     */
    public String getIqn() {
        return iqn;
    }

    /** List of BlockVolumeAttachment objects containing information about attachment details */
    @com.fasterxml.jackson.annotation.JsonProperty("attachments")
    private final java.util.List<BlockVolumeAttachment> attachments;

    /**
     * List of BlockVolumeAttachment objects containing information about attachment details
     *
     * @return the value
     */
    public java.util.List<BlockVolumeAttachment> getAttachments() {
        return attachments;
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
        sb.append("BlockVolumeDetails(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", iqn=").append(String.valueOf(this.iqn));
        sb.append(", attachments=").append(String.valueOf(this.attachments));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BlockVolumeDetails)) {
            return false;
        }

        BlockVolumeDetails other = (BlockVolumeDetails) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.iqn, other.iqn)
                && java.util.Objects.equals(this.attachments, other.attachments)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.iqn == null ? 43 : this.iqn.hashCode());
        result = (result * PRIME) + (this.attachments == null ? 43 : this.attachments.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
