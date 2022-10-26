/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * The attachment type from which the DRG will import routes. Routes will be imported from all
 * attachments of this type. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DrgAttachmentTypeDrgRouteDistributionMatchCriteria.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "matchType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class DrgAttachmentTypeDrgRouteDistributionMatchCriteria
        extends DrgRouteDistributionMatchCriteria {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The type of the network resource to be included in this match. A match for a network type
         * implies that all DRG attachments of that type insert routes into the table.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("attachmentType")
        private AttachmentType attachmentType;

        /**
         * The type of the network resource to be included in this match. A match for a network type
         * implies that all DRG attachments of that type insert routes into the table.
         *
         * @param attachmentType the value to set
         * @return this builder
         */
        public Builder attachmentType(AttachmentType attachmentType) {
            this.attachmentType = attachmentType;
            this.__explicitlySet__.add("attachmentType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DrgAttachmentTypeDrgRouteDistributionMatchCriteria build() {
            DrgAttachmentTypeDrgRouteDistributionMatchCriteria model =
                    new DrgAttachmentTypeDrgRouteDistributionMatchCriteria(this.attachmentType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DrgAttachmentTypeDrgRouteDistributionMatchCriteria model) {
            if (model.wasPropertyExplicitlySet("attachmentType")) {
                this.attachmentType(model.getAttachmentType());
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
    public DrgAttachmentTypeDrgRouteDistributionMatchCriteria(AttachmentType attachmentType) {
        super();
        this.attachmentType = attachmentType;
    }

    /**
     * The type of the network resource to be included in this match. A match for a network type
     * implies that all DRG attachments of that type insert routes into the table.
     */
    public enum AttachmentType implements com.oracle.bmc.http.internal.BmcEnum {
        Vcn("VCN"),
        VirtualCircuit("VIRTUAL_CIRCUIT"),
        RemotePeeringConnection("REMOTE_PEERING_CONNECTION"),
        IpsecTunnel("IPSEC_TUNNEL"),
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
     * The type of the network resource to be included in this match. A match for a network type
     * implies that all DRG attachments of that type insert routes into the table.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("attachmentType")
    private final AttachmentType attachmentType;

    /**
     * The type of the network resource to be included in this match. A match for a network type
     * implies that all DRG attachments of that type insert routes into the table.
     *
     * @return the value
     */
    public AttachmentType getAttachmentType() {
        return attachmentType;
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
        sb.append("DrgAttachmentTypeDrgRouteDistributionMatchCriteria(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", attachmentType=").append(String.valueOf(this.attachmentType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DrgAttachmentTypeDrgRouteDistributionMatchCriteria)) {
            return false;
        }

        DrgAttachmentTypeDrgRouteDistributionMatchCriteria other =
                (DrgAttachmentTypeDrgRouteDistributionMatchCriteria) o;
        return java.util.Objects.equals(this.attachmentType, other.attachmentType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.attachmentType == null ? 43 : this.attachmentType.hashCode());
        return result;
    }
}
