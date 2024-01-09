/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * Specifies the loopback attachment on the DRG. A loopback attachment can be used to terminate a
 * virtual circuit that is carrying an IPSec tunnel, routing traffic directly to the IPSec tunnel
 * attachment where the tunnel can terminate. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = LoopBackDrgAttachmentNetworkDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class LoopBackDrgAttachmentNetworkDetails extends DrgAttachmentNetworkDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the target IPSec tunnel attachment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ids")
        private java.util.List<String> ids;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the target IPSec tunnel attachment.
         *
         * @param ids the value to set
         * @return this builder
         */
        public Builder ids(java.util.List<String> ids) {
            this.ids = ids;
            this.__explicitlySet__.add("ids");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LoopBackDrgAttachmentNetworkDetails build() {
            LoopBackDrgAttachmentNetworkDetails model =
                    new LoopBackDrgAttachmentNetworkDetails(this.id, this.ids);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LoopBackDrgAttachmentNetworkDetails model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("ids")) {
                this.ids(model.getIds());
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

    @Deprecated
    public LoopBackDrgAttachmentNetworkDetails(String id, java.util.List<String> ids) {
        super(id);
        this.ids = ids;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the target IPSec tunnel attachment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ids")
    private final java.util.List<String> ids;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the target IPSec tunnel attachment.
     *
     * @return the value
     */
    public java.util.List<String> getIds() {
        return ids;
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
        sb.append("LoopBackDrgAttachmentNetworkDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", ids=").append(String.valueOf(this.ids));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LoopBackDrgAttachmentNetworkDetails)) {
            return false;
        }

        LoopBackDrgAttachmentNetworkDetails other = (LoopBackDrgAttachmentNetworkDetails) o;
        return java.util.Objects.equals(this.ids, other.ids) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.ids == null ? 43 : this.ids.hashCode());
        return result;
    }
}
